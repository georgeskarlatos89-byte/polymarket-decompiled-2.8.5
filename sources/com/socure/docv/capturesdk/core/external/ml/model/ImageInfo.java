package com.socure.docv.capturesdk.core.external.ml.model;

import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/ImageInfo;", "", "imageType", "", "imageRes", "Lcom/socure/docv/capturesdk/core/external/ml/model/ImageRes;", "error", "<init>", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/core/external/ml/model/ImageRes;Ljava/lang/String;)V", "getImageType", "()Ljava/lang/String;", "getImageRes", "()Lcom/socure/docv/capturesdk/core/external/ml/model/ImageRes;", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageInfo {
    public static final int $stable = 0;
    private final String error;
    private final ImageRes imageRes;
    private final String imageType;

    public ImageInfo(String str, ImageRes imageRes, String str2) {
        str.getClass();
        this.imageType = str;
        this.imageRes = imageRes;
        this.error = str2;
    }

    public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, String str, ImageRes imageRes, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageInfo.imageType;
        }
        if ((i & 2) != 0) {
            imageRes = imageInfo.imageRes;
        }
        if ((i & 4) != 0) {
            str2 = imageInfo.error;
        }
        return imageInfo.copy(str, imageRes, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageType() {
        return this.imageType;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageRes getImageRes() {
        return this.imageRes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ImageInfo copy(String imageType, ImageRes imageRes, String error) {
        imageType.getClass();
        return new ImageInfo(imageType, imageRes, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) other;
        if (Intrinsics.areEqual(this.imageType, imageInfo.imageType) && Intrinsics.areEqual(this.imageRes, imageInfo.imageRes) && Intrinsics.areEqual(this.error, imageInfo.error)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final ImageRes getImageRes() {
        return this.imageRes;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.imageType.hashCode() * 31;
        ImageRes imageRes = this.imageRes;
        int i = 0;
        if (imageRes == null) {
            hashCode = 0;
        } else {
            hashCode = imageRes.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.error;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.imageType;
        ImageRes imageRes = this.imageRes;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("ImageInfo(imageType=");
        sb.append(str);
        sb.append(", imageRes=");
        sb.append(imageRes);
        sb.append(", error=");
        return woa.r(sb, str2, ")");
    }

    public /* synthetic */ ImageInfo(String str, ImageRes imageRes, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, imageRes, (i & 4) != 0 ? null : str2);
    }
}
