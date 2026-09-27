package com.checkout.components.card.operations.tokenisation.network.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jt\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0019\u001a\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "", "", "type", AttributeType.NUMBER, "", "expiryMonth", "expiryYear", Keys.KEY_NAME, "cvv", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", AttributeType.PHONE, "Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "consumerWallet", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;)Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "c", "I", "getExpiryMonth", "()I", "getExpiryMonth$annotations", "()V", d.d, "getExpiryYear", "getExpiryYear$annotations", "g", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress$annotations", "i", "Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "getConsumerWallet", "()Lcom/checkout/components/card/operations/tokenisation/network/model/ConsumerWallet;", "getConsumerWallet$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class TokenRequest {
    public final String a;
    public final String b;

    /* renamed from: c, reason: from kotlin metadata */
    public final int expiryMonth;

    /* renamed from: d, reason: from kotlin metadata */
    public final int expiryYear;
    public final String e;
    public final String f;

    /* renamed from: g, reason: from kotlin metadata */
    public final BillingAddressNetworkEntity billingAddress;
    public final PhoneNetworkEntity h;

    /* renamed from: i, reason: from kotlin metadata */
    public final ConsumerWallet consumerWallet;

    public /* synthetic */ TokenRequest(String str, String str2, int i, int i2, String str3, String str4, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, ConsumerWallet consumerWallet, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : billingAddressNetworkEntity, (i3 & 128) != 0 ? null : phoneNetworkEntity, (i3 & 256) != 0 ? null : consumerWallet);
    }

    public final TokenRequest copy(String type, String number, @zca(name = "expiry_month") int expiryMonth, @zca(name = "expiry_year") int expiryYear, String name, String cvv, @zca(name = "billing_address") BillingAddressNetworkEntity billingAddress, PhoneNetworkEntity phone, @zca(name = "consumer_wallet") ConsumerWallet consumerWallet) {
        type.getClass();
        number.getClass();
        return new TokenRequest(type, number, expiryMonth, expiryYear, name, cvv, billingAddress, phone, consumerWallet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenRequest)) {
            return false;
        }
        TokenRequest tokenRequest = (TokenRequest) obj;
        if (Intrinsics.areEqual(this.a, tokenRequest.a) && Intrinsics.areEqual(this.b, tokenRequest.b) && this.expiryMonth == tokenRequest.expiryMonth && this.expiryYear == tokenRequest.expiryYear && Intrinsics.areEqual(this.e, tokenRequest.e) && Intrinsics.areEqual(this.f, tokenRequest.f) && Intrinsics.areEqual(this.billingAddress, tokenRequest.billingAddress) && Intrinsics.areEqual(this.h, tokenRequest.h) && Intrinsics.areEqual(this.consumerWallet, tokenRequest.consumerWallet)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int b = woa.b(this.expiryYear, woa.b(this.expiryMonth, hdi.e(this.a.hashCode() * 31, 31, this.b), 31), 31);
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        if (billingAddressNetworkEntity == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = billingAddressNetworkEntity.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.h;
        if (phoneNetworkEntity == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = phoneNetworkEntity.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        ConsumerWallet consumerWallet = this.consumerWallet;
        if (consumerWallet != null) {
            i = consumerWallet.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("TokenRequest(type=", this.a, ", number=", this.b, ", expiryMonth=");
        k84.i(this.expiryMonth, this.expiryYear, ", expiryYear=", ", name=", r);
        k84.q(r, this.e, ", cvv=", this.f, ", billingAddress=");
        r.append(this.billingAddress);
        r.append(", phone=");
        r.append(this.h);
        r.append(", consumerWallet=");
        r.append(this.consumerWallet);
        r.append(")");
        return r.toString();
    }

    @zca(name = "billing_address")
    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    @zca(name = "consumer_wallet")
    public static /* synthetic */ void getConsumerWallet$annotations() {
    }

    @zca(name = "expiry_month")
    public static /* synthetic */ void getExpiryMonth$annotations() {
    }

    @zca(name = "expiry_year")
    public static /* synthetic */ void getExpiryYear$annotations() {
    }

    public TokenRequest(String str, String str2, @zca(name = "expiry_month") int i, @zca(name = "expiry_year") int i2, String str3, String str4, @zca(name = "billing_address") BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, @zca(name = "consumer_wallet") ConsumerWallet consumerWallet) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.e = str3;
        this.f = str4;
        this.billingAddress = billingAddressNetworkEntity;
        this.h = phoneNetworkEntity;
        this.consumerWallet = consumerWallet;
    }
}
