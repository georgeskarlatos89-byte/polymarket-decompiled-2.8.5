package defpackage;

import android.util.Rational;
import android.util.Size;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class fm0 {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static boolean a(Rational rational, Size size) {
        Size size2 = s9h.b;
        if (rational != null) {
            if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                if (size.getHeight() * size.getWidth() >= s9h.a(size2)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                    int i = width % 16;
                    if (i == 0 && height % 16 == 0) {
                        if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                            return true;
                        }
                    } else {
                        if (i == 0) {
                            return b(height, width, rational);
                        }
                        if (height % 16 == 0) {
                            return b(width, height, rational2);
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean b(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        grn.c(z);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        if (numerator > Math.max(0, i2 - 16) && numerator < i2 + 16) {
            return true;
        }
        return false;
    }
}
