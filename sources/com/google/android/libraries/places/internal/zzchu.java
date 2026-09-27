package com.google.android.libraries.places.internal;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzchu implements zzcot {
    @Override // com.google.android.libraries.places.internal.zzcot
    public final long zza() {
        boolean z;
        Instant now = Instant.now();
        long nanos = TimeUnit.SECONDS.toNanos(now.getEpochSecond());
        long nano = now.getNano();
        long j = nanos + nano;
        long j2 = nano ^ nanos;
        boolean z2 = false;
        if (j2 < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((nanos ^ j) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j;
        }
        return ((j >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
