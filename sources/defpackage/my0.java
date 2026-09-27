package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class my0 {
    public final String a;
    public final byte[] b;
    public final f6f c;

    public my0(String str, byte[] bArr, f6f f6fVar) {
        this.a = str;
        this.b = bArr;
        this.c = f6fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ysk, java.lang.Object] */
    public static ysk a() {
        ?? obj = new Object();
        f6f f6fVar = f6f.DEFAULT;
        if (f6fVar != null) {
            obj.c = f6fVar;
            return obj;
        }
        dmk.s("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof my0) {
            my0 my0Var = (my0) obj;
            if (this.a.equals(my0Var.a) && Arrays.equals(this.b, my0Var.b) && this.c.equals(my0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return woa.r(sb, encodeToString, ")");
    }
}
