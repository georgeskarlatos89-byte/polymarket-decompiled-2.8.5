package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class a4 extends v3 implements SortedSet {
    public final /* synthetic */ aoc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(aoc aocVar, SortedMap sortedMap) {
        super(aocVar, sortedMap);
        this.d = aocVar;
    }

    public SortedMap a() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new a4(this.d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new a4(this.d, a().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new a4(this.d, a().tailMap(obj));
    }
}
