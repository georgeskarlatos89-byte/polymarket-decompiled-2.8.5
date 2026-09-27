package com.checkout.components.wallet.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/checkout/components/wallet/data/dto/PaymentMethod;", "", "", "type", "Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "parameters", "Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;", "tokenizationSpecification", "<init>", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "component3", "()Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;", "copy", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;)Lcom/checkout/components/wallet/data/dto/PaymentMethod;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lcom/checkout/components/wallet/data/dto/PaymentMethodCardParameters;", "getParameters", "c", "Lcom/checkout/components/wallet/data/dto/PaymentMethodTokenizationSpecification;", "getTokenizationSpecification", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PaymentMethod {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: from kotlin metadata */
    private final PaymentMethodCardParameters parameters;

    /* renamed from: c, reason: from kotlin metadata */
    private final PaymentMethodTokenizationSpecification tokenizationSpecification;

    public PaymentMethod(String str, PaymentMethodCardParameters paymentMethodCardParameters, PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification) {
        str.getClass();
        paymentMethodCardParameters.getClass();
        paymentMethodTokenizationSpecification.getClass();
        this.type = str;
        this.parameters = paymentMethodCardParameters;
        this.tokenizationSpecification = paymentMethodTokenizationSpecification;
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, PaymentMethodCardParameters paymentMethodCardParameters, PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethod.type;
        }
        if ((i & 2) != 0) {
            paymentMethodCardParameters = paymentMethod.parameters;
        }
        if ((i & 4) != 0) {
            paymentMethodTokenizationSpecification = paymentMethod.tokenizationSpecification;
        }
        return paymentMethod.copy(str, paymentMethodCardParameters, paymentMethodTokenizationSpecification);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodCardParameters getParameters() {
        return this.parameters;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodTokenizationSpecification getTokenizationSpecification() {
        return this.tokenizationSpecification;
    }

    public final PaymentMethod copy(String type, PaymentMethodCardParameters parameters, PaymentMethodTokenizationSpecification tokenizationSpecification) {
        type.getClass();
        parameters.getClass();
        tokenizationSpecification.getClass();
        return new PaymentMethod(type, parameters, tokenizationSpecification);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        if (Intrinsics.areEqual(this.type, paymentMethod.type) && Intrinsics.areEqual(this.parameters, paymentMethod.parameters) && Intrinsics.areEqual(this.tokenizationSpecification, paymentMethod.tokenizationSpecification)) {
            return true;
        }
        return false;
    }

    public final PaymentMethodCardParameters getParameters() {
        return this.parameters;
    }

    public final PaymentMethodTokenizationSpecification getTokenizationSpecification() {
        return this.tokenizationSpecification;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.tokenizationSpecification.hashCode() + ((this.parameters.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PaymentMethod(type=" + this.type + ", parameters=" + this.parameters + ", tokenizationSpecification=" + this.tokenizationSpecification + ")";
    }
}
