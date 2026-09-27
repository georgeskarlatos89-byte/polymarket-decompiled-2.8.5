package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzax implements Map, Serializable {
    private transient zzay zza;
    private transient zzay zzb;
    private transient zzaq zzc;

    public static zzax zzc(Object obj, Object obj2) {
        zzab.zzb("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
        return zzbp.zzg(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return zzb().contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return zzf();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzbr.zza(zzf());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzay zzayVar = this.zzb;
        if (zzayVar == null) {
            zzay zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzayVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzab.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return zzb();
    }

    public abstract zzaq zza();

    public final zzaq zzb() {
        zzaq zzaqVar = this.zzc;
        if (zzaqVar == null) {
            zzaq zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzaqVar;
    }

    public abstract zzay zzd();

    public abstract zzay zze();

    public final zzay zzf() {
        zzay zzayVar = this.zza;
        if (zzayVar == null) {
            zzay zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzayVar;
    }
}
