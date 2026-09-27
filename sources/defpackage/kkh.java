package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kkh implements mkh {
    public final byte[] a;

    public kkh(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return sv6.n("LocalImage(bytes=", Arrays.toString(this.a), ")");
    }
}
