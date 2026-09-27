package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n0c {
    public static void a(Object obj, Object obj2) {
        l0c l0cVar = (l0c) obj;
        if (obj2 == null) {
            if (!l0cVar.isEmpty()) {
                Iterator it = l0cVar.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
            return;
        }
        dmk.p();
    }

    public static l0c b(Object obj, Object obj2) {
        l0c l0cVar = (l0c) obj;
        l0c l0cVar2 = (l0c) obj2;
        if (!l0cVar2.isEmpty()) {
            if (!l0cVar.a) {
                l0cVar = l0cVar.c();
            }
            l0cVar.b();
            if (!l0cVar2.isEmpty()) {
                l0cVar.putAll(l0cVar2);
            }
        }
        return l0cVar;
    }
}
