package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xfl {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public xfl(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        arn.e(str);
        arn.e(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        arn.b(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arn.b(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        arn.b(z3);
        arn.b(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final xfl a(long j) {
        return new xfl(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final xfl b(Long l, Long l2, Boolean bool) {
        return new xfl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
}
