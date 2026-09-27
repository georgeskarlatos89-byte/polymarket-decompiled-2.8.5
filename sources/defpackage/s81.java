package defpackage;

import java.io.IOException;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class s81 extends t81 {
    public final o81 d;
    public final Character e;

    public s81(o81 o81Var, Character ch) {
        boolean z;
        o81Var.getClass();
        this.d = o81Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = o81Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                brn.e(ch, "Padding character %s was already in alphabet", z);
                this.e = ch;
            }
        }
        z = true;
        brn.e(ch, "Padding character %s was already in alphabet", z);
        this.e = ch;
    }

    @Override // defpackage.t81
    public int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e = e(charSequence);
        int length = e.length();
        o81 o81Var = this.d;
        boolean[] zArr = o81Var.h;
        int i = o81Var.d;
        int i2 = o81Var.e;
        if (zArr[length % i2]) {
            int i3 = 0;
            for (int i4 = 0; i4 < e.length(); i4 += i2) {
                long j = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    j <<= i;
                    if (i4 + i6 < e.length()) {
                        j |= o81Var.a(e.charAt(i5 + i4));
                        i5++;
                    }
                }
                int i7 = o81Var.f;
                int i8 = (i7 * 8) - (i5 * i);
                int i9 = (i7 - 1) * 8;
                while (i9 >= i8) {
                    bArr[i3] = (byte) ((j >>> i9) & 255);
                    i9 -= 8;
                    i3++;
                }
            }
            return i3;
        }
        throw new IOException("Invalid input length " + e.length());
    }

    @Override // defpackage.t81
    public void d(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        brn.o(0, i, bArr.length);
        while (i2 < i) {
            o81 o81Var = this.d;
            f(sb, bArr, i2, Math.min(o81Var.f, i - i2));
            i2 += o81Var.f;
        }
    }

    @Override // defpackage.t81
    public final CharSequence e(CharSequence charSequence) {
        Character ch = this.e;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s81) {
            s81 s81Var = (s81) obj;
            if (this.d.equals(s81Var.d) && Objects.equals(this.e, s81Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final void f(StringBuilder sb, byte[] bArr, int i, int i2) {
        boolean z;
        brn.o(i, i + i2, bArr.length);
        o81 o81Var = this.d;
        int i3 = o81Var.f;
        int i4 = o81Var.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        brn.h(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & MessagePack.Code.EXT_TIMESTAMP)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(o81Var.b[((int) (j >>> (i7 - i5))) & o81Var.c]);
            i5 += i4;
        }
        Character ch = this.e;
        if (ch != null) {
            while (i5 < o81Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public t81 g(o81 o81Var) {
        return new s81(o81Var, (Character) null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        o81 o81Var = this.d;
        sb.append(o81Var);
        if (8 % o81Var.d != 0) {
            Character ch = this.e;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public s81(String str, String str2) {
        this(new o81(str, str2.toCharArray()), (Character) '=');
    }
}
