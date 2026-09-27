package defpackage;

import com.appsflyer.internal.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class pfn {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.v(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        omf.a();
    }

    public static void c(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        qp7.f();
    }

    public static void d(Object obj) {
        obj.getClass();
    }

    public static void e(String str, boolean z) {
        if (z) {
            return;
        }
        dmk.n(str);
    }

    public static void f(boolean z) {
        if (z) {
            return;
        }
        l.o();
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        l.o();
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.n(str);
    }

    public static float i(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static /* synthetic */ boolean j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, wrl wrlVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(wrlVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(wrlVar) != obj && atomicReferenceFieldUpdater.get(wrlVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
