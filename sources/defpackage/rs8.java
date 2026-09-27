package defpackage;

import com.appsflyer.internal.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class rs8 extends g4 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, rs8> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected ouj unknownFields;

    public rs8() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ouj.f;
    }

    public static void h(rs8 rs8Var) {
        if (n(rs8Var, true)) {
        } else {
            throw new IOException(new auj().getMessage());
        }
    }

    public static rs8 k(Class cls) {
        rs8 rs8Var = defaultInstanceMap.get(cls);
        if (rs8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rs8Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                fi9.n("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (rs8Var == null) {
            try {
                rs8 l = ((rs8) nvj.a.allocateInstance(cls)).l();
                if (l != null) {
                    defaultInstanceMap.put(cls, l);
                    return l;
                }
                l.o();
                return null;
            } catch (InstantiationException e2) {
                xbc.m(e2);
                return null;
            }
        }
        return rs8Var;
    }

    public static Object m(Method method, rs8 rs8Var, Object... objArr) {
        try {
            return method.invoke(rs8Var, objArr);
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

    public static final boolean n(rs8 rs8Var, boolean z) {
        byte byteValue = ((Byte) rs8Var.j(ps8.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        xff xffVar = xff.c;
        xffVar.getClass();
        boolean c = xffVar.a(rs8Var.getClass()).c(rs8Var);
        if (z) {
            rs8Var.j(ps8.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c;
    }

    public static rs8 s(rs8 rs8Var, fw1 fw1Var, mt7 mt7Var) {
        cw1 cw1Var = (cw1) fw1Var;
        byte[] bArr = cw1Var.d;
        int h = cw1Var.h();
        int size = cw1Var.size();
        s84 s84Var = new s84(bArr, h, size, true);
        try {
            s84Var.k(size);
            rs8 t = t(rs8Var, s84Var, mt7Var);
            s84Var.b(0);
            h(t);
            return t;
        } catch (z7a e) {
            xbc.s(e);
            return null;
        }
    }

    public static rs8 t(rs8 rs8Var, w84 w84Var, mt7 mt7Var) {
        rs8 r = rs8Var.r();
        try {
            xff xffVar = xff.c;
            xffVar.getClass();
            wig a = xffVar.a(r.getClass());
            z84 z84Var = (z84) w84Var.b;
            if (z84Var == null) {
                z84Var = new z84(w84Var);
            }
            a.e(r, z84Var, mt7Var);
            a.b(r);
            return r;
        } catch (auj e) {
            throw new IOException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof z7a) {
                throw ((z7a) e2.getCause());
            }
            throw e2;
        } catch (z7a e3) {
            if (e3.a) {
                throw new IOException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof z7a) {
                throw ((z7a) e4.getCause());
            }
            throw new IOException(e4.getMessage(), e4);
        }
    }

    public static void u(Class cls, rs8 rs8Var) {
        rs8Var.p();
        defaultInstanceMap.put(cls, rs8Var);
    }

    @Override // defpackage.pdc
    public /* bridge */ /* synthetic */ rs8 a() {
        return l();
    }

    @Override // defpackage.g4
    public final int b(wig wigVar) {
        int g;
        int g2;
        if (o()) {
            if (wigVar == null) {
                xff xffVar = xff.c;
                xffVar.getClass();
                g2 = xffVar.a(getClass()).g(this);
            } else {
                g2 = wigVar.g(this);
            }
            if (g2 >= 0) {
                return g2;
            }
            dmk.n(ace.f(g2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & bd0.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i & bd0.API_PRIORITY_OTHER;
        }
        if (wigVar == null) {
            xff xffVar2 = xff.c;
            xffVar2.getClass();
            g = xffVar2.a(getClass()).g(this);
        } else {
            g = wigVar.g(this);
        }
        v(g);
        return g;
    }

    @Override // defpackage.g4
    public /* bridge */ /* synthetic */ gs8 d() {
        return q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xff xffVar = xff.c;
        xffVar.getClass();
        return xffVar.a(getClass()).f(this, (rs8) obj);
    }

    @Override // defpackage.g4
    public final void g(b94 b94Var) {
        xff xffVar = xff.c;
        xffVar.getClass();
        wig a = xffVar.a(getClass());
        x71 x71Var = b94Var.a;
        if (x71Var == null) {
            x71Var = new x71(b94Var);
        }
        a.h(this, x71Var);
    }

    public final int hashCode() {
        if (o()) {
            xff xffVar = xff.c;
            xffVar.getClass();
            return xffVar.a(getClass()).i(this);
        }
        int i = this.memoizedHashCode;
        if (i == 0) {
            xff xffVar2 = xff.c;
            xffVar2.getClass();
            int i2 = xffVar2.a(getClass()).i(this);
            this.memoizedHashCode = i2;
            return i2;
        }
        return i;
    }

    public final gs8 i() {
        return (gs8) j(ps8.NEW_BUILDER);
    }

    public abstract Object j(ps8 ps8Var);

    public final rs8 l() {
        return (rs8) j(ps8.GET_DEFAULT_INSTANCE);
    }

    public final boolean o() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void p() {
        this.memoizedSerializedSize &= bd0.API_PRIORITY_OTHER;
    }

    public final gs8 q() {
        return (gs8) j(ps8.NEW_BUILDER);
    }

    public final rs8 r() {
        return (rs8) j(ps8.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = qdc.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        qdc.c(this, sb, 0);
        return sb.toString();
    }

    public final void v(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & bd0.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            dmk.n(ace.f(i, "serialized size must be non-negative, was "));
        }
    }

    public final gs8 w() {
        gs8 gs8Var = (gs8) j(ps8.NEW_BUILDER);
        if (!gs8Var.a.equals(this)) {
            gs8Var.e();
            gs8.f(gs8Var.b, this);
        }
        return gs8Var;
    }
}
