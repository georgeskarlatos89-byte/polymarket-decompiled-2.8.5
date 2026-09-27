package org.webrtc;

import com.socure.docv.capturesdk.common.utils.BlurConstants;
import defpackage.ace;
import defpackage.dmk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        nativeABGRToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = (i5 + 1) / 2;
        int i11 = i6 * i5;
        int i12 = i6 * i7;
        int i13 = (i8 * i10) + i12;
        int i14 = (i8 * i9) + i12;
        int i15 = ((i10 - 1) * i8) + i14 + ((i4 + 1) / 2);
        if (byteBuffer4.capacity() >= i15) {
            byteBuffer4.limit(i11);
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.limit(i13);
            byteBuffer4.position(i12);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.limit(i15);
            byteBuffer4.position(i14);
            I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, slice2, i8, byteBuffer4.slice(), i8, i4, i5);
            return;
        }
        dmk.h(byteBuffer4.capacity(), ace.o(i15, "Expected destination buffer capacity to be at least ", " was "));
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i6 % BlurConstants.H_BD;
        if (i9 == 0) {
            i7 = i4;
        } else {
            i7 = i5;
        }
        if (i9 == 0) {
            i8 = i5;
        } else {
            i8 = i4;
        }
        int i10 = (i8 + 1) / 2;
        int i11 = (i7 + 1) / 2;
        int i12 = i8 * i7;
        int i13 = i10 * i11;
        int i14 = (i13 * 2) + i12;
        if (byteBuffer4.capacity() >= i14) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i12);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i13 + i12);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i7, slice2, i11, byteBuffer4.slice(), i11, i4, i5, i6);
            return;
        }
        dmk.h(byteBuffer4.capacity(), ace.o(i14, "Expected destination buffer capacity to be at least ", " was "));
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        int i8 = (i4 + 1) / 2;
        int i9 = i6 * i5;
        int i10 = i6 * i7;
        int i11 = (((i5 + 1) / 2) * i8 * 2) + i10;
        if (byteBuffer4.capacity() >= i11) {
            byteBuffer4.limit(i9);
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.limit(i11);
            byteBuffer4.position(i10);
            I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, byteBuffer4.slice(), i8 * 2, i4, i5);
            return;
        }
        dmk.h(byteBuffer4.capacity(), ace.o(i11, "Expected destination buffer capacity to be at least ", " was "));
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && i6 > 0 && i7 > 0) {
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
        } else {
            dmk.v("Invalid I420ToNV12 input arguments");
        }
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5, (i4 + 1) / 2, (i5 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6, i7, (i6 + 1) / 2, (i7 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null && i7 > 0 && i8 > 0) {
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
        } else {
            dmk.v("Invalid I420Copy input arguments");
        }
    }
}
