package defpackage;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b3m extends i3m {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b3m(String str, String str2) {
        super(new o2m(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length == 64) {
            return;
        }
        omf.a();
        throw null;
    }

    @Override // defpackage.i3m
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        udn.c(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 16) | (bArr[i2 + 2] & MessagePack.Code.EXT_TIMESTAMP);
            o2m o2mVar = this.a;
            char[] cArr = o2mVar.b;
            char[] cArr2 = o2mVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
