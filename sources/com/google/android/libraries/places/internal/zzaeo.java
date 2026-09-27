package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzaeo {
    private static String zza = "com.google.android.libraries.places.internal.zzaeu";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.libraries.places.internal.zzaeu", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzage.zza();
    }

    public static zzaen zzb() {
        return zzaem.zza().zzc();
    }

    public static zzadq zzd(String str) {
        return zzaem.zza().zze(str);
    }

    public static zzafe zzf() {
        return zzaem.zza().zzg();
    }

    public static boolean zzh(String str, Level level, boolean z) {
        zzf().zzb(str, level, z);
        return false;
    }

    public static zzafp zzi() {
        return zzf().zzc();
    }

    public static zzadu zzj() {
        return zzf().zzd();
    }

    public static long zzk() {
        return zzaem.zza().zzl();
    }

    public static String zzm() {
        return zzaem.zza().zzn();
    }

    public static /* synthetic */ String[] zzo() {
        return zzd;
    }

    public abstract zzaen zzc();

    public abstract zzadq zze(String str);

    public zzafe zzg() {
        return zzafe.zze();
    }

    public long zzl() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract String zzn();
}
