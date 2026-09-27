package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pi3 extends zk9 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final zk9[] g;

    public pi3(String str, int i, int i2, long j, long j2, zk9[] zk9VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = zk9VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pi3.class == obj.getClass()) {
                pi3 pi3Var = (pi3) obj;
                if (this.c == pi3Var.c && this.d == pi3Var.d && this.e == pi3Var.e && this.f == pi3Var.f && this.b.equals(pi3Var.b) && Arrays.equals(this.g, pi3Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
