package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ey6 {
    public static final cld f = cld.a(dx5.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final cld g = new cld("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, cld.e);
    public static final cld h;
    public static final cld i;
    public static final ma5 j;
    public static final ArrayDeque k;
    public final hf1 a;
    public final DisplayMetrics b;
    public final bxb c;
    public final ArrayList d;
    public final g49 e = g49.a();

    static {
        by6 by6Var = by6.b;
        Boolean bool = Boolean.FALSE;
        h = cld.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = cld.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new ma5(4);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public ey6(ArrayList arrayList, DisplayMetrics displayMetrics, hf1 hf1Var, bxb bxbVar) {
        this.d = arrayList;
        zqn.c(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        zqn.c(hf1Var, "Argument must not be null");
        this.a = hf1Var;
        zqn.c(bxbVar, "Argument must not be null");
        this.c = bxbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(uo9 uo9Var, BitmapFactory.Options options, dy6 dy6Var, hf1 hf1Var) {
        if (!options.inJustDecodeBounds) {
            dy6Var.r();
            uo9Var.e();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = pbj.d;
        lock.lock();
        try {
            try {
                Bitmap d = uo9Var.d(options);
                lock.unlock();
                return d;
            } catch (IllegalArgumentException e) {
                StringBuilder n = m51.n(i2, "Exception decoding bitmap, outWidth: ", i3, ", outHeight: ", ", outMimeType: ");
                n.append(str);
                n.append(", inBitmap: ");
                n.append(d(options.inBitmap));
                IOException iOException = new IOException(n.toString(), e);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        hf1Var.c(bitmap);
                        options.inBitmap = null;
                        Bitmap c = c(uo9Var, options, dy6Var, hf1Var);
                        pbj.d.unlock();
                        return c;
                    } catch (IOException unused) {
                        throw iOException;
                    }
                }
                throw iOException;
            }
        } catch (Throwable th) {
            pbj.d.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final if1 a(uo9 uo9Var, int i2, int i3, ild ildVar, dy6 dy6Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        boolean z;
        byte[] bArr = (byte[]) this.c.c(byte[].class, 65536);
        synchronized (ey6.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        dx5 dx5Var = (dx5) ildVar.a(f);
        k2f k2fVar = (k2f) ildVar.a(g);
        by6 by6Var = (by6) ildVar.a(by6.g);
        boolean booleanValue = ((Boolean) ildVar.a(h)).booleanValue();
        cld cldVar = i;
        if (ildVar.a(cldVar) != null && ((Boolean) ildVar.a(cldVar)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            if1 a = if1.a(this.a, b(uo9Var, options, by6Var, dx5Var, k2fVar, z, i2, i3, booleanValue, dy6Var));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.g(bArr);
            return a;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.g(bArr);
                throw th;
            }
        }
    }

    public final Bitmap b(uo9 uo9Var, BitmapFactory.Options options, by6 by6Var, dx5 dx5Var, k2f k2fVar, boolean z, int i2, int i3, boolean z2, dy6 dy6Var) {
        boolean z3;
        char c;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        int i6;
        ey6 ey6Var;
        boolean z6;
        float f2;
        int i7;
        Bitmap.Config config;
        Bitmap p;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int i8;
        int i9;
        int min;
        int floor;
        int floor2;
        double d;
        int i10 = hrb.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        hf1 hf1Var = this.a;
        c(uo9Var, options, dy6Var, hf1Var);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 != -1 && i12 != -1) {
            z3 = z;
        } else {
            z3 = false;
        }
        int f3 = uo9Var.f();
        switch (f3) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (f3) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z4 = true;
                break;
            default:
                z4 = false;
                break;
        }
        int i13 = i2;
        if (i13 == Integer.MIN_VALUE) {
            if (c != 'Z' && c != 270) {
                i4 = i3;
                i13 = i11;
            } else {
                i4 = i3;
                i13 = i12;
            }
        } else {
            i4 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            if (c != 'Z' && c != 270) {
                i4 = i12;
            } else {
                i4 = i11;
            }
        }
        ImageHeaderParser$ImageType g2 = uo9Var.g();
        if (i11 <= 0 || i12 <= 0) {
            i5 = i11;
            z5 = z3;
            i6 = f3;
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(g2);
            }
            ey6Var = this;
        } else {
            i6 = f3;
            if (c != 'Z' && c != 270) {
                i9 = i12;
                i8 = i11;
            } else {
                i8 = i12;
                i9 = i11;
            }
            float b = by6Var.b(i8, i9, i13, i4);
            if (b > 0.0f) {
                z5 = z3;
                cy6 a = by6Var.a(i8, i9, i13, i4);
                if (a != null) {
                    float f4 = i8;
                    float f5 = i9;
                    int i14 = i8 / ((int) ((b * f4) + 0.5d));
                    int i15 = i9 / ((int) ((b * f5) + 0.5d));
                    cy6 cy6Var = cy6.MEMORY;
                    if (a == cy6Var) {
                        min = Math.max(i14, i15);
                    } else {
                        min = Math.min(i14, i15);
                    }
                    int max = Math.max(1, Integer.highestOneBit(min));
                    if (a == cy6Var && max < 1.0f / b) {
                        max <<= 1;
                    }
                    options.inSampleSize = max;
                    if (g2 == ImageHeaderParser$ImageType.JPEG) {
                        float min2 = Math.min(max, 8);
                        floor = (int) Math.ceil(f4 / min2);
                        floor2 = (int) Math.ceil(f5 / min2);
                        int i16 = max / 8;
                        if (i16 > 0) {
                            floor /= i16;
                            floor2 /= i16;
                        }
                    } else if (g2 != ImageHeaderParser$ImageType.PNG && g2 != ImageHeaderParser$ImageType.PNG_A) {
                        if (g2.isWebp()) {
                            float f6 = max;
                            floor = Math.round(f4 / f6);
                            floor2 = Math.round(f5 / f6);
                        } else if (i8 % max == 0 && i9 % max == 0) {
                            floor = i8 / max;
                            floor2 = i9 / max;
                        } else {
                            options.inJustDecodeBounds = true;
                            c(uo9Var, options, dy6Var, hf1Var);
                            options.inJustDecodeBounds = false;
                            int[] iArr2 = {options.outWidth, options.outHeight};
                            floor = iArr2[0];
                            floor2 = iArr2[1];
                        }
                    } else {
                        float f7 = max;
                        floor = (int) Math.floor(f4 / f7);
                        floor2 = (int) Math.floor(f5 / f7);
                    }
                    double b2 = by6Var.b(floor, floor2, i13, i4);
                    if (b2 <= 1.0d) {
                        d = b2;
                    } else {
                        d = 1.0d / b2;
                    }
                    options.inTargetDensity = (int) (((b2 / (r11 / r10)) * ((int) ((((int) Math.round(d * 2.147483647E9d)) * b2) + 0.5d))) + 0.5d);
                    if (b2 > 1.0d) {
                        b2 = 1.0d / b2;
                    }
                    int round = (int) Math.round(b2 * 2.147483647E9d);
                    options.inDensity = round;
                    int i17 = options.inTargetDensity;
                    if (i17 > 0 && round > 0 && i17 != round) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    Log.isLoggable("Downsampler", 2);
                    ey6Var = this;
                    i5 = i11;
                    i12 = i12;
                } else {
                    dmk.v("Cannot round with null rounding");
                    return null;
                }
            } else {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(b);
                sb.append(" from: ");
                sb.append(by6Var);
                sb.append(", source: [");
                k84.i(i11, i12, "x", "], target: [", sb);
                sb.append(i13);
                sb.append("x");
                sb.append(i4);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        boolean b3 = ey6Var.e.b(i13, i4, z5, z4);
        if (b3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z6 = false;
            options.inMutable = false;
        } else {
            z6 = false;
        }
        if (!b3) {
            if (dx5Var != dx5.PREFER_ARGB_8888) {
                try {
                    z6 = uo9Var.g().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(dx5Var);
                    }
                }
                if (z6) {
                    config3 = Bitmap.Config.ARGB_8888;
                } else {
                    config3 = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config3;
                if (config3 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        if (i5 < 0 || i12 < 0 || !z2) {
            int i18 = options.inTargetDensity;
            if (i18 > 0 && (i7 = options.inDensity) > 0 && i18 != i7) {
                f2 = i18 / i7;
            } else {
                f2 = 1.0f;
            }
            float f8 = options.inSampleSize;
            int ceil = (int) Math.ceil(i5 / f8);
            int ceil2 = (int) Math.ceil(i12 / f8);
            int round2 = Math.round(ceil * f2);
            i4 = Math.round(ceil2 * f2);
            Log.isLoggable("Downsampler", 2);
            i13 = round2;
        }
        if (i13 > 0 && i4 > 0 && (config2 = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
            Bitmap.Config config4 = options.outConfig;
            if (config4 != null) {
                config2 = config4;
            }
            options.inBitmap = hf1Var.b(i13, i4, config2);
        }
        if (k2fVar != null) {
            if (k2fVar == k2f.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            options.inPreferredColorSpace = ColorSpace.get(named);
        }
        Bitmap c2 = c(uo9Var, options, dy6Var, hf1Var);
        dy6Var.t(hf1Var, c2);
        if (Log.isLoggable("Downsampler", 2)) {
            d(c2);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (c2 == null) {
            return null;
        }
        c2.setDensity(ey6Var.b.densityDpi);
        switch (i6) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i6) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(0.0f, 0.0f, c2.getWidth(), c2.getHeight());
                matrix.mapRect(rectF);
                int round3 = Math.round(rectF.width());
                int round4 = Math.round(rectF.height());
                if (c2.getConfig() != null) {
                    config = c2.getConfig();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                p = hf1Var.p(round3, round4, config);
                matrix.postTranslate(-rectF.left, -rectF.top);
                p.setHasAlpha(c2.hasAlpha());
                pbj.a(c2, p, matrix);
                break;
            default:
                p = c2;
                break;
        }
        if (!c2.equals(p)) {
            hf1Var.c(c2);
        }
        return p;
    }
}
