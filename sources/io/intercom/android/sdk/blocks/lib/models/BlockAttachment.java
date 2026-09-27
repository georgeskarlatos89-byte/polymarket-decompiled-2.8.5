package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class BlockAttachment implements Parcelable {
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new Parcelable.Creator<BlockAttachment>() { // from class: io.intercom.android.sdk.blocks.lib.models.BlockAttachment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment createFromParcel(Parcel parcel) {
            return new BlockAttachment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BlockAttachment[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment[] newArray(int i) {
            return new BlockAttachment[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BlockAttachment createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final String contentType;
    private final String humanFileSize;
    private final long id;
    private final String name;
    private final long size;
    private final String url;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String contentType;
        String humanFileSize;
        long id;
        String name;
        long size;
        String url;

        public BlockAttachment build() {
            return new BlockAttachment(this);
        }

        public Builder withContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder withHumanFileSize(String str) {
            this.humanFileSize = str;
            return this;
        }

        public Builder withId(long j) {
            this.id = j;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withSize(long j) {
            this.size = j;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public BlockAttachment(Builder builder) {
        String str = builder.name;
        this.name = str == null ? "" : str;
        String str2 = builder.url;
        this.url = str2 == null ? "" : str2;
        String str3 = builder.contentType;
        this.contentType = str3 == null ? "" : str3;
        String str4 = builder.humanFileSize;
        this.humanFileSize = str4 != null ? str4 : "";
        this.id = builder.id;
        this.size = builder.size;
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
            BlockAttachment blockAttachment = (BlockAttachment) obj;
            if (this.size != blockAttachment.size || this.id != blockAttachment.id) {
                return false;
            }
            String str = this.name;
            String str2 = blockAttachment.name;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.url;
            String str4 = blockAttachment.url;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.humanFileSize;
            String str6 = blockAttachment.humanFileSize;
            if (str5 == null ? str6 == null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.contentType;
            String str8 = blockAttachment.contentType;
            if (str7 != null) {
                return str7.equals(str8);
            }
            if (str8 == null) {
                return true;
            }
        }
        return false;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
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
        String str2 = this.url;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.contentType;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.humanFileSize;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        int i8 = (i7 + i4) * 31;
        long j = this.size;
        int i9 = (i8 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.id;
        return i9 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public Builder toBuilder() {
        return new Builder().withName(this.name).withUrl(this.url).withContentType(this.contentType).withHumanFileSize(this.humanFileSize).withId(this.id).withSize(this.size);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeString(this.humanFileSize);
        parcel.writeLong(this.id);
        parcel.writeLong(this.size);
    }

    public BlockAttachment() {
        this(new Builder());
    }

    public BlockAttachment(Parcel parcel) {
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.contentType = parcel.readString();
        this.humanFileSize = parcel.readString();
        this.id = parcel.readLong();
        this.size = parcel.readLong();
    }
}
