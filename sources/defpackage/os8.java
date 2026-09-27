package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class os8 {
    public final ndc a;
    public final Object b;
    public final ndc c;
    public final ns8 d;
    public final Method e;

    public os8(ndc ndcVar, Object obj, ndc ndcVar2, ns8 ns8Var, Class cls) {
        if (ndcVar != null) {
            if (ns8Var.b == jnk.MESSAGE && ndcVar2 == null) {
                dmk.v("Null messageDefaultInstance");
                throw null;
            }
            this.a = ndcVar;
            this.b = obj;
            this.c = ndcVar2;
            this.d = ns8Var;
            if (x4a.class.isAssignableFrom(cls)) {
                try {
                    this.e = cls.getMethod("valueOf", Integer.TYPE);
                    return;
                } catch (NoSuchMethodException e) {
                    String name = cls.getName();
                    omf.m(ix2.p(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
                    throw null;
                }
            }
            this.e = null;
            return;
        }
        dmk.v("Null containingTypeDefaultInstance");
        throw null;
    }

    public final Object a(Object obj) {
        if (this.d.b.a() == lnk.ENUM) {
            try {
                return this.e.invoke(null, (Integer) obj);
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
        return obj;
    }

    public final Object b(Object obj) {
        if (this.d.b.a() == lnk.ENUM) {
            return Integer.valueOf(((x4a) obj).a());
        }
        return obj;
    }
}
