package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.brn;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcdk extends zzcha {
    private final zzcem zza;
    private final AtomicInteger zzb;
    private volatile zzccd zzc;
    private zzccd zzd;

    public zzcdk(zzcdl zzcdlVar, zzcem zzcemVar, String str) {
        Objects.requireNonNull(zzcdlVar);
        this.zzb = new AtomicInteger(-2147483647);
        brn.m(zzcemVar, "delegate");
        this.zza = zzcemVar;
        brn.m(str, "authority");
    }

    @Override // com.google.android.libraries.places.internal.zzcha
    public final zzcem zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzcha, com.google.android.libraries.places.internal.zzcea
    public final zzcdx zzb(zzcax zzcaxVar, zzcas zzcasVar, zzbxa zzbxaVar, zzbxm[] zzbxmVarArr) {
        if (this.zzb.get() >= 0) {
            return new zzcgt(this.zzc, zzcdy.PROCESSED, zzbxmVarArr);
        }
        return this.zza.zzb(zzcaxVar, zzcasVar, zzbxaVar, zzbxmVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzcha, com.google.android.libraries.places.internal.zzckr
    public final void zzd(zzccd zzccdVar) {
        brn.m(zzccdVar, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.zzb;
                if (atomicInteger.get() < 0) {
                    this.zzc = zzccdVar;
                    atomicInteger.addAndGet(bd0.API_PRIORITY_OTHER);
                    if (atomicInteger.get() != 0) {
                        return;
                    }
                    super.zzd(zzccdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcha, com.google.android.libraries.places.internal.zzckr
    public final void zze(zzccd zzccdVar) {
        brn.m(zzccdVar, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.zzb;
                if (atomicInteger.get() < 0) {
                    this.zzc = zzccdVar;
                    atomicInteger.addAndGet(bd0.API_PRIORITY_OTHER);
                } else if (this.zzd != null) {
                    return;
                }
                if (atomicInteger.get() != 0) {
                    this.zzd = zzccdVar;
                } else {
                    super.zze(zzccdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
