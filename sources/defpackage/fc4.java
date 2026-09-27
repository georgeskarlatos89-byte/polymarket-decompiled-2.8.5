package defpackage;

import android.graphics.Color;
import com.appsflyer.internal.l;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class fc4 {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(float[] fArr) {
        int b;
        int round;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = ix2.b(abs, f4, 255.0f);
                b = ix2.b(abs2, f4, 255.0f);
                round = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = ix2.b(abs2, f4, 255.0f);
                b = ix2.b(abs, f4, 255.0f);
                round = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                b = ix2.b(abs, f4, 255.0f);
                round = ix2.b(abs2, f4, 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                b = ix2.b(abs2, f4, 255.0f);
                round = ix2.b(abs, f4, 255.0f);
                break;
            case 4:
                i = ix2.b(abs2, f4, 255.0f);
                b = Math.round(f4 * 255.0f);
                round = ix2.b(abs, f4, 255.0f);
                break;
            case 5:
            case 6:
                i = ix2.b(abs, f4, 255.0f);
                b = Math.round(f4 * 255.0f);
                round = ix2.b(abs2, f4, 255.0f);
                break;
            default:
                round = 0;
                b = 0;
                break;
        }
        return Color.rgb(i(i), i(b), i(round));
    }

    public static int b(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d8 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d9 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(i((int) Math.round(d4 * 255.0d)), i((int) Math.round(d5 * 255.0d)), i((int) Math.round(d6 * 255.0d)));
    }

    public static int c(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static double d(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = g(i, i2);
            }
            double e = e(i) + 0.05d;
            double e2 = e(i2) + 0.05d;
            return Math.max(e, e2) / Math.min(e, e2);
        }
        l.k(Integer.toHexString(i2), "background can not be translucent: #");
        return ConstantsKt.UNSET;
    }

    public static double e(int i) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = red / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = green / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = blue / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d4 / 100.0d;
        }
        dmk.v("outXyz must have a length of 3.");
        return ConstantsKt.UNSET;
    }

    public static void f(int i, float[] fArr) {
        float f;
        float abs;
        float min;
        float min2;
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min3 = Math.min(red, Math.min(green, blue));
        float f2 = max - min3;
        float f3 = (max + min3) / 2.0f;
        float f4 = 0.0f;
        if (max == min3) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == red) {
                f = ((green - blue) / f2) % 6.0f;
            } else if (max == green) {
                f = ((blue - red) / f2) + 2.0f;
            } else {
                f = ((red - green) / f2) + 4.0f;
            }
            abs = f2 / (1.0f - Math.abs((2.0f * f3) - 1.0f));
        }
        float f5 = (f * 60.0f) % 360.0f;
        if (f5 < 0.0f) {
            f5 += 360.0f;
        }
        if (f5 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f5, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f3 >= 0.0f) {
            f4 = Math.min(f3, 1.0f);
        }
        fArr[2] = f4;
    }

    public static int g(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, h(Color.red(i), alpha2, Color.red(i2), alpha, i3), h(Color.green(i), alpha2, Color.green(i2), alpha, i3), h(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int i(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static int j(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        dmk.v("alpha must be between 0 and 255.");
        return 0;
    }
}
