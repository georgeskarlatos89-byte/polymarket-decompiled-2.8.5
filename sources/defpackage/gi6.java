package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gi6 {
    public static final Size k = new Size(0, 0);
    public static final boolean l = o9n.e(3, "DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public cw2 d;
    public final gw2 e;
    public cw2 f;
    public final gw2 g;
    public final Size h;
    public final int i;
    public Class j;

    public gi6(Size size, int i) {
        final int i2 = 0;
        this.h = size;
        this.i = i;
        gw2 a = kkn.a(new ew2(this) { // from class: di6
            public final /* synthetic */ gi6 b;

            {
                this.b = this;
            }

            @Override // defpackage.ew2
            public final Object j(cw2 cw2Var) {
                int i3 = i2;
                gi6 gi6Var = this.b;
                switch (i3) {
                    case 0:
                        synchronized (gi6Var.a) {
                            gi6Var.d = cw2Var;
                        }
                        return "DeferrableSurface-termination(" + gi6Var + ")";
                    default:
                        synchronized (gi6Var.a) {
                            gi6Var.f = cw2Var;
                        }
                        return "DeferrableSurface-close(" + gi6Var + ")";
                }
            }
        });
        this.e = a;
        final int i3 = 1;
        this.g = kkn.a(new ew2(this) { // from class: di6
            public final /* synthetic */ gi6 b;

            {
                this.b = this;
            }

            @Override // defpackage.ew2
            public final Object j(cw2 cw2Var) {
                int i32 = i3;
                gi6 gi6Var = this.b;
                switch (i32) {
                    case 0:
                        synchronized (gi6Var.a) {
                            gi6Var.d = cw2Var;
                        }
                        return "DeferrableSurface-termination(" + gi6Var + ")";
                    default:
                        synchronized (gi6Var.a) {
                            gi6Var.f = cw2Var;
                        }
                        return "DeferrableSurface-close(" + gi6Var + ")";
                }
            }
        });
        if (o9n.e(3, "DeferrableSurface")) {
            n.incrementAndGet();
            m.get();
            e();
            a.b.addListener(new vd5(21, this, Log.getStackTraceString(new Exception())), qt6.a());
        }
    }

    public void a() {
        cw2 cw2Var;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.a(null);
                    if (this.b == 0) {
                        cw2Var = this.d;
                        this.d = null;
                    } else {
                        cw2Var = null;
                    }
                    if (o9n.e(3, "DeferrableSurface")) {
                        toString();
                        o9n.e(3, "DeferrableSurface");
                    }
                } else {
                    cw2Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cw2Var != null) {
            cw2Var.a(null);
        }
    }

    public final void b() {
        cw2 cw2Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i != 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    if (i2 == 0 && this.c) {
                        cw2Var = this.d;
                        this.d = null;
                    } else {
                        cw2Var = null;
                    }
                    if (o9n.e(3, "DeferrableSurface")) {
                        toString();
                        o9n.e(3, "DeferrableSurface");
                        if (this.b == 0) {
                            n.get();
                            m.decrementAndGet();
                            e();
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cw2Var != null) {
            cw2Var.a(null);
        }
    }

    public final ujb c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new nq9(new ei6("DeferrableSurface already closed.", this), 1);
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new ei6("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (o9n.e(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        n.get();
                        m.incrementAndGet();
                        e();
                    }
                    toString();
                    o9n.e(3, "DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (!l && o9n.e(3, "DeferrableSurface")) {
            o9n.e(3, "DeferrableSurface");
        }
        toString();
        o9n.e(3, "DeferrableSurface");
    }

    public abstract ujb f();
}
