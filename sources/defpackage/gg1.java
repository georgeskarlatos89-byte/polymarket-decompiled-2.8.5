package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gg1 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public gg1(v0[] v0VarArr) {
        this.a = 0;
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = v0VarArr;
    }

    public static final void G(int i) {
        if ((i & 3) == 0) {
            return;
        }
        t4n.a("Failed to parse the message.");
    }

    public static final void H(int i) {
        if ((i & 7) == 0) {
            return;
        }
        t4n.a("Failed to parse the message.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(w8l w8lVar, ndj ndjVar, v7l v7lVar) {
        int i;
        boolean z;
        int i2;
        B(2);
        l0f l0fVar = (l0f) this.e;
        int a = l0fVar.a(l0fVar.A());
        Object obj = ndjVar.d;
        Object obj2 = "";
        Object obj3 = obj;
        while (true) {
            try {
                int I = I();
                if (I == Integer.MAX_VALUE || l0fVar.d()) {
                    break;
                }
                boolean z2 = false;
                if (I != 1) {
                    if (I != 2) {
                        try {
                            if (!l0fVar.d() && (i2 = this.b) != this.c) {
                                z = l0fVar.n(i2);
                                if (z) {
                                    throw new IOException("Unable to parse map entry.");
                                    break;
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        } catch (o8l e) {
                            if (!l0fVar.d() && (i = this.b) != this.c) {
                                z2 = l0fVar.n(i);
                            }
                            throw new IOException("Unable to parse map entry.", e);
                        }
                    } else {
                        obj3 = E((fal) ndjVar.c, obj.getClass(), v7lVar);
                    }
                } else {
                    obj2 = E((fal) ndjVar.b, null, null);
                }
            } catch (Throwable th) {
                l0fVar.b(a);
                throw th;
            }
        }
    }

    public void B(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        dmk.w();
    }

    public void C(Object obj, p9l p9lVar, v7l v7lVar) {
        l0f l0fVar = (l0f) this.e;
        int A = l0fVar.A();
        if (l0fVar.a + l0fVar.b < 100) {
            int a = l0fVar.a(A);
            l0fVar.a++;
            p9lVar.a(obj, this, v7lVar);
            l0fVar.m(0);
            l0fVar.a--;
            l0fVar.b(a);
            return;
        }
        t4n.a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void D(Object obj, p9l p9lVar, v7l v7lVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            p9lVar.a(obj, this, v7lVar);
            if (this.b == this.c) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public Object E(fal falVar, Class cls, v7l v7lVar) {
        l0f l0fVar = (l0f) this.e;
        fal falVar2 = fal.zza;
        switch (falVar.ordinal()) {
            case 0:
                B(1);
                return Double.valueOf(l0fVar.o());
            case 1:
                B(5);
                return Float.valueOf(l0fVar.p());
            case 2:
                B(0);
                return Long.valueOf(l0fVar.r());
            case 3:
                B(0);
                return Long.valueOf(l0fVar.q());
            case 4:
                B(0);
                return Integer.valueOf(l0fVar.s());
            case 5:
                B(1);
                return Long.valueOf(l0fVar.t());
            case 6:
                B(5);
                return Integer.valueOf(l0fVar.u());
            case 7:
                B(0);
                return Boolean.valueOf(l0fVar.v());
            case 8:
                B(2);
                return l0fVar.x();
            case 9:
            default:
                dmk.v("unsupported field type.");
                return null;
            case 10:
                B(2);
                p9l a = m9l.c.a(cls);
                d8l zza = a.zza();
                C(zza, a, v7lVar);
                a.zzk(zza);
                return zza;
            case 11:
                return J();
            case 12:
                B(0);
                return Integer.valueOf(l0fVar.A());
            case 13:
                B(0);
                return Integer.valueOf(l0fVar.B());
            case 14:
                B(5);
                return Integer.valueOf(l0fVar.C());
            case 15:
                B(1);
                return Long.valueOf(l0fVar.D());
            case 16:
                B(0);
                return Integer.valueOf(l0fVar.E());
            case 17:
                B(0);
                return Long.valueOf(l0fVar.F());
        }
    }

    public void F(int i) {
        if (((l0f) this.e).e() == i) {
            return;
        }
        t4n.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public int I() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = ((l0f) this.e).l();
            this.b = i;
        }
        if (i != 0 && i != this.c) {
            return i >>> 3;
        }
        return bd0.API_PRIORITY_OTHER;
    }

    public i7l J() {
        B(2);
        return ((l0f) this.e).y();
    }

    public void K(n8l n8lVar) {
        int l;
        l0f l0fVar = (l0f) this.e;
        int i = this.b & 7;
        if (i != 1) {
            if (i == 2) {
                int A = l0fVar.A();
                H(A);
                int e = l0fVar.e() + A;
                do {
                    n8lVar.add(Double.valueOf(l0fVar.o()));
                } while (l0fVar.e() < e);
                return;
            }
            dmk.w();
            return;
        }
        do {
            n8lVar.add(Double.valueOf(l0fVar.o()));
            if (!l0fVar.d()) {
                l = l0fVar.l();
            } else {
                return;
            }
        } while (l == this.b);
        this.d = l;
    }

    public void L(n8l n8lVar) {
        int l;
        l0f l0fVar = (l0f) this.e;
        int i = this.b & 7;
        if (i != 2) {
            if (i != 5) {
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Float.valueOf(l0fVar.p()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        int A = l0fVar.A();
        G(A);
        int e = l0fVar.e() + A;
        do {
            n8lVar.add(Float.valueOf(l0fVar.p()));
        } while (l0fVar.e() < e);
    }

    public void M(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof t8l;
        int i2 = this.b;
        if (z) {
            t8l t8lVar = (t8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        t8lVar.d(l0fVar.q());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                t8lVar.d(l0fVar.q());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Long.valueOf(l0fVar.q()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Long.valueOf(l0fVar.q()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void a(aib aibVar) {
        aibVar.c = null;
        aibVar.a = null;
        aibVar.b = null;
        aibVar.i = 1;
        int i = this.b;
        if (i > 0) {
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                this.d = i2 + 1;
                i--;
                this.b = i;
                this.c++;
            }
        }
        aibVar.a = (aib) this.e;
        this.e = aibVar;
        int i3 = this.d;
        int i4 = i3 + 1;
        this.d = i4;
        if (i > 0 && (i4 & 1) == 0) {
            this.d = i3 + 2;
            this.b = i - 1;
            this.c++;
        }
        int i5 = 4;
        while (true) {
            int i6 = i5 - 1;
            if ((this.d & i6) == i6) {
                int i7 = this.c;
                if (i7 == 0) {
                    aib aibVar2 = (aib) this.e;
                    aib aibVar3 = aibVar2.a;
                    aib aibVar4 = aibVar3.a;
                    aibVar3.a = aibVar4.a;
                    this.e = aibVar3;
                    aibVar3.b = aibVar4;
                    aibVar3.c = aibVar2;
                    aibVar3.i = aibVar2.i + 1;
                    aibVar4.a = aibVar3;
                    aibVar2.a = aibVar3;
                } else if (i7 == 1) {
                    aib aibVar5 = (aib) this.e;
                    aib aibVar6 = aibVar5.a;
                    this.e = aibVar6;
                    aibVar6.c = aibVar5;
                    aibVar6.i = aibVar5.i + 1;
                    aibVar5.a = aibVar6;
                    this.c = 0;
                } else if (i7 == 2) {
                    this.c = 0;
                }
                i5 *= 2;
            } else {
                return;
            }
        }
    }

    public void b(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.d;
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.e;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.e = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 4];
                    this.e = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.e;
                iArr4[i4] = i;
                iArr4[i4 + 1] = i2;
                this.d++;
                return;
            }
            dmk.v("Pixel distance must be non-negative");
            return;
        }
        dmk.v("Layout positions must be non-negative");
    }

    public epg c(int i) {
        return new epg(ryb.c((zwi) this.e, i), i, 1L);
    }

    public void d() {
        View view = (View) this.e;
        int top = this.d - (view.getTop() - this.b);
        WeakHashMap weakHashMap = k9k.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public void e(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        e eVar = recyclerView.n;
        if (recyclerView.m != null && eVar != null && eVar.i) {
            if (z) {
                if (!recyclerView.e.i()) {
                    eVar.i(recyclerView.m.getItemCount(), this);
                }
            } else if (!recyclerView.R()) {
                eVar.h(this.b, this.c, recyclerView.u1, this);
            }
            int i = this.d;
            if (i > eVar.j) {
                eVar.j = i;
                eVar.k = z;
                recyclerView.c.n();
            }
        }
    }

    public int f() {
        return this.d - this.c;
    }

    public int g(int i) {
        return ((xkd) this.e).c[this.c + i];
    }

    public Object h(int i) {
        return ((xkd) this.e).e[this.d + i];
    }

    public long i() {
        int i = this.c;
        if (i != 0) {
            long[] jArr = (long[]) this.e;
            int i2 = this.b;
            long j = jArr[i2];
            this.b = this.d & (i2 + 1);
            this.c = i - 1;
            return j;
        }
        dmk.t();
        return 0L;
    }

    public synchronized void j(int i) {
        boolean z;
        if (i < this.b) {
            z = true;
        } else {
            z = false;
        }
        this.b = i;
        if (z) {
            k();
        }
    }

    public synchronized void k() {
        int max = Math.max(0, u1k.f(this.b, 65536) - this.c);
        int i = this.d;
        if (max >= i) {
            return;
        }
        Arrays.fill((sn[]) this.e, max, i, (Object) null);
        this.d = max;
    }

    public void l(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof t8l;
        int i2 = this.b;
        if (z) {
            t8l t8lVar = (t8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        t8lVar.d(l0fVar.r());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                t8lVar.d(l0fVar.r());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Long.valueOf(l0fVar.r()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Long.valueOf(l0fVar.r()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void m(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof e8l;
        int i2 = this.b;
        if (z) {
            e8l e8lVar = (e8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        e8lVar.zzh(l0fVar.s());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                e8lVar.zzh(l0fVar.s());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Integer.valueOf(l0fVar.s()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Integer.valueOf(l0fVar.s()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void n(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof t8l;
        int i2 = this.b;
        if (z) {
            t8l t8lVar = (t8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A = l0fVar.A();
                    H(A);
                    int e = l0fVar.e() + A;
                    do {
                        t8lVar.d(l0fVar.t());
                    } while (l0fVar.e() < e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                t8lVar.d(l0fVar.t());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int A2 = l0fVar.A();
                    H(A2);
                    int e2 = l0fVar.e() + A2;
                    do {
                        n8lVar.add(Long.valueOf(l0fVar.t()));
                    } while (l0fVar.e() < e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Long.valueOf(l0fVar.t()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void o(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof e8l;
        int i2 = this.b;
        if (z) {
            e8l e8lVar = (e8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    dmk.w();
                    return;
                }
                do {
                    e8lVar.zzh(l0fVar.u());
                    if (!l0fVar.d()) {
                        i = l0fVar.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else {
                int A = l0fVar.A();
                G(A);
                int e = l0fVar.e() + A;
                do {
                    e8lVar.zzh(l0fVar.u());
                } while (l0fVar.e() < e);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    dmk.w();
                    return;
                }
                do {
                    n8lVar.add(Integer.valueOf(l0fVar.u()));
                    if (!l0fVar.d()) {
                        l = l0fVar.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else {
                int A2 = l0fVar.A();
                G(A2);
                int e2 = l0fVar.e() + A2;
                do {
                    n8lVar.add(Integer.valueOf(l0fVar.u()));
                } while (l0fVar.e() < e2);
                return;
            }
        }
        this.d = i;
    }

    public void p(n8l n8lVar) {
        int l;
        l0f l0fVar = (l0f) this.e;
        int i = this.b & 7;
        if (i != 0) {
            if (i == 2) {
                int e = l0fVar.e() + l0fVar.A();
                do {
                    n8lVar.add(Boolean.valueOf(l0fVar.v()));
                } while (l0fVar.e() < e);
                F(e);
                return;
            }
            dmk.w();
            return;
        }
        do {
            n8lVar.add(Boolean.valueOf(l0fVar.v()));
            if (!l0fVar.d()) {
                l = l0fVar.l();
            } else {
                return;
            }
        } while (l == this.b);
        this.d = l;
    }

    public void q(n8l n8lVar, boolean z) {
        String w;
        int l;
        l0f l0fVar = (l0f) this.e;
        if ((this.b & 7) != 2) {
            dmk.w();
            return;
        }
        do {
            if (z) {
                B(2);
                w = l0fVar.x();
            } else {
                B(2);
                w = l0fVar.w();
            }
            n8lVar.add(w);
            if (l0fVar.d()) {
                return;
            } else {
                l = l0fVar.l();
            }
        } while (l == this.b);
        this.d = l;
    }

    public void r(n8l n8lVar, p9l p9lVar, v7l v7lVar) {
        int l;
        int i = this.b;
        if ((i & 7) != 2) {
            dmk.w();
            return;
        }
        do {
            d8l zza = p9lVar.zza();
            C(zza, p9lVar, v7lVar);
            p9lVar.zzk(zza);
            n8lVar.add(zza);
            l0f l0fVar = (l0f) this.e;
            if (!l0fVar.d() && this.d == 0) {
                l = l0fVar.l();
            } else {
                return;
            }
        } while (l == i);
        this.d = l;
    }

    public void s(n8l n8lVar, p9l p9lVar, v7l v7lVar) {
        int l;
        int i = this.b;
        if ((i & 7) != 3) {
            dmk.w();
            return;
        }
        do {
            d8l zza = p9lVar.zza();
            D(zza, p9lVar, v7lVar);
            p9lVar.zzk(zza);
            n8lVar.add(zza);
            l0f l0fVar = (l0f) this.e;
            if (!l0fVar.d() && this.d == 0) {
                l = l0fVar.l();
            } else {
                return;
            }
        } while (l == i);
        this.d = l;
    }

    public void t(n8l n8lVar) {
        int l;
        if ((this.b & 7) != 2) {
            dmk.w();
            return;
        }
        do {
            n8lVar.add(J());
            l0f l0fVar = (l0f) this.e;
            if (l0fVar.d()) {
                return;
            } else {
                l = l0fVar.l();
            }
        } while (l == this.b);
        this.d = l;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "";
            case 7:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                zwi zwiVar = (zwi) this.e;
                sb.append(ryb.c(zwiVar, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(ryb.c(zwiVar, i2));
                sb.append("), prevOffset=");
                return sv6.o(sb, this.d, ')');
            default:
                return super.toString();
        }
    }

    public void u(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof e8l;
        int i2 = this.b;
        if (z) {
            e8l e8lVar = (e8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        e8lVar.zzh(l0fVar.A());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                e8lVar.zzh(l0fVar.A());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Integer.valueOf(l0fVar.A()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Integer.valueOf(l0fVar.A()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void v(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof e8l;
        int i2 = this.b;
        if (z) {
            e8l e8lVar = (e8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        e8lVar.zzh(l0fVar.B());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                e8lVar.zzh(l0fVar.B());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Integer.valueOf(l0fVar.B()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Integer.valueOf(l0fVar.B()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void w(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof e8l;
        int i2 = this.b;
        if (z) {
            e8l e8lVar = (e8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    dmk.w();
                    return;
                }
                do {
                    e8lVar.zzh(l0fVar.C());
                    if (!l0fVar.d()) {
                        i = l0fVar.l();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else {
                int A = l0fVar.A();
                G(A);
                int e = l0fVar.e() + A;
                do {
                    e8lVar.zzh(l0fVar.C());
                } while (l0fVar.e() < e);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    dmk.w();
                    return;
                }
                do {
                    n8lVar.add(Integer.valueOf(l0fVar.C()));
                    if (!l0fVar.d()) {
                        l = l0fVar.l();
                    } else {
                        return;
                    }
                } while (l == this.b);
                i = l;
            } else {
                int A2 = l0fVar.A();
                G(A2);
                int e2 = l0fVar.e() + A2;
                do {
                    n8lVar.add(Integer.valueOf(l0fVar.C()));
                } while (l0fVar.e() < e2);
                return;
            }
        }
        this.d = i;
    }

    public void x(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof t8l;
        int i2 = this.b;
        if (z) {
            t8l t8lVar = (t8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int A = l0fVar.A();
                    H(A);
                    int e = l0fVar.e() + A;
                    do {
                        t8lVar.d(l0fVar.D());
                    } while (l0fVar.e() < e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                t8lVar.d(l0fVar.D());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int A2 = l0fVar.A();
                    H(A2);
                    int e2 = l0fVar.e() + A2;
                    do {
                        n8lVar.add(Long.valueOf(l0fVar.D()));
                    } while (l0fVar.e() < e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Long.valueOf(l0fVar.D()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void y(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof e8l;
        int i2 = this.b;
        if (z) {
            e8l e8lVar = (e8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        e8lVar.zzh(l0fVar.E());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                e8lVar.zzh(l0fVar.E());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Integer.valueOf(l0fVar.E()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Integer.valueOf(l0fVar.E()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void z(n8l n8lVar) {
        int l;
        int i;
        l0f l0fVar = (l0f) this.e;
        boolean z = n8lVar instanceof t8l;
        int i2 = this.b;
        if (z) {
            t8l t8lVar = (t8l) n8lVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int e = l0fVar.e() + l0fVar.A();
                    do {
                        t8lVar.d(l0fVar.F());
                    } while (l0fVar.e() < e);
                    F(e);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                t8lVar.d(l0fVar.F());
                if (!l0fVar.d()) {
                    i = l0fVar.l();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int e2 = l0fVar.e() + l0fVar.A();
                    do {
                        n8lVar.add(Long.valueOf(l0fVar.F()));
                    } while (l0fVar.e() < e2);
                    F(e2);
                    return;
                }
                dmk.w();
                return;
            }
            do {
                n8lVar.add(Long.valueOf(l0fVar.F()));
                if (!l0fVar.d()) {
                    l = l0fVar.l();
                } else {
                    return;
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public /* synthetic */ gg1(Object obj, int i) {
        this.a = i;
        this.e = obj;
    }

    public gg1(l0f l0fVar) {
        this.a = 9;
        this.d = 0;
        this.e = l0fVar;
        l0fVar.c = this;
    }

    public /* synthetic */ gg1(int i) {
        this.a = i;
    }

    public gg1(int i, int i2, int i3, zwi zwiVar) {
        this.a = 7;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = zwiVar;
    }
}
