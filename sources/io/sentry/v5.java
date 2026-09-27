package io.sentry;

import com.socure.docv.capturesdk.api.Keys;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v5 implements j2 {
    public final io.sentry.protocol.w a;
    public e7 b;
    public final Double c;
    public final String d;
    public String e;
    public final String f;
    public final Double g;
    public Map h;
    public HashMap i;

    public v5(io.sentry.protocol.w wVar, Double d, String str, String str2, Double d2) {
        this.a = wVar;
        this.c = d;
        this.d = str;
        this.f = str2;
        this.g = d2;
    }

    public final void a(String str, io.sentry.protocol.n nVar) {
        Map map = this.h;
        if (map == null) {
            map = new HashMap();
            this.h = map;
        }
        map.put(str, nVar);
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u("timestamp");
        cVar.A(x0Var, io.sentry.config.a.e0(this.c.doubleValue()));
        cVar.u("type");
        cVar.D(this.f);
        cVar.u(Keys.KEY_NAME);
        cVar.D(this.d);
        cVar.u("value");
        cVar.C(this.g);
        cVar.u("trace_id");
        cVar.A(x0Var, this.a);
        if (this.b != null) {
            cVar.u("span_id");
            cVar.A(x0Var, this.b);
        }
        if (this.e != null) {
            cVar.u("unit");
            cVar.A(x0Var, this.e);
        }
        if (this.h != null) {
            cVar.u("attributes");
            cVar.A(x0Var, this.h);
        }
        HashMap hashMap = this.i;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.y(this.i, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }
}
