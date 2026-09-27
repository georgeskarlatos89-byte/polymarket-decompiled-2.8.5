package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uo5 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5)) {
            return false;
        }
        uo5 uo5Var = (uo5) obj;
        if (this.a == uo5Var.a && Float.compare(this.b, uo5Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return ix2.m(sb, this.b, ')');
    }
}
