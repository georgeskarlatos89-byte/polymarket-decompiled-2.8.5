package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z3d {
    public static z3d f;
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, z3d] */
    public static synchronized z3d a(Context context) {
        z3d z3dVar;
        synchronized (z3d.class) {
            z3d z3dVar2 = f;
            z3dVar = z3dVar2;
            if (z3dVar2 == null) {
                ?? obj = new Object();
                Executor b = h31.b();
                obj.c = b;
                obj.d = new CopyOnWriteArrayList();
                obj.e = new Object();
                obj.a = 0;
                b.execute(new vq8(22, obj, context));
                f = obj;
                z3dVar = obj;
            }
        }
        return z3dVar;
    }

    public int b() {
        int i;
        synchronized (this.e) {
            i = this.a;
        }
        return i;
    }

    public void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y3d y3dVar = (y3d) it.next();
            if (y3dVar.a.get() == null) {
                copyOnWriteArrayList.remove(y3dVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.b && this.a == i) {
                    return;
                }
                this.b = true;
                this.a = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    y3d y3dVar2 = (y3d) it2.next();
                    y3dVar2.b.execute(new wvb(y3dVar2, 3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
