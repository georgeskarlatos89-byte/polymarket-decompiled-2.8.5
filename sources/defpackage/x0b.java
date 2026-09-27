package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x0b extends jjc implements ywa, cd1, ad1 {
    public static final u0b s = new Object();
    public y0b o;
    public s0b p;
    public boolean q;
    public xmd r;

    @Override // defpackage.ywa
    public final w5c c(x5c x5cVar, o5c o5cVar, long j) {
        cne T = o5cVar.T(j);
        return x5c.r0(x5cVar, T.a, T.b, new t1(T, 17));
    }

    public final boolean c1(r0b r0bVar, int i) {
        if (i == 5 || i == 6) {
            if (this.r == xmd.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.r == xmd.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            dmk.n("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (d1(i)) {
            if (r0bVar.b >= this.o.a() - 1) {
                return false;
            }
        } else if (r0bVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean d1(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 5) {
                    return this.q;
                }
                if (i == 6) {
                    if (this.q) {
                        return false;
                    }
                } else if (i == 3) {
                    int i2 = v0b.a[nj6.h(this).A.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (this.q) {
                                return false;
                            }
                        } else {
                            dmk.a();
                            return false;
                        }
                    } else {
                        return this.q;
                    }
                } else if (i == 4) {
                    int i3 = v0b.a[nj6.h(this).A.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return this.q;
                        }
                        dmk.a();
                        return false;
                    }
                    if (this.q) {
                        return false;
                    }
                } else {
                    dmk.n("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
