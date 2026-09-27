package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i7k {
    public static final i7k d = new i7k(256, 256, 256);
    public final int a;
    public final int b;
    public final int c;

    public i7k(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7k)) {
            return false;
        }
        i7k i7kVar = (i7k) obj;
        if (this.a == i7kVar.a && this.b == i7kVar.b && this.c == i7kVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + woa.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i2);
        return sb2.toString();
    }
}
