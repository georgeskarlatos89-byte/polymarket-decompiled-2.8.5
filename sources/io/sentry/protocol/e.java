package io.sentry.protocol;

import io.sentry.c7;
import io.sentry.j2;
import io.sentry.l3;
import io.sentry.r3;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class e implements j2 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final io.sentry.util.a b = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, io.sentry.util.a] */
    /* JADX WARN: Type inference failed for: r0v10, types: [io.sentry.r3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, io.sentry.protocol.m] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, io.sentry.protocol.k] */
    /* JADX WARN: Type inference failed for: r0v14, types: [io.sentry.protocol.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [io.sentry.protocol.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, io.sentry.protocol.h] */
    /* JADX WARN: Type inference failed for: r0v17, types: [io.sentry.protocol.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [io.sentry.protocol.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [io.sentry.protocol.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, io.sentry.protocol.g0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [io.sentry.protocol.s, java.lang.Object] */
    public e(e eVar) {
        String[] strArr;
        for (Map.Entry entry : eVar.c()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    ?? obj = new Object();
                    obj.g = aVar.g;
                    obj.a = aVar.a;
                    obj.e = aVar.e;
                    obj.b = aVar.b;
                    obj.f = aVar.f;
                    obj.d = aVar.d;
                    obj.c = aVar.c;
                    obj.h = io.sentry.util.b.p(aVar.h);
                    obj.k = aVar.k;
                    List list = aVar.i;
                    obj.i = list != null ? new ArrayList(list) : null;
                    obj.j = aVar.j;
                    obj.l = aVar.l;
                    obj.m = aVar.m;
                    obj.n = io.sentry.util.b.p(aVar.n);
                    n(obj);
                } else if ("browser".equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    ?? obj2 = new Object();
                    obj2.a = dVar.a;
                    obj2.b = dVar.b;
                    obj2.c = io.sentry.util.b.p(dVar.c);
                    o(obj2);
                } else if ("device".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    ?? obj3 = new Object();
                    obj3.a = hVar.a;
                    obj3.b = hVar.b;
                    obj3.c = hVar.c;
                    obj3.d = hVar.d;
                    obj3.e = hVar.e;
                    obj3.f = hVar.f;
                    obj3.i = hVar.i;
                    obj3.j = hVar.j;
                    obj3.k = hVar.k;
                    obj3.l = hVar.l;
                    obj3.m = hVar.m;
                    obj3.n = hVar.n;
                    obj3.o = hVar.o;
                    obj3.p = hVar.p;
                    obj3.q = hVar.q;
                    obj3.r = hVar.r;
                    obj3.s = hVar.s;
                    obj3.t = hVar.t;
                    obj3.u = hVar.u;
                    obj3.v = hVar.v;
                    obj3.w = hVar.w;
                    obj3.x = hVar.x;
                    obj3.y = hVar.y;
                    obj3.A = hVar.A;
                    obj3.C = hVar.C;
                    obj3.D = hVar.D;
                    obj3.h = hVar.h;
                    String[] strArr2 = hVar.g;
                    if (strArr2 != null) {
                        strArr = (String[]) strArr2.clone();
                    } else {
                        strArr = null;
                    }
                    obj3.g = strArr;
                    obj3.B = hVar.B;
                    TimeZone timeZone = hVar.z;
                    obj3.z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    obj3.E = hVar.E;
                    obj3.F = hVar.F;
                    obj3.G = hVar.G;
                    obj3.H = hVar.H;
                    obj3.I = io.sentry.util.b.p(hVar.I);
                    p(obj3);
                } else if ("os".equals(entry.getKey()) && (value instanceof q)) {
                    q qVar = (q) value;
                    ?? obj4 = new Object();
                    obj4.a = qVar.a;
                    obj4.b = qVar.b;
                    obj4.c = qVar.c;
                    obj4.d = qVar.d;
                    obj4.e = qVar.e;
                    obj4.f = qVar.f;
                    obj4.g = io.sentry.util.b.p(qVar.g);
                    s(obj4);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof y)) {
                    y yVar = (y) value;
                    ?? obj5 = new Object();
                    obj5.a = yVar.a;
                    obj5.b = yVar.b;
                    obj5.c = yVar.c;
                    obj5.d = io.sentry.util.b.p(yVar.d);
                    u(obj5);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    ?? obj6 = new Object();
                    obj6.a = kVar.a;
                    obj6.b = kVar.b;
                    obj6.c = kVar.c;
                    obj6.d = kVar.d;
                    obj6.e = kVar.e;
                    obj6.f = kVar.f;
                    obj6.g = io.sentry.util.b.p(kVar.g);
                    l(obj6, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    ?? obj7 = new Object();
                    obj7.a = mVar.a;
                    obj7.b = mVar.b;
                    obj7.c = mVar.c;
                    obj7.d = mVar.d;
                    obj7.e = mVar.e;
                    obj7.f = mVar.f;
                    obj7.g = mVar.g;
                    obj7.h = mVar.h;
                    obj7.i = mVar.i;
                    obj7.j = io.sentry.util.b.p(mVar.j);
                    r(obj7);
                } else if ("trace".equals(entry.getKey()) && (value instanceof c7)) {
                    w(new c7((c7) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof r3)) {
                    r3 r3Var = (r3) value;
                    ?? obj8 = new Object();
                    obj8.a = r3Var.a;
                    ConcurrentHashMap p = io.sentry.util.b.p(r3Var.b);
                    if (p != null) {
                        obj8.b = p;
                    }
                    l(obj8, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof s)) {
                    s sVar = (s) value;
                    ?? obj9 = new Object();
                    obj9.a = sVar.a;
                    obj9.b = io.sentry.util.b.p(sVar.b);
                    obj9.f = io.sentry.util.b.p(sVar.f);
                    obj9.c = sVar.c;
                    obj9.d = sVar.d;
                    obj9.e = sVar.e;
                    t(obj9);
                } else if ("spring".equals(entry.getKey()) && (value instanceof g0)) {
                    g0 g0Var = (g0) value;
                    ?? obj10 = new Object();
                    obj10.a = g0Var.a;
                    obj10.b = io.sentry.util.b.p(g0Var.b);
                    v(obj10);
                } else if ("art".equals(entry.getKey()) && (value instanceof c)) {
                    c cVar = (c) value;
                    ?? obj11 = new Object();
                    obj11.a = cVar.a;
                    obj11.b = cVar.b;
                    obj11.c = cVar.c;
                    obj11.d = cVar.d;
                    obj11.e = cVar.e;
                    obj11.f = cVar.f;
                    obj11.g = cVar.g;
                    obj11.h = cVar.h;
                    obj11.i = cVar.i;
                    obj11.j = cVar.j;
                    obj11.k = cVar.k;
                    obj11.l = io.sentry.util.b.p(cVar.l);
                    l(obj11, "art");
                } else {
                    l(value, (String) entry.getKey());
                }
            }
        }
    }

    public void a() {
        this.a.clear();
    }

    public boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsKey(obj);
    }

    public Set c() {
        return this.a.entrySet();
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.a.get(obj);
    }

    public a e() {
        return (a) x(a.class, "app");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public h f() {
        return (h) x(h.class, "device");
    }

    public j g() {
        return (j) x(j.class, "flags");
    }

    public q h() {
        return (q) x(q.class, "os");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y i() {
        return (y) x(y.class, "runtime");
    }

    public c7 j() {
        return (c7) x(c7.class, "trace");
    }

    public Enumeration k() {
        return this.a.keys();
    }

    public Object l(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        if (obj == null) {
            return concurrentHashMap.remove(str);
        }
        return concurrentHashMap.put(str, obj);
    }

    public void m(e eVar) {
        if (eVar == null) {
            return;
        }
        this.a.putAll(eVar.a);
    }

    public void n(a aVar) {
        l(aVar, "app");
    }

    public void o(d dVar) {
        l(dVar, "browser");
    }

    public void p(h hVar) {
        l(hVar, "device");
    }

    public void q(j jVar) {
        l(jVar, "flags");
    }

    public void r(m mVar) {
        l(mVar, "gpu");
    }

    public void s(q qVar) {
        l(qVar, "os");
    }

    @Override // io.sentry.j2
    public void serialize(l3 l3Var, x0 x0Var) {
        String[] strArr;
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        Enumeration k = k();
        int size = this.a.size();
        if (size == 0) {
            strArr = io.sentry.util.b.a;
        } else {
            strArr = new String[size];
        }
        int i = 0;
        while (k.hasMoreElements()) {
            if (i == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            }
            strArr[i] = (String) k.nextElement();
            i++;
        }
        if (i != strArr.length) {
            strArr = (String[]) Arrays.copyOf(strArr, i);
        }
        Arrays.sort(strArr);
        for (String str : strArr) {
            Object d = d(str);
            if (d != null) {
                cVar.u(str);
                cVar.A(x0Var, d);
            }
        }
        cVar.p();
    }

    public void t(s sVar) {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            l(sVar, "response");
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

    public void u(y yVar) {
        l(yVar, "runtime");
    }

    public void v(g0 g0Var) {
        l(g0Var, "spring");
    }

    public void w(c7 c7Var) {
        io.sentry.util.b.t(c7Var, "traceContext is required");
        l(c7Var, "trace");
    }

    public final Object x(Class cls, String str) {
        Object d = d(str);
        if (cls.isInstance(d)) {
            return cls.cast(d);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, io.sentry.util.a] */
    public e() {
    }
}
