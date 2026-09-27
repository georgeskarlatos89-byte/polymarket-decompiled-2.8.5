package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r5 implements j2 {
    public final io.sentry.protocol.w a;
    public e7 b;
    public final Double c;
    public final String d;
    public final t5 e;
    public Integer f;
    public Map g;
    public HashMap h;

    public r5(io.sentry.protocol.w wVar, Double d, String str, t5 t5Var) {
        this.a = wVar;
        this.c = d;
        this.d = str;
        this.e = t5Var;
    }

    public final void a(String str, io.sentry.protocol.n nVar) {
        Map map = this.g;
        if (map == null) {
            map = new HashMap();
            this.g = map;
        }
        map.put(str, nVar);
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u("timestamp");
        cVar.A(x0Var, io.sentry.config.a.e0(this.c.doubleValue()));
        cVar.u("trace_id");
        cVar.A(x0Var, this.a);
        if (this.b != null) {
            cVar.u("span_id");
            cVar.A(x0Var, this.b);
        }
        cVar.u("body");
        cVar.D(this.d);
        cVar.u("level");
        cVar.A(x0Var, this.e);
        if (this.f != null) {
            cVar.u("severity_number");
            cVar.A(x0Var, this.f);
        }
        if (this.g != null) {
            cVar.u("attributes");
            cVar.A(x0Var, this.g);
        }
        HashMap hashMap = this.h;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.y(this.h, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }
}
