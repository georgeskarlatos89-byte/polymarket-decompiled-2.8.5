package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class x1 implements z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ x1(f2 f2Var, h2 h2Var) {
        this.a = 1;
        this.b = h2Var;
    }

    @Override // io.sentry.z1
    public final Object d() {
        int i = this.a;
        h2 h2Var = this.b;
        switch (i) {
            case 0:
                return h2Var.nextString();
            case 1:
                double nextDouble = h2Var.nextDouble();
                int i2 = (int) nextDouble;
                if (i2 == nextDouble) {
                    return Integer.valueOf(i2);
                }
                return Double.valueOf(nextDouble);
            default:
                boolean z = h2Var.a.z();
                h2Var.g();
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ x1(h2 h2Var, int i) {
        this.a = i;
        this.b = h2Var;
    }
}
