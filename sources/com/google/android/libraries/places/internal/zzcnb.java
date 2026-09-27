package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcnb {
    private final AtomicLong zza = new AtomicLong();

    public final long zza(long j) {
        return this.zza.addAndGet(j);
    }
}
