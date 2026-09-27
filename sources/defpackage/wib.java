package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wib extends yib {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List arrayList;
        List list = (List) nvj.j(j, obj);
        if (list.isEmpty()) {
            if (list instanceof s4b) {
                arrayList = new r4b(i);
            } else if ((list instanceof r5f) && (list instanceof b5a)) {
                arrayList = ((b5a) list).q0(i);
            } else {
                arrayList = new ArrayList(i);
            }
            nvj.q(j, obj, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            nvj.q(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof xuj) {
            xuj xujVar = (xuj) list;
            r4b r4bVar = new r4b(xujVar.a.size() + i);
            r4bVar.addAll(xujVar);
            nvj.q(j, obj, r4bVar);
            return r4bVar;
        }
        if ((list instanceof r5f) && (list instanceof b5a)) {
            b5a b5aVar = (b5a) list;
            if (!((u4) b5aVar).a) {
                b5a q0 = b5aVar.q0(list.size() + i);
                nvj.q(j, obj, q0);
                return q0;
            }
        }
        return list;
    }

    @Override // defpackage.yib
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) nvj.j(j, obj);
        if (list instanceof s4b) {
            unmodifiableList = ((s4b) list).g();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if ((list instanceof r5f) && (list instanceof b5a)) {
                u4 u4Var = (u4) ((b5a) list);
                if (u4Var.a) {
                    u4Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        nvj.q(j, obj, unmodifiableList);
    }

    @Override // defpackage.yib
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) nvj.j(j, obj2);
        List d = d(j, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        nvj.q(j, obj, list);
    }

    @Override // defpackage.yib
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
