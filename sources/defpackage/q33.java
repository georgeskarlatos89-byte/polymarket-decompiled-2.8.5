package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q33 {
    public final g33 a;

    public q33() {
        HashSet hashSet = new HashSet();
        wpc p = wpc.p();
        ArrayList arrayList = new ArrayList();
        uqc a = uqc.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        lld g = lld.g(p);
        ArrayList arrayList3 = new ArrayList(arrayList);
        oki okiVar = oki.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.a = new g33(arrayList2, g, -1, false, arrayList3, false, new oki(arrayMap), null);
    }
}
