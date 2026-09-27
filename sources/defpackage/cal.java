package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class cal {
    public static final Unsafe a;
    public static final Class b;
    public static final mvj c;
    public static final boolean d;
    public static final long e;
    public static final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0136  */
    static {
        boolean z;
        Field a2;
        mvj mvjVar;
        Unsafe k = k();
        a = k;
        int i = d7l.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean l = l(cls);
        Class cls2 = Integer.TYPE;
        boolean l2 = l(cls2);
        boolean z2 = true;
        bal balVar = null;
        if (k != null) {
            if (l) {
                balVar = new bal(k, 1);
            } else if (l2) {
                balVar = new bal(k, 0);
            }
        }
        c = balVar;
        if (balVar != null) {
            try {
                Class<?> cls3 = balVar.b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th) {
                Logger.getLogger(cal.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        mvj mvjVar2 = c;
        if (mvjVar2 != null) {
            try {
                Class<?> cls4 = mvjVar2.b.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(cal.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
            d = z;
            e = o(byte[].class);
            o(boolean[].class);
            p(boolean[].class);
            o(int[].class);
            p(int[].class);
            o(long[].class);
            p(long[].class);
            o(float[].class);
            p(float[].class);
            o(double[].class);
            p(double[].class);
            o(Object[].class);
            p(Object[].class);
            a2 = a();
            if (a2 != null && (mvjVar = c) != null) {
                mvjVar.b.objectFieldOffset(a2);
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                z2 = false;
            }
            f = z2;
        }
        z = false;
        d = z;
        e = o(byte[].class);
        o(boolean[].class);
        p(boolean[].class);
        o(int[].class);
        p(int[].class);
        o(long[].class);
        p(long[].class);
        o(float[].class);
        p(float[].class);
        o(double[].class);
        p(double[].class);
        o(Object[].class);
        p(Object[].class);
        a2 = a();
        if (a2 != null) {
            mvjVar.b.objectFieldOffset(a2);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f = z2;
    }

    public static Field a() {
        Field field;
        Field field2;
        int i = d7l.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField(PlaceTypes.ADDRESS);
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void b(Object obj, long j, byte b2) {
        Unsafe unsafe = c.b;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.b;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static int d(long j, Object obj) {
        return c.b.getInt(obj, j);
    }

    public static void e(long j, Object obj, int i) {
        c.b.putInt(obj, j, i);
    }

    public static long f(long j, Object obj) {
        return c.b.getLong(obj, j);
    }

    public static void g(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static Object h(long j, Object obj) {
        return c.b.getObject(obj, j);
    }

    public static void i(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }

    public static void j(byte[] bArr, byte b2, long j) {
        c.l(bArr, e + j, b2);
    }

    public static Unsafe k() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2(3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(cal.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean l(Class cls) {
        int i = d7l.a;
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

    public static /* synthetic */ boolean m(long j, Object obj) {
        if (((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean n(long j, Object obj) {
        if (((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static int o(Class cls) {
        if (d) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void p(Class cls) {
        if (d) {
            c.b.arrayIndexScale(cls);
        }
    }
}
