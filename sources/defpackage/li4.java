package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class li4 extends ni4 {
    public static ni4 g(int i) {
        if (i < 0) {
            return ni4.b;
        }
        if (i > 0) {
            return ni4.c;
        }
        return ni4.a;
    }

    @Override // defpackage.ni4
    public final ni4 a(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.ni4
    public final ni4 b(bl5 bl5Var, bl5 bl5Var2) {
        return g(bl5Var.compareTo(bl5Var2));
    }

    @Override // defpackage.ni4
    public final ni4 c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.ni4
    public final ni4 d(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.ni4
    public final ni4 e(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }

    @Override // defpackage.ni4
    public final int f() {
        return 0;
    }
}
