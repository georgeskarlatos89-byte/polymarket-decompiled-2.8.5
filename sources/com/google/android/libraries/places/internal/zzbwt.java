package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbwt implements zzbwp {
    private static final Object zza = new Object();
    private volatile zzbwp zzb;
    private volatile Object zzc = zza;

    private zzbwt(zzbwp zzbwpVar) {
        this.zzb = zzbwpVar;
    }

    public static zzbwp zza(zzbwp zzbwpVar) {
        return new zzbwt(zzbwpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzbwp zzbwpVar = this.zzb;
            if (zzbwpVar == null) {
                return this.zzc;
            }
            Object zzb = zzbwpVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
