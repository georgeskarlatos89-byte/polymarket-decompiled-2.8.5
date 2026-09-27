package io.sentry.android.core;

import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.n3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k implements io.sentry.a1 {
    public long a;
    public long b;
    public long c;
    public boolean d;

    @Override // io.sentry.a1
    public final void a() {
        this.d = true;
        this.c = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.a = SystemClock.elapsedRealtimeNanos();
        this.b = Process.getElapsedCpuTime() * 1000000;
    }

    @Override // io.sentry.a1
    public final void b(n3 n3Var) {
        if (!this.d) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j = elapsedRealtimeNanos - this.a;
        this.a = elapsedRealtimeNanos;
        long elapsedCpuTime = Process.getElapsedCpuTime() * 1000000;
        long j2 = elapsedCpuTime - this.b;
        this.b = elapsedCpuTime;
        n3Var.a = ((j2 / j) / this.c) * 100.0d;
        n3Var.b = true;
    }
}
