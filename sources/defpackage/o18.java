package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o18 {
    public final int a;

    public /* synthetic */ o18(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Low";
        }
        if (i == 2) {
            return "Medium";
        }
        if (i == 3) {
            return "High";
        }
        return "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o18) {
            if (this.a != ((o18) obj).a) {
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
