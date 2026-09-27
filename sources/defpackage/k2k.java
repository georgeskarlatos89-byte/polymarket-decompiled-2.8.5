package defpackage;

import java.io.Serializable;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k2k implements Comparable, Serializable {
    public static final j2k c = new j2k(null);
    public static final k2k d = new k2k(0, 0);
    public final long a;
    public final long b;

    public k2k(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k2k k2kVar = (k2k) obj;
        k2kVar.getClass();
        long j = k2kVar.a;
        long j2 = this.a;
        if (j2 != j) {
            gkj gkjVar = hkj.b;
            return Long.compareUnsigned(j2, j);
        }
        gkj gkjVar2 = hkj.b;
        return Long.compareUnsigned(this.b, k2kVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2k)) {
            return false;
        }
        k2k k2kVar = (k2k) obj;
        if (this.a == k2kVar.a && this.b == k2kVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        l2k.a(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        l2k.a(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        l2k.a(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        l2k.a(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        l2k.a(this.b, bArr, 24, 2, 8);
        return e.k(bArr);
    }
}
