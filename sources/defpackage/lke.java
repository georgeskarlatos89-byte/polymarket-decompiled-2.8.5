package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lke extends q3 implements jke {
    public static final lke g;
    public final Object d;
    public final Object e;
    public final tje f;

    static {
        vvn vvnVar = vvn.h;
        tje tjeVar = tje.f;
        tjeVar.getClass();
        g = new lke(vvnVar, vvnVar, tjeVar);
    }

    public lke(Object obj, Object obj2, tje tjeVar) {
        this.d = obj;
        this.e = obj2;
        this.f = tjeVar;
    }

    @Override // defpackage.q3
    public final Set a() {
        return new pke(this, 0);
    }

    @Override // defpackage.q3
    public final Set b() {
        return new pke(this, 1);
    }

    @Override // defpackage.q3
    public final int c() {
        return this.f.c();
    }

    @Override // defpackage.q3, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // defpackage.q3
    public final Collection d() {
        return new p3(this, 4);
    }

    @Override // defpackage.q3, java.util.Map
    public final boolean equals(Object obj) {
        tje tjeVar = this.f;
        ydj ydjVar = tjeVar.d;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (tjeVar.c() != map.size()) {
                return false;
            }
            if (map instanceof lke) {
                return ydjVar.g(((lke) obj).f.d, r0.C);
            }
            if (map instanceof mke) {
                return ydjVar.g(((mke) obj).d.c, r0.D);
            }
            if (map instanceof tje) {
                return ydjVar.g(((tje) obj).d, r0.E);
            }
            if (map instanceof wje) {
                return ydjVar.g(((wje) obj).c, kke.b);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.q3, java.util.Map
    public final Object get(Object obj) {
        gib gibVar = (gib) this.f.get(obj);
        if (gibVar != null) {
            return gibVar.a;
        }
        return null;
    }
}
