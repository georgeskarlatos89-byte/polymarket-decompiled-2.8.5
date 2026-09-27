package com.checkout.components.wallet.data.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "", "", "", "allowedAuthMethods", "allowedCardNetworks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAllowedAuthMethods", "b", "getAllowedCardNetworks", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PaymentMethodCardParameters {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final List allowedAuthMethods;

    /* renamed from: b, reason: from kotlin metadata */
    private final List allowedCardNetworks;

    public PaymentMethodCardParameters(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.allowedAuthMethods = list;
        this.allowedCardNetworks = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodCardParameters copy$default(PaymentMethodCardParameters paymentMethodCardParameters, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentMethodCardParameters.allowedAuthMethods;
        }
        if ((i & 2) != 0) {
            list2 = paymentMethodCardParameters.allowedCardNetworks;
        }
        return paymentMethodCardParameters.copy(list, list2);
    }

    public final List<String> component1() {
        return this.allowedAuthMethods;
    }

    public final List<String> component2() {
        return this.allowedCardNetworks;
    }

    public final PaymentMethodCardParameters copy(List<String> allowedAuthMethods, List<String> allowedCardNetworks) {
        allowedAuthMethods.getClass();
        allowedCardNetworks.getClass();
        return new PaymentMethodCardParameters(allowedAuthMethods, allowedCardNetworks);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodCardParameters)) {
            return false;
        }
        PaymentMethodCardParameters paymentMethodCardParameters = (PaymentMethodCardParameters) other;
        if (Intrinsics.areEqual(this.allowedAuthMethods, paymentMethodCardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, paymentMethodCardParameters.allowedCardNetworks)) {
            return true;
        }
        return false;
    }

    public final List<String> getAllowedAuthMethods() {
        return this.allowedAuthMethods;
    }

    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    public final int hashCode() {
        return this.allowedCardNetworks.hashCode() + (this.allowedAuthMethods.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodCardParameters(allowedAuthMethods=" + this.allowedAuthMethods + ", allowedCardNetworks=" + this.allowedCardNetworks + ")";
    }
}
