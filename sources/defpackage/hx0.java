package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hx0 {
    public final String a;
    public final String b;

    public hx0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            dmk.s("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hx0) {
                hx0 hx0Var = (hx0) obj;
                if (this.a.equals(hx0Var.a) && this.b.equals(hx0Var.b)) {
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
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return woa.r(sb, this.b, "}");
    }
}
