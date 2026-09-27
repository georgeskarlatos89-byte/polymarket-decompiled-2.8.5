package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.AbstractDoubleTimeSource;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w1 implements ii4 {
    public final double a;
    public final AbstractDoubleTimeSource b;
    public final long c;

    public w1(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
        abstractDoubleTimeSource.getClass();
        this.a = d;
        this.b = abstractDoubleTimeSource;
        this.c = j;
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        h47.f(this.b.b() - this.a, null);
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return hqn.e(this, (ii4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w1) {
            if (Intrinsics.areEqual(this.b, ((w1) obj).b)) {
                l((ii4) obj);
                d47.b.getClass();
                if (d47.d(0L, 0L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        h47.f(this.a, null);
        throw null;
    }

    @Override // defpackage.ii4
    public final long l(ii4 ii4Var) {
        ii4Var.getClass();
        if (ii4Var instanceof w1) {
            w1 w1Var = (w1) ii4Var;
            long j = w1Var.c;
            if (Intrinsics.areEqual(this.b, w1Var.b)) {
                long j2 = this.c;
                if (d47.d(j2, j) && d47.i(j2)) {
                    d47.b.getClass();
                    return 0L;
                }
                d47.k(j2, d47.p(j));
                h47.f(this.a - w1Var.a, null);
                throw null;
            }
        }
        ahh.j("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", ii4Var);
        return 0L;
    }

    public final String toString() {
        throw null;
    }
}
