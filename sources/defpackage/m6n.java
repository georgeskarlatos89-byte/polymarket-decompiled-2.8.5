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
public abstract class m6n {
    public static final Unsafe a;
    public static final Class b;
    public static final mvj c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    static {
        Unsafe unsafe;
        boolean z;
        mvj mvjVar;
        boolean z2;
        Field b2;
        mvj mvjVar2;
        z5n z5nVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2(5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        int i = xjm.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean l = l(cls);
        Class cls2 = Integer.TYPE;
        boolean l2 = l(cls2);
        boolean z3 = true;
        if (unsafe != null) {
            if (l) {
                z5nVar = new z5n(unsafe, 1);
            } else if (l2) {
                z5nVar = new z5n(unsafe, 0);
            }
        }
        c = z5nVar;
        if (z5nVar != null) {
            try {
                Class<?> cls3 = z5nVar.b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                Logger.getLogger(m6n.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
            if (b() != null) {
                z = true;
                d = z;
                mvjVar = c;
                if (mvjVar != null) {
                    try {
                        Class<?> cls4 = mvjVar.b.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(m6n.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    e = z2;
                    f = m(byte[].class);
                    m(boolean[].class);
                    a(boolean[].class);
                    m(int[].class);
                    a(int[].class);
                    m(long[].class);
                    a(long[].class);
                    m(float[].class);
                    a(float[].class);
                    m(double[].class);
                    a(double[].class);
                    m(Object[].class);
                    a(Object[].class);
                    b2 = b();
                    if (b2 != null && (mvjVar2 = c) != null) {
                        mvjVar2.b.objectFieldOffset(b2);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    g = z3;
                }
                z2 = false;
                e = z2;
                f = m(byte[].class);
                m(boolean[].class);
                a(boolean[].class);
                m(int[].class);
                a(int[].class);
                m(long[].class);
                a(long[].class);
                m(float[].class);
                a(float[].class);
                m(double[].class);
                a(double[].class);
                m(Object[].class);
                a(Object[].class);
                b2 = b();
                if (b2 != null) {
                    mvjVar2.b.objectFieldOffset(b2);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                g = z3;
            }
        }
        z = false;
        d = z;
        mvjVar = c;
        if (mvjVar != null) {
        }
        z2 = false;
        e = z2;
        f = m(byte[].class);
        m(boolean[].class);
        a(boolean[].class);
        m(int[].class);
        a(int[].class);
        m(long[].class);
        a(long[].class);
        m(float[].class);
        a(float[].class);
        m(double[].class);
        a(double[].class);
        m(Object[].class);
        a(Object[].class);
        b2 = b();
        if (b2 != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        g = z3;
    }

    public static void a(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = xjm.a;
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

    public static void c(Object obj, long j, byte b2) {
        mvj mvjVar = c;
        long j2 = (-4) & j;
        int i = mvjVar.b.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        mvjVar.b.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void d(Object obj, long j, byte b2) {
        mvj mvjVar = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        mvjVar.b.putInt(obj, j2, ((255 & b2) << i) | (mvjVar.b.getInt(obj, j2) & (~(255 << i))));
    }

    public static int e(long j, Object obj) {
        return c.b.getInt(obj, j);
    }

    public static long f(Object obj, long j) {
        return c.b.getLong(obj, j);
    }

    public static Object g(long j, Object obj) {
        return c.b.getObject(obj, j);
    }

    public static void h(long j, Object obj, int i) {
        c.b.putInt(obj, j, i);
    }

    public static void i(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean j(long j, Object obj) {
        if (((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean k(long j, Object obj) {
        if (((byte) ((c.b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean l(Class cls) {
        int i = xjm.a;
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

    public static int m(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }
}
