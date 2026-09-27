package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zdh extends zo1 {
    public final long a;

    public zdh(long j) {
        this.a = j;
    }

    @Override // defpackage.zo1
    public final void a(float f, long j, w30 w30Var) {
        w30Var.c(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = ib4.b(j2, ib4.c(j2) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        w30Var.e(j2);
        if (w30Var.c != null) {
            w30Var.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdh)) {
            return false;
        }
        long j = ((zdh) obj).a;
        int i = ib4.n;
        if (hkj.a(this.a, j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) ib4.h(this.a)) + ')';
    }
}
