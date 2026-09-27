package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tM9319B53 {
    public static final char[] b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static final byte[] g = null;
    public final ContentResolver a;

    static {
        c();
        e = 0;
        f = 1;
        c = 0;
        d = 1;
        b = new char[]{10252, 10329, 10329, 10318, 10307, 10325, 10312, 10275, 10250, 10248, 10243, 10313, 10319};
    }

    public tM9319B53(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public static void D8871(long j, long j2) {
        long j3;
        int i = d + 3;
        c = i % 128;
        if (i % 2 != 0) {
            j3 = j ^ (j2 >>> 7);
            af.class.getField("a").get(null);
        } else {
            j3 = j ^ (j2 << 32);
            af.class.getField("a").get(null);
        }
        c = (d + 53) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            b("\u0000\u0001\u0000\u0000\u0001\u0001\u0001", true, new int[]{0, 7, 8, 0}, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            b("\u0001\u0000\u0001", true, new int[]{7, 3, 0, 2}, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            b("\u0000\u0001\u0001", false, new int[]{10, 3, 0, 0}, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static String a(short s) {
        int i = s + 99;
        byte[] bArr = new byte[1];
        if (g == null) {
            i = 3;
        }
        bArr[0] = (byte) i;
        return new String(bArr, 0);
    }

    public static void b(String str, boolean z, int[] iArr, Object[] objArr) {
        long j;
        byte[] bytes = str.getBytes("ISO-8859-1");
        cr crVar = new cr();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        Class cls = Integer.TYPE;
        char[] cArr = b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            j = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                    Object f2 = rV4669.f(1048659596);
                    if (f2 == null) {
                        f2 = rV4669.g(MotionEvent.axisFromString("") + 5943, (char) (13919 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51, -1222272024, a((short) 0), new Class[]{cls});
                    }
                    cArr2[i5] = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
                    i5++;
                    e = (f + 29) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            cArr = cArr2;
        } else {
            j = 0;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            crVar.component9 = 0;
            char c2 = 0;
            while (true) {
                int i6 = crVar.component9;
                if (i6 >= i2) {
                    break;
                }
                if (bytes[i6] == 1) {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(c2)};
                    Object f3 = rV4669.f(787141208);
                    if (f3 == null) {
                        f3 = rV4669.g(4634 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (char) (39355 - (ViewConfiguration.getEdgeSlop() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50, -1488056516, a((short) 1), new Class[]{cls, cls});
                    }
                    cArr4[i6] = ((Character) ((Method) f3).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(c2)};
                    Object f4 = rV4669.f(1357192195);
                    if (f4 == null) {
                        f4 = rV4669.g((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6510, (char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 52, -650002073, a((short) 2), new Class[]{cls, cls});
                    }
                    cArr4[i6] = ((Character) ((Method) f4).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[crVar.component9];
                Object[] objArr5 = {crVar, crVar};
                Object f5 = rV4669.f(-440389350);
                if (f5 == null) {
                    f5 = rV4669.g((ViewConfiguration.getPressedStateDuration() >> 16) + 959, (char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 60 - Color.argb(0, 0, 0, 0), 1818553470, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) f5).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            f = (e + 37) % 128;
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i7 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i7, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i7);
            f = (e + 45) % 128;
        }
        if (z) {
            f = (e + 53) % 128;
            char[] cArr6 = new char[i2];
            crVar.component9 = 0;
            while (true) {
                int i8 = crVar.component9;
                if (i8 >= i2) {
                    break;
                }
                int i9 = (e + 51) % 128;
                f = i9;
                cArr6[i8] = cArr3[(i2 - i8) - 1];
                crVar.component9 = i8 + 1;
                e = (i9 + 107) % 128;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            f = (e + 19) % 128;
            crVar.component9 = 0;
            while (true) {
                int i10 = crVar.component9;
                if (i10 >= i2) {
                    break;
                }
                cArr3[i10] = (char) (cArr3[i10] - iArr[2]);
                crVar.component9 = i10 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void c() {
        g = new byte[]{7, -78, 44, 117};
    }
}
