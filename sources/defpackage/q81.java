package defpackage;

import java.io.IOException;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q81 extends s81 {
    public q81(String str, String str2) {
        this(new o81(str, str2.toCharArray()), (Character) '=');
    }

    @Override // defpackage.s81, defpackage.t81
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e = e(charSequence);
        int length = e.length();
        o81 o81Var = this.d;
        if (o81Var.h[length % o81Var.e]) {
            int i = 0;
            int i2 = 0;
            while (i < e.length()) {
                int i3 = i + 2;
                int a = (o81Var.a(e.charAt(i + 1)) << 12) | (o81Var.a(e.charAt(i)) << 18);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (a >>> 16);
                if (i3 < e.length()) {
                    int i5 = i + 3;
                    int a2 = a | (o81Var.a(e.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((a2 >>> 8) & 255);
                    if (i5 < e.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((a2 | o81Var.a(e.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }
        throw new IOException("Invalid input length " + e.length());
    }

    @Override // defpackage.s81, defpackage.t81
    public final void d(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        brn.o(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & MessagePack.Code.EXT_TIMESTAMP);
            o81 o81Var = this.d;
            char[] cArr = o81Var.b;
            char[] cArr2 = o81Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            f(sb, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.s81
    public final t81 g(o81 o81Var) {
        return new q81(o81Var, (Character) null);
    }

    public q81(o81 o81Var, Character ch) {
        super(o81Var, ch);
        brn.h(o81Var.b.length == 64);
    }
}
