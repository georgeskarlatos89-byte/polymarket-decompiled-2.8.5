package com.fingerprintjs.android.fpjs_pro;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro_internal.af;
import com.fingerprintjs.android.fpjs_pro_internal.ah;
import com.fingerprintjs.android.fpjs_pro_internal.cs;
import com.fingerprintjs.android.fpjs_pro_internal.rV4669;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/TooManyRequest;", "Lcom/fingerprintjs/android/fpjs_pro/Error;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooManyRequest extends Error {
    public static final long c;
    public static int d;
    public static int e;

    static {
        c();
        d = 0;
        e = 1;
        c = 7110693954367596298L;
    }

    public static String a(int i) {
        return new String(new byte[]{(byte) (106 - (i * 3))}, 0);
    }

    public static void b(String str, int i, Object[] objArr) {
        int i2 = e + 121;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            char[] charArray = str.toCharArray();
            cs csVar = new cs();
            long j = c;
            char[] pivotYN16904 = cs.setPivotYN16904(6563903756462461937L ^ j, charArray, i);
            csVar.setPivotYN16904 = 4;
            while (true) {
                int i3 = csVar.setPivotYN16904;
                if (i3 < pivotYN16904.length) {
                    int i4 = i3 - 4;
                    csVar.component5 = i4;
                    try {
                        Object[] objArr2 = {Long.valueOf(pivotYN16904[i3] ^ pivotYN16904[i3 % 4]), Long.valueOf(i4), Long.valueOf(j)};
                        Object f = rV4669.f(2121983094);
                        if (f == null) {
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 6098;
                            char c2 = (char) (18861 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int jumpTapTimeout = 52 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            String a = a(0);
                            Class cls = Long.TYPE;
                            f = rV4669.g(touchSlop, c2, jumpTapTimeout, -136431342, a, new Class[]{cls, cls, cls});
                        }
                        pivotYN16904[i3] = ((Character) ((Method) f).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {csVar, csVar};
                        Object f2 = rV4669.f(-1616588279);
                        if (f2 == null) {
                            f2 = rV4669.g(View.MeasureSpec.getMode(0) + 3265, (char) TextUtils.getOffsetAfter("", 0), 52 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 369102701, a(1), new Class[]{Object.class, Object.class});
                        }
                        ((Method) f2).invoke(null, objArr3);
                        e = (d + 51) % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    objArr[0] = new String(pivotYN16904, 4, pivotYN16904.length - 4);
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public static void vD14832N6715(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        af.class.getField("a").get(null);
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            b("\ueb03ɺ\ueb75\ue3c8盞㛠詒\ue85a㢊\u0ad2\ude4c", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            b("ヨ\udbd4ベꊿ䀙\uef1b쭽", -MotionEvent.axisFromString(""), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            b("\udbd3Ꝁ\udba3錳\ue5ce鏎缾", View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr5);
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

    public static void c() {
    }
}
