package io.intercom.android.sdk.utilities.extensions;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"safeGetOrDefault", "V", "K", "", "key", "default", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V safeGetOrDefault(Map<K, ? extends V> map, K k, V v) {
        map.getClass();
        return map.getOrDefault(k, v);
    }
}
