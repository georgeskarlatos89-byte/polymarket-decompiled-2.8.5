package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzzy {
    private static final zzzy zza;
    private final UUID zzb;
    private final AtomicLong zzc;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zza = new zzzy(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public zzzy(UUID uuid, long j) {
        this.zzb = uuid;
        this.zzc = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public static zzzy zza() {
        return zza;
    }

    public final long zzb() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.zzc;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID zzc() {
        long zzb = zzb() & (-61441);
        long zzb2 = zzb() >>> 2;
        UUID uuid = this.zzb;
        return new UUID(zzb ^ uuid.getMostSignificantBits(), zzb2 ^ uuid.getLeastSignificantBits());
    }
}
