package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sh4 {
    public final int a;
    public final char b;
    public final int c;

    public sh4(char c, int i, int i2) {
        this.a = i;
        this.b = c;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh4)) {
            return false;
        }
        sh4 sh4Var = (sh4) obj;
        if (this.a == sh4Var.a && this.b == sh4Var.b && this.c == sh4Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Character.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListMarkerInfo(markerLength=");
        sb.append(this.a);
        sb.append(", markerType=");
        sb.append(this.b);
        sb.append(", markerIndent=");
        return sv6.o(sb, this.c, ')');
    }
}
