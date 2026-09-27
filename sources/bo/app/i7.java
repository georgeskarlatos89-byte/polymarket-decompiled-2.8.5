package bo.app;

import defpackage.b69;
import defpackage.c47;
import defpackage.d47;
import defpackage.dmk;
import defpackage.g3j;
import defpackage.h47;
import defpackage.hdi;
import defpackage.hxk;
import defpackage.ica;
import defpackage.jca;
import defpackage.lvn;
import defpackage.m47;
import defpackage.q55;
import defpackage.u85;
import defpackage.uxk;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i7 {
    public static final String d = b69.s(i7.class);
    public final jca a;
    public final AtomicBoolean b;
    public final AtomicReference c;

    public i7(jca jcaVar) {
        jcaVar.getClass();
        this.a = jcaVar;
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference(null);
    }

    public static final String b(i7 i7Var) {
        return "Stream session " + i7Var + " did not finish within 1000 ms. Continuing without it.";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        defpackage.b69.o(bo.app.i7.d, defpackage.pm1.W, r0, false, new defpackage.hxk(r7, 9), 8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        g7 g7Var;
        int i;
        if (q55Var instanceof g7) {
            g7Var = (g7) q55Var;
            int i2 = g7Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7Var.c = i2 - Integer.MIN_VALUE;
                Object obj = g7Var.a;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = g7Var.c;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                        this = this;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    c();
                    c47 c47Var = d47.b;
                    long h = h47.h(1000L, m47.MILLISECONDS);
                    h7 h7Var = new h7(this, null);
                    g7Var.c = 1;
                    Object b = g3j.b(lvn.h(h), h7Var, g7Var);
                    this = b;
                    if (b == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        g7Var = new g7(this, q55Var);
        Object obj2 = g7Var.a;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = g7Var.c;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }

    public final void c() {
        b69.o(d, null, null, false, new hxk(this, 8), 14);
        jca jcaVar = this.a;
        ica icaVar = jca.C0;
        jcaVar.e(null);
        a();
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("DustStreamSession(job=");
        sb.append(this.a);
        sb.append(", isActive=");
        if (this.a.isActive() && this.b.get()) {
            z = true;
        } else {
            z = false;
        }
        return hdi.t(sb, z, ')');
    }

    public static final String b() {
        return "Closing stream connection to unblock the stream reader";
    }

    public static final String a(i7 i7Var) {
        return "Ending stream session " + i7Var;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.c.getAndSet(null);
        if (httpURLConnection != null) {
            b69.o(d, null, null, false, new uxk(15), 14);
            httpURLConnection.disconnect();
        }
    }
}
