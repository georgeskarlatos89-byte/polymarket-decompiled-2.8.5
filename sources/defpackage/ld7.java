package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ld7 {
    public final td7 a;
    public final byte[] b;

    public ld7(td7 td7Var, byte[] bArr) {
        if (td7Var != null) {
            if (bArr != null) {
                this.a = td7Var;
                this.b = bArr;
                return;
            } else {
                dmk.s("bytes is null");
                throw null;
            }
        }
        dmk.s("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld7)) {
            return false;
        }
        ld7 ld7Var = (ld7) obj;
        if (!this.a.equals(ld7Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, ld7Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
