package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzif {
    public abstract zzif zza(String str);

    public abstract zzif zzb(zzdg zzdgVar);

    public abstract zzif zzc(Integer num);

    public abstract zzif zzd(String str);

    public abstract zzif zze(String str);

    public abstract zzif zzf(String str);

    public abstract zzif zzg(String str);

    public abstract zzif zzh(String str);

    public abstract zzif zzi(String str);

    public abstract zzif zzj(String str);

    public abstract zzif zzk(String str);

    public abstract zzif zzl(LocalDate localDate);

    public abstract zzig zzm();

    public final zzig zzn() {
        zzig zzm = zzm();
        Integer zzc = zzm.zzc();
        if (zzc != null) {
            if (zzc.intValue() <= 0 || zzc.intValue() > 5) {
                dmk.v("Rating must be between 1 and 5.");
                return null;
            }
            return zzm;
        }
        return zzm;
    }
}
