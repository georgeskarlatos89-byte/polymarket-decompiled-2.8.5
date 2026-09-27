package io.ably.lib.types;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface ReadOnlyMap<K, V> {
    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Iterable<Map.Entry<K, V>> entrySet();

    V get(Object obj);

    boolean isEmpty();

    Iterable<K> keySet();

    int size();

    Iterable<V> values();
}
