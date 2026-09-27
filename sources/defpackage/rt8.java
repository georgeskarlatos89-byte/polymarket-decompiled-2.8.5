package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rt8 extends zk9 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public rt8(String str, String str2, byte[] bArr, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rt8.class == obj.getClass()) {
                rt8 rt8Var = (rt8) obj;
                if (Objects.equals(this.b, rt8Var.b) && this.c.equals(rt8Var.c) && this.d.equals(rt8Var.d) && Arrays.equals(this.e, rt8Var.e)) {
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
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + hdi.e(hdi.e((527 + i) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.zk9
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
