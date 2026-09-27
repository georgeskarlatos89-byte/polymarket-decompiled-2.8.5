package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pw1 {
    public final byte[] a;

    public pw1(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static pw1 a(byte[] bArr) {
        if (bArr != null) {
            return new pw1(bArr.length, bArr);
        }
        dmk.s("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pw1)) {
            return false;
        }
        return Arrays.equals(((pw1) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + jul.b(this.a) + ")";
    }
}
