package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wqm {
    public static final wqm c = new wqm(0);
    public final x2n a = new x2n();
    public boolean b;

    public wqm(int i) {
        c();
        c();
    }

    public final wqm a() {
        wqm wqmVar = new wqm();
        x2n x2nVar = this.a;
        if (x2nVar.b <= 0) {
            Iterator it = x2nVar.a().iterator();
            if (!it.hasNext()) {
                return wqmVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                dmk.p();
                return null;
            }
            entry.getValue();
            throw null;
        }
        x2nVar.c(0).a.getClass();
        dmk.p();
        return null;
    }

    public final Iterator b() {
        x2n x2nVar = this.a;
        if (x2nVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return ((zk0) x2nVar.entrySet()).iterator();
    }

    public final void c() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        x2n x2nVar = this.a;
        int i = x2nVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = x2nVar.c(i2).b;
            if (obj instanceof usm) {
                usm usmVar = (usm) obj;
                usmVar.getClass();
                m1n.c.a(usmVar.getClass()).zzf(usmVar);
                usmVar.d();
            }
        }
        if (!x2nVar.d) {
            if (x2nVar.b <= 0) {
                Iterator it = x2nVar.a().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    dmk.p();
                    return;
                }
            } else {
                x2nVar.c(0).a.getClass();
                dmk.p();
                return;
            }
        }
        if (!x2nVar.d) {
            if (x2nVar.c.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(x2nVar.c);
            }
            x2nVar.c = unmodifiableMap;
            if (x2nVar.f.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(x2nVar.f);
            }
            x2nVar.f = unmodifiableMap2;
            x2nVar.d = true;
        }
        this.b = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final void d() {
        x2n x2nVar = this.a;
        if (x2nVar.b <= 0) {
            Iterator it = x2nVar.a().iterator();
            if (!it.hasNext()) {
                return;
            }
            ((Map.Entry) it.next()).getKey().getClass();
            dmk.p();
            return;
        }
        x2nVar.c(0).getKey().getClass();
        dmk.p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqm)) {
            return false;
        }
        return this.a.equals(((wqm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wqm() {
    }
}
