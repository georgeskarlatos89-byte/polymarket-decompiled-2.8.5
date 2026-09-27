package com.google.android.libraries.places.internal;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaej extends zzael {
    private final zzadu zza;
    private final zzadu zzb;
    private final int[] zzc;
    private final int zzd;

    public /* synthetic */ zzaej(zzadu zzaduVar, zzadu zzaduVar2, byte[] bArr) {
        super(null);
        boolean z;
        int i;
        this.zza = zzaduVar;
        this.zzb = zzaduVar2;
        int zza = zzaduVar2.zza();
        if (zza <= 28) {
            z = true;
        } else {
            z = false;
        }
        zzagc.zzb(z, "metadata size too large");
        int[] iArr = new int[zza];
        this.zzc = iArr;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            zzacw zzi = zzi(i2);
            long zzi2 = zzi.zzi() | j;
            if (zzi2 == j) {
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (zzi.equals(zzi(iArr[i4] & 31))) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    if (zzi.zzf()) {
                        i = iArr[i4] | (1 << (i2 + 4));
                    } else {
                        i = i2;
                    }
                    iArr[i4] = i;
                    i2++;
                    j = zzi2;
                }
            }
            iArr[i3] = i2;
            i3++;
            i2++;
            j = zzi2;
        }
        this.zzd = i3;
    }

    private final zzacw zzi(int i) {
        zzadu zzaduVar = this.zza;
        int zza = zzaduVar.zza();
        if (i >= zza) {
            return this.zzb.zzb(i - zza);
        }
        return zzaduVar.zzb(i);
    }

    private final Object zzj(int i) {
        zzadu zzaduVar = this.zza;
        int zza = zzaduVar.zza();
        if (i >= zza) {
            return this.zzb.zzc(i - zza);
        }
        return zzaduVar.zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzael
    public final void zza(zzaeb zzaebVar, Object obj) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            zzacw zzi = zzi(i2 & 31);
            if (!zzi.zzf()) {
                zzaebVar.zza(zzi, zzi.zze(zzj(i2)), obj);
            } else {
                zzaebVar.zzb(zzi, new zzaei(this, zzi, i2, null), obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzael
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzael
    public final Set zzc() {
        return new zzaeh(this);
    }

    public final /* synthetic */ zzacw zzd(int i) {
        return zzi(i);
    }

    public final /* synthetic */ Object zze(int i) {
        return zzj(i);
    }

    public final /* synthetic */ int[] zzf() {
        return this.zzc;
    }

    public final /* synthetic */ int zzg() {
        return this.zzd;
    }
}
