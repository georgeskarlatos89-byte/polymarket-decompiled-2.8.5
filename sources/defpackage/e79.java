package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class e79 {
    public final Double a;
    public final Double b;
    public final int c;

    public e79(Double d, Double d2, int i) {
        this.a = d;
        this.b = d2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e79)) {
            return false;
        }
        e79 e79Var = (e79) obj;
        if (Intrinsics.areEqual(this.a, e79Var.a) && Intrinsics.areEqual(this.b, e79Var.b) && this.c == e79Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Double d = this.a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = hashCode * 31;
        Double d2 = this.b;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return Integer.hashCode(this.c) + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeroOddsBarData(leftProbability=");
        sb.append(this.a);
        sb.append(", rightProbability=");
        sb.append(this.b);
        sb.append(", segmentCount=");
        return ix2.i(this.c, ")", sb);
    }
}
