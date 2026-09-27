package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzbra extends zzbqi {
    Object zza;

    public /* synthetic */ zzbra(byte[] bArr) {
    }

    public static zzbra zzE(byte[] bArr, int i, int i2) {
        return new zzbqw(bArr, i, i2, null);
    }

    public static int zzF(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzG(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzH(zzbsz zzbszVar) {
        int zzbE = zzbszVar.zzbE();
        return zzF(zzbE) + zzbE;
    }

    public final void zzI() {
        if (zzy() <= 0) {
            if (zzy() >= 0) {
                return;
            }
            dmk.n("Wrote more data than expected.");
            return;
        }
        dmk.n("Did not write as much data as expected.");
    }

    public abstract void zzb(int i, int i2);

    public abstract void zzc(int i, int i2);

    public abstract void zzd(int i, int i2);

    public abstract void zze(int i, int i2);

    public abstract void zzf(int i, long j);

    public abstract void zzg(int i, long j);

    public abstract void zzh(int i, boolean z);

    public abstract void zzi(int i, String str);

    public abstract void zzj(int i, zzbqq zzbqqVar);

    public abstract void zzk(zzbqq zzbqqVar);

    public abstract void zzl(byte[] bArr, int i, int i2);

    public abstract void zzm(int i, zzbsz zzbszVar);

    public abstract void zzn(int i, zzbqq zzbqqVar);

    public abstract void zzo(zzbsz zzbszVar);

    public abstract void zzp(byte b);

    public abstract void zzq(int i);

    public abstract void zzr(int i);

    public abstract void zzs(int i);

    public abstract void zzt(long j);

    public abstract void zzu(long j);

    public abstract void zzw(String str);

    public abstract void zzx();

    public abstract int zzy();

    private zzbra() {
        throw null;
    }
}
