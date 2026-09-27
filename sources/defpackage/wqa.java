package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wqa {
    public int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final LinkedHashMap d = new LinkedHashMap(0);
    public final ArrayList e = new ArrayList(0);
    public final ArrayList f;

    public wqa(int i) {
        this.a = i;
        efc.a.getClass();
        List a = dfc.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(a));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((cia) ((efc) it.next())).getClass();
            arrayList.add(new Object());
        }
        this.f = arrayList;
    }
}
