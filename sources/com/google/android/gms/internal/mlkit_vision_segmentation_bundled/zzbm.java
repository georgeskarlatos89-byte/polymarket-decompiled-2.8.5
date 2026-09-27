package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbm extends zzay {
    private final transient zzax zza;
    private final transient Object[] zzb;
    private final transient int zzc = 1;

    public zzbm(zzax zzaxVar, Object[] objArr, int i, int i2) {
        this.zza = zzaxVar;
        this.zzb = objArr;
    }

    public static /* bridge */ /* synthetic */ int zzh(zzbm zzbmVar) {
        return zzbmVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Object[] zzi(zzbm zzbmVar) {
        return zzbmVar.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzay, com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().zzi(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzay, com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final zzbt zzd() {
        return zzf().zzi(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzay
    public final zzav zzg() {
        return new zzbl(this);
    }
}
