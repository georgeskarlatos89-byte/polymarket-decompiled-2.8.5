package com.checkout.components.core.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/core/model/PaymentDataJson;", "", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class PaymentDataJson {
    public final PaymentMethodData a;

    public PaymentDataJson(PaymentMethodData paymentMethodData) {
        this.a = paymentMethodData;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentDataJson) || !Intrinsics.areEqual(this.a, ((PaymentDataJson) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentDataJson(paymentMethodData=" + this.a + ")";
    }
}
