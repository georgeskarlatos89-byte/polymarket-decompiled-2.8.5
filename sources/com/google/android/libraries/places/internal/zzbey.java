package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbey {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private boolean zzd = false;
    private final int zze;

    private zzbey(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zze = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    public static zzbey zzb(int i) {
        return new zzbey(i, 1, 0, 0);
    }

    public final void zza() {
        this.zzd = true;
    }

    public final zzbey zzc() {
        boolean z;
        int i = this.zze;
        int i2 = 1;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        brn.r("UNDERLYING_CALL_STARTED state is terminal, cannot transition", !z);
        if (i == 3) {
            return new zzbey(this.zza, 4, this.zzb, this.zzc);
        }
        if (i == 1 && this.zzd) {
            int i3 = this.zza;
            int i4 = this.zzb;
            return new zzbey(i3, 2, i4, i4);
        }
        int i5 = this.zzb;
        int i6 = i5 + 1;
        int i7 = this.zza;
        if (i6 >= i7) {
            i2 = 3;
        }
        int i8 = this.zzc;
        if (i6 < i7) {
            i5 = i6;
        }
        return new zzbey(i7, i2, i5, i8);
    }

    public final /* synthetic */ int zzd() {
        return this.zza;
    }

    public final /* synthetic */ int zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ int zzg() {
        return this.zze;
    }
}
