package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class roa {
    public final int a;

    public /* synthetic */ roa(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            return "Decimal";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof roa) {
            if (this.a != ((roa) obj).a) {
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
