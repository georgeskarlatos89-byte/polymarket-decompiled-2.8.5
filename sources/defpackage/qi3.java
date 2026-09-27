package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qi3 extends zk9 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final zk9[] f;

    public qi3(String str, boolean z, boolean z2, String[] strArr, zk9[] zk9VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = zk9VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qi3.class == obj.getClass()) {
                qi3 qi3Var = (qi3) obj;
                if (this.c == qi3Var.c && this.d == qi3Var.d && this.b.equals(qi3Var.b) && Arrays.equals(this.e, qi3Var.e) && Arrays.equals(this.f, qi3Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
