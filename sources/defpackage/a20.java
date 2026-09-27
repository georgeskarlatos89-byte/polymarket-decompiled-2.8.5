package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a20 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a20(int i, ArrayList arrayList) {
        super(1);
        this.h = i;
        this.i = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        ArrayList arrayList = this.i;
        switch (i) {
            case 0:
                bne bneVar = (bne) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bne.o(0, 0, bneVar, (cne) arrayList.get(i2));
                }
                return Unit.INSTANCE;
            case 1:
                bne bneVar2 = (bne) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        bne.o(0, 0, bneVar2, (cne) arrayList.get(i3));
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                bne bneVar3 = (bne) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    bne.j(0, 0, bneVar3, (cne) arrayList.get(i4));
                }
                return Unit.INSTANCE;
            default:
                bne bneVar4 = (bne) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    bne.q(bneVar4, (cne) arrayList.get(i5), 0, 0, null, 12);
                }
                return Unit.INSTANCE;
        }
    }
}
