package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import defpackage.ace;
import defpackage.c05;
import defpackage.d05;
import defpackage.e05;
import defpackage.f05;
import defpackage.il1;
import defpackage.omf;
import defpackage.py2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final List<ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z;
        this.reflectionFilters = list;
    }

    public static /* synthetic */ Map a() {
        return lambda$newMapConstructor$17();
    }

    public static /* synthetic */ Collection b() {
        return lambda$newCollectionConstructor$10();
    }

    public static /* synthetic */ Map c() {
        return lambda$newMapConstructor$15();
    }

    public static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
        }
        return null;
    }

    public static /* synthetic */ Object d(String str) {
        return lambda$get$3(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        return lambda$newUnsafeAllocator$19(cls);
    }

    public static /* synthetic */ Object f(Type type) {
        return lambda$newSpecialCollectionConstructor$6(type);
    }

    public static /* synthetic */ Object g(InstanceCreator instanceCreator, Type type) {
        return lambda$get$0(instanceCreator, type);
    }

    public static /* synthetic */ Map h() {
        return lambda$newMapConstructor$18();
    }

    private static boolean hasStringKeyType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 0 && GsonTypes.getRawType(actualTypeArguments[0]) == String.class) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object i(InstanceCreator instanceCreator, Type type) {
        return lambda$get$1(instanceCreator, type);
    }

    public static /* synthetic */ Map j() {
        return lambda$newMapConstructor$16();
    }

    public static /* synthetic */ Object k(String str) {
        return lambda$newDefaultConstructor$8(str);
    }

    public static /* synthetic */ Collection l() {
        return lambda$newCollectionConstructor$11();
    }

    private static /* synthetic */ Object lambda$get$0(InstanceCreator instanceCreator, Type type) {
        return instanceCreator.createInstance(type);
    }

    private static /* synthetic */ Object lambda$get$1(InstanceCreator instanceCreator, Type type) {
        return instanceCreator.createInstance(type);
    }

    private static /* synthetic */ Object lambda$get$2(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$get$3(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$get$4(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$10() {
        return new ArrayList();
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$11() {
        return new LinkedHashSet();
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$12() {
        return new TreeSet();
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$13() {
        return new ArrayDeque();
    }

    private static /* synthetic */ Object lambda$newDefaultConstructor$7(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$newDefaultConstructor$8(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$newDefaultConstructor$9(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            omf.m("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    private static /* synthetic */ Map lambda$newMapConstructor$14() {
        return new LinkedTreeMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$15() {
        return new LinkedHashMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$16() {
        return new TreeMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$17() {
        return new ConcurrentHashMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$18() {
        return new ConcurrentSkipListMap();
    }

    private static /* synthetic */ Object lambda$newSpecialCollectionConstructor$5(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            py2.l(type, "Invalid EnumSet type: ");
            return null;
        }
        py2.l(type, "Invalid EnumSet type: ");
        return null;
    }

    private static /* synthetic */ Object lambda$newSpecialCollectionConstructor$6(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            py2.l(type, "Invalid EnumMap type: ");
            return null;
        }
        py2.l(type, "Invalid EnumMap type: ");
        return null;
    }

    private static /* synthetic */ Object lambda$newUnsafeAllocator$19(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e) {
            omf.m(ace.k(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
            return null;
        }
    }

    private static /* synthetic */ Object lambda$newUnsafeAllocator$20(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object m(Type type) {
        return lambda$newSpecialCollectionConstructor$5(type);
    }

    public static /* synthetic */ Object n(String str) {
        return lambda$newDefaultConstructor$7(str);
    }

    private static ObjectConstructor<? extends Collection<? extends Object>> newCollectionConstructor(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new f05(4);
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new f05(6);
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new f05(8);
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new f05(9);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, ReflectionAccessFilter.FilterResult filterResult) {
        String tryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            if (filterResult != filterResult2 && (!ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) || (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return new il1(ace.k(cls, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."), 5);
            }
            if (filterResult == filterResult2 && (tryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) != null) {
                return new il1(tryMakeAccessible, 6);
            }
            return new e05(declaredConstructor, 1);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newCollectionConstructor(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newMapConstructor(type, cls);
        }
        return null;
    }

    private static ObjectConstructor<? extends Map<? extends Object, Object>> newMapConstructor(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(LinkedTreeMap.class) && hasStringKeyType(type)) {
            return new py2(26);
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new py2(27);
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new py2(28);
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new py2(29);
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new f05(0);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new c05(1, type);
        }
        if (cls == EnumMap.class) {
            return new c05(2, type);
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new d05(cls, 0);
        }
        String k = ace.k(cls, "Unable to create instance of ", "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        if (cls.getDeclaredConstructors().length == 0) {
            k = k.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new il1(k, 2);
    }

    public static /* synthetic */ Object o(String str) {
        return lambda$newUnsafeAllocator$20(str);
    }

    public static /* synthetic */ Map p() {
        return lambda$newMapConstructor$14();
    }

    public static /* synthetic */ Object q(String str) {
        return lambda$get$2(str);
    }

    public static /* synthetic */ Collection r() {
        return lambda$newCollectionConstructor$12();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        return lambda$newDefaultConstructor$9(constructor);
    }

    public static /* synthetic */ Collection t() {
        return lambda$newCollectionConstructor$13();
    }

    public static /* synthetic */ Object u(String str) {
        return lambda$get$4(str);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken, boolean z) {
        final Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            final int i = 0;
            return new ObjectConstructor() { // from class: g05
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    int i2 = i;
                    Type type2 = type;
                    InstanceCreator instanceCreator2 = instanceCreator;
                    switch (i2) {
                        case 0:
                            return ConstructorConstructor.g(instanceCreator2, type2);
                        default:
                            return ConstructorConstructor.i(instanceCreator2, type2);
                    }
                }
            };
        }
        final InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            final int i2 = 1;
            return new ObjectConstructor() { // from class: g05
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    int i22 = i2;
                    Type type2 = type;
                    InstanceCreator instanceCreator22 = instanceCreator2;
                    switch (i22) {
                        case 0:
                            return ConstructorConstructor.g(instanceCreator22, type2);
                        default:
                            return ConstructorConstructor.i(instanceCreator22, type2);
                    }
                }
            };
        }
        ObjectConstructor<T> newSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (newSpecialCollectionConstructor != null) {
            return newSpecialCollectionConstructor;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> newDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        ObjectConstructor<T> newDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (newDefaultImplementationConstructor != null) {
            return newDefaultImplementationConstructor;
        }
        String checkInstantiable = checkInstantiable(rawType);
        if (checkInstantiable != null) {
            return new il1(checkInstantiable, 9);
        }
        if (!z) {
            return new il1(ace.k(rawType, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."), 10);
        }
        if (filterResult != ReflectionAccessFilter.FilterResult.ALLOW) {
            return new il1(ace.k(rawType, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."), 11);
        }
        return newUnsafeAllocator(rawType);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        return get(typeToken, true);
    }
}
