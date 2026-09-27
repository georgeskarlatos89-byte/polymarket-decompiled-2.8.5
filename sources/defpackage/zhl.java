package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zhl extends xhl implements Serializable {
    public final transient gi4 d;
    public transient int e;

    public zhl() {
        gi4 gi4Var = new gi4(3);
        if (gi4Var.isEmpty()) {
            this.d = gi4Var;
        } else {
            omf.a();
            throw null;
        }
    }

    public final void c() {
        gi4 gi4Var = this.d;
        Iterator it = gi4Var.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        gi4Var.clear();
        this.e = 0;
    }

    public final boolean d(Object obj, Object obj2) {
        gi4 gi4Var = this.d;
        Collection collection = (Collection) gi4Var.get(obj);
        if (collection == null) {
            ArrayList arrayList = new ArrayList(3);
            if (arrayList.add(obj2)) {
                this.e++;
                gi4Var.put(obj, arrayList);
                return true;
            }
            dmk.i("New Collection violated the Collection spec");
            return false;
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.e++;
        return true;
    }
}
