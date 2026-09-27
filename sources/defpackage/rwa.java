package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rwa {
    public final int a;
    public final int b;
    public final boolean c;

    public rwa(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwa)) {
            return false;
        }
        rwa rwaVar = (rwa) obj;
        if (this.a == rwaVar.a && this.b == rwaVar.b && this.c == rwaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + woa.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return hdi.t(sb, this.c, ')');
    }
}
