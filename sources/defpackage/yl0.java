package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class yl0 {
    public static final Continuation[] a = new Continuation[0];

    public static final Collection a(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static Set b() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final wah c(ArrayList arrayList) {
        wah wahVar = new wah();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            m9c m9cVar = (m9c) next;
            if (m9cVar != null && m9cVar != l9c.b) {
                wahVar.add(next);
            }
        }
        return wahVar;
    }
}
