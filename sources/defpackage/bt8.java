package defpackage;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bt8 {
    public static final bt8 g;
    public final int[] a;
    public final int[] b;
    public final ct8 c;
    public final int d;
    public final int e;
    public final int f;

    static {
        new bt8(4201, 4096, 1);
        new bt8(1033, Barcode.FORMAT_UPC_E, 1);
        new bt8(67, 64, 1);
        new bt8(19, 16, 1);
        g = new bt8(285, 256, 0);
        new bt8(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 256, 1);
    }

    public bt8(int i, int i2, int i3) {
        this.e = i;
        this.d = i2;
        this.f = i3;
        this.a = new int[i2];
        this.b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.b[this.a[i6]] = i6;
        }
        this.c = new ct8(this, new int[]{0});
    }

    public final int a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.b;
            return this.a[(iArr[i] + iArr[i2]) % (this.d - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return sv6.o(sb, this.d, ')');
    }
}
