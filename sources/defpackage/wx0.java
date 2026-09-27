package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wx0 {
    public final g74 a;
    public final HashMap b;

    public wx0(g74 g74Var, HashMap hashMap) {
        this.a = g74Var;
        this.b = hashMap;
    }

    public final long a(f6f f6fVar, long j, int i) {
        long j2;
        long time = j - this.a.getTime();
        xx0 xx0Var = (xx0) this.b.get(f6fVar);
        long j3 = xx0Var.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), time), xx0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wx0) {
                wx0 wx0Var = (wx0) obj;
                if (this.a.equals(wx0Var.a) && this.b.equals(wx0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
