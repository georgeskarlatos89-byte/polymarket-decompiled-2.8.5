package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xgd {
    public final ygd a = new ygd();
    public final svd b = new svd(0, new byte[65025]);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            ygd ygdVar = this.a;
            if (i5 >= ygdVar.c) {
                break;
            }
            int[] iArr = ygdVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(tu7 tu7Var) {
        boolean z;
        boolean z2;
        int i;
        if (tu7Var != null) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        boolean z3 = this.e;
        svd svdVar = this.b;
        if (z3) {
            this.e = false;
            svdVar.C(0);
        }
        while (!this.e) {
            int i2 = this.c;
            ygd ygdVar = this.a;
            if (i2 < 0) {
                if (ygdVar.b(tu7Var, -1L) && ygdVar.a(tu7Var, true)) {
                    int i3 = ygdVar.d;
                    if ((ygdVar.a & 1) == 1 && svdVar.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        tu7Var.l(i3);
                        this.c = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(i2);
            int i4 = this.c + this.d;
            if (a > 0) {
                svdVar.b(svdVar.c + a);
                try {
                    tu7Var.readFully(svdVar.a, svdVar.c, a);
                    svdVar.E(svdVar.c + a);
                    if (ygdVar.f[i4 - 1] != 255) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == ygdVar.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
