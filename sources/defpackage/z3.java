package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class z3 extends u3 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ aoc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(aoc aocVar, SortedMap sortedMap) {
        super(aocVar, sortedMap, 0);
        this.g = aocVar;
    }

    public SortedSet c() {
        return new a4(this.g, e());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedSet d() {
        SortedSet sortedSet = this.f;
        if (sortedSet == null) {
            SortedSet c = c();
            this.f = c;
            return c;
        }
        return sortedSet;
    }

    public SortedMap e() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new z3(this.g, e().headMap(obj));
    }

    @Override // defpackage.u3, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return d();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new z3(this.g, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new z3(this.g, e().tailMap(obj));
    }
}
