package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i7 {
    public final p6 a;

    public i7(p6 p6Var) {
        this.a = p6Var;
    }

    public final v3 a(io.sentry.internal.debugmeta.c cVar) {
        boolean z;
        Double valueOf;
        Double d = (Double) cVar.c;
        j7 j7Var = (j7) cVar.b;
        v3 v3Var = j7Var.d;
        if (v3Var != null) {
            return io.sentry.util.b.b(v3Var);
        }
        p6 p6Var = this.a;
        p6Var.getProfilesSampler();
        Double profilesSampleRate = p6Var.getProfilesSampleRate();
        boolean z2 = false;
        if (profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        p6Var.getTracesSampler();
        v3 v3Var2 = j7Var.r;
        if (v3Var2 != null) {
            return io.sentry.util.b.b(v3Var2);
        }
        Double tracesSampleRate = p6Var.getTracesSampleRate();
        double pow = Math.pow(2.0d, p6Var.getBackpressureMonitor().a());
        if (tracesSampleRate == null) {
            valueOf = null;
        } else {
            valueOf = Double.valueOf(tracesSampleRate.doubleValue() / pow);
        }
        Double d2 = valueOf;
        if (d2 != null) {
            if (d2.doubleValue() >= d.doubleValue()) {
                z2 = true;
            }
            return new v3(Boolean.valueOf(z2), d2, d, valueOf2, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new v3(bool, (Double) null, d, bool, (Double) null);
    }

    public final boolean b(double d) {
        Double profileSessionSampleRate = this.a.getProfileSessionSampleRate();
        if (profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= d) {
            return true;
        }
        return false;
    }
}
