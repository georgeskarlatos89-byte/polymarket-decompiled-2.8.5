package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yu2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public yu2(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu2)) {
            return false;
        }
        yu2 yu2Var = (yu2) obj;
        if (this.a == yu2Var.a && this.b == yu2Var.b && this.c == yu2Var.c && this.d == yu2Var.d && this.e == yu2Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + woa.b(this.d, woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", numberOfDays=");
        sb.append(this.c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.d);
        sb.append(", startUtcTimeMillis=");
        return ix2.n(sb, this.e, ')');
    }
}
