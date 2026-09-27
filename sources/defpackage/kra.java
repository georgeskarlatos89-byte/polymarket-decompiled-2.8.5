package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kra {
    public int a;
    public final String b;
    public final int c;
    public final nra d;
    public final ArrayList e;
    public final ArrayList f;

    public kra(int i, String str, int i2, nra nraVar) {
        str.getClass();
        nraVar.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = nraVar;
        this.e = new ArrayList(1);
        efc.a.getClass();
        List a = dfc.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(a));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((cia) ((efc) it.next())).getClass();
            arrayList.add(new gja());
        }
        this.f = arrayList;
    }
}
