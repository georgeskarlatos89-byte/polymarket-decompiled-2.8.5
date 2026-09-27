package com.fingerprintjs.android.fpjs_pro_internal;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.dmk;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class component9 {
    public static final char[] a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static final byte[] f = null;

    static {
        d();
        d = 0;
        e = 1;
        b = 0;
        c = 1;
        a = new char[]{10248, 10337, 10337, 10326, 10315, 10333, 10320, 10279, 10253, 10248, 10243, 10313, 10319};
    }

    public static final <V, E> V D8871(D8871<? extends V, ? extends E> d8871, V v) {
        if (d8871 instanceof vD14832N6715) {
            return ((vD14832N6715) d8871).component5;
        }
        if (d8871 instanceof setPivotYN16904) {
            int i = (b + 27) % 128;
            c = i;
            b = (i + 55) % 128;
            return v;
        }
        dmk.a();
        return null;
    }

    public static String a(int i) {
        int i2 = 101 - i;
        byte[] bArr = new byte[1];
        if (f == null) {
            i2 = 97 - i;
        }
        bArr[0] = (byte) i2;
        return new String(bArr, 0);
    }

    public static final Object b(D8871 d8871) {
        int i = c;
        b = (i + 13) % 128;
        if (d8871 instanceof vD14832N6715) {
            return ((vD14832N6715) d8871).component5;
        }
        if (d8871 instanceof setPivotYN16904) {
            b = (i + 117) % 128;
            return null;
        }
        dmk.a();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r0[r11] == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        r13 = new java.lang.Object[]{java.lang.Integer.valueOf(r4[r11]), java.lang.Integer.valueOf(r6)};
        r6 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(1357192195);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0125, code lost:
    
        if (r6 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
    
        r6 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(6512 - (android.os.SystemClock.elapsedRealtimeNanos() > r16 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == r16 ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 52 - android.text.TextUtils.getTrimmedLength(""), -650002073, a(0), new java.lang.Class[]{r9, r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015d, code lost:
    
        r3[r11] = ((java.lang.Character) ((java.lang.reflect.Method) r6).invoke(null, r13)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015f, code lost:
    
        r6 = r3[r1.component9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0164, code lost:
    
        r11 = new java.lang.Object[]{r1, r1};
        r12 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-440389350);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0173, code lost:
    
        if (r12 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0175, code lost:
    
        r12 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g((android.os.SystemClock.elapsedRealtime() > r16 ? 1 : (android.os.SystemClock.elapsedRealtime() == r16 ? 0 : -1)) + 958, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 60 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1818553470, "b", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a1, code lost:
    
        ((java.lang.reflect.Method) r12).invoke(null, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        r15 = new java.lang.Object[r25];
        r15[r13] = java.lang.Integer.valueOf(r6);
        r15[0] = java.lang.Integer.valueOf(r12);
        r6 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(787141208);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        r6 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(4634 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > r16 ? 1 : (android.os.SystemClock.elapsedRealtime() == r16 ? 0 : -1)) + 39354), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 51, -1488056516, a(1), new java.lang.Class[]{r9, r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
    
        r3[r11] = ((java.lang.Character) ((java.lang.reflect.Method) r6).invoke(null, r15)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        if (r0[r11] == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(String str, boolean z, int[] iArr, Object[] objArr) {
        long j;
        char c2;
        int i;
        byte[] bytes = str.getBytes("ISO-8859-1");
        cr crVar = new cr();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = 2;
        int i5 = iArr[2];
        int i6 = iArr[3];
        Class cls = Integer.TYPE;
        char[] cArr = a;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            j = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object f2 = rV4669.f(1048659596);
                    if (f2 == null) {
                        i = i4;
                        f2 = rV4669.g((ViewConfiguration.getDoubleTapTimeout() >> 16) + 5942, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13918), 52 - ExpandableListView.getPackedPositionType(0L), -1222272024, a(i), new Class[]{cls});
                    } else {
                        i = i4;
                    }
                    cArr2[i7] = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = i;
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
        int i8 = i4;
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            char[] cArr4 = new char[i3];
            crVar.component9 = 0;
            char c3 = 0;
            while (true) {
                int i9 = crVar.component9;
                if (i9 >= i3) {
                    break;
                }
                int i10 = d + 111;
                e = i10 % 128;
                if (i10 % 2 == 0) {
                    c2 = 1;
                } else {
                    c2 = 1;
                }
                i8 = 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i11 = d + 65;
            e = i11 % 128;
            if (i11 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i12 = i3 % i6;
                System.arraycopy(cArr5, 0, cArr3, i12, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i12);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i13 = i3 - i6;
                System.arraycopy(cArr6, 0, cArr3, i13, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            crVar.component9 = 0;
            while (true) {
                int i14 = crVar.component9;
                if (i14 >= i3) {
                    break;
                }
                cArr7[i14] = cArr3[(i3 - i14) - 1];
                crVar.component9 = i14 + 1;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            crVar.component9 = 0;
            d = (e + 49) % 128;
            while (true) {
                int i15 = crVar.component9;
                if (i15 >= i3) {
                    break;
                }
                cArr3[i15] = (char) (cArr3[i15] - iArr[2]);
                crVar.component9 = i15 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static final <V, E> E component5(D8871<? extends V, ? extends E> d8871) {
        int i = (c + 105) % 128;
        b = i;
        if (d8871 instanceof vD14832N6715) {
            int i2 = (i + 91) % 128;
            c = i2;
            b = (i2 + 19) % 128;
            return null;
        }
        if (d8871 instanceof setPivotYN16904) {
            return ((setPivotYN16904) d8871).D8871;
        }
        dmk.a();
        return null;
    }

    public static void d() {
        f = new byte[]{67, 66, 20, -106};
    }

    public static void setPivotYN16904(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        af.class.getField("a").get(null);
        c = (b + 67) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c("\u0000\u0001\u0000\u0000\u0001\u0001\u0001", true, new int[]{0, 7, 0, 0}, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c("\u0001\u0001\u0000", true, new int[]{7, 3, 0, 0}, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c("\u0000\u0001\u0001", false, new int[]{10, 3, 0, 0}, objArr5);
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
}
