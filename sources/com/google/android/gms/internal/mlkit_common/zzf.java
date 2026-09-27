package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzf {
    private final zzac zza = new zzac();
    private Boolean zzb;

    private zzf() {
    }

    public final zzf zza(zzk zzkVar) {
        zzt.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zzb(zzkVar);
        return this;
    }

    public final zzf zzb() {
        boolean z;
        if (this.zzb == null) {
            z = true;
        } else {
            z = false;
        }
        zzt.zze(z, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zzf zzc() {
        boolean z;
        if (this.zzb == null) {
            z = true;
        } else {
            z = false;
        }
        zzt.zze(z, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzh zzd() {
        zzt.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzh(this.zzb.booleanValue(), false, this.zza.zzc(), null);
    }

    public /* synthetic */ zzf(zze zzeVar) {
    }
}
