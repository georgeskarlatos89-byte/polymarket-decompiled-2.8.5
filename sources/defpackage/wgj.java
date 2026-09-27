package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wgj {
    public final LinkedHashMap a;

    public wgj(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final wgj a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1c.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            aca acaVar = (aca) entry.getValue();
            linkedHashMap2.put(key, new aca(acaVar.a, acaVar.b, acaVar.c, true, true));
        }
        return new wgj(linkedHashMap2);
    }
}
