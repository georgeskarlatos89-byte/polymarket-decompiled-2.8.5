package com.google.android.libraries.places.internal;

import android.os.Trace;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaak {
    public static void zza(zzaal zzaalVar) {
        zzc(zzaalVar);
        Trace.beginSection(zzaalVar.zzd());
        String zze = zzaalVar.zze();
        int i = zzzx.zzb;
        if (zze.length() > 127) {
            zze = zze.substring(0, 127);
        }
        Trace.beginSection(zze);
    }

    public static void zzb(zzaal zzaalVar) {
        zzc(zzaalVar);
        Trace.endSection();
        Trace.endSection();
    }

    private static boolean zzc(zzaal zzaalVar) {
        if (zzaalVar.zza() != Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
