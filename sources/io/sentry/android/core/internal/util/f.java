package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f {
    public final long a;
    public final int c;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);

    public f(long j, int i) {
        this.a = j;
        this.c = i <= 0 ? 1 : i;
    }

    public final boolean a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.b;
        if (j != 0 && atomicLong.get() + this.a > uptimeMillis) {
            if (atomicInteger.incrementAndGet() < this.c) {
                return false;
            }
            atomicInteger.set(0);
            return true;
        }
        atomicInteger.set(0);
        atomicLong.set(uptimeMillis);
        return false;
    }
}
