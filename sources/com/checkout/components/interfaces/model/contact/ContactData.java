package com.checkout.components.interfaces.model.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/ContactData;", "Landroid/os/Parcelable;", "Lcom/checkout/components/interfaces/model/contact/Address;", PlaceTypes.ADDRESS, "Lcom/checkout/components/interfaces/model/contact/Phone;", AttributeType.PHONE, "Lcom/checkout/components/interfaces/model/contact/Name;", Keys.KEY_NAME, "", "email", "<init>", "(Lcom/checkout/components/interfaces/model/contact/Address;Lcom/checkout/components/interfaces/model/contact/Phone;Lcom/checkout/components/interfaces/model/contact/Name;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/checkout/components/interfaces/model/contact/Address;", "component2", "()Lcom/checkout/components/interfaces/model/contact/Phone;", "component3", "()Lcom/checkout/components/interfaces/model/contact/Name;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/checkout/components/interfaces/model/contact/Address;Lcom/checkout/components/interfaces/model/contact/Phone;Lcom/checkout/components/interfaces/model/contact/Name;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/ContactData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/contact/Address;", "getAddress", "b", "Lcom/checkout/components/interfaces/model/contact/Phone;", "getPhone", "c", "Lcom/checkout/components/interfaces/model/contact/Name;", "getName", d.d, "Ljava/lang/String;", "getEmail", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContactData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ContactData> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final Address address;

    /* renamed from: b, reason: from kotlin metadata */
    private final Phone phone;

    /* renamed from: c, reason: from kotlin metadata */
    private final Name name;

    /* renamed from: d, reason: from kotlin metadata */
    private final String email;

    public ContactData(Address address, Phone phone, Name name, String str) {
        address.getClass();
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.email = str;
    }

    public static ContactData copy$default(ContactData contactData, Address address, Phone phone, Name name, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            address = contactData.address;
        }
        if ((i & 2) != 0) {
            phone = contactData.phone;
        }
        if ((i & 4) != 0) {
            name = contactData.name;
        }
        if ((i & 8) != 0) {
            str = contactData.email;
        }
        contactData.getClass();
        address.getClass();
        return new ContactData(address, phone, name, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final Phone getPhone() {
        return this.phone;
    }

    /* renamed from: component3, reason: from getter */
    public final Name getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final ContactData copy(Address address, Phone phone, Name name, String email) {
        address.getClass();
        return new ContactData(address, phone, name, email);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactData)) {
            return false;
        }
        ContactData contactData = (ContactData) other;
        if (Intrinsics.areEqual(this.address, contactData.address) && Intrinsics.areEqual(this.phone, contactData.phone) && Intrinsics.areEqual(this.name, contactData.name) && Intrinsics.areEqual(this.email, contactData.email)) {
            return true;
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Name getName() {
        return this.name;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.address.hashCode() * 31;
        Phone phone = this.phone;
        int i = 0;
        if (phone == null) {
            hashCode = 0;
        } else {
            hashCode = phone.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Name name = this.name;
        if (name == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = name.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.email;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "ContactData(address=" + this.address + ", phone=" + this.phone + ", name=" + this.name + ", email=" + this.email + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        this.address.writeToParcel(dest, flags);
        Phone phone = this.phone;
        if (phone == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            phone.writeToParcel(dest, flags);
        }
        Name name = this.name;
        if (name == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            name.writeToParcel(dest, flags);
        }
        dest.writeString(this.email);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ContactData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactData createFromParcel(Parcel parcel) {
            Phone createFromParcel;
            parcel.getClass();
            Address createFromParcel2 = Address.CREATOR.createFromParcel(parcel);
            Name name = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = Phone.CREATOR.createFromParcel(parcel);
            }
            Phone phone = createFromParcel;
            if (parcel.readInt() != 0) {
                name = Name.CREATOR.createFromParcel(parcel);
            }
            return new ContactData(createFromParcel2, phone, name, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactData[] newArray(int i) {
            return new ContactData[i];
        }

        @Override // android.os.Parcelable.Creator
        public final ContactData[] newArray(int i) {
            return new ContactData[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ContactData createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
