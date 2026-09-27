package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n5l {
    public final String a;

    public n5l(String str) {
        n6l n6lVar = n6l.b;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n5l) {
            n6l n6lVar = n6l.b;
            if (this.a.equals(((n5l) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ n6l.b.hashCode();
    }
}
