package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class v8j {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final jr9 i;
    public final jr9 j;
    public final jr9 k;
    public final int l;
    public final int m;
    public final jr9 n;
    public final t8j o;
    public final jr9 p;
    public final boolean q;
    public final int r;
    public final mr9 s;
    public final tr9 t;

    static {
        new v8j(new u8j());
        u1k.G(1);
        u1k.G(2);
        u1k.G(3);
        u1k.G(4);
        ix2.v(5, 6, 7, 8, 9);
        ix2.v(10, 11, 12, 13, 14);
        ix2.v(15, 16, 17, 18, 19);
        ix2.v(20, 21, 22, 23, 24);
        ix2.v(25, 26, 27, 28, 29);
        ix2.v(30, 31, 32, 33, 34);
    }

    public v8j(u8j u8jVar) {
        this.a = u8jVar.a;
        this.b = u8jVar.b;
        this.c = u8jVar.c;
        this.d = u8jVar.d;
        this.e = u8jVar.e;
        this.f = u8jVar.f;
        this.g = u8jVar.g;
        this.h = u8jVar.h;
        this.i = u8jVar.i;
        this.j = u8jVar.j;
        this.k = u8jVar.k;
        this.l = u8jVar.l;
        this.m = u8jVar.m;
        this.n = u8jVar.n;
        this.o = u8jVar.o;
        this.p = u8jVar.p;
        this.q = u8jVar.q;
        this.r = u8jVar.r;
        this.s = mr9.b(u8jVar.s);
        this.t = tr9.l(u8jVar.t);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                v8j v8jVar = (v8j) obj;
                if (this.a == v8jVar.a && this.b == v8jVar.b && this.c == v8jVar.c && this.d == v8jVar.d && this.h == v8jVar.h && this.e == v8jVar.e && this.f == v8jVar.f && this.g == v8jVar.g && this.i.equals(v8jVar.i) && this.j.equals(v8jVar.j) && this.k.equals(v8jVar.k) && this.l == v8jVar.l && this.m == v8jVar.m && this.n.equals(v8jVar.n) && this.o.equals(v8jVar.o) && this.p.equals(v8jVar.p) && this.q == v8jVar.q && this.r == v8jVar.r && wcn.f(this.s, v8jVar.s) && this.t.equals(v8jVar.t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.n.hashCode() + ((((((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.l) * 31) + this.m) * 31)) * 31;
        this.o.getClass();
        return this.t.hashCode() + ((this.s.hashCode() + ((((((this.p.hashCode() + ((hashCode + 29791) * 31)) * 961) + (this.q ? 1 : 0)) * 31) + this.r) * 28629151)) * 31);
    }
}
