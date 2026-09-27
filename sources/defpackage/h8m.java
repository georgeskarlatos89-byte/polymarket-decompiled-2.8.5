package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class h8m {
    public static final aga a = new aga("TEXT", true);
    public static final aga b = new aga("CODE_LINE", true);
    public static final aga c = new aga("BLOCK_QUOTE", true);
    public static final aga d = new aga("HTML_BLOCK_CONTENT", true);
    public static final aga e = new aga("'", true);
    public static final aga f = new aga("\"", true);
    public static final aga g = new aga("(", true);
    public static final aga h = new aga(")", true);
    public static final aga i = new aga("[", true);
    public static final aga j = new aga("]", true);
    public static final aga k = new aga("<", true);
    public static final aga l = new aga(">", true);
    public static final aga m = new aga(":", true);
    public static final aga n = new aga("!", true);
    public static final aga o = new aga("BR", true);
    public static final aga p = new aga("EOL", true);
    public static final aga q = new aga("LINK_ID", true);
    public static final aga r = new aga("ATX_HEADER", true);
    public static final aga s = new aga("ATX_CONTENT", true);
    public static final aga t = new aga("SETEXT_1", true);
    public static final aga u = new aga("SETEXT_2", true);
    public static final aga v = new aga("SETEXT_CONTENT", true);
    public static final aga w = new aga("EMPH", true);
    public static final aga x = new aga("BACKTICK", true);
    public static final aga y = new aga("ESCAPED_BACKTICKS", true);
    public static final aga z = new aga("LIST_BULLET", true);
    public static final aga A = new aga("URL", true);
    public static final aga B = new aga("HORIZONTAL_RULE", true);
    public static final aga C = new aga("LIST_NUMBER", true);
    public static final aga D = new aga("FENCE_LANG", true);
    public static final aga E = new aga("CODE_FENCE_START", true);
    public static final aga F = new aga("CODE_FENCE_CONTENT", true);
    public static final aga G = new aga("CODE_FENCE_END", true);
    public static final aga H = new aga("LINK_TITLE", true);
    public static final aga I = new aga("AUTOLINK", true);
    public static final aga J = new aga("EMAIL_AUTOLINK", true);
    public static final aga K = new aga("HTML_TAG", true);
    public static final aga L = new aga("BAD_CHARACTER", true);
    public static final n2c M = new aga("WHITE_SPACE", true);

    public static final long a(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            lw9.a("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        long j2 = (i3 & 4294967295L) | (i2 << 32);
        int i4 = nxi.c;
        return j2;
    }

    public static final long b(int i2, long j2) {
        int i3;
        int i4 = nxi.c;
        int i5 = (int) (j2 >> 32);
        int i6 = 0;
        if (i5 < 0) {
            i3 = 0;
        } else {
            i3 = i5;
        }
        if (i3 > i2) {
            i3 = i2;
        }
        int i7 = (int) (4294967295L & j2);
        if (i7 >= 0) {
            i6 = i7;
        }
        if (i6 <= i2) {
            i2 = i6;
        }
        if (i3 == i5 && i2 == i7) {
            return j2;
        }
        return a(i3, i2);
    }

    public static Bitmap c(to9 to9Var) {
        int format = to9Var.getFormat();
        if (format != 1) {
            if (format != 35) {
                if (format != 256 && format != 4101) {
                    fi9.i("Incorrect image format of the input image proxy: ", to9Var.getFormat(), ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
                    return null;
                }
                if (d(to9Var.getFormat())) {
                    ByteBuffer c2 = to9Var.h0()[0].c();
                    int capacity = c2.capacity();
                    byte[] bArr = new byte[capacity];
                    c2.rewind();
                    c2.get(bArr);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, null);
                    if (decodeByteArray != null) {
                        return decodeByteArray;
                    }
                    py2.f("Decode jpeg byte array failed");
                    return null;
                }
                dmk.g(to9Var.getFormat(), "Incorrect image format of the input image proxy: ");
                return null;
            }
            return ImageProcessingUtil.c(to9Var);
        }
        Bitmap createBitmap = Bitmap.createBitmap(to9Var.getWidth(), to9Var.getHeight(), Bitmap.Config.ARGB_8888);
        to9Var.h0()[0].c().rewind();
        ImageProcessingUtil.e(createBitmap, to9Var.h0()[0].c(), to9Var.h0()[0].d());
        return createBitmap;
    }

    public static boolean d(int i2) {
        if (i2 != 256 && i2 != 4101) {
            return false;
        }
        return true;
    }

    public static byte[] e(to9 to9Var, Rect rect, int i2, int i3) {
        if (to9Var.getFormat() == 35) {
            so9 so9Var = to9Var.h0()[0];
            so9 so9Var2 = to9Var.h0()[1];
            int i4 = 2;
            so9 so9Var3 = to9Var.h0()[2];
            ByteBuffer c2 = so9Var.c();
            ByteBuffer c3 = so9Var2.c();
            ByteBuffer c4 = so9Var3.c();
            c2.rewind();
            c3.rewind();
            c4.rewind();
            int remaining = c2.remaining();
            byte[] bArr = new byte[((to9Var.getHeight() * to9Var.getWidth()) / 2) + remaining];
            int i5 = 0;
            for (int i6 = 0; i6 < to9Var.getHeight(); i6++) {
                c2.get(bArr, i5, to9Var.getWidth());
                i5 += to9Var.getWidth();
                c2.position(Math.min(remaining, so9Var.d() + (c2.position() - to9Var.getWidth())));
            }
            int height = to9Var.getHeight() / 2;
            int width = to9Var.getWidth() / 2;
            int d2 = so9Var3.d();
            int d3 = so9Var2.d();
            int e2 = so9Var3.e();
            int e3 = so9Var2.e();
            byte[] bArr2 = new byte[d2];
            byte[] bArr3 = new byte[d3];
            int i7 = 0;
            while (i7 < height) {
                int i8 = i4;
                c4.get(bArr2, 0, Math.min(d2, c4.remaining()));
                c3.get(bArr3, 0, Math.min(d3, c3.remaining()));
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < width; i11++) {
                    int i12 = i5 + 1;
                    bArr[i5] = bArr2[i9];
                    i5 += 2;
                    bArr[i12] = bArr3[i10];
                    i9 += e2;
                    i10 += e3;
                }
                i7++;
                i4 = i8;
            }
            int i13 = i4;
            YuvImage yuvImage = new YuvImage(bArr, 17, to9Var.getWidth(), to9Var.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            nq7[] nq7VarArr = zp7.b;
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            wp7 wp7Var = new wp7();
            String valueOf = String.valueOf(1);
            ArrayList arrayList = wp7Var.a;
            wp7Var.c("Orientation", valueOf, arrayList);
            wp7Var.c("XResolution", "72/1", arrayList);
            wp7Var.c("YResolution", "72/1", arrayList);
            wp7Var.c("ResolutionUnit", String.valueOf(i13), arrayList);
            wp7Var.c("YCbCrPositioning", String.valueOf(1), arrayList);
            wp7Var.c("Make", Build.MANUFACTURER, arrayList);
            wp7Var.c("Model", Build.MODEL, arrayList);
            if (to9Var.P0() != null) {
                to9Var.P0().a(wp7Var);
            }
            wp7Var.d(i3);
            wp7Var.c("ImageWidth", String.valueOf(to9Var.getWidth()), arrayList);
            wp7Var.c("ImageLength", String.valueOf(to9Var.getHeight()), arrayList);
            ArrayList list = Collections.list(new vp7(wp7Var));
            if (!((Map) list.get(1)).isEmpty()) {
                wp7Var.b("ExposureProgram", String.valueOf(0), list);
                wp7Var.b("ExifVersion", "0230", list);
                wp7Var.b("ComponentsConfiguration", zp7.e, list);
                wp7Var.b("MeteringMode", String.valueOf(0), list);
                wp7Var.b("LightSource", String.valueOf(0), list);
                wp7Var.b("FlashpixVersion", "0100", list);
                wp7Var.b("FocalPlaneResolutionUnit", String.valueOf(i13), list);
                wp7Var.b("FileSource", String.valueOf(3), list);
                wp7Var.b("SceneType", String.valueOf(1), list);
                wp7Var.b("CustomRendered", String.valueOf(0), list);
                wp7Var.b("SceneCaptureType", String.valueOf(0), list);
                wp7Var.b("Contrast", String.valueOf(0), list);
                wp7Var.b("Saturation", String.valueOf(0), list);
                wp7Var.b("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(i13)).isEmpty()) {
                wp7Var.b("GPSVersionID", "2300", list);
                wp7Var.b("GPSSpeedRef", "K", list);
                wp7Var.b("GPSTrackRef", "T", list);
                wp7Var.b("GPSImgDirectionRef", "T", list);
                wp7Var.b("GPSDestBearingRef", "T", list);
                wp7Var.b("GPSDestDistanceRef", "K", list);
            }
            if (yuvImage.compressToJpeg(rect, i2, new mq7(byteArrayOutputStream, new zp7(list)))) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new Exception("YuvImage failed to encode jpeg.");
        }
        dmk.g(to9Var.getFormat(), "Incorrect image format of the input image proxy: ");
        return null;
    }
}
