package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class mj2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cne b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ mj2(int i, cne cneVar, int i2, int i3) {
        this.a = i3;
        this.c = i;
        this.b = cneVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        cne cneVar = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                bneVar.getClass();
                bneVar.h(cneVar, (-i3) / 2, (-i2) / 2, 0.0f);
                return Unit.INSTANCE;
            case 1:
                bneVar.getClass();
                bneVar.h(cneVar, i3, i2, 0.0f);
                return Unit.INSTANCE;
            case 2:
                bne.j(i3, i2, bneVar, cneVar);
                return Unit.INSTANCE;
            case 3:
                bne.j(i5c.e((i3 - cneVar.a) / 2.0f), i5c.e((i2 - cneVar.b) / 2.0f), bneVar, cneVar);
                return Unit.INSTANCE;
            case 4:
                bne.j(i5c.e((i3 - cneVar.a) / 2.0f), i5c.e((i2 - cneVar.b) / 2.0f), bneVar, cneVar);
                return Unit.INSTANCE;
            case 5:
                bne.j(i3, i2, bneVar, cneVar);
                return Unit.INSTANCE;
            default:
                bneVar.getClass();
                bneVar.h(cneVar, i3 - (i2 / 2), (-i2) / 2, 0.0f);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ mj2(cne cneVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = cneVar;
        this.c = i;
        this.d = i2;
    }
}
