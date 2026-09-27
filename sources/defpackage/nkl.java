package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nkl {
    public final String a;

    public nkl(String str) {
        oql oqlVar = oql.b;
        nfn.f(str, "message");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nkl) {
            oql oqlVar = oql.b;
            if (this.a.equals(((nkl) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ oql.b.hashCode();
    }
}
