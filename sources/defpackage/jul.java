package defpackage;

import kotlin.text.StringsKt;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class jul {
    public static byte[] a(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit * 16) + digit2);
                } else {
                    dmk.v("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        dmk.v("Expected a string of even length");
        return null;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & MessagePack.Code.EXT_TIMESTAMP;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final kjc c(kjc kjcVar, boolean z, epc epcVar) {
        kjc kjcVar2;
        if (z) {
            kjcVar2 = new eh8(epcVar);
        } else {
            kjcVar2 = hjc.a;
        }
        return kjcVar.e(kjcVar2);
    }

    public static final long d(long j, String str, long j2, long j3) {
        String str2;
        int i = eji.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long r0 = StringsKt.r0(10, str2);
        if (r0 != null) {
            long longValue = r0.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            ix2.A(sb, "..", j3, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        qp7.m("System property '", str, "' has unrecognized value '", str2);
        return 0L;
    }

    public static int e(int i, int i2, String str) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = bd0.API_PRIORITY_OTHER;
        } else {
            i3 = 2097150;
        }
        return (int) d(i, str, 1L, i3);
    }
}
