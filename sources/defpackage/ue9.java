package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ue9 implements t85 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final fr0 e;
    public static final /* synthetic */ long f;
    public final se9 a;
    public zg9 b;
    public gh9 c;
    private volatile /* synthetic */ int received = 0;

    static {
        wka wkaVar;
        KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(Object.class);
        try {
            wkaVar = lvf.a(Object.class);
        } catch (Throwable unused) {
            wkaVar = null;
        }
        e = new fr0("CustomResponse", new zgj(orCreateKotlinClass, wkaVar));
        d = AtomicIntegerFieldUpdater.newUpdater(ue9.class, MetricTracker.Action.RECEIVED);
        f = oo4.a.objectFieldOffset(ue9.class.getDeclaredField(MetricTracker.Action.RECEIVED));
    }

    public ue9(se9 se9Var) {
        this.a = se9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        if (r14 != r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zgj zgjVar, q55 q55Var) {
        te9 te9Var;
        int i;
        Throwable th;
        ue9 ue9Var;
        try {
            try {
                if (q55Var instanceof te9) {
                    te9Var = (te9) q55Var;
                    int i2 = te9Var.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        te9Var.n = i2 - Integer.MIN_VALUE;
                        Object obj = te9Var.l;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = te9Var.n;
                        Object obj2 = null;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    zgjVar = te9Var.k;
                                    ResultKt.a(obj);
                                    ue9Var = this;
                                    Object obj3 = ((hh9) obj).b;
                                    if (!Intrinsics.areEqual(obj3, ocd.a)) {
                                        obj2 = obj3;
                                    }
                                    if (obj2 != null) {
                                        KClass kClass = zgjVar.a;
                                        try {
                                            kClass.getClass();
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        try {
                                            if (!vzm.m(kClass).isInstance(obj2)) {
                                                throw new l8d(ue9Var.d(), lvf.a.getOrCreateKotlinClass(obj2.getClass()), zgjVar.a);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            qsn.e(ue9Var.d(), mok.c("Receive failed", th));
                                            throw th;
                                        }
                                    }
                                    return obj2;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zgjVar = te9Var.k;
                            ResultKt.a(obj);
                            ue9Var = this;
                        } else {
                            ResultKt.a(obj);
                            try {
                                gh9 d2 = d();
                                KClass kClass2 = zgjVar.a;
                                try {
                                    kClass2.getClass();
                                    try {
                                        if (vzm.m(kClass2).isInstance(d2)) {
                                            return d();
                                        }
                                        if (!b() && !yx6.a(d())) {
                                            d.getClass();
                                            try {
                                                ue9Var = this;
                                                try {
                                                    if (!oo4.a.compareAndSwapInt(ue9Var, f, 0, 1)) {
                                                        throw new vx6(ue9Var);
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    th = th;
                                                    qsn.e(ue9Var.d(), mok.c("Receive failed", th));
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                ue9Var = this;
                                            }
                                        } else {
                                            ue9Var = this;
                                        }
                                        obj = ue9Var.getAttributes().e(e);
                                        if (obj == null) {
                                            te9Var.k = zgjVar;
                                            te9Var.n = 1;
                                            obj = ue9Var.e();
                                            if (obj == u85Var) {
                                                return u85Var;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        ue9Var = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    ue9Var = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                ue9Var = this;
                                th = th;
                                qsn.e(ue9Var.d(), mok.c("Receive failed", th));
                                throw th;
                            }
                        }
                        hh9 hh9Var = new hh9(zgjVar, obj);
                        ug9 ug9Var = ue9Var.a.e;
                        te9Var.k = zgjVar;
                        te9Var.n = 2;
                        obj = ug9Var.a(ue9Var, hh9Var, te9Var);
                    }
                }
                if (i == 0) {
                }
                hh9 hh9Var2 = new hh9(zgjVar, obj);
                ug9 ug9Var2 = ue9Var.a.e;
                te9Var.k = zgjVar;
                te9Var.n = 2;
                obj = ug9Var2.a(ue9Var, hh9Var2, te9Var);
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            ue9Var = this;
        }
        te9Var = new te9(this, q55Var);
        Object obj4 = te9Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = te9Var.n;
        Object obj22 = null;
    }

    public boolean b() {
        return false;
    }

    public final zg9 c() {
        zg9 zg9Var = this.b;
        if (zg9Var != null) {
            return zg9Var;
        }
        Intrinsics.i("request");
        throw null;
    }

    public final gh9 d() {
        gh9 gh9Var = this.c;
        if (gh9Var != null) {
            return gh9Var;
        }
        Intrinsics.i("response");
        throw null;
    }

    public Object e() {
        return d().c();
    }

    public final os4 getAttributes() {
        return c().getAttributes();
    }

    @Override // defpackage.t85
    public final CoroutineContext getCoroutineContext() {
        return d().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().f() + ']';
    }
}
