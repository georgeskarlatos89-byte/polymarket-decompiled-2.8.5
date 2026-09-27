package defpackage;

import javax.crypto.SecretKey;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hoa implements SecretKey {
    public final /* synthetic */ SecretKey a;

    public hoa(SecretKey secretKey) {
        this.a = secretKey;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "AES";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.a.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.a.getFormat();
    }
}
