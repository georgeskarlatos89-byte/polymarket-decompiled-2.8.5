package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.jr9;
import defpackage.u8n;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbfb extends zzbyn {
    private final jr9 zza;
    private final LinkedHashMap zzb;
    private final Queue zzc;
    private final LinkedHashMap zzd;
    private final Set zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcas zzi;
    private zzccd zzj;
    private zzcas zzk;

    public zzbfb(zzbxe zzbxeVar, jr9 jr9Var, Set set, Executor executor) {
        super(zzbxeVar);
        this.zzb = new LinkedHashMap();
        this.zzc = new ArrayDeque();
        this.zzd = new LinkedHashMap();
        this.zza = jr9Var;
        this.zzf = jr9Var.size();
        this.zze = set;
    }

    private final boolean zzf() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }

    private final void zzg() {
        if (this.zzg) {
            Queue<zzbfa> queue = this.zzc;
            for (zzbfa zzbfaVar : queue) {
                Iterator it = u8n.d(this.zza.B(0, zzbfaVar.zzd())).iterator();
                while (it.hasNext()) {
                    Iterator it2 = u8n.d((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        if (this.zze.contains((zzbeb) it2.next())) {
                            brn.m(zzbfaVar.zzc(), "Response message cannot be null");
                        }
                    }
                    if (zzbfaVar.zza()) {
                        zzbfaVar.zze(zzbfaVar.zzd() - 1);
                    } else {
                        return;
                    }
                }
            }
            while (!queue.isEmpty() && ((zzbfa) queue.peek()).zzb()) {
                zze().zzb(((zzbfa) queue.poll()).zzc());
            }
            zzh();
        }
    }

    private final void zzh() {
        if (!zzf() && this.zzc.isEmpty() && this.zzh) {
            Iterator it = u8n.d(this.zza).iterator();
            while (it.hasNext()) {
                for (zzbeb zzbebVar : u8n.d((List) it.next())) {
                    zzccd zzccdVar = this.zzj;
                    zzcas zzcasVar = this.zzk;
                    zzccdVar.getClass();
                    zzcasVar.getClass();
                    this.zze.contains(zzbebVar);
                }
            }
            if (this.zzd.isEmpty()) {
                zze().zzc(this.zzj, this.zzk);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zza(zzcas zzcasVar) {
        this.zzi = zzcasVar;
        zzcasVar.getClass();
        Iterator it = u8n.d(this.zza.B(0, this.zzf)).iterator();
        while (it.hasNext()) {
            this.zzf--;
            Iterator it2 = u8n.d((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.zze.contains((zzbeb) it2.next());
            }
            if (zzf()) {
                return;
            }
        }
        zze().zza(this.zzi);
        this.zzg = true;
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzb(Object obj) {
        this.zzc.add(new zzbfa(this, obj, this.zza.size()));
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzc(zzccd zzccdVar, zzcas zzcasVar) {
        this.zzj = zzccdVar;
        this.zzk = zzcasVar;
        this.zzh = true;
        zzh();
    }
}
