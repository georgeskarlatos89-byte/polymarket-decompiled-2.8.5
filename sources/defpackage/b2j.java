package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b2j {
    public final int a;

    public /* synthetic */ b2j(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b2j) {
            if (this.a != ((b2j) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Hour";
        }
        if (i == 1) {
            return "Minute";
        }
        return "";
    }
}
