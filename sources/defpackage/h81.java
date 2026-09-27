package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h81 extends d81 {
    /* JADX WARN: Type inference failed for: r0v0, types: [h81, d81] */
    public static h81 c(byte[] bArr) {
        int i;
        int i2;
        String str;
        int i3 = 0;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i == 0) {
            str = "";
        } else {
            int i4 = i / 3;
            int i5 = i4 * 3;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = i4 << 2;
                int i6 = i % 3;
                if (i6 != 0) {
                    i2 = i2 + i6 + 1;
                }
            }
            byte[] bArr2 = new byte[i2];
            int i7 = 0;
            int i8 = 0;
            while (i7 < i5) {
                int i9 = i7 + 2;
                int i10 = ((bArr[i7 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i7] & MessagePack.Code.EXT_TIMESTAMP) << 16);
                i7 += 3;
                int i11 = i10 | (bArr[i9] & MessagePack.Code.EXT_TIMESTAMP);
                bArr2[i8] = rgn.b((i11 >>> 18) & 63);
                bArr2[i8 + 1] = rgn.b((i11 >>> 12) & 63);
                int i12 = i8 + 3;
                bArr2[i8 + 2] = rgn.b((i11 >>> 6) & 63);
                i8 += 4;
                bArr2[i12] = rgn.b(i11 & 63);
            }
            int i13 = i - i5;
            if (i13 > 0) {
                int i14 = (bArr[i5] & MessagePack.Code.EXT_TIMESTAMP) << 10;
                if (i13 == 2) {
                    i3 = (bArr[i - 1] & MessagePack.Code.EXT_TIMESTAMP) << 2;
                }
                int i15 = i14 | i3;
                if (i13 == 2) {
                    bArr2[i2 - 3] = rgn.b(i15 >> 12);
                    bArr2[i2 - 2] = rgn.b((i15 >>> 6) & 63);
                    bArr2[i2 - 1] = rgn.b(i15 & 63);
                } else {
                    bArr2[i2 - 2] = rgn.b(i15 >> 12);
                    bArr2[i2 - 1] = rgn.b((i15 >>> 6) & 63);
                }
            }
            str = new String(bArr2, ouh.a);
        }
        return new d81(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h81, d81] */
    public static h81 d(String str) {
        if (str == null) {
            return null;
        }
        return new d81(str);
    }

    @Override // defpackage.d81
    public final boolean equals(Object obj) {
        if (obj instanceof h81) {
            if (this.a.equals(((d81) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
