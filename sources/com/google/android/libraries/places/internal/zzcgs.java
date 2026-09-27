package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.Random;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcgs {
    private final Random zza = new Random();
    private final long zzb = Duration.ATTOSECONDS_PER_NANOSECOND;
    private final long zzc = 120000000000L;
    private long zzd = Duration.ATTOSECONDS_PER_NANOSECOND;

    public final long zza() {
        boolean z;
        long j = this.zzd;
        double d = j;
        this.zzd = Math.min((long) (1.6d * d), this.zzc);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        if (d2 >= d3) {
            z = true;
        } else {
            z = false;
        }
        brn.h(z);
        return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
    }
}
