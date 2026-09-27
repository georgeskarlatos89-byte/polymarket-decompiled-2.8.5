package kotlin.jvm.internal;

import defpackage.m51;
import defpackage.sv6;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Intrinsics {
    public static boolean a(Double d, double d2) {
        if (d != null && d.doubleValue() == d2) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean b(Double d, Double d2) {
        if (d == null) {
            if (d2 != null) {
                return false;
            }
            return true;
        }
        if (d2 == null || d.doubleValue() != d2.doubleValue()) {
            return false;
        }
        return true;
    }

    public static boolean c(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(sv6.m(str, " must not be null"));
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder r = m51.r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        r.append(str);
        NullPointerException nullPointerException = new NullPointerException(r.toString());
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static int e(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void g() {
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void h() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void i(String str) {
        RuntimeException runtimeException = new RuntimeException(sv6.n("lateinit property ", str, " has not been initialized"));
        f(runtimeException, Intrinsics.class.getName());
        throw runtimeException;
    }
}
