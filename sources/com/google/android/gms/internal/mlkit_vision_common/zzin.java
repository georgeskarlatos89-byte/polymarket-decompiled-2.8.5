package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.bd0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzin {
    private Long zza;
    private zzio zzb;
    private zzii zzc;
    private Integer zzd;
    private Integer zze;
    private Integer zzf;
    private Integer zzg;

    public static /* bridge */ /* synthetic */ zzii zza(zzin zzinVar) {
        return zzinVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzio zzi(zzin zzinVar) {
        return zzinVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Integer zzk(zzin zzinVar) {
        return zzinVar.zzd;
    }

    public static /* bridge */ /* synthetic */ Integer zzl(zzin zzinVar) {
        return zzinVar.zzf;
    }

    public static /* bridge */ /* synthetic */ Integer zzm(zzin zzinVar) {
        return zzinVar.zze;
    }

    public static /* bridge */ /* synthetic */ Integer zzn(zzin zzinVar) {
        return zzinVar.zzg;
    }

    public static /* bridge */ /* synthetic */ Long zzo(zzin zzinVar) {
        return zzinVar.zza;
    }

    public final zzin zzb(Long l) {
        this.zza = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzin zzc(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & bd0.API_PRIORITY_OTHER);
        return this;
    }

    public final zzin zzd(zzii zziiVar) {
        this.zzc = zziiVar;
        return this;
    }

    public final zzin zze(Integer num) {
        this.zzf = Integer.valueOf(num.intValue() & bd0.API_PRIORITY_OTHER);
        return this;
    }

    public final zzin zzf(zzio zzioVar) {
        this.zzb = zzioVar;
        return this;
    }

    public final zzin zzg(Integer num) {
        this.zze = Integer.valueOf(num.intValue() & bd0.API_PRIORITY_OTHER);
        return this;
    }

    public final zzin zzh(Integer num) {
        this.zzg = Integer.valueOf(num.intValue() & bd0.API_PRIORITY_OTHER);
        return this;
    }

    public final zziq zzj() {
        return new zziq(this, null);
    }
}
