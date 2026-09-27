package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cz9 extends w84 {
    public final /* synthetic */ int c;

    public cz9(byte[] bArr, int i, int i2) {
        this.c = i2;
        if (bArr.length == 32) {
            this.b = wb3.c(bArr);
            this.a = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    @Override // defpackage.w84
    public final int[] c(int i, int[] iArr) {
        switch (this.c) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = (int[]) this.b;
                    int[] iArr4 = wb3.a;
                    System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                    System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                    iArr2[12] = i;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                ahh.m("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                return null;
            default:
                if (iArr.length == 6) {
                    int[] iArr5 = new int[16];
                    int[] iArr6 = (int[]) this.b;
                    int[] iArr7 = wb3.a;
                    System.arraycopy(iArr7, 0, r0, 0, iArr7.length);
                    System.arraycopy(iArr6, 0, r0, iArr7.length, 8);
                    int[] iArr8 = {0, 0, 0, 0, iArr8[12], iArr8[13], iArr8[14], iArr8[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
                    wb3.b(iArr8);
                    int[] copyOf = Arrays.copyOf(iArr8, 8);
                    System.arraycopy(iArr7, 0, iArr5, 0, iArr7.length);
                    System.arraycopy(copyOf, 0, iArr5, iArr7.length, 8);
                    iArr5[12] = i;
                    iArr5[13] = 0;
                    iArr5[14] = iArr[4];
                    iArr5[15] = iArr[5];
                    return iArr5;
                }
                ahh.m("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                return null;
        }
    }

    @Override // defpackage.w84
    public final int h() {
        switch (this.c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
