package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yh6 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public yh6(String str, jk8 jk8Var, List list, Function2 function2, llj lljVar, Function1 function1, nk8 nk8Var, boolean z, swh swhVar, k3h k3hVar, epf epfVar, xw1 xw1Var, u39 u39Var) {
        str.getClass();
        list.getClass();
        swhVar.getClass();
        k3hVar.getClass();
        u39Var.getClass();
        this.b = str;
        this.c = jk8Var;
        this.d = list;
        this.e = function2;
        this.f = lljVar;
        this.g = function1;
        this.h = nk8Var;
        this.a = z;
        this.i = xw1Var;
        this.j = u39Var;
        uwh a = n0n.a(Boolean.FALSE);
        this.k = a;
        this.l = epl.g(swhVar, epfVar, a, new g21(this, 19));
        coc.c(xw1Var, null, null, new cb6(k3hVar, this, null, 12), 3);
    }

    public v2j a(int i, ArrayList arrayList, z5h z5hVar) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = z5hVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                k8c k8cVar = (k8c) arrayList.get(i2 - i);
                if (i2 > 0) {
                    k8c k8cVar2 = (k8c) arrayList2.get(i2 - 1);
                    k8cVar.d = k8cVar2.a.o.b.o() + k8cVar2.d;
                    k8cVar.e = false;
                    k8cVar.c.clear();
                } else {
                    k8cVar.d = 0;
                    k8cVar.e = false;
                    k8cVar.c.clear();
                }
                int o = k8cVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((k8c) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, k8cVar);
                ((HashMap) this.e).put(k8cVar.b, k8cVar);
                if (this.a) {
                    f(k8cVar);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(k8cVar);
                    } else {
                        j8c j8cVar = (j8c) ((HashMap) this.g).get(k8cVar);
                        if (j8cVar != null) {
                            j8cVar.a.b(j8cVar.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public v2j b() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return v2j.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            k8c k8cVar = (k8c) arrayList.get(i2);
            k8cVar.d = i;
            i += k8cVar.a.o.b.o();
        }
        return new vre(arrayList, (z5h) this.k);
    }

    public void c() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            k8c k8cVar = (k8c) it.next();
            if (k8cVar.c.isEmpty()) {
                j8c j8cVar = (j8c) ((HashMap) this.g).get(k8cVar);
                if (j8cVar != null) {
                    j8cVar.a.b(j8cVar.b);
                }
                it.remove();
            }
        }
    }

    public void d(t7k t7kVar) {
        String str = (String) this.b;
        if (Intrinsics.areEqual(t7kVar, r7k.a)) {
            ((Function1) this.g).invoke(str);
        } else if (t7kVar instanceof s7k) {
            ((Function2) this.e).invoke(((s7k) t7kVar).a, str);
        } else {
            dmk.a();
        }
    }

    public void e(k8c k8cVar) {
        if (k8cVar.e && k8cVar.c.isEmpty()) {
            j8c j8cVar = (j8c) ((HashMap) this.g).remove(k8cVar);
            j8cVar.getClass();
            i8c i8cVar = j8cVar.c;
            j91 j91Var = j8cVar.a;
            j91Var.n(j8cVar.b);
            j91Var.q(i8cVar);
            j91Var.p(i8cVar);
            ((HashSet) this.h).remove(k8cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [f8c, y7c] */
    /* JADX WARN: Type inference failed for: r3v4, types: [b27, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, c8c] */
    public void f(k8c k8cVar) {
        p3c p3cVar = k8cVar.a;
        ?? r1 = new y7c() { // from class: f8c
            @Override // defpackage.y7c
            public final void a(j91 j91Var, v2j v2jVar) {
                sii siiVar = ((or7) yh6.this.f).h;
                siiVar.d(2);
                siiVar.e(22);
            }
        };
        i8c i8cVar = new i8c(this, k8cVar);
        ((HashMap) this.g).put(k8cVar, new j8c(p3cVar, r1, i8cVar));
        int i = u1k.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        CopyOnWriteArrayList copyOnWriteArrayList = p3cVar.c.c;
        ?? obj = new Object();
        obj.a = handler;
        obj.b = i8cVar;
        copyOnWriteArrayList.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = p3cVar.d.c;
        ?? obj2 = new Object();
        obj2.a = i8cVar;
        copyOnWriteArrayList2.add(obj2);
        p3cVar.j(r1, (qz5) this.l, (uqe) this.b);
    }

    public void g(q7c q7cVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        k8c k8cVar = (k8c) identityHashMap.remove(q7cVar);
        k8cVar.getClass();
        k8cVar.a.m(q7cVar);
        k8cVar.c.remove(((m3c) q7cVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        e(k8cVar);
    }

    public void h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            k8c k8cVar = (k8c) arrayList.remove(i3);
            ((HashMap) this.e).remove(k8cVar.b);
            int i4 = -k8cVar.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((k8c) arrayList.get(i5)).d += i4;
            }
            k8cVar.e = true;
            if (this.a) {
                e(k8cVar);
            }
        }
    }

    public yh6(or7 or7Var, ry5 ry5Var, sii siiVar, uqe uqeVar) {
        this.b = uqeVar;
        this.f = or7Var;
        this.k = new z5h();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = ry5Var;
        this.j = siiVar;
        this.g = new HashMap();
        this.h = new HashSet();
    }
}
