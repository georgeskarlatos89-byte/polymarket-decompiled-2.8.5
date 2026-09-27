package com.pairip.licensecheck;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.pairip.licensecheck.ILicenseV2ResultListener;
import com.pairip.licensecheck.LicenseActivity;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LicenseClient implements ServiceConnection {
    private static final String BACKGROUND_SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.IBackgroundLicensingService";
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int EVENTUAL_SHUTDOWN_DELAY_MILLIS = 30000;
    private static final String EXTRA_END_CUSTOM_TRIAL = "end_custom_trial";
    private static final int FIRST_ISOLATED_UID = 99000;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LAST_ISOLATED_UID = 99999;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final long MIN_TRIAL_END_INTERVAL_MILLIS = 3000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int PER_USER_RANGE = 100000;
    private static final int REPEATED_CHECK_RETRY_DELAY_MILLIS = 300000;
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static boolean backgroundLicensingServiceEnabled = true;
    protected static boolean customTrialEndTriggered = false;
    protected static boolean eventualShutdownEnabled = true;
    public static boolean gracefulShutdownEnabled = true;
    private static final Handler handler;
    private static LicenseClient instance = null;
    protected static long lastTrialEndElapsedRealtimeMillis = 0;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwMH8I83XJGXT/678ukMUOFh7hQeFb8LbKBmTIqvs1+sEN5k30SLH8UZG+lB9HOLPhWFfkVpL638m9m4p0Q9v6xHEVvsEAyrw3+p1+mbJF2/vz+Dk8qW7DBHb2qRcII7dIGEImc0qlByGSEm/59XAdNiZzaia9QJIxyJ3vuaAmzAPSzDQEQNKbpu+o//M0jyQS1DjMRFRDzHGIz1hiFuX0aAaqfpYH8iAh/4oro2wdPOd3ZmpEWTpb9/uGSn0Zwu+AkNtgpfCmrZDWE0gopaVdgKX9ZySjfqH1rzy57jtD3KqrWAeiZ63/kHSPqjcdSgtL1yl83f10tFGCaEjOW4aIQIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static ImmediateTaskExecutor mainThreadRunner = null;
    protected static String packageName = "com.polymarket.android";
    protected static boolean repeatedCheckEnabled = true;
    protected static Bundle responsePayload;
    private final Context context;
    protected static Runnable exitAction = new Runnable() { // from class: com.pairip.licensecheck.LicenseClient.1
        @Override // java.lang.Runnable
        public void run() {
            System.exit(0);
        }
    };
    protected static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    protected static ImmediateTaskExecutor backgroundRunner = new ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda5
        @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
        public final void run(Runnable runnable) {
            LicenseClient.lambda$static$0(runnable);
        }
    };
    protected DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutorImpl(null);
    protected int retryNum = 0;
    protected boolean isBound = false;
    protected boolean waitingForRepeatedCheck = false;
    private long repeatedCheckStartElapsedRealtime = 0;

    /* loaded from: classes2.dex */
    public interface DelayedTaskExecutor {
        void schedule(Runnable task, long delayMillis);
    }

    /* loaded from: classes2.dex */
    public interface ImmediateTaskExecutor {
        void run(Runnable task);
    }

    /* loaded from: classes2.dex */
    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED,
        REPEATED_CHECK_REQUIRED
    }

    public static /* synthetic */ void $r8$lambda$8YRQpF8qc5JOZUcKq79QHnbGjYY(LicenseClient licenseClient, RepeatedCheckMetadata repeatedCheckMetadata) {
        licenseClient.lambda$scheduleRepeatedLicenseCheck$0(repeatedCheckMetadata);
    }

    /* renamed from: $r8$lambda$GS82Fij7VQePgSFog-s63-Rcyb0, reason: not valid java name */
    public static /* synthetic */ void m33$r8$lambda$GS82Fij7VQePgSFogs63Rcyb0(LicenseClient licenseClient) {
        licenseClient.lambda$initializeLicenseCheck$0();
    }

    /* renamed from: $r8$lambda$gb-vmUiJUmqdCloCudVdY-igh7I, reason: not valid java name */
    public static /* synthetic */ void m34$r8$lambda$gbvmUiJUmqdCloCudVdYigh7I(LicenseClient licenseClient, IBinder iBinder) {
        licenseClient.lambda$onServiceConnected$1(iBinder);
    }

    /* renamed from: $r8$lambda$nn58bl0tYjCXTurL0z1br2IkQ-g, reason: not valid java name */
    public static /* synthetic */ void m35$r8$lambda$nn58bl0tYjCXTurL0z1br2IkQg(LicenseClient licenseClient, LicenseCheckException licenseCheckException) {
        licenseClient.lambda$handleError$0(licenseCheckException);
    }

    /* renamed from: $r8$lambda$ot_XkRbEJeEFG1Hy-d3H6N4DX_I, reason: not valid java name */
    public static /* synthetic */ void m36$r8$lambda$ot_XkRbEJeEFG1Hyd3H6N4DX_I(LicenseClient licenseClient, RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        licenseClient.lambda$processResponse$0(repeatedCheckMetadata, bundle);
    }

    public static /* synthetic */ void $r8$lambda$q2q7YKfx3jIZHqiUNn7fQ55wwzI(LicenseClient licenseClient, boolean z) {
        licenseClient.lambda$initializeLicenseCheck$1(z);
    }

    /* renamed from: $r8$lambda$tB8S6FJPE8_x6-ohvmHs84x5lek, reason: not valid java name */
    public static /* synthetic */ void m37$r8$lambda$tB8S6FJPE8_x6ohvmHs84x5lek(LicenseClient licenseClient, boolean z, LicenseCheckException licenseCheckException, boolean z2) {
        licenseClient.lambda$retryOrThrow$0(z, licenseCheckException, z2);
    }

    public static /* synthetic */ void $r8$lambda$x_INbtAE1cLJhbPOU3l3uRiKDN8(LicenseClient licenseClient, boolean z) {
        licenseClient.lambda$retryOrThrow$1(z);
    }

    public static /* synthetic */ void $r8$lambda$xzrAfByzooHDT9oIsgTdQvzthuE(LicenseClient licenseClient, IBinder iBinder) {
        licenseClient.lambda$onServiceConnected$0(iBinder);
    }

    /* renamed from: -$$Nest$mprocessResponse, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m38$$Nest$mprocessResponse(LicenseClient licenseClient, int i, Bundle bundle) {
        licenseClient.processResponse(i, bundle);
    }

    static {
        final Handler handler2 = new Handler(Looper.getMainLooper());
        handler = handler2;
        Objects.requireNonNull(handler2);
        mainThreadRunner = new ImmediateTaskExecutor() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda6
            @Override // com.pairip.licensecheck.LicenseClient.ImmediateTaskExecutor
            public final void run(Runnable runnable) {
                handler2.post(runnable);
            }
        };
        customTrialEndTriggered = false;
        lastTrialEndElapsedRealtimeMillis = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
        new Thread(runnable).start();
    }

    private static synchronized LicenseClient getInstance(Context context) {
        LicenseClient licenseClient;
        synchronized (LicenseClient.class) {
            licenseClient = instance;
            if (licenseClient == null) {
                licenseClient = new LicenseClient(context);
                instance = licenseClient;
            }
        }
        return licenseClient;
    }

    public static void checkLicense(final Context context) {
        if (context == null) {
            Log.w(TAG, "Cannot check license with null context.");
        } else if (isIsolatedProcess()) {
            Log.i(TAG, "Skipping license check in isolated process.");
        } else {
            mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseClient.lambda$checkLicense$0(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$checkLicense$0(Context context) {
        getInstance(context).initializeLicenseCheck();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void stopTrial(final Context context) {
        if (context == null) {
            Log.w(TAG, "Cannot trigger trial end with null context.");
        } else if (isIsolatedProcess()) {
            Log.i(TAG, "Skipping trial end in isolated process.");
        } else {
            mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseClient.lambda$stopTrial$0(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$stopTrial$0(Context context) {
        getInstance(context).handleTrialEnd();
    }

    protected void handleTrialEnd() {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis();
        long j = lastTrialEndElapsedRealtimeMillis;
        long j2 = elapsedRealtimeMillis - j;
        if (j <= 0 || j2 >= 3000) {
            Log.i(TAG, "Trial end event triggered; initiating full license check.");
            lastTrialEndElapsedRealtimeMillis = elapsedRealtimeMillis;
            customTrialEndTriggered = true;
            licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
            return;
        }
        Log.w(TAG, String.format("Trial end trigger throttled. Ignoring request (sent %d ms ago).", Long.valueOf(j2)));
    }

    private static boolean isIsolatedProcess() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated();
        }
        int myUid = Process.myUid() % PER_USER_RANGE;
        return myUid >= FIRST_ISOLATED_UID && myUid <= LAST_ISOLATED_UID;
    }

    public static String getLicensePubKey() {
        return licensePubKey;
    }

    public LicenseClient(Context context) {
        this.context = context;
    }

    public void initializeLicenseCheck() {
        int ordinal = licenseCheckState.ordinal();
        if (ordinal == 0) {
            if (localCheckEnabled && !customTrialEndTriggered) {
                backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        LicenseClient.m33$r8$lambda$GS82Fij7VQePgSFogs63Rcyb0(LicenseClient.this);
                    }
                });
                return;
            } else {
                initiateFreshLicensingServiceConnection(false);
                return;
            }
        }
        if (ordinal != 1) {
            if (ordinal != 4) {
                return;
            }
            initiateFreshLicensingServiceConnection(false);
        } else {
            try {
                LicenseResponseHelper.validateResponse(responsePayload, packageName);
            } catch (LicenseCheckException e) {
                handleError(e);
            }
        }
    }

    private /* synthetic */ void lambda$initializeLicenseCheck$0() {
        final boolean performLocalInstallerCheck = performLocalInstallerCheck();
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClient.$r8$lambda$q2q7YKfx3jIZHqiUNn7fQ55wwzI(LicenseClient.this, performLocalInstallerCheck);
            }
        });
    }

    private /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z) {
        boolean z2;
        if (z) {
            licenseCheckState = LicenseCheckState.LOCAL_CHECK_OK;
            if (backgroundLicensingServiceEnabled) {
                z2 = true;
                initiateFreshLicensingServiceConnection(z2);
            }
        }
        z2 = false;
        initiateFreshLicensingServiceConnection(z2);
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                Log.i(TAG, "Local install check bypassed due to old SDK version.");
                return false;
            }
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                Log.i(TAG, "Local install check bypassed due to package manager not found.");
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                int i = packageInfo.applicationInfo.flags;
                if ((i & 1) == 0 && (i & 128) == 0) {
                    InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                    if (installSourceInfo == null) {
                        Log.i(TAG, "Local install check bypassed due to install source info not found.");
                        return false;
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null && installingPackageName.equals(SERVICE_PACKAGE)) {
                        return true;
                    }
                    Log.i(TAG, "Local install check failed due to wrong installer.");
                    return false;
                }
                Log.i(TAG, "Local install check passed due to system app.");
                return true;
            }
            Log.i(TAG, "Local install check bypassed due to app package info not found.");
            return false;
        } catch (Exception e) {
            Log.w(TAG, "Could not obtain package info for local installer check.", e);
            return false;
        }
    }

    private void initiateFreshLicensingServiceConnection(boolean useBackgroundService) {
        this.retryNum = 0;
        bindToLicensingService(useBackgroundService);
    }

    private void bindToLicensingService(boolean useBackgroundService) {
        String str;
        String str2;
        unbindFromLicensingService();
        if (useBackgroundService) {
            str = "Connecting to the background licensing service...";
        } else {
            str = "Connecting to the main licensing service...";
        }
        Log.d(TAG, str);
        if (useBackgroundService) {
            str2 = BACKGROUND_SERVICE_INTERFACE_CLASS_NAME;
        } else {
            str2 = SERVICE_INTERFACE_CLASS_NAME;
        }
        try {
            if (!this.context.bindService(new Intent(str2).setPackage(SERVICE_PACKAGE).setAction(str2), this, 1)) {
                retryOrThrow(new LicenseCheckException("Could not bind with the licensing service: ".concat(str2)), useBackgroundService, useBackgroundService);
            } else {
                this.isBound = true;
            }
        } catch (SecurityException e) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service: ".concat(str2), e), useBackgroundService, useBackgroundService);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder licensingServiceBinder) {
        Log.d(TAG, "Connected to the licensing service.");
        int ordinal = licenseCheckState.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            LicenseClient.m34$r8$lambda$gbvmUiJUmqdCloCudVdYigh7I(LicenseClient.this, licensingServiceBinder);
                        }
                    });
                    return;
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        return;
                    }
                }
            }
            unbindFromLicensingService();
            return;
        }
        backgroundRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClient.$r8$lambda$xzrAfByzooHDT9oIsgTdQvzthuE(LicenseClient.this, licensingServiceBinder);
            }
        });
    }

    private /* synthetic */ void lambda$onServiceConnected$0(IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (RemoteException e) {
            handleError(new LicenseCheckException("Error when getting interface descriptor.", e));
        } catch (LicenseCheckException e2) {
            handleError(e2);
        }
    }

    private /* synthetic */ void lambda$onServiceConnected$1(IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (Exception e) {
            Log.e(TAG, "Error while reporting license check: " + Log.getStackTraceString(e));
            mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda0(this));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.isBound = false;
        if (licenseCheckState.equals(LicenseCheckState.REPEATED_CHECK_REQUIRED) && this.waitingForRepeatedCheck) {
            Log.d(TAG, "Ignoring service disconnection in REPEATED_CHECK_REQUIRED state.");
        } else {
            Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
            retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."));
        }
    }

    private void checkLicenseInternal(IBinder licensingServiceBinder) throws LicenseCheckException, RemoteException {
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        if (licensingServiceBinder.getInterfaceDescriptor().equals(BACKGROUND_SERVICE_INTERFACE_CLASS_NAME)) {
            throw new LicenseCheckException("Background licensing service does not support full license check.");
        }
        Log.d(TAG, "Sending request to licensing service...");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                populateInputDataForLicenseCheckV2(obtain, licensingServiceBinder);
                if (!licensingServiceBinder.transact(2, obtain, obtain2, 0)) {
                    handleError(new LicenseCheckException("Licensing service could not process request."));
                }
            } catch (DeadObjectException e) {
                retryOrThrow(new LicenseCheckException("Licensing service process died.", e));
            } catch (RemoteException e2) {
                handleError(new LicenseCheckException("Error when calling licensing service.", e2));
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
        }
    }

    public void reportSuccessfulLicenseCheck(IBinder licensingServiceBinder) throws LicenseCheckException {
        ImmediateTaskExecutor immediateTaskExecutor;
        LicenseClient$$ExternalSyntheticLambda0 licenseClient$$ExternalSyntheticLambda0;
        if (licensingServiceBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."), true, backgroundLicensingServiceEnabled);
            return;
        }
        Log.d(TAG, "Sending request to license reporting service...");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                try {
                    populateInputDataForReportAutoVerifiedLicense(obtain, licensingServiceBinder);
                    if (licensingServiceBinder.transact(3, obtain, obtain2, 0)) {
                        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda12
                            @Override // java.lang.Runnable
                            public final void run() {
                                LicenseClient.lambda$reportSuccessfulLicenseCheck$0();
                            }
                        });
                    } else {
                        Log.e(TAG, "Error sending request to license reporting service.");
                    }
                } catch (DeadObjectException e) {
                    retryOrThrow(new LicenseCheckException("Licensing service process died.", e), true, backgroundLicensingServiceEnabled);
                    obtain.recycle();
                    obtain2.recycle();
                    immediateTaskExecutor = mainThreadRunner;
                    licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
                    immediateTaskExecutor.run(licenseClient$$ExternalSyntheticLambda0);
                    Log.d(TAG, "Request to licensing reporting service sent.");
                }
            } catch (RemoteException e2) {
                Log.e(TAG, "Error when calling licensing service." + String.valueOf(e2));
                obtain.recycle();
                obtain2.recycle();
                immediateTaskExecutor = mainThreadRunner;
                licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
                immediateTaskExecutor.run(licenseClient$$ExternalSyntheticLambda0);
                Log.d(TAG, "Request to licensing reporting service sent.");
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
            mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda0(this));
            Log.d(TAG, "Request to licensing reporting service sent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$reportSuccessfulLicenseCheck$0() {
        licenseCheckState = LicenseCheckState.LOCAL_CHECK_REPORTED;
    }

    private void populateInputDataForLicenseCheckV2(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeStrongBinder(createResultListener(this).asBinder());
        Bundle bundle = new Bundle();
        if (customTrialEndTriggered) {
            bundle.putBoolean(EXTRA_END_CUSTOM_TRIAL, true);
        }
        if (!bundle.isEmpty()) {
            inputData.writeInt(1);
            bundle.writeToParcel(inputData, 0);
        } else {
            inputData.writeInt(0);
        }
    }

    private void populateInputDataForReportAutoVerifiedLicense(Parcel inputData, IBinder licensingService) throws RemoteException {
        inputData.writeInterfaceToken(licensingService.getInterfaceDescriptor());
        inputData.writeString(packageName);
        inputData.writeInt(0);
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClient client) {
        return new ILicenseV2ResultListener.Stub() { // from class: com.pairip.licensecheck.LicenseClient.2
            @Override // com.pairip.licensecheck.ILicenseV2ResultListener
            public void verifyLicense(int responseCode, Bundle responsePayload2) {
                LicenseClient.m38$$Nest$mprocessResponse(LicenseClient.this, responseCode, responsePayload2);
            }
        };
    }

    private void retryOrThrow(LicenseCheckException error) {
        retryOrThrow(error, false, false);
    }

    private void retryOrThrow(final LicenseCheckException error, final boolean ignoreErrorOnFinalFailure, final boolean useBackgroundService) {
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClient.m37$r8$lambda$tB8S6FJPE8_x6ohvmHs84x5lek(LicenseClient.this, useBackgroundService, error, ignoreErrorOnFinalFailure);
            }
        });
    }

    private /* synthetic */ void lambda$retryOrThrow$0(final boolean z, LicenseCheckException licenseCheckException, boolean z2) {
        unbindFromLicensingService();
        int i = this.retryNum;
        if (i < 3) {
            this.retryNum = i + 1;
            this.delayedTaskExecutor.schedule(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseClient.$r8$lambda$x_INbtAE1cLJhbPOU3l3uRiKDN8(LicenseClient.this, z);
                }
            }, 1000L);
            Log.d(TAG, String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", Integer.valueOf(this.retryNum), licenseCheckException == null ? "null" : licenseCheckException.getMessage(), 1L));
        } else {
            if (z2) {
                Log.e(TAG, "Retry limit reached for: " + String.valueOf(licenseCheckException));
                return;
            }
            handleError(licenseCheckException);
        }
    }

    private /* synthetic */ void lambda$retryOrThrow$1(boolean z) {
        bindToLicensingService(z);
    }

    private void processResponse(int responseCode, final Bundle responsePayload2) {
        ImmediateTaskExecutor immediateTaskExecutor;
        LicenseClient$$ExternalSyntheticLambda0 licenseClient$$ExternalSyntheticLambda0;
        try {
            try {
            } catch (LicenseCheckException e) {
                handleError(e);
                immediateTaskExecutor = mainThreadRunner;
                licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
            }
            if (responseCode == 3) {
                throw new LicenseCheckException("Request package name invalid.");
            }
            if (responseCode == 0) {
                LicenseResponseHelper.validateResponse(responsePayload2, packageName);
                Log.i(TAG, "License check succeeded.");
                final RepeatedCheckMetadata repeatedCheckMetadata = repeatedCheckEnabled ? LicenseResponseHelper.getRepeatedCheckMetadata(responsePayload2) : null;
                mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        LicenseClient.m36$r8$lambda$ot_XkRbEJeEFG1Hyd3H6N4DX_I(LicenseClient.this, repeatedCheckMetadata, responsePayload2);
                    }
                });
            } else if (responseCode == 2) {
                startPaywallActivity((PendingIntent) responsePayload2.getParcelable(PAYLOAD_PAYWALL));
            } else {
                throw new LicenseCheckException(String.format("Unexpected response code %d received.", Integer.valueOf(responseCode)));
            }
            immediateTaskExecutor = mainThreadRunner;
            licenseClient$$ExternalSyntheticLambda0 = new LicenseClient$$ExternalSyntheticLambda0(this);
            immediateTaskExecutor.run(licenseClient$$ExternalSyntheticLambda0);
        } catch (Throwable th) {
            mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda0(this));
            throw th;
        }
    }

    private /* synthetic */ void lambda$processResponse$0(RepeatedCheckMetadata repeatedCheckMetadata, Bundle bundle) {
        if (repeatedCheckMetadata != null) {
            licenseCheckState = LicenseCheckState.REPEATED_CHECK_REQUIRED;
            this.repeatedCheckStartElapsedRealtime = getElapsedRealtimeMillis();
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        } else {
            licenseCheckState = LicenseCheckState.FULL_CHECK_OK;
        }
        responsePayload = bundle;
    }

    private void scheduleRepeatedLicenseCheck(final RepeatedCheckMetadata repeatedCheckMetadata) {
        long min = Math.min(Math.min(repeatedCheckMetadata.getDurationToRetryMillis(), Math.max(0L, repeatedCheckMetadata.getTimeToRetryMillis() - getCurrentTimeMillis())), AudioConstants.MAX_RECORDING_DURATION_MS);
        if (!this.waitingForRepeatedCheck) {
            this.waitingForRepeatedCheck = true;
        }
        this.delayedTaskExecutor.schedule(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClient.$r8$lambda$8YRQpF8qc5JOZUcKq79QHnbGjYY(LicenseClient.this, repeatedCheckMetadata);
            }
        }, min);
        Log.d(TAG, String.format("Repeated license check is scheduled in %d ms...", Long.valueOf(min)));
    }

    private /* synthetic */ void lambda$scheduleRepeatedLicenseCheck$0(RepeatedCheckMetadata repeatedCheckMetadata) {
        long elapsedRealtimeMillis = getElapsedRealtimeMillis() - this.repeatedCheckStartElapsedRealtime;
        if (getCurrentTimeMillis() >= repeatedCheckMetadata.getTimeToRetryMillis() || elapsedRealtimeMillis >= repeatedCheckMetadata.getDurationToRetryMillis()) {
            this.waitingForRepeatedCheck = false;
            initiateFreshLicensingServiceConnection(false);
        } else {
            Log.d(TAG, "Repeated license check is rescheduled.");
            scheduleRepeatedLicenseCheck(repeatedCheckMetadata);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unbindFromLicensingService() {
        if (this.isBound) {
            this.isBound = false;
            try {
                this.context.unbindService(this);
            } catch (RuntimeException e) {
                Log.e(TAG, "Failed to unbind from licensing service.", e);
            }
        }
    }

    private void handleError(final LicenseCheckException ex) {
        mainThreadRunner.run(new Runnable() { // from class: com.pairip.licensecheck.LicenseClient$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                LicenseClient.m35$r8$lambda$nn58bl0tYjCXTurL0z1br2IkQg(LicenseClient.this, ex);
            }
        });
    }

    private /* synthetic */ void lambda$handleError$0(LicenseCheckException licenseCheckException) {
        Log.e(TAG, "Error while checking license: " + Log.getStackTraceString(licenseCheckException));
        unbindFromLicensingService();
        if (licenseCheckState.equals(LicenseCheckState.FULL_CHECK_OK)) {
            return;
        }
        startErrorDialogActivity();
    }

    private void startPaywallActivity(PendingIntent paywallIntent) {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.PAYWALL_INTENT_ARG_NAME, paywallIntent);
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.PAYWALL);
        scheduleAppShutdown();
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.ERROR_DIALOG);
        scheduleAppShutdown();
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        Intent intent = new Intent(this.context, (Class<?>) LicenseActivity.class);
        if (gracefulShutdownEnabled) {
            intent.addFlags(65536);
        } else {
            intent.addFlags(67108864);
            intent.addFlags(32768);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    protected long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    protected long getElapsedRealtimeMillis() {
        return SystemClock.elapsedRealtime();
    }

    private void scheduleAppShutdown() {
        if (eventualShutdownEnabled) {
            this.delayedTaskExecutor.schedule(exitAction, 30000L);
        }
    }

    /* loaded from: classes2.dex */
    private static class DelayedTaskExecutorImpl implements DelayedTaskExecutor {
        private final Handler handler;

        /* synthetic */ DelayedTaskExecutorImpl(LicenseClientIA licenseClientIA) {
            this();
        }

        private DelayedTaskExecutorImpl() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        @Override // com.pairip.licensecheck.LicenseClient.DelayedTaskExecutor
        public void schedule(Runnable task, long delayMillis) {
            this.handler.postDelayed(task, delayMillis);
        }
    }
}
