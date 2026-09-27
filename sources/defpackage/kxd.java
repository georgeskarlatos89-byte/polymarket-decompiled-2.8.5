package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kxd implements Comparable {
    public static final String b;
    public final iw1 a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public kxd(iw1 iw1Var) {
        iw1Var.getClass();
        this.a = iw1Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int c = m.c(this);
        iw1 iw1Var = this.a;
        if (c == -1) {
            c = 0;
        } else if (c < iw1Var.d() && iw1Var.i(c) == 92) {
            c++;
        }
        int d = iw1Var.d();
        int i = c;
        while (c < d) {
            if (iw1Var.i(c) == 47 || iw1Var.i(c) == 92) {
                arrayList.add(iw1Var.p(i, c));
                i = c + 1;
            }
            c++;
        }
        if (i < iw1Var.d()) {
            arrayList.add(iw1Var.p(i, iw1Var.d()));
        }
        return arrayList;
    }

    public final String b() {
        iw1 iw1Var = m.a;
        iw1 iw1Var2 = this.a;
        int k = iw1.k(iw1Var2, iw1Var);
        if (k == -1) {
            k = iw1.k(iw1Var2, m.b);
        }
        if (k != -1) {
            iw1Var2 = iw1.q(iw1Var2, k + 1, 0, 2);
        } else if (g() != null && iw1Var2.d() == 2) {
            iw1Var2 = iw1.d;
        }
        return iw1Var2.t();
    }

    public final kxd c() {
        iw1 iw1Var = m.d;
        iw1 iw1Var2 = this.a;
        if (!Intrinsics.areEqual(iw1Var2, iw1Var)) {
            iw1 iw1Var3 = m.a;
            if (!Intrinsics.areEqual(iw1Var2, iw1Var3)) {
                iw1 iw1Var4 = m.b;
                if (!Intrinsics.areEqual(iw1Var2, iw1Var4)) {
                    iw1 iw1Var5 = m.e;
                    iw1Var2.getClass();
                    iw1Var5.getClass();
                    int d = iw1Var2.d();
                    byte[] bArr = iw1Var5.a;
                    if (!iw1Var2.n(d - bArr.length, iw1Var5, bArr.length) || (iw1Var2.d() != 2 && !iw1Var2.n(iw1Var2.d() - 3, iw1Var3, 1) && !iw1Var2.n(iw1Var2.d() - 3, iw1Var4, 1))) {
                        int k = iw1.k(iw1Var2, iw1Var3);
                        if (k == -1) {
                            k = iw1.k(iw1Var2, iw1Var4);
                        }
                        if (k == 2 && g() != null) {
                            if (iw1Var2.d() != 3) {
                                return new kxd(iw1.q(iw1Var2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k == 1) {
                            iw1Var4.getClass();
                            if (iw1Var2.n(0, iw1Var4, iw1Var4.d())) {
                                return null;
                            }
                        }
                        if (k == -1 && g() != null) {
                            if (iw1Var2.d() != 2) {
                                return new kxd(iw1.q(iw1Var2, 0, 2, 1));
                            }
                            return null;
                        }
                        if (k == -1) {
                            return new kxd(iw1Var);
                        }
                        if (k == 0) {
                            return new kxd(iw1.q(iw1Var2, 0, 1, 1));
                        }
                        return new kxd(iw1.q(iw1Var2, 0, k, 1));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kxd kxdVar = (kxd) obj;
        kxdVar.getClass();
        return this.a.b(kxdVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tp1, java.lang.Object] */
    public final kxd d(kxd kxdVar) {
        kxd kxdVar2;
        kxd kxdVar3;
        kxdVar.getClass();
        iw1 iw1Var = kxdVar.a;
        int c = m.c(this);
        iw1 iw1Var2 = this.a;
        if (c == -1) {
            kxdVar2 = null;
        } else {
            kxdVar2 = new kxd(iw1Var2.p(0, c));
        }
        int c2 = m.c(kxdVar);
        if (c2 == -1) {
            kxdVar3 = null;
        } else {
            kxdVar3 = new kxd(iw1Var.p(0, c2));
        }
        if (Intrinsics.areEqual(kxdVar2, kxdVar3)) {
            ArrayList a = a();
            ArrayList a2 = kxdVar.a();
            int min = Math.min(a.size(), a2.size());
            int i = 0;
            while (i < min && Intrinsics.areEqual(a.get(i), a2.get(i))) {
                i++;
            }
            if (i == min && iw1Var2.d() == iw1Var.d()) {
                return ah5.f(".");
            }
            if (a2.subList(i, a2.size()).indexOf(m.e) == -1) {
                if (Intrinsics.areEqual(iw1Var, m.d)) {
                    return this;
                }
                ?? obj = new Object();
                iw1 b2 = m.b(kxdVar);
                if (b2 == null && (b2 = m.b(this)) == null) {
                    b2 = m.f(b);
                }
                int size = a2.size();
                for (int i2 = i; i2 < size; i2++) {
                    obj.f0(m.e);
                    obj.f0(b2);
                }
                int size2 = a.size();
                while (i < size2) {
                    obj.f0((iw1) a.get(i));
                    obj.f0(b2);
                    i++;
                }
                return m.d(obj, false);
            }
            xbc.v("Impossible relative path to resolve: ", this, " and ", kxdVar);
            return null;
        }
        xbc.v("Paths of different roots cannot be relative to each other: ", this, " and ", kxdVar);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object] */
    public final kxd e(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.E0(str);
        return m.a(this, m.d(obj, false), false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kxd) && Intrinsics.areEqual(((kxd) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path = Paths.get(this.a.t(), new String[0]);
        path.getClass();
        return path;
    }

    public final Character g() {
        iw1 iw1Var = m.a;
        iw1 iw1Var2 = this.a;
        if (iw1.g(iw1Var2, iw1Var) == -1 && iw1Var2.d() >= 2 && iw1Var2.i(1) == 58) {
            char i = (char) iw1Var2.i(0);
            if (('a' <= i && i < '{') || ('A' <= i && i < '[')) {
                return Character.valueOf(i);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.t());
    }

    public final String toString() {
        return this.a.t();
    }
}
