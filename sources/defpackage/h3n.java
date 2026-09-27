package defpackage;

import android.text.Layout;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.text.StringsKt;
import kotlin.text.e;
import kotlin.text.i;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class h3n {
    public static final Type[] a = new Type[0];
    public static boolean b = true;

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            omf.a();
        }
    }

    public static boolean b(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z = false;
            } else {
                z = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z && equals && equals2) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type c(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final int d(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static Type e(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder o = ace.o(i, "Index ", " not in range [0,");
        o.append(actualTypeArguments.length);
        o.append(") for ");
        o.append(parameterizedType);
        throw new IllegalArgumentException(o.toString());
    }

    public static Class f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            omf.a();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        ahh.n(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type g(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return p(type, cls, c(type, cls, Map.class));
        }
        omf.a();
        return null;
    }

    public static boolean h(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (h(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return h(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        ahh.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
        return false;
    }

    public static boolean i(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException j(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder t = sv6.t(String.format(str, objArr), "\n    for method ");
        t.append(method.getDeclaringClass().getSimpleName());
        t.append(".");
        t.append(method.getName());
        return new IllegalArgumentException(t.toString(), exc);
    }

    public static IllegalArgumentException k(Method method, int i, String str, Object... objArr) {
        return j(method, null, m51.k(str, " (", aoe.b.e(method, i), ")"), objArr);
    }

    public static IllegalArgumentException l(Method method, Exception exc, int i, String str, Object... objArr) {
        return j(method, exc, m51.k(str, " (", aoe.b.e(method, i), ")"), objArr);
    }

    public static final int m(String str) {
        if (e.u(str, "#", false)) {
            int length = str.length();
            if (length != 4) {
                if (length != 5) {
                    if (length != 7) {
                        if (length != 9) {
                            return -16777216;
                        }
                        return i.e(str.substring(1));
                    }
                    return i.e(str.substring(1)) | (-16777216);
                }
                int e = i.e(str.substring(1));
                return ((e & 15) * 17) | (((e >> 12) & 15) * 285212672) | (((e >> 8) & 15) * 1114112) | (((e >> 4) & 15) * 4352) | (-16777216);
            }
            int e2 = i.e(str.substring(1));
            return ((e2 & 15) * 17) | (((e2 >> 8) & 15) * 1114112) | (((e2 >> 4) & 15) * 4352) | (-16777216);
        }
        f27.q("Invalid color value ".concat(str));
        return 0;
    }

    public static final float n(String str, il6 il6Var) {
        il6Var.getClass();
        if (str == null) {
            return 0.0f;
        }
        if (e.n(str, "dp", false)) {
            return Float.parseFloat(StringsKt.Z(str, "dp"));
        }
        if (e.n(str, "px", false)) {
            return il6Var.k0(Float.parseFloat(StringsKt.Z(str, "px")));
        }
        py2.f("value should ends with dp or px");
        return 0.0f;
    }

    public static final int o(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1073910849) {
            if (hashCode != -436781190) {
                if (hashCode == 94742715 && str.equals("clamp")) {
                    return 0;
                }
            } else if (str.equals("repeated")) {
                return 1;
            }
        } else if (str.equals("mirror")) {
            return 2;
        }
        py2.f("unknown tileMode: ".concat(str));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:1:0x0000->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type p(Type type, Class cls, Type type2) {
        Type type3;
        boolean z;
        Class cls2;
        Type type4;
        while (true) {
            int i = 0;
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type3;
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type c = c(type, cls, cls2);
                    if (c instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i < typeParameters.length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type4 = ((ParameterizedType) c).getActualTypeArguments()[i];
                                if (type4 != typeVariable) {
                                    return type4;
                                }
                                type3 = type4;
                            } else {
                                i++;
                            }
                        }
                        dmk.t();
                        return null;
                    }
                }
                type4 = typeVariable;
                if (type4 != typeVariable) {
                }
            } else {
                if (type3 instanceof Class) {
                    Class cls3 = (Class) type3;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type p = p(type, cls, componentType);
                        if (componentType == p) {
                            return cls3;
                        }
                        return new v1k(p);
                    }
                }
                if (type3 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type3;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type p2 = p(type, cls, genericComponentType);
                    if (genericComponentType == p2) {
                        return genericArrayType;
                    }
                    return new v1k(p2);
                }
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type p3 = p(type, cls, ownerType);
                    if (p3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type p4 = p(type, cls, actualTypeArguments[i]);
                        if (p4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = p4;
                        }
                        i++;
                    }
                    if (z) {
                        return new w1k(p3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                }
                boolean z2 = type3 instanceof WildcardType;
                Type type5 = type3;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type3;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type p5 = p(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (p5 != lowerBounds[0]) {
                            return new x1k(new Type[]{Object.class}, new Type[]{p5});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type p6 = p(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (p6 != upperBounds[0]) {
                                return new x1k(new Type[]{p6}, a);
                            }
                        }
                    }
                }
                return type5;
            }
        }
    }

    public static void q(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th);
                }
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static String r(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
