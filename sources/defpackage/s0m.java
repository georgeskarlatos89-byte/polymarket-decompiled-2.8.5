package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class s0m {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj instanceof s0m) {
            byte[] bArr = ((m0m) this).b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((m0m) ((s0m) obj)).b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        if (bArr[i] == bArr2[i]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z &= z2;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((m0m) this).b;
        if (bArr.length * 8 >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                int i = bArr[0] & MessagePack.Code.EXT_TIMESTAMP;
                int i2 = bArr[1] & MessagePack.Code.EXT_TIMESTAMP;
                int i3 = bArr[2] & MessagePack.Code.EXT_TIMESTAMP;
                return ((bArr[3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | i | (i2 << 8) | (i3 << 16);
            }
            dmk.n(vdn.h("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i4 = bArr[0] & MessagePack.Code.EXT_TIMESTAMP;
        for (int i5 = 1; i5 < bArr.length; i5++) {
            i4 |= (bArr[i5] & MessagePack.Code.EXT_TIMESTAMP) << (i5 * 8);
        }
        return i4;
    }

    public final String toString() {
        byte[] bArr = ((m0m) this).b;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
