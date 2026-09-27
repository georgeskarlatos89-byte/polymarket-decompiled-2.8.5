package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class pg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dpc b;

    public /* synthetic */ pg(dpc dpcVar, int i) {
        this.a = i;
        this.b = dpcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int y;
        int i = this.a;
        dpc dpcVar = this.b;
        switch (i) {
            case 0:
                y = ((hvd) dpcVar).y();
                break;
            default:
                y = ((hvd) dpcVar).y();
                break;
        }
        return Integer.valueOf(y);
    }
}
