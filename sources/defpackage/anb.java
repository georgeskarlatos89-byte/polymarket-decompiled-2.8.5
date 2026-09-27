package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class anb {
    public final int a;
    public final int b;

    public anb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anb)) {
            return false;
        }
        anb anbVar = (anb) obj;
        if (this.a == anbVar.a && this.b == anbVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return m51.j(this.a, "LiveSegmentBarItemMetrics(left=", this.b, ", width=", ")");
    }
}
