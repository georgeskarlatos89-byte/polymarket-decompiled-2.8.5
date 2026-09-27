package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aqc extends y1f {
    public final LinkedHashMap a;
    public final uhl b;

    public aqc(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new uhl(z);
    }

    @Override // defpackage.y1f
    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int a = c1c.a(CollectionsKt.w(entrySet));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    @Override // defpackage.y1f
    public final Object b(w1f w1fVar) {
        w1fVar.getClass();
        Object obj = this.a.get(w1fVar);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            return Arrays.copyOf(bArr, bArr.length);
        }
        return obj;
    }

    public final void e() {
        if (!((AtomicBoolean) this.b.b).get()) {
            return;
        }
        dmk.n("Do mutate preferences once returned to DataStore.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof aqc) {
            LinkedHashMap linkedHashMap = ((aqc) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                        z = true;
                                    }
                                } else {
                                    z = Intrinsics.areEqual(value, obj2);
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f() {
        e();
        this.a.clear();
    }

    public final void g(w1f w1fVar) {
        w1fVar.getClass();
        e();
        this.a.remove(w1fVar);
    }

    public final void h(w1f w1fVar, Object obj) {
        w1fVar.getClass();
        i(w1fVar, obj);
    }

    public final int hashCode() {
        int hashCode;
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public final void i(w1f w1fVar, Object obj) {
        w1fVar.getClass();
        e();
        if (obj == null) {
            g(w1fVar);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.Q0((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(w1fVar, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(w1fVar, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(w1fVar, obj);
        }
    }

    public final String toString() {
        return CollectionsKt.N(this.a.entrySet(), ",\n", "{\n", "\n}", new mdc(20), 24);
    }

    public /* synthetic */ aqc(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
