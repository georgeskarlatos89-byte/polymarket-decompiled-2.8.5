package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bgl {
    public static final Locale a = Locale.ROOT;

    public static String a(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String obj2 = obj.toString();
                if (obj2 != null) {
                    return obj2;
                }
                return b(obj, "toString() returned null");
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e2) {
                simpleName = e2.getClass().getSimpleName();
            }
            return b(obj, simpleName);
        }
    }

    public static String b(Object obj, String str) {
        return woa.r(m51.q("{", obj.getClass().getName(), "@", System.identityHashCode(obj), ": "), str, "}");
    }

    public static void c(StringBuilder sb, long j, boolean z) {
        String str;
        if (j == 0) {
            sb.append("0");
            return;
        }
        if (true != z) {
            str = "0123456789abcdef";
        } else {
            str = "0123456789ABCDEF";
        }
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }
}
