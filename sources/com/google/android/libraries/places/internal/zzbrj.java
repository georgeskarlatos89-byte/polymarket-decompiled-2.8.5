package com.google.android.libraries.places.internal;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbrj extends zzbri {
    @Override // com.google.android.libraries.places.internal.zzbri
    public final void zza(zzbrb zzbrbVar, Map.Entry entry) {
        zzbru zzbruVar = (zzbru) entry.getKey();
        zzbul zzbulVar = zzbul.zza;
        switch (zzbruVar.zzb.ordinal()) {
            case 0:
                zzbrbVar.zzf(525004180, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzbrbVar.zze(525004180, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzbrbVar.zzc(525004180, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzbrbVar.zzh(525004180, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzbrbVar.zzi(525004180, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzbrbVar.zzj(525004180, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzbrbVar.zzk(525004180, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzbrbVar.zzl(525004180, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzbrbVar.zzm(525004180, (String) entry.getValue());
                return;
            case 9:
                zzbrbVar.zzs(525004180, entry.getValue(), zzbtj.zza().zzb(((zzbrw) entry.getValue()).getClass()));
                return;
            case 10:
                zzbrbVar.zzr(525004180, entry.getValue(), zzbtj.zza().zzb(((zzbrw) entry.getValue()).getClass()));
                return;
            case 11:
                zzbrbVar.zzn(525004180, (zzbqq) entry.getValue());
                return;
            case 12:
                zzbrbVar.zzo(525004180, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzbrbVar.zzi(525004180, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzbrbVar.zzb(525004180, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzbrbVar.zzd(525004180, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzbrbVar.zzp(525004180, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzbrbVar.zzq(525004180, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbri
    public final void zzb(zzbqv zzbqvVar, Object obj, zzbrh zzbrhVar, zzbrm zzbrmVar) {
        zzbrv zzbrvVar = (zzbrv) obj;
        zzbrmVar.zzf(zzbrvVar.zzb, zzbqvVar.zzo(zzbrvVar.zza.getClass(), zzbrhVar));
    }
}
