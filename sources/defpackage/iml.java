package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iml implements dfd {
    public static final /* synthetic */ iml b = new iml(0);
    public static final /* synthetic */ iml c = new iml(1);
    public static final iml d = new iml(2);
    public static final iml e = new iml(3);
    public static final /* synthetic */ iml f = new iml(4);
    public static final /* synthetic */ iml g = new iml(5);
    public final /* synthetic */ int a;

    public /* synthetic */ iml(int i) {
        this.a = i;
    }

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                efd efdVar = (efd) obj2;
                efdVar.add(pml.f, entry.getKey());
                efdVar.add(pml.g, entry.getValue());
                return;
            case 1:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                if (obj == null) {
                    return;
                } else {
                    dmk.p();
                    return;
                }
            case 3:
                if (obj == null) {
                    return;
                } else {
                    dmk.p();
                    return;
                }
            case 4:
                efd efdVar2 = (efd) obj2;
                Map.Entry entry2 = (Map.Entry) obj;
                efdVar2.add(ydl.f, entry2.getKey());
                efdVar2.add(ydl.g, entry2.getValue());
                return;
            case 5:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry3 = (Map.Entry) obj;
                efd efdVar3 = (efd) obj2;
                efdVar3.add(bnl.f, entry3.getKey());
                efdVar3.add(bnl.g, entry3.getValue());
                return;
            case 7:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 8:
                Map.Entry entry4 = (Map.Entry) obj;
                efd efdVar4 = (efd) obj2;
                efdVar4.add(eyl.f, entry4.getKey());
                efdVar4.add(eyl.g, entry4.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
