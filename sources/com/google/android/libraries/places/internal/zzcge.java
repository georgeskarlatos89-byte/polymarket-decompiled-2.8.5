package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcge implements zzcdz {
    private final zzcdz zza;
    private volatile boolean zzb;
    private List zzc = new ArrayList();

    public zzcge(zzcdz zzcdzVar) {
        this.zza = zzcdzVar;
    }

    private final void zzg(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.zzb) {
                    this.zzc.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcdz
    public final void zza(zzcas zzcasVar) {
        zzg(new zzcgc(this, zzcasVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcor
    public final void zzb(zzcoq zzcoqVar) {
        if (this.zzb) {
            this.zza.zzb(zzcoqVar);
        } else {
            zzg(new zzcga(this, zzcoqVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcdz
    public final void zzc(zzccd zzccdVar, zzcdy zzcdyVar, zzcas zzcasVar) {
        zzg(new zzcgd(this, zzccdVar, zzcdyVar, zzcasVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcor
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzcgb(this));
        }
    }

    public final void zze() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.zzc.isEmpty()) {
                        this.zzc = null;
                        this.zzb = true;
                        return;
                    } else {
                        list = this.zzc;
                        this.zzc = arrayList;
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

    public final /* synthetic */ zzcdz zzf() {
        return this.zza;
    }
}
