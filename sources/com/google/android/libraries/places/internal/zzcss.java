package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcss extends zzcsr {
    private final zzcsz zza;
    private final zzcsp zzb;
    private boolean zzc;

    public zzcss(zzcsz zzcszVar, zzcsp zzcspVar) {
        super(null);
        this.zza = zzcszVar;
        this.zzb = zzcspVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzb(Object obj) {
        if (!this.zzc) {
            this.zzc = true;
            this.zza.zzc(obj);
            return;
        }
        throw new zzccg(zzccd.zzh.zze("More than one responses received for unary or client-streaming call"), null);
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzc(zzccd zzccdVar, zzcas zzcasVar) {
        boolean zzj = zzccdVar.zzj();
        zzcsz zzcszVar = this.zza;
        if (zzj) {
            zzcszVar.zzb();
        } else {
            zzcszVar.zza(new zzccg(zzccdVar, zzcasVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcsr
    public final void zze() {
        this.zzb.zzd(1);
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzd() {
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zza(zzcas zzcasVar) {
    }
}
