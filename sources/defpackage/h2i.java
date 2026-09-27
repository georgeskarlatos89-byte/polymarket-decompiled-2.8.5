package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class h2i implements f2i {
    public final Map c;

    public h2i(Map map) {
        z93 z93Var = new z93();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            z93Var.put(str, arrayList);
        }
        this.c = z93Var;
    }

    @Override // defpackage.f2i
    public final void a(Function2 function2) {
        for (Map.Entry entry : this.c.entrySet()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // defpackage.f2i
    public final boolean b() {
        return true;
    }

    @Override // defpackage.f2i
    public final boolean c() {
        if (((List) this.c.get("Content-Encoding")) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f2i
    public final Set entries() {
        Set entrySet = this.c.entrySet();
        entrySet.getClass();
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f2i) {
            f2i f2iVar = (f2i) obj;
            if (true != f2iVar.b()) {
                return false;
            }
            return Intrinsics.areEqual(entries(), f2iVar.entries());
        }
        return false;
    }

    @Override // defpackage.f2i
    public final String get(String str) {
        List list = (List) this.c.get(str);
        if (list != null) {
            return (String) CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public final int hashCode() {
        Set entries = entries();
        return entries.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // defpackage.f2i
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }
}
