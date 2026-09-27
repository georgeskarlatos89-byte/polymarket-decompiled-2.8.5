package io.ably.lib.util;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        HashMap hashMap = new HashMap(map.size());
        hashMap.putAll(map);
        return hashMap;
    }
}
