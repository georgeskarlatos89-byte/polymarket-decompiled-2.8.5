package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cx3 extends dx3 {
    public final sw3 a;

    public cx3(sw3 sw3Var) {
        sw3Var.getClass();
        this.a = sw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cx3) && this.a == ((cx3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RestartConnection(reason=" + this.a + ")";
    }
}
