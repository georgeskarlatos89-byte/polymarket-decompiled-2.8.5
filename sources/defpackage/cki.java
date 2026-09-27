package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cki {
    public final float a;
    public final float b;
    public final float c;

    public cki(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cki) {
                cki ckiVar = (cki) obj;
                if (!hy6.c(this.a, ckiVar.a) || !hy6.c(this.b, ckiVar.b) || !hy6.c(this.c, ckiVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sv6.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) hy6.d(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) hy6.d(f + f2));
        sb.append(", width=");
        sb.append((Object) hy6.d(f2));
        sb.append(", contentWidth=");
        sb.append((Object) hy6.d(this.c));
        sb.append(')');
        return sb.toString();
    }
}
