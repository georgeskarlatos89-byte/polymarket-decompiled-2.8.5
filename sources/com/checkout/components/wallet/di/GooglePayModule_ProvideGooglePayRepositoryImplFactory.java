package com.checkout.components.wallet.di;

import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import defpackage.dv7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class GooglePayModule_ProvideGooglePayRepositoryImplFactory implements dv7 {
    private final GooglePayModule a;

    public GooglePayModule_ProvideGooglePayRepositoryImplFactory(GooglePayModule googlePayModule) {
        this.a = googlePayModule;
    }

    public static GooglePayModule_ProvideGooglePayRepositoryImplFactory create(GooglePayModule googlePayModule) {
        return new GooglePayModule_ProvideGooglePayRepositoryImplFactory(googlePayModule);
    }

    public static GooglePayRepositoryImpl provideGooglePayRepositoryImpl(GooglePayModule googlePayModule) {
        googlePayModule.getClass();
        return new GooglePayRepositoryImpl();
    }

    @Override // defpackage.kgf
    public final GooglePayRepositoryImpl get() {
        return provideGooglePayRepositoryImpl(this.a);
    }

    @Override // defpackage.kgf
    public final Object get() {
        return provideGooglePayRepositoryImpl(this.a);
    }
}
