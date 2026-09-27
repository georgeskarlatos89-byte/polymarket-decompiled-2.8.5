package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: io.intercom.android.sdk.blocks.lib.models.Image.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Image[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image[] newArray(int i) {
            return new Image[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Image createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final String alt;
    private final String attribution;
    private final int height;
    private final String previewUrl;
    private final String url;
    private final int width;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String alt;
        String attribution;
        int height;
        String previewUrl;
        String url;
        int width;

        public Image build() {
            return new Image(this, null);
        }

        public Builder withAlt(String str) {
            this.alt = str;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i) {
            this.width = i;
            return this;
        }
    }

    private Image(Builder builder) {
        String str = builder.alt;
        this.alt = str == null ? "" : str;
        String str2 = builder.url;
        this.url = str2 == null ? "" : str2;
        String str3 = builder.previewUrl;
        this.previewUrl = str3 == null ? "" : str3;
        String str4 = builder.attribution;
        this.attribution = str4 != null ? str4 : "";
        this.width = builder.width;
        this.height = builder.height;
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
            Image image = (Image) obj;
            String str = this.alt;
            String str2 = image.alt;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.previewUrl;
            String str4 = image.previewUrl;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.attribution;
            String str6 = image.attribution;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            if (this.width != image.width || this.height != image.height) {
                return false;
            }
            String str7 = this.url;
            String str8 = image.url;
            if (str7 == null ? str8 == null : str7.equals(str8)) {
                return true;
            }
        }
        return false;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.alt;
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
        String str3 = this.previewUrl;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.attribution;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return ((((i7 + i4) * 31) + this.width) * 31) + this.height;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.attribution);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.alt);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public Image() {
        this(new Builder());
    }

    public /* synthetic */ Image(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public Image(Parcel parcel) {
        this.attribution = parcel.readString();
        this.previewUrl = parcel.readString();
        this.alt = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
