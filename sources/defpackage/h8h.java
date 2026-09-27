package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.places.internal.zztw;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h8h implements l1g, n9h {
    public static final boolean z = Log.isLoggable("GlideRequest", 2);
    public final pxh a;
    public final Object b;
    public final t1g c;
    public final aw8 d;
    public final Object e;
    public final Class f;
    public final u91 g;
    public final int h;
    public final int i;
    public final h6f j;
    public final voi k;
    public final List l;
    public final ah5 m;
    public final qt6 n;
    public h3g o;
    public ysk p;
    public volatile le7 q;
    public g8h r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public int v;
    public int w;
    public boolean x;
    public final RuntimeException y;

    /* JADX WARN: Type inference failed for: r1v1, types: [pxh, java.lang.Object] */
    public h8h(Context context, aw8 aw8Var, Object obj, Object obj2, Class cls, u91 u91Var, int i, int i2, h6f h6fVar, voi voiVar, ArrayList arrayList, t1g t1gVar, le7 le7Var) {
        ah5 ah5Var = m8d.b;
        qt6 qt6Var = zsl.a;
        if (z) {
            String.valueOf(hashCode());
        }
        this.a = new Object();
        this.b = obj;
        this.d = aw8Var;
        this.e = obj2;
        this.f = cls;
        this.g = u91Var;
        this.h = i;
        this.i = i2;
        this.j = h6fVar;
        this.k = voiVar;
        this.l = arrayList;
        this.c = t1gVar;
        this.q = le7Var;
        this.m = ah5Var;
        this.n = qt6Var;
        this.r = g8h.PENDING;
        if (this.y == null && ((Map) aw8Var.g.b).containsKey(zv8.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.l1g
    public final boolean a() {
        boolean z2;
        synchronized (this.b) {
            if (this.r == g8h.COMPLETE) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final void b() {
        if (!this.x) {
            this.a.a();
            this.k.removeCallback(this);
            ysk yskVar = this.p;
            if (yskVar != null) {
                synchronized (((le7) yskVar.c)) {
                    ((hf7) yskVar.a).g((h8h) yskVar.b);
                }
                this.p = null;
                return;
            }
            return;
        }
        dmk.n("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // defpackage.l1g
    public final boolean c() {
        boolean z2;
        synchronized (this.b) {
            if (this.r == g8h.COMPLETE) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // defpackage.l1g
    public final void clear() {
        synchronized (this.b) {
            try {
                if (!this.x) {
                    this.a.a();
                    g8h g8hVar = this.r;
                    g8h g8hVar2 = g8h.CLEARED;
                    if (g8hVar == g8hVar2) {
                        return;
                    }
                    b();
                    h3g h3gVar = this.o;
                    if (h3gVar != null) {
                        this.o = null;
                    } else {
                        h3gVar = null;
                    }
                    t1g t1gVar = this.c;
                    if (t1gVar == null || t1gVar.b(this)) {
                        this.k.onLoadCleared(d());
                    }
                    this.r = g8hVar2;
                    if (h3gVar != null) {
                        this.q.getClass();
                        le7.e(h3gVar);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        Drawable drawable = this.t;
        if (drawable == null) {
            this.g.getClass();
            this.t = null;
            return null;
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:13:0x005a, B:15:0x005e, B:16:0x0063, B:18:0x0069, B:20:0x0077, B:25:0x0085, B:30:0x0090, B:32:0x0094, B:38:0x009f, B:40:0x00a3, B:42:0x00a7, B:44:0x00b1, B:46:0x00b5, B:50:0x00c1, B:51:0x00c5), top: B:12:0x005a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:13:0x005a, B:15:0x005e, B:16:0x0063, B:18:0x0069, B:20:0x0077, B:25:0x0085, B:30:0x0090, B:32:0x0094, B:38:0x009f, B:40:0x00a3, B:42:0x00a7, B:44:0x00b1, B:46:0x00b5, B:50:0x00c1, B:51:0x00c5), top: B:12:0x005a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(cw8 cw8Var, int i) {
        boolean z2;
        Drawable drawable;
        boolean z3;
        this.a.a();
        synchronized (this.b) {
            try {
                cw8Var.getClass();
                this.d.getClass();
                if (4 <= i) {
                    m0.q("Glide", "Load failed for [" + this.e + "] with dimensions [" + this.v + "x" + this.w + "]", cw8Var);
                    cw8Var.d();
                }
                Drawable drawable2 = null;
                this.p = null;
                this.r = g8h.FAILED;
                t1g t1gVar = this.c;
                if (t1gVar != null) {
                    t1gVar.e(this);
                }
                boolean z4 = true;
                this.x = true;
                try {
                    List<zztw> list = this.l;
                    if (list != null) {
                        z2 = false;
                        for (zztw zztwVar : list) {
                            Object obj = this.e;
                            voi voiVar = this.k;
                            t1g t1gVar2 = this.c;
                            if (t1gVar2 != null && t1gVar2.getRoot().a()) {
                                z3 = false;
                                z2 |= zztwVar.onLoadFailed(cw8Var, obj, voiVar, z3);
                            }
                            z3 = true;
                            z2 |= zztwVar.onLoadFailed(cw8Var, obj, voiVar, z3);
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        t1g t1gVar3 = this.c;
                        if (t1gVar3 != null && !t1gVar3.h(this)) {
                            z4 = false;
                        }
                        if (this.e == null) {
                            drawable = this.u;
                            if (drawable == null) {
                                this.g.getClass();
                                this.u = null;
                            }
                            if (drawable == null) {
                                Drawable drawable3 = this.s;
                                if (drawable3 == null) {
                                    this.g.getClass();
                                    this.s = null;
                                } else {
                                    drawable2 = drawable3;
                                }
                                drawable = drawable2;
                            }
                            if (drawable == null) {
                                drawable = d();
                            }
                            this.k.onLoadFailed(drawable);
                        }
                        drawable = null;
                        if (drawable == null) {
                        }
                        if (drawable == null) {
                        }
                        this.k.onLoadFailed(drawable);
                    }
                } finally {
                    this.x = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l1g
    public final boolean f() {
        boolean z2;
        synchronized (this.b) {
            if (this.r == g8h.CLEARED) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // defpackage.l1g
    public final boolean g(l1g l1gVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        u91 u91Var;
        h6f h6fVar;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        u91 u91Var2;
        h6f h6fVar2;
        int i6;
        boolean equals;
        boolean e;
        if (!(l1gVar instanceof h8h)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.h;
                i2 = this.i;
                obj = this.e;
                cls = this.f;
                u91Var = this.g;
                h6fVar = this.j;
                List list = this.l;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            } finally {
            }
        }
        h8h h8hVar = (h8h) l1gVar;
        synchronized (h8hVar.b) {
            try {
                i4 = h8hVar.h;
                i5 = h8hVar.i;
                obj2 = h8hVar.e;
                cls2 = h8hVar.f;
                u91Var2 = h8hVar.g;
                h6fVar2 = h8hVar.j;
                List list2 = h8hVar.l;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            } finally {
            }
        }
        if (i == i4 && i2 == i5) {
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2)) {
                if (u91Var == null) {
                    if (u91Var2 == null) {
                        e = true;
                    } else {
                        e = false;
                    }
                } else {
                    e = u91Var.e(u91Var2);
                }
                if (e && h6fVar == h6fVar2 && i3 == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void h(h3g h3gVar, ep5 ep5Var) {
        Object obj;
        String str;
        this.a.a();
        h3g h3gVar2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.p = null;
                    if (h3gVar == null) {
                        e(new cw8("Expected to receive a Resource<R> with an object of " + this.f + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = h3gVar.get();
                    try {
                        if (obj2 != null && this.f.isAssignableFrom(obj2.getClass())) {
                            t1g t1gVar = this.c;
                            if (t1gVar != null && !t1gVar.d(this)) {
                                this.o = null;
                                this.r = g8h.COMPLETE;
                                this.q.getClass();
                                le7.e(h3gVar);
                            }
                            i(h3gVar, obj2, ep5Var);
                            return;
                        }
                        this.o = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(h3gVar);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        e(new cw8(sb.toString()), 5);
                        this.q.getClass();
                        le7.e(h3gVar);
                    } catch (Throwable th) {
                        h3gVar2 = h3gVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (h3gVar2 != null) {
                this.q.getClass();
                le7.e(h3gVar2);
            }
            throw th3;
        }
    }

    public final void i(h3g h3gVar, Object obj, ep5 ep5Var) {
        boolean z2;
        boolean z3;
        t1g t1gVar = this.c;
        if (t1gVar != null && t1gVar.getRoot().a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.r = g8h.COMPLETE;
        this.o = h3gVar;
        this.d.getClass();
        if (t1gVar != null) {
            t1gVar.i(this);
        }
        this.x = true;
        try {
            List list = this.l;
            if (list != null) {
                Iterator it = list.iterator();
                z3 = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    ep5 ep5Var2 = ep5Var;
                    z3 |= ((zztw) it.next()).onResourceReady(obj2, this.e, this.k, ep5Var2, z2);
                    obj = obj2;
                    ep5Var = ep5Var2;
                }
            } else {
                z3 = false;
            }
            Object obj3 = obj;
            if (!z3) {
                this.m.getClass();
                this.k.onResourceReady(obj3, m8d.a);
            }
            this.x = false;
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    @Override // defpackage.l1g
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.b) {
            try {
                g8h g8hVar = this.r;
                if (g8hVar != g8h.RUNNING && g8hVar != g8h.WAITING_FOR_SIZE) {
                    z2 = false;
                }
                z2 = true;
            } finally {
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x001f, B:11:0x002b, B:13:0x002f, B:16:0x003c, B:17:0x0046, B:21:0x0048, B:23:0x004e, B:25:0x0052, B:26:0x0059, B:28:0x005b, B:31:0x0071, B:33:0x007f, B:34:0x008c, B:37:0x00ad, B:39:0x00b1, B:40:0x00b4, B:42:0x0094, B:44:0x0098, B:49:0x00a4, B:51:0x0087, B:52:0x0060, B:53:0x0064, B:55:0x006a, B:57:0x00b6, B:58:0x00bd, B:59:0x00be, B:60:0x00c5), top: B:3:0x0003 }] */
    @Override // defpackage.l1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z2;
        int i;
        synchronized (this.b) {
            try {
                if (!this.x) {
                    this.a.a();
                    int i2 = hrb.a;
                    SystemClock.elapsedRealtimeNanos();
                    if (this.e == null) {
                        if (o1k.k(this.h, this.i)) {
                            this.v = this.h;
                            this.w = this.i;
                        }
                        Drawable drawable = this.u;
                        if (drawable == null) {
                            this.g.getClass();
                            drawable = null;
                            this.u = null;
                        }
                        if (drawable == null) {
                            i = 5;
                        } else {
                            i = 3;
                        }
                        e(new cw8("Received null model"), i);
                        return;
                    }
                    g8h g8hVar = this.r;
                    if (g8hVar != g8h.RUNNING) {
                        if (g8hVar == g8h.COMPLETE) {
                            h(this.o, ep5.MEMORY_CACHE);
                            return;
                        }
                        List<zztw> list = this.l;
                        if (list != null) {
                            for (zztw zztwVar : list) {
                            }
                        }
                        g8h g8hVar2 = g8h.WAITING_FOR_SIZE;
                        this.r = g8hVar2;
                        if (o1k.k(this.h, this.i)) {
                            k(this.h, this.i);
                        } else {
                            this.k.getSize(this);
                        }
                        g8h g8hVar3 = this.r;
                        if (g8hVar3 == g8h.RUNNING || g8hVar3 == g8hVar2) {
                            t1g t1gVar = this.c;
                            if (t1gVar != null && !t1gVar.h(this)) {
                                z2 = false;
                                if (z2) {
                                    this.k.onLoadStarted(d());
                                }
                            }
                            z2 = true;
                            if (z2) {
                            }
                        }
                        if (z) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void k(int i, int i2) {
        ?? r1;
        int round;
        int i3 = i;
        this.a.a();
        Object obj = this.b;
        synchronized (obj) {
            try {
                try {
                    boolean z2 = z;
                    if (z2) {
                        int i4 = hrb.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.r != g8h.WAITING_FOR_SIZE) {
                        return;
                    }
                    g8h g8hVar = g8h.RUNNING;
                    this.r = g8hVar;
                    this.g.getClass();
                    this.v = i3 == Integer.MIN_VALUE ? i3 : Math.round(i3 * 1.0f);
                    if (i2 == Integer.MIN_VALUE) {
                        round = i2;
                    } else {
                        round = Math.round(1.0f * i2);
                    }
                    this.w = round;
                    if (z2) {
                        int i5 = hrb.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    le7 le7Var = this.q;
                    aw8 aw8Var = this.d;
                    Object obj2 = this.e;
                    u91 u91Var = this.g;
                    this.p = le7Var.a(aw8Var, obj2, u91Var.g, this.v, this.w, u91Var.k, this.f, this.j, u91Var.b, u91Var.j, u91Var.h, u91Var.o, u91Var.i, u91Var.d, u91Var.p, this, this.n);
                    if (this.r != g8hVar) {
                        this.p = null;
                    }
                    if (z2) {
                        int i6 = hrb.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = obj;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = i3;
            }
        }
    }

    @Override // defpackage.l1g
    public final void pause() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.e;
            cls = this.f;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
