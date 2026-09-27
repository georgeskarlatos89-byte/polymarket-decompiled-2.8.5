package defpackage;

import androidx.collection.SparseArrayCompat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ii8 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile SparseArrayCompat b = new SparseArrayCompat(0, 1, null);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            c(b, 1.15f, new ji8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c(b, 1.3f, new ji8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c(b, 1.5f, new ji8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c(b, 1.8f, new ji8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c(b, 2.0f, new ji8(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.j(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        mw9.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static hi8 a(float f) {
        float j;
        hi8 hi8Var;
        float f2;
        float[] fArr = a;
        if (f >= 1.03f) {
            int i = (int) (f * 100.0f);
            hi8 hi8Var2 = (hi8) b.e(i);
            if (hi8Var2 != null) {
                return hi8Var2;
            }
            int g = b.g(i);
            if (g >= 0) {
                return (hi8) b.o(g);
            }
            int i2 = -(g + 1);
            int i3 = i2 - 1;
            if (i2 >= b.n()) {
                ji8 ji8Var = new ji8(new float[]{1.0f}, new float[]{f});
                b(f, ji8Var);
                return ji8Var;
            }
            if (i3 < 0) {
                hi8Var = new ji8(fArr, fArr);
                j = 1.0f;
            } else {
                j = b.j(i3) / 100.0f;
                hi8Var = (hi8) b.o(i3);
            }
            float j2 = b.j(i2) / 100.0f;
            if (j == j2) {
                f2 = 0.0f;
            } else {
                f2 = (f - j) / (j2 - j);
            }
            float max = (Math.max(0.0f, Math.min(1.0f, f2)) * 1.0f) + 0.0f;
            hi8 hi8Var3 = (hi8) b.o(i2);
            float[] fArr2 = new float[9];
            for (int i4 = 0; i4 < 9; i4++) {
                float f3 = fArr[i4];
                float b2 = hi8Var.b(f3);
                fArr2[i4] = ((hi8Var3.b(f3) - b2) * max) + b2;
            }
            ji8 ji8Var2 = new ji8(fArr, fArr2);
            b(f, ji8Var2);
            return ji8Var2;
        }
        return null;
    }

    public static void b(float f, ji8 ji8Var) {
        synchronized (c) {
            SparseArrayCompat c2 = b.c();
            c(c2, f, ji8Var);
            b = c2;
        }
    }

    public static void c(SparseArrayCompat sparseArrayCompat, float f, ji8 ji8Var) {
        sparseArrayCompat.k((int) (f * 100.0f), ji8Var);
    }
}
