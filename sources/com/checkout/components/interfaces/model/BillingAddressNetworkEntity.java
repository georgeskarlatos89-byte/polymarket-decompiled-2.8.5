package com.checkout.components.interfaces.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\f¨\u0006,"}, d2 = {"Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "", "", "addressLine1", "addressLine2", "city", "state", "zip", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddressLine1", "getAddressLine1$annotations", "()V", "b", "getAddressLine2", "getAddressLine2$annotations", "c", "getCity", d.d, "getState", "e", "getZip", "f", "getCountry", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class BillingAddressNetworkEntity {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final String addressLine1;

    /* renamed from: b, reason: from kotlin metadata */
    private final String addressLine2;

    /* renamed from: c, reason: from kotlin metadata */
    private final String city;

    /* renamed from: d, reason: from kotlin metadata */
    private final String state;

    /* renamed from: e, reason: from kotlin metadata */
    private final String zip;

    /* renamed from: f, reason: from kotlin metadata */
    private final String country;

    public /* synthetic */ BillingAddressNetworkEntity(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ BillingAddressNetworkEntity copy$default(BillingAddressNetworkEntity billingAddressNetworkEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingAddressNetworkEntity.addressLine1;
        }
        if ((i & 2) != 0) {
            str2 = billingAddressNetworkEntity.addressLine2;
        }
        if ((i & 4) != 0) {
            str3 = billingAddressNetworkEntity.city;
        }
        if ((i & 8) != 0) {
            str4 = billingAddressNetworkEntity.state;
        }
        if ((i & 16) != 0) {
            str5 = billingAddressNetworkEntity.zip;
        }
        if ((i & 32) != 0) {
            str6 = billingAddressNetworkEntity.country;
        }
        String str7 = str5;
        String str8 = str6;
        return billingAddressNetworkEntity.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final BillingAddressNetworkEntity copy(@zca(name = "address_line1") String addressLine1, @zca(name = "address_line2") String addressLine2, String city, String state, String zip, String country) {
        return new BillingAddressNetworkEntity(addressLine1, addressLine2, city, state, zip, country);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddressNetworkEntity)) {
            return false;
        }
        BillingAddressNetworkEntity billingAddressNetworkEntity = (BillingAddressNetworkEntity) other;
        if (Intrinsics.areEqual(this.addressLine1, billingAddressNetworkEntity.addressLine1) && Intrinsics.areEqual(this.addressLine2, billingAddressNetworkEntity.addressLine2) && Intrinsics.areEqual(this.city, billingAddressNetworkEntity.city) && Intrinsics.areEqual(this.state, billingAddressNetworkEntity.state) && Intrinsics.areEqual(this.zip, billingAddressNetworkEntity.zip) && Intrinsics.areEqual(this.country, billingAddressNetworkEntity.country)) {
            return true;
        }
        return false;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZip() {
        return this.zip;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.addressLine1;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.addressLine2;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.city;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.state;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.zip;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.country;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        String str = this.addressLine1;
        String str2 = this.addressLine2;
        String str3 = this.city;
        String str4 = this.state;
        String str5 = this.zip;
        String str6 = this.country;
        StringBuilder r = m51.r("BillingAddressNetworkEntity(addressLine1=", str, ", addressLine2=", str2, ", city=");
        k84.q(r, str3, ", state=", str4, ", zip=");
        return sv6.p(r, str5, ", country=", str6, ")");
    }

    @zca(name = "address_line1")
    public static /* synthetic */ void getAddressLine1$annotations() {
    }

    @zca(name = "address_line2")
    public static /* synthetic */ void getAddressLine2$annotations() {
    }

    public BillingAddressNetworkEntity(@zca(name = "address_line1") String str, @zca(name = "address_line2") String str2, String str3, String str4, String str5, String str6) {
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
        this.country = str6;
    }

    public BillingAddressNetworkEntity() {
        this(null, null, null, null, null, null, 63, null);
    }
}
