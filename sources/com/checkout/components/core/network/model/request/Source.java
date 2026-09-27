package com.checkout.components.core.network.model.request;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/core/network/model/request/Source;", "", "", "token", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", AttributeType.PHONE, "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;)V", "copy", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;)Lcom/checkout/components/core/network/model/request/Source;", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getToken$annotations", "()V", "b", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress$annotations", "c", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone$annotations", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class Source {

    /* renamed from: a, reason: from kotlin metadata */
    public final String token;

    /* renamed from: b, reason: from kotlin metadata */
    public final BillingAddressNetworkEntity billingAddress;

    /* renamed from: c, reason: from kotlin metadata */
    public final PhoneNetworkEntity phone;

    public /* synthetic */ Source(String str, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : billingAddressNetworkEntity, (i & 4) != 0 ? null : phoneNetworkEntity);
    }

    public final Source copy(@zca(name = "token") String token, @zca(name = "billing_address") BillingAddressNetworkEntity billingAddress, @zca(name = "phone") PhoneNetworkEntity phone) {
        token.getClass();
        return new Source(token, billingAddress, phone);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        if (Intrinsics.areEqual(this.token, source.token) && Intrinsics.areEqual(this.billingAddress, source.billingAddress) && Intrinsics.areEqual(this.phone, source.phone)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.token.hashCode() * 31;
        int i = 0;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        if (billingAddressNetworkEntity == null) {
            hashCode = 0;
        } else {
            hashCode = billingAddressNetworkEntity.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        if (phoneNetworkEntity != null) {
            i = phoneNetworkEntity.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Source(token=" + this.token + ", billingAddress=" + this.billingAddress + ", phone=" + this.phone + ")";
    }

    public Source(@zca(name = "token") String str, @zca(name = "billing_address") BillingAddressNetworkEntity billingAddressNetworkEntity, @zca(name = "phone") PhoneNetworkEntity phoneNetworkEntity) {
        str.getClass();
        this.token = str;
        this.billingAddress = billingAddressNetworkEntity;
        this.phone = phoneNetworkEntity;
    }

    @zca(name = "billing_address")
    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    @zca(name = AttributeType.PHONE)
    public static /* synthetic */ void getPhone$annotations() {
    }

    @zca(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }
}
