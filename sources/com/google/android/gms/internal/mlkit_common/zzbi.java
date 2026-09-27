package com.google.android.gms.internal.mlkit_common;

import defpackage.dmk;
import defpackage.gy7;
import defpackage.o3k;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbi implements o3k {
    private boolean zza = false;
    private boolean zzb = false;
    private gy7 zzc;
    private final zzbe zzd;

    public zzbi(zzbe zzbeVar) {
        this.zzd = zzbeVar;
    }

    private final void zzb() {
        if (!this.zza) {
            this.zza = true;
        } else {
            dmk.z("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    public final o3k add(double d) {
        zzb();
        this.zzd.zza(this.zzc, d, this.zzb);
        return this;
    }

    public final void zza(gy7 gy7Var, boolean z) {
        this.zza = false;
        this.zzc = gy7Var;
        this.zzb = z;
    }

    public final o3k add(float f) {
        zzb();
        this.zzd.zzb(this.zzc, f, this.zzb);
        return this;
    }

    public final o3k add(int i) {
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    public final o3k add(long j) {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @Override // defpackage.o3k
    public final o3k add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // defpackage.o3k
    public final o3k add(boolean z) {
        zzb();
        this.zzd.zzd(this.zzc, z ? 1 : 0, this.zzb);
        return this;
    }

    public final o3k add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
