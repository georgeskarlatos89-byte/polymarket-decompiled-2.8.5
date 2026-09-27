package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class lub extends cne implements tlc, x5c {
    public static final iub o = iub.i;
    public jub f;
    public Function1 g;
    public ene h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final mub l = new mub(this, 0);
    public pb m;
    public iqc n;

    public static void W0(x8d x8dVar) {
        LayoutNode layoutNode;
        kxa kxaVar;
        x8d x8dVar2 = x8dVar.s;
        LayoutNode layoutNode2 = x8dVar.p;
        if (x8dVar2 != null) {
            layoutNode = x8dVar2.p;
        } else {
            layoutNode = null;
        }
        if (!Intrinsics.areEqual(layoutNode, layoutNode2)) {
            layoutNode2.getLayoutDelegate().p.y.f();
            return;
        }
        pn e = layoutNode2.getLayoutDelegate().p.e();
        if (e != null && (kxaVar = ((u5c) e).y) != null) {
            kxaVar.f();
        }
    }

    @Override // defpackage.x5c
    public final w5c C0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kw9.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new wj0(i, i2, map, function1, function12, this, 1);
    }

    public abstract int D0(kn knVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(ene eneVar, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c2;
        long j6;
        lub lubVar;
        jqc jqcVar;
        gpd snapshotObserver;
        iqc iqcVar = this.n;
        pb pbVar = this.m;
        if (pbVar == null) {
            pbVar = new pb();
            this.m = pbVar;
        }
        pb pbVar2 = pbVar;
        Owner owner = R0().o;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(eneVar, o, new kub(this, j, j2, eneVar));
        }
        boolean I = I();
        jqc jqcVar2 = (jqc) pbVar2.e;
        jqc jqcVar3 = (jqc) pbVar2.f;
        int i2 = pbVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) pbVar2.d)[i3];
            if (b == 3) {
                vc9 vc9Var = ((vc9[]) pbVar2.b)[i3];
                vc9Var.getClass();
                jqcVar3.k(vc9Var);
            } else if (b != 0 && iqcVar != null) {
                vc9 vc9Var2 = ((vc9[]) pbVar2.b)[i3];
                vc9Var2.getClass();
                jqc jqcVar4 = (jqc) iqcVar.k(vc9Var2);
                if (jqcVar4 != null) {
                    jqcVar2.j(jqcVar4);
                }
            }
        }
        int i4 = pbVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) pbVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                vc9[] vc9VarArr = (vc9[]) pbVar2.b;
                vc9VarArr[i6 - i5] = vc9VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = pbVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((vc9[]) pbVar2.b)[i8] = null;
        }
        pbVar2.a -= i5;
        lub T0 = T0();
        Object[] objArr = jqcVar3.b;
        long[] jArr = jqcVar3.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            vc9 vc9Var3 = (vc9) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (T0 == null) {
                                lubVar = this;
                            } else {
                                lubVar = T0;
                            }
                            i = i9;
                            lub lubVar2 = lubVar;
                            while (true) {
                                pb pbVar3 = lubVar2.m;
                                if (pbVar3 != null) {
                                    z2 = I;
                                    if (ArraysKt.i(vc9Var3, (vc9[]) pbVar3.b)) {
                                        break;
                                    }
                                } else {
                                    z2 = I;
                                }
                                lub T02 = lubVar2.T0();
                                if (T02 == null) {
                                    break;
                                }
                                lubVar2 = T02;
                                I = z2;
                            }
                            iqc iqcVar2 = lubVar2.n;
                            if (iqcVar2 != null) {
                                jqcVar = (jqc) iqcVar2.k(vc9Var3);
                            } else {
                                jqcVar = null;
                            }
                            if (jqcVar != null) {
                                lubVar.X0(jqcVar);
                            }
                        } else {
                            z2 = I;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        I = z2;
                    }
                    z = I;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = I;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                I = z;
                i9 = 8;
            }
        } else {
            z = I;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        jqcVar3.e();
        Object[] objArr2 = jqcVar2.b;
        long[] jArr2 = jqcVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((zgk) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.o0(false);
                            } else {
                                layoutNode.q0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        jqcVar2.e();
    }

    @Override // defpackage.y6a
    public boolean I() {
        return false;
    }

    public final void I0(w5c w5cVar) {
        boolean z;
        long j;
        long j2;
        iqc iqcVar = this.n;
        if (!this.k) {
            Function1 c = w5cVar.c();
            boolean z2 = false;
            if (c == null) {
                if (iqcVar != null) {
                    Object[] objArr = iqcVar.c;
                    long[] jArr = iqcVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j3 = jArr[i];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j3) < 128) {
                                        X0((jqc) objArr[(i << 3) + i3]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    iqcVar.g();
                    return;
                }
                return;
            }
            if (this.g != c) {
                z = true;
            } else {
                z = false;
            }
            if (!z && V0().a) {
                nwa N0 = N0();
                long m = frm.m(N0.P(0L));
                long h = N0.h();
                if (!e1a.b(m, V0().b) || !n1a.b(h, V0().c)) {
                    z2 = true;
                }
                j2 = m;
                j = h;
                z = z2;
            } else {
                j = 0;
                j2 = 9223372034707292159L;
            }
            if (z) {
                ene eneVar = this.h;
                if (eneVar != null) {
                    eneVar.a = w5cVar;
                } else {
                    eneVar = new ene(w5cVar, this);
                    this.h = eneVar;
                }
                E0(eneVar, j2, j);
                this.g = w5cVar.c();
            }
        }
    }

    public abstract lub L0();

    public abstract nwa N0();

    public abstract boolean Q0();

    public abstract LayoutNode R0();

    public abstract w5c S0();

    public abstract lub T0();

    public abstract long U0();

    public final jub V0() {
        jub jubVar = this.f;
        if (jubVar == null) {
            jub jubVar2 = new jub(this);
            this.f = jubVar2;
            return jubVar2;
        }
        return jubVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(jqc jqcVar) {
        LayoutNode layoutNode;
        Object[] objArr = jqcVar.b;
        long[] jArr = jqcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((zgk) objArr[(i << 3) + i3]).get()) != null) {
                            if (I()) {
                                layoutNode.o0(false);
                            } else {
                                layoutNode.q0(false);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void Y0();

    @Override // defpackage.cne
    public final int b0(kn knVar) {
        int D0;
        long j;
        if (!Q0() || (D0 = D0(knVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = knVar instanceof p7k;
        long j2 = this.e;
        if (z) {
            j = j2 >> 32;
        } else {
            j = 4294967295L & j2;
        }
        return D0 + ((int) j);
    }

    @Override // defpackage.tlc
    public final void q(boolean z) {
        LayoutNode layoutNode;
        exa exaVar;
        lub T0 = T0();
        exa exaVar2 = null;
        if (T0 != null) {
            layoutNode = T0.R0();
        } else {
            layoutNode = null;
        }
        if (Intrinsics.areEqual(layoutNode, R0())) {
            this.i = z;
            return;
        }
        if (layoutNode != null) {
            exaVar = layoutNode.t();
        } else {
            exaVar = null;
        }
        if (exaVar != exa.LayingOut) {
            if (layoutNode != null) {
                exaVar2 = layoutNode.t();
            }
            if (exaVar2 != exa.LookaheadLayingOut) {
                return;
            }
        }
        this.i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(LayoutNode layoutNode, vc9 vc9Var) {
        char c;
        long j;
        long j2;
        long j3;
        iqc iqcVar;
        iqc iqcVar2;
        int i;
        int i2;
        Object d;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i3;
        char c2;
        long j5;
        int i4;
        int i5;
        int i6;
        boolean z;
        iqc iqcVar3 = this.n;
        char c3 = 7;
        long j6 = -9187201950435737472L;
        int i7 = 8;
        if (iqcVar3 != null) {
            Object[] objArr = iqcVar3.c;
            long[] jArr3 = iqcVar3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j7 = jArr3[i8];
                    j3 = 255;
                    if ((((~j7) << c3) & j7 & j6) != j6) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j7 & 255) < 128) {
                                c2 = c3;
                                jqc jqcVar = (jqc) objArr[(i8 << 3) + i10];
                                j5 = j6;
                                Object[] objArr2 = jqcVar.b;
                                long[] jArr4 = jqcVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i7;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = length2;
                                        long j8 = jArr4[i12];
                                        jArr2 = jArr3;
                                        j4 = j7;
                                        if ((((~j8) << c2) & j8 & j5) != j5) {
                                            int i14 = 8 - ((~(i12 - i13)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j8 & 255) < 128) {
                                                    int i16 = (i12 << 3) + i15;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((zgk) objArr2[i16]).get();
                                                    i5 = i15;
                                                    if (layoutNode2 != null) {
                                                        boolean S = layoutNode2.S();
                                                        i6 = i10;
                                                        if (S) {
                                                            z = true;
                                                            if (z) {
                                                                jqcVar.m(i16);
                                                            }
                                                        }
                                                    } else {
                                                        i6 = i10;
                                                    }
                                                    z = false;
                                                    if (z) {
                                                    }
                                                } else {
                                                    i5 = i15;
                                                    i6 = i10;
                                                }
                                                j8 >>= i11;
                                                i15 = i5 + 1;
                                                i10 = i6;
                                            }
                                            i3 = i10;
                                            if (i14 != i11) {
                                                break;
                                            }
                                        } else {
                                            i3 = i10;
                                        }
                                        length2 = i13;
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        j7 = j4;
                                        i10 = i3;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j7;
                                    i3 = i10;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j7;
                                i3 = i10;
                                c2 = c3;
                                j5 = j6;
                                i4 = i7;
                            }
                            i7 = i4;
                            j7 = j4 >> i4;
                            c3 = c2;
                            j6 = j5;
                            i10 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j6;
                        if (i9 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j6;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c3 = c;
                    j6 = j;
                    jArr3 = jArr;
                    i7 = 8;
                }
                iqcVar = this.n;
                if (iqcVar != null) {
                    long[] jArr5 = iqcVar.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j9 = jArr5[i17];
                            if ((((~j9) << c) & j9 & j) != j) {
                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j9 & j3) < j2) {
                                        int i20 = (i17 << 3) + i19;
                                        if (((jqc) iqcVar.c[i20]).b()) {
                                            iqcVar.l(i20);
                                        }
                                    }
                                    j9 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                }
                            }
                            if (i17 == length3) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                iqcVar2 = this.n;
                if (iqcVar2 != null) {
                    i = 0;
                    i2 = 1;
                    iqcVar2 = new iqc(0, 1, null);
                    this.n = iqcVar2;
                } else {
                    i = 0;
                    i2 = 1;
                }
                d = iqcVar2.d(vc9Var);
                if (d == null) {
                    d = new jqc(i, i2, null);
                    iqcVar2.m(vc9Var, d);
                }
                ((jqc) d).k(new WeakReference(layoutNode));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        iqcVar = this.n;
        if (iqcVar != null) {
        }
        iqcVar2 = this.n;
        if (iqcVar2 != null) {
        }
        d = iqcVar2.d(vc9Var);
        if (d == null) {
        }
        ((jqc) d).k(new WeakReference(layoutNode));
    }
}
