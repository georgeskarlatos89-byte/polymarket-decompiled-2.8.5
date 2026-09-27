package com.checkout.components.wallet.domain.repository;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.die;
import defpackage.p2e;
import defpackage.t8a;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/checkout/components/wallet/domain/repository/GooglePayRepository;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", ConstantsKt.ENV_FACING_MODE, "Ldie;", "createPaymentsClient", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;)Ldie;", "", "json", "Lp2e;", "createPaymentDataRequest", "(Ljava/lang/String;)Lp2e;", "Lt8a;", "createIsReadyToPayRequest", "(Ljava/lang/String;)Lt8a;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GooglePayRepository {
    t8a createIsReadyToPayRequest(String json);

    p2e createPaymentDataRequest(String json);

    die createPaymentsClient(Context context, Environment environment);
}
