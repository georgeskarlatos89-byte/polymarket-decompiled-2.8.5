package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fw0 {
    public final a31 a;
    public final long b;

    public fw0(a31 a31Var, long j) {
        if (a31Var != null) {
            this.a = a31Var;
            this.b = j;
        } else {
            dmk.s("Null status");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fw0) {
            fw0 fw0Var = (fw0) obj;
            if (this.a.equals(fw0Var.a) && this.b == fw0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return woa.n(this.b, "}", sb);
    }
}
