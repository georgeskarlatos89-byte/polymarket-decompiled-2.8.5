package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iF17194E13054 {
    public static final int[] c;
    public static final char[] d;
    public static final char e;
    public static int f;
    public static int g;
    public static int h;
    public static final byte[] i = null;
    public final SensorManager a;
    public final unregisterForContextMenu b;

    static {
        d();
        g = 0;
        h = 1;
        f = 1;
        c = new int[]{2036785925, -1834911704, -411864802, 1590105698, 2116466093, 389223785, -711970952, 723368488, -1399146345, 86906412, 1275078457, 2139772630, 271030790, 1734635998, 1871382695, 526769078, 1613511336, 1102850669};
        d = new char[]{14315, 14280, 14316, 14324, 14248, 14262, 14330, 14298, 13315, 14328, 14325, 14302, 14331, 14294, 13313, 14317, 14300, 14305, 14313, 14297, 13314, 13312, 14260, 14332, 14312, 14319, 13318, 14321, 14283, 14320, 14326, 14323, 14329, 14293, 14272, 14334, 14245, 14295, 14285, 14314, 14289, 14253, 14322, 14318, 14299, 14264, 14335, 14327, 14333};
        e = (char) 517;
    }

    public iF17194E13054(SensorManager sensorManager, unregisterForContextMenu unregisterforcontextmenu) {
        this.a = sensorManager;
        this.b = unregisterforcontextmenu;
    }

    public static String a(int i2) {
        int i3 = 122 - i2;
        byte[] bArr = new byte[1];
        if (i == null) {
            i3 = -2;
        }
        bArr[0] = (byte) i3;
        return new String(bArr, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.ct] */
    public static void b(int[] iArr, int i2, Object[] objArr) {
        float f2;
        long j;
        int i3;
        int i4;
        char c2;
        int[] iArr2;
        int i5;
        int i6;
        int length;
        ?? obj = new Object();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        Class cls = Integer.TYPE;
        int[] iArr3 = c;
        if (iArr3 != null) {
            j = 0;
            int i7 = h + 109;
            g = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            f2 = 0.0f;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object f3 = rV4669.f(1359518163);
                    if (f3 == null) {
                        f3 = rV4669.g((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5408, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 69, -659798857, a(6), new Class[]{cls});
                    }
                    iArr2[i8] = ((Integer) ((Method) f3).invoke(null, objArr2)).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            i3 = 1359518163;
            i4 = 6;
            c2 = 1;
            h = (g + 25) % 128;
        } else {
            f2 = 0.0f;
            j = 0;
            i3 = 1359518163;
            i4 = 6;
            c2 = 1;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        char c3 = '0';
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            i5 = 2;
            int i9 = 0;
            while (i9 < length3) {
                h = (g + 87) % 128;
                Object[] objArr3 = {Integer.valueOf(iArr3[i9])};
                Object f4 = rV4669.f(i3);
                if (f4 == null) {
                    f4 = rV4669.g(TextUtils.lastIndexOf("", c3, 0) + 5409, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 69, -659798857, a(i4), new Class[]{cls});
                }
                iArr5[i9] = ((Integer) ((Method) f4).invoke(null, objArr3)).intValue();
                i9++;
                c3 = '0';
            }
            iArr3 = iArr5;
        } else {
            i5 = 2;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        obj.component5 = 0;
        while (true) {
            int i10 = obj.component5;
            if (i10 < iArr.length) {
                g = (h + 125) % 128;
                int i11 = iArr[i10];
                char c4 = (char) (i11 >> 16);
                cArr[0] = c4;
                char c5 = (char) i11;
                cArr[c2] = c5;
                int i12 = iArr[i10 + 1];
                char c6 = (char) (i12 >> 16);
                cArr[i5] = c6;
                char c7 = (char) i12;
                cArr[3] = c7;
                obj.vD14832N6715 = (c4 << 16) + c5;
                obj.D8871 = (c6 << 16) + c7;
                ct.b(iArr4);
                int i13 = 0;
                while (true) {
                    i6 = obj.vD14832N6715;
                    if (i13 >= 16) {
                        break;
                    }
                    int i14 = i6 ^ iArr4[i13];
                    obj.vD14832N6715 = i14;
                    int a = ct.a(i14);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = obj;
                    objArr4[i5] = obj;
                    objArr4[c2] = Integer.valueOf(a);
                    objArr4[0] = obj;
                    Object f5 = rV4669.f(1641428335);
                    if (f5 == null) {
                        f5 = rV4669.g((TypedValue.complexToFloat(0) > f2 ? 1 : (TypedValue.complexToFloat(0) == f2 ? 0 : -1)) + 4788, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 24796), (ViewConfiguration.getJumpTapTimeout() >> 16) + 51, -395122677, a(8), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int intValue = ((Integer) ((Method) f5).invoke(null, objArr4)).intValue();
                    obj.vD14832N6715 = obj.D8871;
                    obj.D8871 = intValue;
                    i13++;
                }
                int i15 = obj.D8871;
                obj.vD14832N6715 = i15;
                obj.D8871 = i6;
                int i16 = i6 ^ iArr4[16];
                obj.D8871 = i16;
                int i17 = i15 ^ iArr4[17];
                obj.vD14832N6715 = i17;
                cArr[0] = (char) (i17 >>> 16);
                cArr[c2] = (char) i17;
                cArr[i5] = (char) (i16 >>> 16);
                cArr[3] = (char) i16;
                ct.b(iArr4);
                int i18 = obj.component5 * 2;
                cArr2[i18] = cArr[0];
                cArr2[i18 + 1] = cArr[c2];
                cArr2[i18 + 2] = cArr[i5];
                cArr2[i18 + 3] = cArr[3];
                int i19 = i5;
                Object[] objArr5 = new Object[i19];
                objArr5[c2] = obj;
                objArr5[0] = obj;
                Object f6 = rV4669.f(-1527983471);
                if (f6 == null) {
                    f6 = rV4669.g(567 - TextUtils.lastIndexOf("", '0'), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)), Color.rgb(0, 0, 0) + 16777274, 759697397, "p", new Class[]{Object.class, Object.class});
                }
                ((Method) f6).invoke(null, objArr5);
                g = (h + 121) % 128;
                i5 = i19;
            } else {
                objArr[0] = new String(cArr2, 0, i2);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.fingerprintjs.android.fpjs_pro_internal.cl, java.lang.Object] */
    public static void c(byte b, String str, int i2, Object[] objArr) {
        char c2;
        int i3;
        int i4;
        char c3;
        char c4;
        char c5;
        char c6;
        int i5;
        int i6 = h + 47;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            char[] charArray = str.toCharArray();
            ?? obj = new Object();
            Class cls = Integer.TYPE;
            char[] cArr = d;
            if (cArr != null) {
                int length = cArr.length;
                c2 = 2;
                char[] cArr2 = new char[length];
                i3 = 56;
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object f2 = rV4669.f(1376324211);
                        if (f2 == null) {
                            f2 = rV4669.g((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5149, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 51 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -609364201, a(56), new Class[]{cls});
                        }
                        cArr2[i7] = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
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
                c2 = 2;
                i3 = 56;
            }
            Object[] objArr3 = {Integer.valueOf(e)};
            Object f3 = rV4669.f(1376324211);
            if (f3 == null) {
                f3 = rV4669.g(5151 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 53, -609364201, a(i3), new Class[]{cls});
            }
            char charValue = ((Character) ((Method) f3).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i2];
            if (i2 % 2 != 0) {
                i4 = i2 - 1;
                cArr3[i4] = (char) (charArray[i4] - b);
            } else {
                i4 = i2;
            }
            if (i4 > 1) {
                obj.setPivotYN16904 = 0;
                while (true) {
                    int i8 = obj.setPivotYN16904;
                    if (i8 >= i4) {
                        break;
                    }
                    int i9 = h + 105;
                    g = i9 % 128;
                    if (i9 % 2 != 0) {
                        c3 = charArray[i8];
                        obj.D8871 = c3;
                        obj.component5 = c3;
                        c4 = c3;
                    } else {
                        c3 = charArray[i8];
                        obj.D8871 = c3;
                        c4 = charArray[i8 + 1];
                        obj.component5 = c4;
                        if (c3 != c4) {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = obj;
                            objArr4[11] = Integer.valueOf(charValue);
                            objArr4[10] = obj;
                            objArr4[9] = obj;
                            objArr4[8] = Integer.valueOf(charValue);
                            objArr4[7] = obj;
                            objArr4[6] = obj;
                            objArr4[5] = Integer.valueOf(charValue);
                            objArr4[4] = obj;
                            objArr4[3] = obj;
                            objArr4[c2] = Integer.valueOf(charValue);
                            objArr4[1] = obj;
                            objArr4[0] = obj;
                            Object f4 = rV4669.f(1587243064);
                            if (f4 == null) {
                                c5 = '\n';
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 6408;
                                c6 = '\t';
                                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 41548);
                                int i10 = 52 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                String a = a(0);
                                Class cls2 = Integer.TYPE;
                                f4 = rV4669.g(offsetAfter, fadingEdgeLength, i10, -683690660, a, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                            } else {
                                c5 = '\n';
                                c6 = '\t';
                            }
                            int intValue = ((Integer) ((Method) f4).invoke(null, objArr4)).intValue();
                            int i11 = obj.sG29839;
                            if (intValue == i11) {
                                g = (h + 63) % 128;
                                Object[] objArr5 = new Object[11];
                                objArr5[c5] = obj;
                                objArr5[c6] = Integer.valueOf(charValue);
                                objArr5[8] = obj;
                                objArr5[7] = Integer.valueOf(charValue);
                                objArr5[6] = Integer.valueOf(charValue);
                                objArr5[5] = obj;
                                objArr5[4] = obj;
                                objArr5[3] = Integer.valueOf(charValue);
                                objArr5[c2] = Integer.valueOf(charValue);
                                objArr5[1] = obj;
                                objArr5[0] = obj;
                                Object f5 = rV4669.f(674328096);
                                if (f5 == null) {
                                    int i12 = 3873 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    char keyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 27766);
                                    int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51;
                                    String a2 = a((byte) (-i[c2]));
                                    Class cls3 = Integer.TYPE;
                                    f5 = rV4669.g(i12, keyCodeFromString, i13, -1584024764, a2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                                }
                                int intValue2 = ((Integer) ((Method) f5).invoke(null, objArr5)).intValue();
                                int i14 = (obj.component9 * charValue) + obj.sG29839;
                                int i15 = obj.setPivotYN16904;
                                cArr3[i15] = cArr[intValue2];
                                cArr3[i15 + 1] = cArr[i14];
                                i8 = i15;
                            } else {
                                int i16 = obj.vD14832N6715;
                                int i17 = obj.component9;
                                int i18 = obj.component13;
                                if (i16 == i17) {
                                    int i19 = ((i18 + charValue) - 1) % charValue;
                                    obj.component13 = i19;
                                    int i20 = ((i11 + charValue) - 1) % charValue;
                                    obj.sG29839 = i20;
                                    int i21 = (i17 * charValue) + i20;
                                    i5 = obj.setPivotYN16904;
                                    cArr3[i5] = cArr[(i16 * charValue) + i19];
                                    cArr3[i5 + 1] = cArr[i21];
                                } else {
                                    int i22 = (i16 * charValue) + i11;
                                    i5 = obj.setPivotYN16904;
                                    cArr3[i5] = cArr[i22];
                                    cArr3[i5 + 1] = cArr[(i17 * charValue) + i18];
                                }
                                i8 = i5;
                            }
                            obj.setPivotYN16904 = i8 + 2;
                        }
                    }
                    cArr3[i8] = (char) (c3 - b);
                    cArr3[i8 + 1] = (char) (c4 - b);
                    obj.setPivotYN16904 = i8 + 2;
                }
            }
            for (int i23 = 0; i23 < i2; i23++) {
                cArr3[i23] = (char) (cArr3[i23] ^ 13722);
            }
            objArr[0] = new String(cArr3);
            return;
        }
        throw null;
    }

    public static void d() {
        i = new byte[]{53, 37, MessagePack.Code.UINT16, MessagePack.Code.EXT8};
    }

    public static Object[] vD14832N6715(Context context, int i2, int i3) {
        char c2;
        if (context == null) {
            Object[] objArr = {r3, null, r4, new int[1]};
            int[] iArr = {i2};
            int[] iArr2 = {i2};
            int i4 = (((~(i2 | 976698596)) | (~((-1050989737) | i2)) | 75546632) * 407) + (((~(1050989736 | i2)) | (~((~i2) | (-976698597))) | 75546632) * 407) + (((1255492 | r3) * (-814)) - 695094824);
            int component5 = unregisterForContextMenu.component5();
            int i5 = -(-(i4 * (-1343)));
            int i6 = (i5 << 1) - i5;
            int i7 = ~component5;
            int i8 = -(-(((i7 & i4) | (i4 ^ i7)) * 672));
            int i9 = (i6 ^ i8) + ((i8 & i6) << 1);
            int i10 = ~component5;
            int i11 = ~(((-1) ^ i10) | i10);
            int i12 = ~((component5 & i4) | (i4 ^ component5));
            int i13 = (((i12 & i11) | (i11 ^ i12)) * (-672)) + i9;
            int i14 = ~i4;
            int i15 = ~((i10 & i14) | (i14 ^ i10));
            int i16 = ~(~i4);
            int i17 = ((i16 & i15) | (i15 ^ i16)) * 672;
            int i18 = (i13 & i17) + (i17 | i13);
            int component52 = unregisterForContextMenu.component5();
            int i19 = ((i18 * (-167)) - (~(i3 * (-167)))) - 1;
            int i20 = ~i18;
            int i21 = ~i3;
            int i22 = ~((i20 & i21) | (i20 ^ i21));
            int i23 = ~((i21 & component52) | (i21 ^ component52));
            int i24 = (i19 - (~(((i22 & i23) | (i22 ^ i23)) * 336))) - 1;
            int i25 = ~((i18 ^ i3) | (i18 & i3));
            int i26 = ~((i18 ^ component52) | (i18 & component52));
            int i27 = -(-(((i25 & i26) | (i25 ^ i26)) * (-168)));
            int i28 = ~i3;
            int i29 = ~component52;
            int i30 = (((~((i29 & i18) | (i29 ^ i18))) | i28) * 168) + (((i24 | i27) << 1) - (i24 ^ i27));
            int i31 = i30 << 13;
            int i32 = ((~i30) & i31) | ((~i31) & i30);
            int i33 = i32 >>> 17;
            int i34 = (i32 | i33) & (~(i32 & i33));
            int i35 = i34 << 5;
            ((int[]) objArr[3])[0] = ((~i34) & i35) | ((~i35) & i34);
            return objArr;
        }
        try {
            int[] iArr3 = {77139810, 1197481583, -1561697974, 1371663654, 1707003339, -732063840, -375162913, 1199241246, -2026844867, -466337932, -1881469603, 1287794779, -1493438614, 1560167971, -755637354, -1671759165, -1514181524, -439783549, 5717222, 500937663};
            int i36 = -TextUtils.lastIndexOf("", '0');
            int i37 = i36 * 398;
            int i38 = (i37 & (-14652)) + (i37 | (-14652));
            int i39 = ~i36;
            c2 = 3;
            int i40 = ~i2;
            int i41 = ~((i39 ^ i40) | (i39 & i40));
            int i42 = ~i36;
            int i43 = ~((i42 ^ 37) | (i42 & 37));
            int i44 = (i41 ^ i43) | (i41 & i43);
            int i45 = ~i2;
            int i46 = ~((i45 ^ 37) | (i45 & 37));
            int i47 = (i38 - (~(((i44 ^ i46) | (i44 & i46)) * (-397)))) - 1;
            int i48 = (~((i39 ^ 37) | (i39 & 37))) * (-397);
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            int i50 = (~((i42 ^ 37) | (i42 & 37))) | i2;
            int i51 = ~(((-38) & i36) | ((-38) ^ i36));
            int i52 = -(-(((i50 & i51) | (i50 ^ i51)) * 397));
            int i53 = (i49 & i52) + (i52 | i49);
            try {
                Object[] objArr2 = new Object[1];
                b(iArr3, i53, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
                Object[] objArr4 = new Object[1];
                b(new int[]{-488164480, 1959050134, -724479434, 1325898246, -205443652, -125314023, 1568111040, 143537997, 1215692369, -1241131475, -724479434, 1325898246, -378292228, -711061796, -793746644, 1830365925}, 31 - TextUtils.indexOf("", "", 0, 0), objArr4);
                try {
                    Object[] objArr5 = {(String) objArr4[0]};
                    int i54 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i55 = ((i54 | 38) << 1) - (i54 ^ 38);
                    Object[] objArr6 = new Object[1];
                    b(new int[]{77139810, 1197481583, -1561697974, 1371663654, 1707003339, -732063840, -375162913, 1199241246, -2026844867, -466337932, -1881469603, 1287794779, -1493438614, 1560167971, -755637354, -1671759165, -1514181524, -439783549, 5717222, 500937663}, i55, objArr6);
                    objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                    int i56 = -MotionEvent.axisFromString("");
                    int i57 = i56 * 495;
                    int i58 = (i57 & (-14790)) + (i57 | (-14790));
                    int i59 = ((i56 ^ (-31)) | (i56 & (-31))) * (-988);
                    int i60 = (i58 & i59) + (i59 | i58);
                    int i61 = ~i56;
                    int i62 = (i61 ^ 30) | (i61 & 30);
                    int i63 = -(-(((i62 ^ i40) | (i62 & i40)) * 494));
                    int i64 = (i60 ^ i63) + ((i63 & i60) << 1);
                    int i65 = (~((i61 & (-31)) | (i61 ^ (-31)))) | (~((i40 ^ 30) | (i40 & 30)));
                    int i66 = ~(i56 | 30);
                    int i67 = ((i66 & i65) | (i65 ^ i66)) * 494;
                    Object[] objArr7 = new Object[1];
                    c((byte) (5 - Process.getGidForName("")), "+%#\u001f\u0017$(\u000f%\u001e(.\u0015\u0018\u0017+\b)\u0010!\u0019%0\u001a\u0018,\u0014,\u0001\u0014㘃", ((i64 | i67) << 1) - (i64 ^ i67), objArr7);
                    try {
                        Object[] objArr8 = {(String) objArr7[0]};
                        int i68 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i69 = (i68 & 38) + (i68 | 38);
                        Object[] objArr9 = new Object[1];
                        b(new int[]{77139810, 1197481583, -1561697974, 1371663654, 1707003339, -732063840, -375162913, 1199241246, -2026844867, -466337932, -1881469603, 1287794779, -1493438614, 1560167971, -755637354, -1671759165, -1514181524, -439783549, 5717222, 500937663}, i69, objArr9);
                        objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            int i70 = -(ViewConfiguration.getTapTimeout() >> 16);
                            int component53 = unregisterForContextMenu.component5();
                            int i71 = ~i70;
                            int i72 = (((i70 * 592) - 13570) - (~(-(-((~(i71 | 23)) * (-1182)))))) - 1;
                            int i73 = ~i70;
                            int i74 = (i73 ^ (-24)) | (i73 & (-24));
                            int i75 = ~component53;
                            int i76 = ((~((i74 ^ i75) | (i75 & i74))) | (~((i70 ^ 23) | (i70 & 23)))) * (-591);
                            int i77 = (i72 ^ i76) + ((i76 & i72) << 1);
                            int i78 = component53 | i71;
                            int i79 = (i77 - (~(((i78 & (-24)) | (i78 ^ (-24))) * 591))) - 1;
                            Object[] objArr10 = new Object[1];
                            b(new int[]{-1102886061, -1999104222, 847391963, -1496696563, -460563341, 1000480063, 1303254464, -971044830, 233402781, 1629874274, -1907527596, 1739177524}, i79, objArr10);
                            Class<?> cls = Class.forName((String) objArr10[0]);
                            int i80 = -(-ExpandableListView.getPackedPositionType(0L));
                            int i81 = (i80 ^ 17) + ((i80 & 17) << 1);
                            int i82 = -Color.alpha(0);
                            Object[] objArr11 = new Object[1];
                            c((byte) ((i82 ^ 41) + ((i82 & 41) << 1)), "/*\u0003\u0002!\u000b !/*\"!\u001f!/*㘑", i81, objArr11);
                            Object invoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                            try {
                                int threadPriority = Process.getThreadPriority(0);
                                int component54 = unregisterForContextMenu.component5();
                                int i83 = -(-(threadPriority * (-712)));
                                int i84 = (14280 & i83) + (14280 | i83);
                                int i85 = ~component54;
                                int i86 = ~(((-21) ^ i85) | ((-21) & i85));
                                int i87 = ~(((-21) ^ threadPriority) | ((-21) & threadPriority));
                                int i88 = (i87 & i86) | (i86 ^ i87);
                                int i89 = ~threadPriority;
                                int i90 = (i89 ^ 20) | (i89 & 20);
                                int i91 = ~((i90 & component54) | (i90 ^ component54));
                                int i92 = (i84 - (~(-(-(((i88 & i91) | (i88 ^ i91)) * (-713)))))) - 1;
                                int i93 = (i89 ^ 20) | (i89 & 20);
                                int i94 = -(-((~((i93 & component54) | (i93 ^ component54))) * 1426));
                                int i95 = (i92 ^ i94) + ((i92 & i94) << 1);
                                int i96 = -(-((~((~component54) | i89)) * 713));
                                int i97 = ((i95 & i96) + (i96 | i95)) >> 6;
                                int i98 = (-24) | i40;
                                int i99 = (((((i97 * (-129)) + 3013) - (~((~((i98 & i97) | (i98 ^ i97))) * 130))) - 1) - (~(-(-((~(((-24) ^ i97) | ((-24) & i97))) * (-260)))))) - 1;
                                int i100 = ~i97;
                                int i101 = ((-24) & i97) | ((-24) ^ i97);
                                int i102 = (((~((i101 & i2) | (i101 ^ i2))) | (~((i100 & 23) | (i100 ^ 23)))) * 130) + i99;
                                Object[] objArr12 = new Object[1];
                                b(new int[]{-1102886061, -1999104222, 847391963, -1496696563, -460563341, 1000480063, 1303254464, -971044830, 233402781, 1629874274, -1907527596, 1739177524}, i102, objArr12);
                                Class<?> cls2 = Class.forName((String) objArr12[0]);
                                int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int i103 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                Object[] objArr13 = new Object[1];
                                c((byte) (((i103 | 25) << 1) - (i103 ^ 25)), "/*\u0003\u0002!\u000b !/*\u000b\"\r-", maximumDrawingCacheSize, objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                    int i104 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int i105 = (i104 * (-963)) + 30881;
                                    int i106 = ~i104;
                                    int i107 = ~(((-34) ^ i2) | ((-34) & i2));
                                    int i108 = -(-(((i106 ^ i107) | (i106 & i107)) * (-964)));
                                    int i109 = ((i105 | i108) << 1) - (i105 ^ i108);
                                    int i110 = ~(((-34) ^ i45) | ((-34) & i45));
                                    int i111 = ~((i104 & (-34)) | ((-34) ^ i104));
                                    int i112 = ((i111 & i110) | (i110 ^ i111)) * (-964);
                                    int i113 = (i109 & i112) + (i112 | i109);
                                    int i114 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    int i115 = i114 * 284;
                                    int i116 = (i115 & (-10434)) + (i115 | (-10434));
                                    int i117 = ~i114;
                                    int i118 = ~((i117 ^ 37) | (i117 & 37));
                                    int i119 = ~(i117 | i2);
                                    int i120 = ((i118 ^ i119) | (i119 & i118)) * (-283);
                                    int i121 = ((i116 | i120) << 1) - (i120 ^ i116);
                                    int i122 = (~(((-38) ^ i114) | ((-38) & i114))) * 283;
                                    int i123 = (i121 & i122) + (i122 | i121);
                                    int i124 = ~i114;
                                    int i125 = (i124 & (-38)) | (i124 ^ (-38));
                                    int i126 = -(-((~((i125 & i2) | (i125 ^ i2))) * 283));
                                    Object[] objArr15 = new Object[1];
                                    c((byte) ((i123 ^ i126) + ((i123 & i126) << 1)), "!\u001f\u0019%0\u001a\u001a\u0002\u0013\u0005%\t,\"\u0003\u0006\u001f\u0011\u0006\u0002!\u000b !/*\"!\u001f!/*㘍", i113, objArr15);
                                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                                    int i127 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                    int i128 = i127 * (-391);
                                    int i129 = (i128 & (-24375)) + (i128 | (-24375));
                                    int i130 = ~((-126) | i127);
                                    int i131 = (i2 ^ 125) | (i2 & 125);
                                    int i132 = ~i131;
                                    int i133 = (((((i130 ^ i132) | (i132 & i130)) * (-196)) + i129) - (~(-(-(((i127 ^ 125) | (i127 & 125)) * 392))))) - 1;
                                    int i134 = ~i127;
                                    int i135 = ~((i134 & (-126)) | (i134 ^ (-126)));
                                    int i136 = ~i131;
                                    int i137 = ((i136 & i135) | (i135 ^ i136)) * 196;
                                    Object[] objArr16 = new Object[1];
                                    c((byte) (((i133 | i137) << 1) - (i133 ^ i137)), "/*\u0003\u0002!\u000b !/*%!(*", maxKeyCode, objArr16);
                                    Object invoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(invoke, objArr14);
                                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int component55 = unregisterForContextMenu.component5();
                                    int i138 = ~component55;
                                    int i139 = ~(((-31) & i138) | ((-31) ^ i138));
                                    int i140 = (jumpTapTimeout ^ 30) | (jumpTapTimeout & 30);
                                    int i141 = ~((i140 & component55) | (i140 ^ component55));
                                    int i142 = ((-31) ^ jumpTapTimeout) | ((-31) & jumpTapTimeout);
                                    int i143 = ((~((i142 & component55) | (i142 ^ component55))) * (-1662)) + (((i139 & i141) | (i139 ^ i141)) * (-831)) + (jumpTapTimeout * (-830)) + 24960;
                                    int i144 = ~jumpTapTimeout;
                                    int i145 = ~component55;
                                    int i146 = (~((jumpTapTimeout & component55) | (jumpTapTimeout ^ component55))) | (~((i144 & i145) | (i144 ^ i145)));
                                    int i147 = ~((component55 & 30) | (component55 ^ 30));
                                    Object[] objArr17 = new Object[1];
                                    c((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62), "!\u001f\u0019%0\u001a\u001a\u0002\u0013\u0005%\t,\"\u0003\u0006\u001f\u0011\u0006\u0002!\u000b !/*%!(*", (i143 - (~(-(-(((i146 & i147) | (i146 ^ i147)) * 831))))) - 1, objArr17);
                                    Class<?> cls4 = Class.forName((String) objArr17[0]);
                                    int i148 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                    int i149 = (i148 ^ 10) + ((i148 & 10) << 1);
                                    Object[] objArr18 = new Object[1];
                                    b(new int[]{1625226862, 1998305794, -1772112348, 426356005, -120825669, -1321884631}, i149, objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(invoke2);
                                    int length = objArr19.length;
                                    int i150 = 0;
                                    while (i150 < length) {
                                        Object obj = objArr19[i150];
                                        int i151 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int i152 = i151 * 980;
                                        int i153 = (i152 ^ (-3912)) + ((i152 & (-3912)) << 1);
                                        int i154 = -(-((~(((-5) & i40) | ((-5) ^ i40))) * 979));
                                        int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                                        int i156 = ((i151 ^ i2) | (i151 & i2)) * (-979);
                                        int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
                                        int i158 = ~((-5) | i2);
                                        int i159 = ~(i151 | i45);
                                        int i160 = (i157 - (~(((i159 & i158) | (i158 ^ i159)) * 979))) - 1;
                                        Object[] objArr20 = new Object[1];
                                        b(new int[]{-1789281364, 1170793478, -258373478, -483106817}, i160, objArr20);
                                        try {
                                            Object[] objArr21 = {(String) objArr20[0]};
                                            int indexOf = TextUtils.indexOf((CharSequence) "", '0');
                                            int component56 = unregisterForContextMenu.component5();
                                            int i161 = (indexOf * 398) - 15048;
                                            int i162 = ~indexOf;
                                            int i163 = ~component56;
                                            int i164 = ~((i162 ^ i163) | (i162 & i163));
                                            int i165 = ~indexOf;
                                            int i166 = ~((i165 ^ 38) | (i165 & 38));
                                            int i167 = i164 | i166;
                                            Object[] objArr22 = objArr19;
                                            int i168 = ~component56;
                                            int i169 = ~((i168 ^ 38) | (i168 & 38));
                                            int i170 = -(-(((i167 ^ i169) | (i169 & i167)) * (-397)));
                                            int i171 = (i161 ^ i170) + ((i170 & i161) << 1);
                                            int i172 = -(-(i166 * (-397)));
                                            int i173 = (i171 & i172) + (i172 | i171);
                                            int i174 = (component56 ^ i166) | (component56 & i166);
                                            int i175 = ~((indexOf & (-39)) | ((-39) ^ indexOf));
                                            int i176 = -(-(((i174 & i175) | (i174 ^ i175)) * 397));
                                            int i177 = (i173 ^ i176) + ((i176 & i173) << 1);
                                            int i178 = -(-View.MeasureSpec.getMode(0));
                                            Object[] objArr23 = new Object[1];
                                            c((byte) (((i178 | 62) << 1) - (i178 ^ 62)), ".\u001c.\u001d\u0006\u0001/\r\u0012$\u0017\u0006\u0013\u0003\r/%\u0004\u0002/.)\u0006\u0017)\u0015\u000b!\u0006,\u0012'\t\u0005.(㘡", i177, objArr23);
                                            Class<?> cls5 = Class.forName((String) objArr23[0]);
                                            int i179 = -(-(Process.myTid() >> 22));
                                            int i180 = (i179 & 11) + (i179 | 11);
                                            int i181 = -TextUtils.indexOf("", "", 0);
                                            Object[] objArr24 = new Object[1];
                                            c((byte) ((i181 & 18) + (i181 | 18)), "/*\u0005%\u001c\u0002\u0004\u001e!\t㘑", i180, objArr24);
                                            Object invoke3 = cls5.getMethod((String) objArr24[0], String.class).invoke(null, objArr21);
                                            try {
                                                int threadPriority2 = Process.getThreadPriority(0);
                                                int i182 = (threadPriority2 * 569) + 11380;
                                                int i183 = ~threadPriority2;
                                                int i184 = ~(((-21) ^ i183) | ((-21) & i183));
                                                int i185 = ~(((-21) ^ i45) | ((-21) & i45));
                                                int i186 = (i184 ^ i185) | (i184 & i185);
                                                int i187 = ~((i183 & i45) | (i183 ^ i45));
                                                int i188 = ((i187 & i186) | (i186 ^ i187)) * (-1136);
                                                int i189 = (i182 ^ i188) + ((i182 & i188) << 1);
                                                int i190 = ~(((-21) ^ i2) | ((-21) & i2));
                                                int i191 = ~threadPriority2;
                                                int i192 = ~(i191 | i2);
                                                int i193 = (i190 ^ i192) | (i190 & i192);
                                                int i194 = i40 | 20;
                                                int i195 = length;
                                                int i196 = ~((i194 ^ threadPriority2) | (i194 & threadPriority2));
                                                int i197 = -(-(((i193 ^ i196) | (i196 & i193)) * (-568)));
                                                int i198 = (i189 ^ i197) + ((i197 & i189) << 1);
                                                int i199 = ~i194;
                                                int i200 = ~((threadPriority2 & i40) | (i40 ^ threadPriority2));
                                                int i201 = (i199 & i200) | (i199 ^ i200);
                                                int i202 = ~((-21) | i191 | i2);
                                                int i203 = 28 - (((((i201 & i202) | (i201 ^ i202)) * 568) + i198) >> 6);
                                                Object[] objArr25 = new Object[1];
                                                b(new int[]{-1102886061, -1999104222, 847391963, -1496696563, -460563341, 1000480063, 1303254464, -971044830, 606192483, 990834240, 1172498183, -1986186934, 580571434, -253480852}, i203, objArr25);
                                                Class<?> cls6 = Class.forName((String) objArr25[0]);
                                                int i204 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11;
                                                int rgb = Color.rgb(0, 0, 0);
                                                int component57 = unregisterForContextMenu.component5();
                                                int i205 = rgb * (-589);
                                                int i206 = (i205 ^ 1325415430) + ((i205 & 1325415430) << 1);
                                                int i207 = ~component57;
                                                int i208 = ~(((-16777243) ^ i207) | ((-16777243) & i207));
                                                Object[] objArr26 = objArr3;
                                                int i209 = ((-16777243) ^ rgb) | ((-16777243) & rgb);
                                                int i210 = i40;
                                                int i211 = ~i209;
                                                int i212 = (i208 ^ i211) | (i211 & i208);
                                                int i213 = ~((i207 & rgb) | (i207 ^ rgb));
                                                int i214 = (i212 & i213) | (i212 ^ i213);
                                                int i215 = ~rgb;
                                                int i216 = (i215 ^ 16777242) | (i215 & 16777242);
                                                int i217 = ~((i216 ^ component57) | (i216 & component57));
                                                int i218 = -(-(((i214 ^ i217) | (i214 & i217)) * 590));
                                                int i219 = (i206 ^ i218) + ((i206 & i218) << 1);
                                                int i220 = ~component57;
                                                int i221 = ~(((-16777243) ^ i220) | ((-16777243) & i220));
                                                int i222 = ~i209;
                                                int i223 = (i221 ^ i222) | (i222 & i221);
                                                int i224 = ~((rgb & i220) | (i220 ^ rgb));
                                                int i225 = (i219 - (~(-(-(((i223 & i224) | (i223 ^ i224)) * (-1180)))))) - 1;
                                                int i226 = ~((i215 ^ i220) | (i215 & i220));
                                                int i227 = ~((i220 & 16777242) | (i220 ^ 16777242));
                                                int i228 = -(-(((i226 & i227) | (i226 ^ i227)) * 590));
                                                Object[] objArr27 = new Object[1];
                                                c((byte) ((i225 & i228) + (i228 | i225)), "\u0005,\n\u000e\u0006,\u0012(.'㗽", i204, objArr27);
                                                try {
                                                    Object[] objArr28 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr27[0], null).invoke(obj, null))};
                                                    int i229 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int component58 = unregisterForContextMenu.component5();
                                                    int i230 = ~i229;
                                                    int i231 = ~component58;
                                                    int i232 = ~((i231 & i230) | (i230 ^ i231));
                                                    int i233 = ~(i230 | 36);
                                                    int i234 = (i233 & i232) | (i232 ^ i233);
                                                    int i235 = ~component58;
                                                    int i236 = ~((i235 & 36) | (i235 ^ 36));
                                                    int i237 = (((i234 & i236) | (i234 ^ i236)) * (-397)) + ((i229 * 398) - 14256);
                                                    int i238 = ~i229;
                                                    int i239 = ~((i238 & 36) | (i238 ^ 36));
                                                    int i240 = i239 * (-397);
                                                    int i241 = (i237 ^ i240) + ((i237 & i240) << 1);
                                                    int i242 = (component58 & i239) | (component58 ^ i239);
                                                    int i243 = ~(i229 | (-37));
                                                    int i244 = ((i243 & i242) | (i242 ^ i243)) * 397;
                                                    Object[] objArr29 = new Object[1];
                                                    c((byte) (60 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))), ".\u001c.\u001d\u0006\u0001/\r\u0012$\u0017\u0006\u0013\u0003\r/%\u0004\u0002/.)\u0006\u0017)\u0015\u000b!\u0006,\u0012'\t\u0005.(㘡", (i241 ^ i244) + ((i244 & i241) << 1), objArr29);
                                                    Class<?> cls7 = Class.forName((String) objArr29[0]);
                                                    int i245 = -(-TextUtils.indexOf("", "", 0, 0));
                                                    int i246 = (i245 & 19) + (i245 | 19);
                                                    int size = View.MeasureSpec.getSize(0);
                                                    int i247 = ~size;
                                                    int i248 = ~(i247 | 118);
                                                    int i249 = ~size;
                                                    int i250 = ~((i249 ^ i2) | (i249 & i2));
                                                    int i251 = (((i248 ^ i250) | (i248 & i250)) * (-280)) + ((size * 141) - 16402);
                                                    int i252 = ~((i249 ^ i2) | (i249 & i2));
                                                    int i253 = ~((-119) | i2);
                                                    int i254 = (((i252 ^ i253) | (i252 & i253)) * 140) + i251;
                                                    int i255 = i249 | (-119);
                                                    int i256 = ~((i255 & i2) | (i255 ^ i2));
                                                    int i257 = (i247 & i45) | (i247 ^ i45);
                                                    int i258 = ~((i257 & 118) | (i257 ^ 118));
                                                    int i259 = (i258 & i256) | (i256 ^ i258);
                                                    int i260 = ((-119) & i45) | ((-119) ^ i45);
                                                    int i261 = ~((size & i260) | (i260 ^ size));
                                                    int i262 = -(-(((i261 & i259) | (i259 ^ i261)) * 140));
                                                    byte b = (byte) ((i254 ^ i262) + ((i262 & i254) << 1));
                                                    Object[] objArr30 = new Object[1];
                                                    c(b, "/*\",.'\u0006,-*%\u0004\u0015)\u001a\r\u001e\u0004㙵", i246, objArr30);
                                                    Object invoke4 = cls7.getMethod((String) objArr30[0], InputStream.class).invoke(invoke3, objArr28);
                                                    for (int i263 = 0; i263 < 2; i263 = (((i263 | (-30)) << 1) - (i263 ^ (-30))) + 31) {
                                                        Object obj2 = objArr26[i263];
                                                        try {
                                                            int i264 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i265 = (i264 & 35) + (i264 | 35);
                                                            Object[] objArr31 = new Object[1];
                                                            b(new int[]{77139810, 1197481583, 1756137028, 394765009, 1771287558, 2135253216, 1164282092, -596956927, 808023883, 2052945811, -944756445, -1159828648, 969948871, -549901829, -692898622, -782673975, -301750943, -1179229862}, i265, objArr31);
                                                            Class<?> cls8 = Class.forName((String) objArr31[0]);
                                                            int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                            int i266 = keyRepeatDelay * 85;
                                                            int i267 = ((i266 | 1955) << 1) - (i266 ^ 1955);
                                                            int i268 = ~keyRepeatDelay;
                                                            int i269 = ~((i268 & (-24)) | (i268 ^ (-24)));
                                                            int i270 = ~keyRepeatDelay;
                                                            int i271 = ~((i270 & i210) | (i270 ^ i210));
                                                            int i272 = (i269 & i271) | (i269 ^ i271) | (~(((-24) ^ i210) | ((-24) & i210)));
                                                            int i273 = (keyRepeatDelay ^ 23) | (keyRepeatDelay & 23);
                                                            int i274 = ~(i273 | i2);
                                                            int i275 = (((i272 & i274) | (i272 ^ i274)) * (-84)) + i267;
                                                            int i276 = keyRepeatDelay | (~(((-24) ^ i2) | ((-24) & i2)));
                                                            int i277 = ~(i210 | 23);
                                                            int i278 = ((i276 & i277) | (i276 ^ i277)) * (-84);
                                                            int i279 = (i275 ^ i278) + ((i278 & i275) << 1);
                                                            int i280 = -(-(((~((i210 ^ 23) | (i210 & 23))) | (~i273)) * 84));
                                                            int i281 = (i279 & i280) + (i280 | i279);
                                                            Object[] objArr32 = new Object[1];
                                                            c((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 116), "/*\u0000\u001e\u0014\u0001+*\t\u0005)0㘟㘟\u0004$\u0017\"\r\u001a\u0019\u001f㙫", i281, objArr32);
                                                            if (obj2.equals(cls8.getMethod((String) objArr32[0], null).invoke(invoke4, null))) {
                                                                Object[] objArr33 = {r1, null, r4, r5};
                                                                int[] iArr4 = {i2};
                                                                int[] iArr5 = {i2 ^ 1};
                                                                int i282 = -(-com.fingerprintjs.android.fpjs_pro.g.b((~(1929296733 | i45)) | 14422541, 420, ((~(i2 | 1929296733)) * 420) - 1179002256, -16));
                                                                int i283 = (i3 & i282) + (i282 | i3);
                                                                int i284 = i283 << 13;
                                                                int i285 = (i284 & (~i283)) | ((~i284) & i283);
                                                                int i286 = i285 >>> 17;
                                                                int i287 = (i285 | i286) & (~(i285 & i286));
                                                                int i288 = i287 << 5;
                                                                int[] iArr6 = {((~i287) & i288) | ((~i288) & i287)};
                                                                return objArr33;
                                                            }
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    i150++;
                                                    objArr19 = objArr22;
                                                    length = i195;
                                                    i40 = i210;
                                                    objArr3 = objArr26;
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause5 = th5.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                Throwable cause6 = th6.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            Throwable cause7 = th7.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        Throwable cause8 = th8.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th8;
                    }
                } catch (Throwable th9) {
                    Throwable cause9 = th9.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th9;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            c2 = 3;
        }
        Object[] objArr34 = new Object[4];
        int[] iArr7 = new int[1];
        objArr34[0] = iArr7;
        int[] iArr8 = new int[1];
        objArr34[2] = iArr8;
        objArr34[c2] = new int[1];
        iArr8[0] = i2;
        iArr7[0] = i2;
        objArr34[1] = null;
        int i289 = ((~((-151790594) | i2)) * 283) + ((((~((-218967170) | i2)) | 67176576) * (-283)) - 436177140);
        int component59 = unregisterForContextMenu.component5();
        int i290 = i289 * (-1975);
        int i291 = i3 * 989;
        int i292 = ((i290 | i291) << 1) - (i290 ^ i291);
        int i293 = ~i289;
        int i294 = (i293 & i3) | (i293 ^ i3);
        int i295 = (i292 - (~(-(-(((~i294) | component59) * 988))))) - 1;
        int i296 = ~i3;
        int i297 = ~((i296 & i289) | (i296 ^ i289));
        int i298 = ~component59;
        int i299 = ~(i289 | i298);
        int i300 = (((i299 & i297) | (i297 ^ i299)) * (-1976)) + i295;
        int i301 = ~i294;
        int i302 = ~i3;
        int i303 = ~((component59 & i302) | (i302 ^ component59));
        int i304 = (i303 & i301) | (i301 ^ i303);
        int i305 = ~((i3 & i298) | (i298 ^ i3));
        int i306 = ((i304 & i305) | (i304 ^ i305)) * 988;
        int i307 = (i300 ^ i306) + ((i306 & i300) << 1);
        int i308 = i307 << 13;
        int i309 = (i308 & (~i307)) | ((~i308) & i307);
        int i310 = i309 >>> 17;
        int i311 = (i309 | i310) & (~(i309 & i310));
        int i312 = i311 << 5;
        ((int[]) objArr34[c2])[0] = (i311 | i312) & (~(i311 & i312));
        return objArr34;
    }
}
