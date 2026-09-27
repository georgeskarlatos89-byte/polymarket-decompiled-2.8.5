package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p1 {
    public static int b = 0;
    public static int c = 1;
    public final TelephonyManager a;

    public p1(TelephonyManager telephonyManager) {
        this.a = telephonyManager;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i8 | i3;
        int i11 = (~((~i3) | i4)) | (~i10);
        int i12 = (~(i2 | i7 | i3)) | (~(i10 | i4));
        int i13 = ((-1621098496) * i5) + (1819279360 * i6) + (435683328 * i) + ((-437982760) * i12) + (437982760 * i11) + ((-875965520) * i9) + (873666089 * i4) + ((i3 * 873666089) - 1460666368);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i5, -532493036, (528639218 * i6) + i3 + i4 + i);
        int i14 = i12 * 936;
        int c2 = com.fingerprintjs.android.fpjs_pro.g.c(a, 1845559296, ((-1548035028) * i5) + (123045422 * i6) + ((-1573143025) * i) + i14 + (i11 * (-936)) + (i9 * 1872) + (i4 * (-1573143961)) + (i3 * (-1573143961)) + 2078511484, 1848705024, (586088448 * a) + i13);
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        try {
            if (c2 != 1) {
                Object[] objArr2 = {0L, new n1((p1) objArr[0]), 1, null};
                Object f = rV4669.f(-754466100);
                if (f == null) {
                    f = rV4669.g(Color.red(0) + 848, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 52 - (ViewConfiguration.getLongPressTimeout() >> 16), 1520639912, "setPivotYN16904", new Class[]{cls2, Function0.class, cls, Object.class});
                }
                Object invoke = ((Method) f).invoke(null, objArr2);
                b = (c + 79) % 128;
                return invoke;
            }
            Object[] objArr3 = {0L, new ap$2((p1) objArr[0]), 1, null};
            Object f2 = rV4669.f(-754466100);
            if (f2 == null) {
                f2 = rV4669.g(Color.alpha(0) + 848, (char) KeyEvent.getDeadChar(0, 0), ImageFormat.getBitsPerPixel(0) + 53, 1520639912, "setPivotYN16904", new Class[]{cls2, Function0.class, cls, Object.class});
            }
            Object invoke2 = ((Method) f2).invoke(null, objArr3);
            c = (b + 123) % 128;
            return invoke2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final /* synthetic */ TelephonyManager c(p1 p1Var) {
        int i = c;
        b = (i + 75) % 128;
        TelephonyManager telephonyManager = p1Var.a;
        int i2 = (i & 87) + (i | 87);
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return telephonyManager;
    }

    public final D8871 b() {
        try {
            Object[] objArr = {0L, new o1(this), 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 848, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 51 - ExpandableListView.getPackedPositionChild(0L), 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            D8871 d8871 = (D8871) ((Method) f).invoke(null, objArr);
            int i = c;
            int i2 = ((i | 67) << 1) - (i ^ 67);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return d8871;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final D8871 d() {
        try {
            Object[] objArr = {0L, new Function0<String>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.ap$5
                public static final char i;
                public static final char j;
                public static final char k;
                public static final char l;
                public static int m;
                public static int n;
                public static final byte[] o = null;
                public static int p;
                public static int q;
                public static final byte[] r = null;

                static {
                    g();
                    p = 0;
                    q = 1;
                    f();
                    m = 0;
                    n = 1;
                    i = (char) 45993;
                    j = (char) 12011;
                    k = (char) 26110;
                    l = (char) 59179;
                }

                {
                    super(0);
                }

                public static String b() {
                    int i2;
                    byte[] bArr = new byte[1];
                    if (r == null) {
                        i2 = 3;
                    } else {
                        i2 = 65;
                    }
                    bArr[0] = (byte) i2;
                    return new String(bArr, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [com.fingerprintjs.android.fpjs_pro_internal.co, java.lang.Object] */
                public static void c(String str, int i2, Object[] objArr2) {
                    int i3;
                    int i4 = p + 119;
                    q = i4 % 128;
                    if (i4 % 2 != 0) {
                        char[] charArray = str.toCharArray();
                        ?? obj = new Object();
                        char[] cArr = new char[charArray.length];
                        int i5 = 0;
                        obj.component9 = 0;
                        char[] cArr2 = new char[2];
                        while (true) {
                            int i6 = obj.component9;
                            if (i6 < charArray.length) {
                                int i7 = q + 123;
                                p = i7 % 128;
                                char c2 = 1;
                                if (i7 % 2 != 0) {
                                    cArr2[1] = charArray[i6];
                                    cArr2[i5] = charArray[i6 % 1];
                                    i3 = 1;
                                } else {
                                    cArr2[i5] = charArray[i6];
                                    cArr2[1] = charArray[i6 + 1];
                                    i3 = i5;
                                }
                                int i8 = 58224;
                                while (i3 < 16) {
                                    char c3 = cArr2[c2];
                                    char c4 = cArr2[i5];
                                    char c5 = c2;
                                    int i9 = (c4 + i8) ^ ((c4 << 4) + ((char) (k ^ 6670137673230944684L)));
                                    int i10 = c4 >>> 5;
                                    try {
                                        Object[] objArr3 = new Object[4];
                                        objArr3[3] = Integer.valueOf(l);
                                        objArr3[2] = Integer.valueOf(i10);
                                        objArr3[c5] = Integer.valueOf(i9);
                                        objArr3[i5] = Integer.valueOf(c3);
                                        Object f = rV4669.f(13315690);
                                        Class cls = Integer.TYPE;
                                        if (f == null) {
                                            f = rV4669.g((ViewConfiguration.getScrollDefaultDelay() >> 16) + 5633, (char) View.combineMeasuredStates(i5, i5), 52 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1989151986, b(), new Class[]{cls, cls, cls, cls});
                                        }
                                        char charValue = ((Character) ((Method) f).invoke(null, objArr3)).charValue();
                                        cArr2[c5] = charValue;
                                        char c6 = cArr2[i5];
                                        int i11 = i5;
                                        char[] cArr3 = cArr2;
                                        int i12 = (charValue + i8) ^ ((charValue << 4) + ((char) (i ^ 6670137673230944684L)));
                                        int i13 = charValue >>> 5;
                                        Object[] objArr4 = new Object[4];
                                        objArr4[3] = Integer.valueOf(j);
                                        objArr4[2] = Integer.valueOf(i13);
                                        objArr4[c5] = Integer.valueOf(i12);
                                        objArr4[i11] = Integer.valueOf(c6);
                                        Object f2 = rV4669.f(13315690);
                                        if (f2 == null) {
                                            f2 = rV4669.g((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5633, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51, -1989151986, b(), new Class[]{cls, cls, cls, cls});
                                        }
                                        cArr3[i11] = ((Character) ((Method) f2).invoke(null, objArr4)).charValue();
                                        i8 -= 40503;
                                        i3++;
                                        c2 = c5;
                                        i5 = i11;
                                        cArr2 = cArr3;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                int i14 = i5;
                                char[] cArr4 = cArr2;
                                char c7 = c2;
                                int i15 = obj.component9;
                                cArr[i15] = cArr4[i14];
                                cArr[i15 + 1] = cArr4[c7];
                                Object[] objArr5 = new Object[2];
                                objArr5[c7] = obj;
                                objArr5[i14] = obj;
                                Object f3 = rV4669.f(1265007788);
                                if (f3 == null) {
                                    f3 = rV4669.g(2040 - (ExpandableListView.getPackedPositionForChild(i14, i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == 0L ? 0 : -1)), (char) (9856 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 51 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1027431992, "C", new Class[]{Object.class, Object.class});
                                }
                                ((Method) f3).invoke(null, objArr5);
                                cArr2 = cArr4;
                                i5 = 0;
                            } else {
                                objArr2[0] = new String(cArr, 0, i2);
                                return;
                            }
                        }
                    } else {
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void d(byte b2, int i2, int i3, Object[] objArr2) {
                    int i4;
                    int i5 = b2 + 4;
                    int i6 = i2 + 97;
                    byte[] bArr = new byte[12 - i3];
                    int i7 = 11 - i3;
                    byte[] bArr2 = o;
                    if (bArr2 == null) {
                        int i8 = i5;
                        byte[] bArr3 = bArr2;
                        int i9 = 0;
                        int i10 = i7;
                        int i11 = (i10 + i5) - 17;
                        int i12 = i8;
                        i6 = i11;
                        i5 = i12;
                        bArr2 = bArr3;
                        i4 = i9;
                        bArr[i4] = (byte) i6;
                        int i13 = i5 + 1;
                        i9 = i4 + 1;
                        if (i4 == i7) {
                            objArr2[0] = new String(bArr, 0);
                            return;
                        }
                        int i14 = i6;
                        i8 = i13;
                        i5 = bArr2[i13];
                        bArr3 = bArr2;
                        i10 = i14;
                        int i112 = (i10 + i5) - 17;
                        int i122 = i8;
                        i6 = i112;
                        i5 = i122;
                        bArr2 = bArr3;
                        i4 = i9;
                        bArr[i4] = (byte) i6;
                        int i132 = i5 + 1;
                        i9 = i4 + 1;
                        if (i4 == i7) {
                        }
                    } else {
                        i4 = 0;
                        bArr[i4] = (byte) i6;
                        int i1322 = i5 + 1;
                        i9 = i4 + 1;
                        if (i4 == i7) {
                        }
                    }
                }

                public static void f() {
                    o = new byte[]{114, 68, MessagePack.Code.FIXEXT4, 38, 29, 15, 20, 16, 16, 8, 26, 23, MessagePack.Code.INT32, 29, 15, 20, 16, 16, 8, 26, 23, MessagePack.Code.FIXEXT4, MessagePack.Code.MAP32, -2, 20, 21, 12, 16, 45, -7, 18, 11, 21, 29, 18, 26};
                }

                public static void g() {
                    r = new byte[]{22, 25, 71, 62};
                }

                /* JADX WARN: Code restructure failed: missing block: B:54:0x05a1, code lost:
                
                    if (((r0 & r3) | (r0 ^ r3)) == 1) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x06a0, code lost:
                
                    r0 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x069e, code lost:
                
                    if (((r0 & r3) | (r0 ^ r3)) == 1) goto L74;
                 */
                /* JADX WARN: Removed duplicated region for block: B:57:0x073c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object[] vD14832N6715(Context context, int i2, int i3, int i4) {
                    boolean z;
                    char c2;
                    float f;
                    Object[] objArr2;
                    int i5;
                    char c3;
                    char c4;
                    boolean z2;
                    if (context == null) {
                        Object[] objArr3 = {r4, null, r10, new int[1]};
                        int[] iArr = {i2};
                        int[] iArr2 = {i2};
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i6 = (((~((~elapsedCpuTime) | (-807436299))) | 1183018496) * 521) + ((~((-807436299) | elapsedCpuTime)) * 521) + 87858994;
                        int a = y3.a();
                        int i7 = -(-(i6 * (-574)));
                        int i8 = (i7 << 1) - i7;
                        int i9 = ~a;
                        int i10 = ~(((-1) ^ i9) | i9);
                        int i11 = ~i6;
                        int i12 = ~(i11 | a);
                        int i13 = -(-(((i10 & i12) | (i10 ^ i12)) * 1150));
                        int i14 = (i8 & i13) + (i8 | i13);
                        int i15 = -(-(((~((i6 & i9) | (i9 ^ i6))) | (~((i11 ^ a) | (i11 & a)))) * (-575)));
                        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                        int i17 = ~(((-1) ^ a) | a);
                        int i18 = ~i9;
                        int i19 = ((i17 & i18) | (i17 ^ i18)) * 575;
                        int i20 = (i16 & i19) + (i19 | i16);
                        int a2 = y3.a();
                        int i21 = i20 * (-563);
                        int i22 = i4 * 565;
                        int i23 = (i21 & i22) + (i21 | i22);
                        int i24 = ~i20;
                        int i25 = ~i4;
                        int i26 = ~a2;
                        int i27 = ~(i25 | i26);
                        int i28 = (i27 & i24) | (i24 ^ i27);
                        int i29 = ~(i4 | a2);
                        int i30 = -(-(((i28 & i29) | (i28 ^ i29)) * (-564)));
                        int i31 = (i23 ^ i30) + ((i30 & i23) << 1);
                        int i32 = (i24 ^ i4) | (i24 & i4);
                        int i33 = (i31 - (~((~((a2 & i32) | (i32 ^ a2))) * 1128))) - 1;
                        int i34 = ~(i24 | i26);
                        int i35 = ~(i4 | i20);
                        int i36 = (((i34 & i35) | (i34 ^ i35)) * 564) + i33;
                        int i37 = i36 << 13;
                        int i38 = (i36 | i37) & (~(i36 & i37));
                        int i39 = i38 >>> 17;
                        int i40 = (i38 | i39) & (~(i38 & i39));
                        int i41 = i40 << 5;
                        ((int[]) objArr3[3])[0] = (i40 | i41) & (~(i40 & i41));
                        int i42 = n;
                        m = ((i42 & 11) + (i42 | 11)) % 128;
                        return objArr3;
                    }
                    n = (m + 55) % 128;
                    try {
                        int i43 = -Color.red(0);
                        int i44 = (i43 ^ 23) + ((i43 & 23) << 1);
                        Object[] objArr4 = new Object[1];
                        c("遍좜䝙㨣≟喙\ueced櫡쀭麛븴挄\uee7d鋿⭑︱汞\u0002븴挄矴హ돜ᧄ", i44, objArr4);
                        Class<?> cls = Class.forName((String) objArr4[0]);
                        int i45 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i46 = i45 * 221;
                        int i47 = (i46 & (-3942)) + (i46 | (-3942));
                        int i48 = ~i45;
                        int i49 = ~((i48 ^ (-19)) | (i48 & (-19)));
                        int i50 = ~i2;
                        int i51 = (i50 ^ i45) | (i50 & i45);
                        int i52 = (((~((i50 ^ 18) | (i50 & 18))) | i45) * (-440)) + (((~((i51 ^ 18) | (i51 & 18))) | i49) * 220) + i47;
                        int i53 = -(-(((i45 ^ 18) | (i45 & 18) | i2) * 220));
                        int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                        Object[] objArr5 = new Object[1];
                        c("\ueb11䂒〈\uee15凩ꁵ諨㔕錓͟㩿횼⥡쎲▐\u1ad8∢꼴", i54, objArr5);
                        Object invoke = cls.getMethod((String) objArr5[0], null).invoke(context, null);
                        int i55 = -(-ImageFormat.getBitsPerPixel(0));
                        int i56 = (i55 & 35) + (i55 | 35);
                        Object[] objArr6 = new Object[1];
                        c("遍좜䝙㨣≟喙\ueced櫡쀭麛븴挄\uee7d鋿⭑︱隃軆\uc8e1a凩ꁵ諨㔕錓͟㩿횼⥡쎲▐\u1ad8∢꼴", i56, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        int i57 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int i58 = ((i57 | 5) << 1) - (i57 ^ 5);
                        Object[] objArr7 = new Object[1];
                        c("歹䴋硫Ⳍ뎢䰸", i58, objArr7);
                        if ((cls2.getField((String) objArr7[0]).getInt(invoke) & 2) != 0) {
                            int i59 = m;
                            int i60 = (i59 & 29) + (i59 | 29);
                            int i61 = i60 % 128;
                            n = i61;
                            if (i60 % 2 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            m = (i61 + 97) % 128;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            objArr2 = new Object[]{r5, null, r10, r12};
                            int[] iArr3 = {i2};
                            int[] iArr4 = {i2};
                            int i62 = ((249464732 | i2) * 104) + ((~(1879019516 | i50)) * (-104)) + (((~((-1778223601) | i2)) | 148668816) * 104) + 1601499308;
                            int i63 = i62 * HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST;
                            int i64 = ((~(i62 | i2)) * 420) + ((i63 << 1) - i63);
                            int i65 = (i64 & 420) + (i64 | 420);
                            int i66 = ~i62;
                            int i67 = ~(((-1) ^ i66) | i66);
                            int i68 = ~((i50 ^ i62) | (i62 & i50));
                            int i69 = (((i67 ^ i68) | (i68 & i67)) * 420) + i65;
                            int i70 = i69 * 193;
                            int i71 = -(-(i4 * 193));
                            int i72 = (i70 & i71) + (i70 | i71);
                            int i73 = ~i69;
                            int i74 = ~((i73 ^ i4) | (i73 & i4));
                            int i75 = -(-(((i50 ^ i74) | (i74 & i50)) * (-192)));
                            int i76 = (i72 ^ i75) + ((i72 & i75) << 1);
                            int i77 = ~i4;
                            int i78 = (i73 ^ i77) | (i73 & i77);
                            c2 = 3;
                            int i79 = (i77 ^ i50) | (i77 & i50);
                            f = 0.0f;
                            int i80 = ((~i78) | (~i79)) * (-384);
                            int i81 = (i76 & i80) + (i76 | i80);
                            int i82 = ~((i78 ^ i2) | (i78 & i2));
                            int i83 = ~((i79 ^ i69) | (i79 & i69));
                            int i84 = (i69 & i4) | (i69 ^ i4);
                            int i85 = -(-(((~((i84 & i2) | (i84 ^ i2))) | (i82 & i83) | (i82 ^ i83)) * 192));
                            int i86 = (i81 & i85) + (i85 | i81);
                            int i87 = i86 << 13;
                            int i88 = (i87 & (~i86)) | ((~i87) & i86);
                            int i89 = i88 >>> 17;
                            int i90 = (i88 | i89) & (~(i88 & i89));
                            int i91 = i90 << 5;
                            int[] iArr5 = {((~i90) & i91) | ((~i91) & i90)};
                        } else {
                            c2 = 3;
                            f = 0.0f;
                            n = (m + 11) % 128;
                            Object[] objArr8 = {r6, null, r10, new int[1]};
                            int[] iArr6 = {i2};
                            int[] iArr7 = {(~(i2 & 1)) & (i2 | 1)};
                            int i92 = ~((int) Runtime.getRuntime().freeMemory());
                            int i93 = (((~((-838732268) | i92)) | (~(i92 | 1188956065))) * 590) + (((~((-1188956066) | i92)) | 1174406656 | (~(838732267 | i92))) * (-1180)) + ((((~(r0 | (-824182859))) | r10) * 590) - 1793668352);
                            int i94 = ((i93 | 16) << 1) - (i93 ^ 16);
                            int i95 = i94 * 503;
                            int i96 = -(-(i4 * 503));
                            int i97 = (i95 & i96) + (i95 | i96);
                            int i98 = (i94 ^ i4) | (i94 & i4);
                            int i99 = i98 * (-502);
                            int i100 = (i97 & i99) + (i99 | i97);
                            int i101 = ~i94;
                            int i102 = ~i4;
                            int i103 = ~((i102 & i101) | (i101 ^ i102));
                            int i104 = i101 | i50;
                            int i105 = ~i104;
                            int i106 = (i103 ^ i105) | (i103 & i105);
                            int i107 = i94 | i4;
                            int i108 = ~((i107 & i2) | (i107 ^ i2));
                            int i109 = ((i108 & i106) | (i106 ^ i108)) * (-502);
                            int i110 = (i100 ^ i109) + ((i109 & i100) << 1);
                            int i111 = -(-(((~((i98 & i2) | (i98 ^ i2))) | (~((i104 ^ i4) | (i104 & i4)))) * 502));
                            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                            int i113 = i112 << 13;
                            int i114 = (i113 & (~i112)) | ((~i113) & i112);
                            int i115 = i114 >>> 17;
                            int i116 = ((~i114) & i115) | ((~i115) & i114);
                            ((int[]) objArr8[3])[0] = i116 ^ (i116 << 5);
                            n = (m + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
                            objArr2 = objArr8;
                        }
                        if (((int[]) objArr2[0])[0] != i2) {
                            int i117 = m;
                            n = ((i117 ^ 79) + ((i117 & 79) << 1)) % 128;
                            return objArr2;
                        }
                        try {
                            Object f2 = rV4669.f(-448558154);
                            byte[] bArr = o;
                            if (f2 == null) {
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5252;
                                char red = (char) (Color.red(0) + 37470);
                                int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 52;
                                byte b2 = (byte) (-bArr[23]);
                                byte b3 = b2;
                                i5 = 37470;
                                Object[] objArr9 = new Object[1];
                                d((byte) (b3 - 3), b2, b3, objArr9);
                                f2 = rV4669.g(minimumFlingVelocity, red, combineMeasuredStates, 1827100370, (String) objArr9[0], new Class[0]);
                            } else {
                                i5 = 37470;
                            }
                            Set set = (Set) ((Method) f2).invoke(null, null);
                            Object f3 = rV4669.f(-1563369761);
                            if (f3 == null) {
                                int maximumFlingVelocity = 5252 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                char threadPriority = (char) (i5 - ((Process.getThreadPriority(0) + 20) >> 6));
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 52;
                                byte b4 = (byte) (-bArr[23]);
                                c4 = '\t';
                                c3 = 23;
                                Object[] objArr10 = new Object[1];
                                d(bArr[9], b4, b4, objArr10);
                                f3 = rV4669.g(maximumFlingVelocity, threadPriority, jumpTapTimeout, 729023419, (String) objArr10[0], null);
                            } else {
                                c3 = 23;
                                c4 = '\t';
                            }
                            if (!set.contains(((Field) f3).get(null))) {
                                int i118 = n;
                                m = (((i118 | 85) << 1) - (i118 ^ 85)) % 128;
                                Object f4 = rV4669.f(-665084816);
                                if (f4 == null) {
                                    int combineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 5252;
                                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + i5);
                                    int i119 = (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 52;
                                    Object[] objArr11 = new Object[1];
                                    d((byte) 17, bArr[25], 0, objArr11);
                                    f4 = rV4669.g(combineMeasuredStates2, maximumDrawingCacheSize, i119, 1375682836, (String) objArr11[0], null);
                                }
                                set.contains(((Field) f4).get(null));
                            }
                            if ((i3 & 32) == 0) {
                                n = (m + 37) % 128;
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i120 = n;
                                    int i121 = ((i120 | 11) << 1) - (i120 ^ 11);
                                    m = i121 % 128;
                                    if (i121 % 2 != 0) {
                                        Object[] objArr12 = new Object[1];
                                        c("⺓땢玅扲馉ꏙࠛ餩褡\u0abb㎄\udb9f꙳맛缜䠝庢\ue9ae鴦༐䆲ꔃ馟괁韋麎ⳟᨾ", 22 / (ViewConfiguration.getKeyRepeatDelay() >>> 50), objArr12);
                                        try {
                                            Object[] objArr13 = {(String) objArr12[0]};
                                            Object f5 = rV4669.f(-668483483);
                                            if (f5 == null) {
                                                int i122 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 6046;
                                                char indexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                int longPressTimeout = 52 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                byte b5 = (byte) (-bArr[c3]);
                                                byte b6 = bArr[c4];
                                                Object[] objArr14 = new Object[1];
                                                d((byte) (b6 | 20), b5, b6, objArr14);
                                                f5 = rV4669.g(i122, indexOf, longPressTimeout, 1367547137, (String) objArr14[0], new Class[]{String.class});
                                            }
                                            long longValue = ((Long) ((Method) f5).invoke(null, objArr13)).longValue();
                                            long nextInt = new Random().nextInt();
                                            long e = com.fingerprintjs.android.fpjs_pro.g.e(381L, ((-345857524) | longValue) ^ (-1), (((((-345857524) | (longValue ^ (-1))) ^ (-1)) | (((nextInt ^ (-1)) | longValue) ^ (-1)) | ((345857523 | longValue) ^ (-1))) * 381) + ((-381) * (longValue | nextInt | (-345857524))) + ((382 * longValue) - 131425858740L), 1593692484L);
                                            int i123 = ((int) (e >> 5)) & (((1216446754 | (~((-118783109) | i2)) | (~(118783108 | i50))) * 988) + (((~(1318443302 | i50)) | 16786560) * (-1976)) + ((i2 | 1216446754) * 988) + 337036746);
                                            int i124 = ((((~(649778045 | i2)) | 787448364) * 318) + (((~((-649778046) | i2)) | 1069393) * (-318)) + (((~(i50 | (-648708653))) | (~(788517757 | i2))) * (-318)) + 2028252403) & ((int) e);
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Object[] objArr15 = new Object[1];
                                        c("⺓땢玅扲馉ꏙࠛ餩褡\u0abb㎄\udb9f꙳맛缜䠝庢\ue9ae鴦༐䆲ꔃ馟괁韋麎ⳟᨾ", 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr15);
                                        try {
                                            Object[] objArr16 = {(String) objArr15[0]};
                                            Object f6 = rV4669.f(-668483483);
                                            if (f6 == null) {
                                                int doubleTapTimeout = 6046 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                                int i125 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51;
                                                byte b7 = (byte) (-bArr[c3]);
                                                byte b8 = bArr[c4];
                                                Object[] objArr17 = new Object[1];
                                                d((byte) (b8 | 20), b7, b8, objArr17);
                                                f6 = rV4669.g(doubleTapTimeout, defaultSize, i125, 1367547137, (String) objArr17[0], new Class[]{String.class});
                                            }
                                            long longValue2 = ((Long) ((Method) f6).invoke(null, objArr16)).longValue();
                                            long j2 = ((-1443591145) | (longValue2 ^ (-1))) ^ (-1);
                                            long j3 = (1512 * j2) + (((-755) * longValue2) - 1089911313720L);
                                            long j4 = longValue2 | 1443591144;
                                            long j5 = i2;
                                            long e2 = com.fingerprintjs.android.fpjs_pro.g.e(756L, j4 | (j5 ^ (-1)), ((-756) * (j2 | ((j4 | j5) ^ (-1)))) + j3, 495958863L);
                                            int nextInt2 = new Random().nextInt();
                                            int i126 = ~nextInt2;
                                            int i127 = ((int) (e2 >> 32)) & ((((~(nextInt2 | (-18839836))) | (-1436548512)) * 49) + (((~(i126 | (-1418386576))) | (-18839836) | (~(1418386575 | nextInt2))) * (-49)) + (((~((-18839836) | i126)) | 18161936) * 98) + 372388019);
                                            int i128 = (((~(i50 | (-800396346))) * 184) + ((1342210564 | i2) * (-184)) + ((((~(2057344540 | i50)) | 85262369) * 184) - 2086992515)) & ((int) e2);
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                    if (z2) {
                                        Object[] objArr18 = new Object[4];
                                        int[] iArr8 = new int[1];
                                        objArr18[0] = iArr8;
                                        int[] iArr9 = new int[1];
                                        objArr18[2] = iArr9;
                                        objArr18[c2] = new int[1];
                                        iArr9[0] = i2;
                                        iArr8[0] = i2 ^ 10;
                                        objArr18[1] = null;
                                        int myPid = Process.myPid();
                                        int i129 = ~myPid;
                                        int i130 = (((~(myPid | (-1884324425))) | (~(i129 | (-143346693)))) * 210) + (((~((-1884333033) | i129)) | (~((-143355301) | myPid))) * 210) + 1416708596;
                                        int a3 = y3.a();
                                        int i131 = i130 * (-167);
                                        int i132 = (((-2672) | i131) << 1) - (i131 ^ (-2672));
                                        int i133 = ~i130;
                                        int i134 = ~(((-17) ^ i133) | ((-17) & i133));
                                        int i135 = ~a3;
                                        int i136 = ~(i133 | i135);
                                        int i137 = ((i134 & i136) | (i134 ^ i136)) * 168;
                                        int i138 = (i132 ^ i137) + ((i132 & i137) << 1);
                                        int i139 = (-17) | i133;
                                        int i140 = -(-((~((i139 & a3) | (i139 ^ a3))) * 168));
                                        int i141 = (~(i130 | (-17))) | (~(((-17) ^ i135) | (i135 & (-17))));
                                        int i142 = ~(a3 | (i133 & 16) | (i133 ^ 16));
                                        int i143 = (i4 - (~((((i141 & i142) | (i141 ^ i142)) * 168) + (((i138 | i140) << 1) - (i140 ^ i138))))) - 1;
                                        int i144 = i143 << 13;
                                        int i145 = ((~i143) & i144) | ((~i144) & i143);
                                        int i146 = i145 >>> 17;
                                        int i147 = (i145 | i146) & (~(i145 & i146));
                                        ((int[]) objArr18[c2])[0] = i147 ^ (i147 << 5);
                                        int i148 = n;
                                        int i149 = (i148 ^ 37) + ((i148 & 37) << 1);
                                        m = i149 % 128;
                                        if (i149 % 2 != 0) {
                                            int i150 = 36 / 0;
                                        }
                                        return objArr18;
                                    }
                                } else {
                                    Object[] objArr19 = new Object[1];
                                    c("ㄥ\ue14f\ue79aॣ庢\ue9ae鴦༐䆲ꔃ馟괁\uf83d褡", 13 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr19);
                                    try {
                                        Object[] objArr20 = {(String) objArr19[0]};
                                        Object f7 = rV4669.f(-417469134);
                                        if (f7 == null) {
                                            int i151 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6202;
                                            char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                            int bitsPerPixel = 50 - ImageFormat.getBitsPerPixel(0);
                                            byte b9 = bArr[31];
                                            Object[] objArr21 = new Object[1];
                                            d((byte) (b9 | 20), 0, b9, objArr21);
                                            f7 = rV4669.g(i151, lastIndexOf, bitsPerPixel, 1857630294, (String) objArr21[0], new Class[]{String.class});
                                        }
                                        Object invoke2 = ((Method) f7).invoke(null, objArr20);
                                        int i152 = -(-Gravity.getAbsoluteGravity(0, 0));
                                        int i153 = (i152 & 1) + (i152 | 1);
                                        Object[] objArr22 = new Object[1];
                                        c("煜뜨", i153, objArr22);
                                        z2 = invoke2.equals((String) objArr22[0]);
                                        m = (n + 27) % 128;
                                        if (z2) {
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            }
                            Object[] objArr23 = new Object[4];
                            int[] iArr10 = new int[1];
                            objArr23[0] = iArr10;
                            int[] iArr11 = new int[1];
                            objArr23[2] = iArr11;
                            objArr23[c2] = new int[1];
                            iArr11[0] = i2;
                            iArr10[0] = i2;
                            objArr23[1] = null;
                            int i154 = ~Process.myUid();
                            int i155 = (((~(i154 | 1360294462)) | (-667393871)) * 783) + ((~((-650349889) | i154)) * (-783)) + 611079213;
                            int i156 = ((i155 << 1) - i155) + i4;
                            int i157 = i156 << 13;
                            int i158 = (i157 | i156) & (~(i156 & i157));
                            int i159 = i158 >>> 17;
                            int i160 = ((~i158) & i159) | ((~i159) & i158);
                            int i161 = i160 << 5;
                            ((int[]) objArr23[c2])[0] = ((~i160) & i161) | ((~i161) & i160);
                            return objArr23;
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                    z2 = false;
                    if (z2) {
                    }
                    Object[] objArr232 = new Object[4];
                    int[] iArr102 = new int[1];
                    objArr232[0] = iArr102;
                    int[] iArr112 = new int[1];
                    objArr232[2] = iArr112;
                    objArr232[c2] = new int[1];
                    iArr112[0] = i2;
                    iArr102[0] = i2;
                    objArr232[1] = null;
                    int i1542 = ~Process.myUid();
                    int i1552 = (((~(i1542 | 1360294462)) | (-667393871)) * 783) + ((~((-650349889) | i1542)) * (-783)) + 611079213;
                    int i1562 = ((i1552 << 1) - i1552) + i4;
                    int i1572 = i1562 << 13;
                    int i1582 = (i1572 | i1562) & (~(i1562 & i1572));
                    int i1592 = i1582 >>> 17;
                    int i1602 = ((~i1582) & i1592) | ((~i1592) & i1582);
                    int i1612 = i1602 << 5;
                    ((int[]) objArr232[c2])[0] = ((~i1602) & i1612) | ((~i1612) & i1602);
                    return objArr232;
                }

                public final String e() {
                    int i2 = n;
                    m = ((i2 & 117) + (i2 | 117)) % 128;
                    TelephonyManager c2 = p1.c(p1.this);
                    c2.getClass();
                    String networkCountryIso = c2.getNetworkCountryIso();
                    networkCountryIso.getClass();
                    int i3 = n;
                    m = (((i3 | 95) << 1) - (i3 ^ 95)) % 128;
                    return networkCountryIso;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ String invoke() {
                    int i2 = m;
                    int i3 = (i2 ^ 93) + ((i2 & 93) << 1);
                    n = i3 % 128;
                    if (i3 % 2 != 0) {
                        String e = e();
                        int i4 = m;
                        n = ((i4 & 17) + (i4 | 17)) % 128;
                        return e;
                    }
                    e();
                    throw null;
                }
            }, 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g(View.MeasureSpec.getSize(0) + 848, (char) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51, 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            D8871 d8871 = (D8871) ((Method) f).invoke(null, objArr);
            int i = c;
            b = (((i | 27) << 1) - (i ^ 27)) % 128;
            return d8871;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
