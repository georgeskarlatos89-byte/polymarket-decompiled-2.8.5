package com.google.gson.internal;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class Primitives {
    private Primitives() {
    }

    public static boolean isPrimitive(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            return true;
        }
        return false;
    }

    public static boolean isWrapperType(Type type) {
        if (type != Integer.class && type != Float.class && type != Byte.class && type != Double.class && type != Long.class && type != Character.class && type != Boolean.class && type != Short.class && type != Void.class) {
            return false;
        }
        return true;
    }

    public static <T> Class<T> unwrap(Class<T> cls) {
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Void.class) {
            return Void.TYPE;
        }
        return cls;
    }

    public static <T> Class<T> wrap(Class<T> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }
}
