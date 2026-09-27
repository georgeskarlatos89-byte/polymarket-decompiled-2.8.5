package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbqf {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzbrh zzd;
    public int zze;

    public zzbqf() {
        int i = zzbrh.zzb;
        int i2 = zzbqe.zza;
        this.zzd = zzbrh.zza;
    }

    public static /* synthetic */ String zza(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public zzbqf(zzbrh zzbrhVar) {
        zzbrhVar.getClass();
        this.zzd = zzbrhVar;
    }
}
