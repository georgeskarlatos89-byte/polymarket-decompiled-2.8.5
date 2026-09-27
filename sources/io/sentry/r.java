package io.sentry;

import defpackage.k84;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r implements l {
    public final boolean f;
    public final SentryAndroidOptions g;
    public final io.sentry.util.a a = new Object();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.util.a] */
    public r(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        this.g = sentryAndroidOptions;
        for (z0 z0Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (z0Var instanceof a1) {
                this.d.add((a1) z0Var);
            }
            if (z0Var instanceof io.sentry.android.core.a2) {
                this.e.add((io.sentry.android.core.a2) z0Var);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.l
    public final void a(b7 b7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.a2) it.next()).e(b7Var);
        }
    }

    @Override // io.sentry.l
    public final List b(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        q qVar = (q) concurrentHashMap.remove(str);
        this.g.getLogger().f(p5.DEBUG, k84.g("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (qVar != null) {
            return qVar.a;
        }
        return null;
    }

    @Override // io.sentry.l
    public final void c(b7 b7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.a2) it.next()).f(b7Var);
        }
    }

    @Override // io.sentry.l
    public final void close() {
        this.g.getLogger().f(p5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.a2) it.next()).d();
        }
        if (this.h.getAndSet(false)) {
            io.sentry.util.a aVar = this.a;
            aVar.e();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
                }
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
    }

    @Override // io.sentry.l
    public final void d(y6 y6Var) {
        if (this.f) {
            this.g.getLogger().f(p5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.a2) it.next()).f(y6Var);
        }
        String a = y6Var.a.a();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(a)) {
            concurrentHashMap.put(a, new q(this, y6Var));
        }
        f(a);
    }

    @Override // io.sentry.l
    public final List e(o1 o1Var) {
        this.g.getLogger().f(p5.DEBUG, "stop collecting performance info for transactions %s (%s)", o1Var.getName(), o1Var.u().a.a());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.a2) it.next()).e(o1Var);
        }
        return b(o1Var.j().a());
    }

    @Override // io.sentry.l
    public final void f(String str) {
        if (this.f) {
            this.g.getLogger().f(p5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new q(this, null));
        }
        if (!this.h.getAndSet(true)) {
            io.sentry.util.a aVar = this.a;
            aVar.e();
            try {
                if (this.b == null) {
                    this.b = new Timer(true);
                }
                this.b.schedule(new o(this), 0L);
                this.b.schedule(new p(this, new ArrayList()), 100L, 100L);
                aVar.close();
            } finally {
            }
        }
    }
}
