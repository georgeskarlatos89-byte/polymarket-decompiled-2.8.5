package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class s1k {
    public static final Set a = Collections.EMPTY_SET;
    public static final Type[] b = new Type[0];
    public static final Class c;
    public static final Class d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        d = cls;
        c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new k1k(a(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof l1k) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new l1k(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type instanceof k1k) {
                return type;
            }
            return new k1k(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (type instanceof m1k) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new m1k(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            fi9.p(type, ". Use the boxed type.", "Unexpected primitive ");
        }
    }

    public static JsonAdapter c(blc blcVar, Type type, Class cls) {
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        mda mdaVar = (mda) cls.getAnnotation(mda.class);
        if (mdaVar != null && mdaVar.generateAdapter()) {
            try {
                try {
                    cls2 = Class.forName(cls.getName().replace("$", "_") + "JsonAdapter", true, cls.getClassLoader());
                    try {
                        if (type instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                            try {
                                declaredConstructor = cls2.getDeclaredConstructor(blc.class, Type[].class);
                                objArr = new Object[]{blcVar, actualTypeArguments};
                            } catch (NoSuchMethodException unused) {
                                declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                objArr = new Object[]{actualTypeArguments};
                            }
                        } else {
                            try {
                                declaredConstructor = cls2.getDeclaredConstructor(blc.class);
                                objArr = new Object[]{blcVar};
                            } catch (NoSuchMethodException unused2) {
                                declaredConstructor = cls2.getDeclaredConstructor(null);
                                objArr = new Object[0];
                            }
                        }
                        declaredConstructor.setAccessible(true);
                        return ((JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
                    } catch (NoSuchMethodException e) {
                        e = e;
                        if (!(type instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                            StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                            sb.append(type);
                            String canonicalName = cls2.getCanonicalName();
                            sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                            sb.append(canonicalName);
                            sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                            throw new RuntimeException(sb.toString(), e);
                        }
                        ahh.l("Failed to find the generated JsonAdapter constructor for ", type, e);
                        return null;
                    }
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    cls2 = null;
                }
            } catch (ClassNotFoundException e3) {
                ahh.l("Failed to find the generated JsonAdapter class for ", type, e3);
            } catch (IllegalAccessException e4) {
                ahh.l("Failed to access the generated JsonAdapter for ", type, e4);
                return null;
            } catch (InstantiationException e5) {
                ahh.l("Failed to instantiate the generated JsonAdapter for ", type, e5);
                return null;
            } catch (InvocationTargetException e6) {
                j(e6);
                throw null;
            }
        }
        return null;
    }

    public static Type d(Type type, Class cls, Class cls2) {
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
                    return d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean e(Class cls) {
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("androidx.") && !name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    public static Set f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(pfa.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [vda, java.lang.RuntimeException] */
    public static vda g(String str, String str2, JsonReader jsonReader) {
        String sb;
        String e = jsonReader.e();
        if (str2.equals(str)) {
            sb = m51.k("Required value '", str, "' missing at ", e);
        } else {
            StringBuilder r = m51.r("Required value '", str, "' (JSON name '", str2, "') missing at ");
            r.append(e);
            sb = r.toString();
        }
        return new RuntimeException(sb);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static Type h(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        omf.a();
        return null;
    }

    public static Type i(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type[] typeArr;
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (linkedHashSet.contains(typeVariable)) {
                    return type2;
                }
                linkedHashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type d2 = d(type, cls, cls2);
                    if (d2 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i < typeParameters.length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) d2).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        dmk.t();
                        return null;
                    }
                }
                type2 = typeVariable;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type i2 = i(type, cls, componentType, linkedHashSet);
                        if (componentType == i2) {
                            return cls3;
                        }
                        return new k1k(i2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type i3 = i(type, cls, genericComponentType, linkedHashSet);
                    if (genericComponentType == i3) {
                        return genericArrayType;
                    }
                    return new k1k(i3);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type i4 = i(type, cls, ownerType, linkedHashSet);
                    if (i4 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type i5 = i(type, cls, actualTypeArguments[i], linkedHashSet);
                        if (i5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = i5;
                        }
                        i++;
                    }
                    if (z) {
                        return new l1k(i4, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                }
                boolean z2 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type i6 = i(type, cls, lowerBounds[0], linkedHashSet);
                        type3 = wildcardType;
                        if (i6 != lowerBounds[0]) {
                            if (i6 instanceof WildcardType) {
                                typeArr = ((WildcardType) i6).getLowerBounds();
                            } else {
                                typeArr = new Type[]{i6};
                            }
                            return new m1k(new Type[]{Object.class}, typeArr);
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type i7 = i(type, cls, upperBounds[0], linkedHashSet);
                            type3 = wildcardType;
                            if (i7 != upperBounds[0]) {
                                return aym.r(i7);
                            }
                        }
                    }
                }
                return type3;
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static void j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (!(targetException instanceof RuntimeException)) {
            if (targetException instanceof Error) {
                throw ((Error) targetException);
            }
            throw new RuntimeException(targetException);
        }
        throw ((RuntimeException) targetException);
    }

    public static String k(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String l(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [vda, java.lang.RuntimeException] */
    public static vda m(String str, String str2, JsonReader jsonReader) {
        String sb;
        String e = jsonReader.e();
        if (str2.equals(str)) {
            sb = m51.k("Non-null value '", str, "' was null at ", e);
        } else {
            StringBuilder r = m51.r("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            r.append(e);
            sb = r.toString();
        }
        return new RuntimeException(sb);
    }
}
