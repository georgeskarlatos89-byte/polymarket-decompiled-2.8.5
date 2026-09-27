package bo.app;

import android.content.Context;
import com.socure.idplus.device.internal.behavior.model.NavigationContext;
import defpackage.b69;
import defpackage.d2i;
import defpackage.dmk;
import defpackage.fe9;
import defpackage.fq5;
import defpackage.psk;
import defpackage.syk;
import defpackage.u10;
import defpackage.v0l;
import defpackage.w1l;
import defpackage.zv5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class y7 {
    public static final String j = b69.s(y7.class);
    public final x9 a;
    public final i6 b;
    public long c;
    public long d;
    public final ArrayList e = new ArrayList();
    public long f;
    public final long g;
    public final s8 h;
    public xg i;

    public y7(x9 x9Var, i6 i6Var) {
        long j2;
        this.a = x9Var;
        this.b = i6Var;
        int ordinal = x9Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                j2 = 0;
            } else {
                j2 = 75;
            }
        } else {
            j2 = 25;
        }
        this.g = j2;
        this.h = new s8(i6Var.a.j.j(), 45000, i6Var.a.j.k(), i6Var.a.j.l());
    }

    public abstract void a(long j2);

    public final void a(long j2, ke keVar) {
        keVar.getClass();
        xg b = b();
        if (b == null) {
            return;
        }
        TimeZone timeZone = zv5.a;
        long currentTimeMillis = System.currentTimeMillis();
        double a = b.a(currentTimeMillis);
        b.e = a;
        wg wgVar = b.c;
        fq5 fq5Var = fq5.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        wgVar.writeData(fq5Var, Float.valueOf((float) a));
        b.d = currentTimeMillis;
        b.c.writeData(fq5.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(currentTimeMillis));
        double d = b.e;
        if (d >= 1.0d) {
            double d2 = d - 1.0d;
            b.e = d2;
            b.c.writeData(fq5Var, Float.valueOf((float) d2));
        }
        xg b2 = b();
        if (b2 != null && b2.a(j2) < 1.0d) {
            b69.h(this, null, null, c(), new syk(keVar, j2, b.a(), b, 1), 3);
        }
        b69.h(this, null, null, false, new w1l(this, j2, 3), 7);
    }

    public final void b(long j2) {
        int i;
        a(j2);
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((ke) obj).d == le.BATCHED) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                int i4 = ((ke) it.next()).h;
                loop1: while (true) {
                    i = i4;
                    while (it.hasNext()) {
                        i4 = ((ke) it.next()).h;
                        if (i < i4) {
                            break;
                        }
                    }
                }
                ArrayList arrayList3 = this.e;
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList3.get(i5);
                    i5++;
                    if (((ke) obj2).d.a()) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ke keVar = (ke) arrayList4.get(i6);
                    keVar.h = i;
                    b69.h(this, null, null, c(), new fe9(i, 2, j2, keVar), 3);
                }
            } else {
                dmk.t();
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.e;
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList6.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj3 = arrayList6.get(i7);
            i7++;
            le leVar = ((ke) obj3).d;
            if (leVar == le.BATCHED || leVar == le.COMPLETE) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.e;
        ArrayList arrayList9 = new ArrayList();
        int size5 = arrayList8.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj4 = arrayList8.get(i8);
            i8++;
            ke keVar2 = (ke) obj4;
            if (keVar2.h >= 15 && keVar2.d.a()) {
                arrayList9.add(obj4);
            }
        }
        arrayList5.addAll(arrayList9);
        int size6 = arrayList5.size();
        while (i2 < size6) {
            Object obj5 = arrayList5.get(i2);
            i2++;
            ke keVar3 = (ke) obj5;
            b69.o(j, null, null, c(), new psk(keVar3, j2, 6), 6);
            keVar3.a.b(this.b.a.i);
        }
        this.e.removeAll(arrayList5);
    }

    public final void c(long j2) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((ke) obj).d.a()) {
                arrayList2.add(obj);
            }
        }
        List z0 = CollectionsKt.z0(arrayList2, new x7());
        if (z0.size() >= 2) {
            int size2 = z0.size();
            for (int i2 = 1; i2 < size2; i2++) {
                ke keVar = (ke) z0.get(i2);
                b69.o(j, null, null, c(), new v0l(keVar, 9), 6);
                keVar.a(j2, le.BATCHED);
            }
        }
    }

    public final String d(long j2) {
        String str;
        String N = CollectionsKt.N(this.e, "\n\n", null, null, new u10(j2, 26), 30);
        StringBuilder sb = new StringBuilder("\n            |EndpointQueue: ");
        sb.append(this.a);
        sb.append("\n            |   lastFailureAt = ");
        sb.append(this.c - j2);
        sb.append("\n            |   lastSuccessAt = ");
        sb.append(this.d - j2);
        sb.append("\n            |   failureBackoffUntil = ");
        sb.append(this.f - j2);
        sb.append("\n            |   pendingWaitDuration = ");
        sb.append(this.g);
        sb.append("\n            |   endpointRateLimiter = ");
        xg xgVar = this.i;
        if (xgVar != null) {
            str = xgVar.toString();
        } else {
            str = NavigationContext.UNSET;
        }
        sb.append(str);
        sb.append("\n            |   requestInfoQueue: \n            |");
        sb.append(N);
        sb.append("\n            ");
        return kotlin.text.c.d(sb.toString());
    }

    public boolean c() {
        return false;
    }

    public static final String c(y7 y7Var, long j2) {
        return "New state after request error " + y7Var.d(j2);
    }

    public static final String d(y7 y7Var, long j2) {
        return "New state after request success\n" + y7Var.d(j2);
    }

    public final void a(long j2, y9 y9Var) {
        y9Var.getClass();
        y9Var.a(this.b.a.i);
        this.e.add(new ke(y9Var, j2 + this.g, j2));
        b69.h(this, null, null, c(), new w1l(this, j2, 2), 3);
    }

    public s8 a() {
        return this.h;
    }

    public static final String a(y7 y7Var, long j2) {
        return "Added request now to queue " + y7Var.d(j2);
    }

    public static final String a(ke keVar, long j2, int i) {
        return "Set retry count for " + keVar.a(j2) + " to " + i;
    }

    public static final String a(ke keVar, long j2) {
        return "Marking request as framework complete \n" + keVar.a(j2);
    }

    public static final String a(ke keVar, long j2, long j3, xg xgVar) {
        return "Delaying next request after '" + keVar.a(j2) + "' until next token is available in " + j3 + "ms - '" + zv5.d(j2 + j3) + "'\n" + xgVar;
    }

    public static final String a(ke keVar) {
        return "About to batch request " + keVar;
    }

    public void a(long j2, ke keVar, j jVar) {
        keVar.getClass();
        kc kcVar = jVar instanceof kc ? (kc) jVar : null;
        na naVar = kcVar != null ? kcVar.d : null;
        Long l = jVar.b;
        long longValue = l != null ? l.longValue() : 0L;
        this.c = j2;
        if (!(naVar instanceof qe)) {
            s8 a = a();
            this.f = longValue + j2 + a.a(a.b);
        }
        b69.o(j, null, null, c(), new w1l(this, j2, 0), 6);
    }

    public void a(long j2, ke keVar, kc kcVar) {
        keVar.getClass();
        a().f = 0;
        this.d = j2;
        b69.o(j, null, null, c(), new w1l(this, j2, 1), 6);
    }

    public final xg b() {
        qf qfVar = (qf) this.b.a.j.A().get(this.a);
        if (qfVar == null) {
            this.i = null;
            return null;
        }
        xg xgVar = this.i;
        int i = qfVar.b;
        int i2 = qfVar.a;
        if (xgVar == null) {
            i6 i6Var = this.b;
            String valueOf = String.valueOf(this.a.a.hashCode());
            valueOf.getClass();
            ci ciVar = i6Var.a;
            Context context = ciVar.a;
            xgVar = new xg(i2, i, new wg(context, s0.a("com.braze.tokenbucket.com.braze.endpointqueue.tokenbucket.", valueOf, d2i.b(context, ciVar.e, ciVar.f))));
        } else {
            xgVar.a(i2, i);
        }
        this.i = xgVar;
        return xgVar;
    }

    public static final String b(y7 y7Var, long j2) {
        return y7Var.d(j2);
    }

    public static final CharSequence b(long j2, ke keVar) {
        keVar.getClass();
        return keVar.a(j2);
    }
}
