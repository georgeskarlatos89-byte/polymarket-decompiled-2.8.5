package io.sentry;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a7 implements j2 {
    public final Date a;
    public Date b;
    public final AtomicInteger c;
    public final String d;
    public final String e;
    public Boolean f;
    public z6 g;
    public Long h;
    public Double i;
    public final String j;
    public String k;
    public final String l;
    public final String m;
    public String n;
    public final io.sentry.util.a o = new Object();
    public ConcurrentHashMap p;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.util.a] */
    public a7(z6 z6Var, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.g = z6Var;
        this.a = date;
        this.b = date2;
        this.c = new AtomicInteger(i);
        this.d = str;
        this.e = str2;
        this.f = bool;
        this.h = l;
        this.i = d;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
    }

    public final a7 a() {
        return new a7(this.g, this.a, this.b, this.c.get(), this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final void b(Date date) {
        io.sentry.util.a aVar = this.o;
        aVar.e();
        try {
            this.f = null;
            if (this.g == z6.Ok) {
                this.g = z6.Exited;
            }
            if (date != null) {
                this.b = date;
            } else {
                date = new Date();
                this.b = date;
            }
            this.i = Double.valueOf(Math.abs(date.getTime() - this.a.getTime()) / 1000.0d);
            long time = this.b.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.h = Long.valueOf(time);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(z6 z6Var, String str, boolean z, String str2) {
        boolean z2;
        io.sentry.util.a aVar = this.o;
        aVar.e();
        boolean z3 = true;
        if (z6Var != null) {
            try {
                this.g = z6Var;
                z2 = true;
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.k = str;
            z2 = true;
        }
        if (z) {
            this.c.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.n = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.f = null;
            Date date = new Date();
            this.b = date;
            long time = date.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.h = Long.valueOf(time);
        }
        aVar.close();
        return z3;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        String str = this.e;
        if (str != null) {
            cVar.u("sid");
            cVar.D(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            cVar.u("did");
            cVar.D(str2);
        }
        if (this.f != null) {
            cVar.u("init");
            cVar.B(this.f);
        }
        cVar.u(MetricTracker.Action.STARTED);
        cVar.A(x0Var, this.a);
        cVar.u("status");
        cVar.A(x0Var, this.g.name().toLowerCase(Locale.ROOT));
        if (this.h != null) {
            cVar.u("seq");
            cVar.C(this.h);
        }
        cVar.u("errors");
        cVar.z(this.c.intValue());
        if (this.i != null) {
            cVar.u("duration");
            cVar.C(this.i);
        }
        if (this.b != null) {
            cVar.u("timestamp");
            cVar.A(x0Var, this.b);
        }
        if (this.n != null) {
            cVar.u("abnormal_mechanism");
            cVar.A(x0Var, this.n);
        }
        cVar.u("attrs");
        cVar.n();
        cVar.u("release");
        cVar.A(x0Var, this.m);
        String str3 = this.l;
        if (str3 != null) {
            cVar.u(ConstantsKt.ENV_FACING_MODE);
            cVar.A(x0Var, str3);
        }
        String str4 = this.j;
        if (str4 != null) {
            cVar.u("ip_address");
            cVar.A(x0Var, str4);
        }
        if (this.k != null) {
            cVar.u("user_agent");
            cVar.A(x0Var, this.k);
        }
        cVar.p();
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.z(this.p, str5, cVar, str5, x0Var);
            }
        }
        cVar.p();
    }
}
