package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vjb extends yjb {
    public final bo5 a;

    public vjb(bo5 bo5Var) {
        this.a = bo5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vjb.class == obj.getClass()) {
            return this.a.equals(((vjb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (vjb.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
