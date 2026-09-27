package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ora {
    public final int a;
    public final int b;
    public final int c;

    public ora(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ora)) {
            return false;
        }
        ora oraVar = (ora) obj;
        if (this.a == oraVar.a && this.b == oraVar.b && this.c == oraVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + woa.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
