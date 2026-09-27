package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rxi {
    public final long a;
    public final long b;

    public rxi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxi)) {
            return false;
        }
        rxi rxiVar = (rxi) obj;
        long j = rxiVar.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, rxiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        woa.x(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) ib4.h(this.b));
        sb.append(')');
        return sb.toString();
    }
}
