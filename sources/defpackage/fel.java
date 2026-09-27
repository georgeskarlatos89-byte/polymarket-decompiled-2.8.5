package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fel implements h5l {
    public final h5l a;
    public final Object b;

    public fel(h5l h5lVar, Object obj) {
        nfn.f(h5lVar, "log site key");
        this.a = h5lVar;
        nfn.f(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fel)) {
            return false;
        }
        fel felVar = (fel) obj;
        if (!this.a.equals(felVar.a) || !this.b.equals(felVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        return hdi.p("SpecializedLogSiteKey{ delegate='", this.a.toString(), "', qualifier='", this.b.toString(), "' }");
    }
}
