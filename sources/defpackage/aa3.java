package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class aa3 {
    public final String a;
    public final int b;

    public aa3(String str) {
        str.getClass();
        this.a = str;
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(str.charAt(i2));
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        aa3 aa3Var;
        String str;
        if (obj instanceof aa3) {
            aa3Var = (aa3) obj;
        } else {
            aa3Var = null;
        }
        if (aa3Var == null || (str = aa3Var.a) == null || !str.equalsIgnoreCase(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
