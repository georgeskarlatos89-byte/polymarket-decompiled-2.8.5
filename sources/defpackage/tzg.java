package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tzg extends szg implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next)) {
                return next;
            }
        }
        dmk.t();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [szg, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new szg(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [szg, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new szg(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [szg, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new szg(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
