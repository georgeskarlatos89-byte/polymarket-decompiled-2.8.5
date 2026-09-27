package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m6f extends zk9 {
    public final String b;
    public final byte[] c;

    public m6f(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m6f.class == obj.getClass()) {
                m6f m6fVar = (m6f) obj;
                if (this.b.equals(m6fVar.b) && Arrays.equals(this.c, m6fVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + hdi.e(527, 31, this.b);
    }

    @Override // defpackage.zk9
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
