package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nh4 extends zk9 {
    public final String b;
    public final String c;
    public final String d;

    public nh4(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nh4.class == obj.getClass()) {
                nh4 nh4Var = (nh4) obj;
                if (this.c.equals(nh4Var.c) && this.b.equals(nh4Var.b) && Objects.equals(this.d, nh4Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int e = hdi.e(hdi.e(527, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return e + i;
    }

    @Override // defpackage.zk9
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
