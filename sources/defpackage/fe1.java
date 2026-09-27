package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fe1 extends zk9 {
    public final byte[] b;

    public fe1(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fe1.class == obj.getClass()) {
                fe1 fe1Var = (fe1) obj;
                if (this.a.equals(fe1Var.a) && Arrays.equals(this.b, fe1Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + hdi.e(527, 31, this.a);
    }
}
