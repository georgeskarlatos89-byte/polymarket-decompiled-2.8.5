package com.checkout.components.interfaces.model.contact;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Name;", "Landroid/os/Parcelable;", "", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/Name;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getLastName", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Name implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Name> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final String firstName;

    /* renamed from: b, reason: from kotlin metadata */
    private final String lastName;

    public Name(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.firstName = str;
        this.lastName = str2;
    }

    public static /* synthetic */ Name copy$default(Name name, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = name.firstName;
        }
        if ((i & 2) != 0) {
            str2 = name.lastName;
        }
        return name.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final Name copy(String firstName, String lastName) {
        firstName.getClass();
        lastName.getClass();
        return new Name(firstName, lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Name)) {
            return false;
        }
        Name name = (Name) other;
        if (Intrinsics.areEqual(this.firstName, name.firstName) && Intrinsics.areEqual(this.lastName, name.lastName)) {
            return true;
        }
        return false;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final int hashCode() {
        return this.lastName.hashCode() + (this.firstName.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("Name(firstName=", this.firstName, ", lastName=", this.lastName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Name> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Name createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Name(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Name[] newArray(int i) {
            return new Name[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Name[] newArray(int i) {
            return new Name[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Name createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
