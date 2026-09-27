package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcdo extends zzbxd {
    private final zzcdp zza;

    public zzcdo(zzcdp zzcdpVar, zzcot zzcotVar) {
        brn.m(zzcdpVar, "tracer");
        this.zza = zzcdpVar;
        brn.m(zzcotVar, "time");
    }

    public static void zzc(zzbzf zzbzfVar, int i, String str) {
        Level zzf = zzf(i);
        if (zzcdp.zza.isLoggable(zzf)) {
            zzcdp.zzc(zzbzfVar, zzf, str);
        }
    }

    public static void zzd(zzbzf zzbzfVar, int i, String str, Object... objArr) {
        Level zzf = zzf(2);
        if (zzcdp.zza.isLoggable(zzf)) {
            zzcdp.zzc(zzbzfVar, zzf, MessageFormat.format(str, objArr));
        }
    }

    private final boolean zze(int i) {
        if (i != 1) {
            this.zza.zzb();
            return false;
        }
        return false;
    }

    private static Level zzf(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    @Override // com.google.android.libraries.places.internal.zzbxd
    public final void zza(int i, String str) {
        zzc(this.zza.zzd(), i, str);
        zze(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbxd
    public final void zzb(int i, String str, Object... objArr) {
        String str2;
        Level zzf = zzf(i);
        zze(i);
        if (zzcdp.zza.isLoggable(zzf)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        zza(i, str2);
    }
}
