package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ylc {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return na0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylc)) {
            return false;
        }
        ylc ylcVar = (ylc) obj;
        if (this.a != ylcVar.a || this.b != ylcVar.b || this.d != ylcVar.d || this.e != ylcVar.e) {
            return false;
        }
        return a().getClass().equals(ylcVar.a().getClass());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(ylc.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return ix2.i(this.e, "}\n", sb);
    }
}
