package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzfg implements zzfd {
    @Override // com.google.android.libraries.places.internal.zzfd
    public final Instant zza() {
        return Instant.now();
    }

    @Override // com.google.android.libraries.places.internal.zzfd
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }
}
