package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rda implements dfd {
    public final /* synthetic */ int a;

    public /* synthetic */ rda(int i) {
        this.a = i;
    }

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                efd efdVar = (efd) obj2;
                efdVar.add(dgf.f, entry.getKey());
                efdVar.add(dgf.g, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
