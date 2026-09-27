package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jkk implements ql6 {
    public int a;
    public nz4 b;
    public obg c;
    public mz4 d;
    public final gt6 e = new gt6(this);
    public int f = 0;
    public boolean g = false;
    public final xl6 h = new xl6(this);
    public final xl6 i = new xl6(this);
    public ikk j = ikk.NONE;

    public jkk(nz4 nz4Var) {
        this.b = nz4Var;
    }

    public static void b(xl6 xl6Var, xl6 xl6Var2, int i) {
        xl6Var.l.add(xl6Var2);
        xl6Var.f = i;
        xl6Var2.k.add(xl6Var);
    }

    public static xl6 h(py4 py4Var) {
        py4 py4Var2 = py4Var.f;
        if (py4Var2 != null) {
            nz4 nz4Var = py4Var2.d;
            int i = hkk.a[py4Var2.e.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return nz4Var.e.i;
                        }
                        return nz4Var.e.k;
                    }
                    return nz4Var.e.h;
                }
                return nz4Var.d.i;
            }
            return nz4Var.d.h;
        }
        return null;
    }

    public static xl6 i(py4 py4Var, int i) {
        jkk jkkVar;
        py4 py4Var2 = py4Var.f;
        if (py4Var2 != null) {
            nz4 nz4Var = py4Var2.d;
            if (i == 0) {
                jkkVar = nz4Var.d;
            } else {
                jkkVar = nz4Var.e;
            }
            int i2 = hkk.a[py4Var2.e.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return null;
                        }
                    }
                }
                return jkkVar.i;
            }
            return jkkVar.h;
        }
        return null;
    }

    public final void c(xl6 xl6Var, xl6 xl6Var2, int i, gt6 gt6Var) {
        xl6Var.l.add(xl6Var2);
        xl6Var.l.add(this.e);
        xl6Var.h = i;
        xl6Var.i = gt6Var;
        xl6Var2.k.add(xl6Var);
        gt6Var.k.add(xl6Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        nz4 nz4Var = this.b;
        if (i2 == 0) {
            int i3 = nz4Var.v;
            int max = Math.max(nz4Var.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = nz4Var.y;
            int max2 = Math.max(nz4Var.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(py4 py4Var, py4 py4Var2, int i) {
        float f;
        jkk jkkVar;
        float f2;
        int i2;
        xl6 h = h(py4Var);
        xl6 h2 = h(py4Var2);
        if (h.j && h2.j) {
            int e = py4Var.e() + h.g;
            int e2 = h2.g - py4Var2.e();
            int i3 = e2 - e;
            gt6 gt6Var = this.e;
            if (!gt6Var.j) {
                mz4 mz4Var = this.d;
                mz4 mz4Var2 = mz4.MATCH_CONSTRAINT;
                if (mz4Var == mz4Var2) {
                    int i4 = this.a;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    nz4 nz4Var = this.b;
                                    jkk jkkVar2 = nz4Var.d;
                                    if (jkkVar2.d == mz4Var2 && jkkVar2.a == 3) {
                                        x7k x7kVar = nz4Var.e;
                                        if (x7kVar.d == mz4Var2) {
                                        }
                                    }
                                    if (i == 0) {
                                        jkkVar2 = nz4Var.e;
                                    }
                                    gt6 gt6Var2 = jkkVar2.e;
                                    if (gt6Var2.j) {
                                        float f3 = nz4Var.X;
                                        int i5 = gt6Var2.g;
                                        if (i == 1) {
                                            i2 = (int) ((i5 / f3) + 0.5f);
                                        } else {
                                            i2 = (int) ((f3 * i5) + 0.5f);
                                        }
                                        gt6Var.d(i2);
                                    }
                                }
                            } else {
                                nz4 nz4Var2 = this.b;
                                oz4 oz4Var = nz4Var2.U;
                                if (oz4Var != null) {
                                    if (i == 0) {
                                        jkkVar = oz4Var.d;
                                    } else {
                                        jkkVar = oz4Var.e;
                                    }
                                    if (jkkVar.e.j) {
                                        if (i == 0) {
                                            f2 = nz4Var2.w;
                                        } else {
                                            f2 = nz4Var2.z;
                                        }
                                        gt6Var.d(g((int) ((r6.g * f2) + 0.5f), i));
                                    }
                                }
                            }
                        } else {
                            gt6Var.d(Math.min(g(gt6Var.m, i), i3));
                        }
                    } else {
                        gt6Var.d(g(i3, i));
                    }
                }
            }
            if (gt6Var.j) {
                int i6 = gt6Var.g;
                xl6 xl6Var = this.i;
                xl6 xl6Var2 = this.h;
                if (i6 == i3) {
                    xl6Var2.d(e);
                    xl6Var.d(e2);
                    return;
                }
                nz4 nz4Var3 = this.b;
                if (i == 0) {
                    f = nz4Var3.e0;
                } else {
                    f = nz4Var3.f0;
                }
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f = 0.5f;
                }
                xl6Var2.d((int) ((((e2 - e) - i6) * f) + e + 0.5f));
                xl6Var.d(xl6Var2.g + gt6Var.g);
            }
        }
    }
}
