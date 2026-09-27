package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class muj {
    public abstract ouj a(Object obj);

    public final boolean b(Object obj, z84 z84Var) {
        w84 w84Var = z84Var.a;
        int i = z84Var.b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            return false;
                        }
                        if (i3 == 5) {
                            z84Var.v(5);
                            ((ouj) obj).d(5 | (i2 << 3), Integer.valueOf(w84Var.q()));
                            return true;
                        }
                        throw z7a.c();
                    }
                    ouj c = ouj.c();
                    int i4 = i2 << 3;
                    int i5 = i4 | 4;
                    while (z84Var.a() != Integer.MAX_VALUE && b(c, z84Var)) {
                    }
                    if (i5 == z84Var.b) {
                        c.e = false;
                        ((ouj) obj).d(i4 | 3, c);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((ouj) obj).d((i2 << 3) | 2, z84Var.e());
                return true;
            }
            z84Var.v(1);
            ((ouj) obj).d((i2 << 3) | 1, Long.valueOf(w84Var.r()));
            return true;
        }
        z84Var.v(0);
        ((ouj) obj).d(i2 << 3, Long.valueOf(w84Var.u()));
        return true;
    }
}
