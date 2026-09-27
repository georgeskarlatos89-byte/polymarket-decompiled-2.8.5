package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ime implements zec {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public ime(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static ime d(svd svdVar) {
        int g = svdVar.g();
        String m = ggc.m(svdVar.r(svdVar.g(), StandardCharsets.US_ASCII));
        String r = svdVar.r(svdVar.g(), StandardCharsets.UTF_8);
        int g2 = svdVar.g();
        int g3 = svdVar.g();
        int g4 = svdVar.g();
        int g5 = svdVar.g();
        int g6 = svdVar.g();
        byte[] bArr = new byte[g6];
        svdVar.e(bArr, 0, g6);
        return new ime(g, m, r, g2, g3, g4, g5, bArr);
    }

    @Override // defpackage.zec
    public final void b(m7c m7cVar) {
        m7cVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ime.class == obj.getClass()) {
                ime imeVar = (ime) obj;
                if (this.a == imeVar.a && this.b.equals(imeVar.b) && this.c.equals(imeVar.c) && this.d == imeVar.d && this.e == imeVar.e && this.f == imeVar.f && this.g == imeVar.g && Arrays.equals(this.h, imeVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((hdi.e(hdi.e((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
