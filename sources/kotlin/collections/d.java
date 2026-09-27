package kotlin.collections;

import defpackage.e1c;
import defpackage.eb4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class d extends e1c {
    public static List q(Map map) {
        map.getClass();
        if (map.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return eb4.c(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
