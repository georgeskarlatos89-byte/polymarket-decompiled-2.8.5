package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oyd extends pyd {
    public final int a;
    public final int b;

    public oyd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oyd) {
                oyd oydVar = (oyd) obj;
                if (this.a != oydVar.a || this.b != oydVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return m51.j(this.a, "Range(start=", this.b, ", end=", ")");
    }
}
