package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nzf {
    public static final nzf c = new nzf(0, false);
    public final int a;
    public final boolean b;

    public nzf(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nzf.class == obj.getClass()) {
                nzf nzfVar = (nzf) obj;
                if (this.a == nzfVar.a && this.b == nzfVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
