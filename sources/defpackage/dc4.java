package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dc4 implements pvi {
    public final long a;

    public dc4(long j) {
        boolean z;
        this.a = j;
        if (j != 16) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lw9.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // defpackage.pvi
    public final long a() {
        return this.a;
    }

    @Override // defpackage.pvi
    public final float b() {
        return ib4.c(this.a);
    }

    @Override // defpackage.pvi
    public final zo1 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc4)) {
            return false;
        }
        long j = ((dc4) obj).a;
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
        return "ColorStyle(value=" + ((Object) ib4.h(this.a)) + ')';
    }
}
