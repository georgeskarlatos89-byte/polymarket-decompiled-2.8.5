package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class nuj {
    public abstract puj a(Object obj);

    public final boolean b(int i, a94 a94Var, Object obj) {
        w84 w84Var = a94Var.a;
        int i2 = a94Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return false;
                        }
                        if (i4 == 5) {
                            a94Var.w(5);
                            ((puj) obj).c(5 | (i3 << 3), Integer.valueOf(w84Var.q()));
                            return true;
                        }
                        throw y7a.b();
                    }
                    puj pujVar = new puj(0, new int[8], new Object[8], true);
                    int i5 = i3 << 3;
                    int i6 = i5 | 4;
                    int i7 = i + 1;
                    if (i7 >= 100) {
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    while (a94Var.a() != Integer.MAX_VALUE && b(i7, a94Var, pujVar)) {
                    }
                    if (i6 == a94Var.b) {
                        if (pujVar.e) {
                            pujVar.e = false;
                        }
                        ((puj) obj).c(i5 | 3, pujVar);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((puj) obj).c((i3 << 3) | 2, a94Var.e());
                return true;
            }
            a94Var.w(1);
            ((puj) obj).c((i3 << 3) | 1, Long.valueOf(w84Var.r()));
            return true;
        }
        a94Var.w(0);
        ((puj) obj).c(i3 << 3, Long.valueOf(w84Var.u()));
        return true;
    }
}
