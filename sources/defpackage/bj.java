package defpackage;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bj {
    public static final p3j d = p3j.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final aj e = new aj(0);
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public bj(int i, byte[] bArr) {
        if (d.a()) {
            g3k.a(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) e.get()).getBlockSize();
            this.c = blockSize;
            if (i >= 12 && i <= blockSize) {
                this.b = i;
                return;
            } else {
                fi9.r("invalid IV size");
                throw null;
            }
        }
        fi9.r("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) e.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        fi9.r("stored output's length does not match input's length");
    }
}
