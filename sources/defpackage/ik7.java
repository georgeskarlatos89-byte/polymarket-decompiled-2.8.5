package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes.dex */
public final class ik7 implements Map<String, Object>, xog, bka {
    public static final hk7 Companion = new Object();
    public final /* synthetic */ LinkedHashMap a = new LinkedHashMap();

    public ik7() {
    }

    @Override // defpackage.xog
    public final Object a(String str) {
        return get(str);
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, Object>> entrySet = this.a.entrySet();
        entrySet.getClass();
        return entrySet;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.a.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        Set<String> keySet = this.a.keySet();
        keySet.getClass();
        return keySet;
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        String str2 = str;
        str2.getClass();
        return this.a.put(str2, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        map.getClass();
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.a.remove((String) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        Collection<Object> values = this.a.values();
        values.getClass();
        return values;
    }

    public /* synthetic */ ik7(int i) {
    }
}
