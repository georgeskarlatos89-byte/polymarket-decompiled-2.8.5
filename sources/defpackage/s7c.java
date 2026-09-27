package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s7c {
    public final x7c a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public s7c(x7c x7cVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8 = true;
        if (z5 && !z3) {
            z6 = false;
        } else {
            z6 = true;
        }
        pfn.b(z6);
        if (z4 && !z3) {
            z7 = false;
        } else {
            z7 = true;
        }
        pfn.b(z7);
        if (z2 && (z3 || z4 || z5)) {
            z8 = false;
        }
        pfn.b(z8);
        this.a = x7cVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final s7c a(long j) {
        if (j == this.c) {
            return this;
        }
        return new s7c(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final s7c b(long j) {
        if (j == this.b) {
            return this;
        }
        return new s7c(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s7c.class == obj.getClass()) {
                s7c s7cVar = (s7c) obj;
                if (this.b == s7cVar.b && this.c == s7cVar.c && this.d == s7cVar.d && this.e == s7cVar.e && this.f == s7cVar.f && this.g == s7cVar.g && this.h == s7cVar.h && this.i == s7cVar.i && this.j == s7cVar.j && this.a.equals(s7cVar.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
