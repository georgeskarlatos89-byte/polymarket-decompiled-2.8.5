package io.sentry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z3 implements j2 {
    public Integer a;
    public List b;
    public HashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z3.class == obj.getClass()) {
            z3 z3Var = (z3) obj;
            if (io.sentry.util.b.j(this.a, z3Var.a) && io.sentry.util.b.j(this.b, z3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
        if (this.a != null) {
            cVar.u("segment_id");
            cVar.C(this.a);
        }
        HashMap hashMap = this.c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.y(this.c, str, cVar, str, x0Var);
            }
        }
        cVar.p();
        cVar2.f = true;
        if (this.a != null) {
            cVar2.A();
            cVar2.e();
            cVar2.a.append((CharSequence) "\n");
        }
        List list = this.b;
        if (list != null) {
            cVar.A(x0Var, list);
        }
        cVar2.f = false;
    }
}
