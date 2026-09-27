package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class de0 extends zk9 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public de0(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.zec
    public final void b(m7c m7cVar) {
        m7cVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && de0.class == obj.getClass()) {
                de0 de0Var = (de0) obj;
                if (this.d == de0Var.d && this.b.equals(de0Var.b) && Objects.equals(this.c, de0Var.c) && Arrays.equals(this.e, de0Var.e)) {
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
        int e = hdi.e((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ((e + i) * 31);
    }

    @Override // defpackage.zk9
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
