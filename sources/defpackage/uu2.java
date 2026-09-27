package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uu2 implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public uu2(long j, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.d, ((uu2) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu2)) {
            return false;
        }
        uu2 uu2Var = (uu2) obj;
        if (this.a == uu2Var.a && this.b == uu2Var.b && this.c == uu2Var.c && this.d == uu2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", dayOfMonth=");
        sb.append(this.c);
        sb.append(", utcTimeMillis=");
        return ix2.n(sb, this.d, ')');
    }
}
