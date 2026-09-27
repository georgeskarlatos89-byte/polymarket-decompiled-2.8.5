package defpackage;

import com.appsflyer.internal.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class d8l extends b7l {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected aal zzc;

    public d8l() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = aal.f;
    }

    public static d8l c(d8l d8lVar, byte[] bArr, v7l v7lVar) {
        int length = bArr.length;
        if (length != 0) {
            d8l g = d8lVar.g();
            try {
                p9l a = m9l.c.a(g.getClass());
                a.e(g, bArr, 0, length, new be8(v7lVar));
                a.zzk(g);
                d8lVar = g;
            } catch (IOException e) {
                if (e.getCause() instanceof p8l) {
                    throw ((p8l) e.getCause());
                }
                throw new IOException(e.getMessage(), e);
            } catch (IndexOutOfBoundsException unused) {
                t4n.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (p8l e2) {
                if (e2.a) {
                    throw new IOException(e2.getMessage(), e2);
                }
                throw e2;
            } catch (t9l e3) {
                throw e3.a();
            }
        }
        q(d8lVar);
        return d8lVar;
    }

    public static d8l m(Class cls) {
        Map map = zze;
        d8l d8lVar = (d8l) map.get(cls);
        if (d8lVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d8lVar = (d8l) map.get(cls);
            } catch (ClassNotFoundException e) {
                fi9.n("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (d8lVar == null) {
            try {
                d8l d8lVar2 = (d8l) ((d8l) cal.a.allocateInstance(cls)).r(6);
                if (d8lVar2 != null) {
                    map.put(cls, d8lVar2);
                    return d8lVar2;
                }
                l.o();
                return null;
            } catch (InstantiationException e2) {
                xbc.m(e2);
                return null;
            }
        }
        return d8lVar;
    }

    public static void n(Class cls, d8l d8lVar) {
        d8lVar.f();
        zze.put(cls, d8lVar);
    }

    public static Object o(Method method, d8l d8lVar, Object... objArr) {
        try {
            return method.invoke(d8lVar, objArr);
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

    public static final boolean p(d8l d8lVar, boolean z) {
        byte byteValue = ((Byte) d8lVar.r(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = m9l.c.a(d8lVar.getClass()).zzl(d8lVar);
        if (z) {
            d8lVar.r(2);
        }
        return zzl;
    }

    public static void q(d8l d8lVar) {
        if (d8lVar != null && !p(d8lVar, true)) {
            throw new t9l().a();
        }
    }

    @Override // defpackage.b7l
    public final int b(p9l p9lVar) {
        if (e()) {
            int b = p9lVar.b(this);
            if (b >= 0) {
                return b;
            }
            dmk.q(String.valueOf(b).length() + 42, b);
            return 0;
        }
        int i = this.zzb & bd0.API_PRIORITY_OTHER;
        if (i == Integer.MAX_VALUE) {
            int b2 = p9lVar.b(this);
            if (b2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | b2;
                return b2;
            }
            dmk.q(String.valueOf(b2).length() + 42, b2);
            return 0;
        }
        return i;
    }

    public final void d(t7l t7lVar) {
        p9l a = m9l.c.a(getClass());
        e3g e3gVar = t7lVar.a;
        if (e3gVar == null) {
            e3gVar = new e3g(t7lVar);
        }
        a.d(this, e3gVar);
    }

    public final boolean e() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m9l.c.a(getClass()).f(this, (d8l) obj);
    }

    public final void f() {
        this.zzb &= bd0.API_PRIORITY_OTHER;
    }

    public final d8l g() {
        return (d8l) r(4);
    }

    public final void h() {
        m9l.c.a(getClass()).zzk(this);
        f();
    }

    public final int hashCode() {
        if (!e()) {
            int i = this.zza;
            if (i == 0) {
                int c = m9l.c.a(getClass()).c(this);
                this.zza = c;
                return c;
            }
            return i;
        }
        return m9l.c.a(getClass()).c(this);
    }

    public final b8l i() {
        return (b8l) r(5);
    }

    public final b8l j() {
        b8l b8lVar = (b8l) r(5);
        b8lVar.f(this);
        return b8lVar;
    }

    public final void k() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | bd0.API_PRIORITY_OTHER;
    }

    public final int l() {
        if (e()) {
            int b = m9l.c.a(getClass()).b(this);
            if (b >= 0) {
                return b;
            }
            dmk.q(String.valueOf(b).length() + 42, b);
            return 0;
        }
        int i = this.zzb & bd0.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int b2 = m9l.c.a(getClass()).b(this);
        if (b2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | b2;
            return b2;
        }
        dmk.q(String.valueOf(b2).length() + 42, b2);
        return 0;
    }

    public abstract Object r(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = g9l.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        g9l.b(this, sb, 0);
        return sb.toString();
    }
}
