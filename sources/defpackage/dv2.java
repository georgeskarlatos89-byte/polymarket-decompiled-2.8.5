package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class dv2 {
    public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        return h3n.e(i, parameterizedType);
    }

    public static Class<?> getRawType(Type type) {
        return h3n.f(type);
    }

    public abstract ev2 get(Type type, Annotation[] annotationArr, i6g i6gVar);
}
