package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yuf extends uuf {
    public final Object a;

    public yuf(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.uuf
    public final Member b() {
        Object obj = this.a;
        obj.getClass();
        n19 n19Var = hym.b;
        Method method = null;
        if (n19Var == null) {
            Class<?> cls = obj.getClass();
            try {
                n19Var = new n19(7, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                n19Var = new n19(7, null, null);
            }
            hym.b = n19Var;
        }
        Method method2 = (Method) n19Var.c;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, null);
            invoke.getClass();
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final zuf f() {
        Object obj = this.a;
        obj.getClass();
        n19 n19Var = hym.b;
        Class cls = null;
        if (n19Var == null) {
            Class<?> cls2 = obj.getClass();
            try {
                n19Var = new n19(7, cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                n19Var = new n19(7, null, null);
            }
            hym.b = n19Var;
        }
        Method method = (Method) n19Var.b;
        if (method != null) {
            Object invoke = method.invoke(obj, null);
            invoke.getClass();
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new ouf(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
