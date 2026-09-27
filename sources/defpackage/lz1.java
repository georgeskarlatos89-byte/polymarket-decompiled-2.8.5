package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lz1 {
    public final double a;

    public lz1(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lz1) {
            lz1 lz1Var = (lz1) obj;
            if (Double.compare(ConstantsKt.UNSET, ConstantsKt.UNSET) == 0 && Double.compare(this.a, lz1Var.a) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(2) + hdi.c(Double.hashCode(ConstantsKt.UNSET) * 31, 31, this.a);
    }

    public final String toString() {
        return "Constraints(minValue=0.0, maxValue=" + this.a + ", maxDecimalPlaces=2)";
    }
}
