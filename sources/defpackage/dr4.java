package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dr4 extends j91 {
    public final HashMap h = new HashMap();
    public Handler i;
    public qz5 j;

    @Override // defpackage.j91
    public final void c() {
        for (cr4 cr4Var : this.h.values()) {
            cr4Var.a.b(cr4Var.b);
        }
    }

    @Override // defpackage.j91
    public final void e() {
        for (cr4 cr4Var : this.h.values()) {
            cr4Var.a.d(cr4Var.b);
        }
    }

    @Override // defpackage.j91
    public void i() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((cr4) it.next()).a.i();
        }
    }

    @Override // defpackage.j91
    public void o() {
        HashMap hashMap = this.h;
        for (cr4 cr4Var : hashMap.values()) {
            j91 j91Var = cr4Var.a;
            br4 br4Var = cr4Var.c;
            j91Var.n(cr4Var.b);
            j91Var.q(br4Var);
            j91Var.p(br4Var);
        }
        hashMap.clear();
    }

    public abstract x7c s(Object obj, x7c x7cVar);

    public abstract void v(Object obj, j91 j91Var, v2j v2jVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [b27, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ar4, y7c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, c8c] */
    public final void w(final Object obj, j91 j91Var) {
        HashMap hashMap = this.h;
        pfn.b(!hashMap.containsKey(obj));
        ?? r1 = new y7c() { // from class: ar4
            @Override // defpackage.y7c
            public final void a(j91 j91Var2, v2j v2jVar) {
                dr4.this.v(obj, j91Var2, v2jVar);
            }
        };
        br4 br4Var = new br4(this, obj);
        hashMap.put(obj, new cr4(j91Var, r1, br4Var));
        Handler handler = this.i;
        handler.getClass();
        j91Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = j91Var.c.c;
        ?? obj2 = new Object();
        obj2.a = handler;
        obj2.b = br4Var;
        copyOnWriteArrayList.add(obj2);
        this.i.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = j91Var.d.c;
        ?? obj3 = new Object();
        obj3.a = br4Var;
        copyOnWriteArrayList2.add(obj3);
        qz5 qz5Var = this.j;
        uqe uqeVar = this.g;
        pfn.g(uqeVar);
        j91Var.j(r1, qz5Var, uqeVar);
        if (this.b.isEmpty()) {
            j91Var.b(r1);
        }
    }

    public long t(long j, Object obj) {
        return j;
    }

    public int u(int i, Object obj) {
        return i;
    }
}
