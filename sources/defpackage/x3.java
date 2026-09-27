package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x3 extends a4 implements NavigableSet {
    public final /* synthetic */ aoc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(aoc aocVar, NavigableMap navigableMap) {
        super(aocVar, navigableMap);
        this.e = aocVar;
    }

    @Override // defpackage.a4
    public final /* bridge */ /* synthetic */ SortedMap a() {
        return b();
    }

    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((v3) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new x3(this.e, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new x3(this.e, b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        t3 t3Var = (t3) iterator();
        if (t3Var.hasNext()) {
            Object next = t3Var.next();
            t3Var.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new x3(this.e, b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new x3(this.e, b().tailMap(obj, z));
    }

    @Override // defpackage.a4, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.a4, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.a4, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
