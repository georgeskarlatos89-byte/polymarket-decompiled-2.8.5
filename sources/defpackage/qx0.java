package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qx0 {
    public final long a;
    public final my0 b;
    public final uw0 c;

    public qx0(long j, my0 my0Var, uw0 uw0Var) {
        this.a = j;
        this.b = my0Var;
        this.c = uw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof qx0) {
                qx0 qx0Var = (qx0) obj;
                if (this.a == qx0Var.a && this.b.equals(qx0Var.b) && this.c.equals(qx0Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
