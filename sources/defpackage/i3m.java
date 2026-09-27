package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class i3m {
    public static final w2m d;
    public final o2m a;
    public final Character b;
    public volatile i3m c;

    static {
        new b3m("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new b3m("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new i3m("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new i3m("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new w2m(new o2m("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public i3m(o2m o2mVar, Character ch) {
        this.a = o2mVar;
        if (ch != null) {
            byte[] bArr = o2mVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                dmk.v(vdn.h("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        udn.c(0, i, bArr.length);
        while (i2 < i) {
            o2m o2mVar = this.a;
            b(sb, bArr, i2, Math.min(o2mVar.f, i - i2));
            i2 += o2mVar.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        udn.c(i, i + i2, bArr.length);
        o2m o2mVar = this.a;
        int i3 = o2mVar.f;
        int i4 = o2mVar.d;
        if (i2 <= i3) {
            int i5 = 0;
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & MessagePack.Code.EXT_TIMESTAMP)) << 8;
            }
            int i7 = (i2 + 1) * 8;
            while (i5 < i2 * 8) {
                sb.append(o2mVar.b[((int) (j >>> ((i7 - i4) - i5))) & o2mVar.c]);
                i5 += i4;
            }
            if (this.b != null) {
                while (i5 < o2mVar.f * 8) {
                    sb.append('=');
                    i5 += i4;
                }
                return;
            }
            return;
        }
        omf.a();
    }

    public final String c(int i, byte[] bArr) {
        udn.c(0, i, bArr.length);
        o2m o2mVar = this.a;
        int i2 = o2mVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(o2mVar.e * cgn.e(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i3m) {
            i3m i3mVar = (i3m) obj;
            if (this.a.equals(i3mVar.a) && Objects.equals(this.b, i3mVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        o2m o2mVar = this.a;
        sb.append(o2mVar);
        if (8 % o2mVar.d != 0) {
            Character ch = this.b;
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

    public i3m(String str, String str2) {
        this(new o2m(str, str2.toCharArray()), (Character) '=');
    }
}
