package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oi extends zh {
    public final int a;
    public final int b;
    public final ni c;

    public oi(int i, int i2, ni niVar) {
        this.a = i;
        this.b = i2;
        this.c = niVar;
    }

    public final int c() {
        ni niVar = ni.f;
        int i = this.b;
        ni niVar2 = this.c;
        if (niVar2 == niVar) {
            return i;
        }
        if (niVar2 == ni.c) {
            return i + 5;
        }
        if (niVar2 == ni.d) {
            return i + 5;
        }
        if (niVar2 == ni.e) {
            return i + 5;
        }
        dmk.n("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        if (oiVar.a != this.a || oiVar.c() != c() || oiVar.c != this.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte tags, and ");
        return ix2.i(this.a, "-byte key)", sb);
    }
}
