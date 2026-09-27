package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dqd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ dqd(int i, int i2, int i3) {
        this(r0, 0, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
        int i4;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = 10;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dqd) {
                dqd dqdVar = (dqd) obj;
                if (this.a != dqdVar.a || this.b != dqdVar.b || this.c != dqdVar.c || this.d != dqdVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = m51.n(this.a, "Padding(top=", this.b, ", bottom=", ", start=");
        n.append(this.c);
        n.append(", end=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }

    public dqd(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
