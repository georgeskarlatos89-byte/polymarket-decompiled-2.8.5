package com.checkout.components.wallet.data.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;", "", "", "type", "Lcom/checkout/components/wallet/data/dto/GatewayInformation;", "parameters", "<init>", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/GatewayInformation;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/wallet/data/dto/GatewayInformation;", "copy", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/dto/GatewayInformation;)Lcom/checkout/components/wallet/data/dto/TokenizationSpecification;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Lcom/checkout/components/wallet/data/dto/GatewayInformation;", "getParameters", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class TokenizationSpecification {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: from kotlin metadata */
    private final GatewayInformation parameters;

    public TokenizationSpecification(String str, GatewayInformation gatewayInformation) {
        str.getClass();
        gatewayInformation.getClass();
        this.type = str;
        this.parameters = gatewayInformation;
    }

    public static /* synthetic */ TokenizationSpecification copy$default(TokenizationSpecification tokenizationSpecification, String str, GatewayInformation gatewayInformation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizationSpecification.type;
        }
        if ((i & 2) != 0) {
            gatewayInformation = tokenizationSpecification.parameters;
        }
        return tokenizationSpecification.copy(str, gatewayInformation);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final GatewayInformation getParameters() {
        return this.parameters;
    }

    public final TokenizationSpecification copy(String type, GatewayInformation parameters) {
        type.getClass();
        parameters.getClass();
        return new TokenizationSpecification(type, parameters);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenizationSpecification)) {
            return false;
        }
        TokenizationSpecification tokenizationSpecification = (TokenizationSpecification) other;
        if (Intrinsics.areEqual(this.type, tokenizationSpecification.type) && Intrinsics.areEqual(this.parameters, tokenizationSpecification.parameters)) {
            return true;
        }
        return false;
    }

    public final GatewayInformation getParameters() {
        return this.parameters;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.parameters.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "TokenizationSpecification(type=" + this.type + ", parameters=" + this.parameters + ")";
    }
}
