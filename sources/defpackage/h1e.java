package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h1e implements Serializable {
    public final String a;
    public final byte[] b;
    public final h81 c;

    public h1e(String str) {
        Objects.requireNonNull(str, "The string must not be null");
        this.a = str;
        this.b = null;
        this.c = null;
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            return new String(bArr, ouh.a);
        }
        h81 h81Var = this.c;
        if (h81Var != null) {
            return new String(h81Var.a(), ouh.a);
        }
        return null;
    }

    public h1e(byte[] bArr) {
        this.a = null;
        Objects.requireNonNull(bArr, "The byte array must not be null");
        this.b = bArr;
        this.c = null;
    }

    public h1e(h81 h81Var) {
        this.a = null;
        this.b = null;
        Objects.requireNonNull(h81Var, "The Base64URL-encoded object must not be null");
        this.c = h81Var;
    }
}
