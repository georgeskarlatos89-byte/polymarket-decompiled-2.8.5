package com.checkout.components.core.network.model.response;

import com.checkout.components.interfaces.model.PaymentMethodName;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.cie;
import defpackage.e1e;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved", "Le1e;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class PayPaymentSessionResponse$Approved extends e1e {
    public final String a;
    public final PaymentMethodName b;
    public final cie c;

    public PayPaymentSessionResponse$Approved(String str, PaymentMethodName paymentMethodName, cie cieVar) {
        str.getClass();
        paymentMethodName.getClass();
        this.a = str;
        this.b = paymentMethodName;
        this.c = cieVar;
    }

    @Override // defpackage.e1e
    /* renamed from: a, reason: from getter */
    public final cie getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PayPaymentSessionResponse$Approved) {
                PayPaymentSessionResponse$Approved payPaymentSessionResponse$Approved = (PayPaymentSessionResponse$Approved) obj;
                if (!Intrinsics.areEqual(this.a, payPaymentSessionResponse$Approved.a) || this.b != payPaymentSessionResponse$Approved.b || this.c != payPaymentSessionResponse$Approved.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Approved(id=" + this.a + ", type=" + this.b + ", status=" + this.c + ")";
    }
}
