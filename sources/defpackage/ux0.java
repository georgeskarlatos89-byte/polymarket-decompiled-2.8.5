package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ux0 {
    public final c7f a;
    public final to9 b;

    public ux0(c7f c7fVar, to9 to9Var) {
        if (c7fVar != null) {
            this.a = c7fVar;
            this.b = to9Var;
        } else {
            dmk.s("Null processingRequest");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ux0) {
                ux0 ux0Var = (ux0) obj;
                if (this.a.equals(ux0Var.a) && this.b.equals(ux0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
