package io.sentry.protocol;

import io.sentry.j2;
import io.sentry.l3;
import io.sentry.x0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class j implements j2 {
    public final List a;
    public ConcurrentHashMap b;

    public j(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return io.sentry.util.b.j(this.a, ((j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u("values");
        cVar.A(x0Var, this.a);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.z(this.b, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }
}
