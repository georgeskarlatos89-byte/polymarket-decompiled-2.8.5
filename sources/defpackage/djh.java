package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class djh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ il6 b;
    public final /* synthetic */ dpc c;

    public /* synthetic */ djh(dpc dpcVar, il6 il6Var) {
        this.a = 2;
        this.c = dpcVar;
        this.b = il6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        switch (this.a) {
            case 0:
                return new hy6(this.b.j0(((hvd) this.c).y()) + ppi.d);
            case 1:
                return new hy6(this.b.j0(((hvd) this.c).y()));
            case 2:
                int y = ((hvd) this.c).y();
                if (y > 0) {
                    f = this.b.j0(y);
                } else {
                    f = 120.0f;
                }
                return new hy6(f);
            default:
                return new hy6(this.b.j0(((hvd) this.c).y()));
        }
    }

    public /* synthetic */ djh(il6 il6Var, dpc dpcVar, int i) {
        this.a = i;
        this.b = il6Var;
        this.c = dpcVar;
    }
}
