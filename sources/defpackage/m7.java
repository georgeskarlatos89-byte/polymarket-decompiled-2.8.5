package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cne b;
    public final /* synthetic */ int c;

    public /* synthetic */ m7(cne cneVar, int i, int i2) {
        this.a = i2;
        this.b = cneVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        cne cneVar = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                bne.j(0, -i2, bneVar, cneVar);
                return Unit.INSTANCE;
            case 1:
                bne.j(-i2, 0, bneVar, cneVar);
                return Unit.INSTANCE;
            case 2:
                bneVar.getClass();
                bne.o(0, i2, bneVar, cneVar);
                return Unit.INSTANCE;
            case 3:
                bneVar.getClass();
                bneVar.h(cneVar, 0, (i2 - cneVar.b) / 2, 0.0f);
                return Unit.INSTANCE;
            case 4:
                bneVar.getClass();
                bneVar.h(cneVar, 0, i2, 0.0f);
                return Unit.INSTANCE;
            case 5:
                bneVar.getClass();
                bneVar.h(cneVar, 0, i2, 0.0f);
                return Unit.INSTANCE;
            case 6:
                bneVar.getClass();
                bneVar.h(cneVar, 0, i2, 0.0f);
                return Unit.INSTANCE;
            case 7:
                bneVar.getClass();
                bneVar.h(cneVar, 0, -i2, 0.0f);
                return Unit.INSTANCE;
            default:
                bneVar.getClass();
                bne.o(-i2, 0, bneVar, cneVar);
                return Unit.INSTANCE;
        }
    }
}
