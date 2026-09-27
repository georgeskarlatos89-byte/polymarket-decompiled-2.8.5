package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jw0 {
    public final int a;
    public final Throwable b;

    public jw0(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jw0) {
            jw0 jw0Var = (jw0) obj;
            if (this.a == jw0Var.a) {
                Throwable th = jw0Var.b;
                Throwable th2 = this.b;
                if (th2 != null ? th2.equals(th) : th == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
