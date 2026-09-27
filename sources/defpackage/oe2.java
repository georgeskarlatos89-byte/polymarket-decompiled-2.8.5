package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class oe2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cne b;
    public final /* synthetic */ zrf c;

    public /* synthetic */ oe2(cne cneVar, zrf zrfVar, int i) {
        this.a = i;
        this.b = cneVar;
        this.c = zrfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zrf zrfVar = this.c;
        cne cneVar = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                bneVar.getClass();
                bneVar.h(cneVar, i5c.e(zrfVar.a), i5c.e(zrfVar.b), 0.0f);
                return Unit.INSTANCE;
            default:
                bneVar.getClass();
                bneVar.h(cneVar, i5c.e(zrfVar.a), i5c.e(zrfVar.b), 0.0f);
                return Unit.INSTANCE;
        }
    }
}
