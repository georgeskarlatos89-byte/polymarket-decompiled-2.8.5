package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class uje extends q3 implements Map, xja {
    public static final uje f = new uje(zdj.e, 0);
    public final zdj d;
    public final int e;

    public uje(zdj zdjVar, int i) {
        this.d = zdjVar;
        this.e = i;
    }

    @Override // defpackage.q3
    public final Set a() {
        return new gke(this, 0);
    }

    @Override // defpackage.q3
    public final Set b() {
        return new gke(this, 1);
    }

    @Override // defpackage.q3
    public final int c() {
        return this.e;
    }

    @Override // defpackage.q3, java.util.Map
    public boolean containsKey(Object obj) {
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
        return new p3(this, 3);
    }

    public xje f() {
        return new xje(this);
    }

    public /* bridge */ xje g() {
        return f();
    }

    @Override // defpackage.q3, java.util.Map
    public Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.d.g(i, 0, obj);
    }

    public final uje h(Object obj, hib hibVar) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        v0h u = this.d.u(obj, i, 0, hibVar);
        if (u == null) {
            return this;
        }
        return new uje((zdj) u.c, this.e + u.b);
    }
}
