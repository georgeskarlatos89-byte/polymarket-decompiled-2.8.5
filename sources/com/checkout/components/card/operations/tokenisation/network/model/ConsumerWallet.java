package com.checkout.components.card.operations.tokenisation.network.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "", "", "setAsDefaultPaymentMethod", "Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "shipping", "<init>", "(ZLcom/checkout/components/card/operations/tokenisation/network/model/Shipping;)V", "copy", "(ZLcom/checkout/components/card/operations/tokenisation/network/model/Shipping;)Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "a", "Z", "getSetAsDefaultPaymentMethod", "()Z", "getSetAsDefaultPaymentMethod$annotations", "()V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class ConsumerWallet {

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean setAsDefaultPaymentMethod;
    public final Shipping b;

    public /* synthetic */ ConsumerWallet(boolean z, Shipping shipping, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : shipping);
    }

    public final ConsumerWallet copy(@zca(name = "set_as_default_payment_method") boolean setAsDefaultPaymentMethod, Shipping shipping) {
        return new ConsumerWallet(setAsDefaultPaymentMethod, shipping);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumerWallet)) {
            return false;
        }
        ConsumerWallet consumerWallet = (ConsumerWallet) obj;
        if (this.setAsDefaultPaymentMethod == consumerWallet.setAsDefaultPaymentMethod && Intrinsics.areEqual(this.b, consumerWallet.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.setAsDefaultPaymentMethod) * 31;
        Shipping shipping = this.b;
        if (shipping == null) {
            hashCode = 0;
        } else {
            hashCode = shipping.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ConsumerWallet(setAsDefaultPaymentMethod=" + this.setAsDefaultPaymentMethod + ", shipping=" + this.b + ")";
    }

    public ConsumerWallet(@zca(name = "set_as_default_payment_method") boolean z, Shipping shipping) {
        this.setAsDefaultPaymentMethod = z;
        this.b = shipping;
    }

    @zca(name = "set_as_default_payment_method")
    public static /* synthetic */ void getSetAsDefaultPaymentMethod$annotations() {
    }
}
