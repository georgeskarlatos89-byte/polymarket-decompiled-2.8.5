package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z42 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;

    public /* synthetic */ z42(ArrayList arrayList, int i, int i2) {
        this.a = i2;
        this.b = arrayList;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ArrayList<cne> arrayList = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                bneVar.getClass();
                int i3 = 0;
                for (cne cneVar : arrayList) {
                    bne.o(i3, 0, bneVar, cneVar);
                    i3 += cneVar.a + i2;
                }
                return Unit.INSTANCE;
            default:
                bneVar.getClass();
                for (cne cneVar2 : arrayList) {
                    bne.o((i2 - cneVar2.a) / 2, 0, bneVar, cneVar2);
                }
                return Unit.INSTANCE;
        }
    }
}
