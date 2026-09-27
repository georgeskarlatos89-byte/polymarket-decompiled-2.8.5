package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfn implements zzckr {
    private final Executor zzc;
    private final zzccl zzd;
    private Runnable zze;
    private Runnable zzf;
    private Runnable zzg;
    private zzckq zzh;
    private final zzbzf zza = zzbzf.zza(zzcfn.class, null);
    private final Object zzb = new Object();
    private Collection zzi = new LinkedHashSet();
    private volatile zzcfm zzj = new zzcfm(null, null, null);

    public zzcfn(Executor executor, zzccl zzcclVar) {
        this.zzc = executor;
        this.zzd = zzcclVar;
    }

    @Override // com.google.android.libraries.places.internal.zzckr
    public final Runnable zzaq(zzckq zzckqVar) {
        this.zzh = zzckqVar;
        this.zze = new zzcfh(this, zzckqVar);
        this.zzf = new zzcfi(this, zzckqVar);
        this.zzg = new zzcfj(this, zzckqVar);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r4 = new com.google.android.libraries.places.internal.zzcfl(r3, r0, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r0.zza().zzk() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r5.zzh() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r4.zzj(r5.zzf());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r3.zzi.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        r5 = r3.zzi.size();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.libraries.places.internal.zzcdx] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.libraries.places.internal.zzcgt] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.libraries.places.internal.zzcdx] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.libraries.places.internal.zzcfl, java.lang.Object] */
    @Override // com.google.android.libraries.places.internal.zzcea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcdx zzb(zzcax zzcaxVar, zzcas zzcasVar, zzbxa zzbxaVar, zzbxm[] zzbxmVarArr) {
        ?? zzcgtVar;
        zzbzt zzbztVar;
        zzcfm zzcfmVar;
        int size;
        try {
            zzclx zzclxVar = new zzclx(zzcaxVar, zzcasVar, zzbxaVar, new zzcld(zzbxmVarArr));
            zzcfm zzcfmVar2 = this.zzj;
            while (true) {
                zzccd zzccdVar = zzcfmVar2.zzb;
                if (zzccdVar != null) {
                    zzcgtVar = new zzcgt(zzccdVar, zzcdy.PROCESSED, zzbxmVarArr);
                    break;
                }
                zzbzy zzbzyVar = zzcfmVar2.zza;
                if (zzbzyVar != null) {
                    zzbztVar = zzbzyVar.zza(zzclxVar);
                    zzbxa zza = zzclxVar.zza();
                    zzcea zze = zzchn.zze(zzbztVar, zza.zzk());
                    if (zze != null) {
                        zzcgtVar = zze.zzb(zzclxVar.zzc(), zzclxVar.zzb(), zza, zzbxmVarArr);
                        break;
                    }
                } else {
                    zzbztVar = null;
                }
                Object obj = this.zzb;
                synchronized (obj) {
                    try {
                        zzcfmVar = this.zzj;
                        if (zzcfmVar2 == zzcfmVar) {
                            break;
                        }
                    } finally {
                    }
                }
                if (size == 1) {
                    this.zzd.zzb(this.zze);
                }
                for (zzbxm zzbxmVar : zzbxmVarArr) {
                }
                zzcfmVar2 = zzcfmVar;
            }
            this.zzd.zza();
            return zzcgtVar;
        } catch (Throwable th) {
            this.zzd.zza();
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzk
    public final zzbzf zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzckr
    public final void zzd(zzccd zzccdVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            try {
                if (this.zzj.zzb != null) {
                    return;
                }
                this.zzj = this.zzj.zzb(zzccdVar);
                zzccl zzcclVar = this.zzd;
                zzcclVar.zzb(new zzcfk(this, zzccdVar));
                if (!zzf() && (runnable = this.zzg) != null) {
                    zzcclVar.zzb(runnable);
                    this.zzg = null;
                }
                this.zzd.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzckr
    public final void zze(zzccd zzccdVar) {
        Collection<zzcfl> collection;
        Runnable runnable;
        zzd(zzccdVar);
        synchronized (this.zzb) {
            try {
                collection = this.zzi;
                runnable = this.zzg;
                this.zzg = null;
                if (!collection.isEmpty()) {
                    this.zzi = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (zzcfl zzcflVar : collection) {
                Runnable zzo = zzcflVar.zzo(new zzcgt(zzccdVar, zzcdy.REFUSED, zzcflVar.zzi()));
                if (zzo != null) {
                    ((zzcfv) zzo).zza.zzp();
                }
            }
            zzccl zzcclVar = this.zzd;
            zzcclVar.zzb(runnable);
            zzcclVar.zza();
        }
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzb) {
            z = !this.zzi.isEmpty();
        }
        return z;
    }

    public final void zzg(zzbzy zzbzyVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            this.zzj = this.zzj.zza(zzbzyVar);
            if (zzbzyVar != null && zzf()) {
                ArrayList arrayList = new ArrayList(this.zzi);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzcfl zzcflVar = (zzcfl) arrayList.get(i);
                    zzbzt zza = zzbzyVar.zza(zzcflVar.zzh());
                    zzbxa zza2 = zzcflVar.zzh().zza();
                    if (zza2.zzk() && zza.zzh()) {
                        zzcflVar.zzj(zza.zzf());
                    }
                    zzcea zze = zzchn.zze(zza, zza2.zzk());
                    if (zze != null) {
                        Executor executor = this.zzc;
                        if (zza2.zzj() != null) {
                            executor = zza2.zzj();
                        }
                        Runnable zzg = zzcflVar.zzg(zze, null);
                        if (zzg != null) {
                            executor.execute(zzg);
                        }
                        arrayList2.add(zzcflVar);
                    }
                }
                synchronized (this.zzb) {
                    try {
                        if (!zzf()) {
                            return;
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.zzi.remove((zzcfl) it.next());
                        }
                        if (this.zzi.isEmpty()) {
                            this.zzi = new LinkedHashSet();
                        }
                        if (!zzf()) {
                            zzccl zzcclVar = this.zzd;
                            zzcclVar.zzb(this.zzf);
                            if (this.zzj.zzb != null && (runnable = this.zzg) != null) {
                                zzcclVar.zzb(runnable);
                                this.zzg = null;
                            }
                        }
                        this.zzd.zza();
                    } finally {
                    }
                }
            }
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzb;
    }

    public final /* synthetic */ zzccl zzi() {
        return this.zzd;
    }

    public final /* synthetic */ Runnable zzj() {
        return this.zzf;
    }

    public final /* synthetic */ Runnable zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        this.zzg = null;
    }

    public final /* synthetic */ zzckq zzm() {
        return this.zzh;
    }

    public final /* synthetic */ Collection zzn() {
        return this.zzi;
    }

    public final /* synthetic */ zzcfm zzo() {
        return this.zzj;
    }
}
