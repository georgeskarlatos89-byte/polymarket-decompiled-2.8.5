package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.concurrent.TimeUnit;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzchm implements zzcan {
    @Override // com.google.android.libraries.places.internal.zzcan
    public final /* bridge */ /* synthetic */ Object zza(String str) {
        boolean z;
        boolean z2 = true;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        brn.g("empty timeout", z);
        if (str.length() > 9) {
            z2 = false;
        }
        brn.g("bad timeout format", z2);
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt != 'H') {
            if (charAt != 'M') {
                if (charAt != 'S') {
                    if (charAt != 'u') {
                        if (charAt != 'm') {
                            if (charAt == 'n') {
                                return Long.valueOf(parseLong);
                            }
                            throw new IllegalArgumentException("Invalid timeout unit: " + charAt);
                        }
                        return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        long max = Math.max(1L, ((Long) obj).longValue());
        if (max < 100000000) {
            StringBuilder sb = new StringBuilder(String.valueOf(max).length() + 1);
            sb.append(max);
            sb.append("n");
            return sb.toString();
        }
        if (max < 100000000000L) {
            long j = max / 1000;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 1);
            sb2.append(j);
            sb2.append("u");
            return sb2.toString();
        }
        if (max < 100000000000000L) {
            long j2 = max / 1000000;
            StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 1);
            sb3.append(j2);
            sb3.append("m");
            return sb3.toString();
        }
        if (max < 100000000000000000L) {
            long j3 = max / Duration.ATTOSECONDS_PER_NANOSECOND;
            StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 1);
            sb4.append(j3);
            sb4.append("S");
            return sb4.toString();
        }
        if (max < 6000000000000000000L) {
            long j4 = max / 60000000000L;
            StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 1);
            sb5.append(j4);
            sb5.append("M");
            return sb5.toString();
        }
        long j5 = max / 3600000000000L;
        StringBuilder sb6 = new StringBuilder(String.valueOf(j5).length() + 1);
        sb6.append(j5);
        sb6.append("H");
        return sb6.toString();
    }
}
