package com.checkout.components.wallet.data.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.hdi;
import defpackage.mda;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012¨\u0006("}, d2 = {"Lcom/checkout/components/wallet/data/dto/CardParameters;", "", "", "", "allowedAuthMethods", "allowedCardNetworks", "", "billingAddressRequired", "Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "billingAddressParameters", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/checkout/components/wallet/data/dto/BillingAddressParameters;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", "()Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "copy", "(Ljava/util/List;Ljava/util/List;ZLcom/checkout/components/wallet/data/dto/BillingAddressParameters;)Lcom/checkout/components/wallet/data/dto/CardParameters;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAllowedAuthMethods", "b", "getAllowedCardNetworks", "c", "Z", "getBillingAddressRequired", d.d, "Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "getBillingAddressParameters", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class CardParameters {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final List allowedAuthMethods;

    /* renamed from: b, reason: from kotlin metadata */
    private final List allowedCardNetworks;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean billingAddressRequired;

    /* renamed from: d, reason: from kotlin metadata */
    private final BillingAddressParameters billingAddressParameters;

    public CardParameters(List<String> list, List<String> list2, boolean z, BillingAddressParameters billingAddressParameters) {
        list.getClass();
        list2.getClass();
        billingAddressParameters.getClass();
        this.allowedAuthMethods = list;
        this.allowedCardNetworks = list2;
        this.billingAddressRequired = z;
        this.billingAddressParameters = billingAddressParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardParameters copy$default(CardParameters cardParameters, List list, List list2, boolean z, BillingAddressParameters billingAddressParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardParameters.allowedAuthMethods;
        }
        if ((i & 2) != 0) {
            list2 = cardParameters.allowedCardNetworks;
        }
        if ((i & 4) != 0) {
            z = cardParameters.billingAddressRequired;
        }
        if ((i & 8) != 0) {
            billingAddressParameters = cardParameters.billingAddressParameters;
        }
        return cardParameters.copy(list, list2, z, billingAddressParameters);
    }

    public final List<String> component1() {
        return this.allowedAuthMethods;
    }

    public final List<String> component2() {
        return this.allowedCardNetworks;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    public final CardParameters copy(List<String> allowedAuthMethods, List<String> allowedCardNetworks, boolean billingAddressRequired, BillingAddressParameters billingAddressParameters) {
        allowedAuthMethods.getClass();
        allowedCardNetworks.getClass();
        billingAddressParameters.getClass();
        return new CardParameters(allowedAuthMethods, allowedCardNetworks, billingAddressRequired, billingAddressParameters);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParameters)) {
            return false;
        }
        CardParameters cardParameters = (CardParameters) other;
        if (Intrinsics.areEqual(this.allowedAuthMethods, cardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, cardParameters.allowedCardNetworks) && this.billingAddressRequired == cardParameters.billingAddressRequired && Intrinsics.areEqual(this.billingAddressParameters, cardParameters.billingAddressParameters)) {
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

    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    public final boolean getBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    public final int hashCode() {
        return this.billingAddressParameters.hashCode() + hdi.g(hdi.f(this.allowedAuthMethods.hashCode() * 31, 31, this.allowedCardNetworks), 31, this.billingAddressRequired);
    }

    public final String toString() {
        return "CardParameters(allowedAuthMethods=" + this.allowedAuthMethods + ", allowedCardNetworks=" + this.allowedCardNetworks + ", billingAddressRequired=" + this.billingAddressRequired + ", billingAddressParameters=" + this.billingAddressParameters + ")";
    }
}
