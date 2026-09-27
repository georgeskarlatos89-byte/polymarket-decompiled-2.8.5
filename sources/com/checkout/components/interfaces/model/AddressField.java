package com.checkout.components.interfaces.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.m51;
import defpackage.ug7;
import defpackage.wg7;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u000b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078G¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\n\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField;", "Landroid/os/Parcelable;", "", "a", "Z", "isOptional", "()Z", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "b", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "getName", "()Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", Keys.KEY_NAME, "", "c", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Companion", "Country", "AddressLine1", "AddressLine2", "City", "Zip", "State", "Email", "FirstName", "LastName", "Phone", "Lcom/checkout/components/interfaces/model/AddressField$AddressLine1;", "Lcom/checkout/components/interfaces/model/AddressField$AddressLine2;", "Lcom/checkout/components/interfaces/model/AddressField$City;", "Lcom/checkout/components/interfaces/model/AddressField$Country;", "Lcom/checkout/components/interfaces/model/AddressField$Email;", "Lcom/checkout/components/interfaces/model/AddressField$FirstName;", "Lcom/checkout/components/interfaces/model/AddressField$LastName;", "Lcom/checkout/components/interfaces/model/AddressField$Phone;", "Lcom/checkout/components/interfaces/model/AddressField$State;", "Lcom/checkout/components/interfaces/model/AddressField$Zip;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AddressField implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List d;
    private static final List e;

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean isOptional;

    /* renamed from: b, reason: from kotlin metadata */
    private final Companion.Name name;

    /* renamed from: c, reason: from kotlin metadata */
    private final String identifier;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Companion;", "", "", "Lcom/checkout/components/interfaces/model/AddressField;", "billing", "Ljava/util/List;", "getBilling", "()Ljava/util/List;", "shipping", "getShipping", "Name", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "", "Country", "AddressLine1", "AddressLine2", "City", "Zip", "State", "Email", "FirstName", "LastName", "Phone", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Name {
            public static final Name AddressLine1;
            public static final Name AddressLine2;
            public static final Name City;
            public static final Name Country;
            public static final Name Email;
            public static final Name FirstName;
            public static final Name LastName;
            public static final Name Phone;
            public static final Name State;
            public static final Name Zip;
            private static final /* synthetic */ Name[] a;
            private static final /* synthetic */ ug7 b;

            static {
                Name name = new Name("Country", 0);
                Country = name;
                Name name2 = new Name("AddressLine1", 1);
                AddressLine1 = name2;
                Name name3 = new Name("AddressLine2", 2);
                AddressLine2 = name3;
                Name name4 = new Name("City", 3);
                City = name4;
                Name name5 = new Name("Zip", 4);
                Zip = name5;
                Name name6 = new Name("State", 5);
                State = name6;
                Name name7 = new Name("Email", 6);
                Email = name7;
                Name name8 = new Name("FirstName", 7);
                FirstName = name8;
                Name name9 = new Name("LastName", 8);
                LastName = name9;
                Name name10 = new Name("Phone", 9);
                Phone = name10;
                Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10};
                a = nameArr;
                b = new wg7(nameArr);
            }

            private Name(String str, int i) {
            }

            public static ug7 getEntries() {
                return b;
            }

            public static Name valueOf(String str) {
                return (Name) Enum.valueOf(Name.class, str);
            }

            public static Name[] values() {
                return (Name[]) a.clone();
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final List<AddressField> getBilling() {
            return AddressField.access$getBilling$cp();
        }

        public final List<AddressField> getShipping() {
            return AddressField.access$getShipping$cp();
        }
    }

    static {
        Country country = Country.INSTANCE;
        d = CollectionsKt.listOf(country, new AddressLine1(false, 1, null), new AddressLine2(false, 1, null), new City(false, 1, null), new State(false, 1, null), new Zip(false, 1, null));
        e = CollectionsKt.listOf(new FirstName(false, 1, null), new LastName(false, 1, null), new Phone(false, 1, null), new Email(false, 1, null), country, new AddressLine1(false, 1, null), new AddressLine2(false, 1, null), new City(false, 1, null), new State(false, 1, null), new Zip(false, 1, null));
    }

    public AddressField(boolean z, Companion.Name name, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.isOptional = (i & 1) != 0 ? false : z;
        this.name = name;
        this.identifier = str;
    }

    public static final /* synthetic */ List access$getBilling$cp() {
        return d;
    }

    public static final /* synthetic */ List access$getShipping$cp() {
        return e;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Companion.Name getName() {
        return this.name;
    }

    /* renamed from: isOptional, reason: from getter */
    public boolean getIsOptional() {
        return this.isOptional;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$AddressLine1;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$AddressLine1;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class AddressLine1 extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AddressLine1> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public AddressLine1(boolean z) {
            super(z, Companion.Name.AddressLine1, "address_line_1_input", null);
            this.isOptional = z;
        }

        public static AddressLine1 copy$default(AddressLine1 addressLine1, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = addressLine1.isOptional;
            }
            addressLine1.getClass();
            return new AddressLine1(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final AddressLine1 copy(boolean isOptional) {
            return new AddressLine1(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AddressLine1) && this.isOptional == ((AddressLine1) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("AddressLine1(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<AddressLine1> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressLine1 createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new AddressLine1(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressLine1[] newArray(int i) {
                return new AddressLine1[i];
            }

            @Override // android.os.Parcelable.Creator
            public final AddressLine1[] newArray(int i) {
                return new AddressLine1[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AddressLine1 createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ AddressLine1(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public AddressLine1() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$AddressLine2;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$AddressLine2;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class AddressLine2 extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AddressLine2> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public AddressLine2(boolean z) {
            super(z, Companion.Name.AddressLine2, "address_line_2_input", null);
            this.isOptional = z;
        }

        public static AddressLine2 copy$default(AddressLine2 addressLine2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = addressLine2.isOptional;
            }
            addressLine2.getClass();
            return new AddressLine2(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final AddressLine2 copy(boolean isOptional) {
            return new AddressLine2(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AddressLine2) && this.isOptional == ((AddressLine2) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("AddressLine2(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<AddressLine2> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressLine2 createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new AddressLine2(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressLine2[] newArray(int i) {
                return new AddressLine2[i];
            }

            @Override // android.os.Parcelable.Creator
            public final AddressLine2[] newArray(int i) {
                return new AddressLine2[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AddressLine2 createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ AddressLine2(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public AddressLine2() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$City;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$City;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class City extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<City> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public City(boolean z) {
            super(z, Companion.Name.City, "city_input", null);
            this.isOptional = z;
        }

        public static City copy$default(City city, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = city.isOptional;
            }
            city.getClass();
            return new City(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final City copy(boolean isOptional) {
            return new City(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof City) && this.isOptional == ((City) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("City(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<City> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final City createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new City(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final City[] newArray(int i) {
                return new City[i];
            }

            @Override // android.os.Parcelable.Creator
            public final City[] newArray(int i) {
                return new City[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ City createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public City() {
            this(false, 1, null);
        }

        public /* synthetic */ City(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Country;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Country extends AddressField {
        public static final int $stable = 0;
        public static final Country INSTANCE = new Country();
        public static final Parcelable.Creator<Country> CREATOR = new Creator();

        private Country() {
            super(false, Companion.Name.Country, "country_selector", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other || (other instanceof Country)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 767723882;
        }

        public final String toString() {
            return "Country";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Country> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Country.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i) {
                return new Country[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i) {
                return new Country[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Country.INSTANCE;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Email;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$Email;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Email extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Email> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public Email(boolean z) {
            super(z, Companion.Name.Email, "email_input", null);
            this.isOptional = z;
        }

        public static Email copy$default(Email email, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = email.isOptional;
            }
            email.getClass();
            return new Email(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final Email copy(boolean isOptional) {
            return new Email(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Email) && this.isOptional == ((Email) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("Email(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Email> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Email createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new Email(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i) {
                return new Email[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i) {
                return new Email[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Email createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ Email(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public Email() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$FirstName;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$FirstName;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class FirstName extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FirstName> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public FirstName(boolean z) {
            super(z, Companion.Name.FirstName, "first_name_input", null);
            this.isOptional = z;
        }

        public static FirstName copy$default(FirstName firstName, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = firstName.isOptional;
            }
            firstName.getClass();
            return new FirstName(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final FirstName copy(boolean isOptional) {
            return new FirstName(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof FirstName) && this.isOptional == ((FirstName) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("FirstName(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<FirstName> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FirstName createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new FirstName(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FirstName[] newArray(int i) {
                return new FirstName[i];
            }

            @Override // android.os.Parcelable.Creator
            public final FirstName[] newArray(int i) {
                return new FirstName[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FirstName createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ FirstName(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public FirstName() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$LastName;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$LastName;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class LastName extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<LastName> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public LastName(boolean z) {
            super(z, Companion.Name.LastName, "last_name_input", null);
            this.isOptional = z;
        }

        public static LastName copy$default(LastName lastName, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = lastName.isOptional;
            }
            lastName.getClass();
            return new LastName(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final LastName copy(boolean isOptional) {
            return new LastName(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof LastName) && this.isOptional == ((LastName) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("LastName(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<LastName> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LastName createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new LastName(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LastName[] newArray(int i) {
                return new LastName[i];
            }

            @Override // android.os.Parcelable.Creator
            public final LastName[] newArray(int i) {
                return new LastName[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LastName createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ LastName(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public LastName() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Phone;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$Phone;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Phone extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public Phone(boolean z) {
            super(z, Companion.Name.Phone, "phone_input", null);
            this.isOptional = z;
        }

        public static Phone copy$default(Phone phone, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = phone.isOptional;
            }
            phone.getClass();
            return new Phone(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final Phone copy(boolean isOptional) {
            return new Phone(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Phone) && this.isOptional == ((Phone) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("Phone(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Phone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new Phone(z);
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

        public /* synthetic */ Phone(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public Phone() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$State;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/checkout/components/interfaces/model/AddressField$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class State extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        public State(boolean z) {
            super(z, Companion.Name.State, "county_province_input", null);
            this.isOptional = z;
        }

        public static State copy$default(State state, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = state.isOptional;
            }
            state.getClass();
            return new State(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final State copy(boolean isOptional) {
            return new State(isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof State) && this.isOptional == ((State) other).isOptional) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isOptional);
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return m51.l("State(isOptional=", ")", this.isOptional);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new State(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ State createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public /* synthetic */ State(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public State() {
            this(false, 1, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0004\u0010\u0012¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Zip;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "isNumberOnly", "<init>", "(ZZ)V", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/checkout/components/interfaces/model/AddressField$Zip;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "g", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Zip extends AddressField {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Zip> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        /* renamed from: g, reason: from kotlin metadata */
        private final boolean isNumberOnly;

        public Zip(boolean z, boolean z2) {
            super(z, Companion.Name.Zip, "zip_code_input", null);
            this.isOptional = z;
            this.isNumberOnly = z2;
        }

        public static Zip copy$default(Zip zip, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = zip.isOptional;
            }
            if ((i & 2) != 0) {
                z2 = zip.isNumberOnly;
            }
            zip.getClass();
            return new Zip(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNumberOnly() {
            return this.isNumberOnly;
        }

        public final Zip copy(boolean isOptional, boolean isNumberOnly) {
            return new Zip(isOptional, isNumberOnly);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Zip)) {
                return false;
            }
            Zip zip = (Zip) other;
            if (this.isOptional == zip.isOptional && this.isNumberOnly == zip.isNumberOnly) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isNumberOnly) + (Boolean.hashCode(this.isOptional) * 31);
        }

        public final boolean isNumberOnly() {
            return this.isNumberOnly;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final String toString() {
            return "Zip(isOptional=" + this.isOptional + ", isNumberOnly=" + this.isNumberOnly + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.isOptional ? 1 : 0);
            dest.writeInt(this.isNumberOnly ? 1 : 0);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Zip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Zip createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new Zip(z, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Zip[] newArray(int i) {
                return new Zip[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Zip[] newArray(int i) {
                return new Zip[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Zip createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }
        }

        public Zip(boolean z) {
            this(z, false);
        }

        public Zip(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, false);
        }
    }

    public AddressField(boolean z, Companion.Name name, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.isOptional = z;
        this.name = name;
        this.identifier = str;
    }
}
