package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ct0 {
    public static final ct0 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ct0(bt0 bt0Var) {
        this.a = bt0Var.a;
        this.b = bt0Var.b;
        this.c = bt0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ct0.class == obj.getClass()) {
                ct0 ct0Var = (ct0) obj;
                if (this.a == ct0Var.a && this.b == ct0Var.b && this.c == ct0Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
