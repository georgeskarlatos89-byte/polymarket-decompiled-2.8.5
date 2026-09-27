package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class byj extends zk9 {
    public final String b;
    public final String c;

    public byj(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && byj.class == obj.getClass()) {
                byj byjVar = (byj) obj;
                if (this.a.equals(byjVar.a) && Objects.equals(this.b, byjVar.b) && this.c.equals(byjVar.c)) {
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
        int e = hdi.e(527, 31, this.a);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((e + i) * 31);
    }

    @Override // defpackage.zk9
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
