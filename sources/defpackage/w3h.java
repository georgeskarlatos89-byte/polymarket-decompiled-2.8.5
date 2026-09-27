package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w3h {
    public final SharedPreferences a;
    public final Set b;

    public w3h(SharedPreferences sharedPreferences, LinkedHashSet linkedHashSet) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = linkedHashSet;
    }

    public final void a(String str) {
        Set set = this.b;
        if (set != null && !set.contains(str)) {
            f27.k(k84.g("Can't access key outside migration: ", str));
        }
    }

    public final LinkedHashMap b() {
        boolean z;
        Map<String, ?> all = this.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.b;
            if (set != null) {
                z = set.contains(key);
            } else {
                z = true;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1c.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.Q0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final LinkedHashSet c(String str, fd7 fd7Var) {
        str.getClass();
        a(str);
        Set<String> stringSet = this.a.getStringSet(str, fd7Var);
        if (stringSet != null) {
            return CollectionsKt.P0(stringSet);
        }
        return null;
    }
}
