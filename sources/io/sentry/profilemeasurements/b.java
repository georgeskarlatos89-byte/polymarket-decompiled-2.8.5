package io.sentry.profilemeasurements;

import com.fingerprintjs.android.fpjs_pro.g;
import io.sentry.internal.debugmeta.c;
import io.sentry.j2;
import io.sentry.l3;
import io.sentry.x0;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b implements j2 {
    public ConcurrentHashMap a;
    public double b;
    public String c;
    public double d;

    public b(Long l, Number number, long j) {
        this.c = l.toString();
        this.d = number.doubleValue();
        this.b = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (io.sentry.util.b.j(this.a, bVar.a) && this.c.equals(bVar.c) && this.d == bVar.d && this.b == bVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Double.valueOf(this.d)});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        c cVar = (c) l3Var;
        cVar.n();
        cVar.u("value");
        cVar.A(x0Var, Double.valueOf(this.d));
        cVar.u("elapsed_since_start_ns");
        cVar.A(x0Var, this.c);
        cVar.u("timestamp");
        cVar.A(x0Var, io.sentry.config.a.e0(this.b));
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                g.z(this.a, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }
}
