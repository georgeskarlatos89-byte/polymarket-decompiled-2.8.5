package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ya3 extends pbi implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ya3 ya3Var = (ya3) obj;
        if (f(4) != ya3Var.f(4)) {
            if (f(4)) {
                return 1;
            }
            return -1;
        }
        long j = this.g - ya3Var.g;
        if (j == 0) {
            j = this.k - ya3Var.k;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
            return 1;
        }
        return -1;
    }
}
