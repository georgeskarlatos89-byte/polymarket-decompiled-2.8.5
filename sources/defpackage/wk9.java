package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wk9 implements zec {
    public final byte[] a;
    public final String b;
    public final String c;

    public wk9(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.zec
    public final void b(m7c m7cVar) {
        String str = this.b;
        if (str != null) {
            m7cVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wk9.class == obj.getClass()) {
            return Arrays.equals(this.a, ((wk9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ix2.i(this.a.length, "\"", m51.r("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
