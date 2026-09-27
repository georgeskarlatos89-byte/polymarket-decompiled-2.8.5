package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p7b extends p6b {
    public static final n7b k = new n7b(null);
    private final boolean b;
    public yv7 c;
    public n6b d;
    private final WeakReference<LifecycleOwner> e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final uwh j;

    public p7b(LifecycleOwner lifecycleOwner, boolean z) {
        this.b = z;
        this.c = new yv7();
        n6b n6bVar = n6b.INITIALIZED;
        this.d = n6bVar;
        this.i = new ArrayList();
        this.e = new WeakReference<>(lifecycleOwner);
        this.j = n0n.a(n6bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o7b] */
    @Override // defpackage.p6b
    public final void a(l7b l7bVar) {
        h7b gn8Var;
        LifecycleOwner lifecycleOwner;
        l7bVar.getClass();
        e("addObserver");
        n6b n6bVar = this.d;
        n6b n6bVar2 = n6b.DESTROYED;
        if (n6bVar != n6bVar2) {
            n6bVar2 = n6b.INITIALIZED;
        }
        n6bVar2.getClass();
        ?? obj = new Object();
        y7b y7bVar = y7b.a;
        boolean z = l7bVar instanceof h7b;
        boolean z2 = l7bVar instanceof DefaultLifecycleObserver;
        boolean z3 = false;
        if (z && z2) {
            gn8Var = new t66((DefaultLifecycleObserver) l7bVar, (h7b) l7bVar);
        } else if (z2) {
            gn8Var = new t66((DefaultLifecycleObserver) l7bVar, null);
        } else if (z) {
            gn8Var = (h7b) l7bVar;
        } else {
            Class<?> cls = l7bVar.getClass();
            y7b y7bVar2 = y7b.a;
            y7bVar2.getClass();
            if (y7b.b(cls) == 2) {
                Object obj2 = y7b.c.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    cs8[] cs8VarArr = new cs8[size];
                    if (size <= 0) {
                        gn8Var = new zq4(cs8VarArr);
                    } else {
                        Constructor constructor = (Constructor) list.get(0);
                        y7bVar2.getClass();
                        y7b.a(constructor, l7bVar);
                        throw null;
                    }
                } else {
                    y7b.a((Constructor) list.get(0), l7bVar);
                    throw null;
                }
            } else {
                gn8Var = new gn8(l7bVar);
            }
        }
        obj.b = gn8Var;
        obj.a = n6bVar2;
        if (((o7b) this.c.i(l7bVar, obj)) != null || (lifecycleOwner = this.e.get()) == null) {
            return;
        }
        if (this.f != 0 || this.g) {
            z3 = true;
        }
        n6b d = d(l7bVar);
        this.f++;
        while (obj.a.compareTo(d) < 0 && this.c.h(l7bVar)) {
            n6b n6bVar3 = obj.a;
            ArrayList arrayList = this.i;
            arrayList.add(n6bVar3);
            k6b k6bVar = m6b.Companion;
            n6b n6bVar4 = obj.a;
            k6bVar.getClass();
            m6b b = k6b.b(n6bVar4);
            if (b != null) {
                obj.a(lifecycleOwner, b);
                arrayList.remove(arrayList.size() - 1);
                d = d(l7bVar);
            } else {
                omf.q(obj.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            i();
        }
        this.f--;
    }

    @Override // defpackage.p6b
    public final n6b b() {
        return this.d;
    }

    @Override // defpackage.p6b
    public final void c(l7b l7bVar) {
        l7bVar.getClass();
        e("removeObserver");
        this.c.d(l7bVar);
    }

    public final n6b d(l7b l7bVar) {
        n6b n6bVar;
        ucg f = this.c.f(l7bVar);
        n6b n6bVar2 = null;
        if (f != null) {
            n6bVar = ((o7b) f.b).a;
        } else {
            n6bVar = null;
        }
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            n6bVar2 = (n6b) m51.h(1, arrayList);
        }
        n7b n7bVar = k;
        n6b n6bVar3 = this.d;
        n7bVar.getClass();
        n6bVar3.getClass();
        if (n6bVar == null || n6bVar.compareTo(n6bVar3) >= 0) {
            n6bVar = n6bVar3;
        }
        if (n6bVar2 != null && n6bVar2.compareTo(n6bVar) < 0) {
            return n6bVar2;
        }
        return n6bVar;
    }

    public final void e(String str) {
        if (this.b && !ck0.e().e.e()) {
            f27.k(sv6.n("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(m6b m6bVar) {
        m6bVar.getClass();
        e("handleLifecycleEvent");
        g(m6bVar.a());
    }

    public final void g(n6b n6bVar) {
        if (this.d != n6bVar) {
            LifecycleOwner lifecycleOwner = this.e.get();
            n6b n6bVar2 = this.d;
            n6bVar2.getClass();
            n6bVar.getClass();
            if (n6bVar2 == n6b.INITIALIZED && n6bVar == n6b.DESTROYED) {
                throw new IllegalStateException(("State must be at least '" + n6b.CREATED + "' to be moved to '" + n6bVar + "' in component " + lifecycleOwner).toString());
            }
            n6b n6bVar3 = n6b.DESTROYED;
            if (n6bVar2 == n6bVar3 && n6bVar2 != n6bVar) {
                throw new IllegalStateException(("State is '" + n6bVar3 + "' and cannot be moved to `" + n6bVar + "` in component " + lifecycleOwner).toString());
            }
            this.d = n6bVar;
            if (!this.g && this.f == 0) {
                this.g = true;
                i();
                this.g = false;
                if (this.d == n6bVar3) {
                    this.c = new yv7();
                    return;
                }
                return;
            }
            this.h = true;
        }
    }

    public final void h(n6b n6bVar) {
        n6bVar.getClass();
        e("setCurrentState");
        g(n6bVar);
    }

    public final void i() {
        LifecycleOwner lifecycleOwner = this.e.get();
        if (lifecycleOwner != null) {
            while (true) {
                yv7 yv7Var = this.c;
                if (yv7Var.d != 0) {
                    ucg ucgVar = yv7Var.a;
                    ucgVar.getClass();
                    n6b n6bVar = ((o7b) ucgVar.b).a;
                    ucg ucgVar2 = this.c.b;
                    ucgVar2.getClass();
                    n6b n6bVar2 = ((o7b) ucgVar2.b).a;
                    if (n6bVar == n6bVar2 && this.d == n6bVar2) {
                        break;
                    }
                    this.h = false;
                    n6b n6bVar3 = this.d;
                    ucg ucgVar3 = this.c.a;
                    ucgVar3.getClass();
                    int compareTo = n6bVar3.compareTo(((o7b) ucgVar3.b).a);
                    ArrayList arrayList = this.i;
                    if (compareTo < 0) {
                        tcg a = this.c.a();
                        while (a.hasNext() && !this.h) {
                            Map.Entry entry = (Map.Entry) a.next();
                            entry.getClass();
                            l7b l7bVar = (l7b) entry.getKey();
                            o7b o7bVar = (o7b) entry.getValue();
                            while (o7bVar.a.compareTo(this.d) > 0 && !this.h && this.c.h(l7bVar)) {
                                k6b k6bVar = m6b.Companion;
                                n6b n6bVar4 = o7bVar.a;
                                k6bVar.getClass();
                                m6b a2 = k6b.a(n6bVar4);
                                if (a2 != null) {
                                    arrayList.add(a2.a());
                                    o7bVar.a(lifecycleOwner, a2);
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    omf.q(o7bVar.a, "no event down from ");
                                    return;
                                }
                            }
                        }
                    }
                    ucg ucgVar4 = this.c.b;
                    if (!this.h && ucgVar4 != null && this.d.compareTo(((o7b) ucgVar4.b).a) > 0) {
                        vcg c = this.c.c();
                        while (c.hasNext() && !this.h) {
                            Map.Entry entry2 = (Map.Entry) c.next();
                            l7b l7bVar2 = (l7b) entry2.getKey();
                            o7b o7bVar2 = (o7b) entry2.getValue();
                            while (o7bVar2.a.compareTo(this.d) < 0 && !this.h && this.c.h(l7bVar2)) {
                                arrayList.add(o7bVar2.a);
                                k6b k6bVar2 = m6b.Companion;
                                n6b n6bVar5 = o7bVar2.a;
                                k6bVar2.getClass();
                                m6b b = k6b.b(n6bVar5);
                                if (b != null) {
                                    o7bVar2.a(lifecycleOwner, b);
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    omf.q(o7bVar2.a, "no event up from ");
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.h = false;
            this.j.l(this.d);
            return;
        }
        dmk.n("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public /* synthetic */ p7b(LifecycleOwner lifecycleOwner, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, z);
    }
}
