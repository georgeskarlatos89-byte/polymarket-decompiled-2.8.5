package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cne b;

    public /* synthetic */ b7j(cne cneVar, int i) {
        this.a = i;
        this.b = cneVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        cne cneVar = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                bneVar.getClass();
                bneVar.h(cneVar, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 1:
                bneVar.getClass();
                bneVar.h(cneVar, 0, 0, 0.0f);
                return Unit.INSTANCE;
            default:
                bne.o(0, 0, bneVar, cneVar);
                return Unit.INSTANCE;
        }
    }
}
