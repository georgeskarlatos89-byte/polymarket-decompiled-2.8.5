package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xnl implements qd7 {
    public static final iml c = new iml(7);
    public final HashMap a;
    public final HashMap b;

    public xnl() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.a;
        dgf dgfVar = new dgf(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        dfd dfdVar = (dfd) hashMap2.get(obj.getClass());
        if (dfdVar != null) {
            dfdVar.encode(obj, dgfVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    @Override // defpackage.qd7
    public /* bridge */ /* synthetic */ qd7 registerEncoder(Class cls, dfd dfdVar) {
        this.a.put(cls, dfdVar);
        this.b.remove(cls);
        return this;
    }

    public xnl(HashMap hashMap, HashMap hashMap2) {
        this.a = hashMap;
        this.b = hashMap2;
    }
}
