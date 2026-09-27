package com.google.mlkit.common.sdkinternal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class LazyInstanceMap<K, V> {
    private final Map zza = new HashMap();

    public abstract V create(K k);

    public V get(K k) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k)) {
                    return (V) this.zza.get(k);
                }
                V create = create(k);
                this.zza.put(k, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
