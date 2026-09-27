package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcsa {
    private int zza;
    private final int[] zzb = new int[10];

    public final zzcsa zza(int i, int i2, int i3) {
        if (i >= 10) {
            return this;
        }
        this.zza = (1 << i) | this.zza;
        this.zzb[i] = i3;
        return this;
    }

    public final boolean zzb(int i) {
        if ((this.zza & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    public final int zzd() {
        return Integer.bitCount(this.zza);
    }

    public final int zze() {
        if ((this.zza & 2) != 0) {
            return this.zzb[1];
        }
        return -1;
    }

    public final int zzf(int i) {
        if ((this.zza & 32) != 0) {
            return this.zzb[5];
        }
        return i;
    }
}
