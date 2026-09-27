package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g07 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ qqc c;

    public /* synthetic */ g07(ArrayList arrayList, qqc qqcVar, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = qqcVar;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        qqc qqcVar = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                c4a c4aVar = (c4a) obj;
                if (c4aVar instanceof e07) {
                    arrayList.add(c4aVar);
                } else if (c4aVar instanceof f07) {
                    arrayList.remove(((f07) c4aVar).a);
                } else if (c4aVar instanceof d07) {
                    arrayList.remove(((d07) c4aVar).a);
                }
                qqcVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.INSTANCE;
            case 1:
                c4a c4aVar2 = (c4a) obj;
                if (c4aVar2 instanceof lf8) {
                    arrayList.add(c4aVar2);
                } else if (c4aVar2 instanceof mf8) {
                    arrayList.remove(((mf8) c4aVar2).a);
                }
                qqcVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.INSTANCE;
            default:
                c4a c4aVar3 = (c4a) obj;
                if (c4aVar3 instanceof b3f) {
                    arrayList.add(c4aVar3);
                } else if (c4aVar3 instanceof c3f) {
                    arrayList.remove(((c3f) c4aVar3).a);
                } else if (c4aVar3 instanceof a3f) {
                    arrayList.remove(((a3f) c4aVar3).a);
                }
                qqcVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.INSTANCE;
        }
    }
}
