package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j2g implements ComponentCallbacks2, k7b {
    public static final l2g k;
    public final a a;
    public final Context b;
    public final o6b c;
    public final s8h d;
    public final t55 e;
    public final api f;
    public final in8 g;
    public final ax4 h;
    public final CopyOnWriteArrayList i;
    public final l2g j;

    static {
        l2g l2gVar = (l2g) new u91().c(Bitmap.class);
        l2gVar.l = true;
        k = l2gVar;
        ((l2g) new u91().c(jv8.class)).l = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [k7b, ax4] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o6b] */
    /* JADX WARN: Type inference failed for: r8v7, types: [l2g, u91] */
    public j2g(a aVar, o6b o6bVar, t55 t55Var, Context context) {
        boolean z;
        ?? r0;
        l2g l2gVar;
        s8h s8hVar = new s8h(11);
        ve5 ve5Var = aVar.f;
        this.f = new api();
        in8 in8Var = new in8(this, 17);
        this.g = in8Var;
        this.a = aVar;
        this.c = o6bVar;
        this.e = t55Var;
        this.d = s8hVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        i2g i2gVar = new i2g(this, s8hVar);
        ve5Var.getClass();
        if (d55.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z) {
            r0 = new k16(applicationContext, i2gVar);
        } else {
            r0 = new Object();
        }
        this.h = r0;
        synchronized (aVar.g) {
            if (!aVar.g.contains(this)) {
                aVar.g.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            o1k.h().post(in8Var);
        } else {
            o6bVar.d(this);
        }
        o6bVar.d(r0);
        this.i = new CopyOnWriteArrayList(aVar.c.d);
        aw8 aw8Var = aVar.c;
        synchronized (aw8Var) {
            l2g l2gVar2 = aw8Var.h;
            l2gVar = l2gVar2;
            if (l2gVar2 == null) {
                ?? u91Var = new u91();
                u91Var.l = true;
                aw8Var.h = u91Var;
                l2gVar = u91Var;
            }
        }
        synchronized (this) {
            l2g l2gVar3 = (l2g) l2gVar.b();
            if (l2gVar3.l && !l2gVar3.n) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            l2gVar3.n = true;
            l2gVar3.l = true;
            this.j = l2gVar3;
        }
    }

    public final void a(voi voiVar) {
        if (voiVar != null) {
            boolean e = e(voiVar);
            l1g request = voiVar.getRequest();
            if (!e) {
                a aVar = this.a;
                synchronized (aVar.g) {
                    try {
                        Iterator it = aVar.g.iterator();
                        while (it.hasNext()) {
                            if (((j2g) it.next()).e(voiVar)) {
                                return;
                            }
                        }
                        if (request != null) {
                            voiVar.setRequest(null);
                            request.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final synchronized void b() {
        try {
            Iterator it = o1k.g(this.f.a).iterator();
            while (it.hasNext()) {
                a((voi) it.next());
            }
            this.f.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        s8h s8hVar = this.d;
        s8hVar.b = true;
        Iterator it = o1k.g((Set) s8hVar.c).iterator();
        while (it.hasNext()) {
            l1g l1gVar = (l1g) it.next();
            if (l1gVar.isRunning()) {
                l1gVar.pause();
                ((HashSet) s8hVar.d).add(l1gVar);
            }
        }
    }

    public final synchronized void d() {
        s8h s8hVar = this.d;
        s8hVar.b = false;
        Iterator it = o1k.g((Set) s8hVar.c).iterator();
        while (it.hasNext()) {
            l1g l1gVar = (l1g) it.next();
            if (!l1gVar.c() && !l1gVar.isRunning()) {
                l1gVar.j();
            }
        }
        ((HashSet) s8hVar.d).clear();
    }

    public final synchronized boolean e(voi voiVar) {
        l1g request = voiVar.getRequest();
        if (request == null) {
            return true;
        }
        if (this.d.f(request)) {
            this.f.a.remove(voiVar);
            voiVar.setRequest(null);
            return true;
        }
        return false;
    }

    @Override // defpackage.k7b
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        b();
        s8h s8hVar = this.d;
        Iterator it = o1k.g((Set) s8hVar.c).iterator();
        while (it.hasNext()) {
            s8hVar.f((l1g) it.next());
        }
        ((HashSet) s8hVar.d).clear();
        this.c.f(this);
        this.c.f(this.h);
        o1k.h().removeCallbacks(this.g);
        a aVar = this.a;
        synchronized (aVar.g) {
            if (aVar.g.contains(this)) {
                aVar.g.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // defpackage.k7b
    public final synchronized void onStart() {
        d();
        this.f.onStart();
    }

    @Override // defpackage.k7b
    public final synchronized void onStop() {
        this.f.onStop();
        c();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
