package com.checkout.components.rememberme.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.zca;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/rememberme/model/BillingAddress;", "", "", "firstName", "lastName", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", AttributeType.PHONE, "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", PlaceTypes.ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)Lcom/checkout/components/rememberme/model/BillingAddress;", "a", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "getFirstName$annotations", "()V", "b", "getLastName", "getLastName$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class BillingAddress {

    /* renamed from: a, reason: from kotlin metadata */
    public final String firstName;

    /* renamed from: b, reason: from kotlin metadata */
    public final String lastName;
    public final PhoneNetworkEntity c;
    public final BillingAddressNetworkEntity d;

    public BillingAddress(@zca(name = "first_name") String str, @zca(name = "last_name") String str2, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity) {
        this.firstName = str;
        this.lastName = str2;
        this.c = phoneNetworkEntity;
        this.d = billingAddressNetworkEntity;
    }

    public final BillingAddress copy(@zca(name = "first_name") String firstName, @zca(name = "last_name") String lastName, PhoneNetworkEntity phone, BillingAddressNetworkEntity address) {
        return new BillingAddress(firstName, lastName, phone, address);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        if (Intrinsics.areEqual(this.firstName, billingAddress.firstName) && Intrinsics.areEqual(this.lastName, billingAddress.lastName) && Intrinsics.areEqual(this.c, billingAddress.c) && Intrinsics.areEqual(this.d, billingAddress.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        String str = this.firstName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.lastName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.c;
        if (phoneNetworkEntity == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = phoneNetworkEntity.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.d;
        if (billingAddressNetworkEntity != null) {
            i = billingAddressNetworkEntity.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("BillingAddress(firstName=", this.firstName, ", lastName=", this.lastName, ", phone=");
        r.append(this.c);
        r.append(", address=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }

    @zca(name = "first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @zca(name = "last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }
}
