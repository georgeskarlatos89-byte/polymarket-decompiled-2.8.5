package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ta8 extends wa8 {
    public final xa8 a;

    public ta8(xa8 xa8Var) {
        xa8Var.getClass();
        this.a = xa8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ta8) && this.a == ((ta8) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Corner(corner=" + this.a + ")";
    }
}
