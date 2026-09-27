package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.jr9;
import defpackage.pt6;
import defpackage.twg;
import defpackage.ujb;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbez extends zzbxf {
    private final zzbxb zza;
    private final zzcax zzb;
    private final jr9 zzc;
    private final Executor zzd;
    private final zzbxa zzj;
    private int zzk;
    private zzbey zzl;
    private int zzn;
    private zzbxe zzo;
    private zzcas zzp;
    private final zzbex zzr;
    private zzbxf zzt;
    private final Set zze = Collections.newSetFromMap(new IdentityHashMap());
    private final LinkedHashMap zzf = new LinkedHashMap();
    private final Set zzg = Collections.newSetFromMap(new IdentityHashMap());
    private boolean zzq = false;
    private boolean zzs = false;
    private final Deque zzh = new ArrayDeque();
    private final Queue zzm = new ArrayDeque();
    private final Queue zzi = new ArrayDeque();

    public zzbez(zzbxb zzbxbVar, zzcax zzcaxVar, zzbxa zzbxaVar, int i, jr9 jr9Var) {
        this.zza = zzbxbVar;
        this.zzb = zzcaxVar;
        this.zzj = zzbxaVar;
        this.zzc = jr9Var;
        this.zzl = zzbey.zzb(jr9Var.size());
        Executor zzj = zzbxaVar.zzj();
        zzbex zzbexVar = new zzbex(zzj == null ? pt6.INSTANCE : zzj);
        this.zzr = zzbexVar;
        final twg twgVar = new twg(zzbexVar);
        this.zzd = new Executor() { // from class: com.google.android.libraries.places.internal.zzbeq
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(final Runnable runnable) {
                final zzbez zzbezVar = zzbez.this;
                twgVar.execute(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbeg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbez.this.zzp(runnable);
                    }
                });
            }
        };
    }

    private final void zzA(final zzbea zzbeaVar, final zzbew zzbewVar) {
        Iterator it = zzbewVar.zzd().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ujb) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            zzbeb zzbebVar = (zzbeb) entry.getKey();
            zzbfh zza = zzbfh.zza();
            if (zza.zzc().equals(zzbff.CONTINUE_AFTER)) {
                ujb zzd = zza.zzd();
                zzbewVar.zzd().put(zzbebVar, zzd);
                zzd.addListener(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbem
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbez.this.zzl(zzbeaVar, zzbewVar);
                    }
                }), this.zzd);
            }
            zzx(zza);
        }
        if (zzbewVar.zzd().isEmpty()) {
            zzB();
            zzC();
        }
    }

    private final void zzB() {
        while (true) {
            Deque deque = this.zzh;
            if (!deque.isEmpty() && ((zzbew) deque.peek()).zza()) {
                Object zzc = ((zzbew) deque.poll()).zzc();
                if (this.zzl.zzg() == 4) {
                    this.zzt.zzb(zzc);
                } else {
                    this.zzi.add(zzc);
                }
            } else {
                return;
            }
        }
    }

    private final void zzC() {
        if (this.zzq) {
            zzbew zzbewVar = (zzbew) this.zzh.peekLast();
            int zzg = this.zzl.zzg() - 1;
            if (zzg != 1) {
                if (zzg == 3 && zzbewVar == null) {
                    this.zzt.zzd();
                    return;
                }
                return;
            }
            if (zzbewVar == null || zzbewVar.zzb()) {
                zzw();
            }
        }
    }

    private final void zzt(zzcas zzcasVar) {
        final zzbdz zza = zzbdz.zza(this.zzb, this.zzj, zzcasVar, this.zza.zzb());
        jr9 jr9Var = (jr9) this.zzc.get(this.zzl.zze());
        int size = jr9Var.size();
        for (int i = 0; i < size; i++) {
            zzbeb zzbebVar = (zzbeb) jr9Var.get(i);
            zzbfh zza2 = zzbebVar.zza(zzv(zza));
            if (zza2.zzc().equals(zzbff.CONTINUE_AFTER)) {
                ujb zzd = zza2.zzd();
                this.zzf.put(zzbebVar, zzd);
                zzd.addListener(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbeh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbez.this.zzg(zza);
                    }
                }), this.zzd);
            }
            zzx(zza2);
            this.zzg.add(zzbebVar);
        }
        if (this.zzf.isEmpty()) {
            zzw();
        }
    }

    private final void zzu(final zzbdz zzbdzVar) {
        LinkedHashMap linkedHashMap = this.zzf;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((ujb) entry.getValue()).isDone()) {
                    break;
                }
                it.remove();
                zzbeb zzbebVar = (zzbeb) entry.getKey();
                zzbfh zzb = zzbebVar.zzb(zzv(zzbdzVar));
                if (zzb.zzc().equals(zzbff.CONTINUE_AFTER)) {
                    ujb zzd = zzb.zzd();
                    linkedHashMap.put(zzbebVar, zzd);
                    zzd.addListener(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbei
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbez.this.zzh(zzbdzVar);
                        }
                    }), this.zzd);
                }
                zzx(zzb);
            }
            if (linkedHashMap.isEmpty() && !this.zzs) {
                zzw();
            }
        }
    }

    private final zzbdz zzv(zzbdz zzbdzVar) {
        zzbxa zzbxaVar = this.zzj;
        if (zzbxaVar == zzbdzVar.zzc()) {
            return zzbdzVar;
        }
        return zzbdz.zza(this.zzb, zzbxaVar, zzbdzVar.zzb(), zzbdzVar.zzd());
    }

    private final void zzw() {
        zzbey zzc = this.zzl.zzc();
        this.zzl = zzc;
        int zzg = zzc.zzg() - 1;
        if (zzg != 0) {
            if (zzg != 2) {
                zzy();
                return;
            }
            zzbxf zza = this.zza.zza(this.zzb, this.zzj);
            this.zzt = zza;
            zza.zza(this.zzo, this.zzp);
            int i = this.zzk;
            if (i > 0) {
                this.zzt.zzc(i);
            }
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                this.zzt.zzb(it.next());
            }
            if (this.zzq && this.zzh.isEmpty()) {
                this.zzt.zzd();
            }
            zzw();
            return;
        }
        zzt(this.zzp);
    }

    private final boolean zzx(zzbfh zzbfhVar) {
        int ordinal = zzbfhVar.zzc().ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        this.zzl.zza();
                        return false;
                    }
                    dmk.n("Unrecognized outcome type: ".concat(String.valueOf(zzbfhVar.zzc())));
                    return false;
                }
                final ujb zzd = zzbfhVar.zzd();
                this.zze.add(zzd);
                zzd.addListener(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbej
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbez.this.zzi(zzd);
                    }
                }), this.zzd);
                return false;
            }
            throw null;
        }
        throw null;
    }

    private final void zzy() {
        int zzg = this.zzl.zzg() - 1;
        if (zzg != 1) {
            if (zzg == 3) {
                for (zzbew zzbewVar : this.zzh) {
                    zzz(zzbewVar, zzbewVar.zze(), this.zzl.zzd());
                }
                return;
            }
            return;
        }
        for (zzbew zzbewVar2 : this.zzh) {
            if (zzbewVar2.zze() <= this.zzl.zzf()) {
                zzz(zzbewVar2, zzbewVar2.zze(), this.zzl.zzf() + 1);
            }
        }
    }

    private final void zzz(final zzbew zzbewVar, int i, int i2) {
        final zzbea zza = zzbea.zza(zzbewVar.zzc());
        while (i < i2) {
            jr9 jr9Var = (jr9) this.zzc.get(i);
            int size = jr9Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                zzbeb zzbebVar = (zzbeb) jr9Var.get(i3);
                zzbfh zza2 = zzbfh.zza();
                if (zza2.zzc().equals(zzbff.CONTINUE_AFTER)) {
                    ujb zzd = zza2.zzd();
                    zzbewVar.zzd().put(zzbebVar, zzd);
                    zzd.addListener(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbel
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbez.this.zzk(zza, zzbewVar);
                        }
                    }), this.zzd);
                }
                zzx(zza2);
            }
            i++;
        }
        zzbewVar.zzf(i2);
        if (zzbewVar.zzd().isEmpty()) {
            zzB();
            zzC();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zza(zzbxe zzbxeVar, final zzcas zzcasVar) {
        jr9 jr9Var = this.zzc;
        Set set = this.zzg;
        Executor executor = this.zzd;
        this.zzo = new zzbev(this, new zzbfm(new zzbfb(zzbxeVar, jr9Var, set, executor)));
        this.zzp = zzcasVar;
        executor.execute(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbef
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbez.this.zzf(zzcasVar);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zzb(final Object obj) {
        this.zzd.execute(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbek
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbez.this.zzj(obj);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zzc(final int i) {
        synchronized (this.zzm) {
            this.zzn += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.zzm;
        synchronized (queue) {
            try {
                if (!queue.isEmpty()) {
                    int i2 = this.zzn;
                    for (int i3 = 0; i3 < i2; i3++) {
                        Object poll = queue.poll();
                        if (poll != null) {
                            arrayDeque.add(poll);
                            this.zzn--;
                        }
                    }
                    boolean isEmpty = queue.isEmpty();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        this.zzo.zzb(it.next());
                    }
                    if (isEmpty) {
                        this.zzo.zzc(zzccd.zza, null);
                    }
                }
            } finally {
            }
        }
        this.zzd.execute(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzben
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbez.this.zzm(i);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zzd() {
        this.zzd.execute(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbeo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbez.this.zzn();
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zze(final String str, final Throwable th) {
        this.zzd.execute(zzaas.zza(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbep
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbez.this.zzo(str, th);
            }
        }));
    }

    public final /* synthetic */ void zzf(zzcas zzcasVar) {
        zzt(zzcasVar);
    }

    public final /* synthetic */ void zzg(zzbdz zzbdzVar) {
        zzu(zzbdzVar);
    }

    public final /* synthetic */ void zzh(zzbdz zzbdzVar) {
        zzu(zzbdzVar);
    }

    public final /* synthetic */ void zzi(ujb ujbVar) {
        this.zze.remove(ujbVar);
    }

    public final /* synthetic */ void zzj(Object obj) {
        this.zzh.add(new zzbew(this, obj, null));
        zzy();
    }

    public final /* synthetic */ void zzk(zzbea zzbeaVar, zzbew zzbewVar) {
        zzA(zzbeaVar, zzbewVar);
    }

    public final /* synthetic */ void zzl(zzbea zzbeaVar, zzbew zzbewVar) {
        zzA(zzbeaVar, zzbewVar);
    }

    public final /* synthetic */ void zzm(int i) {
        if (!this.zzs) {
            if (this.zzl.zzg() == 4) {
                this.zzt.zzc(i);
            } else {
                this.zzk += i;
            }
        }
    }

    public final /* synthetic */ void zzn() {
        if (!this.zzs) {
            this.zzq = true;
            zzC();
        }
    }

    public final /* synthetic */ void zzo(String str, Throwable th) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((ujb) it.next()).cancel(true);
        }
        zzbxf zzbxfVar = this.zzt;
        if (zzbxfVar != null) {
            zzbxfVar.zze(str, th);
        }
    }

    public final /* synthetic */ void zzp(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.zzs = true;
            zzbxe zzbxeVar = this.zzo;
            if (zzbxeVar != null) {
                zzbxeVar.zzc(zzccd.zzb(th), new zzcas());
                if (this.zzt != null && this.zzl.zzg() == 4) {
                    this.zzt.zze(null, th);
                }
            }
        }
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzd;
    }

    public final /* synthetic */ zzbey zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzbex zzs() {
        return this.zzr;
    }
}
