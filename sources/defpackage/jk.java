package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jk extends zh {
    public final int a;
    public final int b;
    public final int c;
    public final ik d;

    public jk(int i, int i2, int i3, ik ikVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ikVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jk) {
            jk jkVar = (jk) obj;
            if (jkVar.a == this.a && jkVar.b == this.b && jkVar.c == this.c && jkVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte IV, ");
        sb.append(this.c);
        sb.append("-byte tag, and ");
        return ix2.i(this.a, "-byte key)", sb);
    }
}
