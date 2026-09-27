package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class it0 {
    public static final it0 e = new it0(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public it0(int i, int i2, int i3) {
        int i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (u1k.H(i3)) {
            i4 = u1k.s(i3) * i2;
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it0)) {
            return false;
        }
        it0 it0Var = (it0) obj;
        if (this.a == it0Var.a && this.b == it0Var.b && this.c == it0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return sv6.o(sb, this.c, ']');
    }
}
