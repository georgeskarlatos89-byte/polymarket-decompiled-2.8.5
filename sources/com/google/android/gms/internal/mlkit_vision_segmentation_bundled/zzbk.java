package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbk extends zzav {
    static final zzav zza = new zzbk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzbk(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzi.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzav, com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final Object[] zze() {
        return this.zzb;
    }
}
