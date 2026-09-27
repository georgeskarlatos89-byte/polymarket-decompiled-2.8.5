package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class svf extends eun {
    public final Method a = Class.class.getMethod("isRecord", null);
    public final Method b = Class.class.getMethod("getRecordComponents", null);
    public final Method c;
    public final Method d;

    public svf() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override // defpackage.eun
    public final Method a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            omf.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.eun
    public final Constructor b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            omf.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.eun
    public final String[] c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            omf.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.eun
    public final boolean d(Class cls) {
        try {
            return ((Boolean) this.a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            omf.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
