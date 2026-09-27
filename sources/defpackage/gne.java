package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gne {
    public final long a;

    public gne(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gne) && d9h.b(this.a, ((gne) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(3) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hdi.p("PlaceholderConfig(size=", d9h.g(this.a), ", verticalAlign=", "Bottom", ")");
    }
}
