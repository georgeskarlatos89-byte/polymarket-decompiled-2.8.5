package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Author implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>() { // from class: io.intercom.android.sdk.blocks.lib.models.Author.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Author[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author[] newArray(int i) {
            return new Author[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Author createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final String avatar;
    private final String firstName;
    private final String lastName;
    private final String name;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String avatar;
        String firstName;
        String lastName;
        String name;

        public Author build() {
            return new Author(this, null);
        }

        public Builder withAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder withLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    private Author(Builder builder) {
        String str = builder.name;
        this.name = str == null ? "" : str;
        String str2 = builder.avatar;
        this.avatar = str2 == null ? "" : str2;
        String str3 = builder.firstName;
        this.firstName = str3 == null ? "" : str3;
        String str4 = builder.lastName;
        this.lastName = str4 != null ? str4 : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Author author = (Author) obj;
            String str = this.name;
            String str2 = author.name;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.firstName;
            String str4 = author.firstName;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.lastName;
            String str6 = author.lastName;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.avatar;
            String str8 = author.avatar;
            if (str7 == null ? str8 == null : str7.equals(str8)) {
                return true;
            }
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.name;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.firstName;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.lastName;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.avatar;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 + i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    public Author() {
        this(new Builder());
    }

    public /* synthetic */ Author(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public Author(Parcel parcel) {
        this.name = parcel.readString();
        this.avatar = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }
}
