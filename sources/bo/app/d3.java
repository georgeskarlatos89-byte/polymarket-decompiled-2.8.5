package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.b4a;
import defpackage.b69;
import defpackage.bm1;
import defpackage.coc;
import defpackage.evk;
import defpackage.ica;
import defpackage.jca;
import defpackage.pm1;
import defpackage.quk;
import defpackage.swk;
import defpackage.tl1;
import defpackage.twk;
import defpackage.wuk;
import defpackage.wyg;
import defpackage.xyg;
import defpackage.xym;
import defpackage.zv5;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d3 {
    public static final String n = b69.s(d3.class);
    public static final long o = 10000;
    public static final long p = 10000;
    public final Context a;
    public final b8 b;
    public final m8 c;
    public final ha d;
    public final AlarmManager e;
    public final boolean f;
    public final ReentrantLock g;
    public final String h;
    public final int i;
    public final b3 j;
    public jca k;
    public wb l;
    public final LinkedHashMap m;

    public d3(Context context, b8 b8Var, m8 m8Var, ha haVar, AlarmManager alarmManager, int i, boolean z, wf wfVar) {
        context.getClass();
        haVar.getClass();
        alarmManager.getClass();
        this.a = context;
        this.b = b8Var;
        this.c = m8Var;
        this.d = haVar;
        this.e = alarmManager;
        this.f = z;
        this.g = new ReentrantLock();
        int v = wfVar.v();
        Integer valueOf = v == -1 ? null : Integer.valueOf(v);
        this.i = valueOf != null ? Math.max(i, valueOf.intValue()) : i;
        this.k = xym.a();
        this.m = new LinkedHashMap();
        b3 b3Var = new b3(this);
        this.j = b3Var;
        String str = context.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.h = str;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(b3Var, new IntentFilter(str), 2);
            } else {
                context.registerReceiver(b3Var, new IntentFilter(str));
            }
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new swk(0, this), 4);
            this.j = null;
        }
    }

    public static final String d(wb wbVar) {
        return "Session [" + wbVar.a + "] being sealed because its end time is over the grace period. Session: " + wbVar;
    }

    public static final String f(wb wbVar) {
        return "Closed session with id " + wbVar.a;
    }

    public static final String k() {
        return "Getting the stored open session";
    }

    public static final String n() {
        return "Failed to unregister session seal receiver.";
    }

    public static final String q() {
        return "At least one session context is open. Calling startSession.";
    }

    public static final String r() {
        return "No session contexts are open. Calling stopSession.";
    }

    public final void a(String str, boolean z) {
        int i;
        str.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        try {
            Object obj = this.m.get(str);
            if (obj == null) {
                obj = 0;
            }
            this.m.put(str, Integer.valueOf(((Number) obj).intValue() + i));
            int C0 = CollectionsKt.C0(this.m.values());
            pm1 pm1Var = pm1.V;
            b69.h(this, pm1Var, null, false, new bm1(C0, this, 16), 6);
            if (C0 > 0) {
                b69.h(this, pm1Var, null, false, new wuk(25), 6);
                o();
            } else {
                b69.h(this, pm1Var, null, false, new wuk(18), 6);
                p();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        b69.h(this, null, null, false, new wuk(20), 7);
        try {
            Intent intent = new Intent(this.h);
            intent.putExtra(Keys.KEY_SESSION_ID, String.valueOf(this.l));
            b4a b4aVar = b4a.a;
            this.e.cancel(PendingIntent.getBroadcast(this.a, 0, intent, 1140850688));
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new wuk(21), 4);
        }
    }

    public final void c(String str) {
        d3 d3Var;
        pm1 pm1Var;
        if (str != null) {
            pm1 pm1Var2 = pm1.V;
            b69.h(this, pm1Var2, null, false, new evk(str, 8), 6);
            d3Var = this;
            d3Var.a(str, true);
            pm1Var = pm1Var2;
        } else {
            d3Var = this;
            pm1Var = pm1.V;
            b69.h(d3Var, pm1Var, null, false, new wuk(23), 6);
            d3Var.a("$/! global session context sentinel", true);
        }
        b69.h(d3Var, pm1Var, null, false, new swk(4, d3Var), 6);
    }

    public final void e() {
        wb wbVar = this.l;
        if (wbVar != null) {
            int i = this.i;
            boolean z = this.f;
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(j);
            if (z) {
                millis = Math.max(p, (timeUnit.toMillis((long) wbVar.b) + millis) - zv5.e());
            }
            long j2 = millis;
            b69.h(this, null, null, false, new quk(j2, 2), 7);
            try {
                Intent intent = new Intent(this.h);
                intent.putExtra(Keys.KEY_SESSION_ID, wbVar.toString());
                b4a b4aVar = b4a.a;
                this.e.set(1, zv5.e() + j2, PendingIntent.getBroadcast(this.a, 0, intent, 1140850688));
            } catch (Exception e) {
                b69.h(this, pm1.E, e, false, new wuk(22), 4);
            }
        }
    }

    public final boolean g() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            j();
            wb wbVar = this.l;
            boolean z = true;
            if (wbVar != null && !wbVar.d) {
                if (wbVar.c != null) {
                    wbVar.c = null;
                } else {
                    z = false;
                }
                return z;
            }
            i();
            if (wbVar != null && wbVar.d) {
                b69.h(this, null, null, false, new twk(wbVar, 3), 7);
                this.b.a(wbVar.a.b);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ag h() {
        ag agVar;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            j();
            wb wbVar = this.l;
            if (wbVar != null) {
                agVar = wbVar.a;
            } else {
                agVar = null;
            }
            return agVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        wb wbVar = new wb();
        this.l = wbVar;
        b69.h(this, pm1.I, null, false, new twk(wbVar, 4), 6);
        this.c.b(new zf(wbVar), zf.class);
        ((m8) this.d).b(new xyg(wbVar.a.b, wyg.SESSION_STARTED), xyg.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if ((r8.toMillis((long) r5) + r12) <= r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        wb wbVar;
        d3 d3Var;
        ag agVar;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            wbVar = this.l;
            if (wbVar == null) {
                b69.h(this, null, null, false, new wuk(19), 7);
                d3Var = this;
                yf c = d3Var.b.c();
                if (c != null) {
                    wbVar = new wb(c.a, c.b, c.c, c.d);
                } else {
                    wbVar = null;
                }
                d3Var.l = wbVar;
            } else {
                d3Var = this;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        if (wbVar != null) {
            b69.h(d3Var, null, null, false, new twk(wbVar, 0), 7);
            Double d = wbVar.c;
            if (d != null && !wbVar.d) {
                double d2 = wbVar.b;
                double doubleValue = d.doubleValue();
                int i = d3Var.i;
                boolean z = d3Var.f;
                long e = zv5.e();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long millis = timeUnit.toMillis(i);
                if (z) {
                    if (timeUnit.toMillis((long) d2) + millis + p <= e) {
                        b69.h(d3Var, pm1.I, null, false, new twk(wbVar, 1), 6);
                        d3Var.l();
                        b8 b8Var = d3Var.b;
                        wb wbVar2 = d3Var.l;
                        if (wbVar2 != null) {
                            agVar = wbVar2.a;
                        } else {
                            agVar = null;
                        }
                        b8Var.a(String.valueOf(agVar));
                        d3Var.l = null;
                    }
                }
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public final void l() {
        wb wbVar = this.l;
        if (wbVar != null) {
            ReentrantLock reentrantLock = this.g;
            reentrantLock.lock();
            try {
                wbVar.d = true;
                wbVar.c = Double.valueOf(zv5.e() / 1000.0d);
                this.b.a(wbVar);
                this.c.b(new bg(wbVar), bg.class);
                ((m8) this.d).b(new xyg(wbVar.a.b, wyg.SESSION_ENDED), xyg.class);
                b69.h(this, pm1.V, null, false, new twk(wbVar, 5), 6);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        try {
            b3 b3Var = this.j;
            if (b3Var != null) {
                this.a.unregisterReceiver(b3Var);
            }
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new wuk(24), 4);
        }
    }

    public final void o() {
        wb wbVar;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (g() && (wbVar = this.l) != null) {
                this.b.a(wbVar);
            }
            jca jcaVar = this.k;
            ica icaVar = jca.C0;
            jcaVar.e(null);
            b();
            this.c.b(cg.a, cg.class);
            reentrantLock.unlock();
            b69.h(this, pm1.V, null, false, new swk(2, this), 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void p() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            g();
            wb wbVar = this.l;
            if (wbVar != null) {
                wbVar.c = Double.valueOf(zv5.e() / 1000.0d);
                this.b.a(wbVar);
                jca jcaVar = this.k;
                ica icaVar = jca.C0;
                jcaVar.e(null);
                this.k = coc.c(tl1.a, null, null, new c3(this, null), 3);
                e();
                this.c.b(eg.a, eg.class);
                b69.h(this, null, null, false, new twk(wbVar, 2), 7);
            }
            reentrantLock.unlock();
            b69.h(this, pm1.V, null, false, new swk(1, this), 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public static final String d(d3 d3Var) {
        return "Completed the startSession call. Current session: " + d3Var.h();
    }

    public static final String d(String str) {
        return z0.a("Attempting to open session with context: ", str);
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public static final String c(d3 d3Var) {
        return "Completed the attemptToOpenSession call. Current session: " + d3Var.h();
    }

    public static final String c(wb wbVar) {
        return "Checking if this session needs to be sealed: " + wbVar.a;
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String b(d3 d3Var) {
        return "Completed the attemptToCloseSession call. Current session: " + d3Var.h();
    }

    public static final String b(wb wbVar) {
        return "New session created with ID: " + wbVar.a;
    }

    public static final String b(String str) {
        return z0.a("Attempting to close session with context: ", str);
    }

    public static final String e(wb wbVar) {
        return "Sealed session with id " + wbVar.a;
    }

    public static final String e(d3 d3Var) {
        return "Completed the stopSession call. Current session: " + d3Var.h();
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public final void a(String str) {
        str.getClass();
        pm1 pm1Var = pm1.V;
        b69.h(this, pm1Var, null, false, new evk(str, 7), 6);
        a(str, false);
        b69.h(this, pm1Var, null, false, new swk(3, this), 6);
    }

    public static final String a(d3 d3Var) {
        return "Failed to register dynamic receiver for " + d3Var.h;
    }

    public static final String a(int i, d3 d3Var) {
        StringBuilder o2 = ace.o(i, "Session context identifier map updated. sum: ", " map: ");
        o2.append(d3Var.m);
        return o2.toString();
    }

    public static final String a(wb wbVar) {
        return "Clearing completely dispatched sealed session " + wbVar.a;
    }

    public static final String a(long j) {
        return ace.g(j, "Creating a session seal alarm with a delay of ", " ms");
    }
}
