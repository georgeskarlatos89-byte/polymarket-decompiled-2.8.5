package io.sentry;

import defpackage.af9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b7 implements m1 {
    public final y4 a;
    public y4 b;
    public final c7 c;
    public final y6 d;
    public Throwable e;
    public final e1 f;
    public final af9 i;
    public d7 j;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public b7(y6 y6Var, i4 i4Var, c7 c7Var, af9 af9Var, com.socure.docv.capturesdk.core.extractor.a aVar) {
        new ConcurrentHashMap();
        this.c = c7Var;
        c7Var.i = (String) af9Var.e;
        this.d = y6Var;
        io.sentry.util.b.t(i4Var, "Scopes are required");
        this.f = i4Var;
        this.i = af9Var;
        this.j = aVar;
        y4 y4Var = (y4) af9Var.c;
        if (y4Var != null) {
            this.a = y4Var;
        } else {
            this.a = i4Var.getOptions().getDateProvider().a();
        }
    }

    @Override // io.sentry.m1
    public final void a(f7 f7Var) {
        this.c.g = f7Var;
    }

    @Override // io.sentry.m1
    public final v6 b() {
        Boolean bool;
        c7 c7Var = this.c;
        io.sentry.protocol.w wVar = c7Var.a;
        e7 e7Var = c7Var.b;
        v3 v3Var = c7Var.d;
        if (v3Var == null) {
            bool = null;
        } else {
            bool = (Boolean) v3Var.a;
        }
        return new v6(wVar, e7Var, bool);
    }

    @Override // io.sentry.m1
    public final f7 c() {
        return this.c.g;
    }

    @Override // io.sentry.m1
    public final m1 d(String str, y4 y4Var, t1 t1Var) {
        return x("activity.load", str, y4Var, t1Var, new af9(25));
    }

    @Override // io.sentry.m1
    public final boolean e() {
        return this.g;
    }

    @Override // io.sentry.m1
    public final void g() {
        p(this.c.g);
    }

    @Override // io.sentry.m1
    public final String getDescription() {
        return this.c.f;
    }

    @Override // io.sentry.m1
    public final void h(String str) {
        this.c.f = str;
    }

    @Override // io.sentry.m1
    public final boolean i() {
        return false;
    }

    @Override // io.sentry.m1
    public final m1 k(String str) {
        return y("http.client", null);
    }

    @Override // io.sentry.m1
    public final void l(String str, Long l, m2 m2Var) {
        if (this.g) {
            this.f.getOptions().getLogger().f(p5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n(m2Var.apiName(), (Number) l));
        y6 y6Var = this.d;
        b7 b7Var = y6Var.b;
        if (b7Var != this && !b7Var.l.containsKey(str)) {
            y6Var.l(str, l, m2Var);
        }
    }

    @Override // io.sentry.m1
    public final void m(String str, Number number) {
        if (this.g) {
            this.f.getOptions().getLogger().f(p5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n((String) null, number));
        y6 y6Var = this.d;
        b7 b7Var = y6Var.b;
        if (b7Var != this && !b7Var.l.containsKey(str)) {
            y6Var.m(str, number);
        }
    }

    @Override // io.sentry.m1
    public final void o(Throwable th) {
        this.e = th;
    }

    @Override // io.sentry.m1
    public final void p(f7 f7Var) {
        w(f7Var, this.f.getOptions().getDateProvider().a());
    }

    @Override // io.sentry.m1
    public final com.fingerprintjs.android.fpjs_pro_internal.f3 q(List list) {
        return this.d.q(list);
    }

    @Override // io.sentry.m1
    public final void r(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.m1
    public final c7 u() {
        return this.c;
    }

    @Override // io.sentry.m1
    public final y4 v() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.m1
    public final void w(f7 f7Var, y4 y4Var) {
        y4 y4Var2;
        y4 y4Var3;
        c7 c7Var = this.c;
        e7 e7Var = c7Var.b;
        y6 y6Var = this.d;
        CopyOnWriteArrayList<b7> copyOnWriteArrayList = y6Var.c;
        if (!this.g && this.h.compareAndSet(false, true)) {
            c7Var.g = f7Var;
            e1 e1Var = this.f;
            if (y4Var == null) {
                y4Var = e1Var.getOptions().getDateProvider().a();
            }
            this.b = y4Var;
            af9 af9Var = this.i;
            if (af9Var.b) {
                if (!y6Var.b.c.b.equals(e7Var)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        b7 b7Var = (b7) it.next();
                        e7 e7Var2 = b7Var.c.c;
                        if (e7Var2 != null && e7Var2.equals(e7Var)) {
                            arrayList.add(b7Var);
                        }
                    }
                    copyOnWriteArrayList = arrayList;
                }
                y4 y4Var4 = null;
                y4 y4Var5 = null;
                for (b7 b7Var2 : copyOnWriteArrayList) {
                    if (y4Var4 == null || b7Var2.a.b(y4Var4) < 0) {
                        y4Var4 = b7Var2.a;
                    }
                    if (y4Var5 == null || ((y4Var3 = b7Var2.b) != null && y4Var3.b(y4Var5) > 0)) {
                        y4Var5 = b7Var2.b;
                    }
                }
                if (af9Var.b && y4Var5 != null && (((y4Var2 = this.b) == null || y4Var2.b(y4Var5) > 0) && this.b != null)) {
                    this.b = y4Var5;
                }
            }
            Throwable th = this.e;
            if (th != null) {
                e1Var.n(th, this, y6Var.e);
            }
            d7 d7Var = this.j;
            if (d7Var != null) {
                d7Var.d(this);
            }
            this.g = true;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.e7, java.lang.Object] */
    @Override // io.sentry.m1
    public final m1 x(String str, String str2, y4 y4Var, t1 t1Var, af9 af9Var) {
        if (this.g) {
            return f3.a;
        }
        e7 e7Var = this.c.b;
        y6 y6Var = this.d;
        c7 c7Var = y6Var.b.c;
        c7 c7Var2 = new c7(c7Var.a, new Object(), e7Var, str, null, c7Var.d, null, "manual");
        c7Var2.f = str2;
        c7Var2.l = t1Var;
        af9Var.c = y4Var;
        return y6Var.C(c7Var2, af9Var);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [io.sentry.e7, java.lang.Object] */
    @Override // io.sentry.m1
    public final m1 y(String str, String str2) {
        if (this.g) {
            return f3.a;
        }
        e7 e7Var = this.c.b;
        af9 af9Var = new af9(25);
        y6 y6Var = this.d;
        c7 c7Var = y6Var.b.c;
        c7 c7Var2 = new c7(c7Var.a, new Object(), e7Var, str, null, c7Var.d, null, "manual");
        c7Var2.f = str2;
        c7Var2.l = t1.SENTRY;
        return y6Var.C(c7Var2, af9Var);
    }

    @Override // io.sentry.m1
    public final y4 z() {
        return this.a;
    }

    public b7(j7 j7Var, y6 y6Var, i4 i4Var, k7 k7Var) {
        new ConcurrentHashMap();
        this.c = j7Var;
        j7Var.i = (String) k7Var.e;
        this.d = y6Var;
        this.f = i4Var;
        this.j = null;
        y4 y4Var = (y4) k7Var.c;
        if (y4Var != null) {
            this.a = y4Var;
        } else {
            this.a = i4Var.getOptions().getDateProvider().a();
        }
        this.i = k7Var;
    }
}
