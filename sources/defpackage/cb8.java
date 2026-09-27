package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cb8 {
    public int a;
    public py4 d;
    public py4 e;
    public py4 f;
    public py4 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ db8 r;
    public nz4 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public cb8(db8 db8Var, int i, py4 py4Var, py4 py4Var2, py4 py4Var3, py4 py4Var4, int i2) {
        this.r = db8Var;
        this.a = i;
        this.d = py4Var;
        this.e = py4Var2;
        this.f = py4Var3;
        this.g = py4Var4;
        this.h = db8Var.w0;
        this.i = db8Var.s0;
        this.j = db8Var.x0;
        this.k = db8Var.t0;
        this.q = i2;
    }

    public final void a(nz4 nz4Var) {
        int i = this.a;
        int i2 = this.q;
        int i3 = 0;
        db8 db8Var = this.r;
        if (i == 0) {
            int U = db8Var.U(nz4Var, i2);
            if (nz4Var.T[0] == mz4.MATCH_CONSTRAINT) {
                this.p++;
                U = 0;
            }
            int i4 = db8Var.P0;
            if (nz4Var.h0 != 8) {
                i3 = i4;
            }
            this.l = U + i3 + this.l;
            int T = db8Var.T(nz4Var, this.q);
            if (this.b == null || this.c < T) {
                this.b = nz4Var;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = db8Var.U(nz4Var, i2);
            int T2 = db8Var.T(nz4Var, this.q);
            if (nz4Var.T[1] == mz4.MATCH_CONSTRAINT) {
                this.p++;
                T2 = 0;
            }
            int i5 = db8Var.Q0;
            if (nz4Var.h0 != 8) {
                i3 = i5;
            }
            this.m = T2 + i3 + this.m;
            if (this.b == null || this.c < U2) {
                this.b = nz4Var;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        db8 db8Var;
        boolean z3;
        int i2;
        int i3;
        int i4;
        nz4 nz4Var;
        int i5;
        boolean z4;
        int i6;
        int i7;
        char c;
        float f;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12 = this.o;
        int i13 = 0;
        while (true) {
            db8Var = this.r;
            if (i13 >= i12 || (i11 = this.n + i13) >= db8Var.b1) {
                break;
            }
            nz4 nz4Var2 = db8Var.a1[i11];
            if (nz4Var2 != null) {
                nz4Var2.D();
            }
            i13++;
        }
        if (i12 != 0 && this.b != null) {
            if (z2 && i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                if (z) {
                    i10 = (i12 - 1) - i16;
                } else {
                    i10 = i16;
                }
                int i17 = this.n + i10;
                if (i17 >= db8Var.b1) {
                    break;
                }
                nz4 nz4Var3 = db8Var.a1[i17];
                if (nz4Var3 != null && nz4Var3.h0 == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            int i18 = this.a;
            nz4 nz4Var4 = this.b;
            if (i18 == 0) {
                nz4Var4.k0 = db8Var.E0;
                py4 py4Var = nz4Var4.L;
                py4 py4Var2 = nz4Var4.J;
                int i19 = this.i;
                if (i > 0) {
                    i19 += db8Var.Q0;
                }
                py4Var2.a(this.e, i19);
                if (z2) {
                    py4Var.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.L.a(py4Var2, 0);
                }
                if (db8Var.S0 == 3 && !nz4Var4.E) {
                    for (int i20 = 0; i20 < i12; i20++) {
                        if (z) {
                            i9 = (i12 - 1) - i20;
                        } else {
                            i9 = i20;
                        }
                        int i21 = this.n + i9;
                        if (i21 >= db8Var.b1) {
                            break;
                        }
                        nz4Var = db8Var.a1[i21];
                        if (nz4Var.E) {
                            break;
                        }
                    }
                }
                nz4Var = nz4Var4;
                int i22 = 0;
                nz4 nz4Var5 = null;
                while (i22 < i12) {
                    if (z) {
                        i5 = (i12 - 1) - i22;
                    } else {
                        i5 = i22;
                    }
                    int i23 = this.n + i5;
                    if (i23 < db8Var.b1) {
                        nz4 nz4Var6 = db8Var.a1[i23];
                        if (nz4Var6 == null) {
                            i7 = i12;
                            z4 = z3;
                            i6 = i15;
                            c = 3;
                        } else {
                            py4 py4Var3 = nz4Var6.J;
                            py4 py4Var4 = nz4Var6.L;
                            py4 py4Var5 = nz4Var6.I;
                            z4 = z3;
                            if (i22 == 0) {
                                i6 = i15;
                                nz4Var6.f(py4Var5, this.d, this.h);
                            } else {
                                i6 = i15;
                            }
                            if (i5 == 0) {
                                int i24 = db8Var.D0;
                                float f3 = db8Var.J0;
                                if (z) {
                                    f3 = 1.0f - f3;
                                }
                                if (this.n == 0) {
                                    i8 = db8Var.F0;
                                    f = f3;
                                    if (i8 != -1) {
                                        f2 = db8Var.L0;
                                    }
                                } else {
                                    f = f3;
                                }
                                if (z2 && (i8 = db8Var.H0) != -1) {
                                    f2 = db8Var.N0;
                                } else {
                                    i8 = i24;
                                    f2 = f;
                                }
                                nz4Var6.j0 = i8;
                                nz4Var6.e0 = f2;
                            }
                            if (i22 == i12 - 1) {
                                i7 = i12;
                                nz4Var6.f(nz4Var6.K, this.f, this.j);
                            } else {
                                i7 = i12;
                            }
                            if (nz4Var5 != null) {
                                py4 py4Var6 = nz4Var5.K;
                                py4Var5.a(py4Var6, db8Var.P0);
                                if (i22 == i14) {
                                    int i25 = this.h;
                                    if (py4Var5.h()) {
                                        py4Var5.h = i25;
                                    }
                                }
                                py4Var6.a(py4Var5, 0);
                                if (i22 == i6 + 1) {
                                    int i26 = this.j;
                                    if (py4Var6.h()) {
                                        py4Var6.h = i26;
                                    }
                                }
                            }
                            if (nz4Var6 != nz4Var4) {
                                int i27 = db8Var.S0;
                                c = 3;
                                if (i27 == 3 && nz4Var.E && nz4Var6 != nz4Var && nz4Var6.E) {
                                    nz4Var6.M.a(nz4Var.M, 0);
                                } else if (i27 != 0) {
                                    if (i27 != 1) {
                                        if (z4) {
                                            py4Var3.a(this.e, this.i);
                                            py4Var4.a(this.g, this.k);
                                        } else {
                                            py4Var3.a(py4Var2, 0);
                                            py4Var4.a(py4Var, 0);
                                        }
                                    } else {
                                        py4Var4.a(py4Var, 0);
                                    }
                                } else {
                                    py4Var3.a(py4Var2, 0);
                                }
                            } else {
                                c = 3;
                            }
                            nz4Var5 = nz4Var6;
                        }
                        i22++;
                        z3 = z4;
                        i15 = i6;
                        i12 = i7;
                    } else {
                        return;
                    }
                }
                return;
            }
            int i28 = i12;
            boolean z5 = z3;
            int i29 = i15;
            nz4Var4.j0 = db8Var.D0;
            py4 py4Var7 = nz4Var4.I;
            py4 py4Var8 = nz4Var4.K;
            int i30 = this.h;
            if (i > 0) {
                i30 += db8Var.P0;
            }
            if (z) {
                py4Var8.a(this.f, i30);
                if (z2) {
                    py4Var7.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.I.a(py4Var8, 0);
                }
            } else {
                py4Var7.a(this.d, i30);
                if (z2) {
                    py4Var8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.K.a(py4Var7, 0);
                }
            }
            int i31 = 0;
            nz4 nz4Var7 = null;
            while (true) {
                int i32 = i28;
                if (i31 < i32 && (i2 = this.n + i31) < db8Var.b1) {
                    nz4 nz4Var8 = db8Var.a1[i2];
                    if (nz4Var8 == null) {
                        i28 = i32;
                    } else {
                        py4 py4Var9 = nz4Var8.I;
                        py4 py4Var10 = nz4Var8.J;
                        py4 py4Var11 = nz4Var8.K;
                        if (i31 == 0) {
                            nz4Var8.f(py4Var10, this.e, this.i);
                            int i33 = db8Var.E0;
                            float f4 = db8Var.K0;
                            if (this.n == 0) {
                                i4 = db8Var.G0;
                                i28 = i32;
                                i3 = -1;
                                if (i4 != -1) {
                                    f4 = db8Var.M0;
                                    i33 = i4;
                                    nz4Var8.k0 = i33;
                                    nz4Var8.f0 = f4;
                                }
                            } else {
                                i28 = i32;
                                i3 = -1;
                            }
                            if (z2 && (i4 = db8Var.I0) != i3) {
                                f4 = db8Var.O0;
                                i33 = i4;
                            }
                            nz4Var8.k0 = i33;
                            nz4Var8.f0 = f4;
                        } else {
                            i28 = i32;
                        }
                        if (i31 == i28 - 1) {
                            nz4Var8.f(nz4Var8.L, this.g, this.k);
                        }
                        if (nz4Var7 != null) {
                            py4 py4Var12 = nz4Var7.L;
                            py4Var10.a(py4Var12, db8Var.Q0);
                            if (i31 == i14) {
                                int i34 = this.i;
                                if (py4Var10.h()) {
                                    py4Var10.h = i34;
                                }
                            }
                            py4Var12.a(py4Var10, 0);
                            if (i31 == i29 + 1) {
                                int i35 = this.k;
                                if (py4Var12.h()) {
                                    py4Var12.h = i35;
                                }
                            }
                        }
                        if (nz4Var8 != nz4Var4) {
                            int i36 = db8Var.R0;
                            if (z) {
                                if (i36 != 0) {
                                    if (i36 != 1) {
                                        if (i36 == 2) {
                                            py4Var9.a(py4Var7, 0);
                                            py4Var11.a(py4Var8, 0);
                                        }
                                    } else {
                                        py4Var9.a(py4Var7, 0);
                                    }
                                } else {
                                    py4Var11.a(py4Var8, 0);
                                }
                            } else {
                                if (i36 != 0) {
                                    if (i36 != 1) {
                                        if (i36 == 2) {
                                            if (z5) {
                                                py4Var9.a(this.d, this.h);
                                                py4Var11.a(this.f, this.j);
                                            } else {
                                                py4Var9.a(py4Var7, 0);
                                                py4Var11.a(py4Var8, 0);
                                            }
                                        }
                                    } else {
                                        py4Var11.a(py4Var8, 0);
                                    }
                                } else {
                                    py4Var9.a(py4Var7, 0);
                                }
                                nz4Var7 = nz4Var8;
                            }
                        }
                        nz4Var7 = nz4Var8;
                    }
                    i31++;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        if (i == 1) {
            return i2 - this.r.Q0;
        }
        return i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        if (i == 0) {
            return i2 - this.r.P0;
        }
        return i2;
    }

    public final void e(int i) {
        db8 db8Var;
        int i2;
        int i3 = this.p;
        if (i3 != 0) {
            int i4 = this.o;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                db8Var = this.r;
                if (i6 >= i4 || (i2 = this.n + i6) >= db8Var.b1) {
                    break;
                }
                nz4 nz4Var = db8Var.a1[i2];
                if (this.a == 0) {
                    if (nz4Var != null) {
                        mz4[] mz4VarArr = nz4Var.T;
                        if (mz4VarArr[0] == mz4.MATCH_CONSTRAINT && nz4Var.r == 0) {
                            db8Var.V(nz4Var, mz4.FIXED, i5, mz4VarArr[1], nz4Var.k());
                        }
                    }
                } else if (nz4Var != null) {
                    mz4[] mz4VarArr2 = nz4Var.T;
                    if (mz4VarArr2[1] == mz4.MATCH_CONSTRAINT && nz4Var.s == 0) {
                        int i7 = i5;
                        db8Var.V(nz4Var, mz4VarArr2[0], nz4Var.q(), mz4.FIXED, i7);
                        i5 = i7;
                    }
                }
                i6++;
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i8 = this.o;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.n + i9;
                if (i10 < db8Var.b1) {
                    nz4 nz4Var2 = db8Var.a1[i10];
                    if (this.a == 0) {
                        int q = nz4Var2.q();
                        int i11 = db8Var.P0;
                        if (nz4Var2.h0 == 8) {
                            i11 = 0;
                        }
                        this.l = q + i11 + this.l;
                        int T = db8Var.T(nz4Var2, this.q);
                        if (this.b == null || this.c < T) {
                            this.b = nz4Var2;
                            this.c = T;
                            this.m = T;
                        }
                    } else {
                        int U = db8Var.U(nz4Var2, this.q);
                        int T2 = db8Var.T(nz4Var2, this.q);
                        int i12 = db8Var.Q0;
                        if (nz4Var2.h0 == 8) {
                            i12 = 0;
                        }
                        this.m = T2 + i12 + this.m;
                        if (this.b == null || this.c < U) {
                            this.b = nz4Var2;
                            this.c = U;
                            this.l = U;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, py4 py4Var, py4 py4Var2, py4 py4Var3, py4 py4Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = py4Var;
        this.e = py4Var2;
        this.f = py4Var3;
        this.g = py4Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
