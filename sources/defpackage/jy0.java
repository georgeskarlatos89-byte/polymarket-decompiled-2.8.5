package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jy0 {
    public final int a;
    public final ln9 b;

    public jy0(int i, ln9 ln9Var) {
        this.a = i;
        this.b = ln9Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof jy0) {
                jy0 jy0Var = (jy0) obj;
                if (this.a == jy0Var.a && this.b.equals(jy0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
