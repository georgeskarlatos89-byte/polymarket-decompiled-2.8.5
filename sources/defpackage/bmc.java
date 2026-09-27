package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bmc {
    public final long a;
    public final long b;
    public final boolean c;

    public bmc(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final bmc a(bmc bmcVar) {
        return new bmc(ogd.f(this.a, bmcVar.a), Math.max(this.b, bmcVar.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bmc) {
                bmc bmcVar = (bmc) obj;
                if (!ogd.c(this.a, bmcVar.a) || this.b != bmcVar.b || this.c != bmcVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + woa.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) ogd.h(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return hdi.t(sb, this.c, ')');
    }
}
