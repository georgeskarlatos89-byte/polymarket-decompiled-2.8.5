package com.checkout.components.wallet.data.repository;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.wallet.common.EnvironmentMapper;
import com.checkout.components.wallet.domain.repository.GooglePayRepository;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ax8;
import defpackage.die;
import defpackage.g5;
import defpackage.kek;
import defpackage.nfj;
import defpackage.p2e;
import defpackage.s3n;
import defpackage.t8a;
import defpackage.zw8;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "Lcom/checkout/components/wallet/domain/repository/GooglePayRepository;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", ConstantsKt.ENV_FACING_MODE, "Ldie;", "createPaymentsClient", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;)Ldie;", "", "json", "Lp2e;", "createPaymentDataRequest", "(Ljava/lang/String;)Lp2e;", "Lt8a;", "createIsReadyToPayRequest", "(Ljava/lang/String;)Lt8a;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GooglePayRepositoryImpl implements GooglePayRepository {
    public static final int $stable = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [t8a, g5] */
    @Override // com.checkout.components.wallet.domain.repository.GooglePayRepository
    public final t8a createIsReadyToPayRequest(String json) {
        json.getClass();
        ?? g5Var = new g5();
        g5Var.f = json;
        return g5Var;
    }

    @Override // com.checkout.components.wallet.domain.repository.GooglePayRepository
    public final p2e createPaymentDataRequest(String json) {
        json.getClass();
        return p2e.O(json);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ax8, die] */
    @Override // com.checkout.components.wallet.domain.repository.GooglePayRepository
    public final die createPaymentsClient(Context context, Environment environment) {
        context.getClass();
        environment.getClass();
        nfj nfjVar = new nfj();
        nfjVar.b(EnvironmentMapper.INSTANCE.mapToWalletEnvironment$wallet_standardRelease(environment));
        return new ax8(context, null, s3n.a, new kek(nfjVar), zw8.c);
    }
}
