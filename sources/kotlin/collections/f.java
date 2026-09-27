package kotlin.collections;

import defpackage.c1c;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class f extends e {
    public static LinkedHashSet f(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set g(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> h = CollectionsKt__MutableCollectionsKt.h(iterable);
        if (h.isEmpty()) {
            return CollectionsKt.Q0(set);
        }
        if (h instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((Set) h).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(h);
        return linkedHashSet2;
    }

    public static LinkedHashSet h(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(size));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet i(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
