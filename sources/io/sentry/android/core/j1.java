package io.sentry.android.core;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import defpackage.so0;
import io.sentry.p5;
import java.io.File;
import java.util.function.Consumer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class j1 {
    public final io.sentry.x0 a;
    public final io.sentry.i1 b;
    public final ProfilingManager c;
    public final CancellationSignal d;
    public final Object e;
    public volatile ProfilingResult f;
    public Consumer g;
    public volatile boolean h;

    public j1(Context context, io.sentry.x0 x0Var, io.sentry.i1 i1Var) {
        ProfilingManager h = so0.h(context.getSystemService("profiling"));
        this.d = new CancellationSignal();
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.h = false;
        this.a = x0Var;
        this.b = i1Var;
        this.c = h;
    }

    public static String a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 8) {
                                return "UNKNOWN_ERROR_CODE";
                            }
                            return "ERROR_UNKNOWN";
                        }
                        return "ERROR_FAILED_INVALID_REQUEST";
                    }
                    return "ERROR_FAILED_POST_PROCESSING";
                }
                return "ERROR_FAILED_PROFILING_IN_PROGRESS";
            }
            return "ERROR_FAILED_RATE_LIMIT_PROCESS";
        }
        return "ERROR_FAILED_RATE_LIMIT_SYSTEM";
    }

    public final File b(ProfilingResult profilingResult) {
        int b = so0.b(profilingResult);
        io.sentry.x0 x0Var = this.a;
        if (b != 0) {
            if (b != 1 && b != 2) {
                x0Var.f(p5.WARNING, "Perfetto profiling failed with %s (error code %d): %s. See https://developer.android.com/reference/android/os/ProfilingResult", a(b), Integer.valueOf(b), so0.i(profilingResult));
                return null;
            }
            x0Var.f(p5.INFO, "Perfetto profiling failed: %s. To disable during development run: adb shell device_config put profiling_testing rate_limiter.disabled true", a(b));
            return null;
        }
        String x = so0.x(profilingResult);
        if (x == null) {
            x0Var.f(p5.WARNING, "Perfetto profiling result file path is null.", new Object[0]);
            return null;
        }
        File file = new File(x);
        if (file.exists() && file.length() != 0) {
            return file;
        }
        x0Var.f(p5.WARNING, "Perfetto trace file does not exist or is empty.", new Object[0]);
        return null;
    }
}
