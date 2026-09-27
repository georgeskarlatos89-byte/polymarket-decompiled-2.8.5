package io.sentry.android.core;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.Scanner;
import defpackage.fi9;
import io.sentry.n5;
import io.sentry.p6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class SentryAndroidOptions extends p6 {
    private boolean anrEnabled;
    private Double anrProfilingSampleRate;
    private boolean anrReportInDebug;
    private long anrTimeoutIntervalMillis;
    private boolean attachAnrThreadDump;
    private boolean attachRawTombstone;
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private p1 beforeScreenshotCaptureCallback;
    private p1 beforeViewHierarchyCaptureCallback;
    private boolean collectAdditionalContext;
    private boolean collectExternalStorageContext;
    private v0 debugImagesLoader;
    private boolean enableActivityLifecycleBreadcrumbs;
    private boolean enableActivityLifecycleTracingAutoFinish;
    private boolean enableAnrFingerprinting;
    private boolean enableAppComponentBreadcrumbs;
    private boolean enableAppLifecycleBreadcrumbs;
    private boolean enableAutoActivityLifecycleTracing;
    private boolean enableAutoTraceIdGeneration;
    private boolean enableFramesTracking;
    private boolean enableNdk;
    private boolean enableNdkAppHangTracking;
    private boolean enableNetworkEventBreadcrumbs;
    private boolean enablePerformanceV2;
    private boolean enableRootCheck;
    private boolean enableScopeSync;
    private boolean enableStandaloneAppStartTracing;
    private boolean enableSystemEventBreadcrumbs;
    private boolean enableSystemEventBreadcrumbsExtras;
    private boolean enableTombstone;
    private io.sentry.android.core.internal.util.p frameMetricsCollector;
    private String nativeSdkName;
    private long ndkAppHangTimeoutIntervalMillis;
    private b1 ndkHandlerStrategy;
    private boolean reportHistoricalAnrs;
    private boolean reportHistoricalTombstones;
    private final q1 screenshot;
    private final long startupCrashDurationThresholdMillis;
    private long startupCrashFlushTimeoutMillis;

    /* JADX WARN: Type inference failed for: r2v4, types: [p6, io.sentry.android.core.q1] */
    public SentryAndroidOptions() {
        super(false);
        this.anrEnabled = true;
        this.anrTimeoutIntervalMillis = 5000L;
        this.anrReportInDebug = false;
        this.enableNdkAppHangTracking = false;
        this.ndkAppHangTimeoutIntervalMillis = 5000L;
        this.enableActivityLifecycleBreadcrumbs = true;
        this.enableAppLifecycleBreadcrumbs = true;
        this.enableSystemEventBreadcrumbs = true;
        this.enableAppComponentBreadcrumbs = true;
        this.enableNetworkEventBreadcrumbs = true;
        this.enableAutoActivityLifecycleTracing = true;
        this.enableActivityLifecycleTracingAutoFinish = true;
        this.debugImagesLoader = w.c;
        this.collectAdditionalContext = true;
        this.collectExternalStorageContext = false;
        this.startupCrashFlushTimeoutMillis = 5000L;
        this.startupCrashDurationThresholdMillis = Scanner.CAMERA_SETUP_DELAY_MS;
        this.enableFramesTracking = true;
        this.nativeSdkName = null;
        this.enableRootCheck = true;
        this.enableNdk = true;
        this.ndkHandlerStrategy = b1.SENTRY_HANDLER_STRATEGY_DEFAULT;
        this.enableScopeSync = true;
        this.enableAutoTraceIdGeneration = true;
        this.enableSystemEventBreadcrumbsExtras = false;
        this.reportHistoricalAnrs = false;
        this.reportHistoricalTombstones = false;
        this.attachAnrThreadDump = false;
        this.attachRawTombstone = false;
        this.enablePerformanceV2 = true;
        this.enableStandaloneAppStartTracing = false;
        this.enableTombstone = false;
        this.screenshot = new defpackage.p6(9, false);
        this.enableAnrFingerprinting = true;
        setSentryClientName("sentry.java.android/8.53.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private io.sentry.protocol.u createSdkVersion() {
        io.sentry.protocol.u sdkVersion = getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.u("sentry.java.android", "8.53.0");
        } else {
            sdkVersion.a = "sentry.java.android";
            sdkVersion.b = "8.53.0";
        }
        n5.d().b("maven:io.sentry:sentry-android-core", "8.53.0");
        return sdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z) {
        this.enableActivityLifecycleBreadcrumbs = z;
        this.enableAppComponentBreadcrumbs = z;
        this.enableSystemEventBreadcrumbs = z;
        this.enableAppLifecycleBreadcrumbs = z;
        this.enableNetworkEventBreadcrumbs = z;
        setEnableUserInteractionBreadcrumbs(z);
    }

    public Double getAnrProfilingSampleRate() {
        return this.anrProfilingSampleRate;
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public p1 getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public p1 getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public v0 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public io.sentry.android.core.internal.util.p getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public long getNdkAppHangTimeoutIntervalMillis() {
        return this.ndkAppHangTimeoutIntervalMillis;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public q1 getScreenshot() {
        return this.screenshot;
    }

    public long getStartupCrashDurationThresholdMillis() {
        return Scanner.CAMERA_SETUP_DELAY_MS;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrProfilingEnabled() {
        Double d = this.anrProfilingSampleRate;
        if (d != null && d.doubleValue() > ConstantsKt.UNSET) {
            return true;
        }
        return false;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachRawTombstone() {
        return this.attachRawTombstone;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isCollectExternalStorageContext() {
        return this.collectExternalStorageContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAnrFingerprinting() {
        return this.enableAnrFingerprinting;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNdkAppHangTracking() {
        return this.enableNdkAppHangTracking;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableStandaloneAppStartTracing() {
        return this.enableStandaloneAppStartTracing;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public boolean isReportHistoricalTombstones() {
        return this.reportHistoricalTombstones;
    }

    public boolean isTombstoneEnabled() {
        return this.enableTombstone;
    }

    public void setAnrEnabled(boolean z) {
        this.anrEnabled = z;
    }

    public void setAnrProfilingSampleRate(Double d) {
        if (io.sentry.util.b.n(d, true)) {
            this.anrProfilingSampleRate = d;
        } else {
            fi9.p(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public void setAnrReportInDebug(boolean z) {
        this.anrReportInDebug = z;
    }

    public void setAnrTimeoutIntervalMillis(long j) {
        this.anrTimeoutIntervalMillis = j;
    }

    public void setAttachAnrThreadDump(boolean z) {
        this.attachAnrThreadDump = z;
    }

    public void setAttachRawTombstone(boolean z) {
        this.attachRawTombstone = z;
    }

    public void setAttachScreenshot(boolean z) {
        this.attachScreenshot = z;
    }

    public void setAttachViewHierarchy(boolean z) {
        this.attachViewHierarchy = z;
    }

    public void setCollectAdditionalContext(boolean z) {
        this.collectAdditionalContext = z;
    }

    public void setCollectExternalStorageContext(boolean z) {
        this.collectExternalStorageContext = z;
    }

    public void setDebugImagesLoader(v0 v0Var) {
        if (v0Var == null) {
            v0Var = w.c;
        }
        this.debugImagesLoader = v0Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z) {
        this.enableActivityLifecycleBreadcrumbs = z;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z) {
        this.enableActivityLifecycleTracingAutoFinish = z;
    }

    public void setEnableAnrFingerprinting(boolean z) {
        this.enableAnrFingerprinting = z;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z) {
        this.enableAppComponentBreadcrumbs = z;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z) {
        this.enableAppLifecycleBreadcrumbs = z;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z) {
        this.enableAutoActivityLifecycleTracing = z;
    }

    public void setEnableAutoTraceIdGeneration(boolean z) {
        this.enableAutoTraceIdGeneration = z;
    }

    public void setEnableFramesTracking(boolean z) {
        this.enableFramesTracking = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableNdkAppHangTracking(boolean z) {
        this.enableNdkAppHangTracking = z;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z) {
        this.enableNetworkEventBreadcrumbs = z;
    }

    public void setEnablePerformanceV2(boolean z) {
        this.enablePerformanceV2 = z;
    }

    public void setEnableRootCheck(boolean z) {
        this.enableRootCheck = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableStandaloneAppStartTracing(boolean z) {
        this.enableStandaloneAppStartTracing = z;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z) {
        this.enableSystemEventBreadcrumbs = z;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z) {
        this.enableSystemEventBreadcrumbsExtras = z;
    }

    public void setFrameMetricsCollector(io.sentry.android.core.internal.util.p pVar) {
        this.frameMetricsCollector = pVar;
    }

    public void setNativeHandlerStrategy(b1 b1Var) {
        this.ndkHandlerStrategy = b1Var;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setNdkAppHangTimeoutIntervalMillis(long j) {
        this.ndkAppHangTimeoutIntervalMillis = j;
    }

    public void setReportHistoricalAnrs(boolean z) {
        this.reportHistoricalAnrs = z;
    }

    public void setReportHistoricalTombstones(boolean z) {
        this.reportHistoricalTombstones = z;
    }

    public void setStartupCrashFlushTimeoutMillis(long j) {
        this.startupCrashFlushTimeoutMillis = j;
    }

    public void setTombstoneEnabled(boolean z) {
        this.enableTombstone = z;
    }

    public void setBeforeScreenshotCaptureCallback(p1 p1Var) {
    }

    public void setBeforeViewHierarchyCaptureCallback(p1 p1Var) {
    }
}
