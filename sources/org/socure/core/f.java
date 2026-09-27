package org.socure.core;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f {
    public final double a;
    public final double b;

    public f(double[] dArr) {
        double d;
        double d2 = ConstantsKt.UNSET;
        if (dArr != null) {
            if (dArr.length > 0) {
                d = dArr[0];
            } else {
                d = 0.0d;
            }
            this.a = d;
            this.b = dArr.length > 1 ? dArr[1] : d2;
            return;
        }
        this.a = ConstantsKt.UNSET;
        this.b = ConstantsKt.UNSET;
    }

    public final Object clone() {
        return new f(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.a && this.b == fVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.a);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return ((int) this.a) + "x" + ((int) this.b);
    }

    public f(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
