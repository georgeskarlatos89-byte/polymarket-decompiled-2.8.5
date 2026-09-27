package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tw0 extends zk7 {
    public final Object a;
    public final f6f b;
    public final vx0 c;

    public tw0(Object obj, f6f f6fVar, vx0 vx0Var) {
        if (obj != null) {
            this.a = obj;
            if (f6fVar != null) {
                this.b = f6fVar;
                this.c = vx0Var;
                return;
            } else {
                dmk.s("Null priority");
                throw null;
            }
        }
        dmk.s("Null payload");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zk7) {
            tw0 tw0Var = (tw0) ((zk7) obj);
            if (this.a.equals(tw0Var.a) && this.b.equals(tw0Var.b)) {
                vx0 vx0Var = tw0Var.c;
                vx0 vx0Var2 = this.c;
                if (vx0Var2 != null ? vx0Var2.equals(vx0Var) : vx0Var == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        vx0 vx0Var = this.c;
        if (vx0Var == null) {
            hashCode = 0;
        } else {
            hashCode = vx0Var.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + "}";
    }
}
