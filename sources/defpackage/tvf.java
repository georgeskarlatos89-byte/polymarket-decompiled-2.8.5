package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class tvf {
    public static final eun a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eun] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r0;
        try {
            r0 = new svf();
        } catch (ReflectiveOperationException unused) {
            r0 = new Object();
        }
        a = r0;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static String e(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str));
        }
        return "";
    }

    public static void f(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder s = ix2.s("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            s.append(e(e));
            throw new RuntimeException(s.toString(), e);
        }
    }
}
