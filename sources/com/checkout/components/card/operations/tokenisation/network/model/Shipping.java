package com.checkout.components.card.operations.tokenisation.network.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.zca;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "", "", "firstName", "lastName", "companyName", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", AttributeType.PHONE, "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", PlaceTypes.ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;)Lcom/checkout/components/card/operations/tokenisation/network/model/Shipping;", "a", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "getFirstName$annotations", "()V", "b", "getLastName", "getLastName$annotations", "c", "getCompanyName", "getCompanyName$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class Shipping {

    /* renamed from: a, reason: from kotlin metadata */
    public final String firstName;

    /* renamed from: b, reason: from kotlin metadata */
    public final String lastName;

    /* renamed from: c, reason: from kotlin metadata */
    public final String companyName;
    public final PhoneNetworkEntity d;
    public final BillingAddressNetworkEntity e;

    public /* synthetic */ Shipping(String str, String str2, String str3, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, phoneNetworkEntity, billingAddressNetworkEntity);
    }

    public final Shipping copy(@zca(name = "first_name") String firstName, @zca(name = "last_name") String lastName, @zca(name = "company_name") String companyName, PhoneNetworkEntity phone, BillingAddressNetworkEntity address) {
        return new Shipping(firstName, lastName, companyName, phone, address);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shipping)) {
            return false;
        }
        Shipping shipping = (Shipping) obj;
        if (Intrinsics.areEqual(this.firstName, shipping.firstName) && Intrinsics.areEqual(this.lastName, shipping.lastName) && Intrinsics.areEqual(this.companyName, shipping.companyName) && Intrinsics.areEqual(this.d, shipping.d) && Intrinsics.areEqual(this.e, shipping.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
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
        String str3 = this.companyName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.d;
        if (phoneNetworkEntity == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = phoneNetworkEntity.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.e;
        if (billingAddressNetworkEntity != null) {
            i = billingAddressNetworkEntity.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("Shipping(firstName=", this.firstName, ", lastName=", this.lastName, ", companyName=");
        r.append(this.companyName);
        r.append(", phone=");
        r.append(this.d);
        r.append(", address=");
        r.append(this.e);
        r.append(")");
        return r.toString();
    }

    public Shipping(@zca(name = "first_name") String str, @zca(name = "last_name") String str2, @zca(name = "company_name") String str3, PhoneNetworkEntity phoneNetworkEntity, BillingAddressNetworkEntity billingAddressNetworkEntity) {
        this.firstName = str;
        this.lastName = str2;
        this.companyName = str3;
        this.d = phoneNetworkEntity;
        this.e = billingAddressNetworkEntity;
    }

    @zca(name = "company_name")
    public static /* synthetic */ void getCompanyName$annotations() {
    }

    @zca(name = "first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @zca(name = "last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }
}
