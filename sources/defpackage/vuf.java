package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vuf extends uuf implements zba {
    public final Method a;

    public vuf(Method method) {
        this.a = method;
    }

    @Override // defpackage.uuf
    public final Member b() {
        return this.a;
    }

    public final zuf f() {
        Type genericReturnType = this.a.getGenericReturnType();
        genericReturnType.getClass();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new xuf(cls);
            }
        }
        if (!(genericReturnType instanceof GenericArrayType) && (!z || !((Class) genericReturnType).isArray())) {
            if (genericReturnType instanceof WildcardType) {
                return new cvf((WildcardType) genericReturnType);
            }
            return new ouf(genericReturnType);
        }
        return new guf(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        parameterAnnotations.getClass();
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // defpackage.zba
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new avf(typeVariable));
        }
        return arrayList;
    }
}
