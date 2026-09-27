package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class um5 {
    public final xif a;
    public final boolean b;

    public um5(xif xifVar, boolean z) {
        this.a = xifVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um5) {
            um5 um5Var = (um5) obj;
            if (um5Var.a.equals(this.a) && um5Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
