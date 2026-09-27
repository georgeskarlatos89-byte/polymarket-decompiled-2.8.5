package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.sv6;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcdp {
    static final Logger zza = Logger.getLogger(zzbxd.class.getName());
    private final Object zzb = new Object();
    private final zzbzf zzc;

    public zzcdp(zzbzf zzbzfVar, int i, long j, String str) {
        brn.m(str, "description");
        brn.m(zzbzfVar, "logId");
        this.zzc = zzbzfVar;
        zzbys zzbysVar = new zzbys();
        zzbysVar.zza(str.concat(" created"));
        zzbysVar.zzc(zzbyt.CT_INFO);
        zzbysVar.zzb(j);
        zza(zzbysVar.zze());
    }

    public static void zzc(zzbzf zzbzfVar, Level level, String str) {
        Logger logger = zza;
        if (logger.isLoggable(level)) {
            String valueOf = String.valueOf(zzbzfVar);
            LogRecord logRecord = new LogRecord(level, sv6.p(new StringBuilder(valueOf.length() + 3 + String.valueOf(str).length()), "[", valueOf, "] ", str));
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void zza(zzbyu zzbyuVar) {
        Level level;
        int ordinal = zzbyuVar.zzb.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                level = Level.FINEST;
            } else {
                level = Level.FINE;
            }
        } else {
            level = Level.FINER;
        }
        synchronized (this.zzb) {
        }
        zzc(this.zzc, level, zzbyuVar.zza);
    }

    public final boolean zzb() {
        synchronized (this.zzb) {
        }
        return false;
    }

    public final zzbzf zzd() {
        return this.zzc;
    }
}
