package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iw0 {
    public final l13 a;
    public final jw0 b;

    public iw0(l13 l13Var, jw0 jw0Var) {
        if (l13Var != null) {
            this.a = l13Var;
            this.b = jw0Var;
        } else {
            dmk.s("Null type");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iw0) {
            iw0 iw0Var = (iw0) obj;
            if (this.a.equals(iw0Var.a)) {
                jw0 jw0Var = iw0Var.b;
                jw0 jw0Var2 = this.b;
                if (jw0Var2 != null ? jw0Var2.equals(jw0Var) : jw0Var == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        jw0 jw0Var = this.b;
        if (jw0Var == null) {
            hashCode = 0;
        } else {
            hashCode = jw0Var.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
