package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hf2 implements v5c {
    public static final hf2 a = new Object();

    @Override // defpackage.v5c
    public final w5c b(x5c x5cVar, List list, long j) {
        list.getClass();
        final int i = rz4.i(j);
        final int h = rz4.h(j);
        int i2 = 0;
        final cne T = ((o5c) list.get(0)).T(rz4.b(j, 0, 0, 0, 0, 10));
        final cne T2 = ((o5c) list.get(1)).T(rz4.b(j, 0, 0, 0, 0, 10));
        final int i3 = i / 2;
        int min = Math.min(i3 - T.a, (i - T2.a) - i3);
        if (min >= 0) {
            i2 = min;
        }
        final cne T3 = ((o5c) list.get(2)).T(rz4.b(j, 0, i2 * 2, 0, 0, 8));
        return x5c.r0(x5cVar, i, h, new Function1() { // from class: gf2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bne bneVar = (bne) obj;
                bneVar.getClass();
                cne cneVar = cne.this;
                int i4 = cneVar.b;
                int i5 = h;
                bne.o(0, (i5 - i4) / 2, bneVar, cneVar);
                cne cneVar2 = T2;
                bne.o(i - cneVar2.a, (i5 - cneVar2.b) / 2, bneVar, cneVar2);
                cne cneVar3 = T3;
                bne.o(i3 - (cneVar3.a / 2), (i5 - cneVar3.b) / 2, bneVar, cneVar3);
                return Unit.INSTANCE;
            }
        });
    }
}
