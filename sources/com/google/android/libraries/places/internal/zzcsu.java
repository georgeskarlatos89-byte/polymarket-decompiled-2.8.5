package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcsu extends zzcsr {
    private final zzcsq zza;
    private Object zzb;
    private boolean zzc;

    public zzcsu(zzcsq zzcsqVar) {
        super(null);
        this.zzc = false;
        this.zza = zzcsqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzb(Object obj) {
        if (!this.zzc) {
            this.zzb = obj;
            this.zzc = true;
            return;
        }
        throw new zzccg(zzccd.zzh.zze("More than one value received for unary call"), null);
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzc(zzccd zzccdVar, zzcas zzcasVar) {
        if (zzccdVar.zzj()) {
            if (!this.zzc) {
                this.zza.setException(new zzccg(zzccd.zzh.zze("No value received for unary call"), zzcasVar));
            }
            this.zza.set(this.zzb);
            return;
        }
        this.zza.setException(new zzccg(zzccdVar, zzcasVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcsr
    public final void zze() {
        this.zza.zza().zzc(2);
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zza(zzcas zzcasVar) {
    }
}
