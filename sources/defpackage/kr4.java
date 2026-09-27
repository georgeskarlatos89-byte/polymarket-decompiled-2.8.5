package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kr4 {
    public final int a;

    public /* synthetic */ kr4(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return "CompositingStrategy(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kr4) {
            if (this.a != ((kr4) obj).a) {
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
        return a(this.a);
    }
}
