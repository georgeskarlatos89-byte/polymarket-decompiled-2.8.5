package defpackage;

import com.appsflyer.internal.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class usm extends djm {
    private static final Map zzb = new ConcurrentHashMap();
    protected b5n zzc;
    private int zzd;

    public usm() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = b5n.f;
    }

    public static Object c(Method method, usm usmVar, Object... objArr) {
        try {
            return method.invoke(usmVar, objArr);
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

    public static void e(Class cls, usm usmVar) {
        usmVar.d();
        zzb.put(cls, usmVar);
    }

    public static final boolean g(usm usmVar, boolean z) {
        usm usmVar2 = null;
        byte byteValue = ((Byte) usmVar.j(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = m1n.c.a(usmVar.getClass()).zzk(usmVar);
        if (z) {
            if (true == zzk) {
                usmVar2 = usmVar;
            }
            usmVar.j(2, usmVar2);
        }
        return zzk;
    }

    public static usm k(usm usmVar, byte[] bArr, int i, cqm cqmVar) {
        if (i == 0) {
            return usmVar;
        }
        usm usmVar2 = (usm) usmVar.j(4, null);
        try {
            g2n a = m1n.c.a(usmVar2.getClass());
            a.d(usmVar2, bArr, 0, i, new ykm(cqmVar));
            a.zzf(usmVar2);
            return usmVar2;
        } catch (bvm e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bvm) {
                throw ((bvm) e2.getCause());
            }
            throw new IOException(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            dmk.B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        } catch (q4n e3) {
            dmk.B(e3.getMessage());
            return null;
        }
    }

    public static usm m(Class cls) {
        Map map = zzb;
        usm usmVar = (usm) map.get(cls);
        if (usmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                usmVar = (usm) map.get(cls);
            } catch (ClassNotFoundException e) {
                fi9.n("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (usmVar == null) {
            try {
                usm usmVar2 = (usm) ((usm) m6n.a.allocateInstance(cls)).j(6, null);
                if (usmVar2 != null) {
                    map.put(cls, usmVar2);
                    return usmVar2;
                }
                l.o();
                return null;
            } catch (InstantiationException e2) {
                xbc.m(e2);
                return null;
            }
        }
        return usmVar;
    }

    @Override // defpackage.djm
    public final int a(g2n g2nVar) {
        if (h()) {
            int a = g2nVar.a(this);
            if (a >= 0) {
                return a;
            }
            dmk.n(ace.f(a, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & bd0.API_PRIORITY_OTHER;
        if (i == Integer.MAX_VALUE) {
            int a2 = g2nVar.a(this);
            if (a2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | a2;
                return a2;
            }
            dmk.n(ace.f(a2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    public final void d() {
        this.zzd &= bd0.API_PRIORITY_OTHER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m1n.c.a(getClass()).e(this, (usm) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | bd0.API_PRIORITY_OTHER;
    }

    public final boolean h() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!h()) {
            int i = this.zza;
            if (i == 0) {
                int c = m1n.c.a(getClass()).c(this);
                this.zza = c;
                return c;
            }
            return i;
        }
        return m1n.c.a(getClass()).c(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [zom, java.lang.Object] */
    public final void i(gom gomVar) {
        g2n a = m1n.c.a(getClass());
        zom zomVar = gomVar.a;
        zom zomVar2 = zomVar;
        if (zomVar == null) {
            ?? obj = new Object();
            Charset charset = jum.a;
            obj.a = gomVar;
            gomVar.a = obj;
            zomVar2 = obj;
        }
        a.b(this, zomVar2);
    }

    public abstract Object j(int i, usm usmVar);

    public final int l() {
        if (h()) {
            int a = m1n.c.a(getClass()).a(this);
            if (a >= 0) {
                return a;
            }
            dmk.n(ace.f(a, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & bd0.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int a2 = m1n.c.a(getClass()).a(this);
        if (a2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | a2;
            return a2;
        }
        dmk.n(ace.f(a2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = wzm.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        wzm.c(this, sb, 0);
        return sb.toString();
    }
}
