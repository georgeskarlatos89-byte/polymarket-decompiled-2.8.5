package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h6i {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final hc4 i;

    public h6i(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, hc4 hc4Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = hc4Var;
    }

    public static h6i a(h6i h6iVar, long j, long j2, long j3, long j4, long j5, long j6, long j7, hc4 hc4Var, int i) {
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if ((i & 1) != 0) {
            j8 = h6iVar.a;
        } else {
            j8 = j;
        }
        if ((i & 2) != 0) {
            j9 = h6iVar.b;
        } else {
            j9 = j2;
        }
        if ((i & 4) != 0) {
            j10 = h6iVar.c;
        } else {
            j10 = j3;
        }
        if ((i & 8) != 0) {
            j11 = h6iVar.d;
        } else {
            j11 = j4;
        }
        if ((i & 16) != 0) {
            j12 = h6iVar.e;
        } else {
            j12 = j5;
        }
        long j15 = h6iVar.f;
        if ((i & 64) != 0) {
            j13 = h6iVar.g;
        } else {
            j13 = j6;
        }
        if ((i & 128) != 0) {
            j14 = h6iVar.h;
        } else {
            j14 = j7;
        }
        h6iVar.getClass();
        return new h6i(j8, j9, j10, j11, j12, j15, j13, j14, hc4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h6i) {
                h6i h6iVar = (h6i) obj;
                long j = h6iVar.a;
                int i = ib4.n;
                if (!hkj.a(this.a, j) || !hkj.a(this.b, h6iVar.b) || !hkj.a(this.c, h6iVar.c) || !hkj.a(this.d, h6iVar.d) || !hkj.a(this.e, h6iVar.e) || !hkj.a(this.f, h6iVar.f) || !hkj.a(this.g, h6iVar.g) || !hkj.a(this.h, h6iVar.h) || !Intrinsics.areEqual(this.i, h6iVar.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return this.i.hashCode() + woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String h = ib4.h(this.a);
        String h2 = ib4.h(this.b);
        String h3 = ib4.h(this.c);
        String h4 = ib4.h(this.d);
        String h5 = ib4.h(this.e);
        String h6 = ib4.h(this.f);
        String h7 = ib4.h(this.g);
        String h8 = ib4.h(this.h);
        StringBuilder r = m51.r("StripeColors(component=", h, ", componentBorder=", h2, ", componentDivider=");
        k84.q(r, h3, ", onComponent=", h4, ", subtitle=");
        k84.q(r, h5, ", textCursor=", h6, ", placeholderText=");
        k84.q(r, h7, ", appBarIcon=", h8, ", materialColors=");
        r.append(this.i);
        r.append(")");
        return r.toString();
    }
}
