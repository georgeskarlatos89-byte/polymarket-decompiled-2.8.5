package com.checkout.components.core.network.model.response;

import com.checkout.components.interfaces.model.PaymentMethodName;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.cie;
import defpackage.e1e;
import defpackage.mda;
import defpackage.n1e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/checkout/components/core/network/model/response/PayPaymentSessionResponse$ActionRequired", "Le1e;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class PayPaymentSessionResponse$ActionRequired extends e1e {
    public final String a;
    public final PaymentMethodName b;
    public final n1e c;
    public final cie d;

    public PayPaymentSessionResponse$ActionRequired(String str, PaymentMethodName paymentMethodName, n1e n1eVar, cie cieVar) {
        str.getClass();
        paymentMethodName.getClass();
        this.a = str;
        this.b = paymentMethodName;
        this.c = n1eVar;
        this.d = cieVar;
    }

    @Override // defpackage.e1e
    /* renamed from: a, reason: from getter */
    public final cie getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PayPaymentSessionResponse$ActionRequired) {
                PayPaymentSessionResponse$ActionRequired payPaymentSessionResponse$ActionRequired = (PayPaymentSessionResponse$ActionRequired) obj;
                if (!Intrinsics.areEqual(this.a, payPaymentSessionResponse$ActionRequired.a) || this.b != payPaymentSessionResponse$ActionRequired.b || !Intrinsics.areEqual(this.c, payPaymentSessionResponse$ActionRequired.c) || this.d != payPaymentSessionResponse$ActionRequired.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActionRequired(id=" + this.a + ", type=" + this.b + ", action=" + this.c + ", status=" + this.d + ")";
    }
}
