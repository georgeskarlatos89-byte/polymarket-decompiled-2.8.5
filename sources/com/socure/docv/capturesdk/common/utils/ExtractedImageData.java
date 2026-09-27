package com.socure.docv.capturesdk.common.utils;

import defpackage.hdi;
import defpackage.ix2;
import defpackage.m51;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "", "width", "", "height", "format", "planes", "", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData$PlaneData;", "isValidYuvFormat", "", "isValidJpegFormat", "rotationDegrees", "<init>", "(IIILjava/util/List;ZZI)V", "getWidth", "()I", "getHeight", "getFormat", "getPlanes", "()Ljava/util/List;", "()Z", "getRotationDegrees", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "PlaneData", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExtractedImageData {
    public static final int $stable = 8;
    private final int format;
    private final int height;
    private final boolean isValidJpegFormat;
    private final boolean isValidYuvFormat;
    private final List<PlaneData> planes;
    private final int rotationDegrees;
    private final int width;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData$PlaneData;", "", "bytes", "", "bufferSize", "", "pixelStride", "rowStride", "<init>", "([BIII)V", "getBytes", "()[B", "getBufferSize", "()I", "getPixelStride", "getRowStride", "equals", "", "other", "hashCode", "component1", "component2", "component3", "component4", "copy", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class PlaneData {
        public static final int $stable = 8;
        private final int bufferSize;
        private final byte[] bytes;
        private final int pixelStride;
        private final int rowStride;

        public PlaneData(byte[] bArr, int i, int i2, int i3) {
            bArr.getClass();
            this.bytes = bArr;
            this.bufferSize = i;
            this.pixelStride = i2;
            this.rowStride = i3;
        }

        public static /* synthetic */ PlaneData copy$default(PlaneData planeData, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                bArr = planeData.bytes;
            }
            if ((i4 & 2) != 0) {
                i = planeData.bufferSize;
            }
            if ((i4 & 4) != 0) {
                i2 = planeData.pixelStride;
            }
            if ((i4 & 8) != 0) {
                i3 = planeData.rowStride;
            }
            return planeData.copy(bArr, i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBufferSize() {
            return this.bufferSize;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPixelStride() {
            return this.pixelStride;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRowStride() {
            return this.rowStride;
        }

        public final PlaneData copy(byte[] bytes, int bufferSize, int pixelStride, int rowStride) {
            bytes.getClass();
            return new PlaneData(bytes, bufferSize, pixelStride, rowStride);
        }

        public boolean equals(Object other) {
            Class<?> cls;
            if (this == other) {
                return true;
            }
            if (other != null) {
                cls = other.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(PlaneData.class, cls)) {
                return false;
            }
            other.getClass();
            PlaneData planeData = (PlaneData) other;
            if (this.bufferSize == planeData.bufferSize && this.pixelStride == planeData.pixelStride && this.rowStride == planeData.rowStride && Arrays.equals(this.bytes, planeData.bytes)) {
                return true;
            }
            return false;
        }

        public final int getBufferSize() {
            return this.bufferSize;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final int getPixelStride() {
            return this.pixelStride;
        }

        public final int getRowStride() {
            return this.rowStride;
        }

        public int hashCode() {
            return Arrays.hashCode(this.bytes) + (((((this.bufferSize * 31) + this.pixelStride) * 31) + this.rowStride) * 31);
        }

        public String toString() {
            String arrays = Arrays.toString(this.bytes);
            int i = this.bufferSize;
            int i2 = this.pixelStride;
            int i3 = this.rowStride;
            StringBuilder q = m51.q("PlaneData(bytes=", arrays, ", bufferSize=", i, ", pixelStride=");
            q.append(i2);
            q.append(", rowStride=");
            q.append(i3);
            q.append(")");
            return q.toString();
        }
    }

    public ExtractedImageData(int i, int i2, int i3, List<PlaneData> list, boolean z, boolean z2, int i4) {
        list.getClass();
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.planes = list;
        this.isValidYuvFormat = z;
        this.isValidJpegFormat = z2;
        this.rotationDegrees = i4;
    }

    public static /* synthetic */ ExtractedImageData copy$default(ExtractedImageData extractedImageData, int i, int i2, int i3, List list, boolean z, boolean z2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = extractedImageData.width;
        }
        if ((i5 & 2) != 0) {
            i2 = extractedImageData.height;
        }
        if ((i5 & 4) != 0) {
            i3 = extractedImageData.format;
        }
        if ((i5 & 8) != 0) {
            list = extractedImageData.planes;
        }
        if ((i5 & 16) != 0) {
            z = extractedImageData.isValidYuvFormat;
        }
        if ((i5 & 32) != 0) {
            z2 = extractedImageData.isValidJpegFormat;
        }
        if ((i5 & 64) != 0) {
            i4 = extractedImageData.rotationDegrees;
        }
        boolean z3 = z2;
        int i6 = i4;
        boolean z4 = z;
        int i7 = i3;
        return extractedImageData.copy(i, i2, i7, list, z4, z3, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    public final List<PlaneData> component4() {
        return this.planes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsValidYuvFormat() {
        return this.isValidYuvFormat;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsValidJpegFormat() {
        return this.isValidJpegFormat;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final ExtractedImageData copy(int width, int height, int format, List<PlaneData> planes, boolean isValidYuvFormat, boolean isValidJpegFormat, int rotationDegrees) {
        planes.getClass();
        return new ExtractedImageData(width, height, format, planes, isValidYuvFormat, isValidJpegFormat, rotationDegrees);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtractedImageData)) {
            return false;
        }
        ExtractedImageData extractedImageData = (ExtractedImageData) other;
        if (this.width == extractedImageData.width && this.height == extractedImageData.height && this.format == extractedImageData.format && Intrinsics.areEqual(this.planes, extractedImageData.planes) && this.isValidYuvFormat == extractedImageData.isValidYuvFormat && this.isValidJpegFormat == extractedImageData.isValidJpegFormat && this.rotationDegrees == extractedImageData.rotationDegrees) {
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

    public final List<PlaneData> getPlanes() {
        return this.planes;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.rotationDegrees) + com.socure.docv.capturesdk.api.b.a(this.isValidJpegFormat, com.socure.docv.capturesdk.api.b.a(this.isValidYuvFormat, com.socure.docv.capturesdk.common.analytics.model.a.a(this.planes, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.format, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.height, Integer.hashCode(this.width) * 31, 31), 31), 31), 31), 31);
    }

    public final boolean isValidJpegFormat() {
        return this.isValidJpegFormat;
    }

    public final boolean isValidYuvFormat() {
        return this.isValidYuvFormat;
    }

    public String toString() {
        int i = this.width;
        int i2 = this.height;
        int i3 = this.format;
        List<PlaneData> list = this.planes;
        boolean z = this.isValidYuvFormat;
        boolean z2 = this.isValidJpegFormat;
        int i4 = this.rotationDegrees;
        StringBuilder n = m51.n(i, "ExtractedImageData(width=", i2, ", height=", ", format=");
        n.append(i3);
        n.append(", planes=");
        n.append(list);
        n.append(", isValidYuvFormat=");
        hdi.B(n, z, ", isValidJpegFormat=", z2, ", rotationDegrees=");
        return ix2.i(i4, ")", n);
    }
}
