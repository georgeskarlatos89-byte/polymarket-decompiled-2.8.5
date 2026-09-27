package com.fingerprintjs.android.fpjs_pro;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d {
    public final double a;

    public d(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && Double.compare(this.a, ((d) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "ConfidenceScore(score=" + this.a + ")";
    }
}
