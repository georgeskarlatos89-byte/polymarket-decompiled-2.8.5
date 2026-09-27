package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a4f implements vxb {
    public final w3f a;
    public final int b;

    public a4f(w3f w3fVar, int i) {
        this.a = w3fVar;
        this.b = i;
        if (i >= 10) {
            w3fVar.a(i, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // defpackage.vxb
    public final void a(byte[] bArr, byte[] bArr2) {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        fi9.r("invalid MAC");
    }

    @Override // defpackage.vxb
    public final byte[] b(byte[] bArr) {
        return this.a.a(this.b, bArr);
    }
}
