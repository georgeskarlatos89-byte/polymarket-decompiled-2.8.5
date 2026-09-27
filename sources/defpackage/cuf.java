package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cuf extends quf {
    public final Annotation a;

    public cuf(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final ArrayList b() {
        duf tufVar;
        Annotation annotation = this.a;
        Method[] declaredMethods = vzm.m(vzm.l(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, null);
            invoke.getClass();
            csc e = csc.e(method.getName());
            Class<?> cls = invoke.getClass();
            List list = buf.a;
            if (Enum.class.isAssignableFrom(cls)) {
                tufVar = new ruf(e, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                tufVar = new euf(e, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                tufVar = new fuf(e, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                tufVar = new nuf(e, (Class) invoke);
            } else {
                tufVar = new tuf(e, invoke);
            }
            arrayList.add(tufVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuf) {
            if (this.a == ((cuf) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return cuf.class.getName() + ": " + this.a;
    }
}
