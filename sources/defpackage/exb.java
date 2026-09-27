package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class exb {
    public final int a;
    private final fxb b;
    private final cqb c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Type inference failed for: r3v4, types: [cqb, java.lang.Object] */
    public exb(int i) {
        boolean z;
        this.a = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b = new fxb(0.75f, 0);
            this.c = new Object();
        } else {
            dmk.v("maxSize <= 0");
            throw null;
        }
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object c(Object obj) {
        Object d;
        obj.getClass();
        synchronized (this.c) {
            Object a = this.b.a(obj);
            if (a != null) {
                this.e++;
                return a;
            }
            this.f++;
            Object a2 = a(obj);
            if (a2 == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    d = this.b.d(obj, a2);
                    if (d != null) {
                        this.b.d(obj, d);
                    } else {
                        this.d += g(obj, a2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d != null) {
                b(obj, a2, d);
                return d;
            }
            k(this.a);
            return a2;
        }
    }

    public final int d() {
        int i;
        synchronized (this.c) {
            i = this.a;
        }
        return i;
    }

    public final Object e(Object obj, Object obj2) {
        Object d;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d += g(obj, obj2);
            d = this.b.d(obj, obj2);
            if (d != null) {
                this.d -= g(obj, d);
            }
        }
        if (d != null) {
            b(obj, d, obj2);
        }
        k(this.a);
        return d;
    }

    public final Object f(Object obj) {
        Object e;
        obj.getClass();
        synchronized (this.c) {
            e = this.b.e(obj);
            if (e != null) {
                this.d -= g(obj, e);
            }
        }
        if (e != null) {
            b(obj, e, null);
        }
        return e;
    }

    public final int g(Object obj, Object obj2) {
        int i = i(obj, obj2);
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public final int h() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public int i(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap;
        synchronized (this.c) {
            linkedHashMap = new LinkedHashMap(this.b.b().size());
            for (Map.Entry entry : this.b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.c() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.c()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) CollectionsKt.F(this.b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.b.e(key);
                    this.d -= g(key, value);
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.c) {
            try {
                int i2 = this.e;
                int i3 = this.f + i2;
                if (i3 != 0) {
                    i = (i2 * 100) / i3;
                } else {
                    i = 0;
                }
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + i + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
