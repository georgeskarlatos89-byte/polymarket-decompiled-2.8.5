package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g55 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public g55(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g55)) {
            return false;
        }
        g55 g55Var = (g55) obj;
        long j = g55Var.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, g55Var.b) && hkj.a(this.c, g55Var.c) && hkj.a(this.d, g55Var.d) && hkj.a(this.e, g55Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.e) + woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        woa.x(this.a, ", textColor=", sb);
        woa.x(this.b, ", iconColor=", sb);
        woa.x(this.c, ", disabledTextColor=", sb);
        woa.x(this.d, ", disabledIconColor=", sb);
        sb.append((Object) ib4.h(this.e));
        sb.append(')');
        return sb.toString();
    }
}
