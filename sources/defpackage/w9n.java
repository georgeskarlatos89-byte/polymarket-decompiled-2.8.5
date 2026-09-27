package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w9n {
    public final p6n a;
    public final q24 b;

    public w9n(p6n p6nVar, q24 q24Var) {
        this.a = p6nVar;
        this.b = q24Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w9n) {
            w9n w9nVar = (w9n) obj;
            p6n p6nVar = w9nVar.a;
            p6n p6nVar2 = this.a;
            if (p6nVar2 != null ? p6nVar2 == p6nVar : p6nVar == null) {
                if (this.b == w9nVar.b) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        p6n p6nVar = this.a;
        if (p6nVar == null) {
            hashCode = 0;
        } else {
            hashCode = p6nVar.hashCode();
        }
        return this.b.hashCode() ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        k84.q(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
