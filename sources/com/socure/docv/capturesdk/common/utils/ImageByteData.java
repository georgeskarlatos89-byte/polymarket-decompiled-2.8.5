package com.socure.docv.capturesdk.common.utils;

import defpackage.k84;
import defpackage.m51;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006'"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ImageByteData;", "", "yBytes", "", "uBytes", "vBytes", "width", "", "height", "format", "uvPixelStride", "isValidFormat", "", "<init>", "([B[B[BIIIIZ)V", "getYBytes", "()[B", "getUBytes", "getVBytes", "getWidth", "()I", "getHeight", "getFormat", "getUvPixelStride", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageByteData {
    public static final int $stable = 8;
    private final int format;
    private final int height;
    private final boolean isValidFormat;
    private final byte[] uBytes;
    private final int uvPixelStride;
    private final byte[] vBytes;
    private final int width;
    private final byte[] yBytes;

    public ImageByteData(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, boolean z) {
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
        this.yBytes = bArr;
        this.uBytes = bArr2;
        this.vBytes = bArr3;
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.uvPixelStride = i4;
        this.isValidFormat = z;
    }

    public static /* synthetic */ ImageByteData copy$default(ImageByteData imageByteData, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bArr = imageByteData.yBytes;
        }
        if ((i5 & 2) != 0) {
            bArr2 = imageByteData.uBytes;
        }
        if ((i5 & 4) != 0) {
            bArr3 = imageByteData.vBytes;
        }
        if ((i5 & 8) != 0) {
            i = imageByteData.width;
        }
        if ((i5 & 16) != 0) {
            i2 = imageByteData.height;
        }
        if ((i5 & 32) != 0) {
            i3 = imageByteData.format;
        }
        if ((i5 & 64) != 0) {
            i4 = imageByteData.uvPixelStride;
        }
        if ((i5 & 128) != 0) {
            z = imageByteData.isValidFormat;
        }
        int i6 = i4;
        boolean z2 = z;
        int i7 = i2;
        int i8 = i3;
        return imageByteData.copy(bArr, bArr2, bArr3, i, i7, i8, i6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getYBytes() {
        return this.yBytes;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getUBytes() {
        return this.uBytes;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getVBytes() {
        return this.vBytes;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    /* renamed from: component7, reason: from getter */
    public final int getUvPixelStride() {
        return this.uvPixelStride;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsValidFormat() {
        return this.isValidFormat;
    }

    public final ImageByteData copy(byte[] yBytes, byte[] uBytes, byte[] vBytes, int width, int height, int format, int uvPixelStride, boolean isValidFormat) {
        yBytes.getClass();
        uBytes.getClass();
        vBytes.getClass();
        return new ImageByteData(yBytes, uBytes, vBytes, width, height, format, uvPixelStride, isValidFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageByteData)) {
            return false;
        }
        ImageByteData imageByteData = (ImageByteData) other;
        if (Intrinsics.areEqual(this.yBytes, imageByteData.yBytes) && Intrinsics.areEqual(this.uBytes, imageByteData.uBytes) && Intrinsics.areEqual(this.vBytes, imageByteData.vBytes) && this.width == imageByteData.width && this.height == imageByteData.height && this.format == imageByteData.format && this.uvPixelStride == imageByteData.uvPixelStride && this.isValidFormat == imageByteData.isValidFormat) {
            return true;
        }
        return false;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final byte[] getUBytes() {
        return this.uBytes;
    }

    public final int getUvPixelStride() {
        return this.uvPixelStride;
    }

    public final byte[] getVBytes() {
        return this.vBytes;
    }

    public final int getWidth() {
        return this.width;
    }

    public final byte[] getYBytes() {
        return this.yBytes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isValidFormat) + com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.uvPixelStride, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.format, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.height, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.width, (Arrays.hashCode(this.vBytes) + ((Arrays.hashCode(this.uBytes) + (Arrays.hashCode(this.yBytes) * 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public final boolean isValidFormat() {
        return this.isValidFormat;
    }

    public String toString() {
        String arrays = Arrays.toString(this.yBytes);
        String arrays2 = Arrays.toString(this.uBytes);
        String arrays3 = Arrays.toString(this.vBytes);
        int i = this.width;
        int i2 = this.height;
        int i3 = this.format;
        int i4 = this.uvPixelStride;
        boolean z = this.isValidFormat;
        StringBuilder r = m51.r("ImageByteData(yBytes=", arrays, ", uBytes=", arrays2, ", vBytes=");
        k84.l(i, arrays3, ", width=", ", height=", r);
        k84.i(i2, i3, ", format=", ", uvPixelStride=", r);
        r.append(i4);
        r.append(", isValidFormat=");
        r.append(z);
        r.append(")");
        return r.toString();
    }
}
