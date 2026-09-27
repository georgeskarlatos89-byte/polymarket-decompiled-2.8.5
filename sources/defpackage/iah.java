package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iah {
    public final eah a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public bpc f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final o1a p;
    public final o1a q;
    public final o1a r;
    public bpc s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public apc x;

    public iah(eah eahVar) {
        this.a = eahVar;
        int[] iArr = eahVar.b;
        this.b = iArr;
        Object[] objArr = eahVar.d;
        this.c = objArr;
        this.d = eahVar.j;
        this.e = eahVar.k;
        this.f = eahVar.l;
        int i = eahVar.c;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = eahVar.e;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new o1a();
        this.q = new o1a();
        this.r = new o1a();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    public static void y(iah iahVar) {
        int i = iahVar.v;
        int q = iahVar.q(i);
        int[] iArr = iahVar.b;
        int i2 = (q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((67108864 & i4) != 0) {
                return;
            }
            iahVar.V(iahVar.F(i, iArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        kotlin.collections.ArraysKt.k(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        kotlin.collections.ArraysKt.k(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i) {
        int o;
        nr8 nr8Var;
        int i2;
        nr8 nr8Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int n = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int b = gah.b(arrayList, i6, n); b < this.d.size() && (i3 = (nr8Var2 = (nr8) this.d.get(b)).a) < 0 && (i4 = i3 + n) < i; b++) {
                        nr8Var2.a = i4;
                    }
                } else {
                    for (int b2 = gah.b(arrayList, i, n); b2 < this.d.size() && (i2 = (nr8Var = (nr8) this.d.get(b2)).a) >= 0; b2++) {
                        nr8Var.a = -(n - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int n2 = n();
            if (i6 >= n2) {
                uq4.a("Check failed");
            }
            while (i6 < n2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                if (i8 > -2) {
                    o = i8;
                } else {
                    o = (o() + i8) - (-2);
                }
                if (o >= i) {
                    o = -((o() - o) - (-2));
                }
                if (o != i8) {
                    this.b[i7] = o;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, o());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int q = q(min);
                int q2 = q(i5);
                int i7 = this.g;
                while (q < q2) {
                    int i8 = (q * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        uq4.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    q++;
                    if (q == i7) {
                        q += this.h;
                    }
                }
            } else {
                int q3 = q(i5);
                int q4 = q(min);
                while (q3 < q4) {
                    int i10 = (q3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        uq4.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    q3++;
                    if (q3 == this.g) {
                        q3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List C(nr8 nr8Var, iah iahVar) {
        int E;
        if (iahVar.n <= 0) {
            uq4.a("Check failed");
        }
        if (this.n != 0) {
            uq4.a("Check failed");
        }
        if (!nr8Var.a()) {
            uq4.a("Check failed");
        }
        boolean z = true;
        int c = c(nr8Var) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            uq4.a("Check failed");
        }
        int F = F(c, this.b);
        int t = t(c);
        if (x(c)) {
            E = 1;
        } else {
            E = E(c);
        }
        List a = hah.a(this, c, iahVar, false, false, true);
        V(F);
        if (E <= 0) {
            z = false;
        }
        while (F >= i) {
            int q = q(F);
            int[] iArr = this.b;
            int i2 = q * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - t;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    gah.f(q, (i4 & 67108863) - E, iArr);
                }
            }
            F = F(F, this.b);
        }
        if (z) {
            if (this.o < E) {
                uq4.a("Check failed");
            }
            this.o -= E;
        }
        return a;
    }

    public final Object D(int i) {
        int q = q(i);
        int[] iArr = this.b;
        if ((iArr[(q * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(q, iArr))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int i, int[] iArr) {
        int i2 = iArr[(q(i) * 5) + 2];
        if (i2 > -2) {
            return i2;
        }
        return (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            uq4.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        int i2;
        apc apcVar = this.x;
        if (apcVar != null) {
            while (apcVar.b != 0) {
                int c = xrn.c(apcVar);
                int q = q(c);
                int i3 = c + 1;
                int t = t(c) + c;
                while (true) {
                    i = 0;
                    if (i3 < t) {
                        if ((this.b[(q(i3) * 5) + 1] & 201326592) != 0) {
                            i2 = 1;
                            break;
                        }
                        i3 += t(i3);
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                int[] iArr = this.b;
                int i4 = (q * 5) + 1;
                int i5 = iArr[i4];
                if ((67108864 & i5) != 0) {
                    i = 1;
                }
                if (i != i2) {
                    iArr[i4] = (i2 << 26) | ((-67108865) & i5);
                    int F = F(c, iArr);
                    if (F >= 0) {
                        xrn.a(apcVar, F);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            uq4.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(q(i), this.b);
        int M = M();
        P(this.v);
        apc apcVar = this.x;
        if (apcVar != null) {
            while (true) {
                int i3 = apcVar.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 != 0) {
                    if (apcVar.a[0] < i) {
                        break;
                    }
                    xrn.c(apcVar);
                } else {
                    ahh.i("IntList is empty.");
                    return false;
                }
            }
        }
        boolean J = J(i, this.t - i);
        K(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= M;
        return J;
    }

    public final boolean J(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = gah.b(this.d, i3, n() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    nr8 nr8Var = (nr8) this.d.get(b);
                    int c = c(nr8Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        nr8Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return z;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int O = O(q(i), this.b);
        int f = f(q(i + 1), this.b);
        int i3 = O + i2;
        if (i3 < O || i3 >= f) {
            uq4.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int g = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    public final int M() {
        int q = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(q(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(q(i), this.b);
    }

    public final int O(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int d = gah.d(i, iArr);
        int i2 = this.l;
        int length = this.c.length;
        if (d < 0) {
            return (length - i2) + d + 1;
        }
        return d;
    }

    public final vr8 P(int i) {
        nr8 S;
        HashMap hashMap = this.e;
        if (hashMap == null || (S = S(i)) == null) {
            return null;
        }
        return (vr8) hashMap.get(S);
    }

    public final void Q() {
        if (this.n != 0) {
            uq4.a("Key must be supplied when inserting");
        }
        uwn uwnVar = oq4.a;
        R(uwnVar, uwnVar, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(Object obj, Object obj2, boolean z, int i) {
        Object[] objArr;
        int i2;
        int i3;
        int i4;
        int i5 = this.v;
        if (this.n > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        this.r.c(this.o);
        uwn uwnVar = oq4.a;
        if (objArr != false) {
            int i6 = this.t;
            int f = f(q(i6), this.b);
            v(1);
            this.i = f;
            this.j = f;
            int q = q(i6);
            if (obj != uwnVar) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != uwnVar) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i6) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i3 << 29) | (i4 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = h;
            int i9 = (z ? 1 : 0) + i3 + i4;
            if (i9 > 0) {
                w(i9, i6);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i3 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i4 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i6 + 1;
            this.v = i6;
            this.t = i2;
            if (i5 >= 0) {
                P(i5);
            }
        } else {
            this.p.c(i5);
            this.q.c((n() - this.h) - this.u);
            int i11 = this.t;
            int q2 = q(i11);
            if (!Intrinsics.areEqual(obj2, uwnVar)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(q2, this.b);
            this.j = f(q(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i12 = q2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final nr8 S(int i) {
        ArrayList arrayList;
        int c;
        if (i < 0 || i >= o() || (c = gah.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (nr8) arrayList.get(c);
    }

    public final void T(Object obj) {
        if (this.n > 0 && this.i != this.k) {
            bpc bpcVar = this.s;
            if (bpcVar == null) {
                bpcVar = new bpc(0, 1, null);
            }
            this.s = bpcVar;
            int i = this.v;
            Object b = bpcVar.b(i);
            if (b == null) {
                b = new vpc(0, 1, null);
                bpcVar.i(i, b);
            }
            ((vpc) b).g(obj);
            return;
        }
        G(obj);
    }

    public final void U(Object obj) {
        int q = q(this.t);
        int i = (q * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            uq4.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(q, iArr))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            apc apcVar = this.x;
            if (apcVar == null) {
                apcVar = new apc(0, 1, null);
                this.x = apcVar;
            }
            xrn.a(apcVar, i);
        }
    }

    public final void W(int i, Object obj) {
        int q = q(i);
        int[] iArr = this.b;
        if (q >= iArr.length || (iArr[(q * 5) + 1] & 1073741824) == 0) {
            uq4.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(q, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            uq4.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            f1f.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            uq4.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int f = f(q(i2), this.b);
        this.i = f;
        this.j = f;
    }

    public final nr8 b(int i) {
        ArrayList arrayList = this.d;
        int c = gah.c(arrayList, i, o());
        if (c < 0) {
            if (i > this.g) {
                i = -(o() - i);
            }
            nr8 nr8Var = new nr8(i);
            arrayList.add(-(c + 1), nr8Var);
            return nr8Var;
        }
        return (nr8) arrayList.get(c);
    }

    public final int c(nr8 nr8Var) {
        int i = nr8Var.a;
        if (i < 0) {
            return o() + i;
        }
        return i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        bpc bpcVar = this.f;
        eah eahVar = this.a;
        if (!eahVar.h) {
            f1f.a("Unexpected writer close()");
        }
        eahVar.h = false;
        eahVar.b = iArr;
        eahVar.c = i2;
        eahVar.d = objArr;
        eahVar.e = i3;
        eahVar.j = arrayList;
        eahVar.k = hashMap;
        eahVar.l = bpcVar;
    }

    public final int f(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.l;
        int length = this.c.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public final int g(int i) {
        int i2;
        int i3 = this.l;
        if (i < this.k) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final void i() {
        boolean z;
        boolean z2;
        int i;
        int q;
        vpc vpcVar;
        int i2 = 0;
        if (this.n > 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.t;
        int i4 = this.u;
        int i5 = this.v;
        int q2 = q(i5);
        int i6 = this.o;
        int i7 = i3 - i5;
        int i8 = q2 * 5;
        int i9 = i8 + 1;
        if ((this.b[i9] & 1073741824) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o1a o1aVar = this.r;
        if (z) {
            bpc bpcVar = this.s;
            if (bpcVar != null && (vpcVar = (vpc) bpcVar.b(i5)) != null) {
                Object[] objArr = vpcVar.a;
                int i10 = vpcVar.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    G(objArr[i11]);
                }
            }
            int[] iArr = this.b;
            iArr[i8 + 3] = i7;
            gah.f(q2, i6, iArr);
            int b = o1aVar.b();
            if (z2) {
                i6 = 1;
            }
            this.o = b + i6;
            int F = F(i5, this.b);
            this.v = F;
            if (F < 0) {
                q = o();
            } else {
                q = q(F + 1);
            }
            if (q >= 0) {
                i2 = f(q, this.b);
            }
            this.i = i2;
            this.j = i2;
            return;
        }
        if (i3 != i4) {
            uq4.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = i8 + 3;
        int i13 = iArr2[i12];
        int i14 = iArr2[i9] & 67108863;
        iArr2[i12] = i7;
        gah.f(q2, i6, iArr2);
        int b2 = this.p.b();
        this.u = (n() - this.h) - this.q.b();
        this.v = b2;
        int F2 = F(i5, this.b);
        int b3 = o1aVar.b();
        this.o = b3;
        if (F2 == b2) {
            if (!z2) {
                i2 = i6 - i14;
            }
            this.o = b3 + i2;
            return;
        }
        int i15 = i7 - i13;
        if (z2) {
            i = 0;
        } else {
            i = i6 - i14;
        }
        if (i15 != 0 || i != 0) {
            while (F2 != 0 && F2 != b2 && (i != 0 || i15 != 0)) {
                int q3 = q(F2);
                if (i15 != 0) {
                    int[] iArr3 = this.b;
                    int i16 = (q3 * 5) + 3;
                    iArr3[i16] = iArr3[i16] + i15;
                }
                if (i != 0) {
                    int[] iArr4 = this.b;
                    gah.f(q3, (iArr4[(q3 * 5) + 1] & 67108863) + i, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(q3 * 5) + 1] & 1073741824) != 0) {
                    i = 0;
                }
                F2 = F(F2, iArr5);
            }
        }
        this.o += i;
    }

    public final void j() {
        if (this.n <= 0) {
            f1f.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                uq4.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.b();
        }
    }

    public final void k(int i) {
        boolean z;
        boolean z2 = false;
        if (this.n <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            uq4.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z2 = true;
            }
            if (!z2) {
                uq4.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, Function2 function2) {
        int i2;
        int i3;
        int i4;
        Function2 function22 = function2;
        int F = F(i, this.b);
        int o = o();
        int t = t(i) + i;
        int i5 = i;
        cpc cpcVar = null;
        apc apcVar = null;
        loop0: while (i5 < t) {
            int f = f(q(i5), this.b);
            int i6 = i5 + 1;
            int f2 = f(q(i6), this.b);
            while (f < f2) {
                Object obj = this.c[g(f)];
                if (obj instanceof xr8) {
                    xr8 xr8Var = (xr8) obj;
                    if (!(xr8Var instanceof xr8)) {
                        xr8Var = null;
                    }
                    if (xr8Var != null) {
                        int i7 = xr8Var.b;
                        if (i7 >= 0) {
                            int t2 = t(i5) + i5;
                            int i8 = i6;
                            int i9 = 0;
                            while (i8 < t2 && i9 < i7) {
                                int q = q(i8);
                                int i10 = F;
                                int[] iArr = this.b;
                                int i11 = q * 5;
                                i8 = iArr[i11 + 3] + i8;
                                if (i8 < t2 && (iArr[i11 + 1] & 536870912) == 0) {
                                    i9++;
                                }
                                F = i10;
                            }
                            i4 = F;
                            if (cpcVar == null) {
                                cpcVar = m1a.a();
                            }
                            if (apcVar == null) {
                                apcVar = new apc(0, 1, null);
                            }
                            cpcVar.b(i8);
                            apcVar.c(i8);
                            apcVar.c(f);
                            f++;
                            F = i4;
                        }
                    } else {
                        uq4.b("Inconsistent composition");
                        f05.c();
                        return;
                    }
                }
                i4 = F;
                function22.invoke(Integer.valueOf(f), obj);
                f++;
                F = i4;
            }
            int i12 = F;
            int i13 = 0;
            if (i6 < o) {
                F = F(i6, this.b);
            } else {
                F = -1;
            }
            if (F != i5) {
                int i14 = i5;
                int i15 = i12;
                while (true) {
                    if (apcVar != null && cpcVar != null && cpcVar.g(i14)) {
                        int i16 = apcVar.b;
                        int i17 = i16 / 2;
                        int i18 = i13;
                        while (i18 < i17) {
                            int i19 = i18 * 2;
                            int i20 = o;
                            int a = apcVar.a(i19);
                            if (a == i14) {
                                int a2 = apcVar.a(i19 + 1);
                                function22.invoke(Integer.valueOf(a2), this.c[g(a2)]);
                            } else if (i19 != i13) {
                                int i21 = i13 + 1;
                                apcVar.f(i13, a);
                                i13 += 2;
                                apcVar.f(i21, apcVar.a(i19 + 1));
                            } else {
                                i13 += 2;
                            }
                            i18++;
                            function22 = function2;
                            o = i20;
                        }
                        i2 = o;
                        if (i13 != i16) {
                            if (i13 < 0 || i13 > (i3 = apcVar.b) || i16 < 0 || i16 > i3) {
                                break loop0;
                            }
                            if (i16 >= i13) {
                                if (i16 != i13) {
                                    if (i16 < i3) {
                                        int[] iArr2 = apcVar.a;
                                        ArraysKt.k(i13, i16, i3, iArr2, iArr2);
                                    }
                                    apcVar.b -= i16 - i13;
                                }
                            } else {
                                dmk.v("The end index must be < start index");
                                return;
                            }
                        }
                    } else {
                        i2 = o;
                    }
                    if (i14 != i && i15 != F) {
                        i14 = i15;
                        o = i2;
                        i13 = 0;
                        i15 = F(i15, this.b);
                        function22 = function2;
                    }
                }
            } else {
                i2 = o;
            }
            function22 = function2;
            i5 = i6;
            o = i2;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = (q * 5) + 1;
        if ((iArr[i2] & 268435456) != 0) {
            return this.c[Integer.bitCount(iArr[i2] >> 29) + f(q, iArr)];
        }
        return oq4.a;
    }

    public final int q(int i) {
        int i2;
        int i3 = this.h;
        if (i < this.g) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + o() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final boolean u(int i, int i2) {
        int n;
        int t;
        if (i2 == this.v) {
            n = this.u;
        } else {
            o1a o1aVar = this.p;
            if (i2 > o1aVar.a(0)) {
                t = t(i2);
            } else {
                int[] iArr = o1aVar.a;
                int min = Math.min(iArr.length, o1aVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (iArr[i3] == i2) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 < 0) {
                    t = t(i2);
                } else {
                    n = (n() - this.h) - this.q.a[i3];
                }
            }
            n = t + i2;
        }
        if (i <= i2 || i >= n) {
            return false;
        }
        return true;
    }

    public final void v(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.t;
            A(i3);
            int i4 = this.g;
            int i5 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                ArraysKt.k(0, 0, i4 * 5, iArr, iArr2);
                ArraysKt.k((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i5 = i8;
                iArr = iArr2;
            }
            int i9 = this.u;
            if (i9 >= i4) {
                this.u = i9 + i;
            }
            int i10 = i4 + i;
            this.g = i10;
            this.h = i5 - i;
            if (i6 > 0) {
                i2 = f(q(i3 + i), iArr);
            } else {
                i2 = 0;
            }
            if (this.m >= i4) {
                i7 = this.k;
            }
            int h = h(i2, i7, this.l, this.c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                this.b[(i11 * 5) + 4] = h;
            }
            int i12 = this.m;
            if (i12 >= i4) {
                this.m = i12 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        if ((this.b[(q(i) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final void z(eah eahVar, int i) {
        if (this.n <= 0) {
            uq4.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.c == 0) {
            int[] iArr = eahVar.b;
            int i2 = iArr[(i * 5) + 3];
            int i3 = eahVar.c;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                bpc bpcVar = this.f;
                Object[] objArr2 = eahVar.d;
                int i4 = eahVar.e;
                HashMap hashMap2 = eahVar.k;
                bpc bpcVar2 = eahVar.l;
                this.b = iArr;
                this.c = objArr2;
                this.d = eahVar.j;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = bpcVar2;
                eahVar.b = iArr2;
                eahVar.c = 0;
                eahVar.d = objArr;
                eahVar.e = 0;
                eahVar.j = arrayList;
                eahVar.k = hashMap;
                eahVar.l = bpcVar;
                return;
            }
        }
        iah j = eahVar.j();
        try {
            hah.a(j, i, this, true, true, false);
            j.e(true);
        } catch (Throwable th) {
            j.e(false);
            throw th;
        }
    }
}
