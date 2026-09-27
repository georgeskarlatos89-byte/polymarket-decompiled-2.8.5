package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class mvj {
    public final /* synthetic */ int a;
    public final Unsafe b;

    public /* synthetic */ mvj(Unsafe unsafe, int i) {
        this.a = i;
        this.b = unsafe;
    }

    public abstract boolean a(long j, Object obj);

    public abstract byte b(long j, Object obj);

    public abstract double c(long j, Object obj);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(Object obj, long j, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public boolean i() {
        int i = this.a;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th) {
                        nvj.k(th);
                    }
                }
                return false;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th2) {
                        ovj.i(th2);
                    }
                }
                return false;
        }
    }

    public abstract boolean j();

    public abstract double k(long j, Object obj);

    public abstract void l(Object obj, long j, byte b);

    public abstract float m(long j, Object obj);

    public abstract boolean n(long j, Object obj);

    public abstract void o(Object obj, long j, boolean z);

    public abstract float p(long j, Object obj);

    public abstract void q(Object obj, long j, byte b);

    public abstract void r(Object obj, long j, double d);

    public abstract void s(Object obj, long j, float f);

    public abstract double t(long j, Object obj);

    public abstract void u(Object obj, long j, float f);

    public abstract void v(Object obj, long j, double d);

    public abstract boolean w(long j, Object obj);
}
