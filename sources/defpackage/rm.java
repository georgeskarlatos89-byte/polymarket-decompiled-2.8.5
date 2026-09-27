package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class rm implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ cne c;
    public final /* synthetic */ int d;
    public final /* synthetic */ cne e;

    public /* synthetic */ rm(int i, cne cneVar, int i2, cne cneVar2) {
        this.b = i;
        this.c = cneVar;
        this.d = i2;
        this.e = cneVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        cne cneVar = this.e;
        int i2 = this.d;
        cne cneVar2 = this.c;
        int i3 = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                if (cneVar2 != null) {
                    bne.j(0, i3, bneVar, cneVar2);
                }
                if (cneVar != null) {
                    bne.j(0, i2, bneVar, cneVar);
                }
                return Unit.INSTANCE;
            default:
                bneVar.getClass();
                if (i3 > cneVar2.b) {
                    bneVar.h(cneVar2, 0, i2, 0.0f);
                    bneVar.h(cneVar, cneVar2.a, 0, 0.0f);
                } else {
                    bneVar.h(cneVar2, 0, 0, 0.0f);
                    bneVar.h(cneVar, cneVar2.a, i2, 0.0f);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ rm(cne cneVar, int i, cne cneVar2, int i2) {
        this.c = cneVar;
        this.b = i;
        this.e = cneVar2;
        this.d = i2;
    }
}
