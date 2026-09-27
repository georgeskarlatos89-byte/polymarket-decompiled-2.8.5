package org.socure.core;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e {
    public final double[] a;

    public e(double[] dArr) {
        double d;
        double d2;
        double d3;
        if (dArr != null && dArr.length == 4) {
            this.a = (double[]) dArr.clone();
            return;
        }
        double[] dArr2 = new double[4];
        this.a = dArr2;
        double d4 = ConstantsKt.UNSET;
        if (dArr != null) {
            if (dArr.length > 0) {
                d = dArr[0];
            } else {
                d = 0.0d;
            }
            dArr2[0] = d;
            if (dArr.length > 1) {
                d2 = dArr[1];
            } else {
                d2 = 0.0d;
            }
            dArr2[1] = d2;
            if (dArr.length > 2) {
                d3 = dArr[2];
            } else {
                d3 = 0.0d;
            }
            dArr2[2] = d3;
            dArr2[3] = dArr.length > 3 ? dArr[3] : d4;
            return;
        }
        dArr2[3] = 0.0d;
        dArr2[2] = 0.0d;
        dArr2[1] = 0.0d;
        dArr2[0] = 0.0d;
    }

    public final Object clone() {
        return new e(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && Arrays.equals(this.a, ((e) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        double[] dArr = this.a;
        sb.append(dArr[0]);
        sb.append(", ");
        sb.append(dArr[1]);
        sb.append(", ");
        sb.append(dArr[2]);
        sb.append(", ");
        sb.append(dArr[3]);
        sb.append("]");
        return sb.toString();
    }

    public e() {
        this.a = new double[]{ConstantsKt.UNSET, ConstantsKt.UNSET, ConstantsKt.UNSET, ConstantsKt.UNSET};
    }
}
