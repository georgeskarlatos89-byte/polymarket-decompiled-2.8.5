package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro_internal.getXH31455;
import defpackage.k84;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class W29288 {
    public static final char b;
    public static final char c;
    public static final char d;
    public static final char e;
    public static int f;
    public static int g;
    public static final byte[] h = null;
    public static int i;
    public static int j;
    public static final byte[] k = null;
    public final ActivityManager a;

    static {
        e();
        i = 0;
        j = 1;
        d();
        f = 0;
        g = 1;
        b = (char) 26803;
        c = (char) 54576;
        d = (char) 33221;
        e = (char) 59552;
    }

    public W29288(ActivityManager activityManager) {
        this.a = activityManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0431, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 33) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0658  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] D8871(Context context, int i2, int i3, int i4) {
        Object[] objArr;
        Object[] objArr2;
        int i5;
        char c2;
        char c3;
        int i6;
        char c4;
        boolean z;
        Object[] objArr3;
        int i7 = f;
        int i8 = ((i7 ^ 25) + ((i7 & 25) << 1)) % 128;
        g = i8;
        if (context == null) {
            g = (i7 + 107) % 128;
            Object[] objArr4 = {r3, null, r4, new int[1]};
            int[] iArr = {i2};
            int[] iArr2 = {i2};
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            int i9 = ~freeMemory;
            int i10 = (((~(freeMemory | (-1525369696))) | (~(i9 | 502318637))) * 979) + ((freeMemory | 502318637) * (-979)) + ((~((-1525369696) | i9)) * 979) + 1188082518;
            int component5 = getXH31455.a.component5();
            int i11 = (-1) - (~(i10 * (-215)));
            int i12 = ~component5;
            int i13 = (i11 - (~(i12 * 216))) - 1;
            int i14 = ((~i10) | i12) * (-216);
            int i15 = ~i12;
            int i16 = (((i13 ^ i14) + ((i14 & i13) << 1)) - (~(((i10 & i15) | (i10 ^ i15)) * 216))) - 1;
            int i17 = ((i4 | i16) << 1) - (i4 ^ i16);
            int i18 = i17 << 13;
            int i19 = (i17 | i18) & (~(i17 & i18));
            int i20 = i19 >>> 17;
            int i21 = ((~i19) & i20) | ((~i20) & i19);
            int i22 = i21 << 5;
            ((int[]) objArr4[3])[0] = ((~i21) & i22) | ((~i22) & i21);
            return objArr4;
        }
        f = (i8 + 115) % 128;
        try {
            Object[] objArr5 = new Object[1];
            b("Ὀ갱嘈琿谱ྈ犓톅襟棚\udac4婛\ue697﹅澽㓣\ue18e㭜\udac4婛瀑⫏氵㘺", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
            int i23 = (resolveSizeAndState ^ 18) + ((resolveSizeAndState & 18) << 1);
            Object[] objArr6 = new Object[1];
            b("\ue33d榔ꎛ몡奻ꔞ鍊듬薙\uef04䨲繭㉗\uf5dd굮秶销觇", i23, objArr6);
            Object invoke = cls.getMethod((String) objArr6[0], null).invoke(context, null);
            Object[] objArr7 = new Object[1];
            b("Ὀ갱嘈琿谱ྈ犓톅襟棚\udac4婛\ue697﹅澽㓣襢琧歮ߟ奻ꔞ鍊듬薙\uef04䨲繭㉗\uf5dd굮秶销觇", 32 - (~(-TextUtils.indexOf((CharSequence) "", '0'))), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            int i24 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i25 = i24 * (-661);
            int i26 = (i25 & (-3305)) + (i25 | (-3305));
            int i27 = ~i2;
            int i28 = ~i24;
            int i29 = ~(i28 | (-6));
            int i30 = -(-(((i29 & i27) | (i27 ^ i29)) * 1324));
            int i31 = ((i26 | i30) << 1) - (i26 ^ i30);
            int i32 = ~((i24 ^ i2) | (i24 & i2));
            int i33 = ~((i2 ^ 5) | (i2 & 5));
            int i34 = ((i32 ^ i33) | (i32 & i33)) * (-1324);
            int i35 = ((i31 | i34) << 1) - (i34 ^ i31);
            int i36 = ~((i28 ^ 5) | (i28 & 5));
            int i37 = ~((i24 & (-6)) | ((-6) ^ i24));
            int i38 = (i35 - (~(-(-(((i36 & i37) | (i36 ^ i37)) * 662))))) - 1;
            Object[] objArr8 = new Object[1];
            b("९⟍챮齊⻛窔", i38, objArr8);
            if ((cls2.getField((String) objArr8[0]).getInt(invoke) & 2) != 0) {
                int i39 = f;
                g = ((i39 ^ 43) + ((i39 & 43) << 1)) % 128;
                objArr2 = new Object[]{r12, null, r13, new int[1]};
                int[] iArr3 = {i2};
                int[] iArr4 = {(~(i2 & 1)) & (i2 | 1)};
                int i40 = (((~(1765588093 | i27)) | (~(262100239 | i2))) * 627) + (((~((-1765588094) | i2)) | 262100239) * (-627)) + (((-109265155) | i2) * (-627)) + 2077952880;
                int component52 = getXH31455.a.component5();
                int i41 = ~i40;
                int i42 = ((~(((-17) ^ i41) | ((-17) & i41))) * 497) + ((i40 * (-496)) - 7936);
                int i43 = (-17) | i41;
                int i44 = ~((i43 ^ component52) | (i43 & component52));
                int i45 = ~component52;
                int i46 = i41 | i45;
                objArr = null;
                int i47 = ~((i46 ^ 16) | (i46 & 16));
                int i48 = (i42 - (~(((i44 ^ i47) | (i47 & i44)) * 497))) - 1;
                int i49 = ~((-17) | i45);
                int i50 = ~(((-17) & i40) | ((-17) ^ i40));
                int i51 = (i50 & i49) | (i49 ^ i50);
                int i52 = i41 | 16;
                int i53 = -(-((i51 | (~((i52 & component52) | (i52 ^ component52)))) * 497));
                int i54 = (i48 & i53) + (i53 | i48);
                int i55 = (i4 ^ i54) + ((i54 & i4) << 1);
                int i56 = i55 << 13;
                int i57 = (i55 | i56) & (~(i55 & i56));
                int i58 = i57 >>> 17;
                int i59 = ((~i57) & i58) | ((~i58) & i57);
                int i60 = i59 << 5;
                ((int[]) objArr2[3])[0] = ((~i59) & i60) | ((~i60) & i59);
            } else {
                objArr = null;
                getXH31455.a.component5();
                getXH31455.a.component5();
                objArr2 = new Object[]{r0, null, r5, new int[1]};
                int[] iArr5 = {i2};
                int[] iArr6 = {i2};
                int myPid = Process.myPid();
                int i61 = (((~((~myPid) | (-1013891750))) | 163840) * (-245)) + 2051004002;
                int i62 = ~(myPid | (-1013891750));
                int i63 = ((i62 | 1013796583) * 245) + (i62 * (-245)) + i61;
                int i64 = i63 * (-500);
                int i65 = i4 * (-500);
                int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                int i67 = ~i4;
                int i68 = ~((i67 ^ i63) | (i67 & i63));
                int i69 = ~i63;
                int i70 = (i69 ^ i4) | (i69 & i4);
                int i71 = (i68 | (~((i70 & i2) | (i70 ^ i2)))) * 501;
                int i72 = ((~((i67 & i69) | (i69 ^ i67))) * 1002) + (i66 ^ i71) + ((i71 & i66) << 1);
                int i73 = (~(i69 | i27 | i4)) * 501;
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                int i75 = i74 << 13;
                int i76 = (i75 & (~i74)) | ((~i75) & i74);
                int i77 = i76 >>> 17;
                int i78 = (i76 | i77) & (~(i76 & i77));
                int i79 = i78 << 5;
                ((int[]) objArr2[3])[0] = (i78 | i79) & (~(i78 & i79));
            }
            if (((int[]) objArr2[0])[0] != i2) {
                int i80 = g + 17;
                f = i80 % 128;
                if (i80 % 2 != 0) {
                    int i81 = 33 / 0;
                }
                return objArr2;
            }
            try {
                Object f2 = rV4669.f(-448558154);
                byte[] bArr = h;
                if (f2 == null) {
                    int lastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 5253;
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37470);
                    int resolveOpacity = Drawable.resolveOpacity(0, 0) + 52;
                    byte b2 = (byte) (bArr[6] - 1);
                    c3 = 23;
                    byte b3 = bArr[23];
                    i5 = 37470;
                    c2 = 6;
                    Object[] objArr9 = new Object[1];
                    c(b2, (byte) (-b3), (byte) (b3 + 1), objArr9);
                    f2 = rV4669.g(lastIndexOf, deadChar, resolveOpacity, 1827100370, (String) objArr9[0], new Class[0]);
                } else {
                    i5 = 37470;
                    c2 = 6;
                    c3 = 23;
                }
                Object[] objArr10 = objArr;
                Set set = (Set) ((Method) f2).invoke(objArr10, objArr10);
                Object f3 = rV4669.f(-1563369761);
                if (f3 == null) {
                    int indexOf = 5251 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    char c5 = (char) (37471 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 52;
                    c4 = '\t';
                    i6 = 37471;
                    Object[] objArr11 = new Object[1];
                    c((byte) (bArr[c2] - 1), (byte) (-bArr[c3]), bArr[9], objArr11);
                    f3 = rV4669.g(indexOf, c5, windowTouchSlop, 729023419, (String) objArr11[0], null);
                } else {
                    i6 = 37471;
                    c4 = '\t';
                }
                if (!set.contains(((Field) f3).get(null))) {
                    int i82 = f;
                    int i83 = (i82 ^ 3) + ((i82 & 3) << 1);
                    g = i83 % 128;
                    int i84 = i83 % 2;
                    Object f4 = rV4669.f(-665084816);
                    if (i84 == 0) {
                        if (f4 == null) {
                            int argb = 5252 - Color.argb(0, 0, 0, 0);
                            char c6 = (char) (i6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                            int blue = Color.blue(0) + 52;
                            Object[] objArr12 = new Object[1];
                            c(0, 0, (short) 17, objArr12);
                            f4 = rV4669.g(argb, c6, blue, 1375682836, (String) objArr12[0], null);
                        }
                        set.contains(((Field) f4).get(null));
                        int i85 = 18 / 0;
                    } else {
                        if (f4 == null) {
                            int green = Color.green(0) + 5252;
                            char scrollBarSize = (char) (i5 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int absoluteGravity = 52 - Gravity.getAbsoluteGravity(0, 0);
                            Object[] objArr13 = new Object[1];
                            c(0, 0, (short) 17, objArr13);
                            f4 = rV4669.g(green, scrollBarSize, absoluteGravity, 1375682836, (String) objArr13[0], null);
                        }
                        set.contains(((Field) f4).get(null));
                    }
                }
                if ((i3 & 32) == 0) {
                    int i86 = f + 123;
                    g = i86 % 128;
                    if (i86 % 2 == 0) {
                        try {
                            if (Build.VERSION.SDK_INT > 62) {
                                int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                int i87 = resolveOpacity2 * 367;
                                int i88 = (((i87 ^ 10276) + ((i87 & 10276) << 1)) - (~(-(-(((resolveOpacity2 ^ 28) | (resolveOpacity2 & 28)) * (-366)))))) - 1;
                                int i89 = ~(((-29) ^ i2) | ((-29) & i2));
                                int i90 = (i88 - (~(((i89 & resolveOpacity2) | (resolveOpacity2 ^ i89)) * (-366)))) - 1;
                                int i91 = ~((~resolveOpacity2) | 28);
                                int i92 = (resolveOpacity2 & (-29)) | ((-29) ^ resolveOpacity2);
                                int i93 = ~((i92 & i2) | (i92 ^ i2));
                                int i94 = (i90 - (~(-(-(((i93 & i91) | (i91 ^ i93)) * 366))))) - 1;
                                Object[] objArr14 = new Object[1];
                                b("驽ⱚ摌맾\ud9ed仹迿挣\ue6ed㤑羍侗ᗼ풌䩼镀䃢᨞ሢ랥\ue8a2콒諭㱥瑋눪钶墓", i94, objArr14);
                                try {
                                    Object[] objArr15 = {(String) objArr14[0]};
                                    Object f5 = rV4669.f(-668483483);
                                    if (f5 == null) {
                                        int i95 = 6045 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        char indexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        int myTid = (Process.myTid() >> 22) + 52;
                                        Object[] objArr16 = new Object[1];
                                        c((byte) (bArr[c2] - 1), bArr[c4], bArr[3], objArr16);
                                        f5 = rV4669.g(i95, indexOf2, myTid, 1367547137, (String) objArr16[0], new Class[]{String.class});
                                    }
                                    long longValue = ((Long) ((Method) f5).invoke(null, objArr15)).longValue();
                                    long j2 = longValue ^ (-1);
                                    long freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                    long j3 = freeMemory2 ^ (-1);
                                    long j4 = (j3 | longValue) ^ (-1);
                                    long e2 = com.fingerprintjs.android.fpjs_pro.g.e(516L, ((longValue | (-168553828)) ^ (-1)) | j4, ((((freeMemory2 | (j2 | (-168553828))) ^ (-1)) | ((((-168553828) | j3) | longValue) ^ (-1))) * 516) + ((-516) * (((j2 | freeMemory2) ^ (-1)) | ((j3 | 168553827) ^ (-1)) | j4)) + ((517 * longValue) - 86805220905L), 1770996180L);
                                    int i96 = (int) (e2 >> 32);
                                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int i97 = i96 & ((((~(elapsedRealtime | 448463321)) | (-1885689733)) * 502) + ((~((~elapsedRealtime) | (-270598529))) * (-502)) + (((~((-1885689733) | elapsedRealtime)) | 177864793) * (-502)) + 655987710);
                                    int a = ((int) e2) & k84.a((~(183297794 | i2)) | (~(1253928615 | i27)) | 179070466, -370, (((~(183297794 | i27)) | (~(1253928615 | i2))) * (-370)) - 635053777, 1831562980);
                                    if (((i97 & a) | (i97 ^ a)) == 1) {
                                        z = true;
                                        if (z) {
                                            Object[] objArr17 = {r4, null, r5, new int[1]};
                                            int[] iArr7 = {i2};
                                            int[] iArr8 = {(i2 & (-11)) | (i27 & 10)};
                                            int i98 = ~(Process.myTid() | 1734988953);
                                            int a2 = k84.a(i98 | (-2004614396), 220, (((-292699380) | i98) * (-220)) + 1765751520, -1073881716);
                                            int i99 = (a2 ^ 16) + ((a2 & 16) << 1);
                                            int i100 = ((i99 * 659) - (~(i4 * (-657)))) - 1;
                                            int i101 = ~((~i99) | i4);
                                            int i102 = ~i4;
                                            int i103 = ~((i102 ^ i99) | (i102 & i99));
                                            int i104 = (i101 & i103) | (i101 ^ i103);
                                            int i105 = ~((i2 & i99) | (i99 ^ i2));
                                            int i106 = (i103 * 658) + (((i104 & i105) | (i104 ^ i105)) * (-658)) + i100;
                                            int i107 = ~(i102 | i99);
                                            int i108 = (((i107 & i105) | (i107 ^ i105)) * 658) + i106;
                                            int i109 = i108 << 13;
                                            int i110 = ((~i108) & i109) | ((~i109) & i108);
                                            int i111 = i110 >>> 17;
                                            int i112 = (i110 | i111) & (~(i110 & i111));
                                            int i113 = i112 << 5;
                                            ((int[]) objArr17[3])[0] = (i112 | i113) & (~(i112 & i113));
                                            g = (f + 83) % 128;
                                            return objArr17;
                                        }
                                    } else {
                                        getXH31455.a.component5();
                                        z = false;
                                        if (z) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            Object[] objArr18 = {(String) objArr3[0]};
                            Object f6 = rV4669.f(-417469134);
                            if (f6 == null) {
                                int resolveSizeAndState2 = 6202 - View.resolveSizeAndState(0, 0, 0);
                                char gidForName = (char) ((-1) - Process.getGidForName(""));
                                int i114 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50;
                                byte b4 = bArr[25];
                                Object[] objArr19 = new Object[1];
                                c(b4, bArr[31], (byte) (b4 | 10), objArr19);
                                f6 = rV4669.g(resolveSizeAndState2, gidForName, i114, 1857630294, (String) objArr19[0], new Class[]{String.class});
                            }
                            Object invoke2 = ((Method) f6).invoke(null, objArr18);
                            int i115 = -Color.green(0);
                            int i116 = i115 * (-103);
                            int i117 = (i116 & (-103)) + (i116 | (-103));
                            int i118 = ~i115;
                            int i119 = ~((i118 & (-2)) | (i118 ^ (-2)));
                            int i120 = ~(((-2) ^ i2) | ((-2) & i2));
                            int i121 = -(-(((i119 & i120) | (i119 ^ i120)) * 104));
                            int i122 = (i117 & i121) + (i121 | i117);
                            int i123 = (i27 ^ i115) | (i27 & i115);
                            int i124 = ((~((i123 & 1) | (i123 ^ 1))) * (-104)) + i122;
                            int i125 = (i115 | i2) * 104;
                            int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                            Object[] objArr20 = new Object[1];
                            b("펛Ļ", i126, objArr20);
                            z = invoke2.equals((String) objArr20[0]);
                            f = (g + 119) % 128;
                            if (z) {
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                        objArr3 = new Object[1];
                        b("\u1a9d喟鄤⩰䃢᨞ሢ랥\ue8a2콒諭㱥怛ᣕ", 13 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr3);
                    }
                }
                Object[] objArr21 = {r3, null, r4, r5};
                int[] iArr9 = {i2};
                int[] iArr10 = {i2};
                int i127 = (((~(1688134693 | i2)) | 1619181568) * 302) + ((~((-270600515) | i2)) * (-604)) + ((((~(i27 | (-270600515))) | (~(1958735207 | i2))) * (-302)) - 1516864152);
                int i128 = ~i127;
                int i129 = (~((i128 ^ i2) | (i128 & i2))) | (~i27);
                int i130 = ~((i27 ^ i127) | (i27 & i127));
                int i131 = (((i129 & i130) | (i129 ^ i130)) * (-516)) + (i127 * 517);
                int i132 = ((-1) ^ i128) | i128;
                int i133 = ~((i2 & i132) | (i132 ^ i2));
                int i134 = ((-1) ^ i27) | i27;
                int i135 = -(-((i133 | (~((i134 & i127) | (i134 ^ i127)))) * 516));
                int i136 = (i131 & i135) + (i135 | i131);
                int i137 = ~(((-1) ^ i127) | i127);
                int i138 = ((i136 - (~(((i137 & i130) | (i137 ^ i130)) * 516))) - 1) + i4;
                int i139 = i138 << 13;
                int i140 = (i139 & (~i138)) | ((~i139) & i138);
                int i141 = i140 >>> 17;
                int i142 = (i140 | i141) & (~(i140 & i141));
                int i143 = i142 << 5;
                int[] iArr11 = {(i142 | i143) & (~(i142 & i143))};
                return objArr21;
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

    public static String a() {
        int i2;
        byte[] bArr = new byte[1];
        if (k == null) {
            i2 = 68;
        } else {
            i2 = 65;
        }
        bArr[0] = (byte) i2;
        return new String(bArr, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.fingerprintjs.android.fpjs_pro_internal.co, java.lang.Object] */
    public static void b(String str, int i2, Object[] objArr) {
        char[] charArray = str.toCharArray();
        ?? obj = new Object();
        char[] cArr = new char[charArray.length];
        obj.component9 = 0;
        int i3 = 2;
        char[] cArr2 = new char[2];
        i = (j + 95) % 128;
        while (true) {
            int i4 = obj.component9;
            if (i4 < charArray.length) {
                int i5 = i + 57;
                j = i5 % 128;
                int i6 = 58224;
                if (i5 % i3 == 0) {
                    cArr2[1] = charArray[i4];
                    cArr2[1] = charArray[i4];
                } else {
                    cArr2[0] = charArray[i4];
                    cArr2[1] = charArray[i4 + 1];
                }
                int i7 = 0;
                while (i7 < 16) {
                    j = (i + 111) % 128;
                    char c2 = cArr2[1];
                    char c3 = cArr2[0];
                    int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (d ^ 6670137673230944684L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(e);
                        objArr2[i3] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[0] = Integer.valueOf(c2);
                        Object f2 = rV4669.f(13315690);
                        Class cls = Integer.TYPE;
                        if (f2 == null) {
                            f2 = rV4669.g(5633 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), (Process.myTid() >> 22) + 52, -1989151986, a(), new Class[]{cls, cls, cls, cls});
                        }
                        char charValue = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
                        cArr2[1] = charValue;
                        char c4 = cArr2[0];
                        int i10 = i3;
                        char[] cArr3 = cArr2;
                        int i11 = (charValue + i6) ^ ((charValue << 4) + ((char) (b ^ 6670137673230944684L)));
                        int i12 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(c);
                        objArr3[i10] = Integer.valueOf(i12);
                        objArr3[1] = Integer.valueOf(i11);
                        objArr3[0] = Integer.valueOf(c4);
                        Object f3 = rV4669.f(13315690);
                        if (f3 == null) {
                            f3 = rV4669.g((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5632, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.combineMeasuredStates(0, 0) + 52, -1989151986, a(), new Class[]{cls, cls, cls, cls});
                        }
                        cArr3[0] = ((Character) ((Method) f3).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        i3 = i10;
                        cArr2 = cArr3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i13 = i3;
                char[] cArr4 = cArr2;
                int i14 = obj.component9;
                cArr[i14] = cArr4[0];
                cArr[i14 + 1] = cArr4[1];
                i3 = i13;
                Object[] objArr4 = new Object[i3];
                objArr4[1] = obj;
                objArr4[0] = obj;
                Object f4 = rV4669.f(1265007788);
                if (f4 == null) {
                    f4 = rV4669.g(MotionEvent.axisFromString("") + 2042, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 9856), 50 - ImageFormat.getBitsPerPixel(0), -1027431992, "C", new Class[]{Object.class, Object.class});
                }
                ((Method) f4).invoke(null, objArr4);
                cArr2 = cArr4;
            } else {
                objArr[0] = new String(cArr, 0, i2);
                return;
            }
        }
    }

    public static void c(int i2, int i3, short s, Object[] objArr) {
        int i4 = 118 - i2;
        int i5 = s + 4;
        byte[] bArr = new byte[12 - i3];
        int i6 = 11 - i3;
        int i7 = -1;
        byte[] bArr2 = h;
        if (bArr2 == null) {
            i4 = (i6 + i4) - 17;
        }
        while (true) {
            i7++;
            bArr[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr, 0);
                return;
            } else {
                i5++;
                i4 = (i4 + bArr2[i5]) - 17;
            }
        }
    }

    public static void d() {
        h = new byte[]{64, MessagePack.Code.TRUE, 50, 28, 29, 15, 20, 16, 16, 8, 26, 23, MessagePack.Code.INT32, 29, 15, 20, 16, 16, 8, 26, 23, MessagePack.Code.FIXEXT4, MessagePack.Code.MAP32, -2, 20, 21, 12, 16, 45, -7, 18, 11, 21, 29, 18, 26};
    }

    public static void e() {
        k = new byte[]{15, 53, -69, 50};
    }

    public static final /* synthetic */ ActivityManager f(W29288 w29288) {
        int i2 = f;
        int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
        g = i3 % 128;
        int i4 = i3 % 2;
        ActivityManager activityManager = w29288.a;
        if (i4 != 0) {
            return activityManager;
        }
        throw null;
    }
}
