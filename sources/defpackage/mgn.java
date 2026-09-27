package defpackage;

import android.content.Context;
import android.os.StrictMode;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mgn {
    public static final x3g h = new x3g(29);
    public static final ddn i;
    public volatile kr1 a;
    public final zwm b;
    public final String c;
    public final boolean d;
    public final tr9 e;
    public final nbi f;
    public final xwi g;

    static {
        hal halVar = hal.c;
        int i2 = tr9.c;
        i = new ddn(halVar, false, cxf.j);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, xwi] */
    public mgn(zwm zwmVar, ddn ddnVar) {
        this.b = zwmVar;
        Context context = zwmVar.b;
        String str = ddnVar.d;
        if (str == null) {
            str = (String) ddnVar.a.apply(context);
            ddnVar.d = str;
        }
        this.c = str;
        this.d = ddnVar.b;
        this.e = ddnVar.c;
        this.a = null;
        this.f = new nbi(22);
        ?? obj = new Object();
        obj.a = zwmVar;
        obj.c = str;
        Context context2 = zwmVar.b;
        Pattern pattern = xpn.a;
        sen senVar = new sen(context2);
        senVar.a("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(AgentHeaderCreator.AGENT_DIVIDER);
        sb.append(str);
        sb.append(".pb");
        senVar.b(sb.toString());
        obj.b = senVar.c();
        this.g = obj;
    }

    public final kr1 a() {
        kr1 kr1Var;
        kr1 kr1Var2 = this.a;
        if (kr1Var2 == null) {
            synchronized (this) {
                try {
                    kr1Var = this.a;
                    if (kr1Var == null) {
                        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        try {
                            kr1 k = this.g.k();
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            int i2 = ((q24) k.e).c - 2;
                            if (i2 != 15 && i2 != 16) {
                                zwm zwmVar = this.b;
                                zwmVar.g.a();
                                if (!this.d && !this.g.o() && ((String) k.b).isEmpty()) {
                                    final int i3 = 0;
                                    ((wkc) zwmVar.a()).execute(new Runnable(this) { // from class: ndn
                                        public final /* synthetic */ mgn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ue8 a;
                                            y0 b;
                                            int i4 = i3;
                                            mgn mgnVar = this.b;
                                            switch (i4) {
                                                case 0:
                                                    mgnVar.b();
                                                    return;
                                                case 1:
                                                    final vjn vjnVar = mgnVar.b.i;
                                                    w6l w6lVar = w6l.FILE;
                                                    boolean z = mgnVar.d;
                                                    len lenVar = len.a;
                                                    final ukn uknVar = (ukn) vjnVar.c.get();
                                                    if (uknVar == null && !z) {
                                                        oq9 oq9Var = oq9.b;
                                                        return;
                                                    }
                                                    int zza = 1 << w6lVar.zza();
                                                    if ((vjnVar.e & zza) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = vjnVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i5 = vjnVar.e;
                                                                if ((i5 & zza) == 0) {
                                                                    copyOnWriteArrayList.add(lenVar);
                                                                    vjnVar.e = zza | i5;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (vjnVar.h == null) {
                                                        synchronized (vjnVar.g) {
                                                            try {
                                                                if (vjnVar.h == null) {
                                                                    if (uknVar == null) {
                                                                        uknVar = ljn.a;
                                                                    }
                                                                    Context context = vjnVar.a;
                                                                    if (!fum.d(context)) {
                                                                        mb7 mb7Var = mb7.d;
                                                                        gci gciVar = vjnVar.b;
                                                                        a = r5.j(fum.c(context, Executors.callable(mb7Var, null), (Executor) gciVar.get()), new ym0() { // from class: ijn
                                                                            @Override // defpackage.ym0
                                                                            public final ujb apply(Object obj) {
                                                                                vjn vjnVar2 = vjn.this;
                                                                                return ((l3n) vjnVar2.d.get()).a(new rjn(vjnVar2, uknVar));
                                                                            }
                                                                        }, (Executor) gciVar.get());
                                                                        vjnVar.h = a;
                                                                    } else {
                                                                        a = ((l3n) vjnVar.d.get()).a(new rjn(vjnVar, uknVar));
                                                                        vjnVar.h = a;
                                                                    }
                                                                    a.addListener(new i5l(a, 9), (Executor) vjnVar.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    kr1 a2 = mgnVar.a();
                                                    String str = (String) a2.b;
                                                    zwm zwmVar2 = mgnVar.b;
                                                    gci gciVar2 = zwmVar2.d;
                                                    ykn b2 = zwmVar2.g.b();
                                                    boolean z2 = b2.i;
                                                    if (b2.j) {
                                                        if (npn.c(str) && !z2) {
                                                            oq9 oq9Var2 = oq9.b;
                                                            return;
                                                        }
                                                        r0n t = j1n.t();
                                                        q24 q24Var = (q24) a2.e;
                                                        int i6 = q24Var.b;
                                                        x0n s = d1n.s();
                                                        s.c();
                                                        ((d1n) s.b).t(i6);
                                                        int i7 = q24Var.c;
                                                        s.c();
                                                        ((d1n) s.b).u(i7);
                                                        d1n d1nVar = (d1n) s.e();
                                                        t.c();
                                                        ((j1n) t.b).v(d1nVar);
                                                        if (!npn.c(str)) {
                                                            t.c();
                                                            ((j1n) t.b).u(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = mgnVar.c;
                                                            t.c();
                                                            ((j1n) t.b).w(str2);
                                                        }
                                                        l3n l3nVar = (l3n) gciVar2.get();
                                                        j1n j1nVar = (j1n) t.e();
                                                        qrm qrmVar = l3nVar.a;
                                                        di1 a3 = dpi.a();
                                                        a3.d = new nbi(j1nVar, 19);
                                                        a3.e = new gw7[]{enm.a};
                                                        a3.c = false;
                                                        b = l3n.b(qrmVar.doRead(a3.a()).k(pt6.INSTANCE, new r3l(7, qrmVar, j1nVar)));
                                                    } else {
                                                        if (npn.c(str)) {
                                                            oq9 oq9Var3 = oq9.b;
                                                            return;
                                                        }
                                                        l3n l3nVar2 = (l3n) gciVar2.get();
                                                        l3nVar2.getClass();
                                                        str.getClass();
                                                        b = l3n.b(l3nVar2.a.c(str));
                                                    }
                                                    ben benVar = new ben(mgnVar, 0);
                                                    lkb a4 = zwmVar2.a();
                                                    int i8 = a1.d;
                                                    a1 a1Var = new a1(b, t2n.class, benVar);
                                                    b.addListener(a1Var, lhn.b(a4, a1Var));
                                                    return;
                                            }
                                        }
                                    });
                                    kr1Var = new kr1(wln.z(), (q24) k.e);
                                    if (this.d || ((q24) kr1Var.e).c != 17) {
                                        this.a = kr1Var;
                                    }
                                } else {
                                    final int i4 = 2;
                                    ((wkc) zwmVar.a()).execute(new Runnable(this) { // from class: ndn
                                        public final /* synthetic */ mgn b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ue8 a;
                                            y0 b;
                                            int i42 = i4;
                                            mgn mgnVar = this.b;
                                            switch (i42) {
                                                case 0:
                                                    mgnVar.b();
                                                    return;
                                                case 1:
                                                    final vjn vjnVar = mgnVar.b.i;
                                                    w6l w6lVar = w6l.FILE;
                                                    boolean z = mgnVar.d;
                                                    len lenVar = len.a;
                                                    final ukn uknVar = (ukn) vjnVar.c.get();
                                                    if (uknVar == null && !z) {
                                                        oq9 oq9Var = oq9.b;
                                                        return;
                                                    }
                                                    int zza = 1 << w6lVar.zza();
                                                    if ((vjnVar.e & zza) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = vjnVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i5 = vjnVar.e;
                                                                if ((i5 & zza) == 0) {
                                                                    copyOnWriteArrayList.add(lenVar);
                                                                    vjnVar.e = zza | i5;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (vjnVar.h == null) {
                                                        synchronized (vjnVar.g) {
                                                            try {
                                                                if (vjnVar.h == null) {
                                                                    if (uknVar == null) {
                                                                        uknVar = ljn.a;
                                                                    }
                                                                    Context context = vjnVar.a;
                                                                    if (!fum.d(context)) {
                                                                        mb7 mb7Var = mb7.d;
                                                                        gci gciVar = vjnVar.b;
                                                                        a = r5.j(fum.c(context, Executors.callable(mb7Var, null), (Executor) gciVar.get()), new ym0() { // from class: ijn
                                                                            @Override // defpackage.ym0
                                                                            public final ujb apply(Object obj) {
                                                                                vjn vjnVar2 = vjn.this;
                                                                                return ((l3n) vjnVar2.d.get()).a(new rjn(vjnVar2, uknVar));
                                                                            }
                                                                        }, (Executor) gciVar.get());
                                                                        vjnVar.h = a;
                                                                    } else {
                                                                        a = ((l3n) vjnVar.d.get()).a(new rjn(vjnVar, uknVar));
                                                                        vjnVar.h = a;
                                                                    }
                                                                    a.addListener(new i5l(a, 9), (Executor) vjnVar.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    kr1 a2 = mgnVar.a();
                                                    String str = (String) a2.b;
                                                    zwm zwmVar2 = mgnVar.b;
                                                    gci gciVar2 = zwmVar2.d;
                                                    ykn b2 = zwmVar2.g.b();
                                                    boolean z2 = b2.i;
                                                    if (b2.j) {
                                                        if (npn.c(str) && !z2) {
                                                            oq9 oq9Var2 = oq9.b;
                                                            return;
                                                        }
                                                        r0n t = j1n.t();
                                                        q24 q24Var = (q24) a2.e;
                                                        int i6 = q24Var.b;
                                                        x0n s = d1n.s();
                                                        s.c();
                                                        ((d1n) s.b).t(i6);
                                                        int i7 = q24Var.c;
                                                        s.c();
                                                        ((d1n) s.b).u(i7);
                                                        d1n d1nVar = (d1n) s.e();
                                                        t.c();
                                                        ((j1n) t.b).v(d1nVar);
                                                        if (!npn.c(str)) {
                                                            t.c();
                                                            ((j1n) t.b).u(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = mgnVar.c;
                                                            t.c();
                                                            ((j1n) t.b).w(str2);
                                                        }
                                                        l3n l3nVar = (l3n) gciVar2.get();
                                                        j1n j1nVar = (j1n) t.e();
                                                        qrm qrmVar = l3nVar.a;
                                                        di1 a3 = dpi.a();
                                                        a3.d = new nbi(j1nVar, 19);
                                                        a3.e = new gw7[]{enm.a};
                                                        a3.c = false;
                                                        b = l3n.b(qrmVar.doRead(a3.a()).k(pt6.INSTANCE, new r3l(7, qrmVar, j1nVar)));
                                                    } else {
                                                        if (npn.c(str)) {
                                                            oq9 oq9Var3 = oq9.b;
                                                            return;
                                                        }
                                                        l3n l3nVar2 = (l3n) gciVar2.get();
                                                        l3nVar2.getClass();
                                                        str.getClass();
                                                        b = l3n.b(l3nVar2.a.c(str));
                                                    }
                                                    ben benVar = new ben(mgnVar, 0);
                                                    lkb a4 = zwmVar2.a();
                                                    int i8 = a1.d;
                                                    a1 a1Var = new a1(b, t2n.class, benVar);
                                                    b.addListener(a1Var, lhn.b(a4, a1Var));
                                                    return;
                                            }
                                        }
                                    });
                                    zwmVar.a.n((i7l) k.c, this.e, this.c);
                                    if (this.g.o()) {
                                        final int i5 = 1;
                                        ((wkc) zwmVar.a()).execute(new Runnable(this) { // from class: ndn
                                            public final /* synthetic */ mgn b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ue8 a;
                                                y0 b;
                                                int i42 = i5;
                                                mgn mgnVar = this.b;
                                                switch (i42) {
                                                    case 0:
                                                        mgnVar.b();
                                                        return;
                                                    case 1:
                                                        final vjn vjnVar = mgnVar.b.i;
                                                        w6l w6lVar = w6l.FILE;
                                                        boolean z = mgnVar.d;
                                                        len lenVar = len.a;
                                                        final ukn uknVar = (ukn) vjnVar.c.get();
                                                        if (uknVar == null && !z) {
                                                            oq9 oq9Var = oq9.b;
                                                            return;
                                                        }
                                                        int zza = 1 << w6lVar.zza();
                                                        if ((vjnVar.e & zza) == 0) {
                                                            CopyOnWriteArrayList copyOnWriteArrayList = vjnVar.f;
                                                            synchronized (copyOnWriteArrayList) {
                                                                try {
                                                                    int i52 = vjnVar.e;
                                                                    if ((i52 & zza) == 0) {
                                                                        copyOnWriteArrayList.add(lenVar);
                                                                        vjnVar.e = zza | i52;
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        }
                                                        if (vjnVar.h == null) {
                                                            synchronized (vjnVar.g) {
                                                                try {
                                                                    if (vjnVar.h == null) {
                                                                        if (uknVar == null) {
                                                                            uknVar = ljn.a;
                                                                        }
                                                                        Context context = vjnVar.a;
                                                                        if (!fum.d(context)) {
                                                                            mb7 mb7Var = mb7.d;
                                                                            gci gciVar = vjnVar.b;
                                                                            a = r5.j(fum.c(context, Executors.callable(mb7Var, null), (Executor) gciVar.get()), new ym0() { // from class: ijn
                                                                                @Override // defpackage.ym0
                                                                                public final ujb apply(Object obj) {
                                                                                    vjn vjnVar2 = vjn.this;
                                                                                    return ((l3n) vjnVar2.d.get()).a(new rjn(vjnVar2, uknVar));
                                                                                }
                                                                            }, (Executor) gciVar.get());
                                                                            vjnVar.h = a;
                                                                        } else {
                                                                            a = ((l3n) vjnVar.d.get()).a(new rjn(vjnVar, uknVar));
                                                                            vjnVar.h = a;
                                                                        }
                                                                        a.addListener(new i5l(a, 9), (Executor) vjnVar.b.get());
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        kr1 a2 = mgnVar.a();
                                                        String str = (String) a2.b;
                                                        zwm zwmVar2 = mgnVar.b;
                                                        gci gciVar2 = zwmVar2.d;
                                                        ykn b2 = zwmVar2.g.b();
                                                        boolean z2 = b2.i;
                                                        if (b2.j) {
                                                            if (npn.c(str) && !z2) {
                                                                oq9 oq9Var2 = oq9.b;
                                                                return;
                                                            }
                                                            r0n t = j1n.t();
                                                            q24 q24Var = (q24) a2.e;
                                                            int i6 = q24Var.b;
                                                            x0n s = d1n.s();
                                                            s.c();
                                                            ((d1n) s.b).t(i6);
                                                            int i7 = q24Var.c;
                                                            s.c();
                                                            ((d1n) s.b).u(i7);
                                                            d1n d1nVar = (d1n) s.e();
                                                            t.c();
                                                            ((j1n) t.b).v(d1nVar);
                                                            if (!npn.c(str)) {
                                                                t.c();
                                                                ((j1n) t.b).u(str);
                                                            }
                                                            if (z2) {
                                                                String str2 = mgnVar.c;
                                                                t.c();
                                                                ((j1n) t.b).w(str2);
                                                            }
                                                            l3n l3nVar = (l3n) gciVar2.get();
                                                            j1n j1nVar = (j1n) t.e();
                                                            qrm qrmVar = l3nVar.a;
                                                            di1 a3 = dpi.a();
                                                            a3.d = new nbi(j1nVar, 19);
                                                            a3.e = new gw7[]{enm.a};
                                                            a3.c = false;
                                                            b = l3n.b(qrmVar.doRead(a3.a()).k(pt6.INSTANCE, new r3l(7, qrmVar, j1nVar)));
                                                        } else {
                                                            if (npn.c(str)) {
                                                                oq9 oq9Var3 = oq9.b;
                                                                return;
                                                            }
                                                            l3n l3nVar2 = (l3n) gciVar2.get();
                                                            l3nVar2.getClass();
                                                            str.getClass();
                                                            b = l3n.b(l3nVar2.a.c(str));
                                                        }
                                                        ben benVar = new ben(mgnVar, 0);
                                                        lkb a4 = zwmVar2.a();
                                                        int i8 = a1.d;
                                                        a1 a1Var = new a1(b, t2n.class, benVar);
                                                        b.addListener(a1Var, lhn.b(a4, a1Var));
                                                        return;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                            kr1Var = k;
                            if (this.d) {
                            }
                            this.a = kr1Var;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            throw th;
                        }
                    }
                } finally {
                }
            }
            return kr1Var;
        }
        return kr1Var2;
    }

    public final void b() {
        xwi xwiVar = this.g;
        zwm zwmVar = (zwm) xwiVar.a;
        l3n l3nVar = (l3n) zwmVar.d.get();
        String str = (String) xwiVar.c;
        l3nVar.getClass();
        str.getClass();
        qrm qrmVar = l3nVar.a;
        di1 a = dpi.a();
        a.d = new tj(str, 8);
        q5 i2 = r5.i(l3n.b(qrmVar.doRead(a.a()).i(pt6.INSTANCE, new nhj(20))), hal.d, zwmVar.a());
        ben benVar = new ben(xwiVar, 1);
        zwm zwmVar2 = this.b;
        r5.j(i2, benVar, zwmVar2.a()).addListener(new k3n(5, this, i2), zwmVar2.a());
    }
}
