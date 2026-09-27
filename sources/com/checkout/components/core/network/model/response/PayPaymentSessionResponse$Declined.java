package com.checkout.components.core.network.model.response;

import com.checkout.components.interfaces.model.PaymentMethodName;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.cie;
import defpackage.cx5;
import defpackage.e1e;
import defpackage.mda;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"com/checkout/components/core/network/model/response/PayPaymentSessionResponse$Declined", "Le1e;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "type", "Lcx5;", "declineReason", "Lcie;", "status", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcx5;Lcie;)V", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Declined;", "copy", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcx5;Lcie;)Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Declined;", "c", "Lcx5;", "getDeclineReason", "()Lcx5;", "getDeclineReason$annotations", "()V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class PayPaymentSessionResponse$Declined extends e1e {
    public final String a;
    public final PaymentMethodName b;

    /* renamed from: c, reason: from kotlin metadata */
    public final cx5 declineReason;
    public final cie d;

    public PayPaymentSessionResponse$Declined(String str, PaymentMethodName paymentMethodName, @zca(name = "decline_reason") cx5 cx5Var, cie cieVar) {
        str.getClass();
        paymentMethodName.getClass();
        cx5Var.getClass();
        cieVar.getClass();
        this.a = str;
        this.b = paymentMethodName;
        this.declineReason = cx5Var;
        this.d = cieVar;
    }

    @Override // defpackage.e1e
    /* renamed from: a, reason: from getter */
    public final cie getD() {
        return this.d;
    }

    public final PayPaymentSessionResponse$Declined copy(String id, PaymentMethodName type, @zca(name = "decline_reason") cx5 declineReason, cie status) {
        id.getClass();
        type.getClass();
        declineReason.getClass();
        status.getClass();
        return new PayPaymentSessionResponse$Declined(id, type, declineReason, status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPaymentSessionResponse$Declined)) {
            return false;
        }
        PayPaymentSessionResponse$Declined payPaymentSessionResponse$Declined = (PayPaymentSessionResponse$Declined) obj;
        if (Intrinsics.areEqual(this.a, payPaymentSessionResponse$Declined.a) && this.b == payPaymentSessionResponse$Declined.b && this.declineReason == payPaymentSessionResponse$Declined.declineReason && this.d == payPaymentSessionResponse$Declined.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.declineReason.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Declined(id=" + this.a + ", type=" + this.b + ", declineReason=" + this.declineReason + ", status=" + this.d + ")";
    }

    @zca(name = "decline_reason")
    public static /* synthetic */ void getDeclineReason$annotations() {
    }
}
