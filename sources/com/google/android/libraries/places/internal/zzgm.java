package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzgm {
    private final String zza;

    private zzgm(String str) {
        this.zza = str;
    }

    public static zzgm zza(String str) {
        str.getClass();
        return new zzgm(str);
    }

    public static zzgm zzb(zzgm zzgmVar, zzgm zzgmVar2) {
        return new zzgm(String.valueOf(zzgmVar.zza).concat(String.valueOf(zzgmVar2.zza)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgm) {
            return this.zza.equals(((zzgm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
