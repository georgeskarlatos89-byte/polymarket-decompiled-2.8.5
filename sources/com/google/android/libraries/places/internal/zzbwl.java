package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbwl implements zzbwp {
    private static final Object zza = new Object();
    private volatile zzbwp zzb;
    private volatile Object zzc = zza;

    private zzbwl(zzbwp zzbwpVar) {
        this.zzb = zzbwpVar;
    }

    public static zzbwp zza(zzbwp zzbwpVar) {
        if (zzbwpVar instanceof zzbwl) {
            return zzbwpVar;
        }
        return new zzbwl(zzbwpVar);
    }

    private final synchronized Object zzc() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj == obj2) {
                Object zzb = this.zzb.zzb();
                Object obj3 = this.zzc;
                if (obj3 != obj2 && obj3 != zzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
                }
                this.zzc = zzb;
                this.zzb = null;
                return zzb;
            }
            return obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            return zzc();
        }
        return obj;
    }
}
