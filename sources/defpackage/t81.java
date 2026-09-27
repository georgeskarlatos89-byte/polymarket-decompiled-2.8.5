package defpackage;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class t81 {
    public static final q81 a = new q81("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final q81 b = new q81("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final p81 c;

    static {
        new s81("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new s81("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        c = new p81(new o81("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((((s81) this).d.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b2 = b(bArr, e(str));
            if (b2 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b2];
            System.arraycopy(bArr, 0, bArr2, 0, b2);
            return bArr2;
        } catch (r81 e) {
            xbc.s(e);
            return null;
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public final String c(byte[] bArr) {
        int length = bArr.length;
        brn.o(0, length, bArr.length);
        o81 o81Var = ((s81) this).d;
        int i = o81Var.e;
        int i2 = o81Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(vom.c(length, i2) * i);
        try {
            d(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }

    public abstract void d(StringBuilder sb, byte[] bArr, int i);

    public abstract CharSequence e(CharSequence charSequence);
}
