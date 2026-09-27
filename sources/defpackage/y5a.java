package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y5a extends zk9 {
    public final String b;
    public final String c;
    public final String d;

    public y5a(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y5a.class == obj.getClass()) {
                y5a y5aVar = (y5a) obj;
                if (this.c.equals(y5aVar.c) && this.b.equals(y5aVar.b) && this.d.equals(y5aVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.e(hdi.e(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.zk9
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
