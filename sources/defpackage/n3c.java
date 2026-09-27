package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n3c extends sl8 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public n3c(v2j v2jVar, Object obj, Object obj2) {
        super(v2jVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.sl8, defpackage.v2j
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.sl8, defpackage.v2j
    public final n2j f(int i, n2j n2jVar, boolean z) {
        this.b.f(i, n2jVar, z);
        if (Objects.equals(n2jVar.b, this.d) && z) {
            n2jVar.b = e;
        }
        return n2jVar;
    }

    @Override // defpackage.sl8, defpackage.v2j
    public final Object l(int i) {
        Object l = this.b.l(i);
        if (Objects.equals(l, this.d)) {
            return e;
        }
        return l;
    }

    @Override // defpackage.sl8, defpackage.v2j
    public final o2j m(int i, o2j o2jVar, long j) {
        this.b.m(i, o2jVar, j);
        if (Objects.equals(o2jVar.a, this.c)) {
            o2jVar.a = o2j.q;
        }
        return o2jVar;
    }
}
