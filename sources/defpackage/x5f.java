package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x5f implements Comparable {
    public final byte[] a;

    public x5f(byte[] bArr) {
        this.a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x5f x5fVar = (x5f) obj;
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = x5fVar.a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = x5fVar.a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x5f)) {
            return false;
        }
        return Arrays.equals(this.a, ((x5f) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return jul.b(this.a);
    }
}
