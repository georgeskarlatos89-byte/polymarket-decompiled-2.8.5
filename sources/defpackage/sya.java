package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class sya implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ sya(qqc qqcVar, ArrayList arrayList, List list, boolean z, int i) {
        this.a = i;
        this.b = qqcVar;
        this.c = arrayList;
        this.d = list;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.e;
        List list = this.d;
        ArrayList arrayList = this.c;
        qqc qqcVar = this.b;
        bne bneVar = (bne) obj;
        switch (i) {
            case 0:
                bneVar.a = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((uya) arrayList.get(i2)).a(bneVar, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((uya) list.get(i3)).a(bneVar, z);
                }
                bneVar.a = false;
                qqcVar.getValue();
                return Unit.INSTANCE;
            default:
                bneVar.a = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((s2b) arrayList.get(i4)).b(bneVar, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((s2b) list.get(i5)).b(bneVar, z);
                }
                bneVar.a = false;
                qqcVar.getValue();
                return Unit.INSTANCE;
        }
    }
}
