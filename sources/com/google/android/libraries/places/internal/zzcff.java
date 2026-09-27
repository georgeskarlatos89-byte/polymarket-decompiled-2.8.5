package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcff extends zzbxe {
    private final zzcfg zza;
    private final zzbxe zzb;
    private volatile boolean zzc;
    private volatile zzccd zzd;
    private List zze = new ArrayList();

    public zzcff(zzcfg zzcfgVar, zzbxe zzbxeVar) {
        this.zza = zzcfgVar;
        this.zzb = zzbxeVar;
    }

    private final void zzk(Throwable th, String str) {
        this.zzd = zzccd.zzb.zzd(th).zze(str);
        this.zza.zze(str, th);
    }

    private final void zzl(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.zzc) {
                    this.zze.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzm(zzcas zzcasVar) {
        if (this.zzd != null) {
            return;
        }
        try {
            this.zzb.zza(zzcasVar);
        } catch (Throwable th) {
            zzk(th, "Failed to read headers");
        }
    }

    private final void zzn(Object obj) {
        if (this.zzd != null) {
            return;
        }
        try {
            this.zzb.zzb(obj);
        } catch (Throwable th) {
            zzk(th, "Failed to read message.");
        }
    }

    private final void zzo() {
        if (this.zzd != null) {
            return;
        }
        try {
            this.zzb.zzd();
        } catch (Throwable th) {
            zzk(th, "Failed to call onReady.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zza(zzcas zzcasVar) {
        if (this.zzc) {
            zzm(zzcasVar);
        } else {
            zzl(new zzcfb(this, zzcasVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzb(Object obj) {
        if (this.zzc) {
            zzn(obj);
        } else {
            zzl(new zzcfc(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzc(zzccd zzccdVar, zzcas zzcasVar) {
        zzl(new zzcfd(this, zzccdVar, zzcasVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzd() {
        if (this.zzc) {
            zzo();
        } else {
            zzl(new zzcfe(this));
        }
    }

    public final void zze() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.zze.isEmpty()) {
                        this.zze = null;
                        this.zzc = true;
                        return;
                    } else {
                        list = this.zze;
                        this.zze = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    public final /* synthetic */ void zzf(zzcas zzcasVar) {
        zzm(zzcasVar);
    }

    public final /* synthetic */ void zzg(Object obj) {
        zzn(obj);
    }

    public final /* synthetic */ void zzh() {
        zzo();
    }

    public final /* synthetic */ zzbxe zzi() {
        return this.zzb;
    }

    public final /* synthetic */ zzccd zzj() {
        return this.zzd;
    }
}
