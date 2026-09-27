package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bfc {
    public final zec[] a;
    public final long b;

    public bfc(List list) {
        this((zec[]) list.toArray(new zec[0]));
    }

    public final bfc a(zec... zecVarArr) {
        if (zecVarArr.length == 0) {
            return this;
        }
        int i = u1k.a;
        zec[] zecVarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(zecVarArr2, zecVarArr2.length + zecVarArr.length);
        System.arraycopy(zecVarArr, 0, copyOf, zecVarArr2.length, zecVarArr.length);
        return new bfc(this.b, (zec[]) copyOf);
    }

    public final bfc b(bfc bfcVar) {
        if (bfcVar == null) {
            return this;
        }
        return a(bfcVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bfc.class == obj.getClass()) {
            bfc bfcVar = (bfc) obj;
            if (Arrays.equals(this.a, bfcVar.a) && this.b == bfcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return uan.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public bfc(long j, zec... zecVarArr) {
        this.b = j;
        this.a = zecVarArr;
    }

    public bfc(zec... zecVarArr) {
        this(-9223372036854775807L, zecVarArr);
    }
}
