package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aah;
import defpackage.bd0;
import defpackage.c7;
import defpackage.d7;
import defpackage.dmk;
import defpackage.dtf;
import defpackage.etf;
import defpackage.fuh;
import defpackage.gb7;
import defpackage.gg1;
import defpackage.guh;
import defpackage.in8;
import defpackage.iuh;
import defpackage.juh;
import defpackage.k9k;
import defpackage.m51;
import defpackage.ssf;
import defpackage.tsf;
import defpackage.v33;
import defpackage.yxa;
import defpackage.z8b;
import defpackage.zcg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends e implements dtf {
    public final zcg B;
    public final int C;
    public boolean D;
    public boolean E;
    public juh F;
    public final Rect G;
    public final fuh H;
    public final boolean I;
    public int[] J;
    public final in8 K;
    public final int p;
    public final aah[] q;
    public final gb7 r;
    public final gb7 s;
    public final int t;
    public int u;
    public final yxa v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [yxa, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        zcg zcgVar = new zcg(7, false);
        this.B = zcgVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new fuh(this);
        this.I = true;
        this.K = new in8(this, 19);
        ssf L = e.L(context, attributeSet, i, i2);
        int i3 = L.a;
        if (i3 != 0 && i3 != 1) {
            dmk.v("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            gb7 gb7Var = this.r;
            this.r = this.s;
            this.s = gb7Var;
            t0();
        }
        int i4 = L.b;
        c(null);
        if (i4 != this.p) {
            zcgVar.w();
            t0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new aah[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new aah(this, i5);
            }
            t0();
        }
        boolean z = L.c;
        c(null);
        juh juhVar = this.F;
        if (juhVar != null && juhVar.h != z) {
            juhVar.h = z;
        }
        this.w = z;
        t0();
        ?? obj = new Object();
        obj.a = true;
        obj.f = 0;
        obj.g = 0;
        this.v = obj;
        this.r = gb7.a(this, this.t);
        this.s = gb7.a(this, 1 - this.t);
    }

    public static int i1(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // androidx.recyclerview.widget.e
    public final void F0(RecyclerView recyclerView, int i) {
        z8b z8bVar = new z8b(recyclerView.getContext());
        z8bVar.a = i;
        G0(z8bVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean H0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        int P0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                P0 = Q0();
                P0();
            } else {
                P0 = P0();
                Q0();
            }
            if (P0 == 0 && U0() != null) {
                this.B.w();
                this.f = true;
                t0();
                return true;
            }
        }
        return false;
    }

    public final int J0(etf etfVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return v33.c(etfVar, this.r, M0(z), L0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0268, code lost:
    
        a1(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K0(f fVar, yxa yxaVar, etf etfVar) {
        int i;
        int i2;
        aah[] aahVarArr;
        int k;
        int R0;
        int i3;
        BitSet bitSet;
        int i4;
        aah[] aahVarArr2;
        aah aahVar;
        ?? r5;
        int j;
        int c;
        int i5;
        int i6;
        BitSet bitSet2;
        int i7;
        int i8;
        f fVar2 = fVar;
        BitSet bitSet3 = this.y;
        int i9 = this.p;
        bitSet3.set(0, i9, true);
        yxa yxaVar2 = this.v;
        if (yxaVar2.i) {
            i = yxaVar.e;
            if (i == 1) {
                i2 = bd0.API_PRIORITY_OTHER;
            } else {
                i2 = Integer.MIN_VALUE;
            }
        } else {
            i = yxaVar.e;
            if (i == 1) {
                i2 = yxaVar.g + yxaVar.b;
            } else {
                i2 = yxaVar.f - yxaVar.b;
            }
        }
        int i10 = 0;
        while (true) {
            aahVarArr = this.q;
            if (i10 >= i9) {
                break;
            }
            if (!aahVarArr[i10].a.isEmpty()) {
                h1(aahVarArr[i10], i, i2);
            }
            i10++;
        }
        boolean z = this.x;
        gb7 gb7Var = this.r;
        if (z) {
            k = gb7Var.g();
        } else {
            k = gb7Var.k();
        }
        boolean z2 = false;
        while (true) {
            int i11 = yxaVar.c;
            if (i11 < 0 || i11 >= etfVar.b() || (!yxaVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View d = fVar2.d(yxaVar.c);
            yxaVar.c += yxaVar.d;
            guh guhVar = (guh) d.getLayoutParams();
            int layoutPosition = guhVar.a.getLayoutPosition();
            zcg zcgVar = this.B;
            int[] iArr = (int[]) zcgVar.b;
            if (iArr != null && layoutPosition < iArr.length) {
                i3 = iArr[layoutPosition];
            } else {
                i3 = -1;
            }
            if (i3 == -1) {
                if (Y0(yxaVar.e)) {
                    i4 = i9;
                    i8 = i9 - 1;
                    i9 = -1;
                    i7 = -1;
                } else {
                    i4 = i9;
                    i7 = 1;
                    i8 = 0;
                }
                aah aahVar2 = null;
                int i12 = i7;
                if (yxaVar.e == 1) {
                    int k2 = gb7Var.k();
                    aahVarArr2 = aahVarArr;
                    int i13 = i8;
                    int i14 = bd0.API_PRIORITY_OTHER;
                    while (i13 != i9) {
                        int i15 = i13;
                        aah aahVar3 = aahVarArr2[i15];
                        BitSet bitSet4 = bitSet3;
                        int g = aahVar3.g(k2);
                        if (g < i14) {
                            i14 = g;
                            aahVar2 = aahVar3;
                        }
                        i13 = i15 + i12;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    aahVarArr2 = aahVarArr;
                    int g2 = gb7Var.g();
                    int i16 = i8;
                    int i17 = Integer.MIN_VALUE;
                    while (i16 != i9) {
                        aah aahVar4 = aahVarArr2[i16];
                        int i18 = i9;
                        int j2 = aahVar4.j(g2);
                        if (j2 > i17) {
                            i17 = j2;
                            aahVar2 = aahVar4;
                        }
                        i16 += i12;
                        i9 = i18;
                    }
                }
                aahVar = aahVar2;
                zcgVar.x(layoutPosition);
                ((int[]) zcgVar.b)[layoutPosition] = aahVar.e;
            } else {
                bitSet = bitSet3;
                i4 = i9;
                aahVarArr2 = aahVarArr;
                aahVar = aahVarArr2[i3];
            }
            guhVar.e = aahVar;
            if (yxaVar.e == 1) {
                r5 = 0;
                b(d, -1, false);
            } else {
                r5 = 0;
                b(d, 0, false);
            }
            int i19 = this.t;
            if (i19 == 1) {
                W0(d, e.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) guhVar).width), e.w(true, this.o, this.m, G() + J(), ((ViewGroup.MarginLayoutParams) guhVar).height));
            } else {
                W0(d, e.w(true, this.n, this.l, I() + H(), ((ViewGroup.MarginLayoutParams) guhVar).width), e.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) guhVar).height));
            }
            if (yxaVar.e == 1) {
                c = aahVar.g(k);
                j = gb7Var.c(d) + c;
            } else {
                j = aahVar.j(k);
                c = j - gb7Var.c(d);
            }
            int i20 = yxaVar.e;
            aah aahVar5 = guhVar.e;
            if (i20 == 1) {
                aahVar5.getClass();
                guh guhVar2 = (guh) d.getLayoutParams();
                guhVar2.e = aahVar5;
                ArrayList arrayList = aahVar5.a;
                arrayList.add(d);
                aahVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    aahVar5.b = Integer.MIN_VALUE;
                }
                if (guhVar2.a.isRemoved() || guhVar2.a.isUpdated()) {
                    aahVar5.d = ((StaggeredGridLayoutManager) aahVar5.f).r.c(d) + aahVar5.d;
                }
            } else {
                aahVar5.getClass();
                guh guhVar3 = (guh) d.getLayoutParams();
                guhVar3.e = aahVar5;
                ArrayList arrayList2 = aahVar5.a;
                arrayList2.add(0, d);
                aahVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    aahVar5.c = Integer.MIN_VALUE;
                }
                if (guhVar3.a.isRemoved() || guhVar3.a.isUpdated()) {
                    aahVar5.d = ((StaggeredGridLayoutManager) aahVar5.f).r.c(d) + aahVar5.d;
                }
            }
            boolean V0 = V0();
            gb7 gb7Var2 = this.s;
            if (V0 && i19 == 1) {
                i6 = gb7Var2.g() - (((i4 - 1) - aahVar.e) * this.u);
                i5 = i6 - gb7Var2.c(d);
            } else {
                int k3 = (aahVar.e * this.u) + gb7Var2.k();
                int c2 = gb7Var2.c(d) + k3;
                i5 = k3;
                i6 = c2;
            }
            z2 = true;
            if (i19 == 1) {
                e.R(d, i5, c, i6, j);
            } else {
                e.R(d, c, i5, j, i6);
            }
            h1(aahVar, yxaVar2.e, i2);
            fVar2 = fVar;
            a1(fVar2, yxaVar2);
            if (yxaVar2.h && d.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(aahVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i9 = i4;
            aahVarArr = aahVarArr2;
        }
        if (yxaVar2.e == -1) {
            R0 = gb7Var.k() - S0(gb7Var.k());
        } else {
            R0 = R0(gb7Var.g()) - gb7Var.g();
        }
        if (R0 > 0) {
            return Math.min(yxaVar.b, R0);
        }
        return 0;
    }

    public final View L0(boolean z) {
        gb7 gb7Var = this.r;
        int k = gb7Var.k();
        int g = gb7Var.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = gb7Var.e(u);
            int b = gb7Var.b(u);
            if (b > k && e < g) {
                if (b > g && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.e
    public final int M(f fVar, etf etfVar) {
        if (this.t == 0) {
            return Math.min(this.p, etfVar.b());
        }
        return -1;
    }

    public final View M0(boolean z) {
        gb7 gb7Var = this.r;
        int k = gb7Var.k();
        int g = gb7Var.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = gb7Var.e(u);
            if (gb7Var.b(u) > k && e < g) {
                if (e < k && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final void N0(f fVar, etf etfVar, boolean z) {
        int g;
        int R0 = R0(Integer.MIN_VALUE);
        if (R0 != Integer.MIN_VALUE && (g = this.r.g() - R0) > 0) {
            int i = g - (-e1(-g, etfVar, fVar));
            if (z && i > 0) {
                this.r.o(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean O() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final void O0(f fVar, etf etfVar, boolean z) {
        int k;
        int S0 = S0(bd0.API_PRIORITY_OTHER);
        if (S0 != Integer.MAX_VALUE && (k = S0 - this.r.k()) > 0) {
            int e1 = k - e1(k, etfVar, fVar);
            if (z && e1 > 0) {
                this.r.o(-e1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean P() {
        return this.w;
    }

    public final int P0() {
        if (v() == 0) {
            return 0;
        }
        return e.K(u(0));
    }

    public final int Q0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return e.K(u(v - 1));
    }

    public final int R0(int i) {
        int g = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int g2 = this.q[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    @Override // androidx.recyclerview.widget.e
    public final void S(int i) {
        super.S(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            aah aahVar = this.q[i2];
            int i3 = aahVar.b;
            if (i3 != Integer.MIN_VALUE) {
                aahVar.b = i3 + i;
            }
            int i4 = aahVar.c;
            if (i4 != Integer.MIN_VALUE) {
                aahVar.c = i4 + i;
            }
        }
    }

    public final int S0(int i) {
        int j = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int j2 = this.q[i2].j(i);
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    @Override // androidx.recyclerview.widget.e
    public final void T(int i) {
        super.T(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            aah aahVar = this.q[i2];
            int i3 = aahVar.b;
            if (i3 != Integer.MIN_VALUE) {
                aahVar.b = i3 + i;
            }
            int i4 = aahVar.c;
            if (i4 != Integer.MIN_VALUE) {
                aahVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(int i, int i2, int i3) {
        int P0;
        int i4;
        int i5;
        zcg zcgVar;
        int[] iArr;
        int Q0;
        ArrayList arrayList;
        iuh iuhVar;
        int i6;
        if (this.x) {
            P0 = Q0();
        } else {
            P0 = P0();
        }
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
                zcgVar = this.B;
                iArr = (int[]) zcgVar.b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) zcgVar.c;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                iuhVar = (iuh) ((ArrayList) zcgVar.c).get(size);
                                if (iuhVar.a == i5) {
                                    break;
                                }
                            }
                        }
                        iuhVar = null;
                        if (iuhVar != null) {
                            ((ArrayList) zcgVar.c).remove(iuhVar);
                        }
                        int size2 = ((ArrayList) zcgVar.c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                if (((iuh) ((ArrayList) zcgVar.c).get(i7)).a >= i5) {
                                    break;
                                } else {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                                break;
                            }
                        }
                        if (i7 != -1) {
                            iuh iuhVar2 = (iuh) ((ArrayList) zcgVar.c).get(i7);
                            ((ArrayList) zcgVar.c).remove(i7);
                            i6 = iuhVar2.a;
                            int[] iArr2 = (int[]) zcgVar.b;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) zcgVar.b).length;
                            } else {
                                Arrays.fill((int[]) zcgVar.b, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) zcgVar.b;
                    if (i6 == -1) {
                    }
                }
                if (i3 == 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            zcgVar.I(i, 1);
                            zcgVar.H(i2, 1);
                        }
                    } else {
                        zcgVar.I(i, i2);
                    }
                } else {
                    zcgVar.H(i, i2);
                }
                if (i4 <= P0) {
                    if (this.x) {
                        Q0 = P0();
                    } else {
                        Q0 = Q0();
                    }
                    if (i5 <= Q0) {
                        t0();
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            i4 = i + i2;
        }
        i5 = i;
        zcgVar = this.B;
        iArr = (int[]) zcgVar.b;
        if (iArr != null) {
            arrayList = (ArrayList) zcgVar.c;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) zcgVar.b;
            if (i6 == -1) {
            }
        }
        if (i3 == 1) {
        }
        if (i4 <= P0) {
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void U() {
        this.B.w();
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View U0() {
        char c;
        boolean z;
        boolean z2;
        int v = v();
        int i = v - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        int i3 = -1;
        if (this.t == 1 && V0()) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.x) {
            v = -1;
        } else {
            i = 0;
        }
        if (i < v) {
            i3 = 1;
        }
        while (i != v) {
            View u = u(i);
            guh guhVar = (guh) u.getLayoutParams();
            boolean z3 = bitSet.get(guhVar.e.e);
            gb7 gb7Var = this.r;
            if (z3) {
                aah aahVar = guhVar.e;
                if (this.x) {
                    int i4 = aahVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        aahVar.b();
                        i4 = aahVar.c;
                    }
                    if (i4 < gb7Var.g()) {
                        ((guh) ((View) m51.h(1, aahVar.a)).getLayoutParams()).getClass();
                        return u;
                    }
                } else {
                    int i5 = aahVar.b;
                    ArrayList arrayList = aahVar.a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        guh guhVar2 = (guh) view.getLayoutParams();
                        aahVar.b = ((StaggeredGridLayoutManager) aahVar.f).r.e(view);
                        guhVar2.getClass();
                        i5 = aahVar.b;
                    }
                    if (i5 > gb7Var.k()) {
                        ((guh) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return u;
                    }
                }
                bitSet.clear(guhVar.e.e);
            }
            i += i3;
            if (i != v) {
                View u2 = u(i);
                if (this.x) {
                    int b = gb7Var.b(u);
                    int b2 = gb7Var.b(u2);
                    if (b >= b2) {
                        if (b == b2) {
                            if (guhVar.e.e - ((guh) u2.getLayoutParams()).e.e >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (c >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z == z2) {
                                return u;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return u;
                    }
                } else {
                    int e = gb7Var.e(u);
                    int e2 = gb7Var.e(u2);
                    if (e <= e2) {
                        if (e == e2) {
                            if (guhVar.e.e - ((guh) u2.getLayoutParams()).e.e >= 0) {
                            }
                            if (c >= 0) {
                            }
                            if (z == z2) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return u;
                    }
                }
            }
        }
        return null;
    }

    public final boolean V0() {
        if (this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.e
    public final void W(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].c();
        }
        recyclerView.requestLayout();
    }

    public final void W0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Q(view));
        }
        guh guhVar = (guh) view.getLayoutParams();
        int i1 = i1(i, ((ViewGroup.MarginLayoutParams) guhVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) guhVar).rightMargin + rect.right);
        int i12 = i1(i2, ((ViewGroup.MarginLayoutParams) guhVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) guhVar).bottomMargin + rect.bottom);
        if (C0(view, i1, i12, guhVar)) {
            view.measure(i1, i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (V0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (V0() == false) goto L34;
     */
    @Override // androidx.recyclerview.widget.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X(View view, int i, f fVar, etf etfVar) {
        View view2;
        int i2;
        int P0;
        boolean z;
        boolean z2;
        int e;
        int e2;
        int e3;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.E(view)) == null || ((ArrayList) this.a.e).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                d1();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66) {
                                }
                            }
                            i2 = Integer.MIN_VALUE;
                        }
                    } else {
                        if (i3 != 1) {
                        }
                        i2 = 1;
                    }
                } else {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    guh guhVar = (guh) view2.getLayoutParams();
                    guhVar.getClass();
                    aah aahVar = guhVar.e;
                    if (i2 == 1) {
                        P0 = Q0();
                    } else {
                        P0 = P0();
                    }
                    g1(P0, etfVar);
                    f1(i2);
                    yxa yxaVar = this.v;
                    yxaVar.c = yxaVar.d + P0;
                    yxaVar.b = (int) (this.r.l() * 0.33333334f);
                    yxaVar.h = true;
                    yxaVar.a = false;
                    K0(fVar, yxaVar, etfVar);
                    this.D = this.x;
                    View h = aahVar.h(P0, i2);
                    if (h != null && h != view2) {
                        return h;
                    }
                    boolean Y0 = Y0(i2);
                    aah[] aahVarArr = this.q;
                    int i4 = this.p;
                    if (Y0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View h2 = aahVarArr[i5].h(P0, i2);
                            if (h2 != null && h2 != view2) {
                                return h2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View h3 = aahVarArr[i6].h(P0, i2);
                            if (h3 != null && h3 != view2) {
                                return h3;
                            }
                        }
                    }
                    boolean z3 = !this.w;
                    if (i2 == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z3 == z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        e = aahVar.d();
                    } else {
                        e = aahVar.e();
                    }
                    View q = q(e);
                    if (q != null && q != view2) {
                        return q;
                    }
                    if (Y0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != aahVar.e) {
                                if (z2) {
                                    e3 = aahVarArr[i7].d();
                                } else {
                                    e3 = aahVarArr[i7].e();
                                }
                                View q2 = q(e3);
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            if (z2) {
                                e2 = aahVarArr[i8].d();
                            } else {
                                e2 = aahVarArr[i8].e();
                            }
                            View q3 = q(e2);
                            if (q3 != null && q3 != view2) {
                                return q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if (r4 != r17.x) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.x != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(f fVar, etf etfVar, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        juh juhVar;
        int j;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        int k;
        int P0;
        int k2;
        int k3;
        juh juhVar2 = this.F;
        fuh fuhVar = this.H;
        if ((juhVar2 != null || this.z != -1) && etfVar.b() == 0) {
            o0(fVar);
            fuhVar.a();
            return;
        }
        boolean z8 = fuhVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = fuhVar.g;
        if (z8 && this.z == -1 && this.F == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        aah[] aahVarArr = this.q;
        int i4 = this.p;
        zcg zcgVar = this.B;
        if (z2) {
            fuhVar.a();
            juh juhVar3 = this.F;
            gb7 gb7Var = this.r;
            if (juhVar3 != null) {
                int i5 = juhVar3.c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            aahVarArr[i6].c();
                            juh juhVar4 = this.F;
                            int i7 = juhVar4.d[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                if (juhVar4.i) {
                                    k3 = gb7Var.g();
                                } else {
                                    k3 = gb7Var.k();
                                }
                                i7 += k3;
                            }
                            aah aahVar = aahVarArr[i6];
                            aahVar.b = i7;
                            aahVar.c = i7;
                        }
                    } else {
                        juhVar3.d = null;
                        juhVar3.c = 0;
                        juhVar3.e = 0;
                        juhVar3.f = null;
                        juhVar3.g = null;
                        juhVar3.a = juhVar3.b;
                    }
                }
                juh juhVar5 = this.F;
                this.E = juhVar5.j;
                boolean z9 = juhVar5.h;
                c(null);
                juh juhVar6 = this.F;
                if (juhVar6 != null && juhVar6.h != z9) {
                    juhVar6.h = z9;
                }
                this.w = z9;
                t0();
                d1();
                juh juhVar7 = this.F;
                int i8 = juhVar7.a;
                if (i8 != -1) {
                    this.z = i8;
                    fuhVar.c = juhVar7.i;
                } else {
                    fuhVar.c = this.x;
                }
                if (juhVar7.e > 1) {
                    zcgVar.b = juhVar7.f;
                    zcgVar.c = juhVar7.g;
                }
            } else {
                d1();
                fuhVar.c = this.x;
            }
            if (!etfVar.g && (i3 = this.z) != -1) {
                if (i3 >= 0 && i3 < etfVar.b()) {
                    juh juhVar8 = this.F;
                    if (juhVar8 != null && juhVar8.a != -1 && juhVar8.c >= 1) {
                        fuhVar.b = Integer.MIN_VALUE;
                        fuhVar.a = this.z;
                    } else {
                        View q = q(this.z);
                        if (q != null) {
                            if (this.x) {
                                P0 = Q0();
                            } else {
                                P0 = P0();
                            }
                            fuhVar.a = P0;
                            if (this.A != Integer.MIN_VALUE) {
                                if (fuhVar.c) {
                                    fuhVar.b = (gb7Var.g() - this.A) - gb7Var.b(q);
                                } else {
                                    fuhVar.b = (gb7Var.k() + this.A) - gb7Var.e(q);
                                }
                            } else if (gb7Var.c(q) > gb7Var.l()) {
                                if (fuhVar.c) {
                                    k2 = gb7Var.g();
                                } else {
                                    k2 = gb7Var.k();
                                }
                                fuhVar.b = k2;
                            } else {
                                int e = gb7Var.e(q) - gb7Var.k();
                                if (e < 0) {
                                    fuhVar.b = -e;
                                } else {
                                    int g = gb7Var.g() - gb7Var.b(q);
                                    if (g < 0) {
                                        fuhVar.b = g;
                                    } else {
                                        fuhVar.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.z;
                            fuhVar.a = i9;
                            int i10 = this.A;
                            if (i10 == Integer.MIN_VALUE) {
                                if (v() != 0) {
                                    if (i9 < P0()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                                fuhVar.c = z7;
                                gb7 gb7Var2 = staggeredGridLayoutManager.r;
                                if (z7) {
                                    k = gb7Var2.g();
                                } else {
                                    k = gb7Var2.k();
                                }
                                fuhVar.b = k;
                            } else {
                                boolean z10 = fuhVar.c;
                                gb7 gb7Var3 = staggeredGridLayoutManager.r;
                                if (z10) {
                                    fuhVar.b = gb7Var3.g() - i10;
                                } else {
                                    fuhVar.b = gb7Var3.k() + i10;
                                }
                            }
                            z5 = true;
                            fuhVar.d = true;
                            fuhVar.e = z5;
                        }
                    }
                    z5 = true;
                    fuhVar.e = z5;
                } else {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                }
            }
            if (this.D) {
                int b = etfVar.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i2 = e.K(u(v));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    }
                }
                i2 = 0;
                fuhVar.a = i2;
                fuhVar.b = Integer.MIN_VALUE;
                z5 = true;
                fuhVar.e = z5;
            } else {
                int b2 = etfVar.b();
                int v2 = v();
                for (int i11 = 0; i11 < v2; i11++) {
                    int K = e.K(u(i11));
                    if (K >= 0 && K < b2) {
                        i2 = K;
                        break;
                    }
                }
                i2 = 0;
                fuhVar.a = i2;
                fuhVar.b = Integer.MIN_VALUE;
                z5 = true;
                fuhVar.e = z5;
            }
        }
        if (this.F != null || this.z != -1 || (fuhVar.c == this.D && V0() == this.E)) {
            i = 1;
        } else {
            zcgVar.w();
            i = 1;
            fuhVar.d = true;
        }
        if (v() > 0 && ((juhVar = this.F) == null || juhVar.c < i)) {
            if (fuhVar.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    aahVarArr[i12].c();
                    int i13 = fuhVar.b;
                    if (i13 != Integer.MIN_VALUE) {
                        aah aahVar2 = aahVarArr[i12];
                        aahVar2.b = i13;
                        aahVar2.c = i13;
                    }
                }
            } else if (!z2 && fuhVar.f != null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    aah aahVar3 = aahVarArr[i14];
                    aahVar3.c();
                    int i15 = fuhVar.f[i14];
                    aahVar3.b = i15;
                    aahVar3.c = i15;
                }
            } else {
                for (int i16 = 0; i16 < i4; i16++) {
                    aah aahVar4 = aahVarArr[i16];
                    boolean z11 = this.x;
                    int i17 = fuhVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) aahVar4.f;
                    if (z11) {
                        j = aahVar4.g(Integer.MIN_VALUE);
                    } else {
                        j = aahVar4.j(Integer.MIN_VALUE);
                    }
                    aahVar4.c();
                    if (j != Integer.MIN_VALUE && ((!z11 || j >= staggeredGridLayoutManager2.r.g()) && (z11 || j <= staggeredGridLayoutManager2.r.k()))) {
                        if (i17 != Integer.MIN_VALUE) {
                            j += i17;
                        }
                        aahVar4.c = j;
                        aahVar4.b = j;
                    }
                }
                int length = aahVarArr.length;
                int[] iArr = fuhVar.f;
                if (iArr == null || iArr.length < length) {
                    fuhVar.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i18 = 0; i18 < length; i18++) {
                    fuhVar.f[i18] = aahVarArr[i18].j(Integer.MIN_VALUE);
                }
            }
        }
        p(fVar);
        yxa yxaVar = this.v;
        yxaVar.a = false;
        gb7 gb7Var4 = this.s;
        int l = gb7Var4.l();
        this.u = l / i4;
        View.MeasureSpec.makeMeasureSpec(l, gb7Var4.i());
        g1(fuhVar.a, etfVar);
        if (fuhVar.c) {
            f1(-1);
            K0(fVar, yxaVar, etfVar);
            f1(1);
            yxaVar.c = fuhVar.a + yxaVar.d;
            K0(fVar, yxaVar, etfVar);
        } else {
            f1(1);
            K0(fVar, yxaVar, etfVar);
            f1(-1);
            yxaVar.c = fuhVar.a + yxaVar.d;
            K0(fVar, yxaVar, etfVar);
        }
        if (gb7Var4.i() != 1073741824) {
            int v3 = v();
            float f = 0.0f;
            for (int i19 = 0; i19 < v3; i19++) {
                View u = u(i19);
                float c = gb7Var4.c(u);
                if (c >= f) {
                    ((guh) u.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i20 = this.u;
            int round = Math.round(f * i4);
            if (gb7Var4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, gb7Var4.l());
            }
            this.u = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, gb7Var4.i());
            if (this.u != i20) {
                for (int i21 = 0; i21 < v3; i21++) {
                    View u2 = u(i21);
                    guh guhVar = (guh) u2.getLayoutParams();
                    guhVar.getClass();
                    boolean V0 = V0();
                    int i22 = this.t;
                    if (V0 && i22 == 1) {
                        int i23 = -((i4 - 1) - guhVar.e.e);
                        u2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                    } else {
                        int i24 = guhVar.e.e;
                        int i25 = this.u * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            u2.offsetLeftAndRight(i25 - i26);
                        } else {
                            u2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                z3 = true;
                N0(fVar, etfVar, true);
                O0(fVar, etfVar, false);
            } else {
                z3 = true;
                O0(fVar, etfVar, true);
                N0(fVar, etfVar, false);
            }
        } else {
            z3 = true;
        }
        if (z && !etfVar.g && this.C != 0 && v() > 0 && U0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (I0()) {
                z4 = z3;
                if (etfVar.g) {
                    fuhVar.a();
                }
                this.D = fuhVar.c;
                this.E = V0();
                if (!z4) {
                    fuhVar.a();
                    X0(fVar, etfVar, false);
                    return;
                }
                return;
            }
        }
        z4 = false;
        if (etfVar.g) {
        }
        this.D = fuhVar.c;
        this.E = V0();
        if (!z4) {
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            View M0 = M0(false);
            View L0 = L0(false);
            if (M0 != null && L0 != null) {
                int K = e.K(M0);
                int K2 = e.K(L0);
                if (K < K2) {
                    accessibilityEvent.setFromIndex(K);
                    accessibilityEvent.setToIndex(K2);
                } else {
                    accessibilityEvent.setFromIndex(K2);
                    accessibilityEvent.setToIndex(K);
                }
            }
        }
    }

    public final boolean Y0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.t == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.x) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != V0()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.e
    public final void Z(f fVar, etf etfVar, d7 d7Var) {
        super.Z(fVar, etfVar, d7Var);
        d7Var.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void Z0(int i, etf etfVar) {
        int P0;
        int i2;
        if (i > 0) {
            P0 = Q0();
            i2 = 1;
        } else {
            P0 = P0();
            i2 = -1;
        }
        yxa yxaVar = this.v;
        yxaVar.a = true;
        g1(P0, etfVar);
        f1(i2);
        yxaVar.c = P0 + yxaVar.d;
        yxaVar.b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.dtf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        boolean z;
        int i2 = -1;
        if (v() != 0) {
            if (i < P0()) {
                z = true;
            } else {
                z = false;
            }
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    public final void a1(f fVar, yxa yxaVar) {
        if (yxaVar.a && !yxaVar.i) {
            int i = yxaVar.b;
            int i2 = yxaVar.e;
            if (i == 0) {
                if (i2 == -1) {
                    b1(fVar, yxaVar.g);
                    return;
                } else {
                    c1(fVar, yxaVar.f);
                    return;
                }
            }
            int i3 = this.p;
            aah[] aahVarArr = this.q;
            int i4 = 1;
            if (i2 == -1) {
                int i5 = yxaVar.f;
                int j = aahVarArr[0].j(i5);
                while (i4 < i3) {
                    int j2 = aahVarArr[i4].j(i5);
                    if (j2 > j) {
                        j = j2;
                    }
                    i4++;
                }
                int i6 = i5 - j;
                int i7 = yxaVar.g;
                if (i6 >= 0) {
                    i7 -= Math.min(i6, yxaVar.b);
                }
                b1(fVar, i7);
                return;
            }
            int i8 = yxaVar.g;
            int g = aahVarArr[0].g(i8);
            while (i4 < i3) {
                int g2 = aahVarArr[i4].g(i8);
                if (g2 < g) {
                    g = g2;
                }
                i4++;
            }
            int i9 = g - yxaVar.g;
            int i10 = yxaVar.f;
            if (i9 >= 0) {
                i10 += Math.min(i9, yxaVar.b);
            }
            c1(fVar, i10);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void b0(f fVar, etf etfVar, View view, d7 d7Var) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof guh)) {
            a0(view, d7Var);
            return;
        }
        aah aahVar = ((guh) layoutParams).e;
        if (this.t == 0) {
            if (aahVar == null) {
                i2 = -1;
            } else {
                i2 = aahVar.e;
            }
            d7Var.l(c7.a(false, i2, 1, -1, -1));
            return;
        }
        if (aahVar == null) {
            i = -1;
        } else {
            i = aahVar.e;
        }
        d7Var.l(c7.a(false, -1, -1, i, 1));
    }

    public final void b1(f fVar, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            gb7 gb7Var = this.r;
            if (gb7Var.e(u) >= i && gb7Var.n(u) >= i) {
                guh guhVar = (guh) u.getLayoutParams();
                guhVar.getClass();
                if (guhVar.e.a.size() != 1) {
                    aah aahVar = guhVar.e;
                    ArrayList arrayList = aahVar.a;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    guh guhVar2 = (guh) view.getLayoutParams();
                    guhVar2.e = null;
                    if (guhVar2.a.isRemoved() || guhVar2.a.isUpdated()) {
                        aahVar.d -= ((StaggeredGridLayoutManager) aahVar.f).r.c(view);
                    }
                    if (size == 1) {
                        aahVar.b = Integer.MIN_VALUE;
                    }
                    aahVar.c = Integer.MIN_VALUE;
                    q0(u, fVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void c0(int i, int i2) {
        T0(i, i2, 1);
    }

    public final void c1(f fVar, int i) {
        while (v() > 0) {
            View u = u(0);
            gb7 gb7Var = this.r;
            if (gb7Var.b(u) <= i && gb7Var.m(u) <= i) {
                guh guhVar = (guh) u.getLayoutParams();
                guhVar.getClass();
                if (guhVar.e.a.size() != 1) {
                    aah aahVar = guhVar.e;
                    ArrayList arrayList = aahVar.a;
                    View view = (View) arrayList.remove(0);
                    guh guhVar2 = (guh) view.getLayoutParams();
                    guhVar2.e = null;
                    if (arrayList.size() == 0) {
                        aahVar.c = Integer.MIN_VALUE;
                    }
                    if (guhVar2.a.isRemoved() || guhVar2.a.isUpdated()) {
                        aahVar.d -= ((StaggeredGridLayoutManager) aahVar.f).r.c(view);
                    }
                    aahVar.b = Integer.MIN_VALUE;
                    q0(u, fVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.e
    public final void d0() {
        this.B.w();
        t0();
    }

    public final void d1() {
        if (this.t != 1 && V0()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.e
    public final void e0(int i, int i2) {
        T0(i, i2, 8);
    }

    public final int e1(int i, etf etfVar, f fVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        Z0(i, etfVar);
        yxa yxaVar = this.v;
        int K0 = K0(fVar, yxaVar, etfVar);
        if (yxaVar.b >= K0) {
            if (i < 0) {
                i = -K0;
            } else {
                i = K0;
            }
        }
        this.r.o(-i);
        this.D = this.x;
        yxaVar.b = 0;
        a1(fVar, yxaVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.e
    public final boolean f(tsf tsfVar) {
        return tsfVar instanceof guh;
    }

    @Override // androidx.recyclerview.widget.e
    public final void f0(int i, int i2) {
        T0(i, i2, 2);
    }

    public final void f1(int i) {
        boolean z;
        yxa yxaVar = this.v;
        yxaVar.e = i;
        boolean z2 = this.x;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        yxaVar.d = i2;
    }

    @Override // androidx.recyclerview.widget.e
    public final void g0(int i, int i2) {
        T0(i, i2, 4);
    }

    public final void g1(int i, etf etfVar) {
        int i2;
        int i3;
        int i4;
        boolean z;
        yxa yxaVar = this.v;
        boolean z2 = false;
        yxaVar.b = 0;
        yxaVar.c = i;
        z8b z8bVar = this.e;
        gb7 gb7Var = this.r;
        if (z8bVar != null && z8bVar.e && (i4 = etfVar.a) != -1) {
            boolean z3 = this.x;
            if (i4 < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = gb7Var.l();
                i3 = 0;
            } else {
                i3 = gb7Var.l();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.h) {
            yxaVar.f = gb7Var.k() - i3;
            yxaVar.g = gb7Var.g() + i2;
        } else {
            yxaVar.g = gb7Var.f() + i2;
            yxaVar.f = -i3;
        }
        yxaVar.h = false;
        yxaVar.a = true;
        if (gb7Var.i() == 0 && gb7Var.f() == 0) {
            z2 = true;
        }
        yxaVar.i = z2;
    }

    @Override // androidx.recyclerview.widget.e
    public final void h(int i, int i2, etf etfVar, gg1 gg1Var) {
        yxa yxaVar;
        int g;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            Z0(i, etfVar);
            int[] iArr = this.J;
            int i3 = this.p;
            if (iArr == null || iArr.length < i3) {
                this.J = new int[i3];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                yxaVar = this.v;
                if (i4 >= i3) {
                    break;
                }
                int i6 = yxaVar.d;
                aah[] aahVarArr = this.q;
                if (i6 == -1) {
                    int i7 = yxaVar.f;
                    g = i7 - aahVarArr[i4].j(i7);
                } else {
                    g = aahVarArr[i4].g(yxaVar.g) - yxaVar.g;
                }
                if (g >= 0) {
                    this.J[i5] = g;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.J, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = yxaVar.c;
                if (i9 >= 0 && i9 < etfVar.b()) {
                    gg1Var.b(yxaVar.c, this.J[i8]);
                    yxaVar.c += yxaVar.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void h0(f fVar, etf etfVar) {
        X0(fVar, etfVar, true);
    }

    public final void h1(aah aahVar, int i, int i2) {
        int i3 = aahVar.d;
        int i4 = aahVar.e;
        BitSet bitSet = this.y;
        if (i == -1) {
            int i5 = aahVar.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) aahVar.a.get(0);
                guh guhVar = (guh) view.getLayoutParams();
                aahVar.b = ((StaggeredGridLayoutManager) aahVar.f).r.e(view);
                guhVar.getClass();
                i5 = aahVar.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = aahVar.c;
        if (i6 == Integer.MIN_VALUE) {
            aahVar.b();
            i6 = aahVar.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final void i0(etf etfVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // androidx.recyclerview.widget.e
    public final int j(etf etfVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return v33.b(etfVar, this.r, M0(z), L0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.e
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof juh) {
            juh juhVar = (juh) parcelable;
            this.F = juhVar;
            if (this.z != -1) {
                juhVar.a = -1;
                juhVar.b = -1;
                juhVar.d = null;
                juhVar.c = 0;
                juhVar.e = 0;
                juhVar.f = null;
                juhVar.g = null;
            }
            t0();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final int k(etf etfVar) {
        return J0(etfVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, juh] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Parcelable, java.lang.Object, juh] */
    @Override // androidx.recyclerview.widget.e
    public final Parcelable k0() {
        int P0;
        View M0;
        int j;
        int k;
        int[] iArr;
        juh juhVar = this.F;
        if (juhVar != null) {
            ?? obj = new Object();
            obj.c = juhVar.c;
            obj.a = juhVar.a;
            obj.b = juhVar.b;
            obj.d = juhVar.d;
            obj.e = juhVar.e;
            obj.f = juhVar.f;
            obj.h = juhVar.h;
            obj.i = juhVar.i;
            obj.j = juhVar.j;
            obj.g = juhVar.g;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.h = this.w;
        obj2.i = this.D;
        obj2.j = this.E;
        zcg zcgVar = this.B;
        if (zcgVar != null && (iArr = (int[]) zcgVar.b) != null) {
            obj2.f = iArr;
            obj2.e = iArr.length;
            obj2.g = (ArrayList) zcgVar.c;
        } else {
            obj2.e = 0;
        }
        int i = -1;
        if (v() > 0) {
            if (this.D) {
                P0 = Q0();
            } else {
                P0 = P0();
            }
            obj2.a = P0;
            if (this.x) {
                M0 = L0(true);
            } else {
                M0 = M0(true);
            }
            if (M0 != null) {
                i = e.K(M0);
            }
            obj2.b = i;
            int i2 = this.p;
            obj2.c = i2;
            obj2.d = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                boolean z = this.D;
                gb7 gb7Var = this.r;
                aah[] aahVarArr = this.q;
                if (z) {
                    j = aahVarArr[i3].g(Integer.MIN_VALUE);
                    if (j != Integer.MIN_VALUE) {
                        k = gb7Var.g();
                        j -= k;
                        obj2.d[i3] = j;
                    } else {
                        obj2.d[i3] = j;
                    }
                } else {
                    j = aahVarArr[i3].j(Integer.MIN_VALUE);
                    if (j != Integer.MIN_VALUE) {
                        k = gb7Var.k();
                        j -= k;
                        obj2.d[i3] = j;
                    } else {
                        obj2.d[i3] = j;
                    }
                }
            }
            return obj2;
        }
        obj2.a = -1;
        obj2.b = -1;
        obj2.c = 0;
        return obj2;
    }

    @Override // androidx.recyclerview.widget.e
    public final int l(etf etfVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return v33.d(etfVar, this.r, M0(z), L0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.e
    public final void l0(int i) {
        if (i == 0) {
            I0();
        }
    }

    @Override // androidx.recyclerview.widget.e
    public final int m(etf etfVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return v33.b(etfVar, this.r, M0(z), L0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.e
    public final int n(etf etfVar) {
        return J0(etfVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final int o(etf etfVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return v33.d(etfVar, this.r, M0(z), L0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.e
    public final tsf r() {
        if (this.t == 0) {
            return new tsf(-2, -1);
        }
        return new tsf(-1, -2);
    }

    @Override // androidx.recyclerview.widget.e
    public final tsf s(Context context, AttributeSet attributeSet) {
        return new tsf(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.e
    public final tsf t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new tsf((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new tsf(layoutParams);
    }

    @Override // androidx.recyclerview.widget.e
    public final int u0(int i, etf etfVar, f fVar) {
        return e1(i, etfVar, fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final void v0(int i) {
        juh juhVar = this.F;
        if (juhVar != null && juhVar.a != i) {
            juhVar.d = null;
            juhVar.c = 0;
            juhVar.a = -1;
            juhVar.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        t0();
    }

    @Override // androidx.recyclerview.widget.e
    public final int w0(int i, etf etfVar, f fVar) {
        return e1(i, etfVar, fVar);
    }

    @Override // androidx.recyclerview.widget.e
    public final int x(f fVar, etf etfVar) {
        if (this.t == 1) {
            return Math.min(this.p, etfVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.e
    public final void z0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int I = I() + H();
        int G = G() + J();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int height = rect.height() + G;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = k9k.a;
            g2 = e.g(i2, height, recyclerView.getMinimumHeight());
            g = e.g(i, (this.u * i4) + I, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + I;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = k9k.a;
            g = e.g(i, width, recyclerView2.getMinimumWidth());
            g2 = e.g(i2, (this.u * i4) + G, this.b.getMinimumHeight());
        }
        RecyclerView.g(this.b, g, g2);
    }
}
