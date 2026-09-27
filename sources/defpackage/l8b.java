package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l8b {
    public static final l8b d = new l8b(17, i8b.c, 0);
    public final float a;
    public final int b;
    public final int c;

    public l8b(int i, float f, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8b)) {
            return false;
        }
        l8b l8bVar = (l8b) obj;
        float f = l8bVar.a;
        float f2 = i8b.b;
        if (Float.compare(this.a, f) == 0 && this.b == l8bVar.b && this.c == l8bVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = i8b.b;
        return Integer.hashCode(this.c) + woa.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) i8b.b(this.a));
        sb.append(", trim=");
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i != 0) {
            str = "Invalid";
        } else {
            str = "LineHeightStyle.Trim.None";
        }
        sb.append((Object) str);
        sb.append(",mode=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
