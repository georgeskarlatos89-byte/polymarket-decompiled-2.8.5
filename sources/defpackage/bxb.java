package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bxb {
    public final a35 a = new a35(25);
    public final axb b = new axb(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public bxb(int i) {
        this.e = i;
    }

    public final void a(Class cls, int i) {
        NavigableMap f = f(cls);
        Integer num = (Integer) f.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                f.remove(Integer.valueOf(i));
                return;
            } else {
                f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void b(int i) {
        while (this.f > i) {
            Object l = this.a.l();
            zqn.b(l);
            ot1 d = d(l.getClass());
            this.f -= d.b() * d.a(l);
            a(l.getClass(), d.a(l));
            if (Log.isLoggable(d.c(), 2)) {
                d.a(l);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002b, B:18:0x003b, B:19:0x003f, B:20:0x005e, B:25:0x0048, B:27:0x0054, B:28:0x0058), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002b, B:18:0x003b, B:19:0x003f, B:20:0x005e, B:25:0x0048, B:27:0x0054, B:28:0x0058), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Object c(Class cls, int i) {
        boolean z;
        zwb zwbVar;
        int i2;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) {
                z = false;
                axb axbVar = this.b;
                if (!z) {
                    int intValue = num.intValue();
                    bxe bxeVar = (bxe) ((ArrayDeque) axbVar.a).poll();
                    if (bxeVar == null) {
                        bxeVar = axbVar.h1();
                    }
                    zwbVar = (zwb) bxeVar;
                    zwbVar.b = intValue;
                    zwbVar.c = cls;
                } else {
                    bxe bxeVar2 = (bxe) ((ArrayDeque) axbVar.a).poll();
                    if (bxeVar2 == null) {
                        bxeVar2 = axbVar.h1();
                    }
                    zwbVar = (zwb) bxeVar2;
                    zwbVar.b = i;
                    zwbVar.c = cls;
                }
            }
            z = true;
            axb axbVar2 = this.b;
            if (!z) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(zwbVar, cls);
    }

    public final ot1 d(Class cls) {
        ot1 ot1Var;
        HashMap hashMap = this.d;
        ot1 ot1Var2 = (ot1) hashMap.get(cls);
        if (ot1Var2 == null) {
            if (cls.equals(int[].class)) {
                ot1Var = new ot1(1);
            } else if (cls.equals(byte[].class)) {
                ot1Var = new ot1(0);
            } else {
                dmk.v("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            hashMap.put(cls, ot1Var);
            return ot1Var;
        }
        return ot1Var2;
    }

    public final Object e(zwb zwbVar, Class cls) {
        ot1 d = d(cls);
        Object e = this.a.e(zwbVar);
        if (e != null) {
            this.f -= d.b() * d.a(e);
            a(cls, d.a(e));
        }
        if (e == null) {
            Log.isLoggable(d.c(), 2);
            int i = zwbVar.b;
            switch (d.a) {
                case 0:
                    return new byte[i];
                default:
                    return new int[i];
            }
        }
        return e;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        ot1 d = d(cls);
        int a = d.a(obj);
        int b = d.b() * a;
        if (b <= this.e / 2) {
            axb axbVar = this.b;
            bxe bxeVar = (bxe) ((ArrayDeque) axbVar.a).poll();
            if (bxeVar == null) {
                bxeVar = axbVar.h1();
            }
            zwb zwbVar = (zwb) bxeVar;
            zwbVar.b = a;
            zwbVar.c = cls;
            this.a.k(zwbVar, obj);
            NavigableMap f = f(cls);
            Integer num = (Integer) f.get(Integer.valueOf(zwbVar.b));
            Integer valueOf = Integer.valueOf(zwbVar.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            f.put(valueOf, Integer.valueOf(i));
            this.f += b;
            b(this.e);
        }
    }
}
