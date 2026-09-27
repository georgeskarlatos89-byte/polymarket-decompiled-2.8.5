package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.ix2;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbur {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb;

    static {
        zzbtv zzf = zzbtw.zzf();
        zzf.zza(-62135596800L);
        zzf.zzb(0);
        zzbtv zzf2 = zzbtw.zzf();
        zzf2.zza(253402300799L);
        zzf2.zzb(999999999);
        zzbtv zzf3 = zzbtw.zzf();
        zzf3.zza(0L);
        zzf3.zzb(0);
        zzb = new zzbuq();
        zzb("now");
        zzb("getEpochSecond");
        zzb("getNano");
    }

    public static String zza(zzbtw zzbtwVar) {
        String format;
        long zzc = zzbtwVar.zzc();
        int zze = zzbtwVar.zze();
        if (zzc >= -62135596800L && zzc <= 253402300799L && zze >= 0 && zze < 1000000000) {
            long zzc2 = zzbtwVar.zzc();
            int zze2 = zzbtwVar.zze();
            StringBuilder sb = new StringBuilder();
            sb.append(((SimpleDateFormat) zzb.get()).format(new Date(zzc2 * 1000)));
            if (zze2 != 0) {
                sb.append(".");
                if (zze2 % 1000000 == 0) {
                    format = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zze2 / 1000000));
                } else if (zze2 % 1000 == 0) {
                    format = String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zze2 / 1000));
                } else {
                    format = String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zze2));
                }
                sb.append(format);
            }
            sb.append("Z");
            return sb.toString();
        }
        int length = String.valueOf(zzc).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zze).length() + length + 135 + 37);
        ix2.A(sb2, "Timestamp is not valid. See proto definition for valid values. Seconds (", zzc, ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (");
        dmk.v(ix2.i(zze, ") must be in range [0, +999,999,999].", sb2));
        return null;
    }

    private static Method zzb(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
