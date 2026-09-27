package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckd extends zzcdb {
    final zzbzo zza;
    final zzbzf zzb;
    final zzcdo zzc;
    final zzcdp zzd;
    List zze;
    zzcio zzf;
    boolean zzg;
    boolean zzh;
    zzcck zzi;
    final /* synthetic */ zzckf zzj;

    public zzckd(zzckf zzckfVar, zzbzo zzbzoVar) {
        Objects.requireNonNull(zzckfVar);
        this.zzj = zzckfVar;
        brn.m(zzbzoVar, "args");
        this.zze = zzbzoVar.zza();
        this.zza = zzbzoVar;
        zzbzf zzb = zzbzf.zzb("Subchannel", zzckfVar.zzb());
        this.zzb = zzb;
        zzcdp zzcdpVar = new zzcdp(zzb, 0, zzckfVar.zzy().zza(), "Subchannel for ".concat(String.valueOf(zzbzoVar.zza())));
        this.zzd = zzcdpVar;
        this.zzc = new zzcdo(zzcdpVar, zzckfVar.zzy());
    }

    public final String toString() {
        return this.zzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final void zza(zzbzz zzbzzVar) {
        zzckf zzckfVar = this.zzj;
        zzccl zzcclVar = zzckfVar.zze;
        zzcclVar.zzc();
        brn.r("already started", !this.zzg);
        brn.r("already shutdown", !this.zzh);
        brn.r("Channel is being terminated", !zzckfVar.zzQ());
        this.zzg = true;
        String zzb = zzckfVar.zzb();
        ScheduledExecutorService zzb2 = zzckfVar.zzv().zzb();
        zzckb zzckbVar = new zzckb(this, zzbzzVar);
        zzcba zzaj = zzckfVar.zzF().zzb.zzaj();
        zzbyw zzX = zzckfVar.zzX();
        zzcdn zza = zzckfVar.zzT().zza();
        zzcdp zzcdpVar = this.zzd;
        zzbzf zzbzfVar = this.zzb;
        zzcio zzcioVar = new zzcio(this.zza, zzb, zzckfVar.zzD(), zzckfVar.zzan(), zzckfVar.zzv(), zzb2, zzckfVar.zzA(), zzcclVar, zzckbVar, zzX, zza, zzcdpVar, zzbzfVar, this.zzc, zzckfVar.zzC(), zzckfVar.zzu(), zzaj);
        zzbys zzbysVar = new zzbys();
        zzbysVar.zza("Child Subchannel started");
        zzbysVar.zzc(zzbyt.CT_INFO);
        zzbysVar.zzb(zzckfVar.zzy().zza());
        zzbysVar.zzd(zzcioVar);
        zzckfVar.zzV().zza(zzbysVar.zze());
        this.zzf = zzcioVar;
        zzckfVar.zzX().zzb(zzcioVar);
        zzckfVar.zzH().add(zzcioVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final void zzb() {
        zzcck zzcckVar;
        zzckf zzckfVar = this.zzj;
        zzccl zzcclVar = zzckfVar.zze;
        zzcclVar.zzc();
        if (this.zzf == null) {
            this.zzh = true;
            return;
        }
        if (this.zzh) {
            if (zzckfVar.zzQ() && (zzcckVar = this.zzi) != null) {
                zzcckVar.zza();
                this.zzi = null;
            } else {
                return;
            }
        } else {
            this.zzh = true;
        }
        if (!zzckfVar.zzQ()) {
            this.zzi = zzcclVar.zzd(new zzcit(new zzckc(this)), 5L, TimeUnit.SECONDS, zzckfVar.zzv().zzb());
        } else {
            this.zzf.zzd(zzckf.zzc);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final void zzc() {
        this.zzj.zze.zzc();
        brn.r("not started", this.zzg);
        if (this.zzh) {
            return;
        }
        this.zzf.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final void zzd(List list) {
        this.zzj.zze.zzc();
        this.zze = list;
        this.zzf.zzb(list);
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final Object zze() {
        brn.r("Subchannel is not started", this.zzg);
        return this.zzf;
    }
}
