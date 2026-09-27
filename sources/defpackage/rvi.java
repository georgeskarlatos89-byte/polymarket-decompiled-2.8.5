package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rvi {
    public static final rvi c = new rvi(0L, 3);
    public final long a;
    public final long b;

    public /* synthetic */ rvi(long j, int i) {
        this(f9m.j(0), (i & 2) != 0 ? f9m.j(0) : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvi)) {
            return false;
        }
        rvi rviVar = (rvi) obj;
        if (cyi.a(this.a, rviVar.a) && cyi.a(this.b, rviVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        dyi[] dyiVarArr = cyi.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) cyi.e(this.a)) + ", restLine=" + ((Object) cyi.e(this.b)) + ')';
    }

    public rvi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
