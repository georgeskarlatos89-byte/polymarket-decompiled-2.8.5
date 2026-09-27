package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mw0 extends j64 {
    public final i64 a;
    public final dw0 b;

    public mw0(i64 i64Var, dw0 dw0Var) {
        this.a = i64Var;
        this.b = dw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j64) {
                j64 j64Var = (j64) obj;
                i64 i64Var = this.a;
                if (i64Var == null) {
                    if (((mw0) j64Var).a != null) {
                        return false;
                    }
                } else if (!i64Var.equals(((mw0) j64Var).a)) {
                    return false;
                }
                if (this.b.equals(((mw0) j64Var).b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        i64 i64Var = this.a;
        if (i64Var == null) {
            hashCode = 0;
        } else {
            hashCode = i64Var.hashCode();
        }
        return this.b.hashCode() ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
