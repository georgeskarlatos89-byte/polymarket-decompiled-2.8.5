package com.socure.docv.capturesdk.di.app;

import android.app.Application;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends g {
    public final Application u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        application.getClass();
        this.u = application;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final Application i() {
        return this.u;
    }
}
