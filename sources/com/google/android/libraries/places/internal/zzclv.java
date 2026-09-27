package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.dmk;
import defpackage.sv6;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzclv extends zzcaa {
    private final zzbzr zzf;
    private zzbzx zzg;
    private zzbxv zzh = zzbxv.IDLE;

    public zzclv(zzbzr zzbzrVar) {
        brn.m(zzbzrVar, "helper");
        this.zzf = zzbzrVar;
    }

    private final void zzg(zzbxv zzbxvVar, zzbzy zzbzyVar) {
        this.zzh = zzbxvVar;
        this.zzf.zzb(zzbxvVar, zzbzyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final zzccd zza(zzbzw zzbzwVar) {
        Boolean bool;
        List zzc = zzbzwVar.zzc();
        if (zzc.isEmpty()) {
            zzccd zzccdVar = zzccd.zzi;
            String valueOf = String.valueOf(zzbzwVar.zzc());
            String valueOf2 = String.valueOf(zzbzwVar.zzd());
            zzccd zze = zzccdVar.zze(sv6.p(new StringBuilder(valueOf.length() + 55 + valueOf2.length()), "NameResolver returned no usable address. addrs=", valueOf, ", attrs=", valueOf2));
            zzb(zze);
            return zze;
        }
        if ((zzbzwVar.zze() instanceof zzcls) && (bool = ((zzcls) zzbzwVar.zze()).zza) != null && bool.booleanValue()) {
            zzc = zzclq.zzf(zzc, new Random());
        }
        zzbzx zzbzxVar = this.zzg;
        if (zzbzxVar == null) {
            zzbzr zzbzrVar = this.zzf;
            zzbzm zzd = zzbzo.zzd();
            zzd.zzb(zzc);
            zzbzx zza = zzbzrVar.zza(zzd.zzc());
            zza.zza(new zzclr(this, zza));
            this.zzg = zza;
            zzg(zzbxv.CONNECTING, new zzbzq(zzbzt.zzd()));
            zza.zzc();
        } else {
            zzbzxVar.zzd(zzc);
        }
        return zzccd.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final void zzb(zzccd zzccdVar) {
        zzbzx zzbzxVar = this.zzg;
        if (zzbzxVar != null) {
            zzbzxVar.zzb();
            this.zzg = null;
        }
        zzg(zzbxv.TRANSIENT_FAILURE, new zzbzq(zzbzt.zzb(zzccdVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final void zzc() {
        zzbzx zzbzxVar = this.zzg;
        if (zzbzxVar != null) {
            zzbzxVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcaa
    public final void zzd() {
        zzbzx zzbzxVar = this.zzg;
        if (zzbzxVar != null) {
            zzbzxVar.zzc();
        }
    }

    public final /* synthetic */ void zze(zzbzx zzbzxVar, zzbxw zzbxwVar) {
        zzbzy zzbzqVar;
        zzbxv zzc = zzbxwVar.zzc();
        if (zzc != zzbxv.SHUTDOWN) {
            zzbxv zzbxvVar = zzbxv.TRANSIENT_FAILURE;
            if (zzc == zzbxvVar || zzc == zzbxv.IDLE) {
                this.zzf.zzc();
            }
            if (this.zzh == zzbxvVar) {
                if (zzc != zzbxv.CONNECTING) {
                    if (zzc == zzbxv.IDLE) {
                        zzd();
                        return;
                    }
                } else {
                    return;
                }
            }
            int ordinal = zzc.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            zzbzqVar = new zzclu(this, null);
                        } else {
                            dmk.v("Unsupported state:".concat(String.valueOf(zzc)));
                            return;
                        }
                    } else {
                        zzbzqVar = new zzbzq(zzbzt.zzb(zzbxwVar.zzd()));
                    }
                } else {
                    zzbzqVar = new zzbzq(zzbzt.zza(zzbzxVar, null));
                }
            } else {
                zzbzqVar = new zzbzq(zzbzt.zzd());
            }
            zzg(zzc, zzbzqVar);
        }
    }

    public final /* synthetic */ zzbzr zzf() {
        return this.zzf;
    }
}
