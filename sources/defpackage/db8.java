package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class db8 extends p69 {
    public int A0;
    public fb1 B0;
    public yaf C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public nz4[] X0;
    public nz4[] Y0;
    public int[] Z0;
    public nz4[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.p69
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            nz4 nz4Var = this.q0[i];
            if (nz4Var != null) {
                nz4Var.F = true;
            }
        }
    }

    public final int T(nz4 nz4Var, int i) {
        nz4 nz4Var2;
        if (nz4Var == null) {
            return 0;
        }
        mz4[] mz4VarArr = nz4Var.T;
        if (mz4VarArr[1] == mz4.MATCH_CONSTRAINT) {
            int i2 = nz4Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (nz4Var.z * i);
                if (i3 != nz4Var.k()) {
                    nz4Var.g = true;
                    V(nz4Var, mz4VarArr[0], nz4Var.q(), mz4.FIXED, i3);
                }
                return i3;
            }
            nz4Var2 = nz4Var;
            if (i2 == 1) {
                return nz4Var2.k();
            }
            if (i2 == 3) {
                return (int) ((nz4Var2.q() * nz4Var2.X) + 0.5f);
            }
        } else {
            nz4Var2 = nz4Var;
        }
        return nz4Var2.k();
    }

    public final int U(nz4 nz4Var, int i) {
        nz4 nz4Var2;
        if (nz4Var == null) {
            return 0;
        }
        mz4[] mz4VarArr = nz4Var.T;
        if (mz4VarArr[0] == mz4.MATCH_CONSTRAINT) {
            int i2 = nz4Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (nz4Var.w * i);
                if (i3 != nz4Var.q()) {
                    nz4Var.g = true;
                    V(nz4Var, mz4.FIXED, i3, mz4VarArr[1], nz4Var.k());
                }
                return i3;
            }
            nz4Var2 = nz4Var;
            if (i2 == 1) {
                return nz4Var2.q();
            }
            if (i2 == 3) {
                return (int) ((nz4Var2.k() * nz4Var2.X) + 0.5f);
            }
        } else {
            nz4Var2 = nz4Var;
        }
        return nz4Var2.q();
    }

    public final void V(nz4 nz4Var, mz4 mz4Var, int i, mz4 mz4Var2, int i2) {
        yaf yafVar;
        oz4 oz4Var;
        fb1 fb1Var = this.B0;
        while (true) {
            yafVar = this.C0;
            if (yafVar != null || (oz4Var = this.U) == null) {
                break;
            } else {
                this.C0 = oz4Var.u0;
            }
        }
        fb1Var.a = mz4Var;
        fb1Var.b = mz4Var2;
        fb1Var.c = i;
        fb1Var.d = i2;
        yafVar.d(nz4Var, fb1Var);
        nz4Var.O(fb1Var.e);
        nz4Var.L(fb1Var.f);
        nz4Var.E = fb1Var.h;
        nz4Var.I(fb1Var.g);
    }

    @Override // defpackage.nz4
    public final void b(a9b a9bVar, boolean z) {
        boolean z2;
        boolean z3;
        nz4 nz4Var;
        float f;
        int i;
        boolean z4;
        ArrayList arrayList = this.W0;
        super.b(a9bVar, z);
        oz4 oz4Var = this.U;
        if (oz4Var != null && oz4Var.v0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            cb8 cb8Var = (cb8) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            cb8Var.b(i3, z2, z4);
                        }
                    }
                } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                    for (int i4 = 0; i4 < this.b1; i4++) {
                        this.a1[i4].D();
                    }
                    int[] iArr = this.Z0;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.J0;
                    nz4 nz4Var2 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.J0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        nz4 nz4Var3 = this.Y0[i];
                        if (nz4Var3 != null) {
                            py4 py4Var = nz4Var3.I;
                            if (nz4Var3.h0 != 8) {
                                if (i7 == 0) {
                                    nz4Var3.f(py4Var, this.I, this.w0);
                                    nz4Var3.j0 = this.D0;
                                    nz4Var3.e0 = f;
                                }
                                if (i7 == i5 - 1) {
                                    nz4Var3.f(nz4Var3.K, this.K, this.x0);
                                }
                                if (i7 > 0 && nz4Var2 != null) {
                                    py4 py4Var2 = nz4Var2.K;
                                    nz4Var3.f(py4Var, py4Var2, this.P0);
                                    nz4Var2.f(py4Var2, py4Var, 0);
                                }
                                nz4Var2 = nz4Var3;
                            }
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i8 = 0; i8 < i6; i8++) {
                        nz4 nz4Var4 = this.X0[i8];
                        if (nz4Var4 != null) {
                            py4 py4Var3 = nz4Var4.J;
                            if (nz4Var4.h0 != 8) {
                                if (i8 == 0) {
                                    nz4Var4.f(py4Var3, this.J, this.s0);
                                    nz4Var4.k0 = this.E0;
                                    nz4Var4.f0 = this.K0;
                                }
                                if (i8 == i6 - 1) {
                                    nz4Var4.f(nz4Var4.L, this.L, this.t0);
                                }
                                if (i8 > 0 && nz4Var2 != null) {
                                    py4 py4Var4 = nz4Var2.L;
                                    nz4Var4.f(py4Var3, py4Var4, this.Q0);
                                    nz4Var2.f(py4Var4, py4Var3, 0);
                                }
                                nz4Var2 = nz4Var4;
                            }
                        }
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            int i11 = (i10 * i5) + i9;
                            if (this.V0 == 1) {
                                i11 = (i9 * i6) + i10;
                            }
                            nz4[] nz4VarArr = this.a1;
                            if (i11 < nz4VarArr.length && (nz4Var = nz4VarArr[i11]) != null && nz4Var.h0 != 8) {
                                nz4 nz4Var5 = this.Y0[i9];
                                nz4 nz4Var6 = this.X0[i10];
                                if (nz4Var != nz4Var5) {
                                    nz4Var.f(nz4Var.I, nz4Var5.I, 0);
                                    nz4Var.f(nz4Var.K, nz4Var5.K, 0);
                                }
                                if (nz4Var != nz4Var6) {
                                    nz4Var.f(nz4Var.J, nz4Var6.J, 0);
                                    nz4Var.f(nz4Var.L, nz4Var6.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    cb8 cb8Var2 = (cb8) arrayList.get(i12);
                    if (i12 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cb8Var2.b(i12, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((cb8) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
