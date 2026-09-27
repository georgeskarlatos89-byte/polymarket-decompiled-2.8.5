package bo.app;

import bo.app.m8;
import defpackage.ace;
import defpackage.b69;
import defpackage.bj9;
import defpackage.coc;
import defpackage.lrh;
import defpackage.pm1;
import defpackage.pyk;
import defpackage.tk1;
import defpackage.tl1;
import defpackage.w7d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m8 implements ha {
    public static final k8 j = new k8();
    public final jf a;
    public final m5 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ReentrantLock f = new ReentrantLock();
    public final ReentrantLock g = new ReentrantLock();
    public final ReentrantLock h = new ReentrantLock();
    public boolean i;

    public m8(jf jfVar, m5 m5Var, boolean z) {
        this.a = jfVar;
        this.b = m5Var;
        this.i = !z;
    }

    public final void a(Class cls) {
        if (!this.i) {
            b69.h(this, null, null, false, new tk1(cls, 2), 7);
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.e.containsKey(cls)) {
                b69.h(this, pm1.V, null, false, new tk1(cls, 3), 6);
                Object remove = this.e.remove(cls);
                remove.getClass();
                Iterator it = ((List) remove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(final Object obj, final Class cls) {
        boolean z;
        y9 y9Var;
        cls.getClass();
        final int i = 0;
        final int i2 = 1;
        if (!(obj instanceof cf) && !(obj instanceof gf) && ((!(obj instanceof g6) || (y9Var = ((g6) obj).d) == null || !((v2) y9Var).f().d) && ((!(obj instanceof ce) || !((ce) obj).a.f().d) && ((!(obj instanceof be) || !((be) obj).a.f().d) && (!(obj instanceof k6) || !((v2) ((k6) obj).a).f().d))))) {
            z = false;
        } else {
            z = true;
        }
        if (!this.a.a() && !this.b.c()) {
            if (obj == null) {
                b69.h(this, null, null, z, new tk1(cls, 1), 3);
                return;
            }
            if (!this.i) {
                b69.h(this, null, null, z, new Function0() { // from class: rzk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        Object obj2 = obj;
                        Class cls2 = cls;
                        switch (i3) {
                            case 0:
                                return m8.a(cls2, obj2);
                            default:
                                return m8.b(cls2, obj2);
                        }
                    }
                }, 3);
                a(obj, cls);
                return;
            }
            b69.h(this, null, null, z, new Function0() { // from class: rzk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    Object obj2 = obj;
                    Class cls2 = cls;
                    switch (i3) {
                        case 0:
                            return m8.a(cls2, obj2);
                        default:
                            return m8.b(cls2, obj2);
                    }
                }
            }, 3);
            k8 k8Var = j;
            HashSet a = k8.a(this.c, cls, this.f);
            Iterator it = ((HashSet) k8Var.a(cls, a)).iterator();
            while (it.hasNext()) {
                coc.c(tl1.a, null, null, new l8((bj9) it.next(), obj, null), 3);
            }
            k8 k8Var2 = j;
            HashSet a2 = k8.a(this.d, cls, this.g);
            Iterator it2 = ((HashSet) k8Var2.a(cls, a2)).iterator();
            while (it2.hasNext()) {
                ((bj9) it2.next()).a(obj);
            }
            if (a2.isEmpty() && a.isEmpty()) {
                if (Intrinsics.areEqual(cls, w7d.class)) {
                    b69.h(this, pm1.I, null, z, new Function0() { // from class: szk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i;
                            m8 m8Var = this;
                            Class cls2 = cls;
                            switch (i3) {
                                case 0:
                                    return m8.a(cls2, m8Var);
                                default:
                                    return m8.b(cls2, m8Var);
                            }
                        }
                    }, 2);
                    return;
                } else {
                    b69.h(this, pm1.I, null, z, new Function0() { // from class: szk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i2;
                            m8 m8Var = this;
                            Class cls2 = cls;
                            switch (i3) {
                                case 0:
                                    return m8.a(cls2, m8Var);
                                default:
                                    return m8.b(cls2, m8Var);
                            }
                        }
                    }, 2);
                    a(obj, cls);
                    return;
                }
            }
            return;
        }
        b69.h(this, null, null, z, new lrh(this, cls, obj, 20), 3);
    }

    public final boolean c(Class cls, bj9 bj9Var) {
        cls.getClass();
        bj9Var.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.d;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean add = copyOnWriteArraySet.add(bj9Var);
            a(cls);
            reentrantLock.unlock();
            return add;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(Class cls, bj9 bj9Var) {
        bj9Var.getClass();
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(bj9Var);
            a(cls);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class ".concat(cls.getName());
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.c.clear();
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.g;
            reentrantLock2.lock();
            try {
                this.d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String c(Class cls) {
        return ace.j(cls, "Publishing cached event for class: ");
    }

    public final boolean a(Class cls, bj9 bj9Var) {
        cls.getClass();
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(bj9Var);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(m8 m8Var, Class cls, Object obj) {
        return "SDK delayed initialization mode: " + m8Var.b.c() + " and GDPR disabled mode: " + m8Var.a.a() + ". Not publishing event class: " + cls.getName() + " and message: " + obj;
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, m8 m8Var) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + ' ' + m8Var;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            boolean containsKey = this.e.containsKey(cls);
            ConcurrentHashMap concurrentHashMap = this.e;
            if (containsKey) {
                List list = (List) concurrentHashMap.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    this.e.put(cls, CollectionsKt.g0(obj));
                }
            } else {
                concurrentHashMap.put(cls, CollectionsKt.g0(obj));
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a() {
        b69.h(this, null, null, false, new pyk(19), 7);
        this.i = true;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            for (Class cls : this.e.keySet()) {
                cls.getClass();
                a(cls);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(Class cls, bj9 bj9Var) {
        bj9Var.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.d.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(bj9Var);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, m8 m8Var) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + m8Var;
    }

    public static final String b(Class cls) {
        return ace.k(cls, "Not publishing cached event for class: ", " because events are not allowed to send yet.");
    }
}
