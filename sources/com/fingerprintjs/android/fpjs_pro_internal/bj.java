package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bj {
    public static final long a;
    public static final char[] b;
    public static final char c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static final byte[] h = null;

    static {
        d();
        f = 0;
        g = 1;
        d = 0;
        e = 1;
        a = 8170959090657228676L;
        b = new char[]{14285, 14325, 14300, 14303, 14262, 14305, 14248, 14253, 14283, 14306, 14301, 14312, 14335, 14316, 14326, 14323, 14294, 14299, 14302, 14329, 14321, 14332, 14289, 14331, 14295, 14288, 14272, 14293, 14280, 14315, 14260, 14324, 14330, 14290, 14327, 14291, 14264, 14310, 14322, 14297, 14304, 14317, 14296, 14292, 14245, 14307, 14333, 14314, 14298};
        c = (char) 517;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(int i, byte b2, short s) {
        int i2;
        int i3;
        int i4 = s + 66;
        int i5 = 4 - (i * 2);
        int i6 = (b2 * 4) + 1;
        byte[] bArr = new byte[i6];
        byte[] bArr2 = h;
        if (bArr2 == null) {
            int i7 = i4;
            i3 = 0;
            i4 = i6;
            i4 += i7;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr[i2] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr, 0);
            }
            i7 = bArr2[i5];
            i4 += i7;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(String str, int i, Object[] objArr) {
        Throwable cause;
        char c2;
        long j;
        int i2;
        g = (f + 33) % 128;
        char[] charArray = str.toCharArray();
        f = (g + 113) % 128;
        char[] cArr = charArray;
        ck ckVar = new ck();
        ckVar.vD14832N6715 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        ckVar.component5 = 0;
        while (true) {
            int i3 = ckVar.component5;
            if (i3 >= cArr.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[i3]), ckVar, ckVar};
                Object f2 = rV4669.f(2123814354);
                if (f2 == null) {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 4131;
                    i2 = 1846919219;
                    char size = (char) View.MeasureSpec.getSize(0);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 59;
                    byte b2 = (byte) (h[0] - 1);
                    c2 = 1;
                    j = 0;
                    f2 = rV4669.g(packedPositionChild, size, offsetAfter, -147715914, a(b2, b2, (short) 31), new Class[]{Integer.TYPE, Object.class, Object.class});
                } else {
                    c2 = 1;
                    j = 0;
                    i2 = 1846919219;
                }
                jArr[i3] = ((Long) ((Method) f2).invoke(null, objArr2)).longValue() ^ (a ^ (-7526550383224563086L));
                Object[] objArr3 = new Object[2];
                objArr3[c2] = ckVar;
                objArr3[0] = ckVar;
                Object f3 = rV4669.f(i2);
                if (f3 == null) {
                    f3 = rV4669.g(299 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) (Process.myPid() >> 22), 62 - ExpandableListView.getPackedPositionChild(j), -407823017, "i", new Class[]{Object.class, Object.class});
                }
                ((Method) f3).invoke(null, objArr3);
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
        char[] cArr2 = new char[length];
        ckVar.component5 = 0;
        g = (f + 53) % 128;
        while (true) {
            int i4 = ckVar.component5;
            if (i4 < cArr.length) {
                int i5 = g + 15;
                f = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr2[i4] = (char) jArr[i4];
                    Object[] objArr4 = {ckVar, ckVar};
                    Object f4 = rV4669.f(1846919219);
                    if (f4 == null) {
                        f4 = rV4669.g((-16776918) - Color.rgb(0, 0, 0), (char) TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0) + 63, -407823017, "i", new Class[]{Object.class, Object.class});
                    }
                    ((Method) f4).invoke(null, objArr4);
                    int i6 = 65 / 0;
                } else {
                    cArr2[i4] = (char) jArr[i4];
                    Object[] objArr5 = {ckVar, ckVar};
                    Object f5 = rV4669.f(1846919219);
                    if (f5 == null) {
                        f5 = rV4669.g(298 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, -407823017, "i", new Class[]{Object.class, Object.class});
                    }
                    ((Method) f5).invoke(null, objArr5);
                }
            } else {
                objArr[0] = new String(cArr2);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.fingerprintjs.android.fpjs_pro_internal.cl, java.lang.Object] */
    public static void c(byte b2, String str, int i, Object[] objArr) {
        float f2;
        long j;
        int i2;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        int i3;
        int length;
        char[] cArr;
        int i4;
        int i5;
        char c8;
        int i6;
        char[] charArray = str.toCharArray();
        ?? obj = new Object();
        Class cls = Integer.TYPE;
        int i7 = 1376324211;
        byte[] bArr = h;
        char c9 = 2;
        int i8 = 0;
        char[] cArr2 = b;
        if (cArr2 != null) {
            int i9 = f + 81;
            f2 = 0.0f;
            g = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i4 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i4 = 0;
            }
            int i10 = i4;
            j = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object f3 = rV4669.f(i7);
                    if (f3 == null) {
                        i5 = i7;
                        c8 = c9;
                        byte b3 = (byte) (bArr[i8] - 1);
                        i6 = i8;
                        byte b4 = b3;
                        f3 = rV4669.g(5151 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -609364201, a(b4, b4, b3), new Class[]{cls});
                    } else {
                        i5 = i7;
                        c8 = c9;
                        i6 = i8;
                    }
                    cArr[i10] = ((Character) ((Method) f3).invoke(null, objArr2)).charValue();
                    i10++;
                    c9 = c8;
                    i7 = i5;
                    i8 = i6;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            cArr2 = cArr;
        } else {
            f2 = 0.0f;
            j = 0;
        }
        int i11 = i7;
        char c10 = c9;
        int i12 = i8;
        Object[] objArr3 = {Integer.valueOf(c)};
        Object f4 = rV4669.f(i11);
        if (f4 == null) {
            byte b5 = (byte) (bArr[i12] - 1);
            byte b6 = b5;
            f4 = rV4669.g(5151 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (char) Color.blue(i12), 52 - TextUtils.indexOf("", "", i12, i12), -609364201, a(b6, b6, b5), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) f4).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i];
        char c11 = '\t';
        if (i % 2 != 0) {
            int i13 = g + 9;
            f = i13 % 128;
            if (i13 % 2 != 0) {
                i2 = i + 114;
                cArr3[i2] = (char) (charArray[i2] % b2);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            obj.setPivotYN16904 = 0;
            while (true) {
                int i14 = obj.setPivotYN16904;
                if (i14 >= i2) {
                    break;
                }
                char c12 = charArray[i14];
                obj.D8871 = c12;
                int i15 = i14 + 1;
                char c13 = charArray[i15];
                obj.component5 = c13;
                if (c12 == c13) {
                    cArr3[i14] = (char) (c12 - b2);
                    cArr3[i15] = (char) (c13 - b2);
                    c2 = c11;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = obj;
                    objArr4[11] = Integer.valueOf(charValue);
                    objArr4[10] = obj;
                    objArr4[c11] = obj;
                    objArr4[8] = Integer.valueOf(charValue);
                    objArr4[7] = obj;
                    objArr4[6] = obj;
                    c2 = c11;
                    objArr4[5] = Integer.valueOf(charValue);
                    objArr4[4] = obj;
                    objArr4[3] = obj;
                    objArr4[c10] = Integer.valueOf(charValue);
                    objArr4[1] = obj;
                    objArr4[0] = obj;
                    Object f5 = rV4669.f(1587243064);
                    if (f5 == null) {
                        c3 = '\n';
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 6408;
                        c4 = 7;
                        char c14 = (char) (41548 - (TypedValue.complexToFloat(0) > f2 ? 1 : (TypedValue.complexToFloat(0) == f2 ? 0 : -1)));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 51;
                        c5 = '\b';
                        byte b7 = (byte) (bArr[0] - 1);
                        c6 = 6;
                        c7 = 4;
                        String a2 = a(b7, b7, (short) 56);
                        Class cls2 = Integer.TYPE;
                        f5 = rV4669.g(edgeSlop, c14, maxKeyCode, -683690660, a2, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = '\n';
                        c4 = 7;
                        c5 = '\b';
                        c6 = 6;
                        c7 = 4;
                    }
                    int intValue = ((Integer) ((Method) f5).invoke(null, objArr4)).intValue();
                    int i16 = obj.sG29839;
                    if (intValue == i16) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = obj;
                        objArr5[c2] = Integer.valueOf(charValue);
                        objArr5[c5] = obj;
                        objArr5[c4] = Integer.valueOf(charValue);
                        objArr5[c6] = Integer.valueOf(charValue);
                        objArr5[5] = obj;
                        objArr5[c7] = obj;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c10] = Integer.valueOf(charValue);
                        objArr5[1] = obj;
                        objArr5[0] = obj;
                        Object f6 = rV4669.f(674328096);
                        if (f6 == null) {
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3873;
                            char blue = (char) (27766 - Color.blue(0));
                            int tapTimeout = 52 - (ViewConfiguration.getTapTimeout() >> 16);
                            String a3 = a(0, (byte) 0, (short) 5);
                            Class cls3 = Integer.TYPE;
                            f6 = rV4669.g(scrollBarSize, blue, tapTimeout, -1584024764, a3, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) f6).invoke(null, objArr5)).intValue();
                        int i17 = (obj.component9 * charValue) + obj.sG29839;
                        int i18 = obj.setPivotYN16904;
                        cArr3[i18] = cArr2[intValue2];
                        cArr3[i18 + 1] = cArr2[i17];
                        i14 = i18;
                    } else {
                        int i19 = obj.vD14832N6715;
                        int i20 = obj.component9;
                        int i21 = obj.component13;
                        if (i19 == i20) {
                            int i22 = ((i21 + charValue) - 1) % charValue;
                            obj.component13 = i22;
                            int i23 = ((i16 + charValue) - 1) % charValue;
                            obj.sG29839 = i23;
                            int i24 = (i20 * charValue) + i23;
                            i3 = obj.setPivotYN16904;
                            cArr3[i3] = cArr2[(i19 * charValue) + i22];
                            cArr3[i3 + 1] = cArr2[i24];
                        } else {
                            int i25 = (i19 * charValue) + i16;
                            i3 = obj.setPivotYN16904;
                            cArr3[i3] = cArr2[i25];
                            cArr3[i3 + 1] = cArr2[(i20 * charValue) + i21];
                        }
                        i14 = i3;
                        obj.setPivotYN16904 = i14 + 2;
                        c11 = c2;
                    }
                }
                obj.setPivotYN16904 = i14 + 2;
                c11 = c2;
            }
        }
        int i26 = 0;
        while (i26 < i) {
            int i27 = f + 59;
            g = i27 % 128;
            if (i27 % 2 == 0) {
                cArr3[i26] = (char) (cArr3[i26] ^ 1697);
                i26 += 17;
            } else {
                cArr3[i26] = (char) (cArr3[i26] ^ 13722);
                i26++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static Object[] component9(Context context, int i, int i2) {
        char c2;
        int i3 = i;
        String str = "궜؊諸꽀ά\uf794\ua83d᳞\uf16bꔁᦽ\uf23dꛓᬡ켃ꎠᑔ죯볒ᄒ엗빥ዼ욄묨濊쁧되梮\udd5a뇖斔\ude35늿权\udbf3辛";
        Class<String> cls = String.class;
        if (context == null) {
            Object[] objArr = {r3, null, r4, new int[1]};
            int[] iArr = {i3};
            int[] iArr2 = {i3};
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = ~maxMemory;
            int i5 = (((~(maxMemory | (-1419454477))) | (~(i4 | (-536921473)))) * 210) + (((~((-1455110669) | i4)) | (~((-572577665) | maxMemory))) * 210) + 312766644;
            int i6 = ((i2 | i5) << 1) - (i5 ^ i2);
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            int i9 = i8 << 5;
            ((int[]) objArr[3])[0] = ((~i8) & i9) | ((~i9) & i8);
            return objArr;
        }
        try {
            int i10 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
            int c3 = m.c();
            c2 = 3;
            int i11 = i10 * 866;
            int i12 = (i11 ^ (-15628896)) + ((i11 & (-15628896)) << 1);
            int i13 = ~i10;
            int i14 = ~c3;
            int i15 = ~((i13 ^ i14) | (i13 & i14));
            int i16 = ((((-18090) ^ i15) | ((-18090) & i15)) * (-865)) + i12;
            int i17 = -(-((~((i10 ^ c3) | (c3 & i10))) * 865));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            int i19 = ((~(i14 | i10)) | (~((-18090) | i14))) * 865;
            int i20 = (i18 & i19) + (i18 | i19);
            try {
                Object[] objArr2 = new Object[1];
                b("궜\ueb3e⃒繬뜪첕ੳ䌌飝홲漞ꓜ\ue26e㬚烦蹰윓\u1cbb婼鍓⢺昞뽀\uf4e9㈀䬯胩\ude15ឺ것\uea4a⏨碸뙜쿭ҝ䉓鯷", i20, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
                int i21 = -TextUtils.lastIndexOf("", '0', 0);
                int i22 = i21 * (-515);
                int i23 = (i22 ^ 15510) + ((i22 & 15510) << 1);
                int i24 = ~(((-31) ^ i3) | ((-31) & i3));
                int i25 = ~i3;
                int i26 = ((i24 | (~((i25 ^ i21) | (i25 & i21))) | (~(i25 | 30))) * (-516)) + i23;
                int i27 = (~i21) | (-31);
                int i28 = ~((i27 & i3) | (i27 ^ i3));
                int i29 = ~i21;
                int i30 = ~((i29 ^ i25) | (i29 & i25) | 30);
                int i31 = (((i28 ^ i30) | (i28 & i30)) * 516) + i26;
                int i32 = ~((i29 ^ 30) | (i29 & 30));
                int i33 = ~((i25 ^ 30) | (i25 & 30));
                int i34 = ((i32 & i33) | (i32 ^ i33)) * 516;
                int i35 = (i31 & i34) + (i34 | i31);
                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                int c4 = m.c();
                int i36 = jumpTapTimeout * 624;
                int i37 = (i36 & (-75884)) + (i36 | (-75884));
                int i38 = (-123) | jumpTapTimeout;
                int i39 = (~((i38 ^ c4) | (i38 & c4))) * 623;
                int i40 = (i37 & i39) + (i37 | i39);
                int i41 = ~c4;
                int i42 = ~jumpTapTimeout;
                int i43 = ~((i42 ^ 122) | (i42 & 122));
                int i44 = (i40 - (~(-(-(((i41 ^ i43) | (i43 & i41)) * (-623)))))) - 1;
                int i45 = ~(((-123) ^ jumpTapTimeout) | ((-123) & jumpTapTimeout));
                int i46 = ~(((-123) ^ c4) | ((-123) & c4));
                int i47 = (i45 ^ i46) | (i45 & i46);
                int i48 = ~((jumpTapTimeout & c4) | (jumpTapTimeout ^ c4));
                int i49 = ((i48 & i47) | (i47 ^ i48)) * 623;
                Object[] objArr4 = new Object[1];
                c((byte) ((i44 & i49) + (i44 | i49)), "\u0012\u0011.%\u0015\u001c0!\u000e\u001b%\u0001\u0004'(\r\u001f\u0017.%\u0015\u001c0!\u000e\u001b\u001f\u0010*\u0002㙃", i35, objArr4);
                try {
                    Object[] objArr5 = {(String) objArr4[0]};
                    int i50 = -TextUtils.lastIndexOf("", '0', 0);
                    int c5 = m.c();
                    int i51 = (i50 * (-317)) + 5770072;
                    int i52 = (~i50) | (-18089);
                    int i53 = ~((i52 ^ c5) | (i52 & c5));
                    int i54 = ~c5;
                    int i55 = (i54 ^ i50) | (i54 & i50);
                    int i56 = ((~((i55 ^ 18088) | (i55 & 18088))) | i53) * (-318);
                    int i57 = (i51 ^ i56) + ((i56 & i51) << 1);
                    int i58 = ~((-18089) | i50);
                    int i59 = ~((i50 ^ c5) | (i50 & c5));
                    int i60 = -(-(((i58 & i59) | (i58 ^ i59)) * (-318)));
                    int i61 = ((i57 | i60) << 1) - (i60 ^ i57);
                    int i62 = ~i50;
                    Object[] objArr6 = new Object[1];
                    b("궜\ueb3e⃒繬뜪첕ੳ䌌飝홲漞ꓜ\ue26e㬚烦蹰윓\u1cbb婼鍓⢺昞뽀\uf4e9㈀䬯胩\ude15ឺ것\uea4a⏨碸뙜쿭ҝ䉓鯷", (((-18089) | (~((i62 & c5) | (i62 ^ c5)))) * 318) + i61, objArr6);
                    objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(cls).newInstance(objArr5);
                    int fadingEdgeLength = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i63 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr7 = new Object[1];
                    c((byte) ((i63 & 106) + (i63 | 106)), "\u0010-\u0001\u0007\u001f\u0017.%\u0015\u001c0!\u000e\u001b\u001f\u0010\u0017\u0002#\u0012\u001a*)\u001b\u0016#\u0004,\"'㙦", fadingEdgeLength, objArr7);
                    try {
                        Object[] objArr8 = {(String) objArr7[0]};
                        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                        int c6 = m.c();
                        int i64 = ~minimumFlingVelocity;
                        int i65 = ~((i64 & c6) | (i64 ^ c6));
                        int i66 = (((minimumFlingVelocity * 319) - 5734213) - (~(-(-((((-18090) & i65) | ((-18090) ^ i65)) * (-318)))))) - 1;
                        int i67 = ~(((-18090) ^ c6) | ((-18090) & c6));
                        int i68 = ~c6;
                        int i69 = (i68 ^ minimumFlingVelocity) | (i68 & minimumFlingVelocity);
                        int i70 = ~((i69 ^ 18089) | (i69 & 18089));
                        int i71 = (i66 - (~(-(-(((i70 & i67) | (i67 ^ i70)) * 318))))) - 1;
                        int i72 = ((-18090) ^ i68) | ((-18090) & i68);
                        int i73 = ~((i72 & minimumFlingVelocity) | (i72 ^ minimumFlingVelocity));
                        int i74 = (minimumFlingVelocity & 18089) | (minimumFlingVelocity ^ 18089);
                        int i75 = ((~((i74 & c6) | (i74 ^ c6))) | i73) * 318;
                        int i76 = (i71 ^ i75) + ((i75 & i71) << 1);
                        Object[] objArr9 = new Object[1];
                        b("궜\ueb3e⃒繬뜪첕ੳ䌌飝홲漞ꓜ\ue26e㬚烦蹰윓\u1cbb婼鍓⢺昞뽀\uf4e9㈀䬯胩\ude15ឺ것\uea4a⏨碸뙜쿭ҝ䉓鯷", i76, objArr9);
                        objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(cls).newInstance(objArr8);
                        try {
                            int i77 = -KeyEvent.getDeadChar(0, 0);
                            int c7 = m.c();
                            int i78 = i77 * 905;
                            int i79 = ((i78 | (-20769)) << 1) - (i78 ^ (-20769));
                            int i80 = ~i77;
                            int i81 = ~(i80 | c7);
                            int i82 = ~c7;
                            int i83 = ~((i82 ^ 23) | (i82 & 23));
                            int i84 = -(-(((i81 & i83) | (i81 ^ i83)) * (-1808)));
                            int i85 = (i79 ^ i84) + ((i79 & i84) << 1);
                            int i86 = (i80 ^ (-24)) | (i80 & (-24));
                            int i87 = ~((i86 & c7) | (i86 ^ c7));
                            int i88 = i82 | i77;
                            int i89 = ~((i88 & 23) | (i88 ^ 23));
                            int i90 = -(-(((i87 & i89) | (i87 ^ i89)) * 904));
                            int i91 = ((i85 | i90) << 1) - (i90 ^ i85);
                            int i92 = ~((i80 & 23) | (i80 ^ 23));
                            int i93 = ~(((-24) & c7) | ((-24) ^ c7));
                            int i94 = ~c7;
                            int i95 = -(-(((~((i77 & i94) | (i94 ^ i77))) | (i92 & i93) | (i92 ^ i93)) * 904));
                            int i96 = ((i91 | i95) << 1) - (i95 ^ i91);
                            int i97 = -(Process.myPid() >> 22);
                            Object[] objArr10 = new Object[1];
                            c((byte) ((i97 ^ 37) + ((i97 & 37) << 1)), "\u0014\u000f\u001a*)\u001b\u0019\u0000\u001b\u001e\u0014\u0007*\u0012\u000b\u0006\u0014\u001f\u0014\u0007/'㘓", i96, objArr10);
                            Class<?> cls2 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            c((byte) (View.getDefaultSize(0, 0) + 98), "\u000b/\u0007\"\u0010\u001a\u0010\u0014\u000b/\u001a\u0014\u000f\u0014\u000b/㙊", Color.red(0) + 17, objArr11);
                            Object invoke = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                            try {
                                int i98 = -KeyEvent.normalizeMetaState(0);
                                int c8 = m.c();
                                int i99 = ~i98;
                                int i100 = (i98 ^ 23) | (i98 & 23);
                                int i101 = (((i98 * 273) - 6233) - (~(((~(((i99 ^ (-24)) | (i99 & (-24))) | (~c8))) | (~((i100 & c8) | (i100 ^ c8)))) * (-272)))) - 1;
                                int i102 = ~i98;
                                int i103 = ~((i102 & 23) | (i102 ^ 23));
                                int i104 = ~(i99 | c8);
                                int i105 = (((i104 & i103) | (i103 ^ i104)) * (-272)) + i101;
                                int i106 = ((~((i98 & c8) | (i98 ^ c8))) | 23) * 272;
                                Object[] objArr12 = new Object[1];
                                c((byte) (36 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)))), "\u0014\u000f\u001a*)\u001b\u0019\u0000\u001b\u001e\u0014\u0007*\u0012\u000b\u0006\u0014\u001f\u0014\u0007/'㘓", (i105 & i106) + (i106 | i105), objArr12);
                                Class<?> cls3 = Class.forName((String) objArr12[0]);
                                int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                int i107 = ((resolveSizeAndState | 65327) << 1) - (resolveSizeAndState ^ 65327);
                                Object[] objArr13 = new Object[1];
                                b("궑劼叜倫儫噾嚇埞哩唴婮媒宯声", i107, objArr13);
                                try {
                                    Object[] objArr14 = {cls3.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                    int alpha = Color.alpha(0) + 33;
                                    int i108 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int c9 = m.c();
                                    int i109 = i108 * (-209);
                                    int i110 = (i109 ^ (-20064)) + ((i109 & (-20064)) << 1);
                                    int i111 = ~i108;
                                    int i112 = (~((i111 ^ (-97)) | (i111 & (-97)))) * 210;
                                    int i113 = (i110 & i112) + (i112 | i110);
                                    int i114 = ~c9;
                                    int i115 = ~(((-97) ^ i114) | (i114 & (-97)));
                                    int i116 = ~((i111 ^ c9) | (i111 & c9));
                                    int i117 = ((i115 ^ i116) | (i115 & i116)) * 210;
                                    int i118 = (i113 ^ i117) + ((i117 & i113) << 1);
                                    int i119 = ~c9;
                                    int i120 = ((-97) & i108) | ((-97) ^ i108);
                                    int i121 = -(-(((~((i120 & c9) | (i120 ^ c9))) | (~((i111 & i119) | (i111 ^ i119) | 96))) * 210));
                                    Object[] objArr15 = new Object[1];
                                    c((byte) (((i118 | i121) << 1) - (i121 ^ i118)), "\u0014\u000f\u001a*)\u001b\u0019\u0000\u001b\u001e\u0014\u0007*\u0012\u000b\u0006\b\u0004\u0000 \u0010\u001a\u0010\u0014\u000b/\u001a\u0014\u000f\u0014\u000b/㙇", alpha, objArr15);
                                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                                    int resolveOpacity = Drawable.resolveOpacity(0, 0);
                                    int c10 = m.c();
                                    int i122 = resolveOpacity * 755;
                                    int i123 = (i122 ^ (-6628659)) + ((i122 & (-6628659)) << 1);
                                    int i124 = ~resolveOpacity;
                                    int i125 = ~(i124 | 8803);
                                    int i126 = ~((i124 ^ c10) | (i124 & c10));
                                    int i127 = -(-(((~((c10 & 8803) | (c10 ^ 8803))) | (i125 ^ i126) | (i125 & i126)) * (-754)));
                                    int i128 = (i123 & i127) + (i127 | i123);
                                    int i129 = (i124 ^ 8803) | (i124 & 8803);
                                    int i130 = ~((i129 & c10) | (i129 ^ c10));
                                    int i131 = ~c10;
                                    int i132 = ~((i131 & resolveOpacity) | (i131 ^ resolveOpacity) | 8803);
                                    int i133 = -(-(((i130 & i132) | (i130 ^ i132)) * (-754)));
                                    int i134 = (i128 & i133) + (i133 | i128);
                                    int i135 = ~c10;
                                    Object[] objArr16 = new Object[1];
                                    b("궑述\ue944쪏␛ٺ描崢뺉飨視ퟙㄴኞ", (((i135 & i124) | (i124 ^ i135)) * 754) + i134, objArr16);
                                    Object invoke2 = cls4.getMethod((String) objArr16[0], cls, Integer.TYPE).invoke(invoke, objArr14);
                                    int i136 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                    int c11 = m.c();
                                    int i137 = (i136 * (-743)) - 8968753;
                                    int i138 = (i136 ^ 12071) | (i136 & 12071);
                                    int i139 = ~i138;
                                    int i140 = ~((i136 ^ c11) | (i136 & c11));
                                    int i141 = (i139 & i140) | (i139 ^ i140);
                                    int i142 = ~((c11 ^ 12071) | (c11 & 12071));
                                    int i143 = -(-(((i141 & i142) | (i141 ^ i142)) * (-744)));
                                    int i144 = (i137 ^ i143) + ((i137 & i143) << 1);
                                    int i145 = ~c11;
                                    int i146 = ~i136;
                                    int i147 = (((c11 & i138) | (i138 ^ c11)) * 744) + (((~((i146 & (-12072)) | (i146 ^ (-12072)))) | i145) * 744) + i144;
                                    Object[] objArr17 = new Object[1];
                                    b("궗芿\uf3dc\u20f1ᄅ䙜띸\ue7c9풭׆稞\uab2f顇쥣㦠溑忶谌ﵦ퉃ʛ玦ꃇ鄖옹㝜摉咅藔\ufaf2", i147, objArr17);
                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                                    int i148 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i149 = i148 * 85;
                                    int i150 = ((i149 | 3570) << 1) - (i149 ^ 3570);
                                    int i151 = ~i148;
                                    int i152 = ~((i151 & (-43)) | (i151 ^ (-43)));
                                    int i153 = ~i148;
                                    int i154 = i152 | (~((i153 & i25) | (i153 ^ i25)));
                                    int i155 = ~(((-43) ^ i25) | ((-43) & i25));
                                    int i156 = (i154 & i155) | (i154 ^ i155);
                                    int i157 = (i148 ^ 42) | (i148 & 42);
                                    int i158 = ~((i157 ^ i3) | (i157 & i3));
                                    int i159 = -(-(((i156 ^ i158) | (i156 & i158)) * (-84)));
                                    int i160 = (i150 ^ i159) + ((i159 & i150) << 1);
                                    int i161 = ~(((-43) ^ i3) | ((-43) & i3));
                                    int i162 = (i148 & i161) | (i148 ^ i161);
                                    int i163 = (i25 ^ 42) | (i25 & 42);
                                    int i164 = ~i163;
                                    int i165 = ((i162 & i164) | (i162 ^ i164)) * (-84);
                                    int i166 = ((i160 | i165) << 1) - (i165 ^ i160);
                                    int i167 = ~i163;
                                    int i168 = ~i157;
                                    byte b2 = (byte) ((i166 - (~(((i167 & i168) | (i167 ^ i168)) * 84))) - 1);
                                    Object[] objArr18 = new Object[1];
                                    c(b2, "\"\u000f\u0007\u0013\u0014\f(0+ ", bitsPerPixel, objArr18);
                                    Object[] objArr19 = (Object[]) cls5.getField((String) objArr18[0]).get(invoke2);
                                    int length = objArr19.length;
                                    int i169 = 0;
                                    while (i169 < length) {
                                        Object obj = objArr19[i169];
                                        int i170 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int c12 = m.c();
                                        int i171 = (i170 * 70) - 1936436;
                                        int i172 = ~i170;
                                        Object[] objArr20 = objArr19;
                                        int i173 = (i172 & (-28478)) | (i172 ^ (-28478));
                                        int i174 = ~((i173 & c12) | (i173 ^ c12));
                                        int i175 = i170 | 28477;
                                        int i176 = ~((i175 ^ c12) | (i175 & c12));
                                        int i177 = ((i174 ^ i176) | (i174 & i176)) * 69;
                                        int i178 = (i171 ^ i177) + ((i177 & i171) << 1);
                                        int i179 = ~i170;
                                        int i180 = ~((i179 & 28477) | (i179 ^ 28477));
                                        int i181 = ~((i172 ^ c12) | (i172 & c12));
                                        int i182 = (i180 & i181) | (i180 ^ i181);
                                        int i183 = ~((c12 & 28477) | (c12 ^ 28477));
                                        int i184 = -(-(((i182 & i183) | (i182 ^ i183)) * (-69)));
                                        int i185 = (((i178 ^ i184) + ((i184 & i178) << 1)) - (~(-(-((~(((-28478) & i170) | ((-28478) ^ i170))) * 69))))) - 1;
                                        Object[] objArr21 = new Object[1];
                                        b("궮싥玹\ue071ᄻ", i185, objArr21);
                                        try {
                                            Object[] objArr22 = {(String) objArr21[0]};
                                            int i186 = -Color.red(0);
                                            int i187 = (i186 ^ 43933) + ((i186 & 43933) << 1);
                                            Object[] objArr23 = new Object[1];
                                            b(str, i187, objArr23);
                                            Class<?> cls6 = Class.forName((String) objArr23[0]);
                                            int i188 = -Color.argb(0, 0, 0, 0);
                                            int c13 = m.c();
                                            int i189 = ~i188;
                                            int i190 = length;
                                            int i191 = ~((i189 ^ (-53114)) | (i189 & (-53114)));
                                            int i192 = ~c13;
                                            int i193 = ~(((-53114) ^ i192) | ((-53114) & i192));
                                            int i194 = (((i191 ^ i193) | (i191 & i193)) * 446) + ((i188 * (-445)) - 23635285);
                                            int i195 = ~((~i188) | 53113);
                                            int i196 = ((-53114) ^ i188) | ((-53114) & i188);
                                            int i197 = ~((i196 ^ c13) | (i196 & c13));
                                            int i198 = (((i197 & i195) | (i195 ^ i197)) * 446) + i194;
                                            int i199 = (~((i189 ^ (-53114)) | (i189 & (-53114)))) * 446;
                                            int i200 = (i198 ^ i199) + ((i199 & i198) << 1);
                                            Object[] objArr24 = new Object[1];
                                            b("궑拪㍰쏔遼ꃘ煔ǘ홐\ue6d4뜩", i200, objArr24);
                                            Object invoke3 = cls6.getMethod((String) objArr24[0], cls).invoke(null, objArr22);
                                            try {
                                                Object[] objArr25 = new Object[1];
                                                b("궗첵濈踃⤭䡾\uea9cףꓽ윌晚腭⎏䋑ﷴᱻ뽖\ude66磲鯲㨛唠\uf446᚜놺탦猖鈬", 24876 - (~TextUtils.getCapsMode("", 0, 0)), objArr25);
                                                Class<?> cls7 = Class.forName((String) objArr25[0]);
                                                int i201 = -View.getDefaultSize(0, 0);
                                                int i202 = (i201 ^ 11) + ((i201 & 11) << 1);
                                                int i203 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int i204 = i203 * 306;
                                                int i205 = (i204 ^ 610) + ((i204 & 610) << 1) + 15606;
                                                int i206 = ~((i203 ^ 51) | (i203 & 51));
                                                Class<String> cls8 = cls;
                                                int i207 = ~((i203 ^ i3) | (i203 & i3));
                                                int i208 = (((i206 ^ i207) | (i207 & i206)) * 305) + i205;
                                                int i209 = ~((i203 & i25) | (i25 ^ i203));
                                                int i210 = ((i209 & (-52)) | ((-52) ^ i209)) * 305;
                                                Object[] objArr26 = new Object[1];
                                                c((byte) ((i208 ^ i210) + ((i208 & i210) << 1)), "\u0014)/\u0006\u000b0(.\u0005\u001a㘖", i202, objArr26);
                                                try {
                                                    Object[] objArr27 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr26[0], null).invoke(obj, null))};
                                                    int i211 = -KeyEvent.normalizeMetaState(0);
                                                    int i212 = i211 * 70;
                                                    int i213 = (i212 ^ (-2987444)) + ((i212 & (-2987444)) << 1);
                                                    int i214 = ~i211;
                                                    int i215 = ((-43934) & i214) | (i214 ^ (-43934));
                                                    int i216 = ~((i215 & i3) | (i215 ^ i3));
                                                    int i217 = (i211 ^ 43933) | (i211 & 43933);
                                                    int i218 = ~((i217 & i3) | (i217 ^ i3));
                                                    int i219 = ((i216 & i218) | (i216 ^ i218)) * 69;
                                                    int i220 = (i213 & i219) + (i219 | i213);
                                                    int i221 = ~i211;
                                                    int i222 = (~((i214 & i3) | (i214 ^ i3))) | (~((i221 & 43933) | (i221 ^ 43933)));
                                                    int i223 = ~((i3 ^ 43933) | (i3 & 43933));
                                                    int i224 = -(-(((i222 & i223) | (i222 ^ i223)) * (-69)));
                                                    int i225 = (i220 ^ i224) + ((i224 & i220) << 1);
                                                    int i226 = (~(i211 | (-43934))) * 69;
                                                    int i227 = ((i225 | i226) << 1) - (i226 ^ i225);
                                                    Object[] objArr28 = new Object[1];
                                                    b(str, i227, objArr28);
                                                    Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                    int i228 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i229 = ((i228 | 48563) << 1) - (i228 ^ 48563);
                                                    Object[] objArr29 = new Object[1];
                                                    b("궑ဠ훾钊孈᧨\udfb0艶䀭ۘ앺謳䧻྇\uf255냨皧㕡ﬅ", i229, objArr29);
                                                    Object invoke4 = cls9.getMethod((String) objArr29[0], InputStream.class).invoke(invoke3, objArr27);
                                                    int i230 = 0;
                                                    while (i230 < 2) {
                                                        Object obj2 = objArr3[i230];
                                                        try {
                                                            int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                            int i231 = (jumpTapTimeout2 & 35339) + (jumpTapTimeout2 | 35339);
                                                            Object[] objArr30 = new Object[1];
                                                            b("궜➜릖㎶藴ᾲ金毘\ufddb矧짱䏻픋꽗ℏ묶ഴ蜹ᤞ鍿攟Ａ焽쭈岛횗ꢜ⊶뒤ຠ胟\u1ac2\uece2書", i231, objArr30);
                                                            Class<?> cls10 = Class.forName((String) objArr30[0]);
                                                            int i232 = 16777238 - (~(-(-Color.rgb(0, 0, 0))));
                                                            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                            int i233 = normalizeMetaState * (-919);
                                                            int i234 = ((i233 | (-77196)) << 1) - (i233 ^ (-77196));
                                                            int i235 = ~normalizeMetaState;
                                                            int i236 = (i235 ^ (-85)) | (i235 & (-85));
                                                            int i237 = ((-85) ^ i25) | ((-85) & i25);
                                                            String str2 = str;
                                                            int i238 = ((~((i237 ^ normalizeMetaState) | (i237 & normalizeMetaState))) | (~((i236 ^ i3) | (i236 & i3)))) * 920;
                                                            int i239 = (i234 & i238) + (i238 | i234);
                                                            int i240 = ~((i235 ^ (-85)) | (i235 & (-85)));
                                                            int i241 = ~normalizeMetaState;
                                                            int i242 = ~i3;
                                                            int i243 = ~((i241 ^ i242) | (i241 & i242));
                                                            int i244 = ((i240 ^ i243) | (i240 & i243)) * 920;
                                                            int i245 = (i239 ^ i244) + ((i244 & i239) << 1);
                                                            int i246 = (i241 ^ (-85)) | (i241 & (-85));
                                                            int i247 = (i235 & 84) | (i235 ^ 84);
                                                            int i248 = (~((i246 & i242) | (i246 ^ i242))) | (~((i247 & i) | (i247 ^ i)));
                                                            int i249 = (normalizeMetaState & (-85)) | ((-85) ^ normalizeMetaState);
                                                            int i250 = ~((i249 & i) | (i249 ^ i));
                                                            int i251 = ((i248 & i250) | (i248 ^ i250)) * 920;
                                                            Object[] objArr31 = new Object[1];
                                                            c((byte) (((i245 | i251) << 1) - (i245 ^ i251)), "\u000b/\u0007\t'\"'-\u001b\t\u0015\f㗾㗾!*\u000e\u000f\u001b\u0010\f\u0012㙊", i232, objArr31);
                                                            if (obj2.equals(cls10.getMethod((String) objArr31[0], null).invoke(invoke4, null))) {
                                                                Object[] objArr32 = {r1, null, r5, new int[1]};
                                                                int[] iArr3 = {i};
                                                                int[] iArr4 = {(~(i & 1)) & (i | 1)};
                                                                int i252 = (int) Runtime.getRuntime().totalMemory();
                                                                int i253 = (((~(i252 | (-777776487))) | (-1249911847)) * 502) + ((~((~i252) | (-1082130433))) * (-502)) + ((((~((-1249911847) | i252)) | (-1859906919)) * (-502)) - 1478529524);
                                                                int i254 = -(-(i253 * (-520)));
                                                                int i255 = ((8352 | i254) << 1) - (i254 ^ 8352);
                                                                int i256 = ~((i242 ^ i253) | (i242 & i253));
                                                                int i257 = ((i256 & 16) | (i256 ^ 16)) * (-1042);
                                                                int i258 = -(-((((((i255 & i257) + (i257 | i255)) - (~(-(-((i253 | i) * 521))))) - 1) - (~(((~(i253 | ((i25 ^ 16) | (i25 & 16)))) | ((~((-17) | (~i253))) | (~(((-17) & i) | ((-17) ^ i))))) * 521))) - 1));
                                                                int i259 = ((i2 | i258) << 1) - (i258 ^ i2);
                                                                int i260 = (i259 << 13) ^ i259;
                                                                int i261 = i260 >>> 17;
                                                                int i262 = (i260 | i261) & (~(i260 & i261));
                                                                int i263 = i262 << 5;
                                                                ((int[]) objArr32[3])[0] = (i262 | i263) & (~(i262 & i263));
                                                                return objArr32;
                                                            }
                                                            i230++;
                                                            i3 = i;
                                                            str = str2;
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    int i264 = (i169 & (-87)) + (i169 | (-87));
                                                    i169 = (i264 ^ 88) + ((i264 & 88) << 1);
                                                    i3 = i;
                                                    objArr19 = objArr20;
                                                    cls = cls8;
                                                    length = i190;
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
        Object[] objArr33 = new Object[4];
        int[] iArr5 = new int[1];
        objArr33[0] = iArr5;
        int[] iArr6 = new int[1];
        objArr33[2] = iArr6;
        objArr33[c2] = new int[1];
        iArr6[0] = i;
        iArr5[0] = i;
        objArr33[1] = null;
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        int i265 = (((~(freeMemory | (-591535824))) | 1436152509) * 376) + (((~((~freeMemory) | 591535823)) | (-2010906368)) * (-376)) + ((((-1994124403) | freeMemory) * 376) - 173913108);
        int c14 = m.c();
        int i266 = ((i265 * (-958)) - (~(i2 * (-958)))) - 1;
        int i267 = ~i2;
        int i268 = ~c14;
        int i269 = ~((i267 & i268) | (i267 ^ i268));
        int i270 = ~i265;
        int i271 = i269 | (~(i270 | c14));
        int i272 = ~c14;
        int i273 = ~((i272 ^ i265) | (i272 & i265));
        int i274 = ((i271 & i273) | (i271 ^ i273)) * 959;
        int i275 = (i266 & i274) + (i266 | i274);
        int i276 = (~(i265 | i2)) * (-959);
        int i277 = (~((~i2) | c14)) | (~((i270 ^ i272) | (i270 & i272)));
        int i278 = ~(i265 | c14);
        int i279 = (((i278 & i277) | (i277 ^ i278)) * 959) + (i275 & i276) + (i276 | i275);
        int i280 = i279 << 13;
        int i281 = (i279 | i280) & (~(i279 & i280));
        int i282 = i281 ^ (i281 >>> 17);
        int i283 = i282 << 5;
        ((int[]) objArr33[c2])[0] = ((~i282) & i283) | ((~i283) & i282);
        return objArr33;
    }

    public static void d() {
        h = new byte[]{1, 37, -122, 42};
    }

    public static final Long e() {
        Object m882constructorimpl;
        e = (d + 45) % 128;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        Long l = (Long) component9.b(bf.D8871(m882constructorimpl));
        int i = e + 95;
        d = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
        return l;
    }
}
