package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lp {
    public final long a;
    public final v2j b;
    public final int c;
    public final x7c d;
    public final long e;
    public final v2j f;
    public final int g;
    public final x7c h;
    public final long i;
    public final long j;

    public lp(long j, v2j v2jVar, int i, x7c x7cVar, long j2, v2j v2jVar2, int i2, x7c x7cVar2, long j3, long j4) {
        this.a = j;
        this.b = v2jVar;
        this.c = i;
        this.d = x7cVar;
        this.e = j2;
        this.f = v2jVar2;
        this.g = i2;
        this.h = x7cVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lp.class == obj.getClass()) {
                lp lpVar = (lp) obj;
                if (this.a == lpVar.a && this.c == lpVar.c && this.e == lpVar.e && this.g == lpVar.g && this.i == lpVar.i && this.j == lpVar.j && this.b.equals(lpVar.b) && Objects.equals(this.d, lpVar.d) && Objects.equals(this.f, lpVar.f) && Objects.equals(this.h, lpVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
