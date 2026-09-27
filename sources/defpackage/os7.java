package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class os7 {
    public final /* synthetic */ int a;
    public final long b;

    public os7(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = h47.h(3L, m47.SECONDS);
                return;
            default:
                this.b = h47.h(2L, m47.SECONDS);
                return;
        }
    }

    public final long a(int i) {
        int i2 = this.a;
        long j = this.b;
        switch (i2) {
            case 0:
                int e = 4 - lnf.e(i, 1, 3);
                m47 m47Var = m47.SECONDS;
                return h47.f(Math.pow(d47.m(j, m47Var), e), m47Var);
            default:
                return j;
        }
    }
}
