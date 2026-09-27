package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l implements Serializable {
    public static final AtomicLong c = new AtomicLong(System.nanoTime());
    public long a;
    public final long b;

    public l() {
        long a = a();
        long a2 = (a() << 1) | 1;
        this.b = a2;
        this.a = a2 + a;
    }

    public static long a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = c;
            j = atomicLong.get();
            long j3 = (j >> 12) ^ j;
            long j4 = j3 ^ (j3 << 25);
            j2 = (j4 ^ (j4 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j2));
        return j2;
    }

    public final void b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            this.a = (this.a * 6364136223846793005L) + this.b;
            bArr[i] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public final double c() {
        long j = this.a * 6364136223846793005L;
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = (((j3 >>> 22) ^ j3) >>> ((int) ((j3 >>> 61) + 22))) & 4294967295L;
        this.a = (j3 * 6364136223846793005L) + j2;
        return (((j4 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
