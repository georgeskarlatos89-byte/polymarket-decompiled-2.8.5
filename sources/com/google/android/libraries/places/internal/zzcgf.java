package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzcgf implements zzcdx {
    private volatile boolean zzb;
    private zzcdz zzc;
    private zzcdx zzd;
    private zzccd zze;
    private zzcge zzg;
    private long zzh;
    private long zzi;
    private List zzf = new ArrayList();
    private List zzj = new ArrayList();
    private final String zza = "connecting_and_lb";

    public zzcgf(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzg() {
        zzcge zzcgeVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzf.isEmpty()) {
                    break;
                }
                list = this.zzf;
                this.zzf = arrayList;
            }
            if (zzcgeVar == null) {
                zzcgeVar.zze();
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.zzf = null;
        this.zzb = true;
        zzcgeVar = this.zzg;
        if (zzcgeVar == null) {
        }
    }

    private final void zzh(Runnable runnable) {
        boolean z;
        if (this.zzc != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called after start", z);
        synchronized (this) {
            try {
                if (!this.zzb) {
                    this.zzf.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzi(zzcdz zzcdzVar) {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzj = null;
        this.zzd.zzf(zzcdzVar);
    }

    private final void zzj(zzcdx zzcdxVar) {
        boolean z;
        zzcdx zzcdxVar2 = this.zzd;
        if (zzcdxVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        brn.q(zzcdxVar2, "realStream already set to %s", z);
        this.zzd = zzcdxVar;
        this.zzi = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final void zza(zzbyd zzbydVar) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called before start", z);
        this.zzj.add(new zzcfu(this, zzbydVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final zzbww zzam() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final void zzb(int i) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called before start", z);
        this.zzj.add(new zzcft(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final void zzc(int i) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called before start", z);
        this.zzj.add(new zzcfs(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final void zzd(zzbyg zzbygVar) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called before start", z);
        brn.m(zzbygVar, "decompressorRegistry");
        this.zzj.add(new zzcfr(this, zzbygVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final void zzf(zzcdz zzcdzVar) {
        boolean z;
        zzccd zzccdVar;
        boolean z2;
        brn.m(zzcdzVar, "listener");
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("already started", z);
        synchronized (this) {
            try {
                zzccdVar = this.zze;
                z2 = this.zzb;
                if (!z2) {
                    zzcge zzcgeVar = new zzcge(zzcdzVar);
                    this.zzg = zzcgeVar;
                    zzcdzVar = zzcgeVar;
                }
                this.zzc = zzcdzVar;
                this.zzh = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzccdVar != null) {
            zzcdzVar.zzc(zzccdVar, zzcdy.PROCESSED, new zzcas());
        } else if (z2) {
            zzi(zzcdzVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public final void zzk() {
        boolean z;
        if (this.zzc != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called after start", z);
        zzh(new zzcfz(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public void zzl(zzccd zzccdVar) {
        boolean z;
        boolean z2 = false;
        if (this.zzc != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called after start", z);
        brn.m(zzccdVar, "reason");
        synchronized (this) {
            try {
                if (this.zzd == null) {
                    zzj(zzclb.zza);
                    this.zze = zzccdVar;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            zzh(new zzcfy(this, zzccdVar));
            return;
        }
        zzg();
        zze(zzccdVar);
        this.zzc.zzc(zzccdVar, zzcdy.PROCESSED, new zzcas());
    }

    @Override // com.google.android.libraries.places.internal.zzcop
    public final boolean zzm() {
        if (this.zzb) {
            return this.zzd.zzm();
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzcdx
    public void zzn(zzcht zzchtVar) {
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    return;
                }
                zzcdx zzcdxVar = this.zzd;
                String str = this.zza;
                if (zzcdxVar != null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
                    sb.append(str);
                    sb.append("_delay");
                    String sb2 = sb.toString();
                    long j = this.zzi - this.zzh;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 2);
                    sb3.append(j);
                    sb3.append("ns");
                    zzchtVar.zzb(sb2, sb3.toString());
                    this.zzd.zzn(zzchtVar);
                } else {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 6);
                    sb4.append(str);
                    sb4.append("_delay");
                    String sb5 = sb4.toString();
                    long nanoTime = System.nanoTime() - this.zzh;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(nanoTime).length() + 2);
                    sb6.append(nanoTime);
                    sb6.append("ns");
                    zzchtVar.zzb(sb5, sb6.toString());
                    zzchtVar.zza("was_still_waiting");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Runnable zzo(zzcdx zzcdxVar) {
        synchronized (this) {
            try {
                if (this.zzd != null) {
                    return null;
                }
                brn.m(zzcdxVar, "stream");
                zzj(zzcdxVar);
                zzcdz zzcdzVar = this.zzc;
                if (zzcdzVar == null) {
                    this.zzf = null;
                    this.zzb = true;
                }
                if (zzcdzVar == null) {
                    return null;
                }
                zzi(zzcdzVar);
                return new zzcfv(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzp() {
        zzg();
    }

    public final /* synthetic */ zzcdx zzq() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzcop
    public final void zzr() {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called before start", z);
        this.zzj.add(new zzcfp(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcop
    public final void zzs(int i) {
        boolean z;
        if (this.zzc != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called after start", z);
        if (this.zzb) {
            this.zzd.zzs(i);
        } else {
            zzh(new zzcfo(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcop
    public final void zzt(InputStream inputStream) {
        boolean z;
        if (this.zzc != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called after start", z);
        brn.m(inputStream, "message");
        if (this.zzb) {
            this.zzd.zzt(inputStream);
        } else {
            zzh(new zzcfw(this, inputStream));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcop
    public final void zzu() {
        boolean z;
        if (this.zzc != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called after start", z);
        if (this.zzb) {
            this.zzd.zzu();
        } else {
            zzh(new zzcfx(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcop
    public final void zzv(zzbxr zzbxrVar) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("May only be called before start", z);
        brn.m(zzbxrVar, "compressor");
        this.zzj.add(new zzcfq(this, zzbxrVar));
    }

    public void zze(zzccd zzccdVar) {
    }
}
