package com.launchdarkly.sdk.android;

import defpackage.dva;
import defpackage.tv2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a implements tv2 {
    public final /* synthetic */ tv2 a;
    public final /* synthetic */ d b;

    public a(d dVar, tv2 tv2Var) {
        this.b = dVar;
        this.a = tv2Var;
    }

    public final void a(LDFailure lDFailure) {
        d dVar = this.b;
        ConnectionInformation$ConnectionMode a = dVar.d.a();
        ConnectionInformationState connectionInformationState = dVar.d;
        connectionInformationState.e(a);
        connectionInformationState.f(Long.valueOf(System.currentTimeMillis()));
        connectionInformationState.g(lDFailure);
        try {
            dVar.c(connectionInformationState);
        } catch (Exception e) {
            dva.a(dVar.p, e, true, "Error saving connection information", new Object[0]);
        }
        dVar.h();
        this.a.onSuccess(null);
    }

    @Override // defpackage.tv2
    public final void onSuccess(Object obj) {
        d dVar = this.b;
        dVar.e(dVar.d.a());
        this.a.onSuccess(null);
    }
}
