package com.checkout.components.wallet.di;

import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import defpackage.blc;
import defpackage.e78;
import defpackage.ykc;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/wallet/di/GooglePayModule;", "", "<init>", "()V", "Lblc;", "provideMoshi", "()Lblc;", "moshi", "Lcom/checkout/components/wallet/common/GooglePayMapper;", "provideGooglePayMapper", "(Lblc;)Lcom/checkout/components/wallet/common/GooglePayMapper;", "Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "provideGooglePayRepositoryImpl", "()Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GooglePayModule {
    public static final int $stable = 0;

    public final GooglePayMapper provideGooglePayMapper(blc moshi) {
        moshi.getClass();
        return new GooglePayMapper(moshi);
    }

    public final GooglePayRepositoryImpl provideGooglePayRepositoryImpl() {
        return new GooglePayRepositoryImpl();
    }

    public final blc provideMoshi() {
        ykc ykcVar = new ykc(0);
        ykcVar.a(new e78(6));
        return new blc(ykcVar);
    }
}
