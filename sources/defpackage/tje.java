package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tje extends q3 implements jke {
    public static final tje f = new tje(ydj.e, 0);
    public final ydj d;
    public final int e;

    public tje(ydj ydjVar, int i) {
        ydjVar.getClass();
        this.d = ydjVar;
        this.e = i;
    }

    @Override // defpackage.q3
    public final Set a() {
        return new fke(this, 0);
    }

    @Override // defpackage.q3
    public final Set b() {
        return new fke(this, 1);
    }

    @Override // defpackage.q3
    public final int c() {
        return this.e;
    }

    @Override // defpackage.q3, java.util.Map
    public final boolean containsKey(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.d.d(i, 0, obj);
    }

    @Override // defpackage.q3
    public final Collection d() {
        return new p3(this, 2);
    }

    @Override // defpackage.q3, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.e != map.size()) {
                return false;
            }
            boolean z = map instanceof lke;
            ydj ydjVar = this.d;
            if (z) {
                return ydjVar.g(((lke) obj).f.d, r0.u);
            }
            if (map instanceof mke) {
                return ydjVar.g(((mke) obj).d.c, r0.v);
            }
            if (map instanceof tje) {
                return ydjVar.g(((tje) obj).d, r0.w);
            }
            if (map instanceof wje) {
                return ydjVar.g(((wje) obj).c, r0.x);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.q3, java.util.Map
    public final Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.d.h(i, 0, obj);
    }
}
