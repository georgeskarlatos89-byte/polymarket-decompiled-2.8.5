package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.c;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w6h {
    public final String a;
    public final ArrayList b = new ArrayList();
    public Pair c = new Pair("V", null);

    public w6h(qje qjeVar, String str, String str2) {
        this.a = str2;
    }

    public final void a(String str, aca... acaVarArr) {
        wgj wgjVar;
        str.getClass();
        if (acaVarArr.length == 0) {
            wgjVar = null;
        } else {
            sl0 sl0Var = new sl0(new ke(acaVarArr, 13), 2);
            int a = c1c.a(CollectionsKt.w(sl0Var));
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            Iterator it = sl0Var.iterator();
            while (true) {
                c cVar = (c) it;
                if (!cVar.a.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) cVar.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.a), (aca) indexedValue.b);
            }
            wgjVar = new wgj(linkedHashMap);
        }
        this.b.add(new Pair(str, wgjVar));
    }

    public final void b(kia kiaVar) {
        kiaVar.getClass();
        this.c = new Pair(kiaVar.d(), null);
    }

    public final void c(String str, aca... acaVarArr) {
        str.getClass();
        sl0 sl0Var = new sl0(new ke(acaVarArr, 13), 2);
        int a = c1c.a(CollectionsKt.w(sl0Var));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = sl0Var.iterator();
        while (true) {
            c cVar = (c) it;
            if (cVar.a.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) cVar.next();
                linkedHashMap.put(Integer.valueOf(indexedValue.a), (aca) indexedValue.b);
            } else {
                this.c = new Pair(str, new wgj(linkedHashMap));
                return;
            }
        }
    }
}
