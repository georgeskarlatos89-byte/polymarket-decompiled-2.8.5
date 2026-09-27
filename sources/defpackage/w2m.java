package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w2m extends i3m {
    public final char[] e;

    public w2m(o2m o2mVar) {
        super(o2mVar, (Character) null);
        this.e = new char[Barcode.FORMAT_UPC_A];
        char[] cArr = o2mVar.b;
        if (cArr.length == 16) {
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.e;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | 256] = cArr[i & 15];
            }
            return;
        }
        omf.a();
        throw null;
    }

    @Override // defpackage.i3m
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        udn.c(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & MessagePack.Code.EXT_TIMESTAMP;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
