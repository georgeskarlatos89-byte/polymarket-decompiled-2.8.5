package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yz1 extends f02 {
    public final long a;

    public yz1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz1)) {
            return false;
        }
        long j = ((yz1) obj).a;
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
        return sv6.n("Custom(customColor=", ib4.h(this.a), ")");
    }
}
