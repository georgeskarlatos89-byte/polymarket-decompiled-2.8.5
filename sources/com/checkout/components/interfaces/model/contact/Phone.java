package com.checkout.components.interfaces.model.contact;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Phone;", "Landroid/os/Parcelable;", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "", AttributeType.NUMBER, "<init>", "(Lcom/checkout/components/interfaces/model/contact/Country;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/checkout/components/interfaces/model/contact/Country;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/checkout/components/interfaces/model/contact/Country;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/Phone;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/contact/Country;", "getCountry", "b", "Ljava/lang/String;", "getNumber", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Phone implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Phone> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final Country country;

    /* renamed from: b, reason: from kotlin metadata */
    private final String number;

    public Phone(Country country, String str) {
        country.getClass();
        str.getClass();
        this.country = country;
        this.number = str;
    }

    public static /* synthetic */ Phone copy$default(Phone phone, Country country, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            country = phone.country;
        }
        if ((i & 2) != 0) {
            str = phone.number;
        }
        return phone.copy(country, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final Phone copy(Country country, String number) {
        country.getClass();
        number.getClass();
        return new Phone(country, number);
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
        if (this.country == phone.country && Intrinsics.areEqual(this.number, phone.number)) {
            return true;
        }
        return false;
    }

    public final Country getCountry() {
        return this.country;
    }

    public final String getNumber() {
        return this.number;
    }

    public final int hashCode() {
        return this.number.hashCode() + (this.country.hashCode() * 31);
    }

    public final String toString() {
        return "Phone(country=" + this.country + ", number=" + this.number + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        Country country = this.country;
        country.getClass();
        dest.getClass();
        dest.writeString(country.name());
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
            return new Phone(Country.CREATOR.createFromParcel(parcel), parcel.readString());
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
