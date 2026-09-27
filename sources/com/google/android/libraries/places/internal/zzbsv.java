package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbsv {
    public static final boolean zza(Object obj) {
        if (!((zzbsu) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzbsu zzbsuVar = (zzbsu) obj;
        zzbsu zzbsuVar2 = (zzbsu) obj2;
        if (!zzbsuVar2.isEmpty()) {
            if (!zzbsuVar.zze()) {
                zzbsuVar = zzbsuVar.zzc();
            }
            zzbsuVar.zzb(zzbsuVar2);
        }
        return zzbsuVar;
    }
}
