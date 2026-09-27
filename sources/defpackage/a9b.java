package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a9b {
    public static boolean q = false;
    public final i6f d;
    public final m64 m;
    public jl0 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public ceh[] n = new ceh[1000];
    public int o = 0;
    public jl0[] g = new jl0[32];

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, m64] */
    /* JADX WARN: Type inference failed for: r2v2, types: [i6f, java.lang.Object, jl0] */
    public a9b() {
        s();
        ?? obj = new Object();
        obj.a = new v0h(14, (byte) 0);
        obj.b = new v0h(14, (byte) 0);
        obj.c = new ceh[32];
        this.m = obj;
        ?? jl0Var = new jl0(obj);
        jl0Var.f = new ceh[128];
        jl0Var.g = new ceh[128];
        jl0Var.h = 0;
        jl0Var.i = new qje((Object) jl0Var, 2);
        this.d = jl0Var;
        this.p = new jl0(obj);
    }

    public static int n(Object obj) {
        ceh cehVar = ((py4) obj).i;
        if (cehVar != null) {
            return (int) (cehVar.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final ceh a(beh behVar) {
        v0h v0hVar = (v0h) this.m.b;
        int i = v0hVar.b;
        ceh cehVar = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = (Object[]) v0hVar.c;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            v0hVar.b = i2;
            cehVar = r4;
        }
        ceh cehVar2 = cehVar;
        if (cehVar2 == null) {
            cehVar2 = new ceh(behVar);
            cehVar2.i = behVar;
        } else {
            cehVar2.c();
            cehVar2.i = behVar;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (ceh[]) Arrays.copyOf(this.n, i5);
        }
        ceh[] cehVarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        cehVarArr[i6] = cehVar2;
        return cehVar2;
    }

    public final void b(ceh cehVar, ceh cehVar2, int i, float f, ceh cehVar3, ceh cehVar4, int i2, int i3) {
        jl0 l = l();
        if (cehVar2 == cehVar3) {
            l.d.g(cehVar, 1.0f);
            l.d.g(cehVar4, 1.0f);
            l.d.g(cehVar2, -2.0f);
        } else {
            xk0 xk0Var = l.d;
            if (f == 0.5f) {
                xk0Var.g(cehVar, 1.0f);
                l.d.g(cehVar2, -1.0f);
                l.d.g(cehVar3, -1.0f);
                l.d.g(cehVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                xk0Var.g(cehVar, -1.0f);
                l.d.g(cehVar2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                xk0Var.g(cehVar4, -1.0f);
                l.d.g(cehVar3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                xk0Var.g(cehVar, f2 * 1.0f);
                l.d.g(cehVar2, f2 * (-1.0f));
                l.d.g(cehVar3, (-1.0f) * f);
                l.d.g(cehVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
    
        if (r4.l <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00df, code lost:
    
        if (r4.l <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f4, code lost:
    
        if (r4.l <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f7, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
    
        if (r4.l <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(jl0 jl0Var) {
        boolean z;
        boolean z2;
        ceh cehVar;
        ceh f;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (!jl0Var.e) {
            ArrayList arrayList = jl0Var.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = jl0Var.d.d();
                    for (int i = 0; i < d; i++) {
                        ceh e = jl0Var.d.e(i);
                        if (e.c != -1 || e.f) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            ceh cehVar2 = (ceh) arrayList.get(i2);
                            if (cehVar2.f) {
                                jl0Var.h(this, cehVar2, true);
                            } else {
                                jl0Var.i(this, this.g[cehVar2.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (jl0Var.a != null && jl0Var.d.d() == 0) {
                    jl0Var.e = true;
                    this.b = true;
                }
            }
            if (!jl0Var.e()) {
                float f2 = jl0Var.b;
                float f3 = 0.0f;
                if (f2 < 0.0f) {
                    jl0Var.b = f2 * (-1.0f);
                    xk0 xk0Var = jl0Var.d;
                    int i3 = xk0Var.h;
                    for (int i4 = 0; i3 != -1 && i4 < xk0Var.a; i4++) {
                        float[] fArr = xk0Var.g;
                        fArr[i3] = fArr[i3] * (-1.0f);
                        i3 = xk0Var.f[i3];
                    }
                }
                int d2 = jl0Var.d.d();
                float f4 = 0.0f;
                float f5 = 0.0f;
                ceh cehVar3 = null;
                ceh cehVar4 = null;
                int i5 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (i5 < d2) {
                    float f6 = jl0Var.d.f(i5);
                    ceh e2 = jl0Var.d.e(i5);
                    float f7 = f3;
                    if (e2.i == beh.UNRESTRICTED) {
                        if (cehVar3 != null) {
                            if (f4 <= f6) {
                                if (!z5) {
                                    if (e2.l > 1) {
                                    }
                                }
                            }
                            z5 = true;
                        }
                        cehVar3 = e2;
                        f4 = f6;
                    } else if (cehVar3 == null && f6 < f7) {
                        if (cehVar4 != null) {
                            if (f5 <= f6) {
                                if (!z6) {
                                    if (e2.l > 1) {
                                    }
                                }
                            }
                            z6 = true;
                        }
                        cehVar4 = e2;
                        f5 = f6;
                    }
                    i5++;
                    f3 = f7;
                }
                float f8 = f3;
                if (cehVar3 == null) {
                    cehVar3 = cehVar4;
                }
                if (cehVar3 == null) {
                    z2 = true;
                } else {
                    jl0Var.g(cehVar3);
                    z2 = false;
                }
                if (jl0Var.d.d() == 0) {
                    jl0Var.e = true;
                }
                if (z2) {
                    if (this.j + 1 >= this.f) {
                        o();
                    }
                    ceh a = a(beh.SLACK);
                    int i6 = this.c + 1;
                    this.c = i6;
                    this.j++;
                    a.b = i6;
                    m64 m64Var = this.m;
                    ((ceh[]) m64Var.c)[i6] = a;
                    jl0Var.a = a;
                    int i7 = this.k;
                    h(jl0Var);
                    if (this.k == i7 + 1) {
                        jl0 jl0Var2 = this.p;
                        jl0Var2.a = null;
                        jl0Var2.d.b();
                        for (int i8 = 0; i8 < jl0Var.d.d(); i8++) {
                            jl0Var2.d.a(jl0Var.d.e(i8), jl0Var.d.f(i8), true);
                        }
                        r(this.p);
                        if (a.c == -1) {
                            if (jl0Var.a == a && (f = jl0Var.f(null, a)) != null) {
                                jl0Var.g(f);
                            }
                            if (!jl0Var.e) {
                                jl0Var.a.e(this, jl0Var);
                            }
                            ((v0h) m64Var.a).w(jl0Var);
                            this.k--;
                        }
                        cehVar = jl0Var.a;
                        if (cehVar == null) {
                            if (cehVar.i == beh.UNRESTRICTED || jl0Var.b >= f8) {
                                z = z3;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                z3 = false;
                cehVar = jl0Var.a;
                if (cehVar == null) {
                }
            } else {
                return;
            }
        } else {
            z = false;
        }
        if (!z) {
            h(jl0Var);
        }
    }

    public final void d(ceh cehVar, int i) {
        int i2 = cehVar.c;
        if (i2 == -1) {
            cehVar.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                ceh cehVar2 = ((ceh[]) this.m.c)[i3];
            }
            return;
        }
        if (i2 != -1) {
            jl0 jl0Var = this.g[i2];
            if (jl0Var.e) {
                jl0Var.b = i;
                return;
            }
            if (jl0Var.d.d() == 0) {
                jl0Var.e = true;
                jl0Var.b = i;
                return;
            }
            jl0 l = l();
            if (i < 0) {
                l.b = i * (-1);
                l.d.g(cehVar, 1.0f);
            } else {
                l.b = i;
                l.d.g(cehVar, -1.0f);
            }
            c(l);
            return;
        }
        jl0 l2 = l();
        l2.a = cehVar;
        float f = i;
        cehVar.e = f;
        l2.b = f;
        l2.e = true;
        c(l2);
    }

    public final void e(ceh cehVar, ceh cehVar2, int i, int i2) {
        if (i2 == 8 && cehVar2.f && cehVar.c == -1) {
            cehVar.d(this, cehVar2.e + i);
            return;
        }
        jl0 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        xk0 xk0Var = l.d;
        if (!z) {
            xk0Var.g(cehVar, -1.0f);
            l.d.g(cehVar2, 1.0f);
        } else {
            xk0Var.g(cehVar, 1.0f);
            l.d.g(cehVar2, -1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(ceh cehVar, ceh cehVar2, int i, int i2) {
        jl0 l = l();
        ceh m = m();
        m.d = 0;
        l.b(cehVar, cehVar2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(ceh cehVar, ceh cehVar2, int i, int i2) {
        jl0 l = l();
        ceh m = m();
        m.d = 0;
        l.c(cehVar, cehVar2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(jl0 jl0Var) {
        int i;
        if (jl0Var.e) {
            jl0Var.a.d(this, jl0Var.b);
        } else {
            jl0[] jl0VarArr = this.g;
            int i2 = this.k;
            jl0VarArr[i2] = jl0Var;
            ceh cehVar = jl0Var.a;
            cehVar.c = i2;
            this.k = i2 + 1;
            cehVar.e(this, jl0Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                jl0 jl0Var2 = this.g[i3];
                if (jl0Var2 != null && jl0Var2.e) {
                    jl0Var2.a.d(this, jl0Var2.b);
                    ((v0h) this.m.a).w(jl0Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        jl0[] jl0VarArr2 = this.g;
                        int i6 = i4 - 1;
                        jl0 jl0Var3 = jl0VarArr2[i4];
                        jl0VarArr2[i6] = jl0Var3;
                        ceh cehVar2 = jl0Var3.a;
                        if (cehVar2.c == i4) {
                            cehVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            jl0 jl0Var = this.g[i];
            jl0Var.a.e = jl0Var.b;
        }
    }

    public final ceh j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        ceh a = a(beh.ERROR);
        float[] fArr = a.h;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.b = i2;
        a.d = i;
        ((ceh[]) this.m.c)[i2] = a;
        i6f i6fVar = this.d;
        i6fVar.i.b = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.d] = 1.0f;
        i6fVar.j(a);
        return a;
    }

    public final ceh k(Object obj) {
        if (obj != null) {
            if (this.j + 1 >= this.f) {
                o();
            }
            if (obj instanceof py4) {
                py4 py4Var = (py4) obj;
                ceh cehVar = py4Var.i;
                if (cehVar == null) {
                    py4Var.k();
                    cehVar = py4Var.i;
                }
                int i = cehVar.b;
                m64 m64Var = this.m;
                if (i != -1 && i <= this.c && ((ceh[]) m64Var.c)[i] != null) {
                    return cehVar;
                }
                if (i != -1) {
                    cehVar.c();
                }
                int i2 = this.c + 1;
                this.c = i2;
                this.j++;
                cehVar.b = i2;
                cehVar.i = beh.UNRESTRICTED;
                ((ceh[]) m64Var.c)[i2] = cehVar;
                return cehVar;
            }
            return null;
        }
        return null;
    }

    public final jl0 l() {
        Object obj;
        m64 m64Var = this.m;
        v0h v0hVar = (v0h) m64Var.a;
        int i = v0hVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = (Object[]) v0hVar.c;
            obj = objArr[i2];
            objArr[i2] = null;
            v0hVar.b = i2;
        } else {
            obj = null;
        }
        jl0 jl0Var = (jl0) obj;
        if (jl0Var == null) {
            return new jl0(m64Var);
        }
        jl0Var.a = null;
        jl0Var.d.b();
        jl0Var.b = 0.0f;
        jl0Var.e = false;
        return jl0Var;
    }

    public final ceh m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        ceh a = a(beh.SLACK);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.b = i;
        ((ceh[]) this.m.c)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (jl0[]) Arrays.copyOf(this.g, i);
        m64 m64Var = this.m;
        m64Var.c = (ceh[]) Arrays.copyOf((ceh[]) m64Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        i6f i6fVar = this.d;
        if (i6fVar.e()) {
            i();
            return;
        }
        if (this.h) {
            for (int i = 0; i < this.k; i++) {
                if (!this.g[i].e) {
                    q(i6fVar);
                    return;
                }
            }
            i();
            return;
        }
        q(i6fVar);
    }

    public final void q(i6f i6fVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            jl0 jl0Var = this.g[i];
            if (jl0Var.a.i != beh.UNRESTRICTED) {
                float f = 0.0f;
                if (jl0Var.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.k) {
                            jl0 jl0Var2 = this.g[i5];
                            if (jl0Var2.a.i != beh.UNRESTRICTED && !jl0Var2.e && jl0Var2.b < f) {
                                int d = jl0Var2.d.d();
                                int i7 = 0;
                                while (i7 < d) {
                                    ceh e = jl0Var2.d.e(i7);
                                    float c = jl0Var2.d.c(e);
                                    if (c > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = e.g[i8] / c;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = e.b;
                                                i3 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            jl0 jl0Var3 = this.g[i3];
                            jl0Var3.a.c = -1;
                            jl0Var3.g(((ceh[]) this.m.c)[i4]);
                            ceh cehVar = jl0Var3.a;
                            cehVar.c = i3;
                            cehVar.e(this, jl0Var3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        r(i6fVar);
        i();
    }

    public final void r(jl0 jl0Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 < this.j * 2) {
                ceh cehVar = jl0Var.a;
                if (cehVar != null) {
                    this.i[cehVar.b] = true;
                }
                ceh d = jl0Var.d(this.i);
                if (d != null) {
                    boolean[] zArr = this.i;
                    int i4 = d.b;
                    if (!zArr[i4]) {
                        zArr[i4] = true;
                    } else {
                        return;
                    }
                }
                if (d != null) {
                    float f = Float.MAX_VALUE;
                    int i5 = i;
                    int i6 = -1;
                    while (i5 < this.k) {
                        jl0 jl0Var2 = this.g[i5];
                        if (jl0Var2.a.i != beh.UNRESTRICTED && !jl0Var2.e) {
                            xk0 xk0Var = jl0Var2.d;
                            int i7 = xk0Var.h;
                            if (i7 != -1) {
                                for (int i8 = i; i7 != -1 && i8 < xk0Var.a; i8++) {
                                    if (xk0Var.e[i7] == d.b) {
                                        z = true;
                                        break;
                                    }
                                    i7 = xk0Var.f[i7];
                                }
                            }
                            z = false;
                            if (z) {
                                float c = jl0Var2.d.c(d);
                                if (c < 0.0f) {
                                    float f2 = (-jl0Var2.b) / c;
                                    if (f2 < f) {
                                        i6 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        i5++;
                        i = 0;
                    }
                    if (i6 > -1) {
                        jl0 jl0Var3 = this.g[i6];
                        jl0Var3.a.c = -1;
                        jl0Var3.g(d);
                        ceh cehVar2 = jl0Var3.a;
                        cehVar2.c = i6;
                        cehVar2.e(this, jl0Var3);
                    }
                } else {
                    z2 = true;
                }
                i = 0;
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            jl0 jl0Var = this.g[i];
            if (jl0Var != null) {
                ((v0h) this.m.a).w(jl0Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        m64 m64Var;
        int i = 0;
        while (true) {
            m64Var = this.m;
            ceh[] cehVarArr = (ceh[]) m64Var.c;
            if (i >= cehVarArr.length) {
                break;
            }
            ceh cehVar = cehVarArr[i];
            if (cehVar != null) {
                cehVar.c();
            }
            i++;
        }
        v0h v0hVar = (v0h) m64Var.b;
        ceh[] cehVarArr2 = this.n;
        int i2 = this.o;
        v0hVar.getClass();
        if (i2 > cehVarArr2.length) {
            i2 = cehVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ceh cehVar2 = cehVarArr2[i3];
            int i4 = v0hVar.b;
            Object[] objArr = (Object[]) v0hVar.c;
            if (i4 < objArr.length) {
                objArr[i4] = cehVar2;
                v0hVar.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((ceh[]) m64Var.c, (Object) null);
        this.c = 0;
        i6f i6fVar = this.d;
        i6fVar.h = 0;
        i6fVar.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            jl0 jl0Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new jl0(m64Var);
    }
}
