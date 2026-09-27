package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o69 extends jkk {
    @Override // defpackage.ql6
    public final void a(ql6 ql6Var) {
        a81 a81Var = (a81) this.b;
        int i = a81Var.s0;
        xl6 xl6Var = this.h;
        Iterator it = xl6Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((xl6) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            xl6Var.d(i2 + a81Var.u0);
        } else {
            xl6Var.d(i3 + a81Var.u0);
        }
    }

    @Override // defpackage.jkk
    public final void d() {
        nz4 nz4Var = this.b;
        if (nz4Var instanceof a81) {
            xl6 xl6Var = this.h;
            xl6Var.b = true;
            ArrayList arrayList = xl6Var.l;
            a81 a81Var = (a81) nz4Var;
            int i = a81Var.s0;
            boolean z = a81Var.t0;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            xl6Var.e = wl6.BOTTOM;
                            while (i2 < a81Var.r0) {
                                nz4 nz4Var2 = a81Var.q0[i2];
                                if (z || nz4Var2.h0 != 8) {
                                    xl6 xl6Var2 = nz4Var2.e.i;
                                    xl6Var2.k.add(xl6Var);
                                    arrayList.add(xl6Var2);
                                }
                                i2++;
                            }
                            m(this.b.e.h);
                            m(this.b.e.i);
                            return;
                        }
                        return;
                    }
                    xl6Var.e = wl6.TOP;
                    while (i2 < a81Var.r0) {
                        nz4 nz4Var3 = a81Var.q0[i2];
                        if (z || nz4Var3.h0 != 8) {
                            xl6 xl6Var3 = nz4Var3.e.h;
                            xl6Var3.k.add(xl6Var);
                            arrayList.add(xl6Var3);
                        }
                        i2++;
                    }
                    m(this.b.e.h);
                    m(this.b.e.i);
                    return;
                }
                xl6Var.e = wl6.RIGHT;
                while (i2 < a81Var.r0) {
                    nz4 nz4Var4 = a81Var.q0[i2];
                    if (z || nz4Var4.h0 != 8) {
                        xl6 xl6Var4 = nz4Var4.d.i;
                        xl6Var4.k.add(xl6Var);
                        arrayList.add(xl6Var4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            xl6Var.e = wl6.LEFT;
            while (i2 < a81Var.r0) {
                nz4 nz4Var5 = a81Var.q0[i2];
                if (z || nz4Var5.h0 != 8) {
                    xl6 xl6Var5 = nz4Var5.d.h;
                    xl6Var5.k.add(xl6Var);
                    arrayList.add(xl6Var5);
                }
                i2++;
            }
            m(this.b.d.h);
            m(this.b.d.i);
        }
    }

    @Override // defpackage.jkk
    public final void e() {
        nz4 nz4Var = this.b;
        if (nz4Var instanceof a81) {
            int i = ((a81) nz4Var).s0;
            xl6 xl6Var = this.h;
            if (i != 0 && i != 1) {
                nz4Var.a0 = xl6Var.g;
            } else {
                nz4Var.Z = xl6Var.g;
            }
        }
    }

    @Override // defpackage.jkk
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.jkk
    public final boolean k() {
        return false;
    }

    public final void m(xl6 xl6Var) {
        xl6 xl6Var2 = this.h;
        xl6Var2.k.add(xl6Var);
        xl6Var.l.add(xl6Var2);
    }
}
