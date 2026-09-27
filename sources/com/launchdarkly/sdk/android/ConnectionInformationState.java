package com.launchdarkly.sdk.android;

import defpackage.kw4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class ConnectionInformationState implements kw4 {
    private ConnectionInformation$ConnectionMode connectionMode;
    private Long lastFailedConnection;
    private LDFailure lastFailure;
    private Long lastSuccessfulConnection;

    public final ConnectionInformation$ConnectionMode a() {
        return this.connectionMode;
    }

    public final Long b() {
        return this.lastFailedConnection;
    }

    public final LDFailure c() {
        return this.lastFailure;
    }

    public final Long d() {
        return this.lastSuccessfulConnection;
    }

    public final void e(ConnectionInformation$ConnectionMode connectionInformation$ConnectionMode) {
        this.connectionMode = connectionInformation$ConnectionMode;
    }

    public final void f(Long l) {
        this.lastFailedConnection = l;
    }

    public final void g(LDFailure lDFailure) {
        this.lastFailure = lDFailure;
    }

    public final void h(Long l) {
        this.lastSuccessfulConnection = l;
    }
}
