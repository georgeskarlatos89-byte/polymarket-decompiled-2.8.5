package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dqa extends iqa {
    public final double a;

    public dqa(double d) {
        this.a = d;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return Double.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dqa) && Double.compare(this.a, ((dqa) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
