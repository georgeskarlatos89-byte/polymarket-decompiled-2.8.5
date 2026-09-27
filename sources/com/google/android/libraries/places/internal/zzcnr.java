package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcnr {
    final int zza;
    final int zzb;
    final int zzc;
    final AtomicInteger zzd;

    public zzcnr(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.zza = i;
        this.zzb = i / 2;
        atomicInteger.set(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcnr)) {
            return false;
        }
        zzcnr zzcnrVar = (zzcnr) obj;
        if (this.zza == zzcnrVar.zza && this.zzc == zzcnrVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzc)});
    }

    public final boolean zza() {
        if (this.zzd.get() > this.zzb) {
            return true;
        }
        return false;
    }

    public final boolean zzb() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.zzd;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        if (i2 <= this.zzb) {
            return false;
        }
        return true;
    }
}
