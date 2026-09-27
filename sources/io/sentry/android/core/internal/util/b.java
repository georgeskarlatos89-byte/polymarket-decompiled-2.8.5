package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import defpackage.zx;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.c0;
import io.sentry.android.core.f0;
import io.sentry.android.core.m0;
import io.sentry.android.core.n0;
import io.sentry.p0;
import io.sentry.p5;
import io.sentry.q0;
import io.sentry.r0;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b implements r0, c0 {
    public static volatile ConnectivityManager m;
    public final Context a;
    public final SentryAndroidOptions b;
    public final n0 c;
    public final c d;
    public final ArrayList e;
    public final io.sentry.util.a f;
    public volatile zx g;
    public volatile NetworkCapabilities h;
    public volatile Network i;
    public volatile long j;
    public final AtomicBoolean k;
    public static final io.sentry.util.a l = new Object();
    public static final io.sentry.util.a n = new Object();
    public static final ArrayList o = new ArrayList();
    public static final int[] p = {1, 0, 3, 2};
    public static final int[] q = new int[2];

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, io.sentry.util.a] */
    public b(Context context, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        c cVar = c.a;
        this.f = new Object();
        this.j = 0L;
        this.k = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = n0Var;
        this.d = cVar;
        this.e = new ArrayList();
        int[] iArr = q;
        iArr[0] = 12;
        iArr[1] = 16;
        D(new a(this, 1));
        f0.e.e(this);
    }

    public static ConnectivityManager A(Context context, x0 x0Var) {
        if (m != null) {
            return m;
        }
        io.sentry.util.a aVar = l;
        aVar.e();
        try {
            if (m != null) {
                ConnectivityManager connectivityManager = m;
                aVar.close();
                return connectivityManager;
            }
            m = (ConnectivityManager) context.getSystemService("connectivity");
            if (m == null) {
                x0Var.f(p5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = m;
            aVar.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String y(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public final void D(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        try {
            sentryAndroidOptions.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(p5.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void G(boolean z) {
        io.sentry.util.a aVar = this.f;
        aVar.e();
        if (z) {
            try {
                this.e.clear();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        zx zxVar = this.g;
        this.g = null;
        if (zxVar != null) {
            Context context = this.a;
            x0 logger = this.b.getLogger();
            ConnectivityManager A = A(context, logger);
            if (A != null) {
                try {
                    A.unregisterNetworkCallback(zxVar);
                } catch (Throwable th3) {
                    logger.d(p5.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.h = null;
        this.i = null;
        this.j = 0L;
        aVar.close();
        this.b.getLogger().f(p5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void K(NetworkCapabilities networkCapabilities) {
        NetworkCapabilities networkCapabilities2;
        io.sentry.util.a aVar = this.f;
        aVar.e();
        try {
            if (networkCapabilities != null) {
                this.h = networkCapabilities;
            } else {
                if (!io.sentry.config.a.r0(this.a)) {
                    this.b.getLogger().f(p5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.h = null;
                    this.d.getClass();
                    this.j = SystemClock.uptimeMillis();
                    aVar.close();
                    return;
                }
                this.c.getClass();
                ConnectivityManager A = A(this.a, this.b.getLogger());
                if (A != null) {
                    Network activeNetwork = A.getActiveNetwork();
                    if (activeNetwork != null) {
                        networkCapabilities2 = A.getNetworkCapabilities(activeNetwork);
                    } else {
                        networkCapabilities2 = null;
                    }
                    this.h = networkCapabilities2;
                } else {
                    this.h = null;
                }
            }
            this.d.getClass();
            this.j = SystemClock.uptimeMillis();
            this.b.getLogger().f(p5.DEBUG, "Cache updated - Status: " + p() + ", Type: " + z(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.b.getLogger().d(p5.WARNING, "Failed to update connection status cache", th);
                this.h = null;
                this.d.getClass();
                this.j = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        aVar.close();
    }

    @Override // io.sentry.r0
    public final boolean Q0(q0 q0Var) {
        io.sentry.util.a aVar = this.f;
        aVar.e();
        try {
            this.e.add(q0Var);
            aVar.close();
            o();
            if (this.g != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.r0
    public final p0 T() {
        this.d.getClass();
        if (SystemClock.uptimeMillis() - this.j >= 120000) {
            K(null);
        }
        return p();
    }

    @Override // io.sentry.r0
    public final void b1(q0 q0Var) {
        io.sentry.util.a aVar = this.f;
        aVar.e();
        try {
            this.e.remove(q0Var);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        D(new a(this, 0));
    }

    @Override // io.sentry.android.core.c0
    public final void e() {
        if (this.g != null) {
            return;
        }
        D(new a(this, 3));
    }

    @Override // io.sentry.android.core.c0
    public final void g() {
        if (this.g == null) {
            return;
        }
        D(new a(this, 2));
    }

    public final void o() {
        if (!m0.i() || this.g != null) {
            return;
        }
        io.sentry.util.a aVar = this.f;
        aVar.e();
        try {
            if (this.g != null) {
                aVar.close();
                return;
            }
            zx zxVar = new zx(this, 5);
            Context context = this.a;
            x0 logger = this.b.getLogger();
            this.c.getClass();
            ConnectivityManager A = A(context, logger);
            if (A != null) {
                if (!io.sentry.config.a.r0(context)) {
                    logger.f(p5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                } else {
                    try {
                        A.registerDefaultNetworkCallback(zxVar);
                        this.g = zxVar;
                        this.b.getLogger().f(p5.DEBUG, "Network callback registered successfully", new Object[0]);
                    } catch (Throwable th) {
                        logger.d(p5.WARNING, "registerDefaultNetworkCallback failed", th);
                    }
                    aVar.close();
                }
            }
            this.b.getLogger().f(p5.WARNING, "Failed to register network callback", new Object[0]);
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final p0 p() {
        if (this.h != null) {
            NetworkCapabilities networkCapabilities = this.h;
            if (networkCapabilities != null) {
                boolean hasCapability = networkCapabilities.hasCapability(12);
                this.c.getClass();
                if (hasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : p) {
                        if (networkCapabilities.hasTransport(i)) {
                            return p0.CONNECTED;
                        }
                    }
                }
            }
            return p0.DISCONNECTED;
        }
        ConnectivityManager A = A(this.a, this.b.getLogger());
        if (A != null) {
            Context context = this.a;
            x0 logger = this.b.getLogger();
            if (!io.sentry.config.a.r0(context)) {
                logger.f(p5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return p0.NO_PERMISSION;
            }
            try {
                NetworkInfo activeNetworkInfo = A.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    logger.f(p5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return p0.DISCONNECTED;
                }
                if (activeNetworkInfo.isConnected()) {
                    return p0.CONNECTED;
                }
                return p0.DISCONNECTED;
            } catch (Throwable th) {
                logger.d(p5.WARNING, "Could not retrieve Connection Status", th);
                return p0.UNKNOWN;
            }
        }
        return p0.UNKNOWN;
    }

    @Override // io.sentry.r0
    public final String w() {
        this.d.getClass();
        if (SystemClock.uptimeMillis() - this.j >= 120000) {
            K(null);
        }
        return z();
    }

    public final String z() {
        NetworkCapabilities networkCapabilities = this.h;
        if (networkCapabilities != null) {
            return y(networkCapabilities);
        }
        Context context = this.a;
        x0 logger = this.b.getLogger();
        n0 n0Var = this.c;
        ConnectivityManager A = A(context, logger);
        if (A != null) {
            if (!io.sentry.config.a.r0(context)) {
                logger.f(p5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                n0Var.getClass();
                Network activeNetwork = A.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.f(p5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = A.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.f(p5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean hasTransport = networkCapabilities2.hasTransport(3);
                boolean hasTransport2 = networkCapabilities2.hasTransport(1);
                boolean hasTransport3 = networkCapabilities2.hasTransport(0);
                if (hasTransport) {
                    return "ethernet";
                }
                if (hasTransport2) {
                    return "wifi";
                }
                if (hasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.d(p5.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }
}
