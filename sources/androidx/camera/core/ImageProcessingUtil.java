package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import defpackage.dmk;
import defpackage.grn;
import defpackage.mfj;
import defpackage.o9n;
import defpackage.oo9;
import defpackage.py2;
import defpackage.qo9;
import defpackage.ro9;
import defpackage.to9;
import defpackage.wo9;
import defpackage.xm9;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(to9 to9Var) {
        ro9 ro9Var;
        if (!g(to9Var)) {
            o9n.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = to9Var.getWidth();
        int height = to9Var.getHeight();
        int d = to9Var.h0()[0].d();
        int d2 = to9Var.h0()[1].d();
        int d3 = to9Var.h0()[2].d();
        int e = to9Var.h0()[0].e();
        int e2 = to9Var.h0()[1].e();
        if (nativeShiftPixel(to9Var.h0()[0].c(), d, to9Var.h0()[1].c(), d2, to9Var.h0()[2].c(), d3, e, e2, width, height, e, e2, e2) != 0) {
            ro9Var = ro9.ERROR_CONVERSION;
        } else {
            ro9Var = ro9.SUCCESS;
        }
        if (ro9Var == ro9.ERROR_CONVERSION) {
            o9n.b("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static to9 b(mfj mfjVar, byte[] bArr) {
        boolean z;
        if (mfjVar.h() == 256) {
            z = true;
        } else {
            z = false;
        }
        grn.c(z);
        bArr.getClass();
        Surface surface = mfjVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            o9n.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        to9 e = mfjVar.e();
        if (e == null) {
            o9n.b("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return e;
    }

    public static Bitmap c(to9 to9Var) {
        if (to9Var.getFormat() == 35) {
            int width = to9Var.getWidth();
            int height = to9Var.getHeight();
            int d = to9Var.h0()[0].d();
            int d2 = to9Var.h0()[1].d();
            int d3 = to9Var.h0()[2].d();
            int e = to9Var.h0()[0].e();
            int e2 = to9Var.h0()[1].e();
            Bitmap createBitmap = Bitmap.createBitmap(to9Var.getWidth(), to9Var.getHeight(), Bitmap.Config.ARGB_8888);
            if (nativeConvertAndroid420ToBitmap(to9Var.h0()[0].c(), d, to9Var.h0()[1].c(), d2, to9Var.h0()[2].c(), d3, e, e2, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
                return createBitmap;
            }
            py2.f("YUV to RGB conversion failed");
            return null;
        }
        dmk.v("Input image format must be YUV_420_888");
        return null;
    }

    public static xm9 d(to9 to9Var, wo9 wo9Var, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        ro9 ro9Var;
        if (!g(to9Var)) {
            o9n.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        System.currentTimeMillis();
        if (!f(i)) {
            o9n.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = wo9Var.getSurface();
        int width = to9Var.getWidth();
        int height = to9Var.getHeight();
        int d = to9Var.h0()[0].d();
        int d2 = to9Var.h0()[1].d();
        int d3 = to9Var.h0()[2].d();
        int e = to9Var.h0()[0].e();
        int e2 = to9Var.h0()[1].e();
        if (z) {
            i2 = e;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = e2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = e2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(to9Var.h0()[0].c(), d, to9Var.h0()[1].c(), d2, to9Var.h0()[2].c(), d3, e, e2, surface, byteBuffer, width, height, i2, i3, i4, i) != 0) {
            ro9Var = ro9.ERROR_CONVERSION;
        } else {
            ro9Var = ro9.SUCCESS;
        }
        if (ro9Var == ro9.ERROR_CONVERSION) {
            o9n.b("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            o9n.e(3, "ImageProcessingUtil");
            a++;
        }
        to9 e3 = wo9Var.e();
        if (e3 == null) {
            o9n.b("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        xm9 xm9Var = new xm9(e3);
        xm9Var.e(new oo9(e3, to9Var, 0));
        return xm9Var;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean f(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            return false;
        }
        return true;
    }

    public static boolean g(to9 to9Var) {
        if (to9Var.getFormat() == 35 && to9Var.h0().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xm9 h(to9 to9Var, wo9 wo9Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        xm9 xm9Var;
        ro9 ro9Var;
        if (!g(to9Var)) {
            o9n.b("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!f(i)) {
            o9n.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        ro9 ro9Var2 = ro9.ERROR_CONVERSION;
        if (i > 0) {
            int width = to9Var.getWidth();
            int height = to9Var.getHeight();
            int d = to9Var.h0()[0].d();
            int d2 = to9Var.h0()[1].d();
            int d3 = to9Var.h0()[2].d();
            int e = to9Var.h0()[1].e();
            Image dequeueInputImage = imageWriter.dequeueInputImage();
            if (dequeueInputImage != null) {
                xm9Var = null;
                if (nativeRotateYUV(to9Var.h0()[0].c(), d, to9Var.h0()[1].c(), d2, to9Var.h0()[2].c(), d3, e, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                    imageWriter.queueInputImage(dequeueInputImage);
                    ro9Var = ro9.SUCCESS;
                    if (ro9Var == ro9Var2) {
                        o9n.b("ImageProcessingUtil", "rotate YUV failure");
                        return xm9Var;
                    }
                    to9 e2 = wo9Var.e();
                    if (e2 == null) {
                        o9n.b("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                        return xm9Var;
                    }
                    xm9 xm9Var2 = new xm9(e2);
                    xm9Var2.e(new oo9(e2, to9Var, 1));
                    return xm9Var2;
                }
                ro9Var = ro9Var2;
                if (ro9Var == ro9Var2) {
                }
            }
        }
        xm9Var = null;
        ro9Var = ro9Var2;
        if (ro9Var == ro9Var2) {
        }
    }

    public static xm9 i(to9 to9Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        int height;
        int width;
        if (!g(to9Var)) {
            o9n.b("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!f(i)) {
            o9n.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && to9Var.h0().length == 3 && to9Var.h0()[1].e() == 2 && nativeGetYUVImageVUOff(to9Var.h0()[2].c(), to9Var.h0()[1].c()) == -1) {
            return null;
        }
        int i2 = i % BlurConstants.H_BD;
        if (i2 == 0) {
            height = to9Var.getWidth();
        } else {
            height = to9Var.getHeight();
        }
        int i3 = height;
        if (i2 == 0) {
            width = to9Var.getHeight();
        } else {
            width = to9Var.getWidth();
        }
        int i4 = width;
        ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(to9Var.h0()[0].c(), to9Var.h0()[0].d(), to9Var.h0()[1].c(), to9Var.h0()[1].d(), to9Var.h0()[2].c(), to9Var.h0()[2].d(), to9Var.h0()[2].e(), byteBuffer4, i3, 1, nativeNewDirectByteBuffer, i3, 2, byteBuffer5, i3, 2, byteBuffer, byteBuffer2, byteBuffer3, to9Var.getWidth(), to9Var.getHeight(), i) != 0) {
            o9n.b("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        return new xm9(new qo9(to9Var, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, i3, i4));
    }

    public static void j(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            o9n.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
