package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ygd {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final svd g = new svd(255);

    public final boolean a(tu7 tu7Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        svd svdVar = this.g;
        svdVar.C(27);
        try {
            z2 = tu7Var.b(svdVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && svdVar.v() == 1332176723) {
            if (svdVar.t() != 0) {
                if (!z) {
                    throw dwd.c("unsupported bit stream revision");
                }
            } else {
                this.a = svdVar.t();
                this.b = svdVar.j();
                svdVar.k();
                svdVar.k();
                svdVar.k();
                int t = svdVar.t();
                this.c = t;
                this.d = t + 27;
                svdVar.C(t);
                try {
                    z3 = tu7Var.b(svdVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (z) {
                        z3 = false;
                    } else {
                        throw e2;
                    }
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int t2 = svdVar.t();
                        this.f[i] = t2;
                        this.e += t2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(tu7 tu7Var, long j) {
        boolean z;
        boolean z2;
        if (tu7Var.getPosition() == tu7Var.g()) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        svd svdVar = this.g;
        svdVar.C(4);
        while (true) {
            if (j != -1 && tu7Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                z2 = tu7Var.b(svdVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            svdVar.F(0);
            if (svdVar.v() == 1332176723) {
                tu7Var.d();
                return true;
            }
            tu7Var.l(1);
        }
        do {
            if (j != -1 && tu7Var.getPosition() >= j) {
                break;
            }
        } while (tu7Var.j(1) != -1);
        return false;
    }
}
