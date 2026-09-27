package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wX26196 extends eT28692 {
    public static final char[] f;
    public static final long g;
    public static final byte[] h = null;
    public static final int i = 0;

    static {
        d();
        f = new char[]{49281, 24110, 65003, 7338, 47730, 55584, 30913, 9690, 47972, 6314, 804, 40345, 15952};
        g = -6261536157894132909L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(byte b, byte b2, short s) {
        int i2;
        int i3;
        int i4 = (b2 * 3) + 4;
        int i5 = s * 4;
        int i6 = 118 - b;
        byte[] bArr = new byte[i5 + 1];
        byte[] bArr2 = h;
        if (bArr2 == null) {
            byte[] bArr3 = bArr2;
            int i7 = 0;
            int i8 = i4;
            i4 += i6;
            i2 = i8 + 1;
            bArr2 = bArr3;
            i3 = i7;
            bArr[i3] = (byte) i4;
            i7 = i3 + 1;
            if (i3 == i5) {
                return new String(bArr, 0);
            }
            byte b3 = bArr2[i2];
            byte[] bArr4 = bArr2;
            i8 = i2;
            i6 = b3;
            bArr3 = bArr4;
            i4 += i6;
            i2 = i8 + 1;
            bArr2 = bArr3;
            i3 = i7;
            bArr[i3] = (byte) i4;
            i7 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i4 = i6;
            i2 = i4;
            i3 = 0;
            bArr[i3] = (byte) i4;
            i7 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(char c, int i2, int i3, Object[] objArr) {
        Throwable cause;
        int i4;
        long j;
        int i5;
        cm cmVar = new cm();
        long[] jArr = new long[i2];
        cmVar.component5 = 0;
        while (true) {
            int i6 = cmVar.component5;
            if (i6 >= i2) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f[i3 + i6])};
                Object f2 = rV4669.f(1480709268);
                Class cls = Integer.TYPE;
                if (f2 == null) {
                    i5 = 2020003388;
                    int i7 = 51 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    j = 0;
                    byte b = (byte) (i >>> 2);
                    byte b2 = (byte) (b - 3);
                    i4 = 2;
                    f2 = rV4669.g(6046 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i7, -773518864, b(b, b2, b2), new Class[]{cls});
                } else {
                    i4 = 2;
                    j = 0;
                    i5 = 2020003388;
                }
                Long l = (Long) ((Method) f2).invoke(null, objArr2);
                l.getClass();
                long j2 = i6;
                long j3 = g;
                Object[] objArr3 = new Object[4];
                objArr3[3] = Integer.valueOf(c);
                objArr3[i4] = Long.valueOf(j3);
                objArr3[1] = Long.valueOf(j2);
                objArr3[0] = l;
                Object f3 = rV4669.f(-1745711337);
                if (f3 == null) {
                    int i8 = 3110 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                    char c2 = (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 11541);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52;
                    String b3 = b((byte) 1, (byte) 0, (short) 0);
                    Class cls2 = Long.TYPE;
                    f3 = rV4669.g(i8, c2, doubleTapTimeout, 508973683, b3, new Class[]{cls2, cls2, cls2, cls});
                }
                jArr[i6] = ((Long) ((Method) f3).invoke(null, objArr3)).longValue();
                Object[] objArr4 = new Object[i4];
                objArr4[1] = cmVar;
                objArr4[0] = cmVar;
                Object f4 = rV4669.f(i5);
                if (f4 == null) {
                    f4 = rV4669.g(4736 - (Process.myTid() >> 22), (char) (10123 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getScrollBarSize() >> 8) + 52, -238939304, b((byte) 0, (byte) 0, (short) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) f4).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause == null) {
                }
            }
            cause = th.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th;
        }
        char[] cArr = new char[i2];
        cmVar.component5 = 0;
        while (true) {
            int i9 = cmVar.component5;
            if (i9 < i2) {
                cArr[i9] = (char) jArr[i9];
                Object[] objArr5 = {cmVar, cmVar};
                Object f5 = rV4669.f(2020003388);
                if (f5 == null) {
                    f5 = rV4669.g(4736 - TextUtils.getOffsetBefore("", 0), (char) ((Process.myPid() >> 22) + 10124), MotionEvent.axisFromString("") + 53, -238939304, b((byte) 0, (byte) 0, (short) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) f5).invoke(null, objArr5);
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    public static void component5(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        af.class.getField("a").get(null);
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (View.resolveSizeAndState(0, 0, 0) + 58652), TextUtils.lastIndexOf("", '0', 0) + 8, View.getDefaultSize(0, 0), objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, 7 - Color.alpha(0), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) (AndroidCharacter.getMirror('0') + 9871), 3 - (Process.myPid() >> 22), View.MeasureSpec.getSize(0) + 10, objArr5);
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

    public static void d() {
        h = new byte[]{19, -119, 81, MessagePack.Code.BIN8};
        i = 14;
    }
}
