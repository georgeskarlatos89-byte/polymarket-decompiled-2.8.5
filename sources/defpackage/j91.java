package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class j91 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final c27 c = new c27(new CopyOnWriteArrayList(), 0, null);
    public final c27 d = new c27(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public v2j f;
    public uqe g;

    public abstract q7c a(x7c x7cVar, gg1 gg1Var, long j);

    public final void b(y7c y7cVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(y7cVar);
        if (!isEmpty && hashSet.isEmpty()) {
            c();
        }
    }

    public final void d(y7c y7cVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(y7cVar);
        if (isEmpty) {
            e();
        }
    }

    public v2j f() {
        return null;
    }

    public abstract j7c g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(y7c y7cVar, qz5 qz5Var, uqe uqeVar) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        pfn.b(z);
        this.g = uqeVar;
        v2j v2jVar = this.f;
        this.a.add(y7cVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(y7cVar);
            k(qz5Var);
        } else if (v2jVar != null) {
            d(y7cVar);
            y7cVar.a(this, v2jVar);
        }
    }

    public abstract void k(qz5 qz5Var);

    public final void l(v2j v2jVar) {
        this.f = v2jVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y7c) it.next()).a(this, v2jVar);
        }
    }

    public abstract void m(q7c q7cVar);

    public final void n(y7c y7cVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(y7cVar);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            o();
            return;
        }
        b(y7cVar);
    }

    public abstract void o();

    public final void p(d27 d27Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b27 b27Var = (b27) it.next();
            if (b27Var.a == d27Var) {
                copyOnWriteArrayList.remove(b27Var);
            }
        }
    }

    public final void q(d8c d8cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c8c c8cVar = (c8c) it.next();
            if (c8cVar.b == d8cVar) {
                copyOnWriteArrayList.remove(c8cVar);
            }
        }
    }

    public abstract void r(j7c j7cVar);

    public void c() {
    }

    public void e() {
    }
}
