package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eah extends dil implements or4, Iterable, xja {
    public int c;
    public int e;
    public int f;
    public boolean h;
    public int i;
    public HashMap k;
    public bpc l;
    public int[] b = new int[0];
    public Object[] d = new Object[0];
    public final Object g = new Object();
    public ArrayList j = new ArrayList();

    public static final void h(iah iahVar, int i) {
        while (iahVar.v >= 0 && iahVar.u <= i) {
            iahVar.N();
            iahVar.i();
        }
    }

    public final int c(nr8 nr8Var) {
        if (this.h) {
            uq4.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!nr8Var.a()) {
            f1f.a("Anchor refers to a group that was removed");
        }
        return nr8Var.a;
    }

    public final void d() {
        this.k = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [vpc, lfd] */
    public final iqc f(qj0 qj0Var, lfd lfdVar) {
        int i;
        Object[] objArr = lfdVar.a;
        int i2 = lfdVar.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (!k(vql.b(((jmc) objArr[i3]).e))) {
                vpc vpcVar = new vpc(0, 1, null);
                Object[] objArr2 = lfdVar.a;
                int i4 = lfdVar.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (k(vql.b(((jmc) obj).e))) {
                        vpcVar.g(obj);
                    }
                }
                lfdVar = vpcVar;
            } else {
                i3++;
            }
        }
        jxf jxfVar = new jxf(this, 21);
        if (lfdVar.b > 1) {
            Comparable comparable = (Comparable) jxfVar.invoke(lfdVar.b(0));
            int i6 = lfdVar.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) jxfVar.invoke(lfdVar.b(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    ?? lfdVar2 = new lfd(lfdVar.b, null);
                    Object[] objArr3 = lfdVar.a;
                    int i8 = lfdVar.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        lfdVar2.g(objArr3[i9]);
                    }
                    tpc tpcVar = lfdVar2.c;
                    if (tpcVar == null) {
                        tpcVar = new tpc(lfdVar2);
                        lfdVar2.c = tpcVar;
                    }
                    if (tpcVar.size() > 1) {
                        gb4.g(tpcVar, new ap7(jxfVar, 1));
                    }
                    lfdVar = lfdVar2;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (lfdVar.d()) {
            iqc iqcVar = eig.b;
            iqcVar.getClass();
            return iqcVar;
        }
        iqc b = eig.b();
        iah j = j();
        try {
            Object[] objArr4 = lfdVar.a;
            int i10 = lfdVar.b;
            for (int i11 = 0; i11 < i10; i11++) {
                jmc jmcVar = (jmc) objArr4[i11];
                int c = j.c(vql.b(jmcVar.e));
                int F = j.F(c, j.b);
                h(j, F);
                h(j, F);
                while (true) {
                    i = j.t;
                    if (i == F || i == j.u) {
                        break;
                    }
                    if (F < j.t(i) + i) {
                        j.Q();
                    } else {
                        j.M();
                    }
                }
                if (i != F) {
                    uq4.a("Unexpected slot table structure");
                }
                j.Q();
                j.a(c - j.t);
                b.m(jmcVar, uq4.c(jmcVar.c, jmcVar, j, qj0Var));
            }
            h(j, bd0.API_PRIORITY_OTHER);
            j.e(true);
            return b;
        } catch (Throwable th) {
            j.e(false);
            throw th;
        }
    }

    public final dah i() {
        if (!this.h) {
            this.f++;
            return new dah(this);
        }
        dmk.n("Cannot read while a writer is pending");
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z09(this, 0, this.c);
    }

    public final iah j() {
        if (this.h) {
            uq4.a("Cannot start a writer when another writer is pending");
        }
        if (this.f > 0) {
            uq4.a("Cannot start a writer when a reader is pending");
        }
        this.h = true;
        this.i++;
        return new iah(this);
    }

    public final boolean k(nr8 nr8Var) {
        int c;
        if (nr8Var.a() && (c = gah.c(this.j, nr8Var.a, this.c)) >= 0 && Intrinsics.areEqual(this.j.get(c), nr8Var)) {
            return true;
        }
        return false;
    }

    public final vr8 l(int i) {
        nr8 nr8Var;
        int i2;
        ArrayList arrayList;
        int c;
        HashMap hashMap = this.k;
        if (hashMap != null) {
            if (this.h) {
                uq4.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i2 = this.c) && (c = gah.c((arrayList = this.j), i, i2)) >= 0) {
                nr8Var = (nr8) arrayList.get(c);
            } else {
                nr8Var = null;
            }
            if (nr8Var != null) {
                return (vr8) hashMap.get(nr8Var);
            }
        }
        return null;
    }
}
