package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p81 extends s81 {
    public final char[] f;

    public p81(o81 o81Var) {
        super(o81Var, (Character) null);
        boolean z;
        this.f = new char[Barcode.FORMAT_UPC_A];
        char[] cArr = o81Var.b;
        if (cArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        brn.h(z);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.s81, defpackage.t81
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                o81 o81Var = this.d;
                bArr[i2] = (byte) ((o81Var.a(charAt) << 4) | o81Var.a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new IOException("Invalid input length " + charSequence.length());
    }

    @Override // defpackage.s81, defpackage.t81
    public final void d(StringBuilder sb, byte[] bArr, int i) {
        brn.o(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & MessagePack.Code.EXT_TIMESTAMP;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.s81
    public final t81 g(o81 o81Var) {
        return new p81(o81Var);
    }
}
