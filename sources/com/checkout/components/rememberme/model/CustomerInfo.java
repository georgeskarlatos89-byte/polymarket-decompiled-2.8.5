package com.checkout.components.rememberme.model;

import com.checkout.components.interfaces.model.contact.Country;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/rememberme/model/CustomerInfo;", "", "email", "", "phoneNumber", "phoneCountry", "Lcom/checkout/components/interfaces/model/contact/Country;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/contact/Country;)V", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "getPhoneCountry", "()Lcom/checkout/components/interfaces/model/contact/Country;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CustomerInfo {
    public static final int $stable = 0;
    private final String email;
    private final Country phoneCountry;
    private final String phoneNumber;

    public CustomerInfo(String str, String str2, Country country) {
        this.email = str;
        this.phoneNumber = str2;
        this.phoneCountry = country;
    }

    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, Country country, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerInfo.email;
        }
        if ((i & 2) != 0) {
            str2 = customerInfo.phoneNumber;
        }
        if ((i & 4) != 0) {
            country = customerInfo.phoneCountry;
        }
        return customerInfo.copy(str, str2, country);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final Country getPhoneCountry() {
        return this.phoneCountry;
    }

    public final CustomerInfo copy(String email, String phoneNumber, Country phoneCountry) {
        return new CustomerInfo(email, phoneNumber, phoneCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerInfo)) {
            return false;
        }
        CustomerInfo customerInfo = (CustomerInfo) other;
        if (Intrinsics.areEqual(this.email, customerInfo.email) && Intrinsics.areEqual(this.phoneNumber, customerInfo.phoneNumber) && this.phoneCountry == customerInfo.phoneCountry) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Country getPhoneCountry() {
        return this.phoneCountry;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.email;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.phoneNumber;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Country country = this.phoneCountry;
        if (country != null) {
            i = country.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.email;
        String str2 = this.phoneNumber;
        Country country = this.phoneCountry;
        StringBuilder r = m51.r("CustomerInfo(email=", str, ", phoneNumber=", str2, ", phoneCountry=");
        r.append(country);
        r.append(")");
        return r.toString();
    }
}
