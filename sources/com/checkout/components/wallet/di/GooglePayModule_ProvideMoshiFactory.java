package com.checkout.components.wallet.di;

import defpackage.blc;
import defpackage.dv7;
import defpackage.frn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class GooglePayModule_ProvideMoshiFactory implements dv7 {
    private final GooglePayModule a;

    public GooglePayModule_ProvideMoshiFactory(GooglePayModule googlePayModule) {
        this.a = googlePayModule;
    }

    public static GooglePayModule_ProvideMoshiFactory create(GooglePayModule googlePayModule) {
        return new GooglePayModule_ProvideMoshiFactory(googlePayModule);
    }

    public static blc provideMoshi(GooglePayModule googlePayModule) {
        blc provideMoshi = googlePayModule.provideMoshi();
        frn.a(provideMoshi);
        return provideMoshi;
    }

    @Override // defpackage.kgf
    public final blc get() {
        blc provideMoshi = this.a.provideMoshi();
        frn.a(provideMoshi);
        return provideMoshi;
    }

    @Override // defpackage.kgf
    public final Object get() {
        blc provideMoshi = this.a.provideMoshi();
        frn.a(provideMoshi);
        return provideMoshi;
    }
}
