package io.intercom.android.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.hdi;
import defpackage.m51;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010 \u001a\u00020\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÇ\u0001J\b\u0010-\u001a\u00020\nH\u0007J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u000100H×\u0003J\t\u00101\u001a\u00020\nH×\u0001J\t\u00102\u001a\u00020\u0003H×\u0001J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00068"}, d2 = {"Lio/intercom/android/sdk/GalleryImage;", "Landroid/os/Parcelable;", "fileName", "", "mimeType", "uri", "Landroid/net/Uri;", "previewPath", "attribution", "imageWidth", "", "imageHeight", "fileSize", "isGif", "", "isVideo", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIIZZLjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getMimeType", "getUri", "()Landroid/net/Uri;", "getPreviewPath", "getAttribution", "getImageWidth", "()I", "getImageHeight", "getFileSize", "()Z", "getDuration", "getImageWidthXHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GalleryImage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GalleryImage> CREATOR = new Creator();
    private final String attribution;
    private final String duration;
    private final String fileName;
    private final int fileSize;
    private final int imageHeight;
    private final int imageWidth;
    private final boolean isGif;
    private final boolean isVideo;
    private final String mimeType;
    private final String previewPath;
    private final Uri uri;

    public /* synthetic */ GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? Uri.EMPTY : uri, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? false : z, (i4 & Barcode.FORMAT_UPC_A) != 0 ? false : z2, (i4 & Barcode.FORMAT_UPC_E) != 0 ? "" : str5);
    }

    public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = galleryImage.fileName;
        }
        if ((i4 & 2) != 0) {
            str2 = galleryImage.mimeType;
        }
        if ((i4 & 4) != 0) {
            uri = galleryImage.uri;
        }
        if ((i4 & 8) != 0) {
            str3 = galleryImage.previewPath;
        }
        if ((i4 & 16) != 0) {
            str4 = galleryImage.attribution;
        }
        if ((i4 & 32) != 0) {
            i = galleryImage.imageWidth;
        }
        if ((i4 & 64) != 0) {
            i2 = galleryImage.imageHeight;
        }
        if ((i4 & 128) != 0) {
            i3 = galleryImage.fileSize;
        }
        if ((i4 & 256) != 0) {
            z = galleryImage.isGif;
        }
        if ((i4 & Barcode.FORMAT_UPC_A) != 0) {
            z2 = galleryImage.isVideo;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            str5 = galleryImage.duration;
        }
        boolean z3 = z2;
        String str6 = str5;
        int i5 = i3;
        boolean z4 = z;
        int i6 = i;
        int i7 = i2;
        String str7 = str4;
        Uri uri2 = uri;
        return galleryImage.copy(str, str2, uri2, str3, str7, i6, i7, i5, z4, z3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPreviewPath() {
        return this.previewPath;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAttribution() {
        return this.attribution;
    }

    /* renamed from: component6, reason: from getter */
    public final int getImageWidth() {
        return this.imageWidth;
    }

    /* renamed from: component7, reason: from getter */
    public final int getImageHeight() {
        return this.imageHeight;
    }

    /* renamed from: component8, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsGif() {
        return this.isGif;
    }

    public final GalleryImage copy(String fileName, String mimeType, Uri uri, String previewPath, String attribution, int imageWidth, int imageHeight, int fileSize, boolean isGif, boolean isVideo, String duration) {
        fileName.getClass();
        mimeType.getClass();
        uri.getClass();
        previewPath.getClass();
        attribution.getClass();
        duration.getClass();
        return new GalleryImage(fileName, mimeType, uri, previewPath, attribution, imageWidth, imageHeight, fileSize, isGif, isVideo, duration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryImage)) {
            return false;
        }
        GalleryImage galleryImage = (GalleryImage) other;
        if (Intrinsics.areEqual(this.fileName, galleryImage.fileName) && Intrinsics.areEqual(this.mimeType, galleryImage.mimeType) && Intrinsics.areEqual(this.uri, galleryImage.uri) && Intrinsics.areEqual(this.previewPath, galleryImage.previewPath) && Intrinsics.areEqual(this.attribution, galleryImage.attribution) && this.imageWidth == galleryImage.imageWidth && this.imageHeight == galleryImage.imageHeight && this.fileSize == galleryImage.fileSize && this.isGif == galleryImage.isGif && this.isVideo == galleryImage.isVideo && Intrinsics.areEqual(this.duration, galleryImage.duration)) {
            return true;
        }
        return false;
    }

    public final String getAttribution() {
        return this.attribution;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getImageWidthXHeight() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.imageWidth);
        sb.append('x');
        sb.append(this.imageHeight);
        return sb.toString();
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPreviewPath() {
        return this.previewPath;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.duration.hashCode() + hdi.g(hdi.g(woa.b(this.fileSize, woa.b(this.imageHeight, woa.b(this.imageWidth, hdi.e(hdi.e((this.uri.hashCode() + hdi.e(this.fileName.hashCode() * 31, 31, this.mimeType)) * 31, 31, this.previewPath), 31, this.attribution), 31), 31), 31), 31, this.isGif), 31, this.isVideo);
    }

    public final boolean isGif() {
        return this.isGif;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GalleryImage(fileName=");
        sb.append(this.fileName);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", previewPath=");
        sb.append(this.previewPath);
        sb.append(", attribution=");
        sb.append(this.attribution);
        sb.append(", imageWidth=");
        sb.append(this.imageWidth);
        sb.append(", imageHeight=");
        sb.append(this.imageHeight);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", isGif=");
        sb.append(this.isGif);
        sb.append(", isVideo=");
        sb.append(this.isVideo);
        sb.append(", duration=");
        return m51.m(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.fileName);
        dest.writeString(this.mimeType);
        dest.writeParcelable(this.uri, flags);
        dest.writeString(this.previewPath);
        dest.writeString(this.attribution);
        dest.writeInt(this.imageWidth);
        dest.writeInt(this.imageHeight);
        dest.writeInt(this.fileSize);
        dest.writeInt(this.isGif ? 1 : 0);
        dest.writeInt(this.isVideo ? 1 : 0);
        dest.writeString(this.duration);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<GalleryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage createFromParcel(Parcel parcel) {
            boolean z;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(GalleryImage.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            boolean z2 = false;
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new GalleryImage(readString, readString2, uri, readString3, readString4, readInt, readInt2, readInt3, z2, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GalleryImage[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GalleryImage[] newArray(int i) {
            return new GalleryImage[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GalleryImage createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str) {
        this(str, null, null, null, null, 0, 0, 0, false, false, null, 2046, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2) {
        this(str, str2, null, null, null, 0, 0, 0, false, false, null, 2044, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri) {
        this(str, str2, uri, null, null, 0, 0, 0, false, false, null, 2040, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3) {
        this(str, str2, uri, str3, null, 0, 0, 0, false, false, null, 2032, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4) {
        this(str, str2, uri, str3, str4, 0, 0, 0, false, false, null, 2016, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i) {
        this(str, str2, uri, str3, str4, i, 0, 0, false, false, null, 1984, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2) {
        this(str, str2, uri, str3, str4, i, i2, 0, false, false, null, 1920, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3) {
        this(str, str2, uri, str3, str4, i, i2, i3, false, false, null, 1792, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z) {
        this(str, str2, uri, str3, str4, i, i2, i3, z, false, null, 1536, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this(str, str2, uri, str3, str4, i, i2, i3, z, z2, null, Barcode.FORMAT_UPC_E, null);
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
    }

    public GalleryImage(String str, String str2, Uri uri, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, String str5) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.fileName = str;
        this.mimeType = str2;
        this.uri = uri;
        this.previewPath = str3;
        this.attribution = str4;
        this.imageWidth = i;
        this.imageHeight = i2;
        this.fileSize = i3;
        this.isGif = z;
        this.isVideo = z2;
        this.duration = str5;
    }

    public GalleryImage() {
        this(null, null, null, null, null, 0, 0, 0, false, false, null, 2047, null);
    }
}
