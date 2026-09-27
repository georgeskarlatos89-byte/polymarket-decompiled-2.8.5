package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbx implements zzcc {
    private final int zza;
    private final zzcb zzb;

    public zzbx(int i, zzcb zzcbVar) {
        this.zza = i;
        this.zzb = zzcbVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        if (this.zza == zzccVar.zza() && this.zzb.equals(zzccVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzcc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzcc
    public final zzcb zzb() {
        return this.zzb;
    }
}
