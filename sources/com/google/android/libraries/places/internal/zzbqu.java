package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.dmk;
import defpackage.xbc;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzbqu {
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    int zzd = bd0.API_PRIORITY_OTHER;
    Object zze;

    private zzbqu() {
    }

    public static zzbqu zzH(InputStream inputStream, int i) {
        return new zzbqt(inputStream, 4096, null);
    }

    public static zzbqu zzI(byte[] bArr, int i, int i2) {
        return zzJ(bArr, 0, i2, false);
    }

    public static zzbqu zzJ(byte[] bArr, int i, int i2, boolean z) {
        zzbqs zzbqsVar = new zzbqs(bArr, 0, i2, z, null);
        try {
            zzbqsVar.zzB(i2);
            return zzbqsVar;
        } catch (zzbsm e) {
            xbc.s(e);
            return null;
        }
    }

    public static int zzO(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzP(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int zzB(int i);

    public abstract void zzC(int i);

    public abstract boolean zzD();

    public abstract int zzE();

    public final void zzK() {
        if (this.zza + this.zzb < this.zzc) {
            return;
        }
        dmk.A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void zzL() {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzM() {
        int zza;
        do {
            zza = zza();
            if (zza != 0) {
                zzK();
                this.zzb++;
                this.zzb--;
            } else {
                return;
            }
        } while (zzc(zza));
    }

    public final int zzN(int i) {
        int i2 = this.zzd;
        this.zzd = bd0.API_PRIORITY_OTHER;
        return i2;
    }

    public abstract int zza();

    public abstract void zzb(int i);

    public abstract boolean zzc(int i);

    public abstract double zzd();

    public abstract float zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract int zzj();

    public abstract boolean zzk();

    public abstract String zzl();

    public abstract String zzm();

    public abstract zzbqq zzn();

    public abstract int zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract long zzr();

    public abstract int zzs();

    public abstract long zzt();

    public /* synthetic */ zzbqu(byte[] bArr) {
    }
}
