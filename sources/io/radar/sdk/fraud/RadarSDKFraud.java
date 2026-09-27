package io.radar.sdk.fraud;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.location.Location;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.InputDevice;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import defpackage.bvk;
import defpackage.byk;
import defpackage.c1c;
import defpackage.cvk;
import defpackage.d1c;
import defpackage.da6;
import defpackage.dmk;
import defpackage.fpi;
import defpackage.fzn;
import defpackage.sb1;
import defpackage.tb1;
import defpackage.ur7;
import defpackage.wuh;
import defpackage.xmf;
import defpackage.xuh;
import defpackage.ymf;
import defpackage.ytk;
import defpackage.zcg;
import defpackage.zwk;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.android.core.m0;
import java.io.File;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010#\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u001c\u0010\"\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$JI\u0010%\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u001c\u0010\"\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b%\u0010&J7\u0010'\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u001c\u0010\"\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b'\u0010(JG\u0010-\u001a\u00020!2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010)2\"\u0010,\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010)\u0012\u0004\u0012\u00020!0+¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00106\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lio/radar/sdk/fraud/RadarSDKFraud;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/location/Location;", "location", "Lorg/json/JSONObject;", "buildFraudData", "(Landroid/content/Context;Landroid/location/Location;)Lorg/json/JSONObject;", "", "isRooted", "(Landroid/content/Context;)Z", "isScreenSharing", "isAdbEnabled", "Landroid/content/SharedPreferences;", "getSharedPreferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "getInstallId", "(Landroid/content/Context;)Ljava/lang/String;", MetricTracker.Object.INPUT, "hashSHA256", "(Ljava/lang/String;)Ljava/lang/String;", "getRequestHash", "(Landroid/content/Context;Landroid/location/Location;)Ljava/lang/String;", "isIntegrityApiIncluded", "()Z", "", "googlePlayProjectNumber", "requestHash", "Lkotlin/Function2;", "", "block", "warmUpProviderAndFetchTokenFromGoogle", "(Landroid/content/Context;JLjava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getIntegrityTokenInternal", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "fetchTokenFromGoogle", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "options", "Lkotlin/Function1;", "callback", "getFraudPayload", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Lxuh;", "standardIntegrityTokenProvider", "Lxuh;", "lastWarmUpTimestampSeconds", "J", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "backgroundExecutor", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Companion", "sdk-fraud_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarSDKFraud {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile RadarSDKFraud INSTANCE = null;
    private static final String KEY_INSTALL_ID = "install_id";
    private static final String LIB_VERSION = "1.2.0";
    private static final String TAG = "RadarSDKFraud";
    private static final int WARM_UP_WINDOW_SECONDS = 43200;
    private final ExecutorService backgroundExecutor;
    private long lastWarmUpTimestampSeconds;
    private final Handler mainHandler;
    private xuh standardIntegrityTokenProvider;

    private RadarSDKFraud() {
        this.backgroundExecutor = Executors.newSingleThreadExecutor(new ur7(1));
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void a(Long l, RadarSDKFraud radarSDKFraud, Context context, Location location, JSONObject jSONObject, Function1 function1) {
        getFraudPayload$lambda$4$lambda$3(l, radarSDKFraud, context, location, jSONObject, function1);
    }

    public static final /* synthetic */ void access$fetchTokenFromGoogle(RadarSDKFraud radarSDKFraud, String str, Function2 function2) {
        radarSDKFraud.fetchTokenFromGoogle(str, function2);
    }

    public static final /* synthetic */ RadarSDKFraud access$getINSTANCE$cp() {
        return INSTANCE;
    }

    public static final /* synthetic */ void access$setINSTANCE$cp(RadarSDKFraud radarSDKFraud) {
        INSTANCE = radarSDKFraud;
    }

    public static final /* synthetic */ void access$setLastWarmUpTimestampSeconds$p(RadarSDKFraud radarSDKFraud, long j) {
        radarSDKFraud.lastWarmUpTimestampSeconds = j;
    }

    public static final /* synthetic */ void access$setStandardIntegrityTokenProvider$p(RadarSDKFraud radarSDKFraud, xuh xuhVar) {
        radarSDKFraud.standardIntegrityTokenProvider = xuhVar;
    }

    public static /* synthetic */ void b(Function2 function2, Exception exc) {
        fetchTokenFromGoogle$lambda$9(function2, exc);
    }

    private static final Thread backgroundExecutor$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, TAG);
        thread.setDaemon(true);
        return thread;
    }

    private final JSONObject buildFraudData(Context context, Location location) {
        WifiManager wifiManager;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("libVersion", LIB_VERSION);
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        if (location != null) {
            boolean isFromMockProvider = location.isFromMockProvider();
            jSONObject.put("mocked", isFromMockProvider);
            if (isFromMockProvider) {
                jSONArray.put("fraud_mocked_from_mock_provider");
            }
        }
        boolean isRooted = isRooted(context);
        jSONObject.put("rooted", isRooted);
        if (isRooted) {
            jSONArray.put("fraud_compromised_rooted");
        }
        boolean z = sharedPreferences.getBoolean("sharing", false);
        jSONObject.put("sharing", z);
        if (z) {
            jSONArray.put("fraud_sharing_virtual_input_device");
        }
        if (isAdbEnabled(context)) {
            jSONArray.put("fraud_compromised_adb");
        }
        FraudDetection fraudDetection = FraudDetection.INSTANCE;
        if (fraudDetection.isEmulator()) {
            jSONArray.put("fraud_compromised_emulator_simulator");
        }
        WifiInfo wifiInfo = null;
        String string = sharedPreferences.getString("user_id", null);
        if (string != null) {
            jSONObject.put("userId", string);
        }
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService instanceof WifiManager) {
            wifiManager = (WifiManager) systemService;
        } else {
            wifiManager = null;
        }
        if (wifiManager != null) {
            wifiInfo = wifiManager.getConnectionInfo();
        }
        if (wifiInfo != null && wifiInfo.getSupplicantState() == SupplicantState.COMPLETED) {
            jSONObject.put("ssid", wifiInfo.getSSID());
            jSONObject.put("bssid", wifiInfo.getBSSID());
        }
        jSONObject.put("fraudFailureReasons", jSONArray);
        jSONObject.put("deviceInfo", fraudDetection.deviceInfo(context).toJSON());
        return jSONObject;
    }

    public static /* synthetic */ void c(Function1 function1, Exception exc) {
        getFraudPayload$lambda$4$lambda$2(function1, exc);
    }

    public static /* synthetic */ void d(RadarSDKFraud radarSDKFraud, Context context, Location location, Function1 function1, Long l) {
        getFraudPayload$lambda$4(radarSDKFraud, context, location, function1, l);
    }

    public static /* synthetic */ Thread e(Runnable runnable) {
        return backgroundExecutor$lambda$1(runnable);
    }

    public static /* synthetic */ void f(Object obj, Function1 function1) {
        warmUpProviderAndFetchTokenFromGoogle$lambda$6(function1, obj);
    }

    private final void fetchTokenFromGoogle(String requestHash, final Function2<? super String, ? super String, Unit> block) {
        if (!isIntegrityApiIncluded()) {
            m0.p(TAG, "Integrity API not included");
            block.invoke(null, "Integrity API not included");
            return;
        }
        xuh xuhVar = this.standardIntegrityTokenProvider;
        if (xuhVar != null) {
            zcg a = byk.a();
            a.b = requestHash;
            fzn a2 = ((cvk) xuhVar).a(a.v());
            a2.getClass();
            a2.g(fpi.a, new da6(new Function1<wuh, Unit>() { // from class: io.radar.sdk.fraud.RadarSDKFraud$fetchTokenFromGoogle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(wuh wuhVar) {
                    block.invoke(((bvk) wuhVar).a, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(wuh wuhVar) {
                    invoke2(wuhVar);
                    return Unit.INSTANCE;
                }
            }, 12));
            a2.d(new xmf(0, block));
            return;
        }
        Intrinsics.i("standardIntegrityTokenProvider");
        throw null;
    }

    private static final void fetchTokenFromGoogle$lambda$8(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    private static final void fetchTokenFromGoogle$lambda$9(Function2 function2, Exception exc) {
        function2.getClass();
        exc.getClass();
        function2.invoke(null, exc.getMessage());
    }

    public static /* synthetic */ void g(Object obj, Function1 function1) {
        fetchTokenFromGoogle$lambda$8(function1, obj);
    }

    private static final void getFraudPayload$lambda$4(RadarSDKFraud radarSDKFraud, Context context, Location location, Function1 function1, Long l) {
        radarSDKFraud.getClass();
        function1.getClass();
        try {
            radarSDKFraud.mainHandler.post(new sb1(l, radarSDKFraud, context, location, radarSDKFraud.buildFraudData(context, location), function1, 2));
        } catch (Exception e) {
            m0.e(TAG, "Error in getFraudPayload", e);
            radarSDKFraud.mainHandler.post(new ymf(function1, e, 0));
        }
    }

    private static final void getFraudPayload$lambda$4$lambda$2(Function1 function1, Exception exc) {
        function1.getClass();
        exc.getClass();
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        function1.invoke(c1c.b(new Pair("error", message)));
    }

    private static final void getFraudPayload$lambda$4$lambda$3(Long l, RadarSDKFraud radarSDKFraud, Context context, Location location, final JSONObject jSONObject, final Function1 function1) {
        radarSDKFraud.getClass();
        jSONObject.getClass();
        function1.getClass();
        try {
            if (l != null) {
                radarSDKFraud.getIntegrityTokenInternal(context, l, radarSDKFraud.getRequestHash(context, location), new Function2<String, String, Unit>() { // from class: io.radar.sdk.fraud.RadarSDKFraud$getFraudPayload$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str, String str2) {
                        if (str != null) {
                            jSONObject.put("integrityToken", str);
                        }
                        if (str2 != null) {
                            jSONObject.put("integrityException", str2);
                        }
                        function1.invoke(d1c.h(new Pair("payload", jSONObject.toString())));
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                        invoke2(str, str2);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                function1.invoke(d1c.h(new Pair("payload", jSONObject.toString())));
            }
        } catch (Exception e) {
            m0.e(TAG, "Error in getFraudPayload", e);
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            function1.invoke(c1c.b(new Pair("error", message)));
        }
    }

    private final String getInstallId(Context context) {
        String string = getSharedPreferences(context).getString(KEY_INSTALL_ID, null);
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString(KEY_INSTALL_ID, uuid);
            edit.apply();
            return uuid;
        }
        return string;
    }

    private final void getIntegrityTokenInternal(Context context, Long googlePlayProjectNumber, String requestHash, Function2<? super String, ? super String, Unit> block) {
        if (!isIntegrityApiIncluded()) {
            m0.p(TAG, "Integrity API not included");
            block.invoke(null, "Integrity API not included");
            return;
        }
        if (requestHash == null) {
            block.invoke(null, "Missing request hash");
            return;
        }
        if (googlePlayProjectNumber == null) {
            block.invoke(null, "Google Play project number is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (this.standardIntegrityTokenProvider != null) {
            long j = this.lastWarmUpTimestampSeconds;
            if (j != 0 && currentTimeMillis - j <= 43200) {
                fetchTokenFromGoogle(requestHash, block);
                return;
            }
        }
        warmUpProviderAndFetchTokenFromGoogle(context, googlePlayProjectNumber.longValue(), requestHash, block);
    }

    private final String getRequestHash(Context context, Location location) {
        StringBuilder sb = new StringBuilder();
        sb.append(getInstallId(context));
        if (location != null) {
            sb.append(location.getLatitude());
            sb.append(location.getLongitude());
            sb.append(location.isFromMockProvider());
        }
        sb.append(false);
        return hashSHA256(sb.toString());
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarSDK", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public static /* synthetic */ void h(Function2 function2, Exception exc) {
        warmUpProviderAndFetchTokenFromGoogle$lambda$7(function2, exc);
    }

    private final String hashSHA256(String input) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & MessagePack.Code.EXT_TIMESTAMP);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private final boolean isAdbEnabled(Context context) {
        int i;
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled");
        } catch (Exception unused) {
            i = 0;
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    private final boolean isIntegrityApiIncluded() {
        return true;
    }

    private final boolean isRooted(Context context) {
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/system/xbin/su", "/system/bin/su", "/sbin/su", "/system/su", "/system/bin/.ext/.su", "/system/etc/init.d/99SuperSUDaemon", "/dev/com.koushikdutta.superuser.daemon/", "/system/app/SuperSU.apk", "/system/app/SuperSU", "/system/xbin/busybox", "/system/bin/busybox", "/data/local/xbin/busybox", "/data/local/bin/busybox", "/system/sd/xbin/busybox", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            for (int i = 0; i < 18; i++) {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            }
            String str = Build.TAGS;
            str.getClass();
            if (!StringsKt.L(str, "test-keys", false)) {
                String[] strArr2 = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
                PackageManager packageManager = context.getPackageManager();
                for (int i2 = 0; i2 < 12; i2++) {
                    try {
                        packageManager.getPackageInfo(strArr2[i2], 0);
                        return true;
                    } catch (Exception unused) {
                    }
                }
                try {
                    Runtime.getRuntime().exec("su").getOutputStream().close();
                    return true;
                } catch (Exception unused2) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            m0.e(TAG, "Error checking root status", e);
        }
    }

    private final boolean isScreenSharing(Context context) {
        Object systemService;
        try {
            systemService = context.getSystemService("display");
            systemService.getClass();
        } catch (Exception e) {
            m0.e(TAG, "Error checking screen sharing", e);
        }
        if (((DisplayManager) systemService).getDisplays().length > 1) {
            return true;
        }
        Object systemService2 = context.getSystemService(MetricTracker.Object.INPUT);
        systemService2.getClass();
        InputManager inputManager = (InputManager) systemService2;
        int[] inputDeviceIds = inputManager.getInputDeviceIds();
        inputDeviceIds.getClass();
        for (int i : inputDeviceIds) {
            InputDevice inputDevice = inputManager.getInputDevice(i);
            if (inputDevice != null && inputDevice.isVirtual()) {
                return true;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        String[] strArr = {"com.screen.recorder", "com.hecorat.screenrecorder.free", "com.kimcy929.screenrecorder", "com.mobizen.mirroring", "com.airmore", "com.teamviewer.teamviewer", "com.anydesk.anydeskandroid"};
        for (int i2 = 0; i2 < 7; i2++) {
            try {
                packageManager.getPackageInfo(strArr[i2], 0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static final RadarSDKFraud sharedInstance() {
        return INSTANCE.sharedInstance();
    }

    private final void warmUpProviderAndFetchTokenFromGoogle(Context context, long googlePlayProjectNumber, final String requestHash, final Function2<? super String, ? super String, Unit> block) {
        if (!isIntegrityApiIncluded()) {
            m0.p(TAG, "Integrity API not included");
            block.invoke(null, "Integrity API not included");
            return;
        }
        ytk a = IntegrityManagerFactory.a(context);
        a.getClass();
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" cloudProjectNumber");
            }
            if ((b & 2) == 0) {
                sb.append(" webViewRequestMode");
            }
            dmk.n("Missing required properties:".concat(sb.toString()));
            return;
        }
        Task a2 = a.a(new zwk(googlePlayProjectNumber));
        fzn fznVar = (fzn) a2;
        fznVar.g(fpi.a, new da6(new Function1<xuh, Unit>() { // from class: io.radar.sdk.fraud.RadarSDKFraud$warmUpProviderAndFetchTokenFromGoogle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(xuh xuhVar) {
                RadarSDKFraud radarSDKFraud = RadarSDKFraud.this;
                xuhVar.getClass();
                RadarSDKFraud.access$setStandardIntegrityTokenProvider$p(radarSDKFraud, xuhVar);
                RadarSDKFraud.access$setLastWarmUpTimestampSeconds$p(RadarSDKFraud.this, System.currentTimeMillis() / 1000);
                RadarSDKFraud.access$fetchTokenFromGoogle(RadarSDKFraud.this, requestHash, block);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(xuh xuhVar) {
                invoke2(xuhVar);
                return Unit.INSTANCE;
            }
        }, 13));
        fznVar.d(new xmf(1, block));
    }

    private static final void warmUpProviderAndFetchTokenFromGoogle$lambda$6(Function1 function1, Object obj) {
        function1.getClass();
        function1.invoke(obj);
    }

    private static final void warmUpProviderAndFetchTokenFromGoogle$lambda$7(Function2 function2, Exception exc) {
        function2.getClass();
        exc.getClass();
        String message = exc.getMessage();
        m0.e(TAG, "Error warming up integrity token provider | warmupException = " + message, exc);
        function2.invoke(null, message);
    }

    public final void getFraudPayload(Map<String, ? extends Object> options, Function1<? super Map<String, ? extends Object>, Unit> callback) {
        Context context;
        Location location;
        options.getClass();
        callback.getClass();
        Object obj = options.get("context");
        Long l = null;
        if (obj instanceof Context) {
            context = (Context) obj;
        } else {
            context = null;
        }
        Object obj2 = options.get("location");
        if (obj2 instanceof Location) {
            location = (Location) obj2;
        } else {
            location = null;
        }
        Object obj3 = options.get("googlePlayProjectNumber");
        if (obj3 instanceof Long) {
            l = (Long) obj3;
        }
        Long l2 = l;
        if (context == null) {
            callback.invoke(c1c.b(new Pair("error", "Missing required parameters: context")));
        } else {
            this.backgroundExecutor.execute(new tb1(this, context, location, callback, l2, 5));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/radar/sdk/fraud/RadarSDKFraud$Companion;", "", "()V", "INSTANCE", "Lio/radar/sdk/fraud/RadarSDKFraud;", "KEY_INSTALL_ID", "", "LIB_VERSION", "TAG", "WARM_UP_WINDOW_SECONDS", "", "sharedInstance", "sdk-fraud_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarSDKFraud sharedInstance() {
            RadarSDKFraud access$getINSTANCE$cp;
            RadarSDKFraud access$getINSTANCE$cp2 = RadarSDKFraud.access$getINSTANCE$cp();
            if (access$getINSTANCE$cp2 == null) {
                synchronized (this) {
                    access$getINSTANCE$cp = RadarSDKFraud.access$getINSTANCE$cp();
                    if (access$getINSTANCE$cp == null) {
                        access$getINSTANCE$cp = new RadarSDKFraud(null);
                        RadarSDKFraud.access$setINSTANCE$cp(access$getINSTANCE$cp);
                    }
                }
                return access$getINSTANCE$cp;
            }
            return access$getINSTANCE$cp2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RadarSDKFraud(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
