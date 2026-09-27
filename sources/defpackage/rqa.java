package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rqa implements xqa {
    public int a;
    public String b;
    public String m;
    public ira n;
    public final ArrayList s;
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d = new ArrayList(1);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList(0);
    public final ArrayList h = new ArrayList(1);
    public final ArrayList i = new ArrayList(0);
    public final ArrayList j = new ArrayList(0);
    public final ArrayList k = new ArrayList(0);
    public final ArrayList l = new ArrayList(0);
    public final ArrayList o = new ArrayList(0);
    public final ArrayList p = new ArrayList(0);
    public final ArrayList q = new ArrayList(0);
    public final LinkedHashMap r = new LinkedHashMap(0);

    public rqa() {
        efc.a.getClass();
        List a = dfc.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(a));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((cia) ((efc) it.next())).getClass();
            arrayList.add(new tha());
        }
        this.s = arrayList;
    }

    @Override // defpackage.xqa
    public final ArrayList a() {
        return this.f;
    }

    @Override // defpackage.xqa
    public final ArrayList b() {
        return this.g;
    }

    @Override // defpackage.xqa
    public final ArrayList c() {
        return this.e;
    }
}
