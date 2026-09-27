package io.sentry;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.dmk;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e implements j2, Comparable {
    public static final Map k = Collections.EMPTY_MAP;
    public final Long a;
    public Date b;
    public final Long c;
    public String d;
    public String e;
    public volatile Map f;
    public String g;
    public String h;
    public p5 i;
    public ConcurrentHashMap j;

    public e(e eVar) {
        ConcurrentHashMap p;
        this.f = k;
        this.c = Long.valueOf(System.nanoTime());
        this.b = eVar.b;
        this.a = eVar.a;
        this.d = eVar.d;
        this.e = eVar.e;
        this.g = eVar.g;
        this.h = eVar.h;
        if (!eVar.f.isEmpty() && (p = io.sentry.util.b.p(eVar.f)) != null) {
            this.f = p;
        }
        this.j = io.sentry.util.b.p(eVar.j);
        this.i = eVar.i;
    }

    public static boolean a(e eVar, e eVar2) {
        if (eVar.c().getTime() == eVar2.c().getTime() && io.sentry.util.b.j(eVar.d, eVar2.d) && io.sentry.util.b.j(eVar.e, eVar2.e) && io.sentry.util.b.j(eVar.g, eVar2.g) && io.sentry.util.b.j(eVar.h, eVar2.h) && eVar.i == eVar2.i) {
            return true;
        }
        return false;
    }

    public final Map b() {
        Map map;
        Map map2 = this.f;
        Map map3 = k;
        if (map2 == map3) {
            synchronized (this) {
                try {
                    map = this.f;
                    if (map == map3) {
                        map = new ConcurrentHashMap();
                        this.f = map;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }
        return map2;
    }

    public final Date c() {
        Date date = this.b;
        if (date != null) {
            return date;
        }
        Long l = this.a;
        if (l != null) {
            Date date2 = new Date(l.longValue());
            this.b = date2;
            return date2;
        }
        dmk.n("No timestamp set for breadcrumb");
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c.compareTo(((e) obj).c);
    }

    public final void d(Object obj, String str) {
        if (str != null) {
            if (obj == null) {
                Map map = this.f;
                if (map != k) {
                    map.remove(str);
                    return;
                }
                return;
            }
            b().put(str, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if ("http".equals(this.e)) {
                    if (a(this, eVar) && io.sentry.util.b.j(this.f.get(Keys.KEY_STATUS_CODE), eVar.f.get(Keys.KEY_STATUS_CODE)) && io.sentry.util.b.j(this.f.get("url"), eVar.f.get("url")) && io.sentry.util.b.j(this.f.get("method"), eVar.f.get("method")) && io.sentry.util.b.j(this.f.get("http.fragment"), eVar.f.get("http.fragment")) && io.sentry.util.b.j(this.f.get("http.query"), eVar.f.get("http.query"))) {
                        return true;
                    }
                    return false;
                }
                return a(this, eVar);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if ("http".equals(this.e)) {
            return Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.d, this.e, this.g, this.h, this.i, this.f.get(Keys.KEY_STATUS_CODE), this.f.get("url"), this.f.get("method"), this.f.get("http.fragment"), this.f.get("http.query")});
        }
        return Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.d, this.e, this.g, this.h, this.i});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        String f;
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u("timestamp");
        Long l = this.a;
        if (l != null) {
            f = io.sentry.vendor.a.f(l.longValue());
        } else {
            f = io.sentry.vendor.a.f(c().getTime());
        }
        cVar.D(f);
        if (this.d != null) {
            cVar.u("message");
            cVar.D(this.d);
        }
        if (this.e != null) {
            cVar.u("type");
            cVar.D(this.e);
        }
        cVar.u(ApiConstant.KEY_DATA);
        cVar.A(x0Var, this.f);
        if (this.g != null) {
            cVar.u("category");
            cVar.D(this.g);
        }
        if (this.h != null) {
            cVar.u("origin");
            cVar.D(this.h);
        }
        if (this.i != null) {
            cVar.u("level");
            cVar.A(x0Var, this.i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.z(this.j, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }

    public e(long j) {
        this.f = k;
        this.c = Long.valueOf(System.nanoTime());
        this.a = Long.valueOf(j);
        this.b = null;
    }

    public e(Date date) {
        this.f = k;
        this.c = Long.valueOf(System.nanoTime());
        this.b = date;
        this.a = null;
    }

    public e() {
        this(System.currentTimeMillis());
    }
}
