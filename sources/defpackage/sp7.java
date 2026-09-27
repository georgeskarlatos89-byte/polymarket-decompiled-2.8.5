package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sp7 {
    public static final Charset d = StandardCharsets.US_ASCII;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public final int a;
    public final int b;
    public final byte[] c;

    public sp7(byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static sp7 a(long j, ByteOrder byteOrder) {
        return b(new long[]{j}, byteOrder);
    }

    public static sp7 b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new sp7(wrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(e[this.a]);
        sb.append(", data length:");
        return ix2.i(this.c.length, ")", sb);
    }
}
