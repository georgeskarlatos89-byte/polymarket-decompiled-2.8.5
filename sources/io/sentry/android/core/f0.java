package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.q8k;
import io.sentry.p5;
import io.sentry.u2;
import java.io.Closeable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f0 implements Closeable {
    public static final f0 e = new f0();
    public volatile e0 b;
    public final io.sentry.util.a a = new Object();
    public final n0 c = new n0(3);
    public volatile Boolean d = null;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y();
    }

    public final void e(c0 c0Var) {
        io.sentry.util.a aVar = this.a;
        aVar.e();
        try {
            o(u2.a);
            if (this.b != null) {
                this.b.a.add(c0Var);
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

    public final void g(io.sentry.x0 x0Var) {
        e0 e0Var = this.b;
        if (e0Var != null) {
            try {
                ProcessLifecycleOwner.h.f.a(e0Var);
            } catch (Throwable th) {
                this.b = null;
                x0Var.d(p5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void o(io.sentry.x0 x0Var) {
        if (this.b == null) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.h;
                this.b = new e0(this);
                if (io.sentry.android.core.internal.util.d.a.a()) {
                    g(x0Var);
                    return;
                }
                n0 n0Var = this.c;
                ((Handler) n0Var.a).post(new q8k(13, this, x0Var));
            } catch (ClassNotFoundException unused) {
                x0Var.f(p5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
            } catch (Throwable th) {
                x0Var.d(p5.ERROR, "AppState could not register lifecycle observer", th);
            }
        }
    }

    public final void p(c0 c0Var) {
        io.sentry.util.a aVar = this.a;
        aVar.e();
        try {
            if (this.b != null) {
                this.b.a.remove(c0Var);
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

    public final void y() {
        if (this.b != null) {
            io.sentry.util.a aVar = this.a;
            aVar.e();
            try {
                e0 e0Var = this.b;
                this.b.a.clear();
                this.b = null;
                aVar.close();
                if (io.sentry.android.core.internal.util.d.a.a()) {
                    if (e0Var != null) {
                        ProcessLifecycleOwner.h.f.c(e0Var);
                    }
                } else {
                    n0 n0Var = this.c;
                    ((Handler) n0Var.a).post(new com.appsflyer.a(11, this, e0Var));
                }
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
}
