package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gdh implements hxh, Map, bka {
    public fdh a;
    public final rch b;
    public final sch c;
    public final rch d;

    /* JADX WARN: Type inference failed for: r0v2, types: [tch, sch] */
    public gdh() {
        uje ujeVar = uje.f;
        kch h = qch.h();
        fdh fdhVar = new fdh(h.g(), ujeVar);
        if (!(h instanceof rw8)) {
            fdhVar.b = new fdh(1L, ujeVar);
        }
        this.a = fdhVar;
        this.b = new rch(this, 0);
        this.c = new tch(this);
        this.d = new rch(this, 1);
    }

    public static boolean a(fdh fdhVar, int i, uje ujeVar) {
        boolean z;
        synchronized (zzm.a) {
            int i2 = fdhVar.d;
            if (i2 == i) {
                fdhVar.c = ujeVar;
                z = true;
                fdhVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hxh
    public final mxh O() {
        return this.a;
    }

    public final fdh b() {
        return (fdh) qch.s(this.a, this);
    }

    @Override // java.util.Map
    public final void clear() {
        kch h;
        uje ujeVar = ((fdh) qch.f(this.a)).c;
        uje ujeVar2 = uje.f;
        if (ujeVar2 != ujeVar) {
            fdh fdhVar = this.a;
            synchronized (qch.c) {
                h = qch.h();
                fdh fdhVar2 = (fdh) qch.w(fdhVar, this, h);
                synchronized (zzm.a) {
                    fdhVar2.c = ujeVar2;
                    fdhVar2.d++;
                }
            }
            qch.l(h, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // defpackage.hxh
    public final void l(mxh mxhVar) {
        this.a = (fdh) mxhVar;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        uje ujeVar;
        int i;
        Object put;
        kch h;
        boolean a;
        do {
            synchronized (zzm.a) {
                fdh fdhVar = (fdh) qch.f(this.a);
                ujeVar = fdhVar.c;
                i = fdhVar.d;
            }
            ujeVar.getClass();
            xje g = ujeVar.g();
            put = g.put(obj, obj2);
            uje f = g.f();
            if (Intrinsics.areEqual(f, ujeVar)) {
                break;
            }
            fdh fdhVar2 = this.a;
            synchronized (qch.c) {
                h = qch.h();
                a = a((fdh) qch.w(fdhVar2, this, h), i, f);
            }
            qch.l(h, this);
        } while (!a);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        uje ujeVar;
        int i;
        kch h;
        boolean a;
        do {
            synchronized (zzm.a) {
                fdh fdhVar = (fdh) qch.f(this.a);
                ujeVar = fdhVar.c;
                i = fdhVar.d;
            }
            ujeVar.getClass();
            xje g = ujeVar.g();
            g.putAll(map);
            uje f = g.f();
            if (!Intrinsics.areEqual(f, ujeVar)) {
                fdh fdhVar2 = this.a;
                synchronized (qch.c) {
                    h = qch.h();
                    a = a((fdh) qch.w(fdhVar2, this, h), i, f);
                }
                qch.l(h, this);
            } else {
                return;
            }
        } while (!a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        uje ujeVar;
        int i;
        V remove;
        kch h;
        boolean a;
        do {
            synchronized (zzm.a) {
                fdh fdhVar = (fdh) qch.f(this.a);
                ujeVar = fdhVar.c;
                i = fdhVar.d;
            }
            ujeVar.getClass();
            xje g = ujeVar.g();
            remove = g.remove(obj);
            uje f = g.f();
            if (Intrinsics.areEqual(f, ujeVar)) {
                break;
            }
            fdh fdhVar2 = this.a;
            synchronized (qch.c) {
                h = qch.h();
                a = a((fdh) qch.w(fdhVar2, this, h), i, f);
            }
            qch.l(h, this);
        } while (!a);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((fdh) qch.f(this.a)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
