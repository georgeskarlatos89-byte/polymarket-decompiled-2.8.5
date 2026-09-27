package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class nvj {
    public static final Unsafe a;
    public static final Class b;
    public static final mvj c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        boolean j;
        boolean i;
        boolean z = true;
        kvj kvjVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2(1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = xr.a;
        boolean d2 = d(Long.TYPE);
        boolean d3 = d(Integer.TYPE);
        if (unsafe != null) {
            if (xr.a()) {
                if (d2) {
                    kvjVar = new kvj(unsafe, 1);
                } else if (d3) {
                    kvjVar = new kvj(unsafe, 0);
                }
            } else {
                kvjVar = new kvj(unsafe, 2);
            }
        }
        c = kvjVar;
        if (kvjVar == null) {
            j = false;
        } else {
            j = kvjVar.j();
        }
        d = j;
        if (kvjVar == null) {
            i = false;
        } else {
            i = kvjVar.i();
        }
        e = i;
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field c2 = c();
        if (c2 != null && kvjVar != null) {
            kvjVar.b.objectFieldOffset(c2);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z = false;
        }
        g = z;
    }

    public static int a(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        if (xr.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(PlaceTypes.ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean d(Class cls) {
        if (!xr.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(long j, byte[] bArr) {
        return c.b(f + j, bArr);
    }

    public static byte f(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(long j, Object obj) {
        return c.b.getInt(obj, j);
    }

    public static long i(long j, Object obj) {
        return c.b.getLong(obj, j);
    }

    public static Object j(long j, Object obj) {
        return c.b.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger.getLogger(nvj.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void l(byte[] bArr, byte b2, long j) {
        c.f(bArr, f + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int h = h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        o(j2, obj, ((255 & b2) << i) | (h & (~(255 << i))));
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(j2, obj, ((255 & b2) << i) | (h(j2, obj) & (~(255 << i))));
    }

    public static void o(long j, Object obj, int i) {
        c.b.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void q(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
