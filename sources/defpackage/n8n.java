package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class n8n {
    public static final boolean a(u7e u7eVar) {
        bdb bdbVar;
        boolean z;
        boolean z2;
        String str;
        nhb nhbVar = u7eVar.T;
        if (nhbVar != null && (bdbVar = nhbVar.a) != null && bdbVar.G.contains("INSTANT_DEBITS")) {
            uce uceVar = u7eVar.b;
            if (uceVar.c != sce.Never) {
                z = true;
            } else {
                z = false;
            }
            if (uceVar.e) {
                qce qceVar = u7eVar.k;
                if (qceVar != null) {
                    str = qceVar.b;
                } else {
                    str = null;
                }
                if (str != null && !StringsKt.T(str)) {
                    z2 = true;
                    if (!z || z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            if (!z) {
            }
            return true;
        }
        return false;
    }

    public static final List b(ArrayList arrayList, Object obj, Comparator comparator) {
        int i;
        comparator.getClass();
        int s = CollectionsKt.s(arrayList, obj, comparator);
        if (s >= 0) {
            i = s + 1;
        } else {
            i = -(s + 1);
        }
        arrayList.add(i, obj);
        return CollectionsKt.M0(arrayList);
    }

    public static final List c(List list, List list2, Function1 function1, Comparator comparator) {
        list.getClass();
        list2.getClass();
        comparator.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(function1.invoke(it.next()));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!linkedHashSet.contains(function1.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size() && i2 < list2.size()) {
            Object obj2 = arrayList.get(i);
            Object obj3 = list2.get(i2);
            if (comparator.compare(obj2, obj3) <= 0) {
                arrayList2.add(obj2);
                i++;
            } else {
                arrayList2.add(obj3);
                i2++;
            }
        }
        while (i < arrayList.size()) {
            arrayList2.add(arrayList.get(i));
            i++;
        }
        while (i2 < list2.size()) {
            arrayList2.add(list2.get(i2));
            i2++;
        }
        return CollectionsKt.M0(arrayList2);
    }

    public static final List d(List list, Object obj, Function1 function1, Comparator comparator, Function1 function12) {
        list.getClass();
        comparator.getClass();
        Object invoke = function1.invoke(obj);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(function1.invoke(it.next()), invoke)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            Object invoke2 = function12.invoke(list.get(i));
            if (comparator.compare(list.get(i), invoke2) == 0) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i, invoke2);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.remove(i);
            return b(arrayList2, invoke2, comparator);
        }
        return b(new ArrayList(list), obj, comparator);
    }
}
