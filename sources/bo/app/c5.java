package bo.app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import bo.app.c5;
import bo.app.cg;
import bo.app.eg;
import defpackage.ace;
import defpackage.b69;
import defpackage.bj9;
import defpackage.coc;
import defpackage.dmk;
import defpackage.ica;
import defpackage.iwk;
import defpackage.jca;
import defpackage.jl1;
import defpackage.jwk;
import defpackage.pm1;
import defpackage.quk;
import defpackage.tl1;
import defpackage.woa;
import defpackage.wuk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c5 {
    public static final String m = b69.s(c5.class);
    public final Context a;
    public final m8 b;
    public final v4 c;
    public final y4 e;
    public dg f;
    public long g;
    public volatile boolean h;
    public final ConnectivityManager i;
    public zb j;
    public jca k;
    public boolean l;

    public c5(Context context, m8 m8Var, v4 v4Var) {
        context.getClass();
        this.a = context;
        this.b = m8Var;
        this.c = v4Var;
        this.f = dg.NO_SESSION;
        this.g = -1L;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.i = (ConnectivityManager) systemService;
        this.j = zb.GOOD;
        this.e = new y4(this);
        a(m8Var);
    }

    public static final String d(c5 c5Var) {
        return "currentIntervalMs: " + c5Var.g;
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final jca a(long j) {
        if (this.g >= 1000) {
            b69.h(this, pm1.V, null, false, new iwk(j, this, 1), 6);
            return coc.c(tl1.a, null, null, new b5(this, j, null), 3);
        }
        jl1.m.t(this.a).m();
        b69.h(this, null, null, false, new jwk(this, 0), 7);
        return null;
    }

    public final void b() {
        long j;
        int intValue;
        pm1 pm1Var = pm1.V;
        b69.h(this, pm1Var, null, false, new jwk(this, 1), 6);
        long j2 = this.g;
        if (this.f != dg.NO_SESSION && !this.l) {
            int ordinal = this.j.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            v4 v4Var = this.c;
                            r1 r1Var = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                            intValue = v4Var.getIntValue("com_braze_data_flush_interval_great_network", 10);
                        } else {
                            dmk.a();
                            return;
                        }
                    } else {
                        v4 v4Var2 = this.c;
                        r1 r1Var2 = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                        intValue = v4Var2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                    }
                } else {
                    v4 v4Var3 = this.c;
                    r1 r1Var3 = r1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = v4Var3.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                }
                j = intValue * 1000;
            } else {
                j = -1;
            }
            this.g = j;
            if (j != -1 && j < 1000) {
                b69.h(this, pm1.W, null, false, new jwk(this, 2), 6);
                this.g = 1000L;
            }
        } else {
            this.g = -1L;
        }
        b69.h(this, pm1Var, null, false, new jwk(this, 3), 6);
        if (j2 != this.g) {
            b69.h(this, null, null, false, new iwk(j2, this, 0), 7);
            b(this.g);
        }
    }

    public final synchronized void c() {
        c5 c5Var;
        try {
            try {
                if (this.h) {
                    b69.h(this, null, null, false, new wuk(12), 7);
                    return;
                }
                try {
                    b69.h(this, null, null, false, new wuk(13), 7);
                    ConnectivityManager connectivityManager = this.i;
                    y4 y4Var = this.e;
                    if (y4Var != null) {
                        connectivityManager.registerDefaultNetworkCallback(y4Var);
                        a(this.i.getNetworkCapabilities(this.i.getActiveNetwork()));
                        b(this.g);
                        this.h = true;
                        return;
                    }
                    Intrinsics.i("connectivityNetworkCallback");
                    throw null;
                } catch (Throwable th) {
                    th = th;
                    c5Var = this;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            c5Var = this;
        }
    }

    public final synchronized void f() {
        c5 c5Var;
        try {
            try {
                if (!this.h) {
                    b69.h(this, null, null, false, new wuk(10), 7);
                    return;
                }
                try {
                    b69.h(this, null, null, false, new wuk(11), 7);
                    jca jcaVar = this.k;
                    if (jcaVar != null) {
                        ica icaVar = jca.C0;
                        jcaVar.e(null);
                    }
                    this.k = null;
                    i();
                    this.h = false;
                } catch (Throwable th) {
                    th = th;
                    c5Var = this;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            c5Var = this;
        }
    }

    public final void i() {
        try {
            ConnectivityManager connectivityManager = this.i;
            y4 y4Var = this.e;
            if (y4Var != null) {
                connectivityManager.unregisterNetworkCallback(y4Var);
            } else {
                Intrinsics.i("connectivityNetworkCallback");
                throw null;
            }
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new wuk(9), 4);
        }
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public static final String a(long j, c5 c5Var) {
        return woa.n(c5Var.g, " ms", ace.p(j, "Kicking off the Sync Job. initialDelaysMs: ", ": currentIntervalMs "));
    }

    public static final String a(c5 c5Var) {
        return woa.n(c5Var.g, " ms. Not scheduling a proceeding data flush.", new StringBuilder("Data flush interval is "));
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        zb zbVar;
        zb zbVar2 = this.j;
        if (networkCapabilities == null) {
            zbVar = zb.NONE;
        } else {
            int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
            if (min > 14000) {
                zbVar = zb.GREAT;
            } else if (min > 4000) {
                zbVar = zb.GOOD;
            } else {
                zbVar = zb.BAD;
            }
        }
        this.j = zbVar;
        if (zbVar2 != zbVar) {
            this.b.b(new ac(zbVar2, zbVar), ac.class);
        }
        b();
    }

    public final void a(m8 m8Var) {
        final int i = 0;
        m8Var.c(cg.class, new bj9(this) { // from class: kwk
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // defpackage.bj9
            public final void a(Object obj) {
                int i2 = i;
                c5 c5Var = this.b;
                switch (i2) {
                    case 0:
                        c5.a(c5Var, (cg) obj);
                        return;
                    default:
                        c5.a(c5Var, (eg) obj);
                        return;
                }
            }
        });
        final int i2 = 1;
        m8Var.c(eg.class, new bj9(this) { // from class: kwk
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // defpackage.bj9
            public final void a(Object obj) {
                int i22 = i2;
                c5 c5Var = this.b;
                switch (i22) {
                    case 0:
                        c5.a(c5Var, (cg) obj);
                        return;
                    default:
                        c5.a(c5Var, (eg) obj);
                        return;
                }
            }
        });
    }

    public static final void a(c5 c5Var, cg cgVar) {
        cgVar.getClass();
        c5Var.f = dg.OPEN_SESSION;
        c5Var.b();
    }

    public static final void a(c5 c5Var, eg egVar) {
        egVar.getClass();
        c5Var.f = dg.NO_SESSION;
        c5Var.b();
    }

    public static final String c(long j) {
        return ace.g(j, "Posting new sync runnable with delay ", " ms");
    }

    public static final String c(c5 c5Var) {
        return woa.n(c5Var.g, "), moving to minimum of 1000 ms", new StringBuilder("Flush interval was too low ("));
    }

    public final void b(long j) {
        jca jcaVar = this.k;
        if (jcaVar != null) {
            ica icaVar = jca.C0;
            jcaVar.e(null);
        }
        this.k = null;
        if (this.g >= 1000) {
            b69.h(this, null, null, false, new quk(j, 1), 7);
            this.k = a(j);
        }
    }

    public static final String b(c5 c5Var) {
        return "recalculateDispatchState called with session state: " + c5Var.f + " lastNetworkLevel: " + c5Var.j;
    }

    public static final String b(long j, c5 c5Var) {
        StringBuilder p = ace.p(j, "Data flush interval has changed from ", " ms to ");
        p.append(c5Var.g);
        p.append(" ms after connectivity state change to: ");
        p.append(c5Var.j);
        p.append(" and session state: ");
        p.append(c5Var.f);
        return p.toString();
    }
}
