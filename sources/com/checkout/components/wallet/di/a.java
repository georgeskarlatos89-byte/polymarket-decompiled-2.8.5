package com.checkout.components.wallet.di;

import com.checkout.components.wallet.GooglePayMediator;
import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import defpackage.jgf;
import defpackage.px6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a implements GooglePayComponent {
    public final jgf a;
    public final jgf b;

    public a(GooglePayModule googlePayModule) {
        this.a = px6.b(new GooglePayModule_ProvideGooglePayRepositoryImplFactory(googlePayModule));
        this.b = px6.b(new GooglePayModule_ProvideGooglePayMapperFactory(googlePayModule, px6.b(new GooglePayModule_ProvideMoshiFactory(googlePayModule))));
    }

    @Override // com.checkout.components.wallet.di.GooglePayComponent
    public final GooglePayMapper getGooglePayMapper() {
        return (GooglePayMapper) this.b.get();
    }

    @Override // com.checkout.components.wallet.di.GooglePayComponent
    public final GooglePayRepositoryImpl getGooglePayRepositoryImpl() {
        return (GooglePayRepositoryImpl) this.a.get();
    }

    @Override // com.checkout.components.wallet.di.GooglePayComponent
    public final void inject(GooglePayMediator googlePayMediator) {
        googlePayMediator.repository = (GooglePayRepositoryImpl) this.a.get();
        googlePayMediator.mapper = (GooglePayMapper) this.b.get();
    }
}
