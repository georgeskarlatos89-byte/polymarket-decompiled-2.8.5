package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class tj1 {
    public static float a(uj1 uj1Var, ArrayList arrayList, float f) {
        float a;
        uj1Var.getClass();
        float f2 = 0.0f;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        int e = lnf.e((int) Math.floor(r2), 0, arrayList.size() - 1);
        int e2 = lnf.e((int) Math.ceil(r2), 0, arrayList.size() - 1);
        float floor = f - ((float) Math.floor(f));
        int size = ((List) arrayList.get(e)).size();
        if (size <= 0) {
            a = 0.0f;
        } else {
            int i = size - 1;
            a = uj1Var.a(e, i) + uj1Var.b(e, i) + 24.0f;
        }
        int size2 = ((List) arrayList.get(e2)).size();
        if (size2 > 0) {
            int i2 = size2 - 1;
            f2 = uj1Var.a(e2, i2) + uj1Var.b(e2, i2) + 24.0f;
        }
        return ix2.a(f2, a, floor, a);
    }

    public static float b(uj1 uj1Var, int i, int i2, float f, int i3) {
        float a;
        uj1Var.getClass();
        if (i == 0) {
            a = uj1Var.b(0, i2);
        } else {
            int i4 = i - 1;
            int i5 = i2 * 2;
            float a2 = (uj1Var.a(i4, i5) / 2.0f) + uj1Var.b(i4, i5);
            int i6 = i5 + 1;
            a = ((((uj1Var.a(i4, i6) / 2.0f) + uj1Var.b(i4, i6)) + a2) / 2.0f) - (uj1Var.a(i, i2) / 2.0f);
        }
        float b = uj1Var.b(i, i2);
        if (f <= -1.0f) {
            return a;
        }
        float f2 = 0.0f;
        if (f <= 0.0f) {
            return ((f + 1.0f) * (b - a)) + a;
        }
        if (f >= 1.0f) {
            if (i2 % 2 == 1) {
                f2 = 16.0f;
            }
            return uj1Var.b(Math.min(i + 1, i3), i2 / 2) + f2;
        }
        if (i2 % 2 == 1) {
            f2 = 16.0f;
        }
        return (((uj1Var.b(Math.min(i + 1, i3), i2 / 2) + f2) - b) * f) + b;
    }
}
