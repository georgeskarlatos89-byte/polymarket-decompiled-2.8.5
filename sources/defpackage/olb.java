package defpackage;

import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class olb {
    public static final Object k = new Object();
    final Object a;
    public final xcg b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    private final Runnable j;

    public olb() {
        this.a = new Object();
        this.b = new xcg();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new in8(this, 1);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (ck0.e().e.e()) {
            return;
        }
        dmk.n(sv6.n("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(nlb nlbVar) {
        if (nlbVar.b) {
            if (!nlbVar.d()) {
                nlbVar.a(false);
                return;
            }
            int i = nlbVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            nlbVar.c = i2;
            nlbVar.a.onChanged(this.e);
        }
    }

    public final void c(nlb nlbVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (nlbVar != null) {
                b(nlbVar);
                nlbVar = null;
            } else {
                vcg c = this.b.c();
                while (c.hasNext()) {
                    b((nlb) ((Map.Entry) c.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public void e(LifecycleOwner lifecycleOwner, zfd zfdVar) {
        Object obj;
        a("observe");
        if (lifecycleOwner.getLifecycle().b() != n6b.DESTROYED) {
            mlb mlbVar = new mlb(this, lifecycleOwner, zfdVar);
            xcg xcgVar = this.b;
            ucg b = xcgVar.b(zfdVar);
            if (b != null) {
                obj = b.b;
            } else {
                ucg ucgVar = new ucg(zfdVar, mlbVar);
                xcgVar.d++;
                ucg ucgVar2 = xcgVar.b;
                if (ucgVar2 == null) {
                    xcgVar.a = ucgVar;
                    xcgVar.b = ucgVar;
                } else {
                    ucgVar2.c = ucgVar;
                    ucgVar.d = ucgVar2;
                    xcgVar.b = ucgVar;
                }
                obj = null;
            }
            nlb nlbVar = (nlb) obj;
            if (nlbVar != null && !nlbVar.c(lifecycleOwner)) {
                dmk.v("Cannot add the same observer with different lifecycles");
            } else {
                if (nlbVar != null) {
                    return;
                }
                lifecycleOwner.getLifecycle().a(mlbVar);
            }
        }
    }

    public void f(zfd zfdVar) {
        Object obj;
        a("observeForever");
        nlb nlbVar = new nlb(this, zfdVar);
        xcg xcgVar = this.b;
        ucg b = xcgVar.b(zfdVar);
        if (b != null) {
            obj = b.b;
        } else {
            ucg ucgVar = new ucg(zfdVar, nlbVar);
            xcgVar.d++;
            ucg ucgVar2 = xcgVar.b;
            if (ucgVar2 == null) {
                xcgVar.a = ucgVar;
                xcgVar.b = ucgVar;
            } else {
                ucgVar2.c = ucgVar;
                ucgVar.d = ucgVar2;
                xcgVar.b = ucgVar;
            }
            obj = null;
        }
        nlb nlbVar2 = (nlb) obj;
        if (!(nlbVar2 instanceof mlb)) {
            if (nlbVar2 != null) {
                return;
            }
            nlbVar.a(true);
            return;
        }
        dmk.v("Cannot add the same observer with different lifecycles");
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.f == k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (!z) {
            return;
        }
        ck0.e().f(this.j);
    }

    public void j(zfd zfdVar) {
        a("removeObserver");
        nlb nlbVar = (nlb) this.b.d(zfdVar);
        if (nlbVar == null) {
            return;
        }
        nlbVar.b();
        nlbVar.a(false);
    }

    public final void k(LifecycleOwner lifecycleOwner) {
        a("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            tcg tcgVar = (tcg) it;
            if (tcgVar.hasNext()) {
                Map.Entry entry = (Map.Entry) tcgVar.next();
                if (((nlb) entry.getValue()).c(lifecycleOwner)) {
                    j((zfd) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void l(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void g() {
    }

    public void h() {
    }

    public olb(Object obj) {
        this.a = new Object();
        this.b = new xcg();
        this.c = 0;
        this.f = k;
        this.j = new in8(this, 1);
        this.e = obj;
        this.g = 0;
    }
}
