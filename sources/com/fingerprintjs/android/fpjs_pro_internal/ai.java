package com.fingerprintjs.android.fpjs_pro_internal;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ai {
    public static final char[] a;
    public static final int b;
    public static final boolean c;
    public static final boolean d;
    public static int e;
    public static int f;
    public static final byte[] g = null;

    static {
        c();
        e = 0;
        f = 1;
        a = new char[]{39137, 39164, 39159, 39136, 39152, 38922, 39153, 38957, 38958, 38946, 39147, 39151};
        b = -1996122021;
        c = true;
        d = true;
    }

    public static String a(byte b2, byte b3) {
        int i = b2 + 107;
        int i2 = (b3 * 3) + 4;
        byte[] bArr = new byte[1];
        if (g == null) {
            i = (-i) + i2;
        }
        bArr[0] = (byte) i;
        return new String(bArr, 0);
    }

    public static void b(int i, String str, Object[] objArr) {
        f = (e + 23) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        cn cnVar = new cn();
        Class cls = Integer.TYPE;
        char[] cArr = a;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                f = (e + 17) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i2])};
                    Object f2 = rV4669.f(-1231974710);
                    if (f2 == null) {
                        f2 = rV4669.g(4455 - View.combineMeasuredStates(0, 0), (char) (55064 - View.resolveSize(0, 0)), TextUtils.indexOf("", "") + 52, 1060459438, a((byte) 0, (byte) 0), new Class[]{cls});
                    }
                    cArr2[i2] = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object f3 = rV4669.f(910422024);
        if (f3 == null) {
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6408;
            char modifierMetaStateMask = (char) (41547 - ((byte) KeyEvent.getModifierMetaStateMask()));
            int i3 = 51 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte length2 = (byte) g.length;
            f3 = rV4669.g(keyRepeatDelay, modifierMetaStateMask, i3, -1075368596, a(length2, (byte) (length2 - 4)), new Class[]{cls});
        }
        int intValue = ((Integer) ((Method) f3).invoke(null, objArr3)).intValue();
        if (d) {
            int length3 = bytes.length;
            cnVar.D8871 = length3;
            char[] cArr3 = new char[length3];
            cnVar.setPivotYN16904 = 0;
            while (true) {
                int i4 = cnVar.setPivotYN16904;
                int i5 = cnVar.D8871;
                if (i4 < i5) {
                    int i6 = e + 63;
                    f = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr3[i4] = (char) (cArr[bytes[0 - i4] - i] - intValue);
                        Object[] objArr4 = {cnVar, cnVar};
                        Object f4 = rV4669.f(1050500938);
                        if (f4 == null) {
                            f4 = rV4669.g(6511 - TextUtils.getCapsMode("", 0, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 52 - (ViewConfiguration.getTouchSlop() >> 8), -1220967890, a((byte) 1, (byte) 0), new Class[]{Object.class, Object.class});
                        }
                        ((Method) f4).invoke(null, objArr4);
                    } else {
                        cArr3[i4] = (char) (cArr[bytes[(i5 - 1) - i4] + i] - intValue);
                        Object[] objArr5 = {cnVar, cnVar};
                        Object f5 = rV4669.f(1050500938);
                        if (f5 == null) {
                            f5 = rV4669.g(6511 - (ViewConfiguration.getTapTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 'd' - AndroidCharacter.getMirror('0'), -1220967890, a((byte) 1, (byte) 0), new Class[]{Object.class, Object.class});
                        }
                        ((Method) f5).invoke(null, objArr5);
                    }
                } else {
                    objArr[0] = new String(cArr3);
                    return;
                }
            }
        } else {
            if (c) {
                e = (f + 33) % 128;
                throw null;
            }
            throw null;
        }
    }

    public static void c() {
        g = new byte[]{98, 21, 20, -67};
    }

    public static void component5(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        af.class.getField("a").get(null);
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            b(127 - View.resolveSizeAndState(0, 0, 0), "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            b(127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u008a\u0089\u0088", objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            b(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u008c\u0084\u008b", objArr5);
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
