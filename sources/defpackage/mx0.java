package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mx0 extends p2d {
    public final o2d a;
    public final n2d b;

    public mx0(o2d o2dVar, n2d n2dVar) {
        this.a = o2dVar;
        this.b = n2dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p2d) {
            p2d p2dVar = (p2d) obj;
            o2d o2dVar = this.a;
            if (o2dVar != null ? o2dVar.equals(((mx0) p2dVar).a) : ((mx0) p2dVar).a == null) {
                n2d n2dVar = this.b;
                if (n2dVar != null ? n2dVar.equals(((mx0) p2dVar).b) : ((mx0) p2dVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        o2d o2dVar = this.a;
        if (o2dVar == null) {
            hashCode = 0;
        } else {
            hashCode = o2dVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        n2d n2dVar = this.b;
        if (n2dVar != null) {
            i = n2dVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
