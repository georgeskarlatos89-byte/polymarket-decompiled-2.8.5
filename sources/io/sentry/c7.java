package io.sentry;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class c7 implements j2 {
    public final io.sentry.protocol.w a;
    public final e7 b;
    public final e7 c;
    public transient v3 d;
    public String e;
    public String f;
    public f7 g;
    public ConcurrentHashMap h;
    public String i;
    public Map j;
    public ConcurrentHashMap k;
    public t1 l;
    public c m;
    public final com.fingerprintjs.android.fpjs_pro_internal.f3 n;
    public final io.sentry.protocol.w o;

    public c7(io.sentry.protocol.w wVar, e7 e7Var, e7 e7Var2, String str, String str2, v3 v3Var, f7 f7Var, String str3) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.j = new ConcurrentHashMap();
        this.l = t1.SENTRY;
        this.n = new com.fingerprintjs.android.fpjs_pro_internal.f3(17);
        this.o = io.sentry.protocol.w.b;
        io.sentry.util.b.t(wVar, "traceId is required");
        this.a = wVar;
        io.sentry.util.b.t(e7Var, "spanId is required");
        this.b = e7Var;
        io.sentry.util.b.t(str, "operation is required");
        this.e = str;
        this.c = e7Var2;
        this.f = str2;
        this.g = f7Var;
        this.i = str3;
        a(v3Var);
        io.sentry.util.thread.a threadChecker = p4.c().getOptions().getThreadChecker();
        this.j.put("thread.id", String.valueOf(threadChecker.c()));
        this.j.put("thread.name", threadChecker.b());
    }

    public final void a(v3 v3Var) {
        String obj;
        this.d = v3Var;
        c cVar = this.m;
        if (cVar != null && v3Var != null) {
            Boolean bool = (Boolean) v3Var.a;
            Charset charset = io.sentry.util.q.a;
            if (bool == null) {
                obj = null;
            } else {
                obj = bool.toString();
            }
            cVar.d("sentry-sampled", obj);
            Double d = (Double) v3Var.c;
            if (d != null && cVar.f) {
                cVar.d = d;
            }
            Double d2 = (Double) v3Var.b;
            if (d2 != null) {
                cVar.c = d2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        if (this.a.equals(c7Var.a) && this.b.equals(c7Var.b) && io.sentry.util.b.j(this.c, c7Var.c) && this.e.equals(c7Var.e) && io.sentry.util.b.j(this.f, c7Var.f) && this.g == c7Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u("trace_id");
        this.a.serialize(cVar, x0Var);
        cVar.u("span_id");
        this.b.serialize(cVar, x0Var);
        e7 e7Var = this.c;
        if (e7Var != null) {
            cVar.u("parent_span_id");
            e7Var.serialize(cVar, x0Var);
        }
        cVar.u("op");
        cVar.D(this.e);
        if (this.f != null) {
            cVar.u("description");
            cVar.D(this.f);
        }
        if (this.g != null) {
            cVar.u("status");
            cVar.A(x0Var, this.g);
        }
        if (this.i != null) {
            cVar.u("origin");
            cVar.A(x0Var, this.i);
        }
        if (!this.h.isEmpty()) {
            cVar.u("tags");
            cVar.A(x0Var, this.h);
        }
        if (!this.j.isEmpty()) {
            cVar.u(ApiConstant.KEY_DATA);
            cVar.A(x0Var, this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.z(this.k, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }

    public c7(io.sentry.protocol.w wVar, e7 e7Var, String str, e7 e7Var2) {
        this(wVar, e7Var, e7Var2, str, null, null, null, "manual");
    }

    public c7(c7 c7Var) {
        this.h = new ConcurrentHashMap();
        this.i = "manual";
        this.j = new ConcurrentHashMap();
        this.l = t1.SENTRY;
        this.n = new com.fingerprintjs.android.fpjs_pro_internal.f3(17);
        this.o = io.sentry.protocol.w.b;
        this.a = c7Var.a;
        this.b = c7Var.b;
        this.c = c7Var.c;
        a(c7Var.d);
        this.e = c7Var.e;
        this.f = c7Var.f;
        this.g = c7Var.g;
        ConcurrentHashMap p = io.sentry.util.b.p(c7Var.h);
        if (p != null) {
            this.h = p;
        }
        ConcurrentHashMap p2 = io.sentry.util.b.p(c7Var.k);
        if (p2 != null) {
            this.k = p2;
        }
        this.m = c7Var.m;
        ConcurrentHashMap p3 = io.sentry.util.b.p(c7Var.j);
        if (p3 != null) {
            this.j = p3;
        }
    }
}
