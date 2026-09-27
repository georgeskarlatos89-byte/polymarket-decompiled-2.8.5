package defpackage;

import com.appsflyer.internal.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ts8 extends i4 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ts8> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected puj unknownFields;

    public ts8() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = puj.f;
    }

    public static ts8 d(Class cls) {
        ts8 ts8Var = defaultInstanceMap.get(cls);
        if (ts8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ts8Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                fi9.n("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (ts8Var == null) {
            try {
                ts8 ts8Var2 = (ts8) ((ts8) ovj.a.allocateInstance(cls)).c(qs8.GET_DEFAULT_INSTANCE);
                if (ts8Var2 != null) {
                    defaultInstanceMap.put(cls, ts8Var2);
                    return ts8Var2;
                }
                l.o();
                return null;
            } catch (InstantiationException e2) {
                xbc.m(e2);
                return null;
            }
        }
        return ts8Var;
    }

    public static Object e(Method method, ts8 ts8Var, Object... objArr) {
        try {
            return method.invoke(ts8Var, objArr);
        } catch (IllegalAccessException e) {
            omf.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    omf.m("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean f(ts8 ts8Var, boolean z) {
        byte byteValue = ((Byte) ts8Var.c(qs8.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        zff zffVar = zff.c;
        zffVar.getClass();
        boolean c = zffVar.a(ts8Var.getClass()).c(ts8Var);
        if (z) {
            ts8Var.c(qs8.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c;
    }

    public static void j(Class cls, ts8 ts8Var) {
        ts8Var.h();
        defaultInstanceMap.put(cls, ts8Var);
    }

    @Override // defpackage.i4
    public final int a(xig xigVar) {
        int i;
        int i2;
        if (g()) {
            if (xigVar == null) {
                zff zffVar = zff.c;
                zffVar.getClass();
                i2 = zffVar.a(getClass()).i(this);
            } else {
                i2 = xigVar.i(this);
            }
            if (i2 >= 0) {
                return i2;
            }
            dmk.n(ace.f(i2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & bd0.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i3 & bd0.API_PRIORITY_OTHER;
        }
        if (xigVar == null) {
            zff zffVar2 = zff.c;
            zffVar2.getClass();
            i = zffVar2.a(getClass()).i(this);
        } else {
            i = xigVar.i(this);
        }
        k(i);
        return i;
    }

    @Override // defpackage.i4
    public final void b(e94 e94Var) {
        zff zffVar = zff.c;
        zffVar.getClass();
        xig a = zffVar.a(getClass());
        jw8 jw8Var = e94Var.a;
        if (jw8Var == null) {
            jw8Var = new jw8(e94Var);
        }
        a.e(this, jw8Var);
    }

    public abstract Object c(qs8 qs8Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zff zffVar = zff.c;
        zffVar.getClass();
        return zffVar.a(getClass()).f(this, (ts8) obj);
    }

    public final boolean g() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.memoizedSerializedSize &= bd0.API_PRIORITY_OTHER;
    }

    public final int hashCode() {
        if (g()) {
            zff zffVar = zff.c;
            zffVar.getClass();
            return zffVar.a(getClass()).h(this);
        }
        int i = this.memoizedHashCode;
        if (i == 0) {
            zff zffVar2 = zff.c;
            zffVar2.getClass();
            int h = zffVar2.a(getClass()).h(this);
            this.memoizedHashCode = h;
            return h;
        }
        return i;
    }

    public final ts8 i() {
        return (ts8) c(qs8.NEW_MUTABLE_INSTANCE);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & bd0.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            dmk.n(ace.f(i, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = rdc.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        rdc.c(this, sb, 0);
        return sb.toString();
    }
}
