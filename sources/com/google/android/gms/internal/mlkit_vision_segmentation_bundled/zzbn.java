package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbn extends zzay {
    private final transient zzax zza;
    private final transient zzav zzb;

    public zzbn(zzax zzaxVar, zzav zzavVar) {
        this.zza = zzaxVar;
        this.zzb = zzavVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzay, com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.zzi(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzay, com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final zzbt zzd() {
        return this.zzb.zzi(0);
    }
}
