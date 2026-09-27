package com.checkout.components.interfaces.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hdi;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/model/Phone;", "Landroid/os/Parcelable;", "", "countryCode", AttributeType.NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/Phone;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCountryCode", "b", "getNumber", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Phone implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Phone> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final String countryCode;

    /* renamed from: b, reason: from kotlin metadata */
    private final String number;

    public Phone(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.countryCode = str;
        this.number = str2;
    }

    public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = phone.number;
        }
        return phone.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final Phone copy(String countryCode, String number) {
        countryCode.getClass();
        number.getClass();
        return new Phone(countryCode, number);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) other;
        if (Intrinsics.areEqual(this.countryCode, phone.countryCode) && Intrinsics.areEqual(this.number, phone.number)) {
            return true;
        }
        return false;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getNumber() {
        return this.number;
    }

    public final int hashCode() {
        return this.number.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("Phone(countryCode=", this.countryCode, ", number=", this.number, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.countryCode);
        dest.writeString(this.number);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Phone> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Phone createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Phone(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Phone[] newArray(int i) {
            return new Phone[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Phone[] newArray(int i) {
            return new Phone[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Phone createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
