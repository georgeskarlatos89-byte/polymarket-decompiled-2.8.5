package io.sentry.android.core;

import android.os.SystemClock;
import defpackage.qw5;
import java.util.concurrent.ConcurrentLinkedDeque;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class u implements io.sentry.android.core.internal.util.o {
    public final /* synthetic */ int a;
    public float b = 0.0f;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    @Override // io.sentry.android.core.internal.util.o
    public final void c(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                System.nanoTime();
                long j5 = currentTimeMillis * 1000000;
                v vVar = (v) obj;
                long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime())) - vVar.a;
                if (elapsedRealtimeNanos >= 0) {
                    if (z2) {
                        vVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(j3), j5));
                    } else if (z) {
                        vVar.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(j3), j5));
                    }
                    if (f != this.b) {
                        this.b = f;
                        vVar.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(elapsedRealtimeNanos), Float.valueOf(f), j5));
                        return;
                    }
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                System.nanoTime();
                long j6 = currentTimeMillis2 * 1000000;
                qw5 qw5Var = (qw5) obj;
                long elapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime())) - qw5Var.a;
                if (elapsedRealtimeNanos2 >= 0) {
                    if (z2) {
                        ((ConcurrentLinkedDeque) qw5Var.g).addLast(new io.sentry.profilemeasurements.b(Long.valueOf(elapsedRealtimeNanos2), Long.valueOf(j3), j6));
                    } else if (z) {
                        ((ConcurrentLinkedDeque) qw5Var.f).addLast(new io.sentry.profilemeasurements.b(Long.valueOf(elapsedRealtimeNanos2), Long.valueOf(j3), j6));
                    }
                    if (f != this.b) {
                        this.b = f;
                        ((ConcurrentLinkedDeque) qw5Var.h).addLast(new io.sentry.profilemeasurements.b(Long.valueOf(elapsedRealtimeNanos2), Float.valueOf(f), j6));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
