package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c00 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ cne i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c00(cne cneVar, int i) {
        super(1);
        this.h = i;
        this.i = cneVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        cne cneVar = this.i;
        switch (i) {
            case 0:
                bne.j(0, 0, (bne) obj, cneVar);
                return Unit.INSTANCE;
            case 1:
                bne.o(0, 0, (bne) obj, cneVar);
                return Unit.INSTANCE;
            case 2:
                bne.j(0, 0, (bne) obj, cneVar);
                return Unit.INSTANCE;
            case 3:
                bne.j(0, 0, (bne) obj, cneVar);
                return Unit.INSTANCE;
            case 4:
                bne.j(0, 0, (bne) obj, cneVar);
                return Unit.INSTANCE;
            case 5:
                bne bneVar = (bne) obj;
                bneVar.getClass();
                bne.o(0, 0, bneVar, cneVar);
                return Unit.INSTANCE;
            case 6:
                bne.o(0, 0, (bne) obj, cneVar);
                return Unit.INSTANCE;
            default:
                bne.q((bne) obj, this.i, 0, 0, null, 12);
                return Unit.INSTANCE;
        }
    }
}
