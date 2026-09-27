package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzacn implements zzaco {
    public static final zzacn zza = new zzacl();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(zza());
        sb.append(", method=");
        sb.append(zzb());
        sb.append(", line=");
        sb.append(zzc());
        if (zzd() != null) {
            sb.append(", file=");
            sb.append(zzd());
        }
        if (zze() != null) {
            sb.append(", filePath=");
            sb.append(zze());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract String zza();

    public abstract String zzb();

    public abstract int zzc();

    public abstract String zzd();

    public String zze() {
        return null;
    }
}
