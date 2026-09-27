package defpackage;

import android.util.Pair;
import com.appsflyer.internal.l;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class v2j {
    public static final m2j a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [m2j, java.lang.Object] */
    static {
        u1k.G(0);
        u1k.G(1);
        u1k.G(2);
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, n2j n2jVar, o2j o2jVar, int i2, boolean z) {
        int i3 = f(i, n2jVar, false).c;
        if (m(i3, o2jVar, 0L).o == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, o2jVar, 0L).n;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == c(z)) {
                        return a(z);
                    }
                    return i + 1;
                }
                l.o();
                return 0;
            }
            return i;
        }
        if (i == c(z)) {
            return -1;
        }
        return i + 1;
    }

    public boolean equals(Object obj) {
        int c;
        if (this != obj) {
            if (obj instanceof v2j) {
                v2j v2jVar = (v2j) obj;
                if (v2jVar.o() == o() && v2jVar.h() == h()) {
                    o2j o2jVar = new o2j();
                    n2j n2jVar = new n2j();
                    o2j o2jVar2 = new o2j();
                    n2j n2jVar2 = new n2j();
                    int i = 0;
                    while (true) {
                        if (i < o()) {
                            if (!m(i, o2jVar, 0L).equals(v2jVar.m(i, o2jVar2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < h()) {
                                    if (!f(i2, n2jVar, true).equals(v2jVar.f(i2, n2jVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == v2jVar.a(true) && (c = c(true)) == v2jVar.c(true)) {
                                        while (a2 != c) {
                                            int e = e(a2, 0, true);
                                            if (e == v2jVar.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract n2j f(int i, n2j n2jVar, boolean z);

    public n2j g(Object obj, n2j n2jVar) {
        return f(b(obj), n2jVar, true);
    }

    public abstract int h();

    public int hashCode() {
        o2j o2jVar = new o2j();
        n2j n2jVar = new n2j();
        int o = o() + 217;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, o2jVar, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, n2jVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(o2j o2jVar, n2j n2jVar, int i, long j) {
        Pair j2 = j(o2jVar, n2jVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(o2j o2jVar, n2j n2jVar, int i, long j, long j2) {
        pfn.c(i, o());
        m(i, o2jVar, j2);
        if (j == -9223372036854775807L) {
            j = o2jVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = o2jVar.n;
        f(i2, n2jVar, false);
        while (i2 < o2jVar.o && n2jVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, n2jVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, n2jVar, true);
        long j3 = j - n2jVar.e;
        long j4 = n2jVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = n2jVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == a(z)) {
                        return c(z);
                    }
                    return i - 1;
                }
                l.o();
                return 0;
            }
            return i;
        }
        if (i == a(z)) {
            return -1;
        }
        return i - 1;
    }

    public abstract Object l(int i);

    public abstract o2j m(int i, o2j o2jVar, long j);

    public final void n(int i, o2j o2jVar) {
        m(i, o2jVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
