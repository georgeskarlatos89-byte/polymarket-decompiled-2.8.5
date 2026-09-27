package defpackage;

import javax.crypto.SecretKey;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class kt6 extends it6 implements baa {
    @Override // defpackage.baa
    public final u6b a(caa caaVar, byte[] bArr, byte[] bArr2) {
        aaa aaaVar = (aaa) caaVar.a;
        if (aaaVar != null) {
            if (aaaVar.equals(aaa.k)) {
                SecretKey secretKey = null;
                try {
                    secretKey = b(null);
                } catch (Exception unused) {
                }
                return q35.c(caaVar, bArr, bArr2, secretKey, null, this.c);
            }
            throw new Exception(j9n.e(aaaVar, it6.f));
        }
        throw new Exception("The algorithm \"alg\" header parameter must not be null");
    }
}
