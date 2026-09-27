package io.sentry.ndk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class NdkOptions {
    private final String dist;
    private final String dsn;
    private final String environment;
    private final boolean isDebug;
    private final int maxBreadcrumbs;
    private final String outboxPath;
    private final String release;
    private final String sdkName;
    private a ndkHandlerStrategy = a.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private float tracesSampleRate = 0.0f;
    private boolean enableAppHangTracking = false;
    private long appHangTimeoutMillis = 5000;

    public NdkOptions(String str, boolean z, String str2, String str3, String str4, String str5, int i, String str6) {
        this.dsn = str;
        this.isDebug = z;
        this.outboxPath = str2;
        this.release = str3;
        this.environment = str4;
        this.dist = str5;
        this.maxBreadcrumbs = i;
        this.sdkName = str6;
    }

    public long getAppHangTimeoutMillis() {
        return this.appHangTimeoutMillis;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public String getOutboxPath() {
        return this.outboxPath;
    }

    public String getRelease() {
        return this.release;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public float getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public boolean isEnableAppHangTracking() {
        return this.enableAppHangTracking;
    }

    public void setAppHangTimeoutMillis(long j) {
        this.appHangTimeoutMillis = j;
    }

    public void setEnableAppHangTracking(boolean z) {
        this.enableAppHangTracking = z;
    }

    public void setNdkHandlerStrategy(a aVar) {
        this.ndkHandlerStrategy = aVar;
    }

    public void setTracesSampleRate(float f) {
        this.tracesSampleRate = f;
    }
}
