package io.sentry;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n5 {
    public static volatile n5 c;
    public static final io.sentry.util.a d = new Object();
    public static volatile Boolean e = null;
    public static final io.sentry.util.a f = new Object();
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public static n5 d() {
        if (c == null) {
            io.sentry.util.a aVar = d;
            aVar.e();
            try {
                if (c == null) {
                    c = new n5();
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
        return c;
    }

    public final void a(String str) {
        io.sentry.util.b.t(str, "integration is required.");
        this.a.add(str);
    }

    public final void b(String str, String str2) {
        this.b.add(new io.sentry.protocol.x(str, str2));
        io.sentry.util.a aVar = f;
        aVar.e();
        try {
            e = null;
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

    public final boolean c(x0 x0Var) {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        io.sentry.util.a aVar = f;
        aVar.e();
        try {
            Iterator it = this.b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                io.sentry.protocol.x xVar = (io.sentry.protocol.x) it.next();
                if (xVar.a.startsWith("maven:io.sentry:") && !"8.53.0".equalsIgnoreCase(xVar.b)) {
                    x0Var.f(p5.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", xVar.a, "8.53.0", xVar.b);
                    z = true;
                }
            }
            if (z) {
                p5 p5Var = p5.ERROR;
                x0Var.f(p5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                x0Var.f(p5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                x0Var.f(p5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                x0Var.f(p5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            e = Boolean.valueOf(z);
            aVar.close();
            return z;
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
