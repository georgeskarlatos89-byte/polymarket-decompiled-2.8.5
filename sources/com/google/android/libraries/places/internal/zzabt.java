package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzact;
import defpackage.ix2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzabt<API extends zzact<API>> {
    private final zzadq zza;

    public zzabt(zzadq zzadqVar) {
        this.zza = zzadqVar;
    }

    private static void zzf(String str, zzado zzadoVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(zzadoVar.zzf() / 1000000)));
        sb.append(": logging error [");
        zzadp.zza(1, zzadoVar.zzg(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract zzact zza(Level level);

    public final zzact zzb() {
        return zza(Level.WARNING);
    }

    public final String zzc() {
        return this.zza.zza();
    }

    public final boolean zzd(Level level) {
        return this.zza.zzb(level);
    }

    public final void zze(zzado zzadoVar) {
        try {
            zzage zzc = zzage.zzc();
            try {
                if (zzc.zzb() <= 100) {
                    this.zza.zzc(zzadoVar);
                } else {
                    zzf("unbounded recursion in log statement", zzadoVar);
                }
                zzc.close();
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                this.zza.zzd(e, zzadoVar);
            } catch (zzadr e2) {
                throw e2;
            } catch (RuntimeException e3) {
                String name = e3.getClass().getName();
                String message = e3.getMessage();
                zzf(ix2.p(new StringBuilder(name.length() + 2 + String.valueOf(message).length()), name, ": ", message), zzadoVar);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
