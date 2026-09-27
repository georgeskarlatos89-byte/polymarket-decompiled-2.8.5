package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xjb extends yjb {
    public final bo5 a;

    public xjb(bo5 bo5Var) {
        this.a = bo5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xjb.class == obj.getClass()) {
            return this.a.equals(((xjb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (xjb.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
