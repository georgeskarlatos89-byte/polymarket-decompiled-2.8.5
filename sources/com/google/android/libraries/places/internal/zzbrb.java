package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbrb {
    private final zzbra zza;

    private zzbrb(zzbra zzbraVar) {
        this.zza = zzbraVar;
        zzbraVar.zza = this;
    }

    public static zzbrb zza(zzbra zzbraVar) {
        Object obj = zzbraVar.zza;
        if (obj != null) {
            return (zzbrb) obj;
        }
        return new zzbrb(zzbraVar);
    }

    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbsr) {
            zzbsr zzbsrVar = (zzbsr) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbsrVar.size(); i4++) {
                    zzbsrVar.zze(i4);
                    i3 += 8;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbsrVar.size()) {
                    zzbraVar.zzu(zzbsrVar.zze(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbsrVar.size()) {
                this.zza.zzg(i, zzbsrVar.zze(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).getClass();
                i5 += 8;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzg(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzB(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbro) {
            zzbro zzbroVar = (zzbro) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbroVar.size(); i4++) {
                    zzbroVar.zze(i4);
                    i3 += 4;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbroVar.size()) {
                    zzbraVar.zzs(Float.floatToRawIntBits(zzbroVar.zze(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzbroVar.size()) {
                this.zza.zze(i, Float.floatToRawIntBits(zzbroVar.zze(i2)));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Float) list.get(i6)).getClass();
                i5 += 4;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrc) {
            zzbrc zzbrcVar = (zzbrc) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrcVar.size(); i4++) {
                    zzbrcVar.zze(i4);
                    i3 += 8;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrcVar.size()) {
                    zzbraVar.zzu(Double.doubleToRawLongBits(zzbrcVar.zze(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrcVar.size()) {
                this.zza.zzg(i, Double.doubleToRawLongBits(zzbrcVar.zze(i2)));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Double) list.get(i6)).getClass();
                i5 += 8;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzg(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void zzD(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrx) {
            zzbrx zzbrxVar = (zzbrx) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrxVar.size(); i4++) {
                    i3 += zzbra.zzG(zzbrxVar.zzf(i4));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrxVar.size()) {
                    zzbraVar.zzq(zzbrxVar.zzf(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrxVar.size()) {
                this.zza.zzc(i, zzbrxVar.zzf(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzbra.zzG(((Integer) list.get(i6)).intValue());
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzE(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbqh) {
            zzbqh zzbqhVar = (zzbqh) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbqhVar.size(); i4++) {
                    zzbqhVar.zze(i4);
                    i3++;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbqhVar.size()) {
                    zzbraVar.zzp(zzbqhVar.zze(i2) ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < zzbqhVar.size()) {
                this.zza.zzh(i, zzbqhVar.zze(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Boolean) list.get(i6)).getClass();
                i5++;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zzF(int i, List list) {
        int i2 = 0;
        if (list instanceof zzbso) {
            zzbso zzbsoVar = (zzbso) list;
            while (i2 < list.size()) {
                Object zzc = zzbsoVar.zzc();
                boolean z = zzc instanceof String;
                zzbra zzbraVar = this.zza;
                if (z) {
                    zzbraVar.zzi(i, (String) zzc);
                } else {
                    zzbraVar.zzj(i, (zzbqq) zzc);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzi(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzG(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzj(i, (zzbqq) list.get(i2));
        }
    }

    public final void zzH(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrx) {
            zzbrx zzbrxVar = (zzbrx) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrxVar.size(); i4++) {
                    i3 += zzbra.zzF(zzbrxVar.zzf(i4));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrxVar.size()) {
                    zzbraVar.zzr(zzbrxVar.zzf(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrxVar.size()) {
                this.zza.zzd(i, zzbrxVar.zzf(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzbra.zzF(((Integer) list.get(i6)).intValue());
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzI(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrx) {
            zzbrx zzbrxVar = (zzbrx) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrxVar.size(); i4++) {
                    zzbrxVar.zzf(i4);
                    i3 += 4;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrxVar.size()) {
                    zzbraVar.zzs(zzbrxVar.zzf(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrxVar.size()) {
                this.zza.zze(i, zzbrxVar.zzf(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbsr) {
            zzbsr zzbsrVar = (zzbsr) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbsrVar.size(); i4++) {
                    zzbsrVar.zze(i4);
                    i3 += 8;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbsrVar.size()) {
                    zzbraVar.zzu(zzbsrVar.zze(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbsrVar.size()) {
                this.zza.zzg(i, zzbsrVar.zze(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).getClass();
                i5 += 8;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzg(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzK(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrx) {
            zzbrx zzbrxVar = (zzbrx) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrxVar.size(); i4++) {
                    int zzf = zzbrxVar.zzf(i4);
                    i3 += zzbra.zzF((zzf >> 31) ^ (zzf + zzf));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrxVar.size()) {
                    int zzf2 = zzbrxVar.zzf(i2);
                    zzbraVar.zzr((zzf2 >> 31) ^ (zzf2 + zzf2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrxVar.size()) {
                zzbra zzbraVar2 = this.zza;
                int zzf3 = zzbrxVar.zzf(i2);
                zzbraVar2.zzd(i, (zzf3 >> 31) ^ (zzf3 + zzf3));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar3 = this.zza;
            zzbraVar3.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                i5 += zzbra.zzF((intValue >> 31) ^ (intValue + intValue));
            }
            zzbraVar3.zzr(i5);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzbraVar3.zzr((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzbra zzbraVar4 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzbraVar4.zzd(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void zzL(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbsr) {
            zzbsr zzbsrVar = (zzbsr) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbsrVar.size(); i4++) {
                    long zze = zzbsrVar.zze(i4);
                    i3 += zzbra.zzG((zze >> 63) ^ (zze + zze));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbsrVar.size()) {
                    long zze2 = zzbsrVar.zze(i2);
                    zzbraVar.zzt((zze2 >> 63) ^ (zze2 + zze2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbsrVar.size()) {
                zzbra zzbraVar2 = this.zza;
                long zze3 = zzbsrVar.zze(i2);
                zzbraVar2.zzf(i, (zze3 >> 63) ^ (zze3 + zze3));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar3 = this.zza;
            zzbraVar3.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long longValue = ((Long) list.get(i6)).longValue();
                i5 += zzbra.zzG((longValue >> 63) ^ (longValue + longValue));
            }
            zzbraVar3.zzr(i5);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzbraVar3.zzt((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzbra zzbraVar4 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzbraVar4.zzf(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public final void zzM(int i, zzbss zzbssVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzbra zzbraVar = this.zza;
            zzbraVar.zzb(i, 2);
            zzbraVar.zzr(zzbst.zzc(zzbssVar, entry.getKey(), entry.getValue()));
            zzbst.zzb(zzbraVar, zzbssVar, entry.getKey(), entry.getValue());
        }
    }

    public final void zzb(int i, int i2) {
        this.zza.zze(i, i2);
    }

    public final void zzc(int i, long j) {
        this.zza.zzf(i, j);
    }

    public final void zzd(int i, long j) {
        this.zza.zzg(i, j);
    }

    public final void zze(int i, float f) {
        this.zza.zze(i, Float.floatToRawIntBits(f));
    }

    public final void zzf(int i, double d) {
        this.zza.zzg(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, int i2) {
        this.zza.zzc(i, i2);
    }

    public final void zzh(int i, long j) {
        this.zza.zzf(i, j);
    }

    public final void zzi(int i, int i2) {
        this.zza.zzc(i, i2);
    }

    public final void zzj(int i, long j) {
        this.zza.zzg(i, j);
    }

    public final void zzk(int i, int i2) {
        this.zza.zze(i, i2);
    }

    public final void zzl(int i, boolean z) {
        this.zza.zzh(i, z);
    }

    public final void zzm(int i, String str) {
        this.zza.zzi(i, str);
    }

    public final void zzn(int i, zzbqq zzbqqVar) {
        this.zza.zzj(i, zzbqqVar);
    }

    public final void zzo(int i, int i2) {
        this.zza.zzd(i, i2);
    }

    public final void zzp(int i, int i2) {
        zzbra zzbraVar = this.zza;
        zzbraVar.zzd(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzq(int i, long j) {
        zzbra zzbraVar = this.zza;
        zzbraVar.zzf(i, (j >> 63) ^ (j + j));
    }

    public final void zzr(int i, Object obj, zzbtm zzbtmVar) {
        zzbra zzbraVar = this.zza;
        zzbqa zzbqaVar = (zzbqa) obj;
        zzbraVar.zzb(i, 2);
        zzbraVar.zzr(zzbqaVar.zzbu(zzbtmVar));
        zzbtmVar.zzf(zzbqaVar, this);
    }

    public final void zzs(int i, Object obj, zzbtm zzbtmVar) {
        zzbra zzbraVar = this.zza;
        zzbraVar.zzb(i, 3);
        zzbtmVar.zzf((zzbqa) obj, this);
        zzbraVar.zzb(i, 4);
    }

    @Deprecated
    public final void zzt(int i) {
        this.zza.zzb(i, 3);
    }

    @Deprecated
    public final void zzu(int i) {
        this.zza.zzb(i, 4);
    }

    public final void zzv(int i, Object obj) {
        boolean z = obj instanceof zzbqq;
        zzbra zzbraVar = this.zza;
        if (z) {
            zzbraVar.zzn(i, (zzbqq) obj);
        } else {
            zzbraVar.zzm(i, (zzbsz) obj);
        }
    }

    public final void zzw(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrx) {
            zzbrx zzbrxVar = (zzbrx) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrxVar.size(); i4++) {
                    i3 += zzbra.zzG(zzbrxVar.zzf(i4));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrxVar.size()) {
                    zzbraVar.zzq(zzbrxVar.zzf(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrxVar.size()) {
                this.zza.zzc(i, zzbrxVar.zzf(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzbra.zzG(((Integer) list.get(i6)).intValue());
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzx(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbrx) {
            zzbrx zzbrxVar = (zzbrx) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbrxVar.size(); i4++) {
                    zzbrxVar.zzf(i4);
                    i3 += 4;
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbrxVar.size()) {
                    zzbraVar.zzs(zzbrxVar.zzf(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbrxVar.size()) {
                this.zza.zze(i, zzbrxVar.zzf(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbsr) {
            zzbsr zzbsrVar = (zzbsr) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbsrVar.size(); i4++) {
                    i3 += zzbra.zzG(zzbsrVar.zze(i4));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbsrVar.size()) {
                    zzbraVar.zzt(zzbsrVar.zze(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbsrVar.size()) {
                this.zza.zzf(i, zzbsrVar.zze(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzbra.zzG(((Long) list.get(i6)).longValue());
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzz(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zzbsr) {
            zzbsr zzbsrVar = (zzbsr) list;
            if (z) {
                zzbra zzbraVar = this.zza;
                zzbraVar.zzb(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzbsrVar.size(); i4++) {
                    i3 += zzbra.zzG(zzbsrVar.zze(i4));
                }
                zzbraVar.zzr(i3);
                while (i2 < zzbsrVar.size()) {
                    zzbraVar.zzt(zzbsrVar.zze(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzbsrVar.size()) {
                this.zza.zzf(i, zzbsrVar.zze(i2));
                i2++;
            }
            return;
        }
        if (z) {
            zzbra zzbraVar2 = this.zza;
            zzbraVar2.zzb(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzbra.zzG(((Long) list.get(i6)).longValue());
            }
            zzbraVar2.zzr(i5);
            while (i2 < list.size()) {
                zzbraVar2.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
