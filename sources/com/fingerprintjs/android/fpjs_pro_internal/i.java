package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.r5g;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2Connection;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i {
    public static final long b;
    public static final int c;
    public static final char d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final byte[] h;
    public static int i;
    public static int j;
    public static final byte[] k = null;
    public static int l;
    public static int m;
    public static final byte[] n = null;
    public final Context a;

    static {
        f();
        l = 0;
        m = 1;
        e();
        i = 0;
        j = 1;
        b = 543169457660631834L;
        c = 1419927672;
        d = (char) 6938;
        e = 199813026;
        f = 1463008173;
        g = -697348160;
        h = new byte[]{91, -122, -98, -114, -122, 120, 89, -104, -75, MessagePack.Code.UINT32, MessagePack.Code.UINT16, -125, Byte.MIN_VALUE, -77, 74, -9, 105, 103, -5, 11, -8, 97, 107, -3, -9, 110, 37, MessagePack.Code.FIXSTR_PREFIX, 11, 84, 11, 111, 103, -8, -72, -91, 103, 53, MessagePack.Code.FLOAT64, 16, -109, MessagePack.Code.TRUE, MessagePack.Code.INT32, MessagePack.Code.STR32, MessagePack.Code.FALSE, MessagePack.Code.ARRAY16, MessagePack.Code.FLOAT32, -23, MessagePack.Code.EXT8, MessagePack.Code.STR32, 13, -109, MessagePack.Code.TRUE, MessagePack.Code.BIN16, MessagePack.Code.ARRAY16, 7, -127, MessagePack.Code.INT16, MessagePack.Code.NEVER_USED, MessagePack.Code.MAP32, 2, -88, -75, MessagePack.Code.FIXEXT2, 14, 68, MessagePack.Code.STR8, 8, -15, MessagePack.Code.FIXEXT16, -14, MessagePack.Code.NIL, -17, MessagePack.Code.BIN16, -15, 12, -125, MessagePack.Code.BIN16, 89, -91, MessagePack.Code.MAP32, -91, MessagePack.Code.FIXEXT8, -72, -71, -18, 68, MessagePack.Code.INT32, 69, MessagePack.Code.FIXEXT16, MessagePack.Code.INT64, -12, MessagePack.Code.MAP16, 2, 40, -102, 12, MessagePack.Code.ARRAY16, 6, 95, MessagePack.Code.UINT32, 71, -122, -21, 97, -110, -83, -126, -94, -97, -88, 69, -93, MessagePack.Code.FALSE, -91, -70, -77, -90, -73, -90, -84, -90, -79, 67, 65, -8, 94, -8, 79, 64, 9, 76, -3, 76, 70, 76, 11, 90, 84, -113, 41, -125, -103, -124, 91, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT1, 55, 88, MessagePack.Code.INT16, 95, 54, 65, -28, -123, 119, -15, -123, 92, 47, -111, -1, 117, -23, -97, -17, -111, -12, 71, -12, -22, 55, MessagePack.Code.FIXEXT2, 63, 56, 56, MessagePack.Code.INT64, -28, 70, 57, 25, 23, 110, 21, 101, 106, 106, 7, 22, 66, 103, 72, 99, 122, 72, 98, 49, 81, 73, 54, 99, 50, 103, 55, 67, 10, 32, -16, 56, 39, 9, 7, 38, 57, 8, 61, -12, 36, 69, 111, 35, 33, 93, 110, 40, -97, 47, -122, 34, -28, 74, -102, 109, -101, -107, 100, -107, -82, 47, -101, -97, -111, 121, -97, 106, MessagePack.Code.INT8, 56, -87, -81, 56, 98, -98, MessagePack.Code.INT8, 64, -125, -24, -26, 116, -24, 45, MessagePack.Code.FIXARRAY_PREFIX, -113, -22, -121, 45, -107, -99, -124, MessagePack.Code.FIXEXT8, 40, 93, 34, 50, 6, 90, MessagePack.Code.UINT64, -106, MessagePack.Code.BIN32, -99, MessagePack.Code.NEVER_USED, 3, 69, MessagePack.Code.NIL, MessagePack.Code.FALSE, 58, -127, 7, MessagePack.Code.ARRAY32, 52, MessagePack.Code.BIN8, 79, MessagePack.Code.TRUE, -127, 68, -66, -79, -80, MessagePack.Code.TRUE, -13, 5, -68, 1, -84, MessagePack.Code.NEVER_USED, 88, 26, 70, 87, 126, 97, 115, 98, 100, 123, Byte.MAX_VALUE, 84, -118, 79, -18, 51, 57, 53, -20, 52, MessagePack.Code.STR32, 51, 116, -6, MessagePack.Code.ARRAY16, 50, 116, -85, 58, -22, 52, 90, -18, 82, MessagePack.Code.NEGFIXINT_PREFIX, 87, -18, 104, 69, MessagePack.Code.INT16, -87, -2, -28, -111, -69, -18, 11, -127, -5, -93, 65, 92, -104, -102, 110, 94, -122, 19, 41, -98, 80, 67, 32, -114, 16, 104, 64, -9, 51, 49, 44, -113, -11, 77, 24, 2, 53, 91, 8, 43, 37, 27, 67, 91, 83, 23, 21, 77, MessagePack.Code.FIXEXT4, 72, 31, -75, MessagePack.Code.EXT16, MessagePack.Code.ARRAY32, 117, 1, MessagePack.Code.STR32, MessagePack.Code.EXT16, MessagePack.Code.TRUE, -119, 0, -22, Byte.MIN_VALUE, 29, MessagePack.Code.STR32, MessagePack.Code.STR16, 114, -10, MessagePack.Code.NIL, MessagePack.Code.STR8, MessagePack.Code.EXT32, MessagePack.Code.MAP16, -78, 116, 89, 93, 25, 27, 47, -106, 30, MessagePack.Code.FIXEXT16, 64, 70, 109, 64, 109, 105, -123, 16, 65, 110, 89, -85, 19, 91, 68, 105, -88, 91, -12, 110, 54, 7, -1, 91, 98, -102, -111, 44, -19, 75, -111, 53, 54, 54, 72, -22, -16, -84, MessagePack.Code.FIXSTR_PREFIX, -82, 54, MessagePack.Code.FIXSTR_PREFIX, 61, -17, -9, -90, 112, -9, 53, -95, -17, 70, 114, 0, 8, 100, 115, MessagePack.Code.UINT64, -79, 25, 9, 61, 65, MessagePack.Code.BIN8, -89, -76, MessagePack.Code.UINT16, MessagePack.Code.MAP32, -31, Byte.MIN_VALUE, -70, -74, -66, -7, 118, -84, MessagePack.Code.MAP16, -80, 92, MessagePack.Code.UINT32, MessagePack.Code.ARRAY32, -111, MessagePack.Code.UINT16};
    }

    public i(Context context) {
        this.a = context;
    }

    public static String a(int i2, int i3) {
        int i4 = i3 + 4;
        int i5 = i2 + 109;
        byte[] bArr = new byte[1];
        if (n == null) {
            i5 += i4;
        }
        bArr[0] = (byte) i5;
        return new String(bArr, 0);
    }

    public static void b(byte b2, int i2, int i3, Object[] objArr) {
        int i4 = 100 - b2;
        int i5 = i2 * 3;
        int i6 = 7 - (i3 * 3);
        byte[] bArr = new byte[4 - i5];
        int i7 = 3 - i5;
        int i8 = -1;
        byte[] bArr2 = k;
        if (bArr2 == null) {
            i4 = i4 + (-i6) + 6;
            i6++;
            i8 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i9 = i8 + 1;
            bArr[i9] = (byte) i4;
            if (i9 == i7) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i10 = i6;
            byte[] bArr3 = bArr2;
            i4 = i4 + (-bArr2[i6]) + 6;
            i6 = i10 + 1;
            i8 = i9;
            bArr2 = bArr3;
        }
    }

    public static void c(char c2, int i2, String str, String str2, Object[] objArr) {
        char c3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = str.toCharArray();
        cu cuVar = new cu();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c2);
        cArr2[2] = (char) (cArr2[2] + ((char) i2));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        cuVar.component9 = 0;
        l = (m + 81) % 128;
        while (cuVar.component9 < length3) {
            l = (m + 111) % 128;
            try {
                Object[] objArr2 = {cuVar};
                Object f2 = rV4669.f(-156886158);
                if (f2 == null) {
                    c3 = 1;
                    f2 = rV4669.g(3473 - TextUtils.getOffsetBefore("", 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 52 - View.resolveSize(0, 0), 2130888214, a(12, -1), new Class[]{Object.class});
                } else {
                    c3 = 1;
                }
                int intValue = ((Integer) ((Method) f2).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {cuVar};
                Object f3 = rV4669.f(-671190211);
                if (f3 == null) {
                    f3 = rV4669.g(1937 - (KeyEvent.getMaxKeyCode() >> 16), (char) Color.green(0), 51 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1583001177, "w", new Class[]{Object.class});
                }
                int intValue2 = ((Integer) ((Method) f3).invoke(null, objArr3)).intValue();
                int i3 = cArr[cuVar.component9 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr2[intValue]);
                objArr4[c3] = Integer.valueOf(i3);
                objArr4[0] = cuVar;
                Object f4 = rV4669.f(669877551);
                Class cls = Integer.TYPE;
                if (f4 == null) {
                    f4 = rV4669.g(2196 - Drawable.resolveOpacity(0, 0), (char) (36090 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 52 - (ViewConfiguration.getLongPressTimeout() >> 16), -1370924981, "x", new Class[]{Object.class, cls, cls});
                }
                ((Method) f4).invoke(null, objArr4);
                int i4 = cArr[intValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[c3] = Integer.valueOf(cArr2[intValue]);
                objArr5[0] = Integer.valueOf(i4);
                Object f5 = rV4669.f(1085930810);
                if (f5 == null) {
                    f5 = rV4669.g(900 - Color.red(0), (char) ((Process.myTid() >> 22) + 21351), Color.argb(0, 0, 0, 0) + 59, -920838050, "D", new Class[]{cls, cls});
                }
                cArr2[intValue2] = ((Character) ((Method) f5).invoke(null, objArr5)).charValue();
                cArr[intValue2] = cuVar.vD14832N6715;
                int i5 = cuVar.component9;
                cArr3[i5] = (char) ((((r6 ^ charArray3[i5]) ^ (b ^ 543169457660631834L)) ^ ((int) (c ^ 543169457660631834L))) ^ ((char) (d ^ 543169457660631834L)));
                cuVar.component9 = i5 + 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(byte b2, int i2, int i3, int i4, short s, Object[] objArr) {
        int i5;
        int i6;
        boolean z;
        long j2;
        int i7;
        byte[] bArr;
        boolean z2;
        int length;
        byte[] bArr2;
        int i8;
        cp cpVar = new cp();
        StringBuilder sb = new StringBuilder();
        int i9 = f;
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i9)};
            int i10 = 0;
            Object f2 = rV4669.f(488204960);
            Class cls = Integer.TYPE;
            if (f2 == null) {
                f2 = rV4669.g(5098 - ExpandableListView.getPackedPositionGroup(0L), (char) (ExpandableListView.getPackedPositionType(0L) + 59615), Color.red(0) + 52, -1799505980, a(0, -1), new Class[]{cls, cls});
            }
            int intValue = ((Integer) ((Method) f2).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i11 = m + 109;
                i5 = i11 % 128;
                l = i5;
                if (i11 % 2 == 0) {
                    i6 = 488204960;
                    z = true;
                    int i12 = e;
                    byte[] bArr3 = h;
                    if (!z) {
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            bArr2 = new byte[length2];
                            j2 = 0;
                            int i13 = 0;
                            while (i13 < length2) {
                                Object[] objArr3 = {Integer.valueOf(bArr3[i13])};
                                Object f3 = rV4669.f(391024489);
                                if (f3 == null) {
                                    i8 = i10;
                                    f3 = rV4669.g(3369 - (TypedValue.complexToFraction(i10, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i10, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 52 - (ViewConfiguration.getLongPressTimeout() >> 16), -1628810739, a(1, -1), new Class[]{cls});
                                } else {
                                    i8 = i10;
                                }
                                bArr2[i13] = ((Byte) ((Method) f3).invoke(null, objArr3)).byteValue();
                                i13++;
                                i10 = i8;
                            }
                        } else {
                            j2 = 0;
                            bArr2 = bArr3;
                        }
                        int i14 = i10;
                        bArr2.getClass();
                        Object[] objArr4 = new Object[2];
                        objArr4[1] = Integer.valueOf(i12);
                        objArr4[i14] = Integer.valueOf(i4);
                        Object f4 = rV4669.f(i6);
                        if (f4 == null) {
                            f4 = rV4669.g(5098 - KeyEvent.normalizeMetaState(i14), (char) (59615 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ExpandableListView.getPackedPositionGroup(j2) + 52, -1799505980, a(i14, -1), new Class[]{cls, cls});
                        }
                        intValue = (byte) (((byte) (bArr3[((Integer) ((Method) f4).invoke(null, objArr4)).intValue()] ^ 4363125056901200887L)) + ((int) (i9 ^ 4363125056901200887L)));
                        i5 = l;
                        m = (i5 + 21) % 128;
                    } else {
                        j2 = 0;
                    }
                    if (intValue > 0) {
                        int i15 = ((i4 + intValue) - 2) + ((int) (i12 ^ 4363125056901200887L));
                        if (z) {
                            i7 = 1;
                        } else {
                            m = (i5 + 91) % 128;
                            i7 = 0;
                        }
                        cpVar.component9 = i15 + i7;
                        Object[] objArr5 = {cpVar, Integer.valueOf(i2), Integer.valueOf(g), sb};
                        Object f5 = rV4669.f(-142800716);
                        if (f5 == null) {
                            int mirror = AndroidCharacter.getMirror('0') + 5256;
                            char myTid = (char) (54908 - (Process.myTid() >> 22));
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j2) + 52;
                            byte length3 = (byte) n.length;
                            f5 = rV4669.g(mirror, myTid, packedPositionGroup, 2128205264, a(length3, (byte) (length3 - 5)), new Class[]{Object.class, cls, cls, Object.class});
                        }
                        ((StringBuilder) ((Method) f5).invoke(null, objArr5)).append(cpVar.D8871);
                        cpVar.vD14832N6715 = cpVar.D8871;
                        if (bArr3 != null) {
                            int i16 = m + 7;
                            l = i16 % 128;
                            if (i16 % 2 != 0) {
                                length = bArr3.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr3.length;
                                bArr = new byte[length];
                            }
                            for (int i17 = 0; i17 < length; i17++) {
                                bArr[i17] = (byte) (bArr3[i17] ^ 4363125056901200887L);
                            }
                        } else {
                            bArr = bArr3;
                        }
                        if (bArr != null) {
                            z2 = true;
                        } else {
                            l = (m + 123) % 128;
                            z2 = false;
                        }
                        cpVar.component5 = 1;
                        while (cpVar.component5 < intValue) {
                            int i18 = cpVar.component9;
                            if (z2) {
                                cpVar.component9 = i18 - 1;
                                char c2 = (char) (cpVar.vD14832N6715 + (((byte) (((byte) (bArr3[i18] ^ 4363125056901200887L)) + s)) ^ b2));
                                cpVar.D8871 = c2;
                                sb.append(c2);
                                cpVar.vD14832N6715 = cpVar.D8871;
                                cpVar.component5++;
                            } else {
                                cpVar.component9 = i18 - 1;
                                throw null;
                            }
                        }
                    }
                    objArr[0] = sb.toString();
                }
            } else {
                i5 = l;
                m = (i5 + 43) % 128;
            }
            i6 = 488204960;
            z = false;
            int i122 = e;
            byte[] bArr32 = h;
            if (!z) {
            }
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void e() {
        k = new byte[]{32, -31, 56, 81, -6, 5, -3};
    }

    public static void f() {
        n = new byte[]{58, 104, 54, 119};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0091. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object g(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        String str;
        int i8;
        int i9;
        int i10 = ~i5;
        int i11 = ~i7;
        int i12 = ~(i10 | i11);
        int i13 = (~((~i3) | i10)) | i12;
        int i14 = (~(i10 | i3)) | i12;
        int i15 = ~(i11 | i5);
        int i16 = ((-1146093568) * i2) + ((-1784676352) * i6) + ((-370147328) * i4) + (23337000 * i15) + (i14 * 23337000) + (i13 * 23337000) + ((-393484327) * i7) + ((i5 * (-393484327)) - 513802240);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i2, -1414784667, (104229478 * i6) + i5 + i7 + i4);
        int i17 = i15 * 872;
        int i18 = (-1692676330) * i6;
        int i19 = i2 * (-87465523);
        int c2 = com.fingerprintjs.android.fpjs_pro.g.c(a, 964034560, i19 + i18 + (256726089 * i4) + i17 + (i14 * 872) + (i13 * 872) + (i7 * 256725217) + ((i5 * 256725217) - 1927268364), -1055260672, ((-1043988480) * a) + i16);
        if (c2 != 1) {
            if (c2 != 2) {
                int intValue = ((Number) objArr[0]).intValue();
                int i20 = i;
                int i21 = (i20 + 41) % 128;
                j = i21;
                switch (intValue) {
                    case 2:
                        int i22 = ((i21 | 121) << 1) - (i21 ^ 121);
                        i20 = i22 % 128;
                        i = i20;
                        if (i22 % 2 == 0) {
                            str = "good";
                            i9 = (i20 & 87) + (i20 | 87);
                            j = i9 % 128;
                            if (i9 % 2 != 0) {
                                return str;
                            }
                            throw null;
                        }
                        throw null;
                    case 3:
                        int i23 = ((i21 | 47) << 1) - (i21 ^ 47);
                        i20 = i23 % 128;
                        i = i20;
                        if (i23 % 2 == 0) {
                            str = "overheat";
                            i9 = (i20 & 87) + (i20 | 87);
                            j = i9 % 128;
                            if (i9 % 2 != 0) {
                            }
                        } else {
                            throw null;
                        }
                        break;
                    case 4:
                        str = "dead";
                        i9 = (i20 & 87) + (i20 | 87);
                        j = i9 % 128;
                        if (i9 % 2 != 0) {
                        }
                        break;
                    case 5:
                        int i24 = (i21 ^ 19) + ((i21 & 19) << 1);
                        i20 = i24 % 128;
                        i = i20;
                        str = "over voltage";
                        if (i24 % 2 != 0) {
                            i8 = 37;
                            int i25 = i8 / 0;
                        }
                        i9 = (i20 & 87) + (i20 | 87);
                        j = i9 % 128;
                        if (i9 % 2 != 0) {
                        }
                        break;
                    case 6:
                        int i26 = (i21 & 53) + (i21 | 53);
                        i20 = i26 % 128;
                        i = i20;
                        if (i26 % 2 == 0) {
                            str = "unspecified failure";
                            i9 = (i20 & 87) + (i20 | 87);
                            j = i9 % 128;
                            if (i9 % 2 != 0) {
                            }
                        } else {
                            throw null;
                        }
                        break;
                    case 7:
                        str = "cold";
                        i9 = (i20 & 87) + (i20 | 87);
                        j = i9 % 128;
                        if (i9 % 2 != 0) {
                        }
                        break;
                    default:
                        int i27 = i20 + HttpStatusCodesKt.HTTP_EARLY_HINTS;
                        j = i27 % 128;
                        str = "unknown";
                        if (i27 % 2 == 0) {
                            i8 = 44;
                            int i252 = i8 / 0;
                        }
                        i9 = (i20 & 87) + (i20 | 87);
                        j = i9 % 128;
                        if (i9 % 2 != 0) {
                        }
                        break;
                }
            } else {
                try {
                    Object[] objArr2 = {0L, r5, r5, new f((i) objArr[0]), 7, null};
                    Boolean bool = Boolean.FALSE;
                    Object f2 = rV4669.f(-308176489);
                    Object obj = "";
                    if (f2 == null) {
                        int i28 = 1527 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int scrollBarSize = 51 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Class cls = Long.TYPE;
                        Class cls2 = Boolean.TYPE;
                        f2 = rV4669.g(i28, lastIndexOf, scrollBarSize, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
                    }
                    Object invoke = ((Method) f2).invoke(null, objArr2);
                    Result.Companion companion = Result.INSTANCE;
                    if (invoke instanceof r5g) {
                        i = (j + 35) % 128;
                    } else {
                        obj = invoke;
                    }
                    String str2 = (String) obj;
                    int i29 = j;
                    i = ((i29 & 71) + (i29 | 71)) % 128;
                    return str2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } else {
            i iVar = (i) objArr[0];
            int i30 = j + 51;
            i = i30 % 128;
            int i31 = i30 % 2;
            Context context = iVar.a;
            if (i31 == 0) {
                return context;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1ae5, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x1a44, code lost:
    
        r29 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x1b03, code lost:
    
        if (r2 < 25.2d) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x1b05, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.i.i;
        com.fingerprintjs.android.fpjs_pro_internal.i.j = ((r0 ^ 1) + ((r0 & 1) << 1)) % 128;
        r0 = new java.lang.Object[]{r2, r4, null, r5};
        r5 = new int[]{r86};
        r2 = new int[]{r86 ^ 261};
        r1 = com.fingerprintjs.android.fpjs_pro.g.b((~(r86 | 1260910480)) | ((~((-26163154) | r3)) | (~(26163153 | r86))), 831, ((~((-1243660289) | r86)) * (-1662)) + ((((~((-1260910481) | r3)) | (~(1269823441 | r86))) * (-831)) + 864918626), -1390769612);
        r2 = r1 << 13;
        r1 = (r1 | r2) & (~(r1 & r2));
        r2 = r1 >>> 17;
        r1 = ((~r1) & r2) | ((~r2) & r1);
        r2 = r1 << 5;
        r4 = new int[]{((~r1) & r2) | ((~r2) & r1)};
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1b7a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x199f, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 477111747) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x2660, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x328d, code lost:
    
        r0 = r2[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x3291, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x3296, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x32a3, code lost:
    
        if (r5 == null) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x05ae, code lost:
    
        if ((r0 | (((int) r2) & defpackage.k84.a(~(r3 | (-1375813638)), -1504, (((~(31362266 | r3)) | (-1407175904)) * 1504) + 1320243365, 511180208))) != 477111747) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0891, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0a19, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0a1c, code lost:
    
        r54 = 2124614715 - (~(-(-android.text.TextUtils.lastIndexOf("", '0', 0))));
        r0 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r55 = ((r0 | (-91)) << 1) - (r0 ^ (-91));
        r56 = (-1557879829) - android.text.TextUtils.lastIndexOf("", '0', 0);
        r0 = -android.graphics.Color.rgb(0, 0, 0);
        r2 = android.widget.ExpandableListView.getPackedPositionType(0);
        r3 = new java.lang.Object[1];
        d((byte) ((r0 & (-16777240)) + (r0 | (-16777240))), r54, r55, r56, (short) (((r2 | (-29)) << 1) - (r2 ^ (-29))), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0893, code lost:
    
        r0 = -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
        r53 = (r0 ^ 2124614647) + ((r0 & 2124614647) << 1);
        r54 = (-91) - (~(-(-android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0))));
        r0 = android.text.TextUtils.indexOf("", "");
        r2 = (r0 * 905) - 1983763120;
        r3 = ~r0;
        r4 = ~((r3 ^ r86) | (r3 & r86));
        r6 = ~((r7 ^ (-1557879856)) | (r7 & (-1557879856)));
        r4 = -(-(((r4 & r6) | (r4 ^ r6)) * (-1808)));
        r6 = (r2 & r4) + (r2 | r4);
        r4 = r3 | 1557879855;
        r4 = ~((r4 & r86) | (r4 ^ r86));
        r14 = r7 | r0;
        r14 = ~((r14 ^ (-1557879856)) | (r14 & (-1557879856)));
        r3 = ~((r3 & (-1557879856)) | (r3 ^ (-1557879856)));
        r2 = ~(1557879855 | r86);
        r2 = (r2 & r3) | (r3 ^ r2);
        r0 = ~((r0 & r7) | (r7 ^ r0));
        r55 = (((((r4 ^ r14) | (r4 & r14)) * 904) + r6) - (~(-(-(((r0 & r2) | (r2 ^ r0)) * 904))))) - 1;
        r0 = (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1));
        r2 = -android.view.KeyEvent.getDeadChar(0, 0);
        r3 = new java.lang.Object[1];
        d((byte) ((r0 & (-5)) + (r0 | (-5))), r53, r54, r55, (short) ((r2 & (-47)) + (r2 | (-47))), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0a6c, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-417469134);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0a74, code lost:
    
        if (r2 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0a76, code lost:
    
        r2 = 6202 - android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        r3 = (char) android.text.TextUtils.getOffsetAfter("", 0);
        r55 = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 51;
        r5 = new java.lang.Object[1];
        b((byte) (-r11[6]), 1, 0, r5);
        r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r2, r3, r55, 1857630294, (java.lang.String) r5[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0aa9, code lost:
    
        r0 = ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0ab0, code lost:
    
        r2 = -android.graphics.Color.blue(0);
        r3 = r2 * (-1975);
        r5 = (r3 ^ 43286552) + ((r3 & 43286552) << 1);
        r3 = ~r2;
        r3 = ~((r3 & 43768) | (r3 ^ 43768));
        r2 = (((~((r2 & r7) | (r7 ^ r2))) | (~(((-43769) & r2) | ((-43769) ^ r2)))) * (-1976)) + ((((r86 ^ r3) | (r86 & r3)) * 988) + r5);
        r3 = r3 | (~(((-43769) & r86) | ((-43769) ^ r86)));
        r4 = ~((43768 & r7) | (r7 ^ 43768));
        r3 = -(-(((r3 & r4) | (r3 ^ r4)) * 988));
        r2 = (char) (((r2 | r3) << 1) - (r2 ^ r3));
        r3 = -(-android.widget.ExpandableListView.getPackedPositionType(0));
        r5 = (r3 & 1230268090) + (r3 | 1230268090);
        r3 = new java.lang.Object[1];
        c(r2, r5, "䛠", "몠呦\uf849ꖪ", r3);
        r0 = r0.equals((java.lang.String) r3[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0931, code lost:
    
        r0 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-668483483);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0690, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 477111747) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0939, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0793, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != (-1032769152)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0888, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 542074309) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x093b, code lost:
    
        r2 = 6046 - (android.view.ViewConfiguration.getTapTimeout() >> 16);
        r3 = (char) (1 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)));
        r55 = 52 - (android.os.Process.myTid() >> 22);
        r4 = new java.lang.Object[1];
        b((byte) 1, 0, 1, r4);
        r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r2, r3, r55, 1367547137, (java.lang.String) r4[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0970, code lost:
    
        r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r0)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x097d, code lost:
    
        r4 = ((-107) * r2) + 91845618975L;
        r46 = ((-1669920346) | r2) ^ (-1);
        r2 = android.os.Process.myUid();
        r55 = r2 ^ (-1);
        r44 = ((r2 ^ (-1)) | 1669920345) ^ (-1);
        r2 = com.fingerprintjs.android.fpjs_pro.g.e(54, r2 | r44, ((((((-1669920346) | r2) ^ (-1)) | r44) | ((r55 | 1669920345) ^ (-1))) * 54) + (((-108) * (r46 | ((r55 | r2) ^ (-1)))) + r4), 269629662);
        r0 = ((int) (r2 >> 32)) & (((~((-1437608641) | r86)) * 283) + ((((~((-1609575107) | r86)) | 171966466) * (-283)) - 1435871264));
        r2 = ((int) r2) & (((((~((-187805117) | r86)) | 186756248) | (~((-1623982659) | r7))) * 988) + ((((~((-1048869) | r7)) | (~((-1623982659) | r86))) * 988) - 482184691));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0a0c, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0a0e, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.i.j = (com.fingerprintjs.android.fpjs_pro_internal.i.i + 25) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0b23, code lost:
    
        if (r0 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b25, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.i.i = (com.fingerprintjs.android.fpjs_pro_internal.i.j + 59) % 128;
        r0 = new java.lang.Object[]{r2, new int[1], null, r3};
        r3 = new int[]{r86};
        r2 = new int[]{(~(r86 & 260)) & (r86 | 260)};
        r1 = android.os.Process.myPid();
        r1 = ((r1 | 131104406) * 104) + (((~((~r1) | 1207369439)) * (-104)) + ((((~((-1155969228) | r1)) | 79704194) * 104) + 575401977));
        r2 = (r1 & 16) + (r1 | 16);
        r1 = (r2 ^ 1390769596) + ((r2 & 1390769596) << 1);
        r2 = r1 << 13;
        r1 = ((~r1) & r2) | ((~r2) & r1);
        r2 = r1 >>> 17;
        r1 = (r1 | r2) & (~(r1 & r2));
        ((int[]) r0[1])[0] = r1 ^ (r1 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0b9b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x18d6, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 477111747) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x19a1, code lost:
    
        r0 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x19a5, code lost:
    
        if (r0 >= 28) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x19a7, code lost:
    
        r4 = r44[r0];
        r5 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)));
        r54 = (r5 ^ 2124614647) + ((r5 & 2124614647) << 1);
        r5 = -android.text.TextUtils.indexOf("", "");
        r55 = (r5 & (-91)) + (r5 | (-91));
        r5 = -android.view.View.MeasureSpec.getSize(0);
        r56 = (r5 & (-1557879675)) + (r5 | (-1557879675));
        r5 = -android.view.MotionEvent.axisFromString("");
        r7 = new java.lang.Object[1];
        d((byte) ((r5 ^ 51) + ((r5 & 51) << 1)), r54, r55, r56, (short) (93 - android.graphics.Color.green(0)), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x1a02, code lost:
    
        r4 = new java.lang.Object[]{((java.lang.String) r7[0]).concat(java.lang.String.valueOf(r4))};
        r5 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-668483483);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x1a0a, code lost:
    
        if (r5 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x1a0c, code lost:
    
        r5 = 6046 - (android.view.ViewConfiguration.getTapTimeout() >> 16);
        r6 = (char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0));
        r55 = 53 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        r29 = r0;
        r0 = new java.lang.Object[1];
        b((byte) 1, 0, 1, r0);
        r5 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r5, r6, r55, 1367547137, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x1a46, code lost:
    
        r4 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r4)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x1a53, code lost:
    
        r45 = ((-50) * (1273617983 | r12)) + (((-49) * r4) + 64954517133L);
        r4 = r4 ^ (-1);
        r53 = r12 ^ (-1);
        r55 = r4 | r53;
        r4 = com.fingerprintjs.android.fpjs_pro.g.e(50, (((r4 | 1273617983) ^ (-1)) | (r55 ^ (-1))) | ((r53 | 1273617983) ^ (-1)), ((((((-1273617984) | r4) | r12) ^ (-1)) | ((r55 | 1273617983) ^ (-1))) * 50) + r45, 665932024);
        r0 = ((int) (r4 >> 32)) & (((((~((-691893191) | r3)) | 673997252) | (~(763229158 | r86))) * 757) + (((~((-17895939) | r86)) * 1514) + (((745333220 | r3) * (-757)) - 1058343840)));
        r5 = (~((-276523903) | r3)) | 274344534;
        r4 = ((int) r4) & ((((~((-1711570945) | r86)) | (~((-2179369) | r3))) * 252) + (((r5 | r6) * (-252)) - 1021880579));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x1ae1, code lost:
    
        if (((r0 & r4) | (r0 ^ r4)) != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x1ae3, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1ae6, code lost:
    
        r2 = (r2 ^ r0) + ((r0 & r2) << 1);
        r0 = ((r29 & (-73)) + (r29 | (-73))) + 74;
        com.fingerprintjs.android.fpjs_pro.u.component9();
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1bce A[Catch: all -> 0x4467, TryCatch #0 {all -> 0x4467, blocks: (B:3:0x000b, B:5:0x0016, B:6:0x003f, B:13:0x0185, B:16:0x019a, B:17:0x01d0, B:21:0x02cf, B:23:0x02db, B:24:0x030f, B:28:0x040c, B:30:0x0416, B:31:0x044d, B:33:0x0478, B:35:0x0482, B:36:0x04c1, B:38:0x04ca, B:40:0x04db, B:41:0x050c, B:47:0x0931, B:49:0x093b, B:50:0x0970, B:58:0x1479, B:60:0x1483, B:61:0x14bc, B:64:0x1583, B:66:0x158f, B:67:0x15c1, B:71:0x16e5, B:73:0x16ef, B:74:0x1724, B:76:0x179c, B:78:0x17a6, B:79:0x17e4, B:81:0x17ed, B:83:0x17fe, B:84:0x1831, B:91:0x1a02, B:93:0x1a0c, B:94:0x1a46, B:110:0x18de, B:112:0x18ee, B:113:0x191d, B:119:0x1bc1, B:121:0x1bce, B:122:0x1c02, B:124:0x1d07, B:126:0x1d14, B:127:0x1d4a, B:137:0x1e9a, B:139:0x1ea7, B:140:0x1edc, B:142:0x2032, B:144:0x203f, B:145:0x2070, B:158:0x2300, B:160:0x230d, B:161:0x2345, B:195:0x2944, B:197:0x294e, B:198:0x2981, B:201:0x2a2e, B:203:0x2a3a, B:204:0x2a6a, B:211:0x2e54, B:213:0x2e5e, B:214:0x2e8d, B:226:0x3021, B:228:0x3045, B:229:0x307b, B:261:0x3327, B:263:0x332d, B:264:0x3362, B:273:0x3a28, B:275:0x3a39, B:276:0x3a6e, B:282:0x3b69, B:284:0x3b6f, B:285:0x3ba8, B:291:0x3cf7, B:293:0x3d1c, B:294:0x3d50, B:300:0x3eaa, B:302:0x3eb4, B:303:0x3ee7, B:309:0x4013, B:311:0x4019, B:312:0x404c, B:318:0x4181, B:320:0x4187, B:321:0x41b9, B:327:0x42e4, B:329:0x430e, B:330:0x4351, B:344:0x3494, B:346:0x349a, B:347:0x34d5, B:355:0x35ee, B:357:0x35f4, B:358:0x3629, B:363:0x371d, B:365:0x3723, B:366:0x3759, B:371:0x386a, B:373:0x3870, B:374:0x38a4, B:470:0x0a6c, B:472:0x0a76, B:473:0x0aa9, B:477:0x05b6, B:479:0x05c5, B:480:0x05f4, B:485:0x0695, B:487:0x06a4, B:488:0x06d8, B:493:0x0798, B:495:0x07a7, B:496:0x07d9), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1d14 A[Catch: all -> 0x4467, TryCatch #0 {all -> 0x4467, blocks: (B:3:0x000b, B:5:0x0016, B:6:0x003f, B:13:0x0185, B:16:0x019a, B:17:0x01d0, B:21:0x02cf, B:23:0x02db, B:24:0x030f, B:28:0x040c, B:30:0x0416, B:31:0x044d, B:33:0x0478, B:35:0x0482, B:36:0x04c1, B:38:0x04ca, B:40:0x04db, B:41:0x050c, B:47:0x0931, B:49:0x093b, B:50:0x0970, B:58:0x1479, B:60:0x1483, B:61:0x14bc, B:64:0x1583, B:66:0x158f, B:67:0x15c1, B:71:0x16e5, B:73:0x16ef, B:74:0x1724, B:76:0x179c, B:78:0x17a6, B:79:0x17e4, B:81:0x17ed, B:83:0x17fe, B:84:0x1831, B:91:0x1a02, B:93:0x1a0c, B:94:0x1a46, B:110:0x18de, B:112:0x18ee, B:113:0x191d, B:119:0x1bc1, B:121:0x1bce, B:122:0x1c02, B:124:0x1d07, B:126:0x1d14, B:127:0x1d4a, B:137:0x1e9a, B:139:0x1ea7, B:140:0x1edc, B:142:0x2032, B:144:0x203f, B:145:0x2070, B:158:0x2300, B:160:0x230d, B:161:0x2345, B:195:0x2944, B:197:0x294e, B:198:0x2981, B:201:0x2a2e, B:203:0x2a3a, B:204:0x2a6a, B:211:0x2e54, B:213:0x2e5e, B:214:0x2e8d, B:226:0x3021, B:228:0x3045, B:229:0x307b, B:261:0x3327, B:263:0x332d, B:264:0x3362, B:273:0x3a28, B:275:0x3a39, B:276:0x3a6e, B:282:0x3b69, B:284:0x3b6f, B:285:0x3ba8, B:291:0x3cf7, B:293:0x3d1c, B:294:0x3d50, B:300:0x3eaa, B:302:0x3eb4, B:303:0x3ee7, B:309:0x4013, B:311:0x4019, B:312:0x404c, B:318:0x4181, B:320:0x4187, B:321:0x41b9, B:327:0x42e4, B:329:0x430e, B:330:0x4351, B:344:0x3494, B:346:0x349a, B:347:0x34d5, B:355:0x35ee, B:357:0x35f4, B:358:0x3629, B:363:0x371d, B:365:0x3723, B:366:0x3759, B:371:0x386a, B:373:0x3870, B:374:0x38a4, B:470:0x0a6c, B:472:0x0a76, B:473:0x0aa9, B:477:0x05b6, B:479:0x05c5, B:480:0x05f4, B:485:0x0695, B:487:0x06a4, B:488:0x06d8, B:493:0x0798, B:495:0x07a7, B:496:0x07d9), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x1ea7 A[Catch: all -> 0x4467, TryCatch #0 {all -> 0x4467, blocks: (B:3:0x000b, B:5:0x0016, B:6:0x003f, B:13:0x0185, B:16:0x019a, B:17:0x01d0, B:21:0x02cf, B:23:0x02db, B:24:0x030f, B:28:0x040c, B:30:0x0416, B:31:0x044d, B:33:0x0478, B:35:0x0482, B:36:0x04c1, B:38:0x04ca, B:40:0x04db, B:41:0x050c, B:47:0x0931, B:49:0x093b, B:50:0x0970, B:58:0x1479, B:60:0x1483, B:61:0x14bc, B:64:0x1583, B:66:0x158f, B:67:0x15c1, B:71:0x16e5, B:73:0x16ef, B:74:0x1724, B:76:0x179c, B:78:0x17a6, B:79:0x17e4, B:81:0x17ed, B:83:0x17fe, B:84:0x1831, B:91:0x1a02, B:93:0x1a0c, B:94:0x1a46, B:110:0x18de, B:112:0x18ee, B:113:0x191d, B:119:0x1bc1, B:121:0x1bce, B:122:0x1c02, B:124:0x1d07, B:126:0x1d14, B:127:0x1d4a, B:137:0x1e9a, B:139:0x1ea7, B:140:0x1edc, B:142:0x2032, B:144:0x203f, B:145:0x2070, B:158:0x2300, B:160:0x230d, B:161:0x2345, B:195:0x2944, B:197:0x294e, B:198:0x2981, B:201:0x2a2e, B:203:0x2a3a, B:204:0x2a6a, B:211:0x2e54, B:213:0x2e5e, B:214:0x2e8d, B:226:0x3021, B:228:0x3045, B:229:0x307b, B:261:0x3327, B:263:0x332d, B:264:0x3362, B:273:0x3a28, B:275:0x3a39, B:276:0x3a6e, B:282:0x3b69, B:284:0x3b6f, B:285:0x3ba8, B:291:0x3cf7, B:293:0x3d1c, B:294:0x3d50, B:300:0x3eaa, B:302:0x3eb4, B:303:0x3ee7, B:309:0x4013, B:311:0x4019, B:312:0x404c, B:318:0x4181, B:320:0x4187, B:321:0x41b9, B:327:0x42e4, B:329:0x430e, B:330:0x4351, B:344:0x3494, B:346:0x349a, B:347:0x34d5, B:355:0x35ee, B:357:0x35f4, B:358:0x3629, B:363:0x371d, B:365:0x3723, B:366:0x3759, B:371:0x386a, B:373:0x3870, B:374:0x38a4, B:470:0x0a6c, B:472:0x0a76, B:473:0x0aa9, B:477:0x05b6, B:479:0x05c5, B:480:0x05f4, B:485:0x0695, B:487:0x06a4, B:488:0x06d8, B:493:0x0798, B:495:0x07a7, B:496:0x07d9), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x203f A[Catch: all -> 0x4467, TryCatch #0 {all -> 0x4467, blocks: (B:3:0x000b, B:5:0x0016, B:6:0x003f, B:13:0x0185, B:16:0x019a, B:17:0x01d0, B:21:0x02cf, B:23:0x02db, B:24:0x030f, B:28:0x040c, B:30:0x0416, B:31:0x044d, B:33:0x0478, B:35:0x0482, B:36:0x04c1, B:38:0x04ca, B:40:0x04db, B:41:0x050c, B:47:0x0931, B:49:0x093b, B:50:0x0970, B:58:0x1479, B:60:0x1483, B:61:0x14bc, B:64:0x1583, B:66:0x158f, B:67:0x15c1, B:71:0x16e5, B:73:0x16ef, B:74:0x1724, B:76:0x179c, B:78:0x17a6, B:79:0x17e4, B:81:0x17ed, B:83:0x17fe, B:84:0x1831, B:91:0x1a02, B:93:0x1a0c, B:94:0x1a46, B:110:0x18de, B:112:0x18ee, B:113:0x191d, B:119:0x1bc1, B:121:0x1bce, B:122:0x1c02, B:124:0x1d07, B:126:0x1d14, B:127:0x1d4a, B:137:0x1e9a, B:139:0x1ea7, B:140:0x1edc, B:142:0x2032, B:144:0x203f, B:145:0x2070, B:158:0x2300, B:160:0x230d, B:161:0x2345, B:195:0x2944, B:197:0x294e, B:198:0x2981, B:201:0x2a2e, B:203:0x2a3a, B:204:0x2a6a, B:211:0x2e54, B:213:0x2e5e, B:214:0x2e8d, B:226:0x3021, B:228:0x3045, B:229:0x307b, B:261:0x3327, B:263:0x332d, B:264:0x3362, B:273:0x3a28, B:275:0x3a39, B:276:0x3a6e, B:282:0x3b69, B:284:0x3b6f, B:285:0x3ba8, B:291:0x3cf7, B:293:0x3d1c, B:294:0x3d50, B:300:0x3eaa, B:302:0x3eb4, B:303:0x3ee7, B:309:0x4013, B:311:0x4019, B:312:0x404c, B:318:0x4181, B:320:0x4187, B:321:0x41b9, B:327:0x42e4, B:329:0x430e, B:330:0x4351, B:344:0x3494, B:346:0x349a, B:347:0x34d5, B:355:0x35ee, B:357:0x35f4, B:358:0x3629, B:363:0x371d, B:365:0x3723, B:366:0x3759, B:371:0x386a, B:373:0x3870, B:374:0x38a4, B:470:0x0a6c, B:472:0x0a76, B:473:0x0aa9, B:477:0x05b6, B:479:0x05c5, B:480:0x05f4, B:485:0x0695, B:487:0x06a4, B:488:0x06d8, B:493:0x0798, B:495:0x07a7, B:496:0x07d9), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x22f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x23e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x2458  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x2841  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x28b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x2f51  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x2fc8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x32a9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x3322  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x3a25 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x3a26  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x23e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x14ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x1483 A[Catch: all -> 0x4467, TryCatch #0 {all -> 0x4467, blocks: (B:3:0x000b, B:5:0x0016, B:6:0x003f, B:13:0x0185, B:16:0x019a, B:17:0x01d0, B:21:0x02cf, B:23:0x02db, B:24:0x030f, B:28:0x040c, B:30:0x0416, B:31:0x044d, B:33:0x0478, B:35:0x0482, B:36:0x04c1, B:38:0x04ca, B:40:0x04db, B:41:0x050c, B:47:0x0931, B:49:0x093b, B:50:0x0970, B:58:0x1479, B:60:0x1483, B:61:0x14bc, B:64:0x1583, B:66:0x158f, B:67:0x15c1, B:71:0x16e5, B:73:0x16ef, B:74:0x1724, B:76:0x179c, B:78:0x17a6, B:79:0x17e4, B:81:0x17ed, B:83:0x17fe, B:84:0x1831, B:91:0x1a02, B:93:0x1a0c, B:94:0x1a46, B:110:0x18de, B:112:0x18ee, B:113:0x191d, B:119:0x1bc1, B:121:0x1bce, B:122:0x1c02, B:124:0x1d07, B:126:0x1d14, B:127:0x1d4a, B:137:0x1e9a, B:139:0x1ea7, B:140:0x1edc, B:142:0x2032, B:144:0x203f, B:145:0x2070, B:158:0x2300, B:160:0x230d, B:161:0x2345, B:195:0x2944, B:197:0x294e, B:198:0x2981, B:201:0x2a2e, B:203:0x2a3a, B:204:0x2a6a, B:211:0x2e54, B:213:0x2e5e, B:214:0x2e8d, B:226:0x3021, B:228:0x3045, B:229:0x307b, B:261:0x3327, B:263:0x332d, B:264:0x3362, B:273:0x3a28, B:275:0x3a39, B:276:0x3a6e, B:282:0x3b69, B:284:0x3b6f, B:285:0x3ba8, B:291:0x3cf7, B:293:0x3d1c, B:294:0x3d50, B:300:0x3eaa, B:302:0x3eb4, B:303:0x3ee7, B:309:0x4013, B:311:0x4019, B:312:0x404c, B:318:0x4181, B:320:0x4187, B:321:0x41b9, B:327:0x42e4, B:329:0x430e, B:330:0x4351, B:344:0x3494, B:346:0x349a, B:347:0x34d5, B:355:0x35ee, B:357:0x35f4, B:358:0x3629, B:363:0x371d, B:365:0x3723, B:366:0x3759, B:371:0x386a, B:373:0x3870, B:374:0x38a4, B:470:0x0a6c, B:472:0x0a76, B:473:0x0aa9, B:477:0x05b6, B:479:0x05c5, B:480:0x05f4, B:485:0x0695, B:487:0x06a4, B:488:0x06d8, B:493:0x0798, B:495:0x07a7, B:496:0x07d9), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x14c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] h(int i2, Object obj) {
        int i3;
        Integer num;
        int i4;
        Object f2;
        String[] strArr;
        Object invoke;
        Object f3;
        long a;
        Object f4;
        long j2;
        Object f5;
        long j3;
        Object f6;
        String[] strArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i9;
        Object[] objArr;
        char c2;
        char c3;
        long j4;
        Object invoke2;
        int parseInt;
        String[] strArr3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        try {
            Object f7 = rV4669.f(-1684260689);
            if (f7 == null) {
                int threadPriority = 2663 - ((Process.getThreadPriority(0) + 20) >> 6);
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int pressedStateDuration = 52 - (ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr2 = new Object[1];
                b((byte) 1, 0, 1, objArr2);
                f7 = rV4669.g(threadPriority, scrollDefaultDelay, pressedStateDuration, 305718731, (String) objArr2[0], new Class[0]);
            }
            long longValue = ((Long) ((Method) f7).invoke(null, null)).longValue();
            long j5 = longValue ^ (-1);
            long j6 = i2;
            long j7 = (longValue | j6) ^ (-1);
            long e2 = com.fingerprintjs.android.fpjs_pro.g.e(196L, (((-336974408) | j5) ^ (-1)) | j7, (392 * (336974407 | longValue)) + ((-196) * (((j5 | 336974407) ^ (-1)) | j7)) + (((-195) * longValue) - 131756993137L), -1624187195L);
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            int i10 = ((int) (e2 >> 32)) & ((((~(maxMemory | 54131641)) | (-1491358053)) * 318) + ((2117920 | (~((-54131642) | maxMemory))) * (-318)) + ((((~((-1489240133) | maxMemory)) | (~((~maxMemory) | (-52013722)))) * (-318)) - 1018289938));
            int myPid = Process.myPid();
            int i11 = ((1378455873 | myPid) * 614) - 1695151045;
            int i12 = ~myPid;
            int i13 = ((int) e2) & ((((~(i12 | (-29385269))) | (~(1407841141 | i12))) * 614) + (((~(334094900 | i12)) | 1073746241 | (~((-1103131510) | i12))) * (-1228)) + i11);
            if (((i13 & i10) | (i10 ^ i13)) != 0) {
                Object[] objArr3 = {r2, r3, null, r4};
                int[] iArr = {i2};
                int[] iArr2 = {(~(i2 & 271)) & (i2 | 271)};
                int i14 = (~((-957983460) | i2)) | 286883938;
                int i15 = ~i2;
                int a2 = k84.a(~(i15 | 329090174), 886, (((~(i15 | 957983459)) | 329090174) * (-1772)) + ((i14 | (~(1000189695 | i15))) * 886) + 1949489639, 1390769612);
                int i16 = a2 << 13;
                int i17 = ((~a2) & i16) | ((~i16) & a2);
                int i18 = i17 ^ (i17 >>> 17);
                int i19 = i18 << 5;
                int[] iArr3 = {(i18 | i19) & (~(i18 & i19))};
                return objArr3;
            }
            char c4 = (char) (0 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
            int blue = Color.blue(0);
            Object[] objArr4 = new Object[1];
            c(c4, (blue ^ 1138672067) + ((blue & 1138672067) << 1), "\uf3bb숌\udf84豈徠᱿䱒잭믢⒑컭", "쌗\udec1핃霵", objArr4);
            Object[] objArr5 = {(String) objArr4[0]};
            Object f8 = rV4669.f(-417469134);
            byte[] bArr = k;
            if (f8 == null) {
                int mirror = 6250 - AndroidCharacter.getMirror('0');
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int fadingEdgeLength = 51 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                i3 = 16;
                Object[] objArr6 = new Object[1];
                b((byte) (-bArr[6]), 1, 0, objArr6);
                f8 = rV4669.g(mirror, defaultSize, fadingEdgeLength, 1857630294, (String) objArr6[0], new Class[]{String.class});
            } else {
                i3 = 16;
            }
            Object invoke3 = ((Method) f8).invoke(null, objArr5);
            Class cls = Integer.TYPE;
            if (invoke3 != null) {
                int i20 = 2124614714 - (~(-TextUtils.getOffsetBefore("", 0)));
                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                int i21 = (((jumpTapTimeout * (-494)) + 44954) - (~(-(-((~((jumpTapTimeout ^ (-91)) | (jumpTapTimeout & (-91)))) * (-495)))))) - 1;
                int i22 = ~i2;
                int i23 = (((~((~jumpTapTimeout) | 90)) | (~((jumpTapTimeout ^ i22) | (jumpTapTimeout & i22)))) * 495) + ((i21 - (~(r14 * 495))) - 1);
                int myTid = Process.myTid() >> 22;
                int i24 = (myTid & (-1557879893)) + (myTid | (-1557879893));
                int i25 = -TextUtils.indexOf("", "", 0, 0);
                Object[] objArr7 = new Object[1];
                d((byte) ((i25 & (-10)) + (i25 | (-10))), i20, i23, i24, (short) ((-119) - (~(-(-(Process.myPid() >> 22))))), objArr7);
                String str = (String) objArr7[0];
                int i26 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i27 = (i26 & 2124614705) + (i26 | 2124614705);
                int i28 = -(-Color.red(0));
                int i29 = (i28 & (-91)) + (i28 | (-91));
                int i30 = -(-TextUtils.indexOf("", "", 0, 0));
                int i31 = (i30 & (-1557879887)) + (i30 | (-1557879887));
                int i32 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)));
                int i33 = -Color.green(0);
                Object[] objArr8 = new Object[1];
                d((byte) (((i32 | (-29)) << 1) - (i32 ^ (-29))), i27, i29, i31, (short) ((i33 ^ (-89)) + ((i33 & (-89)) << 1)), objArr8);
                Object[] objArr9 = {invoke3, new String[]{str, (String) objArr8[0]}};
                Object f9 = rV4669.f(-41701482);
                if (f9 == null) {
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 5477;
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i34 = 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    Object[] objArr10 = new Object[1];
                    b((byte) 1, 0, 1, objArr10);
                    f9 = rV4669.g(jumpTapTimeout2, keyRepeatDelay, i34, 1948742386, (String) objArr10[0], new Class[]{String.class, String[].class});
                }
                long longValue2 = ((Long) ((Method) f9).invoke(null, objArr9)).longValue();
                long j8 = longValue2 ^ (-1);
                long j9 = j6 ^ (-1);
                long e3 = com.fingerprintjs.android.fpjs_pro.g.e(45L, ((937508664 | j6) ^ (-1)) | j8 | ((j9 | (-937508665)) ^ (-1)), ((-45) * (((j8 | j6) ^ (-1)) | (((-937508665) | longValue2) ^ (-1)))) + ((-90) * ((-937508665) | ((j8 | j9) ^ (-1)))) + ((46 * longValue2) - 43125398590L), 1235351856L);
                int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i35 = ((int) (e3 >> 32)) & ((((~(maxMemory2 | (-1158152449))) | 279021650) * 366) + (((~((-1158178605) | maxMemory2)) | 279047806) * (-366)) + 1446799506);
                int i36 = ((int) e3) & ((((~((-97597318) | i22)) | 22086917) * 983) + (((~(1534823727 | i22)) | (-97597318)) * (-983)) + 1172254872);
                if (((i36 & i35) | (i35 ^ i36)) != 0) {
                    int i37 = i;
                    j = ((i37 & 107) + (i37 | 107)) % 128;
                    int i38 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    int i39 = (i38 ^ 2124614716) + ((i38 & 2124614716) << 1);
                    int i40 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int i41 = ((i40 | (-91)) << 1) - (i40 ^ (-91));
                    int i42 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i43 = (i42 & (-1557879880)) + (i42 | (-1557879880));
                    byte b2 = (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 60);
                    int i44 = -(-MotionEvent.axisFromString(""));
                    Object[] objArr11 = new Object[1];
                    d(b2, i39, i41, i43, (short) (((i44 | 49) << 1) - (i44 ^ 49)), objArr11);
                    Object[] objArr12 = {(String) objArr11[0]};
                    Object f10 = rV4669.f(-417469134);
                    if (f10 == null) {
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 6202;
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int maximumDrawingCacheSize = 51 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Object[] objArr13 = new Object[1];
                        b((byte) (-bArr[6]), 1, 0, objArr13);
                        f10 = rV4669.g(pressedStateDuration2, keyRepeatDelay2, maximumDrawingCacheSize, 1857630294, (String) objArr13[0], new Class[]{String.class});
                    }
                    Object invoke4 = ((Method) f10).invoke(null, objArr12);
                    Object[] objArr14 = new Object[1];
                    c((char) (62998 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), ViewConfiguration.getTouchSlop() >> 8, "涺⛦偩꠆ᦒ䢭╚牃ᛦ襇㝊ᗊ틔\uf8b7\uf29dꭋ릪䜇臑媝䑽ꐘ\ue502쏛ᐷ\uea72쩣뛍䑑鱤", "듑標ᜓ쏶", objArr14);
                    Object[] objArr15 = {(String) objArr14[0]};
                    Object f11 = rV4669.f(-417469134);
                    if (f11 == null) {
                        int indexOf = 6201 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char myPid2 = (char) (Process.myPid() >> 22);
                        int modifierMetaStateMask = 50 - ((byte) KeyEvent.getModifierMetaStateMask());
                        num = 42;
                        Object[] objArr16 = new Object[1];
                        obj4 = invoke4;
                        b((byte) (-bArr[6]), 1, 0, objArr16);
                        f11 = rV4669.g(indexOf, myPid2, modifierMetaStateMask, 1857630294, (String) objArr16[0], new Class[]{String.class});
                    } else {
                        num = 42;
                        obj4 = invoke4;
                    }
                    Object invoke5 = ((Method) f11).invoke(null, objArr15);
                    if (obj4 != null) {
                        Object[] objArr17 = {obj4, num};
                        Object f12 = rV4669.f(10827986);
                        if (f12 == null) {
                            int gidForName = 5149 - Process.getGidForName("");
                            char c5 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int blue2 = Color.blue(0) + 52;
                            Object[] objArr18 = new Object[1];
                            b((byte) 1, 0, 1, objArr18);
                            f12 = rV4669.g(gidForName, c5, blue2, -1996364362, (String) objArr18[0], new Class[]{String.class, cls});
                        }
                        long longValue3 = ((Long) ((Method) f12).invoke(null, objArr17)).longValue();
                        long j10 = longValue3 ^ (-1);
                        long j11 = 1685270666 | j10;
                        long e4 = com.fingerprintjs.android.fpjs_pro.g.e(765L, ((1685270666 | j6) ^ (-1)) | (((j10 | j9) | (-1685270667)) ^ (-1)), (1530 * ((j11 ^ (-1)) | ((1685270666 | j9) ^ (-1)))) + ((((j11 | j9) ^ (-1)) | (((1685270666 | longValue3) | j6) ^ (-1)) | (((j10 | (-1685270667)) | j6) ^ (-1))) * 765) + ((-764) * longValue3) + 2576778849843L, 1802380571L);
                        obj5 = invoke5;
                        int a3 = k84.a((~((-1278336537) | i2)) | 1140951048, 490, (((-137385489) | i22) * (-490)) - 1630791378, -546627422) & ((int) (e4 >> 32));
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    } else {
                        obj5 = invoke5;
                    }
                    if (obj5 != null) {
                        Object[] objArr19 = {obj5, num};
                        Object f13 = rV4669.f(10827986);
                        if (f13 == null) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 5150;
                            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int keyCodeFromString = KeyEvent.keyCodeFromString("") + 52;
                            Object[] objArr20 = new Object[1];
                            b((byte) 1, 0, 1, objArr20);
                            f13 = rV4669.g(absoluteGravity, jumpTapTimeout3, keyCodeFromString, -1996364362, (String) objArr20[0], new Class[]{String.class, cls});
                        }
                        long longValue4 = ((Long) ((Method) f13).invoke(null, objArr19)).longValue();
                        long j12 = ((-448) * longValue4) - 188687178450L;
                        long j13 = (419304840 | longValue4) ^ (-1);
                        long j14 = longValue4 ^ (-1);
                        long e5 = com.fingerprintjs.android.fpjs_pro.g.e(449L, j13 | (((j14 | j9) | (-419304841)) ^ (-1)), ((-1347) * j13) + ((j13 | (((j14 | (-419304841)) | j6) ^ (-1))) * 449) + j12, 536414745L);
                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                        int i45 = (~(428967088 | uptimeMillis)) | 1714051659;
                        int i46 = ((int) (e5 >> 32)) & (((uptimeMillis | 1866193499) * 496) + ((i45 | (~((~uptimeMillis) | (-276825249)))) * (-496)) + (i45 * 992) + 1537498186);
                        int a4 = hdi.a();
                        int i47 = ((int) e5) & ((((~(a4 | (-237005174))) | 203440224) * 116) + (((-1674231584) | a4) * 116) + ((~((~a4) | (-1640666635))) * (-116)) + 2072280017);
                    }
                    if (obj4 != null) {
                        Object[] objArr21 = {obj4, num};
                        Object f14 = rV4669.f(10827986);
                        if (f14 == null) {
                            int i48 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5150;
                            char c6 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int windowTouchSlop = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            Object[] objArr22 = new Object[1];
                            b((byte) 1, 0, 1, objArr22);
                            f14 = rV4669.g(i48, c6, windowTouchSlop, -1996364362, (String) objArr22[0], new Class[]{String.class, cls});
                        }
                        long longValue5 = ((Long) ((Method) f14).invoke(null, objArr21)).longValue();
                        long j15 = ((longValue5 ^ (-1)) | j6) ^ (-1);
                        long e6 = com.fingerprintjs.android.fpjs_pro.g.e(575L, ((841163096 | j6) ^ (-1)) | ((j9 | (-841163097)) ^ (-1)), ((-575) * (j15 | ((j9 | longValue5) ^ (-1)))) + (1150 * (((841163096 | j9) ^ (-1)) | j15)) + ((-574) * longValue5) + 482827617678L, 958273001L);
                        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i49 = ((int) (e6 >> 32)) & (((~(2037232611 | elapsedRealtime)) * 113) + (((~((~elapsedRealtime) | (-8537105))) | 1225261442 | (~(820508273 | elapsedRealtime))) * (-113)) + ((((-820508274) | (~(2037232611 | r5))) * 226) - 2055567968));
                        int i50 = (((~(808306343 | i22)) | 1241653512) * (-1188)) - 2039081707;
                        int i51 = 1241653512 | (~((-808306344) | i2));
                        int i52 = ~(2049434542 | i22);
                        int i53 = ((int) e6) & ((((~((-808306344) | i22)) | 525313 | i52) * 594) + ((i51 | i52) * 594) + i50);
                    }
                    if (obj5 != null) {
                        Object[] objArr23 = {obj5, num};
                        Object f15 = rV4669.f(10827986);
                        if (f15 == null) {
                            int myTid2 = 5150 - (Process.myTid() >> 22);
                            char c7 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 52;
                            Object[] objArr24 = new Object[1];
                            b((byte) 1, 0, 1, objArr24);
                            f15 = rV4669.g(myTid2, c7, windowTouchSlop2, -1996364362, (String) objArr24[0], new Class[]{String.class, cls});
                        }
                        long longValue6 = ((Long) ((Method) f15).invoke(null, objArr23)).longValue();
                        long j16 = longValue6 ^ (-1);
                        long e7 = com.fingerprintjs.android.fpjs_pro.g.e(591L, j6 | 2018837916 | j16, ((-591) * ((((2018837916 | j16) | j9) ^ (-1)) | (((-2018837917) | longValue6) ^ (-1)))) + ((-1182) * ((2018837916 | longValue6) ^ (-1))) + (((-590) * longValue6) - 1195152046864L), 2135947821L);
                        int myPid3 = Process.myPid();
                        int i54 = ~myPid3;
                        int i55 = ~((-25231536) | i54);
                        int i56 = ((int) (e7 >> 32)) & ((((~((-25231536) | myPid3)) | (~(i54 | 25231535))) * 575) + (((~(i54 | 1411994875)) | (~((-1411994876) | myPid3))) * (-575)) + (((i55 | r6) * 1150) - 334238508));
                        int myPid4 = Process.myPid();
                        int i57 = ((int) e7) & (((~(myPid4 | (-39332905))) * 345) + (((~((-50097705) | (~myPid4))) | (-1526657019)) * 345) + (((~((-50097705) | myPid4)) | 39332904) * 345) + 484646344);
                    }
                    int i58 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int i59 = (2124614699 & i58) + (i58 | 2124614699);
                    int resolveOpacity = Drawable.resolveOpacity(0, 0);
                    int i60 = (resolveOpacity * (-244)) - 22386;
                    i4 = ~i2;
                    int i61 = ~(90 | i4);
                    int i62 = ~((90 ^ resolveOpacity) | (90 & resolveOpacity));
                    int i63 = ((i61 & i62) | (i61 ^ i62)) * (-245);
                    int i64 = (i60 & i63) + (i60 | i63);
                    int i65 = ~((90 ^ i2) | (90 & i2));
                    int i66 = (i64 - (~(-(-(i65 * (-245)))))) - 1;
                    int i67 = ((resolveOpacity & i65) | (resolveOpacity ^ i65)) * 245;
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) - 1557879815;
                    int i69 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int i70 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr25 = new Object[1];
                    d((byte) ((i69 ^ 104) + ((i69 & 104) << 1)), i59, i68, offsetBefore, (short) ((i70 & 75) + (i70 | 75)), objArr25);
                    String str2 = (String) objArr25[0];
                    int i71 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int threadPriority2 = Process.getThreadPriority(0);
                    Object[] objArr26 = new Object[1];
                    c((char) (((i71 | 17094) << 1) - (i71 ^ 17094)), (((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6, "쬭貝\ua7d1盚繇匓", "\ud8eb㷉웊푂", objArr26);
                    String str3 = (String) objArr26[0];
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    char mirror2 = AndroidCharacter.getMirror('0');
                    int i72 = (42784 & mirror2) + (mirror2 | 42784);
                    Object[] objArr27 = new Object[1];
                    c(deadChar, i72, "笕旨\uf0d6뢚섻Č쓠", "僴躧栃棂", objArr27);
                    String str4 = (String) objArr27[0];
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                    int component9 = com.fingerprintjs.android.fpjs_pro.u.component9();
                    int i73 = tapTimeout * (-109);
                    int i74 = ((-1352630186) & i73) + (i73 | (-1352630186));
                    int i75 = ~tapTimeout;
                    int i76 = ~(((-2140322806) ^ component9) | ((-2140322806) & component9));
                    int i77 = (((i76 & i75) | (i75 ^ i76)) * (-220)) + i74;
                    int i78 = ~(((-2140322806) ^ tapTimeout) | ((-2140322806) & tapTimeout));
                    int i79 = ~(component9 | (-2140322806));
                    int i80 = ~((i75 & (-2140322806)) | ((-2140322806) ^ i75));
                    int i81 = ~((tapTimeout & 2140322805) | (2140322805 ^ tapTimeout));
                    int i82 = (((i81 & i80) | (i80 ^ i81)) * 110) + (((i79 & i78) | (i78 ^ i79)) * 220) + i77;
                    Object[] objArr28 = new Object[1];
                    c(packedPositionType, i82, "偁嶟\ue928ꏌ瘦꧐\udf4b䐔탫", "\u0ad8浄ހ軠", objArr28);
                    String str5 = (String) objArr28[0];
                    Object[] objArr29 = new Object[1];
                    c((char) (21311 - (~View.resolveSize(0, 0))), Color.alpha(0), "ꎆ⮮뵑꧁ﳯ\ueb9c", "\uf836撃䃴聓", objArr29);
                    String str6 = (String) objArr29[0];
                    int i83 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 2124614706;
                    int combineMeasuredStates = View.combineMeasuredStates(0, 0) - 91;
                    int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                    int i84 = ((-1557879807) & touchSlop) + (touchSlop | (-1557879807));
                    int i85 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr30 = new Object[1];
                    d((byte) (Color.green(0) - 25), i83, combineMeasuredStates, i84, (short) ((i85 ^ (-15)) + ((i85 & (-15)) << 1)), objArr30);
                    String str7 = (String) objArr30[0];
                    int i86 = -(-KeyEvent.getDeadChar(0, 0));
                    byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                    int i87 = (1245259538 & modifierMetaStateMask2) + (modifierMetaStateMask2 | 1245259538);
                    Object[] objArr31 = new Object[1];
                    c((char) (((50133 | i86) << 1) - (i86 ^ 50133)), i87, "玔鰓凾諊섓", "ᇄ㤧핊\ue8c3", objArr31);
                    String str8 = (String) objArr31[0];
                    int normalizeMetaState = KeyEvent.normalizeMetaState(0);
                    Object[] objArr32 = new Object[1];
                    c((char) (((normalizeMetaState | 20304) << 1) - (normalizeMetaState ^ 20304)), (-2) - ((-MotionEvent.axisFromString("")) ^ (-1)), "穒祀뺬᧥칐㲤", "\ue269䭳傀㉏", objArr32);
                    String str9 = (String) objArr32[0];
                    int i88 = -ImageFormat.getBitsPerPixel(0);
                    int i89 = (2124614705 ^ i88) + ((i88 & 2124614705) << 1);
                    int i90 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 91;
                    int keyCodeFromString2 = (-1557879794) - KeyEvent.keyCodeFromString("");
                    int i91 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Object[] objArr33 = new Object[1];
                    d((byte) ((i91 & 77) + (i91 | 77)), i89, i90, keyCodeFromString2, (short) (8 - (~(-TextUtils.indexOf((CharSequence) "", '0')))), objArr33);
                    String str10 = (String) objArr33[0];
                    int i92 = -TextUtils.getTrimmedLength("");
                    int i93 = (i92 * 628) - (-567712);
                    int i94 = (i2 ^ 904) | (i2 & 904);
                    int i95 = ~i92;
                    int i96 = -(-(((i94 & i95) | (i94 ^ i95)) * (-627)));
                    int i97 = (i93 & i96) + (i93 | i96);
                    int i98 = ~((-905) | i2);
                    int i99 = ((i98 & i92) | (i92 ^ i98)) * (-627);
                    int i100 = (i97 ^ i99) + ((i99 & i97) << 1);
                    int i101 = ~(i4 | 904);
                    int i102 = ~((i92 & i2) | (i92 ^ i2));
                    int i103 = -(-(((i102 & i101) | (i101 ^ i102)) * 627));
                    char c8 = (char) ((i100 & i103) + (i103 | i100));
                    int rgb = Color.rgb(0, 0, 0);
                    int i104 = (16777216 & rgb) + (rgb | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                    Object[] objArr34 = new Object[1];
                    c(c8, i104, "殸۩쫰撢靽摆敚\ue418箺憟똕ᔟ훱끴빤㴮", "㍃똏袈搃", objArr34);
                    String str11 = (String) objArr34[0];
                    int i105 = 2124614708 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i106 = -(-Color.argb(0, 0, 0, 0));
                    int i107 = (i106 ^ (-91)) + ((i106 & (-91)) << 1);
                    int trimmedLength = TextUtils.getTrimmedLength("");
                    int i108 = ((-1557879792) & trimmedLength) + (trimmedLength | (-1557879792));
                    int i109 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i110 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr35 = new Object[1];
                    d((byte) ((i109 ^ 125) + ((i109 & 125) << 1)), i105, i107, i108, (short) (((i110 | 30) << 1) - (i110 ^ 30)), objArr35);
                    String str12 = (String) objArr35[0];
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i111 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i112 = (i111 ^ (-1)) + (i111 << 1);
                    Object[] objArr36 = new Object[1];
                    c(doubleTapTimeout, i112, "\udaac\ud949贯蠹\uea14쏾㊆୶", "퍛獗\ueb0e\udfdc", objArr36);
                    String str13 = (String) objArr36[0];
                    int i113 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i114 = (2124614712 ^ i113) + ((i113 & 2124614712) << 1);
                    int i115 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i116 = (i115 ^ (-90)) + ((i115 & (-90)) << 1);
                    int doubleTapTimeout2 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                    int i117 = ((-1557879782) ^ doubleTapTimeout2) + ((doubleTapTimeout2 & (-1557879782)) << 1);
                    int i118 = -(-Gravity.getAbsoluteGravity(0, 0));
                    Object[] objArr37 = new Object[1];
                    d((byte) (((i118 | (-8)) << 1) - (i118 ^ (-8))), i114, i116, i117, (short) ((-77) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr37);
                    String str14 = (String) objArr37[0];
                    int i119 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i120 = (2124614713 ^ i119) + ((i119 & 2124614713) << 1);
                    int green = Color.green(0);
                    int i121 = (green ^ (-91)) + ((green & (-91)) << 1);
                    int lastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) - 1557879769;
                    int i122 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    short s = (short) ((i122 ^ (-92)) + ((i122 & (-92)) << 1));
                    Object[] objArr38 = new Object[1];
                    d((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 95), i120, i121, lastIndexOf, s, objArr38);
                    String str15 = (String) objArr38[0];
                    char indexOf2 = (char) TextUtils.indexOf("", "", 0);
                    int i123 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int component92 = com.fingerprintjs.android.fpjs_pro.u.component9();
                    int i124 = i123 * (-159);
                    int i125 = (1937478678 & i124) + (i124 | 1937478678);
                    int i126 = ~i123;
                    int i127 = -(-(((i126 & (-984630826)) | ((-984630826) ^ i126)) * 160));
                    int i128 = (i125 & i127) + (i127 | i125);
                    int i129 = ~component92;
                    int i130 = ~((i129 ^ i123) | (i129 & i123));
                    int i131 = ~((-984630826) | i123);
                    int i132 = ((i130 & i131) | (i130 ^ i131)) * (-160);
                    int i133 = (i128 & i132) + (i132 | i128);
                    int i134 = -(-((i123 | (~((i129 & 984630825) | (984630825 ^ i129)))) * 160));
                    int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                    Object[] objArr39 = new Object[1];
                    c(indexOf2, i135, "ṿ➶䘅燎붕ḥ\ue299", "햾侹旅蹂", objArr39);
                    String str16 = (String) objArr39[0];
                    char jumpTapTimeout4 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                    int i136 = ((-274417145) & touchSlop2) + (touchSlop2 | (-274417145));
                    Object[] objArr40 = new Object[1];
                    c(jumpTapTimeout4, i136, "싀數鿶鼺쒃\ued13\udac7", "߃꒺\uebef뤻", objArr40);
                    String str17 = (String) objArr40[0];
                    int i137 = 2124614715 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))));
                    int threadPriority3 = Process.getThreadPriority(0);
                    int component93 = com.fingerprintjs.android.fpjs_pro.u.component9();
                    int i138 = -(-(threadPriority3 * 521));
                    int i139 = (((-10380) | i138) << 1) - (i138 ^ (-10380));
                    int i140 = ~threadPriority3;
                    int i141 = (-21) | i140;
                    int i142 = ~component93;
                    int i143 = ~((i141 & i142) | (i141 ^ i142));
                    int i144 = ~((threadPriority3 & component93) | (threadPriority3 ^ component93));
                    int i145 = ((i144 & i143) | (i143 ^ i144)) * 520;
                    int i146 = (i139 ^ i145) + ((i145 & i139) << 1);
                    int i147 = ~(i140 | i142);
                    int i148 = ~((component93 ^ 20) | (component93 & 20));
                    int i149 = (((i147 & i148) | (i147 ^ i148)) * (-1040)) + i146;
                    int i150 = ((~(component93 | 20)) | (~((i140 & 20) | (i140 ^ 20))) | (~(((-21) ^ i142) | ((-21) & i142)))) * 520;
                    int i151 = -((((i149 | i150) << 1) - (i149 ^ i150)) >> 6);
                    int component94 = com.fingerprintjs.android.fpjs_pro.u.component9();
                    int i152 = i151 * 934;
                    int i153 = ((84812 | i152) << 1) - (i152 ^ 84812);
                    int i154 = ~i151;
                    int i155 = ~component94;
                    int i156 = ~((i154 & i155) | (i154 ^ i155));
                    int i157 = ((90 & i156) | (90 ^ i156)) * (-933);
                    int i158 = (i153 ^ i157) + ((i157 & i153) << 1);
                    int i159 = ~(90 | i155);
                    int i160 = ~((90 ^ i151) | (90 & i151));
                    int i161 = ((~((i151 & (-91)) | (i151 ^ (-91)))) * 933) + ((i158 - (~(-(-(((i159 & i160) | (i159 ^ i160)) * 933))))) - 1);
                    int i162 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i163 = (((-1557879755) | i162) << 1) - (i162 ^ (-1557879755));
                    int i164 = -View.MeasureSpec.getMode(0);
                    int i165 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    Object[] objArr41 = new Object[1];
                    d((byte) (((i164 | 59) << 1) - (i164 ^ 59)), i137, i161, i163, (short) (((i165 | 81) << 1) - (i165 ^ 81)), objArr41);
                    String str18 = (String) objArr41[0];
                    int myPid5 = Process.myPid() >> 22;
                    Object[] objArr42 = new Object[1];
                    c((char) (((48936 | myPid5) << 1) - (myPid5 ^ 48936)), ViewConfiguration.getDoubleTapTimeout() >> 16, "䐃\ue8d4", "ﮣ푍⠳䆿", objArr42);
                    String str19 = (String) objArr42[0];
                    Object[] objArr43 = new Object[1];
                    c((char) TextUtils.getCapsMode("", 0, 0), ViewConfiguration.getTouchSlop() >> 8, "ᨌꆶ\ude1f喈瀽㡏ᆭ튐瞽᧠괬㤺佗嫡\u1f4fね\uef33춁\u0019\uf297", "㺯\uebe8ꋊ\uf0b2", objArr43);
                    String str20 = (String) objArr43[0];
                    int i166 = -TextUtils.indexOf("", "");
                    int i167 = ((i166 | 2124614716) << 1) - (i166 ^ 2124614716);
                    int i168 = (-92) - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i169 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i170 = (((-1557879750) | i169) << 1) - (i169 ^ (-1557879750));
                    int i171 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int component95 = com.fingerprintjs.android.fpjs_pro.u.component9();
                    int i172 = i171 * 465;
                    int i173 = ((i172 | 32410) << 1) - (i172 ^ 32410);
                    int i174 = ~component95;
                    int i175 = ~(69 | i174);
                    int i176 = ~((69 ^ i171) | (69 & i171));
                    int i177 = -(-(((~((i174 & i171) | (i174 ^ i171))) | i175 | i176) * 464));
                    byte b3 = (byte) ((((~((i171 & component95) | (i171 ^ component95))) | i176) * 464) + ((((i173 & i177) + (i177 | i173)) - (~((((~i171) | component95) | 69) * (-464)))) - 1));
                    int i178 = -(ViewConfiguration.getTouchSlop() >> 8);
                    Object[] objArr44 = new Object[1];
                    d(b3, i167, i168, i170, (short) ((i178 ^ (-107)) + ((i178 & (-107)) << 1)), objArr44);
                    String str21 = (String) objArr44[0];
                    int axisFromString = MotionEvent.axisFromString("");
                    int i179 = (2124614717 & axisFromString) + (axisFromString | 2124614717);
                    int i180 = -Color.rgb(0, 0, 0);
                    int i181 = ((-16777307) ^ i180) + ((i180 & (-16777307)) << 1);
                    int i182 = -TextUtils.indexOf("", "", 0);
                    int i183 = ((-1557879743) ^ i182) + ((i182 & (-1557879743)) << 1);
                    int resolveSize = View.resolveSize(0, 0);
                    int i184 = -(-MotionEvent.axisFromString(""));
                    Object[] objArr45 = new Object[1];
                    d((byte) (((resolveSize | 74) << 1) - (resolveSize ^ 74)), i179, i181, i183, (short) (((i184 | (-120)) << 1) - (i184 ^ (-120))), objArr45);
                    String str22 = (String) objArr45[0];
                    int indexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i185 = (2124614717 & indexOf3) + (indexOf3 | 2124614717);
                    int touchSlop3 = (-91) - (ViewConfiguration.getTouchSlop() >> 8);
                    int i186 = -View.combineMeasuredStates(0, 0);
                    int i187 = (((-1557879741) | i186) << 1) - (i186 ^ (-1557879741));
                    int i188 = -Color.green(0);
                    int i189 = -(-TextUtils.getTrimmedLength(""));
                    Object[] objArr46 = new Object[1];
                    d((byte) (((i188 | 46) << 1) - (i188 ^ 46)), i185, touchSlop3, i187, (short) (((i189 | (-67)) << 1) - (i189 ^ (-67))), objArr46);
                    String str23 = (String) objArr46[0];
                    Object[] objArr47 = new Object[1];
                    c((char) View.combineMeasuredStates(0, 0), (-22269639) - (~(-View.resolveSize(0, 0))), "ⰹ\ue40c\ue90e腎\ue156ᛵᏻ褴잽", "㪵갱볾헁", objArr47);
                    String str24 = (String) objArr47[0];
                    Object[] objArr48 = new Object[1];
                    d((byte) (94 - (~MotionEvent.axisFromString(""))), 2124614715 - (~(-ImageFormat.getBitsPerPixel(0))), (-92) - (~KeyEvent.keyCodeFromString("")), (-1557879726) - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), (short) ((-115) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr48);
                    String str25 = (String) objArr48[0];
                    int i190 = -View.resolveSizeAndState(0, 0, 0);
                    int i191 = (2124614717 & i190) + (i190 | 2124614717);
                    int i192 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i193 = ((i192 | (-91)) << 1) - (i192 ^ (-91));
                    int i194 = (-1557879716) - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                    byte b4 = (byte) (93 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    int i195 = -(-TextUtils.lastIndexOf("", '0'));
                    Object[] objArr49 = new Object[1];
                    d(b4, i191, i193, i194, (short) ((i195 & (-63)) + (i195 | (-63))), objArr49);
                    String str26 = (String) objArr49[0];
                    Object[] objArr50 = new Object[1];
                    c((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-857101562) - (Process.myPid() >> 22), "ಃ숴젖\u2e78\uf646敺ⶖ籾㺥罬攚", "ض\ue9ab믌퀽", objArr50);
                    String str27 = (String) objArr50[0];
                    int keyCodeFromString3 = KeyEvent.keyCodeFromString("");
                    int i196 = ~((-2124614719) | i2);
                    int i197 = (i4 ^ keyCodeFromString3) | (i4 & keyCodeFromString3);
                    int i198 = ~((i197 & 2124614718) | (2124614718 ^ i197));
                    int i199 = (((i196 & i198) | (i196 ^ i198)) * (-406)) + (keyCodeFromString3 * (-405)) + 1429763730;
                    int i200 = (~((-2124614719) | i4 | keyCodeFromString3)) * (-406);
                    int i201 = ((i199 | i200) << 1) - (i200 ^ i199);
                    int i202 = ~keyCodeFromString3;
                    int i203 = ~((i202 & i2) | (i202 ^ i2));
                    int i204 = ~((2124614718 ^ i4) | (2124614718 & i4));
                    int i205 = (((i203 & i204) | (i203 ^ i204)) * 406) + i201;
                    int i206 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i207 = ((i206 | (-91)) << 1) - (i206 ^ (-91));
                    int size = View.MeasureSpec.getSize(0);
                    int i208 = ((-1557879704) & size) + (size | (-1557879704));
                    byte minimumFlingVelocity = (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 110);
                    int i209 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    Object[] objArr51 = new Object[1];
                    d(minimumFlingVelocity, i205, i207, i208, (short) ((i209 ^ (-41)) + ((i209 & (-41)) << 1)), objArr51);
                    String str28 = (String) objArr51[0];
                    int i210 = -(-TextUtils.lastIndexOf("", '0'));
                    int i211 = ((2124614719 | i210) << 1) - (i210 ^ 2124614719);
                    int normalizeMetaState2 = KeyEvent.normalizeMetaState(0) - 91;
                    int i212 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i213 = ((-1557879689) ^ i212) + ((i212 & (-1557879689)) << 1);
                    int i214 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                    int i215 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    Object[] objArr52 = new Object[1];
                    d((byte) (((i214 | (-108)) << 1) - (i214 ^ (-108))), i211, normalizeMetaState2, i213, (short) ((i215 & (-105)) + (i215 | (-105))), objArr52);
                    String[] strArr4 = {str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, (String) objArr52[0]};
                    Object[] objArr53 = new Object[1];
                    c((char) View.resolveSizeAndState(0, 0, 0), 1138672066 - (~(-ExpandableListView.getPackedPositionType(0L))), "\uf3bb숌\udf84豈徠᱿䱒잭믢⒑컭", "쌗\udec1핃霵", objArr53);
                    Object[] objArr54 = {(String) objArr53[0]};
                    f2 = rV4669.f(-417469134);
                    if (f2 != null) {
                        int keyCodeFromString4 = 6202 - KeyEvent.keyCodeFromString("");
                        char lastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int resolveSizeAndState = 51 - View.resolveSizeAndState(0, 0, 0);
                        strArr = strArr4;
                        Object[] objArr55 = new Object[1];
                        b((byte) (-bArr[6]), 1, 0, objArr55);
                        f2 = rV4669.g(keyCodeFromString4, lastIndexOf2, resolveSizeAndState, 1857630294, (String) objArr55[0], new Class[]{String.class});
                    } else {
                        strArr = strArr4;
                    }
                    invoke = ((Method) f2).invoke(null, objArr54);
                    if (invoke != null) {
                        int i216 = j;
                        i = ((i216 ^ 21) + ((i216 & 21) << 1)) % 128;
                        int i217 = -TextUtils.lastIndexOf("", '0');
                        int i218 = ((i217 | 2124614714) << 1) - (i217 ^ 2124614714);
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) - 91;
                        int i219 = -ExpandableListView.getPackedPositionChild(0L);
                        int i220 = (i219 & (-1557879894)) + (i219 | (-1557879894));
                        int i221 = -TextUtils.getTrimmedLength("");
                        int i222 = -TextUtils.getOffsetAfter("", 0);
                        Object[] objArr56 = new Object[1];
                        d((byte) (((i221 | (-10)) << 1) - (i221 ^ (-10))), i218, deadChar2, i220, (short) ((i222 ^ (-118)) + ((i222 & (-118)) << 1)), objArr56);
                        String str29 = (String) objArr56[0];
                        int i223 = -TextUtils.lastIndexOf("", '0', 0);
                        int i224 = (i223 & 2124614703) + (i223 | 2124614703);
                        int i225 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                        int i226 = (i225 & (-91)) + (i225 | (-91));
                        int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                        int i227 = (longPressTimeout ^ (-1557879887)) + ((longPressTimeout & (-1557879887)) << 1);
                        byte b5 = (byte) ((-30) - (~(-TextUtils.indexOf("", "", 0))));
                        int i228 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Object[] objArr57 = new Object[1];
                        d(b5, i224, i226, i227, (short) ((i228 ^ (-89)) + ((i228 & (-89)) << 1)), objArr57);
                        Object[] objArr58 = {invoke, new String[]{str29, (String) objArr57[0]}};
                        Object f16 = rV4669.f(-41701482);
                        if (f16 == null) {
                            int defaultSize2 = View.getDefaultSize(0, 0) + 5477;
                            char myPid6 = (char) (Process.myPid() >> 22);
                            int i229 = 52 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            Object[] objArr59 = new Object[1];
                            b((byte) 1, 0, 1, objArr59);
                            f16 = rV4669.g(defaultSize2, myPid6, i229, 1948742386, (String) objArr59[0], new Class[]{String.class, String[].class});
                        }
                        long longValue7 = ((Long) ((Method) f16).invoke(null, objArr58)).longValue();
                        long j17 = ((-368) * (longValue7 | (-164822226))) + ((185 * longValue7) - 30162467175L);
                        long j18 = longValue7 ^ (-1);
                        long myTid3 = Process.myTid() ^ (-1);
                        long e8 = com.fingerprintjs.android.fpjs_pro.g.e(184L, ((myTid3 | 164822225) ^ (-1)) | (((-164822226) | j18) ^ (-1)) | ((164822225 | longValue7) ^ (-1)), ((164822225 | j18 | myTid3) * 184) + j17, 133020966L);
                        int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                        int i230 = ~(1880589007 | elapsedRealtime2);
                        int i231 = ~elapsedRealtime2;
                        int i232 = ((int) (e8 >> 32)) & ((((~(i231 | (-1880589008))) | (~(elapsedRealtime2 | 977151877)) | 170403072) * 904) + (((~(i231 | (-806748806))) | (~(2050992079 | elapsedRealtime2))) * 904) + ((i230 | (~((-977151878) | i231))) * (-1808)) + 773847130);
                        int i233 = ((int) e8) & ((((~(1146215591 | i4)) | (~(1711525294 | i4)) | (~((-1140968615) | i2))) * 568) + (((~((-1146215592) | i2)) | (~((-1711525295) | i2)) | (~(1716772271 | i4))) * (-568)) + (((((~((-1146215592) | i4)) | 1140968614) | (~((-1711525295) | i4))) * (-1136)) - 1738041619));
                        if (((i232 & i233) | (i232 ^ i233)) != 0) {
                            int i234 = -(-TextUtils.lastIndexOf("", '0', 0));
                            int i235 = (i234 & 2124614716) + (i234 | 2124614716);
                            int i236 = -ExpandableListView.getPackedPositionType(0L);
                            int i237 = (i236 & (-91)) + (i236 | (-91));
                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) - 1557879879;
                            int i238 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                            int i239 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            Object[] objArr60 = new Object[1];
                            d((byte) ((i238 ^ 61) + ((i238 & 61) << 1)), i235, i237, longPressTimeout2, (short) (((i239 | 49) << 1) - (i239 ^ 49)), objArr60);
                            Object[] objArr61 = {(String) objArr60[0]};
                            Object f17 = rV4669.f(-417469134);
                            if (f17 == null) {
                                int i240 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 6202;
                                char rgb2 = (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                int mode = View.MeasureSpec.getMode(0) + 51;
                                Object[] objArr62 = new Object[1];
                                b((byte) (-bArr[6]), 1, 0, objArr62);
                                f17 = rV4669.g(i240, rgb2, mode, 1857630294, (String) objArr62[0], new Class[]{String.class});
                            }
                            Object invoke6 = ((Method) f17).invoke(null, objArr61);
                            int i241 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int component96 = com.fingerprintjs.android.fpjs_pro.u.component9();
                            int i242 = i241 * 628;
                            int i243 = ((i242 | 39563372) << 1) - (i242 ^ 39563372);
                            int i244 = (component96 ^ 62999) | (component96 & 62999);
                            int i245 = ~i241;
                            int i246 = ((i244 ^ i245) | (i244 & i245)) * (-627);
                            int i247 = ((i243 | i246) << 1) - (i246 ^ i243);
                            int i248 = -(-(((~((-63000) | component96)) | i241) * (-627)));
                            int i249 = (i247 ^ i248) + ((i248 & i247) << 1);
                            int i250 = ~component96;
                            int i251 = ~((62999 & i250) | (i250 ^ 62999));
                            int i252 = ~(i241 | component96);
                            int i253 = -(-(((i252 & i251) | (i251 ^ i252)) * 627));
                            Object[] objArr63 = new Object[1];
                            c((char) (((i249 | i253) << 1) - (i253 ^ i249)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)), "涺⛦偩꠆ᦒ䢭╚牃ᛦ襇㝊ᗊ틔\uf8b7\uf29dꭋ릪䜇臑媝䑽ꐘ\ue502쏛ᐷ\uea72쩣뛍䑑鱤", "듑標ᜓ쏶", objArr63);
                            Object[] objArr64 = {(String) objArr63[0]};
                            Object f18 = rV4669.f(-417469134);
                            if (f18 == null) {
                                int i254 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6202;
                                char mirror3 = (char) ('0' - AndroidCharacter.getMirror('0'));
                                int size2 = View.MeasureSpec.getSize(0) + 51;
                                obj2 = invoke6;
                                Object[] objArr65 = new Object[1];
                                b((byte) (-bArr[6]), 1, 0, objArr65);
                                f18 = rV4669.g(i254, mirror3, size2, 1857630294, (String) objArr65[0], new Class[]{String.class});
                            } else {
                                obj2 = invoke6;
                            }
                            Object invoke7 = ((Method) f18).invoke(null, objArr64);
                            if (obj2 != null) {
                                Object[] objArr66 = {obj2, num};
                                Object f19 = rV4669.f(10827986);
                                if (f19 == null) {
                                    int i255 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5149;
                                    char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                    int argb = Color.argb(0, 0, 0, 0) + 52;
                                    Object[] objArr67 = new Object[1];
                                    b((byte) 1, 0, 1, objArr67);
                                    f19 = rV4669.g(i255, touchSlop4, argb, -1996364362, (String) objArr67[0], new Class[]{String.class, cls});
                                }
                                long longValue8 = ((Long) ((Method) f19).invoke(null, objArr66)).longValue();
                                long j19 = longValue8 ^ (-1);
                                long j20 = j19 | (-544654236);
                                long e9 = com.fingerprintjs.android.fpjs_pro.g.e(130L, ((544654235 | longValue8) ^ (-1)) | ((j20 | j6) ^ (-1)), ((-260) * (j20 ^ (-1))) + ((((j19 | (j6 ^ (-1))) | (-544654236)) ^ (-1)) * 130) + (131 * longValue8) + 70260396444L, 661764140L);
                                int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                obj3 = invoke7;
                                int i256 = ((int) (e9 >> 32)) & ((((~(elapsedRealtime3 | (-97811509))) | 97802292 | (~((~elapsedRealtime3) | 1339424118))) * 988) + ((((~(1339424118 | elapsedRealtime3)) | (~(r7 | (-9217)))) * 988) - 210160578));
                                int i257 = ((int) e9) & (((~(181692841 | i2)) * 113) + (((~(1255533568 | i2)) | 425 | (~((-1073841153) | i4))) * (-113)) + (((~(181692841 | i4)) | (-1255533569)) * 226) + 2055568080);
                            } else {
                                obj3 = invoke7;
                            }
                            if (obj3 != null) {
                                Object[] objArr68 = {obj3, num};
                                Object f20 = rV4669.f(10827986);
                                if (f20 == null) {
                                    int mode2 = View.MeasureSpec.getMode(0) + 5150;
                                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                    int indexOf4 = TextUtils.indexOf("", "") + 52;
                                    Object[] objArr69 = new Object[1];
                                    b((byte) 1, 0, 1, objArr69);
                                    f20 = rV4669.g(mode2, edgeSlop, indexOf4, -1996364362, (String) objArr69[0], new Class[]{String.class, cls});
                                }
                                long longValue9 = ((Long) ((Method) f20).invoke(null, objArr68)).longValue();
                                long j21 = (((-1406283119) | j6) * 116) + ((-116) * ((((j6 ^ (-1)) | (-1406283119)) | longValue9) ^ (-1))) + ((-115) * longValue9) + 161722558685L;
                                long j22 = longValue9 ^ (-1);
                                long e10 = com.fingerprintjs.android.fpjs_pro.g.e(116L, ((1406283118 | j22) ^ (-1)) | ((j22 | j6) ^ (-1)), j21, 1523393023L);
                                int i258 = ((int) (e10 >> 32)) & ((((~(1025738742 | i2)) | (~((-1832002143) | i4))) * 333) + ((((~(1025738742 | i4)) | (~((-1832002143) | i2))) * 333) - 760513105));
                                int i259 = ((int) e10) & ((((-740868739) | i2) * 591) + (((~((-740868739) | i4)) | (-2116872148)) * (-591)) + 1388545110);
                            }
                        }
                    }
                    int i260 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2124614647;
                    int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
                    int i261 = ((resolveOpacity2 | (-91)) << 1) - (resolveOpacity2 ^ (-91));
                    int i262 = -KeyEvent.normalizeMetaState(0);
                    Object[] objArr70 = new Object[1];
                    d((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 109), i260, i261, ((i262 | (-1557879663)) << 1) - (i262 ^ (-1557879663)), (short) (ExpandableListView.getPackedPositionType(0L) + 2), objArr70);
                    Object[] objArr71 = {(String) objArr70[0]};
                    f3 = rV4669.f(1555759462);
                    if (f3 == null) {
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5202;
                        char rgb3 = (char) ((-16777216) - Color.rgb(0, 0, 0));
                        int touchSlop5 = 50 - (ViewConfiguration.getTouchSlop() >> 8);
                        Object[] objArr72 = new Object[1];
                        b((byte) 1, 0, 1, objArr72);
                        f3 = rV4669.g(scrollDefaultDelay2, rgb3, touchSlop5, -719332350, (String) objArr72[0], new Class[]{String.class});
                    }
                    long longValue10 = ((Long) ((Method) f3).invoke(null, objArr71)).longValue();
                    long j23 = (242 * longValue10) + 144844306719L;
                    long j24 = longValue10 ^ (-1);
                    long uptimeMillis2 = (-299884694) | (((int) SystemClock.uptimeMillis()) ^ (-1));
                    long e11 = com.fingerprintjs.android.fpjs_pro.g.e(241L, ((j24 | 299884693) ^ (-1)) | ((uptimeMillis2 | longValue10) ^ (-1)), ((-482) * (299884693 | longValue10)) + ((-241) * ((((-299884694) | j24) ^ (-1)) | (uptimeMillis2 ^ (-1)))) + j23, 1748208297L);
                    int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                    int i263 = (((~(1320451053 | maxMemory3)) | 285279234 | (~((-1537289832) | maxMemory3))) * (-754)) + 1724907774;
                    int i264 = ~((-285279235) | maxMemory3);
                    int i265 = ~maxMemory3;
                    int i266 = ((int) (e11 >> 32)) & (((1320451053 | i265) * 754) + (((~(i265 | (-1252010598))) | i264) * (-754)) + i263);
                    int i267 = (int) e11;
                    int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                    a = i266 | (i267 & k84.a(~(elapsedRealtime4 | (-279447585)), -1504, (((~(1124214663 | elapsedRealtime4)) | (-1403662248)) * 1504) + 1320243365, -478391120));
                    int i268 = -TextUtils.getOffsetBefore("", 0);
                    int i269 = (i268 & 2124614648) + (i268 | 2124614648);
                    int i270 = -View.combineMeasuredStates(0, 0);
                    int i271 = (i270 ^ (-91)) + ((i270 & (-91)) << 1);
                    int i272 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i273 = (i272 & (-1557879641)) + (i272 | (-1557879641));
                    byte indexOf5 = (byte) (83 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i274 = -Color.red(0);
                    Object[] objArr73 = new Object[1];
                    d(indexOf5, i269, i271, i273, (short) (((i274 | 54) << 1) - (i274 ^ 54)), objArr73);
                    Object[] objArr74 = {(String) objArr73[0]};
                    f4 = rV4669.f(1555759462);
                    if (f4 == null) {
                        int i275 = 50 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        Object[] objArr75 = new Object[1];
                        b((byte) 1, 0, 1, objArr75);
                        f4 = rV4669.g(5201 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), i275, -719332350, (String) objArr75[0], new Class[]{String.class});
                    }
                    long longValue11 = ((Long) ((Method) f4).invoke(null, objArr74)).longValue();
                    long j25 = longValue11 ^ (-1);
                    long j26 = (-1874702096) | j25;
                    long j27 = ((j26 ^ (-1)) * 497) + (((-496) * longValue11) - 929852239120L);
                    long j28 = (j26 | j6) ^ (-1);
                    j2 = j6 ^ (-1);
                    long e12 = com.fingerprintjs.android.fpjs_pro.g.e(497L, (((-1874702096) | j2) ^ (-1)) | (((-1874702096) | longValue11) ^ (-1)) | (((j25 | 1874702095) | j6) ^ (-1)), ((j28 | (((j25 | j2) | 1874702095) ^ (-1))) * 497) + j27, 173390895L);
                    long a5 = (((int) (e12 >> 32)) & k84.a((~((-151035971) | i2)) | 1082196488, 446, (((~(1894450701 | i4)) | (-2045486672)) * 446) + 384374654, -1753988960)) | (((int) e12) & ((((~((-1294194806) | i4)) | 143031604) * 783) + (((~((-1159823426) | i4)) * (-783)) - 1761822647)));
                    if (a <= 0 && a5 > 0 && a5 - 3 < a) {
                        Object[] objArr76 = {r4, r5, null, r6};
                        int[] iArr4 = {i2};
                        int[] iArr5 = {i2 ^ 247};
                        int a6 = k84.a((~(i2 | (-582116075))) | (~(i4 | 704957559)), 959, (((~((-582116075) | i4)) | (~(i2 | 704957559))) * 959) - 1167025581, 1390769612);
                        int i276 = a6 << 13;
                        int i277 = ((~a6) & i276) | ((~i276) & a6);
                        int i278 = i277 >>> 17;
                        int i279 = ((~i277) & i278) | ((~i278) & i277);
                        int i280 = i279 << 5;
                        int[] iArr6 = {((~i279) & i280) | ((~i280) & i279)};
                        return objArr76;
                    }
                    int capsMode = 2124614648 - TextUtils.getCapsMode("", 0, 0);
                    int i281 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i282 = (i281 ^ (-91)) + ((i281 & (-91)) << 1);
                    int i283 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1557879664;
                    byte scrollBarFadeDuration = (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 109);
                    int i284 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    Object[] objArr77 = new Object[1];
                    d(scrollBarFadeDuration, capsMode, i282, i283, (short) (((i284 | 2) << 1) - (i284 ^ 2)), objArr77);
                    Object[] objArr78 = {(String) objArr77[0]};
                    f5 = rV4669.f(1555759462);
                    if (f5 == null) {
                        int touchSlop6 = (ViewConfiguration.getTouchSlop() >> 8) + 5202;
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int i285 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49;
                        Object[] objArr79 = new Object[1];
                        b((byte) 1, 0, 1, objArr79);
                        f5 = rV4669.g(touchSlop6, maxKeyCode, i285, -719332350, (String) objArr79[0], new Class[]{String.class});
                    }
                    long longValue12 = ((Long) ((Method) f5).invoke(null, objArr78)).longValue();
                    long j29 = (-1384196249) | j2;
                    long e13 = com.fingerprintjs.android.fpjs_pro.g.e(519L, 1384196248 | ((longValue12 | j6) ^ (-1)), ((-519) * (((j29 | longValue12) ^ (-1)) | (((1384196248 | longValue12) | j6) ^ (-1)))) + ((longValue12 | (j29 ^ (-1))) * 519) + (((-518) * longValue12) - 717013656464L), 663896742L);
                    int myTid4 = Process.myTid();
                    int i286 = ~myTid4;
                    int i287 = ((int) (e13 >> 32)) & ((((~(196419854 | i286)) | (-1811904448)) * 859) + (((~(i286 | 1633646265)) | (~((-1615484594) | myTid4))) * 859) + ((1633646265 | myTid4) * (-859)) + 1505993154);
                    int i288 = (int) e13;
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int a7 = i288 & k84.a((~(elapsedCpuTime2 | (-590438846))) | (~((-846787565) | elapsedCpuTime2)) | 573596076, -1444, (((~elapsedCpuTime2) | (-290034258)) * 1444) + 1153123995, -1048663950);
                    j3 = (i287 & a7) | (i287 ^ a7);
                    int i289 = -KeyEvent.normalizeMetaState(0);
                    int i290 = (i289 ^ 2124614648) + ((i289 & 2124614648) << 1);
                    int i291 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i292 = (i291 ^ (-91)) + ((i291 & (-91)) << 1);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) - 1557879622;
                    int alpha = Color.alpha(0);
                    int i293 = alpha * 905;
                    int i294 = (i293 & 46053) + (i293 | 46053);
                    int i295 = ~alpha;
                    int i296 = (i294 - (~(-(-(((~((i295 ^ i2) | (i295 & i2))) | (~((i4 ^ (-51)) | (i4 & (-51))))) * (-1808)))))) - 1;
                    int i297 = (i295 ^ 50) | (i295 & 50);
                    int i298 = ~((i297 & i2) | (i297 ^ i2));
                    int i299 = (i4 ^ alpha) | (i4 & alpha);
                    int i300 = ~((i299 ^ (-51)) | (i299 & (-51)));
                    int i301 = -(-(((i298 ^ i300) | (i298 & i300)) * 904));
                    int i302 = (i296 ^ i301) + ((i301 & i296) << 1);
                    int i303 = ~((i295 & (-51)) | (i295 ^ (-51)));
                    int i304 = ~((50 ^ i2) | (50 & i2));
                    int i305 = (i303 & i304) | (i303 ^ i304);
                    int i306 = ~(alpha | i4);
                    int i307 = ((i306 & i305) | (i305 ^ i306)) * 904;
                    Object[] objArr80 = new Object[1];
                    d((byte) ((i302 & i307) + (i307 | i302)), i290, i292, packedPositionChild, (short) (6 - (~TextUtils.getOffsetAfter("", 0))), objArr80);
                    Object[] objArr81 = {(String) objArr80[0]};
                    f6 = rV4669.f(1555759462);
                    if (f6 == null) {
                        int packedPositionType2 = 5202 - ExpandableListView.getPackedPositionType(0L);
                        char c9 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        int jumpTapTimeout5 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 50;
                        Object[] objArr82 = new Object[1];
                        b((byte) 1, 0, 1, objArr82);
                        f6 = rV4669.g(packedPositionType2, c9, jumpTapTimeout5, -719332350, (String) objArr82[0], new Class[]{String.class});
                    }
                    long longValue13 = ((Long) ((Method) f6).invoke(null, objArr81)).longValue();
                    long j30 = longValue13 ^ (-1);
                    long myUid = Process.myUid();
                    long j31 = myUid ^ (-1);
                    long e14 = com.fingerprintjs.android.fpjs_pro.g.e(68L, (-1885436713) | ((j30 | j31) ^ (-1)), ((-68) * ((((-1885436713) | j31) | longValue13) ^ (-1))) + ((((((-1885436713) | j30) | j31) ^ (-1)) | ((1885436712 | longValue13) ^ (-1)) | ((myUid | longValue13) ^ (-1))) * (-68)) + ((-67) * longValue13) + 130095133128L, 162656278L);
                    int i308 = ((int) (e14 >> 32)) & ((((~(1895516919 | i4)) | (~(962223965 | i2)) | (~((-1895516920) | i2))) * 959) + (((~(i4 | (-1895516920))) | (~(962223965 | i4)) | (~(1895516919 | i2))) * 959) + 1247213929);
                    int i309 = ((int) e14) & ((((~((-671903773) | i2)) | (~((-2109130183) | i4))) * 959) + ((((~((-671903773) | i4)) | (~((-2109130183) | i2))) * 959) - 1274097481));
                    long j32 = (i308 & i309) | (i308 ^ i309);
                    if (j3 <= 0 && j32 > 0 && j32 + 100 < j3) {
                        j = (i + 41) % 128;
                        Object[] objArr83 = {r2, r4, null, r5};
                        int[] iArr7 = {i2};
                        int[] iArr8 = {(i2 & (-249)) | (i4 & 248)};
                        int b6 = com.fingerprintjs.android.fpjs_pro.g.b((~((-698200776) | i4)) | 142901829, 672, (((~(i2 | 698200775)) | (~((-588872859) | i4))) * (-672)) + ((((~(588872858 | i2)) | 698200775) * 672) - 206328095), -1390769612);
                        int i310 = b6 << 13;
                        int i311 = (b6 | i310) & (~(b6 & i310));
                        int i312 = i311 >>> 17;
                        int i313 = (i311 | i312) & (~(i311 & i312));
                        int[] iArr9 = {i313 ^ (i313 << 5)};
                        return objArr83;
                    }
                    int i314 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2124614648;
                    int i315 = -(Process.myPid() >> 22);
                    int i316 = (i315 & (-91)) + (i315 | (-91));
                    int i317 = (-1557879618) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b7 = (byte) ((-33) - (~(-(KeyEvent.getMaxKeyCode() >> 16))));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                    Object[] objArr84 = new Object[1];
                    d(b7, i314, i316, i317, (short) ((bitsPerPixel ^ (-79)) + ((bitsPerPixel & (-79)) << 1)), objArr84);
                    String str30 = (String) objArr84[0];
                    char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i318 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int i319 = (i318 ^ (-596686915)) + ((i318 & (-596686915)) << 1);
                    Object[] objArr85 = new Object[1];
                    c(scrollDefaultDelay3, i319, "眛ᨉﶷ꿻\uf580背縞쩒䅛띯씘", "뷷潇\ua9dc쬞", objArr85);
                    String str31 = (String) objArr85[0];
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 2124614648;
                    int i320 = 16777124 - (~Color.rgb(0, 0, 0));
                    int i321 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i322 = (i321 & (-1557879613)) + (i321 | (-1557879613));
                    int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                    Object[] objArr86 = new Object[1];
                    d((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 70), edgeSlop2, i320, i322, (short) (((maxKeyCode2 | (-120)) << 1) - (maxKeyCode2 ^ (-120))), objArr86);
                    String str32 = (String) objArr86[0];
                    char blue3 = (char) Color.blue(0);
                    int i323 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i324 = (i323 ^ 1) + ((i323 & 1) << 1);
                    Object[] objArr87 = new Object[1];
                    c(blue3, i324, "燱\uf717권ᮝ矐簇\ue1cd覛꺫抿痥l", "繽\ue82a䀬\ue0fc", objArr87);
                    String str33 = (String) objArr87[0];
                    char c10 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i325 = -(Process.myPid() >> 22);
                    int i326 = ((i325 | (-1172524290)) << 1) - (i325 ^ (-1172524290));
                    Object[] objArr88 = new Object[1];
                    c(c10, i326, "鱾ꢧ魋ꋅ\ue115澂똹幼蠏婜≎", "ﻱᲲኺ삒", objArr88);
                    String str34 = (String) objArr88[0];
                    int i327 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i328 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                    int i329 = ((i328 | (-1223301710)) << 1) - (i328 ^ (-1223301710));
                    Object[] objArr89 = new Object[1];
                    c((char) ((i327 ^ 64063) + ((i327 & 64063) << 1)), i329, "躋\uf107宍\ufffe\u17ff", "뉔ᗥ䂷诺", objArr89);
                    String str35 = (String) objArr89[0];
                    int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                    Object[] objArr90 = new Object[1];
                    c((char) ((minimumFlingVelocity2 ^ 43017) + ((minimumFlingVelocity2 & 43017) << 1)), ViewConfiguration.getScrollBarFadeDuration() >> 16, "⬄譏\uf0fc❗", "㻸앒ऊ⾨", objArr90);
                    strArr2 = new String[]{str30, str31, str32, str33, str34, str35, (String) objArr90[0]};
                    i5 = 0;
                    while (true) {
                        if (i5 < 7) {
                            i6 = 0;
                            break;
                        }
                        j = (i + 31) % 128;
                        Object[] objArr91 = {strArr2[i5]};
                        Object f21 = rV4669.f(-825459942);
                        if (f21 == null) {
                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 53;
                            strArr3 = strArr2;
                            Object[] objArr92 = new Object[1];
                            b((byte) 1, 0, 1, objArr92);
                            f21 = rV4669.g((Process.myTid() >> 22) + 5633, (char) (AndroidCharacter.getMirror('0') - '0'), bitsPerPixel2, 1198040702, (String) objArr92[0], new Class[]{String.class});
                        } else {
                            strArr3 = strArr2;
                        }
                        long longValue14 = ((Long) ((Method) f21).invoke(null, objArr91)).longValue();
                        long j33 = (949 * longValue14) - 290825535286L;
                        long j34 = longValue14 ^ (-1);
                        long myUid2 = Process.myUid();
                        long e15 = com.fingerprintjs.android.fpjs_pro.g.e(948L, 307101938 | j34, ((-948) * (((myUid2 ^ (-1)) | ((-307101939) | j34)) ^ (-1))) + (((-307101939) | ((j34 | myUid2) ^ (-1))) * (-948)) + j33, 1043949006L);
                        if (((((int) (e15 >> 32)) & (((~((-699028917) | i2)) * 345) + (((~((-699062261) | i4)) | 39135234) * 345) + ((((~((-699062261) | i2)) | 699028916) * 345) - 484646000))) | (((int) e15) & ((((-75035347) | i2) * 104) + ((~((-3171027) | i4)) * (-104)) + (((~(1362191063 | i2)) | (-1434055384)) * 104) + 2005432269))) != 0) {
                            i6 = ((i5 | 90) << 1) - (i5 ^ 90);
                            break;
                        }
                        i5++;
                        strArr2 = strArr3;
                    }
                    if (i6 == 0) {
                        Object[] objArr93 = {r3, new int[1], null, r4};
                        int[] iArr10 = {i2};
                        int[] iArr11 = {(i6 | i2) & (~(i2 & i6))};
                        int freeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i330 = ((~((~freeMemory) | (-719407235))) * 184) + ((freeMemory | 18130525) * (-184)) + ((((~(567666399 | r1)) | 169871360) * 184) - 863436231);
                        int i331 = -(-((i330 & 16) + (i330 | 16)));
                        int i332 = ((i331 | 1390769596) << 1) - (i331 ^ 1390769596);
                        int i333 = i332 << 13;
                        int i334 = (i333 | i332) & (~(i332 & i333));
                        int i335 = i334 ^ (i334 >>> 17);
                        ((int[]) objArr93[1])[0] = i335 ^ (i335 << 5);
                        return objArr93;
                    }
                    try {
                        int i336 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i337 = (i336 & 2124614715) + (i336 | 2124614715);
                        int i338 = (-92) - (~(-View.resolveSizeAndState(0, 0, 0)));
                        int indexOf6 = TextUtils.indexOf((CharSequence) "", '0');
                        int i339 = (indexOf6 & (-1557879599)) + (indexOf6 | (-1557879599));
                        int i340 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr94 = new Object[1];
                        d((byte) (((i340 | 44) << 1) - (i340 ^ 44)), i337, i338, i339, (short) ((-31) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr94);
                        try {
                            Object[] objArr95 = {(String) objArr94[0]};
                            Object f22 = rV4669.f(-417469134);
                            if (f22 == null) {
                                int i341 = 6203 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                char myTid5 = (char) (Process.myTid() >> 22);
                                int defaultSize3 = 51 - View.getDefaultSize(0, 0);
                                Object[] objArr96 = new Object[1];
                                b((byte) (-bArr[6]), 1, 0, objArr96);
                                f22 = rV4669.g(i341, myTid5, defaultSize3, 1857630294, (String) objArr96[0], new Class[]{String.class});
                            }
                            Object invoke8 = ((Method) f22).invoke(null, objArr95);
                            if (invoke8 != null) {
                                int i342 = 2124614747 - (~(-AndroidCharacter.getMirror('0')));
                                int i343 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                int i344 = (i343 ^ (-91)) + ((i343 & (-91)) << 1);
                                int i345 = (-1557879588) - (~(-ExpandableListView.getPackedPositionGroup(0L)));
                                int i346 = -(-View.getDefaultSize(0, 0));
                                Object[] objArr97 = new Object[1];
                                d((byte) ((i346 & (-6)) + (i346 | (-6))), i342, i344, i345, (short) (111 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr97);
                                try {
                                    Object[] objArr98 = {invoke8, new String[]{(String) objArr97[0]}};
                                    Object f23 = rV4669.f(-41701482);
                                    if (f23 == null) {
                                        int i347 = 5478 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        char lastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 53;
                                        Object[] objArr99 = new Object[1];
                                        b((byte) 1, 0, 1, objArr99);
                                        f23 = rV4669.g(i347, lastIndexOf3, bitsPerPixel3, 1948742386, (String) objArr99[0], new Class[]{String.class, String[].class});
                                    }
                                    long longValue15 = ((Long) ((Method) f23).invoke(null, objArr98)).longValue();
                                    long j35 = longValue15 ^ (-1);
                                    long j36 = j35 | (-1165457632);
                                    long e16 = com.fingerprintjs.android.fpjs_pro.g.e(623L, (j36 ^ (-1)) | ((j35 | j6) ^ (-1)) | (((-1165457632) | j6) ^ (-1)), ((-623) * (j2 | ((longValue15 | 1165457631) ^ (-1)))) + (((j36 | j6) ^ (-1)) * 623) + (((-622) * longValue15) - 727245562368L), 1463300823L);
                                    int myUid3 = Process.myUid();
                                    int i348 = ~myUid3;
                                    int i349 = ((int) (e16 >> 32)) & ((((~(myUid3 | (-1648646726))) | (~(i348 | (-482059419))) | (~(1919285829 | i348))) * 568) + (((~(482059418 | myUid3)) | (~((-1919285830) | myUid3)) | (~(i348 | (-211420315)))) * (-568)) + (((~(482059418 | i348)) | 1648646725 | (~((-1919285830) | i348))) * (-1136)) + 1738041050);
                                    int i350 = (int) e16;
                                    int nextInt = new Random().nextInt();
                                    int i351 = ~nextInt;
                                    int i352 = i350 & ((((~(nextInt | (-149896283))) | (-1287330128)) * 519) + (((~(i351 | (-4465681))) | (~((-145430603) | nextInt))) * (-519)) + (((~(1287330127 | i351)) | (-149896283)) * 519) + 1453938690);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            int mode3 = 2124614706 - View.MeasureSpec.getMode(0);
                            int i353 = (-90) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i354 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i355 = (i354 & (-1557879575)) + (i354 | (-1557879575));
                            byte b8 = (byte) (85 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))));
                            int threadPriority4 = Process.getThreadPriority(0);
                            Object[] objArr100 = new Object[1];
                            d(b8, mode3, i353, i355, (short) ((-113) - (~(-(-(((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6))))), objArr100);
                            try {
                                Object[] objArr101 = {(String) objArr100[0]};
                                Object f24 = rV4669.f(-417469134);
                                if (f24 == null) {
                                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 6202;
                                    char mode4 = (char) View.MeasureSpec.getMode(0);
                                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 51;
                                    Object[] objArr102 = new Object[1];
                                    b((byte) (-bArr[6]), 1, 0, objArr102);
                                    f24 = rV4669.g(edgeSlop3, mode4, capsMode2, 1857630294, (String) objArr102[0], new Class[]{String.class});
                                }
                                invoke2 = ((Method) f24).invoke(null, objArr101);
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
                    } catch (Exception unused) {
                    }
                    if (invoke2 != null) {
                        i = (j + 109) % 128;
                        int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 2124614715;
                        int keyCodeFromString5 = KeyEvent.keyCodeFromString("");
                        int i356 = (keyCodeFromString5 ^ (-91)) + ((keyCodeFromString5 & (-91)) << 1);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1557879558;
                        int i357 = -(ViewConfiguration.getEdgeSlop() >> 16);
                        int i358 = i357 * (-743);
                        int i359 = ((i358 | (-49038)) << 1) - (i358 ^ (-49038));
                        int i360 = (i357 ^ 66) | (i357 & 66);
                        int i361 = (~i360) | (~(i357 | i2));
                        int i362 = ~((i2 ^ 66) | (i2 & 66));
                        int i363 = (((i361 & i362) | (i361 ^ i362)) * (-744)) + i359;
                        int i364 = ~i357;
                        int i365 = ((~((i364 & (-67)) | (i364 ^ (-67)))) | i4) * 744;
                        int i366 = (i363 & i365) + (i365 | i363);
                        int i367 = ((i360 ^ i2) | (i360 & i2)) * 744;
                        int rgb4 = Color.rgb(0, 0, 0);
                        Object[] objArr103 = new Object[1];
                        d((byte) (((i366 | i367) << 1) - (i367 ^ i366)), edgeSlop4, i356, keyRepeatTimeout, (short) (((rgb4 | 16777122) << 1) - (rgb4 ^ 16777122)), objArr103);
                        if (invoke2.equals((String) objArr103[0])) {
                            char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i368 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i369 = (i368 ^ (-2025185444)) + ((i368 & (-2025185444)) << 1);
                            Object[] objArr104 = new Object[1];
                            c(pressedStateDuration3, i369, "뙎\uf3f3ൊᒞ퉧９䤵ϟ쬝姜\u0a77痘禡ᆘ䒱䡵遟핲뺇\ue731ꖬ㣥墠", "尩䨟䦇뱌", objArr104);
                            try {
                                Object[] objArr105 = {(String) objArr104[0]};
                                Object f25 = rV4669.f(-417469134);
                                if (f25 == null) {
                                    int i370 = 6203 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                    char lastIndexOf4 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                    int indexOf7 = 51 - TextUtils.indexOf("", "", 0);
                                    Object[] objArr106 = new Object[1];
                                    b((byte) (-bArr[6]), 1, 0, objArr106);
                                    f25 = rV4669.g(i370, lastIndexOf4, indexOf7, 1857630294, (String) objArr106[0], new Class[]{String.class});
                                }
                                String str36 = (String) ((Method) f25).invoke(null, objArr105);
                                if (str36 != null && (parseInt = Integer.parseInt(str36)) != 0) {
                                    i7 = ((parseInt & 170) << 1) + (parseInt ^ 170);
                                    if (i7 == 0) {
                                        Object[] objArr107 = {r4, r5, null, r6};
                                        int[] iArr12 = {i2};
                                        int[] iArr13 = {(i7 | i2) & (~(i2 & i7))};
                                        int i371 = ~((-640177228) | i2);
                                        int i372 = (((~(i2 | (-638078979))) | (~((-2098250) | i4)) | (~(i4 | (-8817429)))) * 140) + ((i371 | (~((-646896407) | i2))) * 140) + ((2098249 | i371) * (-280)) + 346388573;
                                        int i373 = (i372 & 16) + (i372 | 16);
                                        int i374 = ((i373 | 1390769596) << 1) - (i373 ^ 1390769596);
                                        int i375 = i374 << 13;
                                        int i376 = (i375 & (~i374)) | ((~i375) & i374);
                                        int i377 = i376 >>> 17;
                                        int i378 = (i376 | i377) & (~(i376 & i377));
                                        int[] iArr14 = {i378 ^ (i378 << 5)};
                                        return objArr107;
                                    }
                                    int size3 = View.MeasureSpec.getSize(0) + 2124614715;
                                    int i379 = -(-View.getDefaultSize(0, 0));
                                    int i380 = ((i379 | (-91)) << 1) - (i379 ^ (-91));
                                    int i381 = -Drawable.resolveOpacity(0, 0);
                                    int i382 = (i381 & (-1557879600)) + (i381 | (-1557879600));
                                    int i383 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int component97 = com.fingerprintjs.android.fpjs_pro.u.component9();
                                    int i384 = i383 * (-830);
                                    int i385 = (i384 ^ 36608) + ((i384 & 36608) << 1);
                                    int i386 = ~component97;
                                    int i387 = i383 | 44;
                                    int i388 = ((~(((-45) ^ i386) | ((-45) & i386))) | (~((i387 ^ component97) | (i387 & component97)))) * (-831);
                                    int i389 = (i385 & i388) + (i385 | i388);
                                    int i390 = ((-45) & i383) | ((-45) ^ i383);
                                    int i391 = (~((i390 & component97) | (i390 ^ component97))) * (-1662);
                                    Object[] objArr108 = new Object[1];
                                    d((byte) ((((~((i383 & component97) | (i383 ^ component97))) | (~(i386 | (~i383))) | (~((component97 & 44) | (component97 ^ 44)))) * 831) + (i389 & i391) + (i391 | i389)), size3, i380, i382, (short) ((-31) - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))))), objArr108);
                                    Object[] objArr109 = {(String) objArr108[0]};
                                    Object f26 = rV4669.f(-417469134);
                                    if (f26 == null) {
                                        int blue4 = 6202 - Color.blue(0);
                                        char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                                        int i392 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50;
                                        Object[] objArr110 = new Object[1];
                                        b((byte) (-bArr[6]), 1, 0, objArr110);
                                        f26 = rV4669.g(blue4, deadChar3, i392, 1857630294, (String) objArr110[0], new Class[]{String.class});
                                    }
                                    Object invoke9 = ((Method) f26).invoke(null, objArr109);
                                    if (invoke9 != null) {
                                        int i393 = -Color.alpha(0);
                                        int i394 = i393 * (-344);
                                        int i395 = (i394 ^ (-723016480)) + ((i394 & (-723016480)) << 1);
                                        int i396 = ~i393;
                                        int i397 = ((-2124614701) & i396) | (i396 ^ (-2124614701));
                                        int i398 = ((~i397) | (~((i396 ^ i2) | (i396 & i2)))) * 345;
                                        int i399 = ((i395 | i398) << 1) - (i395 ^ i398);
                                        int i400 = ~((i396 & i4) | (i396 ^ i4));
                                        int i401 = ~(i393 | (-2124614701));
                                        int i402 = -(-(((i401 & i400) | (i400 ^ i401)) * 345));
                                        int i403 = (i399 ^ i402) + ((i402 & i399) << 1);
                                        int i404 = (~((i397 ^ i2) | (i397 & i2))) * 345;
                                        int i405 = (i403 ^ i404) + ((i404 & i403) << 1);
                                        int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                        int i406 = (combineMeasuredStates2 ^ (-91)) + ((combineMeasuredStates2 & (-91)) << 1);
                                        int i407 = -View.resolveSizeAndState(0, 0, 0);
                                        int i408 = ((i407 | (-1557879587)) << 1) - (i407 ^ (-1557879587));
                                        int i409 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        Object[] objArr111 = new Object[1];
                                        d((byte) (((i409 | (-5)) << 1) - (i409 ^ (-5))), i405, i406, i408, (short) (110 - (~(-(-(ViewConfiguration.getTouchSlop() >> 8))))), objArr111);
                                        Object[] objArr112 = {invoke9, new String[]{(String) objArr111[0]}};
                                        Object f27 = rV4669.f(-41701482);
                                        if (f27 == null) {
                                            int i410 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5477;
                                            char combineMeasuredStates3 = (char) View.combineMeasuredStates(0, 0);
                                            int windowTouchSlop3 = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            Object[] objArr113 = new Object[1];
                                            b((byte) 1, 0, 1, objArr113);
                                            f27 = rV4669.g(i410, combineMeasuredStates3, windowTouchSlop3, 1948742386, (String) objArr113[0], new Class[]{String.class, String[].class});
                                        }
                                        long longValue16 = ((Long) ((Method) f27).invoke(null, objArr112)).longValue();
                                        long j37 = (509899185 | (longValue16 ^ (-1))) ^ (-1);
                                        long j38 = (1512 * j37) + ((-755) * longValue16) + 384973885430L;
                                        long j39 = (-509899186) | longValue16;
                                        long e17 = com.fingerprintjs.android.fpjs_pro.g.e(756L, j39 | j2, ((-756) * (j37 | ((j39 | j6) ^ (-1)))) + j38, 807742377L);
                                        int i411 = (~(890153367 | i4)) | (-1968155072);
                                        int i412 = ~((-889585814) | i2);
                                        int i413 = ((int) (e17 >> 32)) & (((i412 | (~((-1078001705) | i4))) * 502) + ((i411 | i412) * (-502)) + 1265858346);
                                        int i414 = (int) e17;
                                        int i415 = ~Process.myPid();
                                        int i416 = i414 & ((((~(1755470282 | i415)) | (~(i415 | 318243872))) * 590) + (((~((-318243873) | i415)) | 10485760 | (~((-1755470283) | i415))) * (-1180)) + ((((~(r4 | 2063228394)) | r6) * 590) - 2011554321));
                                        if (((i413 & i416) | (i413 ^ i416)) != 1) {
                                            int i417 = -Drawable.resolveOpacity(0, 0);
                                            int i418 = ((i417 | 2124614648) << 1) - (i417 ^ 2124614648);
                                            int i419 = -(-Drawable.resolveOpacity(0, 0));
                                            int i420 = (i419 ^ (-91)) + ((i419 & (-91)) << 1);
                                            int i421 = (-1557879552) - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                            int i422 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int i423 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                            Object[] objArr114 = new Object[1];
                                            d((byte) ((i422 ^ 47) + ((i422 & 47) << 1)), i418, i420, i421, (short) (((i423 | (-57)) << 1) - (i423 ^ (-57))), objArr114);
                                            String str37 = (String) objArr114[0];
                                            int i424 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                            int i425 = (i424 ^ 2124614648) + ((i424 & 2124614648) << 1);
                                            int i426 = -(-TextUtils.indexOf("", "", 0, 0));
                                            int i427 = ((i426 | (-91)) << 1) - (i426 ^ (-91));
                                            int i428 = -((byte) KeyEvent.getModifierMetaStateMask());
                                            int i429 = (i428 & (-1557879540)) + (i428 | (-1557879540));
                                            byte b9 = (byte) (65 - (~(-View.resolveSize(0, 0))));
                                            int jumpTapTimeout6 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                            Object[] objArr115 = new Object[1];
                                            d(b9, i425, i427, i429, (short) ((jumpTapTimeout6 ^ (-40)) + ((jumpTapTimeout6 & (-40)) << 1)), objArr115);
                                            String str38 = (String) objArr115[0];
                                            int i430 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i431 = (i430 & 2124614648) + (i430 | 2124614648);
                                            int resolveSize2 = (-91) - View.resolveSize(0, 0);
                                            int keyRepeatTimeout2 = (-1557879523) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int i432 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            Object[] objArr116 = new Object[1];
                                            d((byte) ((i432 ^ 105) + ((i432 & 105) << 1)), i431, resolveSize2, keyRepeatTimeout2, (short) ((-88) - TextUtils.indexOf("", "", 0)), objArr116);
                                            String str39 = (String) objArr116[0];
                                            Object[] objArr117 = new Object[1];
                                            d((byte) ((-115) - (ViewConfiguration.getPressedStateDuration() >> 16)), 2124614648 - (~TextUtils.lastIndexOf("", '0', 0)), (-92) - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-1557879507) - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), (short) ((ViewConfiguration.getTapTimeout() >> 16) - 88), objArr117);
                                            String str40 = (String) objArr117[0];
                                            int i433 = 2124614647 - (~(-Color.argb(0, 0, 0, 0)));
                                            int offsetAfter = (-91) - TextUtils.getOffsetAfter("", 0);
                                            int minimumFlingVelocity3 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                            int i434 = (minimumFlingVelocity3 ^ (-1557879675)) + ((minimumFlingVelocity3 & (-1557879675)) << 1);
                                            int i435 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i436 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                            Object[] objArr118 = new Object[1];
                                            d((byte) (((i435 | 52) << 1) - (i435 ^ 52)), i433, offsetAfter, i434, (short) ((i436 & 93) + (i436 | 93)), objArr118);
                                            String str41 = (String) objArr118[0];
                                            int i437 = -View.resolveSize(0, 0);
                                            int i438 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int i439 = (i438 & 2007469613) + (i438 | 2007469613);
                                            Object[] objArr119 = new Object[1];
                                            c((char) ((i437 ^ 14280) + ((i437 & 14280) << 1)), i439, "튏ꑺ뇙ﮓ쮯嬑\ued41숟烡㌃䆊шᖧ쿾潼冧멬", "Ⱛꞎ졷謷", objArr119);
                                            String str42 = (String) objArr119[0];
                                            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            int i440 = -View.MeasureSpec.getSize(0);
                                            int i441 = ((i440 | (-510938007)) << 1) - (i440 ^ (-510938007));
                                            Object[] objArr120 = new Object[1];
                                            c(scrollBarFadeDuration2, i441, "鼜ཇ⿂\ue4f8욷\uf2f1땨蓘\ud9a9躒≓\u0873縷\uf246䤁艈喇\uef1b橋淶ꋼ", "植讴磡\uefda", objArr120);
                                            String str43 = (String) objArr120[0];
                                            int indexOf8 = TextUtils.indexOf("", "");
                                            Object[] objArr121 = new Object[1];
                                            c((char) ((indexOf8 ^ 17319) + ((indexOf8 & 17319) << 1)), Color.red(0), "嬕소⻎먳앟豢翽ꓚ焥ᄲ쓨牲鵽\u0d80ᡫ㔘", "턚ѝ\ua7d3╃", objArr121);
                                            String str44 = (String) objArr121[0];
                                            int tapTimeout2 = 2124614648 - (ViewConfiguration.getTapTimeout() >> 16);
                                            int i442 = (-93) - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                                            int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) - 1557879500;
                                            int i443 = -TextUtils.indexOf("", "");
                                            int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
                                            Object[] objArr122 = new Object[1];
                                            d((byte) ((i443 ^ (-119)) + ((i443 & (-119)) << 1)), tapTimeout2, i442, pressedStateDuration4, (short) ((tapTimeout3 ^ 74) + ((tapTimeout3 & 74) << 1)), objArr122);
                                            String str45 = (String) objArr122[0];
                                            char minimumFlingVelocity4 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32530);
                                            int indexOf9 = TextUtils.indexOf("", "", 0, 0);
                                            int i444 = ((indexOf9 | (-1823101621)) << 1) - (indexOf9 ^ (-1823101621));
                                            Object[] objArr123 = new Object[1];
                                            c(minimumFlingVelocity4, i444, "栻憺禿ᱠᨦﰇ\uf7ed䴻成覶삁ᗮ垝", "䬯喭ና坿", objArr123);
                                            String str46 = (String) objArr123[0];
                                            int i445 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                            Object[] objArr124 = new Object[1];
                                            c((char) ((i445 ^ (-1)) + (i445 << 1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 465030703, "탇鶃署莩ꤳ蝾ꀬ㖧틓", "톔䠱탤뢀", objArr124);
                                            String str47 = (String) objArr124[0];
                                            int i446 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                            int i447 = (i446 & 2124614648) + (i446 | 2124614648);
                                            int i448 = -KeyEvent.getDeadChar(0, 0);
                                            int i449 = ((i448 | (-91)) << 1) - (i448 ^ (-91));
                                            int i450 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            int i451 = (i450 & (-1557879474)) + (i450 | (-1557879474));
                                            int capsMode3 = TextUtils.getCapsMode("", 0, 0);
                                            Object[] objArr125 = new Object[1];
                                            d((byte) ((capsMode3 ^ (-93)) + ((capsMode3 & (-93)) << 1)), i447, i449, i451, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 73), objArr125);
                                            String[] strArr5 = {str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, (String) objArr125[0]};
                                            for (int i452 = 0; i452 < 12; i452++) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(strArr5[i452]);
                                                int i453 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                int i454 = ((i453 | 2124614716) << 1) - (i453 ^ 2124614716);
                                                int i455 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 92;
                                                int minimumFlingVelocity5 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                Object[] objArr126 = new Object[1];
                                                d((byte) (View.resolveSizeAndState(0, 0, 0) + 74), i454, i455, ((minimumFlingVelocity5 | (-1557879743)) << 1) - (minimumFlingVelocity5 ^ (-1557879743)), (short) ((-122) - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)))), objArr126);
                                                sb.append((String) objArr126[0]);
                                                Object[] objArr127 = {sb.toString()};
                                                Object f28 = rV4669.f(-668483483);
                                                if (f28 == null) {
                                                    int maximumFlingVelocity = 6046 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                                                    int green2 = Color.green(0) + 52;
                                                    Object[] objArr128 = new Object[1];
                                                    b((byte) 1, 0, 1, objArr128);
                                                    f28 = rV4669.g(maximumFlingVelocity, packedPositionType3, green2, 1367547137, (String) objArr128[0], new Class[]{String.class});
                                                }
                                                long longValue17 = ((Long) ((Method) f28).invoke(null, objArr127)).longValue();
                                                long j40 = longValue17 ^ (-1);
                                                long j41 = j40 | 1405431354;
                                                long myPid7 = Process.myPid();
                                                long e18 = com.fingerprintjs.android.fpjs_pro.g.e(623L, (j41 ^ (-1)) | ((j40 | myPid7) ^ (-1)) | ((1405431354 | myPid7) ^ (-1)), ((-623) * ((myPid7 ^ (-1)) | (((-1405431355) | longValue17) ^ (-1)))) + (((j41 | myPid7) ^ (-1)) * 623) + ((-622) * longValue17) + 876989164896L, 534118653L);
                                                int i456 = ((((~(((int) SystemClock.elapsedRealtime()) | (-1082230021))) | 86245536) * 366) + ((((~((-1216605448) | r6)) | 220620963) * (-366)) - 920974860)) & ((int) (e18 >> 32));
                                                int i457 = (int) e18;
                                                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                int a8 = k84.a(~(elapsedCpuTime3 | (-2625538)), -1504, (((~((-75373868) | elapsedCpuTime3)) | 72748330) * 1504) + 1320243365, -501808400) & i457;
                                                if (((a8 & i456) | (i456 ^ a8)) != 0) {
                                                    int i458 = i + 21;
                                                    j = i458 % 128;
                                                    i8 = i458 % 2 == 0 ? i452 / 68 : (i452 ^ 110) + ((i452 & 110) << 1);
                                                    if (i8 == 0) {
                                                        Object[] objArr129 = {r3, new int[1], null, r4};
                                                        int[] iArr15 = {i2};
                                                        int[] iArr16 = {(i8 | i2) & (~(i2 & i8))};
                                                        int i459 = ~hdi.b(2146148817);
                                                        int i460 = (((~((-340345274) | i459)) | (-946728361)) * 68) + ((~((-673491969) | i459)) * (-68)) + ((((~(r0 | 340345273)) | ((~((-273236393) | i459)) | (-1013837242))) * (-68)) - 428549411);
                                                        int i461 = (i460 & 16) + (i460 | 16);
                                                        int i462 = (i461 & 1390769596) + (i461 | 1390769596);
                                                        int i463 = i462 ^ (i462 << 13);
                                                        int i464 = i463 >>> 17;
                                                        int i465 = (i463 | i464) & (~(i463 & i464));
                                                        int i466 = i465 << 5;
                                                        ((int[]) objArr129[1])[0] = (i465 | i466) & (~(i465 & i466));
                                                        return objArr129;
                                                    }
                                                    long[] jArr = {472001035};
                                                    int i467 = 2124614647 - (~(-(-View.MeasureSpec.getSize(0))));
                                                    int i468 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    int i469 = ((i468 | (-91)) << 1) - (i468 ^ (-91));
                                                    int tapTimeout4 = (-1557879467) - (ViewConfiguration.getTapTimeout() >> 16);
                                                    int i470 = -Process.getGidForName("");
                                                    Object[] objArr130 = new Object[1];
                                                    d((byte) ((i470 & 118) + (i470 | 118)), i467, i469, tapTimeout4, (short) ((-42) - (~(-(ViewConfiguration.getScrollBarSize() >> 8)))), objArr130);
                                                    Object[] objArr131 = {(String) objArr130[0], 5, 1073741823L, jArr};
                                                    char c11 = 5;
                                                    Object f29 = rV4669.f(-1979363084);
                                                    if (f29 == null) {
                                                        int i471 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3160;
                                                        char resolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                                                        int i472 = 52 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        Object[] objArr132 = new Object[1];
                                                        b((byte) 1, 0, 1, objArr132);
                                                        f29 = rV4669.g(i471, resolveSizeAndState2, i472, 60919184, (String) objArr132[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                                    }
                                                    long longValue18 = ((Long) ((Method) f29).invoke(null, objArr131)).longValue();
                                                    long j42 = longValue18 ^ (-1);
                                                    long j43 = ((j2 | 710425180) | longValue18) ^ (-1);
                                                    long e19 = com.fingerprintjs.android.fpjs_pro.g.e(470L, (((j42 | 710425180) | j6) ^ (-1)) | j43, (((((-710425181) | j42) ^ (-1)) | ((j42 | j6) ^ (-1)) | j43) * (-470)) + ((710425180 | longValue18) * (-470)) + (471 * longValue18) + 334610259780L, 838249581L);
                                                    int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                                    int i473 = ~maxMemory4;
                                                    int i474 = ((int) (e19 >> 32)) & ((((~((-645991742) | i473)) | 8389904) * 859) + (((~(maxMemory4 | (-637601838))) | (~(791234669 | i473))) * 859) + ((791234669 | maxMemory4) * (-859)) + 1646849978);
                                                    int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                                    int i475 = ~freeMemory2;
                                                    int i476 = ((int) e19) & ((((~((-668920968) | i475)) | 629686273) * 859) + (((~(freeMemory2 | (-39234695))) | (~((-2106147378) | i475))) * 859) + ((((-2106147378) | freeMemory2) * (-859)) - 1514085486));
                                                    int i477 = ((i474 & i476) | (i474 ^ i476)) != 0 ? 240 : 0;
                                                    if (i477 != 0) {
                                                        Object[] objArr133 = {r3, new int[1], null, r4};
                                                        int[] iArr17 = {i2};
                                                        int[] iArr18 = {(i477 | i2) & (~(i2 & i477))};
                                                        int i478 = (((~((~((int) Runtime.getRuntime().freeMemory())) | (-600164384))) | 188002141) * 262) + ((((~((-600164384) | r1)) | 188002141) * 262) - 686245127);
                                                        int i479 = -(-((i478 ^ 16) + ((i478 & 16) << 1)));
                                                        int i480 = (i479 & 1390769596) + (i479 | 1390769596);
                                                        int i481 = (i480 << 13) ^ i480;
                                                        int i482 = i481 ^ (i481 >>> 17);
                                                        int i483 = i482 << 5;
                                                        ((int[]) objArr133[1])[0] = ((~i482) & i483) | ((~i483) & i482);
                                                        return objArr133;
                                                    }
                                                    long[] jArr2 = {472001035};
                                                    int i484 = 2124614647 - (~(ViewConfiguration.getPressedStateDuration() >> 16));
                                                    int i485 = (-92) - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                                    int indexOf10 = TextUtils.indexOf((CharSequence) "", '0') - 1557879437;
                                                    byte b10 = (byte) ((-51) - (~Color.red(0)));
                                                    int i486 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i487 = i486 * 503;
                                                    int i488 = ((i487 | 56839) << 1) - (i487 ^ 56839);
                                                    int i489 = (i486 ^ 113) | (i486 & 113);
                                                    int i490 = (i489 * (-502)) + i488;
                                                    int i491 = ~i486;
                                                    int i492 = ~(i491 | (-114));
                                                    int i493 = ~(i491 | i4);
                                                    int i494 = (i492 ^ i493) | (i492 & i493);
                                                    int i495 = i486 | 113;
                                                    int i496 = ~((i495 & i2) | (i495 ^ i2));
                                                    int i497 = -(-(((i496 & i494) | (i494 ^ i496)) * (-502)));
                                                    int i498 = (i490 ^ i497) + ((i497 & i490) << 1);
                                                    int i499 = (i491 ^ i4) | (i491 & i4);
                                                    int i500 = ~((i499 & 113) | (i499 ^ 113));
                                                    int i501 = ~(i489 | i2);
                                                    int i502 = -(-(((i500 & i501) | (i500 ^ i501)) * 502));
                                                    Object[] objArr134 = new Object[1];
                                                    d(b10, i484, i485, indexOf10, (short) (((i498 | i502) << 1) - (i502 ^ i498)), objArr134);
                                                    try {
                                                        bufferedInputStream2 = new BufferedInputStream(new FileInputStream((String) objArr134[0]));
                                                        j4 = 0;
                                                    } catch (IOException unused2) {
                                                        bufferedInputStream2 = null;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bufferedInputStream = null;
                                                    }
                                                    loop3: while (true) {
                                                        try {
                                                            try {
                                                                int read = bufferedInputStream2.read();
                                                                if (read != -1) {
                                                                    j4 = 1073741823 & (read ^ (j4 << c11));
                                                                    int i503 = 0;
                                                                    while (i503 < 1) {
                                                                        int i504 = i;
                                                                        int i505 = (i504 & 75) + (i504 | 75);
                                                                        j = i505 % 128;
                                                                        if (i505 % 2 == 0) {
                                                                            break loop3;
                                                                        }
                                                                        if (j4 == jArr2[i503]) {
                                                                            i9 = i503 + 1;
                                                                            try {
                                                                                bufferedInputStream2.close();
                                                                                break loop3;
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                        } else {
                                                                            int i506 = ((i503 | 55) << 1) - (i503 ^ 55);
                                                                            i503 = (i506 ^ (-54)) + ((i506 & (-54)) << 1);
                                                                        }
                                                                    }
                                                                    c11 = 5;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                bufferedInputStream = bufferedInputStream2;
                                                                if (bufferedInputStream != null) {
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                    } catch (Exception unused4) {
                                                                    }
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (IOException unused5) {
                                                        }
                                                        try {
                                                            break;
                                                        } catch (Exception unused6) {
                                                            i9 = 0;
                                                            if (i9 == 0) {
                                                            }
                                                        }
                                                    }
                                                    if (i9 == 0) {
                                                        j = (i + 3) % 128;
                                                        Object[] objArr135 = {r1, new int[1], null, r2};
                                                        int[] iArr19 = {i2};
                                                        int[] iArr20 = {(~(i2 & 242)) & (i2 | 242)};
                                                        int myUid4 = Process.myUid();
                                                        int i507 = (((~(myUid4 | 343500857)) | (~((~myUid4) | 943572776))) * 627) + (((~((-943572777) | myUid4)) | 343500857) * (-627)) + (((-71313426) | myUid4) * (-627)) + 828389876;
                                                        int i508 = (((i507 | 16) << 1) - (i507 ^ 16)) + 1390769596;
                                                        int i509 = (i508 << 13) ^ i508;
                                                        int i510 = i509 >>> 17;
                                                        int i511 = (i509 | i510) & (~(i509 & i510));
                                                        int i512 = i511 << 5;
                                                        ((int[]) objArr135[1])[0] = ((~i511) & i512) | ((~i512) & i511);
                                                        return objArr135;
                                                    }
                                                    Object f30 = rV4669.f(-1535780713);
                                                    if (f30 == null) {
                                                        int mirror4 = AndroidCharacter.getMirror('0') + 5894;
                                                        char minimumFlingVelocity6 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13918);
                                                        int maximumDrawingCacheSize2 = 52 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        Object[] objArr136 = new Object[1];
                                                        b((byte) 1, 0, 1, objArr136);
                                                        f30 = rV4669.g(mirror4, minimumFlingVelocity6, maximumDrawingCacheSize2, 768673267, (String) objArr136[0], new Class[0]);
                                                    }
                                                    long longValue19 = ((Long) ((Method) f30).invoke(null, null)).longValue();
                                                    long j44 = (408 * longValue19) + 437531593746L;
                                                    long j45 = longValue19 ^ (-1);
                                                    long myPid8 = Process.myPid();
                                                    long j46 = ((-538169242) | myPid8) ^ (-1);
                                                    long j47 = (538169241 | longValue19) ^ (-1);
                                                    long e20 = com.fingerprintjs.android.fpjs_pro.g.e(407L, j47 | ((538169241 | myPid8) ^ (-1)) | ((longValue19 | myPid8) ^ (-1)), ((((j45 | (myPid8 ^ (-1))) ^ (-1)) | j47 | j46) * 407) + ((-814) * (((j45 | (-538169242)) ^ (-1)) | j46)) + j44, -1525079192L);
                                                    int i513 = ((int) (e20 >> 32)) & ((((~((-1035078931) | i2)) | (-402147481)) * MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE) + (((~((-402147481) | i2)) | (~(1035078930 | i4))) * (-301)) + (((~(1073368474 | i2)) * (-301)) - 96579016));
                                                    int myUid5 = Process.myUid();
                                                    int i514 = ~myUid5;
                                                    int i515 = (~(1641494809 | i514)) | (-1845492608) | (~(204268399 | i514));
                                                    int i516 = ((int) e20) & ((((~((-204268400) | i514)) | (~(i514 | (-1641494810)))) * 590) + (i515 * (-1180)) + (((~(myUid5 | (-270602))) | i515) * 590) + 484173463);
                                                    if (((i516 & i513) | (i513 ^ i516)) != 0) {
                                                        objArr = new Object[]{r1, new int[1], null, r2};
                                                        int[] iArr21 = {i2};
                                                        int[] iArr22 = {(~(i2 & 264)) & (i2 | 264)};
                                                        int a9 = hdi.a();
                                                        int i517 = ~a9;
                                                        int i518 = (~((-551213560) | i517)) | 551047522;
                                                        int a10 = k84.a((~(a9 | 736026111)) | (~(i517 | (-166038))), 252, ((i518 | r1) * (-252)) - 1582871591, i3);
                                                        int i519 = (a10 & 1390769596) + (a10 | 1390769596);
                                                        int i520 = i519 << 13;
                                                        int i521 = (i520 | i519) & (~(i519 & i520));
                                                        int i522 = i521 >>> 17;
                                                        int i523 = ((~i521) & i522) | ((~i522) & i521);
                                                        int i524 = i523 << 5;
                                                        ((int[]) objArr[1])[0] = (i523 | i524) & (~(i523 & i524));
                                                    } else {
                                                        Object f31 = rV4669.f(155017945);
                                                        if (f31 == null) {
                                                            int i525 = 4634 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            char c12 = (char) (39356 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                            int tapTimeout5 = 51 - (ViewConfiguration.getTapTimeout() >> 16);
                                                            Object[] objArr137 = new Object[1];
                                                            b((byte) 1, 0, 1, objArr137);
                                                            f31 = rV4669.g(i525, c12, tapTimeout5, -2137407555, (String) objArr137[0], new Class[0]);
                                                        }
                                                        long longValue20 = ((Long) ((Method) f31).invoke(null, null)).longValue();
                                                        long j48 = longValue20 ^ (-1);
                                                        long j49 = (j2 | longValue20) ^ (-1);
                                                        long e21 = com.fingerprintjs.android.fpjs_pro.g.e(516L, ((longValue20 | 1117275073) ^ (-1)) | j49, (((((1117275073 | j48) | j6) ^ (-1)) | (((1117275073 | j2) | longValue20) ^ (-1))) * 516) + ((-516) * (((j48 | j6) ^ (-1)) | ((j2 | (-1117275074)) ^ (-1)) | j49)) + (517 * longValue20) + 575396663110L, 2105777598L);
                                                        int i526 = ~hdi.a();
                                                        int i527 = ((((int) e21) & ((((~((-2118784852) | i2)) | 671744257) * 464) + ((((-9814185) | i2) * (-464)) + (((((~((-681558442) | i4)) | 671744257) | (~(i4 | (-2118784852)))) * 464) + 578576325)))) | (((int) (e21 >> 32)) & ((((~(i526 | 93489724)) | 1530716135) * 160) + ((((~(i526 | 1530716135)) | 75628568) * (-160)) + 551449674)))) != 0 ? (~(i2 & 281)) & (i2 | 281) : i2;
                                                        if (i527 != i2) {
                                                            Object[] objArr138 = {r2, r5, null, r6};
                                                            int[] iArr23 = {i2};
                                                            int[] iArr24 = {i527};
                                                            int i528 = (((~((-25300847) | i2)) | 16781154 | (~(1270292479 | i4))) * 521) + ((1261772787 | i2) * 521) + (((~(i4 | 1261772787)) | 25300846) * (-1042)) + 1330286772;
                                                            int i529 = -(-(((i528 | 16) << 1) - (i528 ^ 16)));
                                                            int i530 = ((i529 | 1390769596) << 1) - (i529 ^ 1390769596);
                                                            int i531 = i530 << 13;
                                                            int i532 = (i531 & (~i530)) | ((~i531) & i530);
                                                            int i533 = i532 ^ (i532 >>> 17);
                                                            c3 = 0;
                                                            int[] iArr25 = {i533 ^ (i533 << 5)};
                                                            objArr = objArr138;
                                                        } else {
                                                            Object f32 = rV4669.f(331322532);
                                                            if (f32 == null) {
                                                                int argb2 = 4788 - Color.argb(0, 0, 0, 0);
                                                                char c13 = (char) (24796 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 51;
                                                                Object[] objArr139 = new Object[1];
                                                                b((byte) 0, 1, 0, objArr139);
                                                                f32 = rV4669.g(argb2, c13, scrollBarSize, -1709487680, (String) objArr139[0], new Class[0]);
                                                            }
                                                            long longValue21 = ((Long) ((Method) f32).invoke(null, null)).longValue();
                                                            long e22 = com.fingerprintjs.android.fpjs_pro.g.e(235L, (((longValue21 ^ (-1)) | (-882621132)) ^ (-1)) | (((longValue21 | 882621131) | j6) ^ (-1)), ((-470) * (longValue21 | ((882621131 | j6) ^ (-1)))) + ((-235) * (longValue21 | ((882621131 | j2) ^ (-1)))) + ((471 * longValue21) - 208298587152L), 1190870770L);
                                                            int a11 = ((int) (e22 >> 32)) & k84.a((~((-1243616651) | i4)) | 344096, 576, (((~(807234165 | i2)) | (-2050850816)) * 576) - 1771464918, -174063616);
                                                            int i534 = ((int) e22) & ((((~(hdi.b(2012011946) | (-961812185))) | (-1029062362)) * 196) + (((67250177 | r1) * (-196)) - 1308333567));
                                                            if (((i534 & a11) | (a11 ^ i534)) != 0) {
                                                                j = (i + 93) % 128;
                                                                objArr = new Object[]{r1, r2, null, r5};
                                                                int[] iArr26 = {i2};
                                                                int[] iArr27 = {i2 ^ 268};
                                                                int i535 = (((~(360397342 | i4)) | (-574672734)) * 494) + (((-570475842) | i4) * 494) + 1707563187;
                                                                int i536 = -(-((i535 & 16) + (i535 | 16)));
                                                                int i537 = (i536 ^ 1390769596) + ((i536 & 1390769596) << 1);
                                                                int i538 = i537 << 13;
                                                                int i539 = (i538 | i537) & (~(i537 & i538));
                                                                int i540 = i539 ^ (i539 >>> 17);
                                                                int[] iArr28 = {i540 ^ (i540 << 5)};
                                                            } else {
                                                                Object f33 = rV4669.f(585231097);
                                                                if (f33 == null) {
                                                                    int i541 = 4789 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                    char modifierMetaStateMask3 = (char) (24795 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                                                    int i542 = 51 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                    Object[] objArr140 = new Object[1];
                                                                    b((byte) 1, 0, 1, objArr140);
                                                                    f33 = rV4669.g(i541, modifierMetaStateMask3, i542, -1421527139, (String) objArr140[0], new Class[0]);
                                                                }
                                                                long longValue22 = ((Long) ((Method) f33).invoke(null, null)).longValue();
                                                                long j50 = (829 * longValue22) + 771113209750L;
                                                                long j51 = ((-930172751) | (longValue22 ^ (-1))) ^ (-1);
                                                                long freeMemory3 = ((int) Runtime.getRuntime().freeMemory()) ^ (-1);
                                                                long j52 = ((j51 | (((freeMemory3 | 930172750) | longValue22) ^ (-1))) * (-828)) + j50;
                                                                long j53 = 930172750 | longValue22;
                                                                long e23 = com.fingerprintjs.android.fpjs_pro.g.e(828L, j53 ^ (-1), ((-828) * (j53 | freeMemory3)) + j52, 652070953L);
                                                                int a12 = ((int) (e23 >> 32)) & k84.a((~(1525230010 | i2)) | 85382149, 220, ((88003599 | r5) * (-220)) - 1495702922, -785318964);
                                                                int uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                                                int a13 = ((int) e23) & k84.a(~(uptimeMillis3 | (-4259874)), -1504, (((~((-1153905464) | uptimeMillis3)) | 1149645590) * 1504) + 1320243365, -952616848);
                                                                if (((a13 & a12) | (a12 ^ a13)) == 0) {
                                                                    Object f34 = rV4669.f(-31125125);
                                                                    if (f34 == null) {
                                                                        int resolveOpacity3 = Drawable.resolveOpacity(0, 0) + 3975;
                                                                        char resolveSizeAndState3 = (char) (View.resolveSizeAndState(0, 0, 0) + 64933);
                                                                        int i543 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51;
                                                                        Object[] objArr141 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr141);
                                                                        f34 = rV4669.g(resolveOpacity3, resolveSizeAndState3, i543, 2004995103, (String) objArr141[0], new Class[0]);
                                                                    }
                                                                    long longValue23 = ((Long) ((Method) f34).invoke(null, null)).longValue();
                                                                    long j54 = ((-565) * longValue23) - 295565673816L;
                                                                    long j55 = (521279847 | longValue23) ^ (-1);
                                                                    long myUid6 = Process.myUid();
                                                                    long j56 = ((-566) * (j55 | ((521279847 | myUid6) ^ (-1)))) + j54;
                                                                    long j57 = longValue23 ^ (-1);
                                                                    long e24 = com.fingerprintjs.android.fpjs_pro.g.e(566L, (myUid6 | (521279847 | j57)) ^ (-1), (((j57 | (-521279848)) ^ (-1)) * 566) + j56, 995644436L);
                                                                    int a14 = ((int) (e24 >> 32)) & k84.a((~((-1090781185) | i2)) | 21892, 446, (((~((-1263992852) | i4)) | 173211667) * 446) + 384374654, -57007846);
                                                                    int maxMemory5 = (int) Runtime.getRuntime().maxMemory();
                                                                    int i544 = ~maxMemory5;
                                                                    int i545 = (((~((-852873482) | i544)) | 268521737) * (-1188)) - 1049100501;
                                                                    int i546 = (~(maxMemory5 | 852873481)) | 268521737;
                                                                    int i547 = ~((-584352929) | i544);
                                                                    if (((((int) e24) & ((((~(i544 | 852873481)) | 1184 | i547) * 594) + ((i546 | i547) * 594) + i545)) | a14) != 0) {
                                                                        objArr = new Object[]{r1, new int[1], null, r2};
                                                                        int[] iArr29 = {i2};
                                                                        int[] iArr30 = {i2 ^ 280};
                                                                        int a15 = hdi.a();
                                                                        int i548 = ~a15;
                                                                        int i549 = -(-k84.a((~(a15 | 1016983039)) | (~(i548 | (-882492899))) | 270090594, 757, ((~((-612402305) | a15)) * 1514) + ((404580735 | i548) * (-757)) + 284819106, 16));
                                                                        int i550 = (i549 & 1390769596) + (i549 | 1390769596);
                                                                        int i551 = i550 << 13;
                                                                        int i552 = (i551 | i550) & (~(i550 & i551));
                                                                        int i553 = i552 >>> 17;
                                                                        int i554 = ((~i552) & i553) | ((~i553) & i552);
                                                                        int i555 = i554 << 5;
                                                                        c2 = 0;
                                                                        ((int[]) objArr[1])[0] = ((~i554) & i555) | ((~i555) & i554);
                                                                    } else {
                                                                        objArr = new Object[]{r1, r2, null, r5};
                                                                        int[] iArr31 = {i2};
                                                                        int[] iArr32 = {i2};
                                                                        int a16 = k84.a(997654495 | i2, 744, ((289419138 | i4) * 744) + (((~(962768842 | i2)) | (-997654496) | (~(324304791 | i2))) * (-744)) + 1481997689, 1390769596);
                                                                        int i556 = a16 << 13;
                                                                        int i557 = ((~a16) & i556) | ((~i556) & a16);
                                                                        int i558 = i557 >>> 17;
                                                                        int i559 = (i557 | i558) & (~(i557 & i558));
                                                                        int i560 = i559 << 5;
                                                                        c2 = 0;
                                                                        int[] iArr33 = {((~i559) & i560) | ((~i560) & i559)};
                                                                    }
                                                                    if (((int[]) objArr[3])[c2] != ((int[]) objArr[c2])[c2]) {
                                                                        return objArr;
                                                                    }
                                                                    Object[] objArr142 = {2};
                                                                    Object f35 = rV4669.f(814053687);
                                                                    if (f35 == null) {
                                                                        int maximumFlingVelocity2 = 5098 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                        char packedPositionType4 = (char) (59615 - ExpandableListView.getPackedPositionType(0L));
                                                                        int indexOf11 = 52 - TextUtils.indexOf("", "", 0, 0);
                                                                        Object[] objArr143 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr143);
                                                                        f35 = rV4669.g(maximumFlingVelocity2, packedPositionType4, indexOf11, -1188977581, (String) objArr143[0], new Class[]{cls});
                                                                    }
                                                                    long longValue24 = ((Long) ((Method) f35).invoke(null, objArr142)).longValue();
                                                                    long j58 = ((-657) * longValue24) + 920993300008L;
                                                                    long j59 = ((-1397561913) | longValue24) ^ (-1);
                                                                    long j60 = ((longValue24 ^ (-1)) | 1397561912) ^ (-1);
                                                                    long j61 = (1397561912 | j6) ^ (-1);
                                                                    long e25 = com.fingerprintjs.android.fpjs_pro.g.e(658L, j60 | j61, (658 * j60) + ((-658) * (j59 | j60 | j61)) + j58, -1411109807L);
                                                                    int i561 = ((int) (e25 >> 32)) & ((((-1516918398) | i2) * 397) + (((~(645204457 | i4)) | (-2122276862) | (~(2082430868 | i4))) * (-397)) + 1628084778);
                                                                    int i562 = ((int) e25) & ((((-671678470) | i2) * 668) + ((1110857136 | (~((-1746883750) | i2))) * 1336) + (((~(1110857136 | i2)) | (-1746883750)) * (-668)) + 1829084489);
                                                                    if (((i562 & i561) | (i561 ^ i562)) == 2) {
                                                                        i = (j + 117) % 128;
                                                                        Object[] objArr144 = {r1, r2, null, r5};
                                                                        int[] iArr34 = {i2};
                                                                        int[] iArr35 = {(i2 & (-271)) | (i4 & 270)};
                                                                        int i563 = -(-com.fingerprintjs.android.fpjs_pro.g.b((~(i4 | (-657654150))) | 36896769, 983, (((~((-629419485) | i4)) | (-657654150)) * (-983)) + 1443320320, -16));
                                                                        int i564 = ((i563 | 1390769596) << 1) - (i563 ^ 1390769596);
                                                                        int i565 = i564 << 13;
                                                                        int i566 = (i565 | i564) & (~(i564 & i565));
                                                                        int i567 = i566 >>> 17;
                                                                        int i568 = (i566 | i567) & (~(i566 & i567));
                                                                        int i569 = i568 << 5;
                                                                        int[] iArr36 = {((~i568) & i569) | ((~i569) & i568)};
                                                                        return objArr144;
                                                                    }
                                                                    Object f36 = rV4669.f(1278214593);
                                                                    if (f36 == null) {
                                                                        int keyRepeatTimeout3 = 6666 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                        char tapTimeout6 = (char) (34590 - (ViewConfiguration.getTapTimeout() >> 16));
                                                                        int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52;
                                                                        Object[] objArr145 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr145);
                                                                        f36 = rV4669.g(keyRepeatTimeout3, tapTimeout6, keyRepeatDelay3, -980099931, (String) objArr145[0], new Class[0]);
                                                                    }
                                                                    long longValue25 = ((Long) ((Method) f36).invoke(null, null)).longValue();
                                                                    long j62 = ((-712) * longValue25) + 263659437594L;
                                                                    long j63 = (((-369270922) | j2) ^ (-1)) | (((-369270922) | longValue25) ^ (-1));
                                                                    long j64 = longValue25 ^ (-1);
                                                                    long j65 = ((j64 | 369270921) | j6) ^ (-1);
                                                                    long e26 = com.fingerprintjs.android.fpjs_pro.g.e(713L, (j64 | j2) ^ (-1), (1426 * j65) + ((-713) * (j63 | j65)) + j62, -860912614L);
                                                                    int i570 = ((int) (e26 >> 32)) & ((((~(1523725421 | i2)) | (-1607693808) | (~((-1250047078) | i4))) * 521) + (((-1334015464) | i2) * 521) + (((~(i4 | (-1334015464))) | (-1523725422)) * (-1042)) + 1382586100);
                                                                    int a17 = ((int) e26) & k84.a(~((-17301545) | i2), -1504, (((~((-1133428799) | i2)) | 1116127254) * 1504) + 1320243365, -2080647056);
                                                                    if (((a17 & i570) | (i570 ^ a17)) != 0) {
                                                                        Object[] objArr146 = {r1, new int[1], null, r2};
                                                                        int[] iArr37 = {i2};
                                                                        int[] iArr38 = {i2 ^ 272};
                                                                        int i571 = (~((int) Process.getElapsedCpuTime())) | 917958495;
                                                                        int a18 = k84.a(i571, -828, (((~i571) | 369115138) * (-828)) + 1832152349, 139576704);
                                                                        int i572 = -(-((a18 & 16) + (a18 | 16)));
                                                                        int i573 = (i572 & 1390769596) + (i572 | 1390769596);
                                                                        int i574 = i573 << 13;
                                                                        int i575 = (i574 | i573) & (~(i573 & i574));
                                                                        int i576 = i575 >>> 17;
                                                                        int i577 = (i575 | i576) & (~(i575 & i576));
                                                                        int i578 = i577 << 5;
                                                                        ((int[]) objArr146[1])[0] = ((~i577) & i578) | ((~i578) & i577);
                                                                        return objArr146;
                                                                    }
                                                                    long[] jArr3 = {624887784092251L};
                                                                    int i579 = 2124614647 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                    int lastIndexOf5 = (-92) - TextUtils.lastIndexOf("", '0', 0, 0);
                                                                    int i580 = (-1557879468) - (~TextUtils.getTrimmedLength(""));
                                                                    int i581 = -Drawable.resolveOpacity(0, 0);
                                                                    Object[] objArr147 = new Object[1];
                                                                    d((byte) ((i581 & 119) + (i581 | 119)), i579, lastIndexOf5, i580, (short) ((-42) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr147);
                                                                    Object[] objArr148 = {(String) objArr147[0], 3, 2251799813685247L, jArr3};
                                                                    Object f37 = rV4669.f(-1979363084);
                                                                    if (f37 == null) {
                                                                        int i582 = 3162 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                                        int i583 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51;
                                                                        Object[] objArr149 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr149);
                                                                        f37 = rV4669.g(i582, absoluteGravity2, i583, 60919184, (String) objArr149[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                                                    }
                                                                    long longValue26 = ((Long) ((Method) f37).invoke(null, objArr148)).longValue();
                                                                    long j66 = (-37310797) | j2;
                                                                    long e27 = com.fingerprintjs.android.fpjs_pro.g.e(369L, (((longValue26 ^ (-1)) | 37310796) ^ (-1)) | ((37310796 | j6) ^ (-1)) | ((j66 | longValue26) ^ (-1)), ((-369) * (longValue26 | (j66 ^ (-1)))) + ((37310796 | longValue26 | j2) * (-369)) + (370 * longValue26) + 13804994520L, 1511363965L);
                                                                    int i584 = ((int) (e27 >> 32)) & ((((~(1861741782 | i2)) | Integer.MIN_VALUE | (~((-138773507) | i4))) * 369) + (((~((-1861741783) | i4)) | (-424515372)) * (-369)) + ((((-285741866) | i4) * (-369)) - 802173004));
                                                                    int i585 = ~Process.myUid();
                                                                    int i586 = ((int) e27) & ((((~(i585 | 1943868932)) | (-1168474710)) * 494) + (((-69238866) | i585) * 494) + 263663159);
                                                                    if (((i586 & i584) | (i584 ^ i586)) != 0) {
                                                                        int i587 = j;
                                                                        i = ((i587 & 117) + (i587 | 117)) % 128;
                                                                        Object[] objArr150 = {r1, r2, null, r5};
                                                                        int[] iArr39 = {i2};
                                                                        int[] iArr40 = {(i2 & (-276)) | (i4 & 275)};
                                                                        int i588 = (((~((-53611137) | i4)) | (~(670498545 | i2))) * 318) + (((~((-670186225) | i2)) | (~(670498545 | i4))) * 318) + (((~((-616887410) | i2)) | (-670186225)) * (-318)) + 1517919647;
                                                                        int i589 = ((i588 | 16) << 1) - (i588 ^ 16);
                                                                        int i590 = (i589 ^ 1390769596) + ((i589 & 1390769596) << 1);
                                                                        int i591 = i590 ^ (i590 << 13);
                                                                        int i592 = i591 ^ (i591 >>> 17);
                                                                        int[] iArr41 = {i592 ^ (i592 << 5)};
                                                                        return objArr150;
                                                                    }
                                                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2124614648;
                                                                    int i593 = -KeyEvent.normalizeMetaState(0);
                                                                    int i594 = (i593 & (-91)) + (i593 | (-91));
                                                                    int i595 = (-1557879417) - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                                                                    int i596 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                                                    Object[] objArr151 = new Object[1];
                                                                    d((byte) (((byte) KeyEvent.getModifierMetaStateMask()) - 67), packedPositionGroup, i594, i595, (short) (((i596 | (-66)) << 1) - (i596 ^ (-66))), objArr151);
                                                                    Object[] objArr152 = {(String) objArr151[0]};
                                                                    Object f38 = rV4669.f(-668483483);
                                                                    if (f38 == null) {
                                                                        int mirror5 = 6094 - AndroidCharacter.getMirror('0');
                                                                        char threadPriority5 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                                        int keyCodeFromString6 = 52 - KeyEvent.keyCodeFromString("");
                                                                        Object[] objArr153 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr153);
                                                                        f38 = rV4669.g(mirror5, threadPriority5, keyCodeFromString6, 1367547137, (String) objArr153[0], new Class[]{String.class});
                                                                    }
                                                                    long longValue27 = ((Long) ((Method) f38).invoke(null, objArr152)).longValue();
                                                                    long j67 = longValue27 ^ (-1);
                                                                    long myTid6 = Process.myTid() ^ (-1);
                                                                    long e28 = com.fingerprintjs.android.fpjs_pro.g.e(184L, (((-189604318) | j67) ^ (-1)) | ((myTid6 | 189604317) ^ (-1)) | ((189604317 | longValue27) ^ (-1)), ((189604317 | j67 | myTid6) * 184) + ((-368) * (longValue27 | (-189604318))) + ((185 * longValue27) - 34697590011L), 1749945690L);
                                                                    int myUid7 = Process.myUid();
                                                                    int i597 = (~((-1204980194) | myUid7)) | 97683905;
                                                                    int i598 = ~myUid7;
                                                                    int i599 = ((int) (e28 >> 32)) & (((~(i598 | 232246217)) * 886) + (((~(i598 | 1204980193)) | 232246217) * (-1772)) + (((i597 | (~(1339542505 | i598))) * 886) - 1799899072));
                                                                    int i600 = ((int) e28) & ((((~((-1833315694) | i4)) | 312070786) * 420) + (((~((-1833315694) | i2)) * 420) - 556415431));
                                                                    if (((i600 & i599) | (i599 ^ i600)) != 0) {
                                                                        Object[] objArr154 = {r1, new int[1], null, r2};
                                                                        int[] iArr42 = {i2};
                                                                        int[] iArr43 = {(~(i2 & 276)) & (i2 | 276)};
                                                                        int b11 = hdi.b(1116757188);
                                                                        int i601 = (((~(b11 | 171058436)) | (~((-1116015198) | b11)) | 1082460761) * 623) + (((~b11) | 137504000) * (-623)) + ((~((-1082460762) | b11)) * 623) + 989531082;
                                                                        int i602 = (i601 ^ 16) + ((i601 & 16) << 1) + 1390769596;
                                                                        int i603 = i602 << 13;
                                                                        int i604 = (i603 | i602) & (~(i602 & i603));
                                                                        int i605 = i604 >>> 17;
                                                                        int i606 = (i604 | i605) & (~(i604 & i605));
                                                                        int i607 = i606 << 5;
                                                                        ((int[]) objArr154[1])[0] = ((~i606) & i607) | ((~i607) & i606);
                                                                        return objArr154;
                                                                    }
                                                                    int i608 = i;
                                                                    j = (((i608 | 97) << 1) - (i608 ^ 97)) % 128;
                                                                    Object f39 = rV4669.f(1923588441);
                                                                    if (f39 == null) {
                                                                        int axisFromString2 = 6717 - MotionEvent.axisFromString("");
                                                                        char normalizeMetaState3 = (char) (50661 - KeyEvent.normalizeMetaState(0));
                                                                        int touchSlop7 = 51 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                        Object[] objArr155 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr155);
                                                                        f39 = rV4669.g(axisFromString2, normalizeMetaState3, touchSlop7, -83657667, (String) objArr155[0], new Class[0]);
                                                                    }
                                                                    long longValue28 = ((Long) ((Method) f39).invoke(null, null)).longValue();
                                                                    long j68 = longValue28 ^ (-1);
                                                                    long j69 = 110554540 | j68;
                                                                    long e29 = com.fingerprintjs.android.fpjs_pro.g.e(867L, (((longValue28 | 110554540) | j6) ^ (-1)) | ((j69 | j2) ^ (-1)) | (((j68 | (-110554541)) | j6) ^ (-1)), ((-1734) * ((j69 ^ (-1)) | ((110554540 | j6) ^ (-1)) | ((j68 | j6) ^ (-1)))) + ((-867) * (((110554540 | j2) ^ (-1)) | ((j68 | j2) ^ (-1)))) + ((868 * longValue28) - 95961341588L), 1758448709L);
                                                                    int i609 = ((int) (e29 >> 32)) & ((((~(2142594867 | i4)) | (~((-715146018) | i4))) * 614) + (((~(2057331505 | i4)) | 85263362 | (~((-800409380) | i4))) * (-1228)) + (((1427448850 | i2) * 614) - 1513812970));
                                                                    int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                                                    int i610 = (~((-1569380166) | freeMemory4)) | 1284166400;
                                                                    int i611 = ~((~freeMemory4) | 1573574485);
                                                                    int i612 = ((int) e29) & ((((~(freeMemory4 | (-285213766))) | i611) * 470) + ((i610 | i611) * (-470)) + 825560149);
                                                                    if (((i612 & i609) | (i609 ^ i612)) != 0) {
                                                                        Object[] objArr156 = {r1, new int[1], null, r2};
                                                                        int[] iArr44 = {i2};
                                                                        int[] iArr45 = {(~(i2 & 273)) & (i2 | 273)};
                                                                        int i613 = (int) Runtime.getRuntime().totalMemory();
                                                                        int i614 = ~i613;
                                                                        int i615 = -(-k84.a(i613 | 750169949, 397, (((~(i614 | 874925074)) | (~((-412148560) | i614)) | 143696717) * (-397)) + 1035369105, 16));
                                                                        int i616 = (i615 ^ 1390769596) + ((i615 & 1390769596) << 1);
                                                                        int i617 = i616 << 13;
                                                                        int i618 = (i617 & (~i616)) | ((~i617) & i616);
                                                                        int i619 = i618 ^ (i618 >>> 17);
                                                                        int i620 = i619 << 5;
                                                                        ((int[]) objArr156[1])[0] = ((~i619) & i620) | ((~i620) & i619);
                                                                        return objArr156;
                                                                    }
                                                                    Object f40 = rV4669.f(1817120607);
                                                                    if (f40 == null) {
                                                                        int i621 = 3368 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                        char jumpTapTimeout7 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                        int makeMeasureSpec = 52 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                        Object[] objArr157 = new Object[1];
                                                                        b((byte) 1, 0, 1, objArr157);
                                                                        f40 = rV4669.g(i621, jumpTapTimeout7, makeMeasureSpec, -437530053, (String) objArr157[0], new Class[0]);
                                                                    }
                                                                    long longValue29 = ((Long) ((Method) f40).invoke(null, null)).longValue();
                                                                    long j70 = (263 * longValue29) + 263617322614L;
                                                                    long j71 = (504048417 | longValue29) ^ (-1);
                                                                    long j72 = longValue29 ^ (-1);
                                                                    long j73 = (j72 | (-504048418)) ^ (-1);
                                                                    long e30 = com.fingerprintjs.android.fpjs_pro.g.e(262L, ((j72 | j2) ^ (-1)) | j71 | j73, ((-786) * j73) + ((j71 | j73 | ((j72 | j6) ^ (-1))) * 262) + j70, 685927764L);
                                                                    int i622 = (((~(975242134 | i4)) | (-2050336703) | (~(1882498750 | i4)) | (~((-807404183) | i2))) * (-84)) + 1905160562;
                                                                    int i623 = (~(1882498750 | i2)) | (-975242135);
                                                                    int i624 = ~((-1882498751) | i4);
                                                                    int i625 = ((int) (e30 >> 32)) & (((807404182 | i624) * 84) + ((i623 | i624) * (-84)) + i622);
                                                                    int uptimeMillis4 = (int) SystemClock.uptimeMillis();
                                                                    int a19 = ((int) e30) & k84.a((~((~uptimeMillis4) | (-672416006))) | (-2143219552), 576, (((~((-689204574) | uptimeMillis4)) | 16788568) * 576) + 1771465493, 1080280576);
                                                                    if (((a19 & i625) | (i625 ^ a19)) != 0) {
                                                                        i = (j + 105) % 128;
                                                                        Object[] objArr158 = {r1, new int[1], null, r2};
                                                                        int[] iArr46 = {i2};
                                                                        int[] iArr47 = {i2 ^ 279};
                                                                        int i626 = (int) Runtime.getRuntime().totalMemory();
                                                                        int i627 = (((~(i626 | (-368898505))) | (-918175130)) * MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE) + (((~((-918175130) | i626)) | (~((~i626) | 368898504))) * (-301)) + (((~(939458009 | i626)) * (-301)) - 884386786);
                                                                        int i628 = (((i627 | 16) << 1) - (i627 ^ 16)) + 1390769596;
                                                                        int i629 = i628 << 13;
                                                                        int i630 = (i629 & (~i628)) | ((~i629) & i628);
                                                                        int i631 = i630 >>> 17;
                                                                        int i632 = (i630 | i631) & (~(i630 & i631));
                                                                        ((int[]) objArr158[1])[0] = i632 ^ (i632 << 5);
                                                                        return objArr158;
                                                                    }
                                                                    Object[] objArr159 = {Integer.valueOf(i2), obj, 1390769596, Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)};
                                                                    Object f41 = rV4669.f(2049420598);
                                                                    if (f41 == null) {
                                                                        f41 = rV4669.g(4995 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 31689), 52 - ExpandableListView.getPackedPositionType(0L), -209489838, null, new Class[]{cls, (Class) rV4669.e((char) (Drawable.resolveOpacity(0, 0) + 34216), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5045, (KeyEvent.getMaxKeyCode() >> 16) + 52), cls, cls});
                                                                    }
                                                                    Object newInstance = ((Constructor) f41).newInstance(objArr159);
                                                                    i = (j + 109) % 128;
                                                                    try {
                                                                        int i633 = -KeyEvent.normalizeMetaState(0);
                                                                        int i634 = (i633 ^ 2124614707) + ((i633 & 2124614707) << 1);
                                                                        int i635 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                        int i636 = (i635 & (-90)) + (i635 | (-90));
                                                                        int i637 = -(Process.myTid() >> 22);
                                                                        Object[] objArr160 = new Object[1];
                                                                        d((byte) ((-14) - TextUtils.indexOf("", "", 0)), i634, i636, (i637 & (-1557879405)) + (i637 | (-1557879405)), (short) ((-66) - (ViewConfiguration.getTouchSlop() >> 8)), objArr160);
                                                                        Class<?> cls2 = Class.forName((String) objArr160[0]);
                                                                        int defaultSize4 = View.getDefaultSize(0, 0);
                                                                        int i638 = (defaultSize4 & 2124614716) + (defaultSize4 | 2124614716);
                                                                        int i639 = -(-View.MeasureSpec.getSize(0));
                                                                        int i640 = ((i639 | (-91)) << 1) - (i639 ^ (-91));
                                                                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                                                        Object[] objArr161 = new Object[1];
                                                                        d((byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 13), i638, i640, (packedPositionGroup2 ^ (-1557879389)) + ((packedPositionGroup2 & (-1557879389)) << 1), (short) ((-73) - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))))), objArr161);
                                                                        cls2.getMethod((String) objArr161[0], null).invoke(newInstance, null);
                                                                        Object[] objArr162 = {r1, r2, null, r5};
                                                                        int[] iArr48 = {i2};
                                                                        int[] iArr49 = {i2};
                                                                        int a20 = k84.a((~((-850066326) | i4)) | 547538961, 672, (((~(i2 | 850066325)) | (~((-437007309) | i4))) * (-672)) + ((((~(437007308 | i2)) | 850066325) * 672) - 1424598879), 1390769596);
                                                                        int i641 = a20 << 13;
                                                                        int i642 = (a20 | i641) & (~(a20 & i641));
                                                                        int i643 = i642 >>> 17;
                                                                        int i644 = ((~i642) & i643) | ((~i643) & i642);
                                                                        int[] iArr50 = {i644 ^ (i644 << 5)};
                                                                        return objArr162;
                                                                    } catch (Throwable th6) {
                                                                        Throwable cause4 = th6.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                        throw th6;
                                                                    }
                                                                }
                                                                com.fingerprintjs.android.fpjs_pro.u.component9();
                                                                objArr = new Object[]{r1, r2, null, r5};
                                                                int[] iArr51 = {i2};
                                                                int[] iArr52 = {(i2 & (-267)) | (i4 & 266)};
                                                                int i645 = ((1018163037 | i2) * 220) + (((~(1015540757 | i4)) | 271532876) * (-440)) + (((~(1018163037 | i4)) | 268910596) * 220) + 814097061;
                                                                int i646 = -(-((i645 & 16) + (i645 | 16)));
                                                                int i647 = (i646 ^ 1390769596) + ((i646 & 1390769596) << 1);
                                                                int i648 = i647 << 13;
                                                                int i649 = (i648 | i647) & (~(i647 & i648));
                                                                int i650 = i649 >>> 17;
                                                                int i651 = ((~i649) & i650) | ((~i650) & i649);
                                                                int i652 = i651 << 5;
                                                                c3 = 0;
                                                                int[] iArr53 = {((~i651) & i652) | ((~i652) & i651)};
                                                            }
                                                        }
                                                        c2 = c3;
                                                        if (((int[]) objArr[3])[c2] != ((int[]) objArr[c2])[c2]) {
                                                        }
                                                    }
                                                    c2 = 0;
                                                    if (((int[]) objArr[3])[c2] != ((int[]) objArr[c2])[c2]) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = 0;
                                    if (i8 == 0) {
                                    }
                                }
                            } catch (Throwable th7) {
                                Throwable cause5 = th7.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th7;
                            }
                        }
                    }
                    i7 = 0;
                    if (i7 == 0) {
                    }
                }
            }
            num = 42;
            int i5810 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int i5910 = (2124614699 & i5810) + (i5810 | 2124614699);
            int resolveOpacity4 = Drawable.resolveOpacity(0, 0);
            int i6010 = (resolveOpacity4 * (-244)) - 22386;
            i4 = ~i2;
            int i6110 = ~(90 | i4);
            int i6210 = ~((90 ^ resolveOpacity4) | (90 & resolveOpacity4));
            int i6310 = ((i6110 & i6210) | (i6110 ^ i6210)) * (-245);
            int i6410 = (i6010 & i6310) + (i6010 | i6310);
            int i653 = ~((90 ^ i2) | (90 & i2));
            int i662 = (i6410 - (~(-(-(i653 * (-245)))))) - 1;
            int i672 = ((resolveOpacity4 & i653) | (resolveOpacity4 ^ i653)) * 245;
            int i682 = (i662 ^ i672) + ((i672 & i662) << 1);
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) - 1557879815;
            int i692 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int i702 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr252 = new Object[1];
            d((byte) ((i692 ^ 104) + ((i692 & 104) << 1)), i5910, i682, offsetBefore2, (short) ((i702 & 75) + (i702 | 75)), objArr252);
            String str210 = (String) objArr252[0];
            int i712 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
            int threadPriority22 = Process.getThreadPriority(0);
            Object[] objArr262 = new Object[1];
            c((char) (((i712 | 17094) << 1) - (i712 ^ 17094)), (((threadPriority22 | 20) << 1) - (threadPriority22 ^ 20)) >> 6, "쬭貝\ua7d1盚繇匓", "\ud8eb㷉웊푂", objArr262);
            String str310 = (String) objArr262[0];
            char deadChar4 = (char) KeyEvent.getDeadChar(0, 0);
            char mirror22 = AndroidCharacter.getMirror('0');
            int i722 = (42784 & mirror22) + (mirror22 | 42784);
            Object[] objArr272 = new Object[1];
            c(deadChar4, i722, "笕旨\uf0d6뢚섻Č쓠", "僴躧栃棂", objArr272);
            String str48 = (String) objArr272[0];
            char packedPositionType5 = (char) ExpandableListView.getPackedPositionType(0L);
            int tapTimeout7 = ViewConfiguration.getTapTimeout() >> 16;
            int component98 = com.fingerprintjs.android.fpjs_pro.u.component9();
            int i732 = tapTimeout7 * (-109);
            int i742 = ((-1352630186) & i732) + (i732 | (-1352630186));
            int i752 = ~tapTimeout7;
            int i762 = ~(((-2140322806) ^ component98) | ((-2140322806) & component98));
            int i772 = (((i762 & i752) | (i752 ^ i762)) * (-220)) + i742;
            int i782 = ~(((-2140322806) ^ tapTimeout7) | ((-2140322806) & tapTimeout7));
            int i792 = ~(component98 | (-2140322806));
            int i802 = ~((i752 & (-2140322806)) | ((-2140322806) ^ i752));
            int i812 = ~((tapTimeout7 & 2140322805) | (2140322805 ^ tapTimeout7));
            int i822 = (((i812 & i802) | (i802 ^ i812)) * 110) + (((i792 & i782) | (i782 ^ i792)) * 220) + i772;
            Object[] objArr282 = new Object[1];
            c(packedPositionType5, i822, "偁嶟\ue928ꏌ瘦꧐\udf4b䐔탫", "\u0ad8浄ހ軠", objArr282);
            String str52 = (String) objArr282[0];
            Object[] objArr292 = new Object[1];
            c((char) (21311 - (~View.resolveSize(0, 0))), Color.alpha(0), "ꎆ⮮뵑꧁ﳯ\ueb9c", "\uf836撃䃴聓", objArr292);
            String str62 = (String) objArr292[0];
            int i832 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 2124614706;
            int combineMeasuredStates4 = View.combineMeasuredStates(0, 0) - 91;
            int touchSlop8 = ViewConfiguration.getTouchSlop() >> 8;
            int i842 = ((-1557879807) & touchSlop8) + (touchSlop8 | (-1557879807));
            int i852 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            Object[] objArr302 = new Object[1];
            d((byte) (Color.green(0) - 25), i832, combineMeasuredStates4, i842, (short) ((i852 ^ (-15)) + ((i852 & (-15)) << 1)), objArr302);
            String str72 = (String) objArr302[0];
            int i862 = -(-KeyEvent.getDeadChar(0, 0));
            byte modifierMetaStateMask22 = (byte) KeyEvent.getModifierMetaStateMask();
            int i872 = (1245259538 & modifierMetaStateMask22) + (modifierMetaStateMask22 | 1245259538);
            Object[] objArr312 = new Object[1];
            c((char) (((50133 | i862) << 1) - (i862 ^ 50133)), i872, "玔鰓凾諊섓", "ᇄ㤧핊\ue8c3", objArr312);
            String str82 = (String) objArr312[0];
            int normalizeMetaState4 = KeyEvent.normalizeMetaState(0);
            Object[] objArr322 = new Object[1];
            c((char) (((normalizeMetaState4 | 20304) << 1) - (normalizeMetaState4 ^ 20304)), (-2) - ((-MotionEvent.axisFromString("")) ^ (-1)), "穒祀뺬᧥칐㲤", "\ue269䭳傀㉏", objArr322);
            String str92 = (String) objArr322[0];
            int i882 = -ImageFormat.getBitsPerPixel(0);
            int i892 = (2124614705 ^ i882) + ((i882 & 2124614705) << 1);
            int i902 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 91;
            int keyCodeFromString22 = (-1557879794) - KeyEvent.keyCodeFromString("");
            int i912 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            Object[] objArr332 = new Object[1];
            d((byte) ((i912 & 77) + (i912 | 77)), i892, i902, keyCodeFromString22, (short) (8 - (~(-TextUtils.indexOf((CharSequence) "", '0')))), objArr332);
            String str102 = (String) objArr332[0];
            int i922 = -TextUtils.getTrimmedLength("");
            int i932 = (i922 * 628) - (-567712);
            int i942 = (i2 ^ 904) | (i2 & 904);
            int i952 = ~i922;
            int i962 = -(-(((i942 & i952) | (i942 ^ i952)) * (-627)));
            int i972 = (i932 & i962) + (i932 | i962);
            int i982 = ~((-905) | i2);
            int i992 = ((i982 & i922) | (i922 ^ i982)) * (-627);
            int i1002 = (i972 ^ i992) + ((i992 & i972) << 1);
            int i1012 = ~(i4 | 904);
            int i1022 = ~((i922 & i2) | (i922 ^ i2));
            int i1032 = -(-(((i1022 & i1012) | (i1012 ^ i1022)) * 627));
            char c82 = (char) ((i1002 & i1032) + (i1032 | i1002));
            int rgb5 = Color.rgb(0, 0, 0);
            int i1042 = (16777216 & rgb5) + (rgb5 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            Object[] objArr342 = new Object[1];
            c(c82, i1042, "殸۩쫰撢靽摆敚\ue418箺憟똕ᔟ훱끴빤㴮", "㍃똏袈搃", objArr342);
            String str112 = (String) objArr342[0];
            int i1052 = 2124614708 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i1062 = -(-Color.argb(0, 0, 0, 0));
            int i1072 = (i1062 ^ (-91)) + ((i1062 & (-91)) << 1);
            int trimmedLength2 = TextUtils.getTrimmedLength("");
            int i1082 = ((-1557879792) & trimmedLength2) + (trimmedLength2 | (-1557879792));
            int i1092 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i1102 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            Object[] objArr352 = new Object[1];
            d((byte) ((i1092 ^ 125) + ((i1092 & 125) << 1)), i1052, i1072, i1082, (short) (((i1102 | 30) << 1) - (i1102 ^ 30)), objArr352);
            String str122 = (String) objArr352[0];
            char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i1112 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i1122 = (i1112 ^ (-1)) + (i1112 << 1);
            Object[] objArr362 = new Object[1];
            c(doubleTapTimeout3, i1122, "\udaac\ud949贯蠹\uea14쏾㊆୶", "퍛獗\ueb0e\udfdc", objArr362);
            String str132 = (String) objArr362[0];
            int i1132 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i1142 = (2124614712 ^ i1132) + ((i1132 & 2124614712) << 1);
            int i1152 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i1162 = (i1152 ^ (-90)) + ((i1152 & (-90)) << 1);
            int doubleTapTimeout22 = ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i1172 = ((-1557879782) ^ doubleTapTimeout22) + ((doubleTapTimeout22 & (-1557879782)) << 1);
            int i1182 = -(-Gravity.getAbsoluteGravity(0, 0));
            Object[] objArr372 = new Object[1];
            d((byte) (((i1182 | (-8)) << 1) - (i1182 ^ (-8))), i1142, i1162, i1172, (short) ((-77) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr372);
            String str142 = (String) objArr372[0];
            int i1192 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i1202 = (2124614713 ^ i1192) + ((i1192 & 2124614713) << 1);
            int green3 = Color.green(0);
            int i1212 = (green3 ^ (-91)) + ((green3 & (-91)) << 1);
            int lastIndexOf6 = TextUtils.lastIndexOf("", '0', 0, 0) - 1557879769;
            int i1222 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            short s2 = (short) ((i1222 ^ (-92)) + ((i1222 & (-92)) << 1));
            Object[] objArr382 = new Object[1];
            d((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 95), i1202, i1212, lastIndexOf6, s2, objArr382);
            String str152 = (String) objArr382[0];
            char indexOf22 = (char) TextUtils.indexOf("", "", 0);
            int i1232 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int component922 = com.fingerprintjs.android.fpjs_pro.u.component9();
            int i1242 = i1232 * (-159);
            int i1252 = (1937478678 & i1242) + (i1242 | 1937478678);
            int i1262 = ~i1232;
            int i1272 = -(-(((i1262 & (-984630826)) | ((-984630826) ^ i1262)) * 160));
            int i1282 = (i1252 & i1272) + (i1272 | i1252);
            int i1292 = ~component922;
            int i1302 = ~((i1292 ^ i1232) | (i1292 & i1232));
            int i1312 = ~((-984630826) | i1232);
            int i1322 = ((i1302 & i1312) | (i1302 ^ i1312)) * (-160);
            int i1332 = (i1282 & i1322) + (i1322 | i1282);
            int i1342 = -(-((i1232 | (~((i1292 & 984630825) | (984630825 ^ i1292)))) * 160));
            int i1352 = (i1332 ^ i1342) + ((i1342 & i1332) << 1);
            Object[] objArr392 = new Object[1];
            c(indexOf22, i1352, "ṿ➶䘅燎붕ḥ\ue299", "햾侹旅蹂", objArr392);
            String str162 = (String) objArr392[0];
            char jumpTapTimeout42 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int touchSlop22 = ViewConfiguration.getTouchSlop() >> 8;
            int i1362 = ((-274417145) & touchSlop22) + (touchSlop22 | (-274417145));
            Object[] objArr402 = new Object[1];
            c(jumpTapTimeout42, i1362, "싀數鿶鼺쒃\ued13\udac7", "߃꒺\uebef뤻", objArr402);
            String str172 = (String) objArr402[0];
            int i1372 = 2124614715 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))));
            int threadPriority32 = Process.getThreadPriority(0);
            int component932 = com.fingerprintjs.android.fpjs_pro.u.component9();
            int i1382 = -(-(threadPriority32 * 521));
            int i1392 = (((-10380) | i1382) << 1) - (i1382 ^ (-10380));
            int i1402 = ~threadPriority32;
            int i1412 = (-21) | i1402;
            int i1422 = ~component932;
            int i1432 = ~((i1412 & i1422) | (i1412 ^ i1422));
            int i1442 = ~((threadPriority32 & component932) | (threadPriority32 ^ component932));
            int i1452 = ((i1442 & i1432) | (i1432 ^ i1442)) * 520;
            int i1462 = (i1392 ^ i1452) + ((i1452 & i1392) << 1);
            int i1472 = ~(i1402 | i1422);
            int i1482 = ~((component932 ^ 20) | (component932 & 20));
            int i1492 = (((i1472 & i1482) | (i1472 ^ i1482)) * (-1040)) + i1462;
            int i1502 = ((~(component932 | 20)) | (~((i1402 & 20) | (i1402 ^ 20))) | (~(((-21) ^ i1422) | ((-21) & i1422)))) * 520;
            int i1512 = -((((i1492 | i1502) << 1) - (i1492 ^ i1502)) >> 6);
            int component942 = com.fingerprintjs.android.fpjs_pro.u.component9();
            int i1522 = i1512 * 934;
            int i1532 = ((84812 | i1522) << 1) - (i1522 ^ 84812);
            int i1542 = ~i1512;
            int i1552 = ~component942;
            int i1562 = ~((i1542 & i1552) | (i1542 ^ i1552));
            int i1572 = ((90 & i1562) | (90 ^ i1562)) * (-933);
            int i1582 = (i1532 ^ i1572) + ((i1572 & i1532) << 1);
            int i1592 = ~(90 | i1552);
            int i1602 = ~((90 ^ i1512) | (90 & i1512));
            int i1612 = ((~((i1512 & (-91)) | (i1512 ^ (-91)))) * 933) + ((i1582 - (~(-(-(((i1592 & i1602) | (i1592 ^ i1602)) * 933))))) - 1);
            int i1622 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i1632 = (((-1557879755) | i1622) << 1) - (i1622 ^ (-1557879755));
            int i1642 = -View.MeasureSpec.getMode(0);
            int i1652 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            Object[] objArr412 = new Object[1];
            d((byte) (((i1642 | 59) << 1) - (i1642 ^ 59)), i1372, i1612, i1632, (short) (((i1652 | 81) << 1) - (i1652 ^ 81)), objArr412);
            String str182 = (String) objArr412[0];
            int myPid52 = Process.myPid() >> 22;
            Object[] objArr422 = new Object[1];
            c((char) (((48936 | myPid52) << 1) - (myPid52 ^ 48936)), ViewConfiguration.getDoubleTapTimeout() >> 16, "䐃\ue8d4", "ﮣ푍⠳䆿", objArr422);
            String str192 = (String) objArr422[0];
            Object[] objArr432 = new Object[1];
            c((char) TextUtils.getCapsMode("", 0, 0), ViewConfiguration.getTouchSlop() >> 8, "ᨌꆶ\ude1f喈瀽㡏ᆭ튐瞽᧠괬㤺佗嫡\u1f4fね\uef33춁\u0019\uf297", "㺯\uebe8ꋊ\uf0b2", objArr432);
            String str202 = (String) objArr432[0];
            int i1662 = -TextUtils.indexOf("", "");
            int i1672 = ((i1662 | 2124614716) << 1) - (i1662 ^ 2124614716);
            int i1682 = (-92) - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int i1692 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i1702 = (((-1557879750) | i1692) << 1) - (i1692 ^ (-1557879750));
            int i1712 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int component952 = com.fingerprintjs.android.fpjs_pro.u.component9();
            int i1722 = i1712 * 465;
            int i1732 = ((i1722 | 32410) << 1) - (i1722 ^ 32410);
            int i1742 = ~component952;
            int i1752 = ~(69 | i1742);
            int i1762 = ~((69 ^ i1712) | (69 & i1712));
            int i1772 = -(-(((~((i1742 & i1712) | (i1742 ^ i1712))) | i1752 | i1762) * 464));
            byte b32 = (byte) ((((~((i1712 & component952) | (i1712 ^ component952))) | i1762) * 464) + ((((i1732 & i1772) + (i1772 | i1732)) - (~((((~i1712) | component952) | 69) * (-464)))) - 1));
            int i1782 = -(ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr442 = new Object[1];
            d(b32, i1672, i1682, i1702, (short) ((i1782 ^ (-107)) + ((i1782 & (-107)) << 1)), objArr442);
            String str212 = (String) objArr442[0];
            int axisFromString3 = MotionEvent.axisFromString("");
            int i1792 = (2124614717 & axisFromString3) + (axisFromString3 | 2124614717);
            int i1802 = -Color.rgb(0, 0, 0);
            int i1812 = ((-16777307) ^ i1802) + ((i1802 & (-16777307)) << 1);
            int i1822 = -TextUtils.indexOf("", "", 0);
            int i1832 = ((-1557879743) ^ i1822) + ((i1822 & (-1557879743)) << 1);
            int resolveSize3 = View.resolveSize(0, 0);
            int i1842 = -(-MotionEvent.axisFromString(""));
            Object[] objArr452 = new Object[1];
            d((byte) (((resolveSize3 | 74) << 1) - (resolveSize3 ^ 74)), i1792, i1812, i1832, (short) (((i1842 | (-120)) << 1) - (i1842 ^ (-120))), objArr452);
            String str222 = (String) objArr452[0];
            int indexOf32 = TextUtils.indexOf((CharSequence) "", '0', 0);
            int i1852 = (2124614717 & indexOf32) + (indexOf32 | 2124614717);
            int touchSlop32 = (-91) - (ViewConfiguration.getTouchSlop() >> 8);
            int i1862 = -View.combineMeasuredStates(0, 0);
            int i1872 = (((-1557879741) | i1862) << 1) - (i1862 ^ (-1557879741));
            int i1882 = -Color.green(0);
            int i1892 = -(-TextUtils.getTrimmedLength(""));
            Object[] objArr462 = new Object[1];
            d((byte) (((i1882 | 46) << 1) - (i1882 ^ 46)), i1852, touchSlop32, i1872, (short) (((i1892 | (-67)) << 1) - (i1892 ^ (-67))), objArr462);
            String str232 = (String) objArr462[0];
            Object[] objArr472 = new Object[1];
            c((char) View.combineMeasuredStates(0, 0), (-22269639) - (~(-View.resolveSize(0, 0))), "ⰹ\ue40c\ue90e腎\ue156ᛵᏻ褴잽", "㪵갱볾헁", objArr472);
            String str242 = (String) objArr472[0];
            Object[] objArr482 = new Object[1];
            d((byte) (94 - (~MotionEvent.axisFromString(""))), 2124614715 - (~(-ImageFormat.getBitsPerPixel(0))), (-92) - (~KeyEvent.keyCodeFromString("")), (-1557879726) - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), (short) ((-115) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr482);
            String str252 = (String) objArr482[0];
            int i1902 = -View.resolveSizeAndState(0, 0, 0);
            int i1912 = (2124614717 & i1902) + (i1902 | 2124614717);
            int i1922 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
            int i1932 = ((i1922 | (-91)) << 1) - (i1922 ^ (-91));
            int i1942 = (-1557879716) - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
            byte b42 = (byte) (93 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
            int i1952 = -(-TextUtils.lastIndexOf("", '0'));
            Object[] objArr492 = new Object[1];
            d(b42, i1912, i1932, i1942, (short) ((i1952 & (-63)) + (i1952 | (-63))), objArr492);
            String str262 = (String) objArr492[0];
            Object[] objArr502 = new Object[1];
            c((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-857101562) - (Process.myPid() >> 22), "ಃ숴젖\u2e78\uf646敺ⶖ籾㺥罬攚", "ض\ue9ab믌퀽", objArr502);
            String str272 = (String) objArr502[0];
            int keyCodeFromString32 = KeyEvent.keyCodeFromString("");
            int i1962 = ~((-2124614719) | i2);
            int i1972 = (i4 ^ keyCodeFromString32) | (i4 & keyCodeFromString32);
            int i1982 = ~((i1972 & 2124614718) | (2124614718 ^ i1972));
            int i1992 = (((i1962 & i1982) | (i1962 ^ i1982)) * (-406)) + (keyCodeFromString32 * (-405)) + 1429763730;
            int i2002 = (~((-2124614719) | i4 | keyCodeFromString32)) * (-406);
            int i2012 = ((i1992 | i2002) << 1) - (i2002 ^ i1992);
            int i2022 = ~keyCodeFromString32;
            int i2032 = ~((i2022 & i2) | (i2022 ^ i2));
            int i2042 = ~((2124614718 ^ i4) | (2124614718 & i4));
            int i2052 = (((i2032 & i2042) | (i2032 ^ i2042)) * 406) + i2012;
            int i2062 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i2072 = ((i2062 | (-91)) << 1) - (i2062 ^ (-91));
            int size4 = View.MeasureSpec.getSize(0);
            int i2082 = ((-1557879704) & size4) + (size4 | (-1557879704));
            byte minimumFlingVelocity7 = (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 110);
            int i2092 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            Object[] objArr512 = new Object[1];
            d(minimumFlingVelocity7, i2052, i2072, i2082, (short) ((i2092 ^ (-41)) + ((i2092 & (-41)) << 1)), objArr512);
            String str282 = (String) objArr512[0];
            int i2102 = -(-TextUtils.lastIndexOf("", '0'));
            int i2112 = ((2124614719 | i2102) << 1) - (i2102 ^ 2124614719);
            int normalizeMetaState22 = KeyEvent.normalizeMetaState(0) - 91;
            int i2122 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i2132 = ((-1557879689) ^ i2122) + ((i2122 & (-1557879689)) << 1);
            int i2142 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
            int i2152 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            Object[] objArr522 = new Object[1];
            d((byte) (((i2142 | (-108)) << 1) - (i2142 ^ (-108))), i2112, normalizeMetaState22, i2132, (short) ((i2152 & (-105)) + (i2152 | (-105))), objArr522);
            String[] strArr42 = {str210, str310, str48, str52, str62, str72, str82, str92, str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, (String) objArr522[0]};
            Object[] objArr532 = new Object[1];
            c((char) View.resolveSizeAndState(0, 0, 0), 1138672066 - (~(-ExpandableListView.getPackedPositionType(0L))), "\uf3bb숌\udf84豈徠᱿䱒잭믢⒑컭", "쌗\udec1핃霵", objArr532);
            Object[] objArr542 = {(String) objArr532[0]};
            f2 = rV4669.f(-417469134);
            if (f2 != null) {
            }
            invoke = ((Method) f2).invoke(null, objArr542);
            if (invoke != null) {
            }
            int i2602 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2124614647;
            int resolveOpacity22 = Drawable.resolveOpacity(0, 0);
            int i2612 = ((resolveOpacity22 | (-91)) << 1) - (resolveOpacity22 ^ (-91));
            int i2622 = -KeyEvent.normalizeMetaState(0);
            Object[] objArr702 = new Object[1];
            d((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 109), i2602, i2612, ((i2622 | (-1557879663)) << 1) - (i2622 ^ (-1557879663)), (short) (ExpandableListView.getPackedPositionType(0L) + 2), objArr702);
            Object[] objArr712 = {(String) objArr702[0]};
            f3 = rV4669.f(1555759462);
            if (f3 == null) {
            }
            long longValue102 = ((Long) ((Method) f3).invoke(null, objArr712)).longValue();
            long j232 = (242 * longValue102) + 144844306719L;
            long j242 = longValue102 ^ (-1);
            long uptimeMillis22 = (-299884694) | (((int) SystemClock.uptimeMillis()) ^ (-1));
            long e112 = com.fingerprintjs.android.fpjs_pro.g.e(241L, ((j242 | 299884693) ^ (-1)) | ((uptimeMillis22 | longValue102) ^ (-1)), ((-482) * (299884693 | longValue102)) + ((-241) * ((((-299884694) | j242) ^ (-1)) | (uptimeMillis22 ^ (-1)))) + j232, 1748208297L);
            int maxMemory32 = (int) Runtime.getRuntime().maxMemory();
            int i2632 = (((~(1320451053 | maxMemory32)) | 285279234 | (~((-1537289832) | maxMemory32))) * (-754)) + 1724907774;
            int i2642 = ~((-285279235) | maxMemory32);
            int i2652 = ~maxMemory32;
            int i2662 = ((int) (e112 >> 32)) & (((1320451053 | i2652) * 754) + (((~(i2652 | (-1252010598))) | i2642) * (-754)) + i2632);
            int i2672 = (int) e112;
            int elapsedRealtime42 = (int) SystemClock.elapsedRealtime();
            a = i2662 | (i2672 & k84.a(~(elapsedRealtime42 | (-279447585)), -1504, (((~(1124214663 | elapsedRealtime42)) | (-1403662248)) * 1504) + 1320243365, -478391120));
            int i2682 = -TextUtils.getOffsetBefore("", 0);
            int i2692 = (i2682 & 2124614648) + (i2682 | 2124614648);
            int i2702 = -View.combineMeasuredStates(0, 0);
            int i2712 = (i2702 ^ (-91)) + ((i2702 & (-91)) << 1);
            int i2722 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i2732 = (i2722 & (-1557879641)) + (i2722 | (-1557879641));
            byte indexOf52 = (byte) (83 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int i2742 = -Color.red(0);
            Object[] objArr732 = new Object[1];
            d(indexOf52, i2692, i2712, i2732, (short) (((i2742 | 54) << 1) - (i2742 ^ 54)), objArr732);
            Object[] objArr742 = {(String) objArr732[0]};
            f4 = rV4669.f(1555759462);
            if (f4 == null) {
            }
            long longValue112 = ((Long) ((Method) f4).invoke(null, objArr742)).longValue();
            long j252 = longValue112 ^ (-1);
            long j262 = (-1874702096) | j252;
            long j272 = ((j262 ^ (-1)) * 497) + (((-496) * longValue112) - 929852239120L);
            long j282 = (j262 | j6) ^ (-1);
            j2 = j6 ^ (-1);
            long e122 = com.fingerprintjs.android.fpjs_pro.g.e(497L, (((-1874702096) | j2) ^ (-1)) | (((-1874702096) | longValue112) ^ (-1)) | (((j252 | 1874702095) | j6) ^ (-1)), ((j282 | (((j252 | j2) | 1874702095) ^ (-1))) * 497) + j272, 173390895L);
            long a52 = (((int) (e122 >> 32)) & k84.a((~((-151035971) | i2)) | 1082196488, 446, (((~(1894450701 | i4)) | (-2045486672)) * 446) + 384374654, -1753988960)) | (((int) e122) & ((((~((-1294194806) | i4)) | 143031604) * 783) + (((~((-1159823426) | i4)) * (-783)) - 1761822647)));
            if (a <= 0) {
            }
            int capsMode4 = 2124614648 - TextUtils.getCapsMode("", 0, 0);
            int i2812 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int i2822 = (i2812 ^ (-91)) + ((i2812 & (-91)) << 1);
            int i2832 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1557879664;
            byte scrollBarFadeDuration3 = (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 109);
            int i2842 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            Object[] objArr772 = new Object[1];
            d(scrollBarFadeDuration3, capsMode4, i2822, i2832, (short) (((i2842 | 2) << 1) - (i2842 ^ 2)), objArr772);
            Object[] objArr782 = {(String) objArr772[0]};
            f5 = rV4669.f(1555759462);
            if (f5 == null) {
            }
            long longValue122 = ((Long) ((Method) f5).invoke(null, objArr782)).longValue();
            long j292 = (-1384196249) | j2;
            long e132 = com.fingerprintjs.android.fpjs_pro.g.e(519L, 1384196248 | ((longValue122 | j6) ^ (-1)), ((-519) * (((j292 | longValue122) ^ (-1)) | (((1384196248 | longValue122) | j6) ^ (-1)))) + ((longValue122 | (j292 ^ (-1))) * 519) + (((-518) * longValue122) - 717013656464L), 663896742L);
            int myTid42 = Process.myTid();
            int i2862 = ~myTid42;
            int i2872 = ((int) (e132 >> 32)) & ((((~(196419854 | i2862)) | (-1811904448)) * 859) + (((~(i2862 | 1633646265)) | (~((-1615484594) | myTid42))) * 859) + ((1633646265 | myTid42) * (-859)) + 1505993154);
            int i2882 = (int) e132;
            int elapsedCpuTime22 = (int) Process.getElapsedCpuTime();
            int a72 = i2882 & k84.a((~(elapsedCpuTime22 | (-590438846))) | (~((-846787565) | elapsedCpuTime22)) | 573596076, -1444, (((~elapsedCpuTime22) | (-290034258)) * 1444) + 1153123995, -1048663950);
            j3 = (i2872 & a72) | (i2872 ^ a72);
            int i2892 = -KeyEvent.normalizeMetaState(0);
            int i2902 = (i2892 ^ 2124614648) + ((i2892 & 2124614648) << 1);
            int i2912 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int i2922 = (i2912 ^ (-91)) + ((i2912 & (-91)) << 1);
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) - 1557879622;
            int alpha2 = Color.alpha(0);
            int i2932 = alpha2 * 905;
            int i2942 = (i2932 & 46053) + (i2932 | 46053);
            int i2952 = ~alpha2;
            int i2962 = (i2942 - (~(-(-(((~((i2952 ^ i2) | (i2952 & i2))) | (~((i4 ^ (-51)) | (i4 & (-51))))) * (-1808)))))) - 1;
            int i2972 = (i2952 ^ 50) | (i2952 & 50);
            int i2982 = ~((i2972 & i2) | (i2972 ^ i2));
            int i2992 = (i4 ^ alpha2) | (i4 & alpha2);
            int i3002 = ~((i2992 ^ (-51)) | (i2992 & (-51)));
            int i3012 = -(-(((i2982 ^ i3002) | (i2982 & i3002)) * 904));
            int i3022 = (i2962 ^ i3012) + ((i3012 & i2962) << 1);
            int i3032 = ~((i2952 & (-51)) | (i2952 ^ (-51)));
            int i3042 = ~((50 ^ i2) | (50 & i2));
            int i3052 = (i3032 & i3042) | (i3032 ^ i3042);
            int i3062 = ~(alpha2 | i4);
            int i3072 = ((i3062 & i3052) | (i3052 ^ i3062)) * 904;
            Object[] objArr802 = new Object[1];
            d((byte) ((i3022 & i3072) + (i3072 | i3022)), i2902, i2922, packedPositionChild2, (short) (6 - (~TextUtils.getOffsetAfter("", 0))), objArr802);
            Object[] objArr812 = {(String) objArr802[0]};
            f6 = rV4669.f(1555759462);
            if (f6 == null) {
            }
            long longValue132 = ((Long) ((Method) f6).invoke(null, objArr812)).longValue();
            long j302 = longValue132 ^ (-1);
            long myUid8 = Process.myUid();
            long j312 = myUid8 ^ (-1);
            long e142 = com.fingerprintjs.android.fpjs_pro.g.e(68L, (-1885436713) | ((j302 | j312) ^ (-1)), ((-68) * ((((-1885436713) | j312) | longValue132) ^ (-1))) + ((((((-1885436713) | j302) | j312) ^ (-1)) | ((1885436712 | longValue132) ^ (-1)) | ((myUid8 | longValue132) ^ (-1))) * (-68)) + ((-67) * longValue132) + 130095133128L, 162656278L);
            int i3082 = ((int) (e142 >> 32)) & ((((~(1895516919 | i4)) | (~(962223965 | i2)) | (~((-1895516920) | i2))) * 959) + (((~(i4 | (-1895516920))) | (~(962223965 | i4)) | (~(1895516919 | i2))) * 959) + 1247213929);
            int i3092 = ((int) e142) & ((((~((-671903773) | i2)) | (~((-2109130183) | i4))) * 959) + ((((~((-671903773) | i4)) | (~((-2109130183) | i2))) * 959) - 1274097481));
            long j322 = (i3082 & i3092) | (i3082 ^ i3092);
            if (j3 <= 0) {
            }
            int i3142 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2124614648;
            int i3152 = -(Process.myPid() >> 22);
            int i3162 = (i3152 & (-91)) + (i3152 | (-91));
            int i3172 = (-1557879618) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b72 = (byte) ((-33) - (~(-(KeyEvent.getMaxKeyCode() >> 16))));
            int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0);
            Object[] objArr842 = new Object[1];
            d(b72, i3142, i3162, i3172, (short) ((bitsPerPixel4 ^ (-79)) + ((bitsPerPixel4 & (-79)) << 1)), objArr842);
            String str302 = (String) objArr842[0];
            char scrollDefaultDelay32 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i3182 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
            int i3192 = (i3182 ^ (-596686915)) + ((i3182 & (-596686915)) << 1);
            Object[] objArr852 = new Object[1];
            c(scrollDefaultDelay32, i3192, "眛ᨉﶷ꿻\uf580背縞쩒䅛띯씘", "뷷潇\ua9dc쬞", objArr852);
            String str312 = (String) objArr852[0];
            int edgeSlop22 = (ViewConfiguration.getEdgeSlop() >> 16) + 2124614648;
            int i3202 = 16777124 - (~Color.rgb(0, 0, 0));
            int i3212 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i3222 = (i3212 & (-1557879613)) + (i3212 | (-1557879613));
            int maxKeyCode22 = KeyEvent.getMaxKeyCode() >> 16;
            Object[] objArr862 = new Object[1];
            d((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 70), edgeSlop22, i3202, i3222, (short) (((maxKeyCode22 | (-120)) << 1) - (maxKeyCode22 ^ (-120))), objArr862);
            String str322 = (String) objArr862[0];
            char blue32 = (char) Color.blue(0);
            int i3232 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i3242 = (i3232 ^ 1) + ((i3232 & 1) << 1);
            Object[] objArr872 = new Object[1];
            c(blue32, i3242, "燱\uf717권ᮝ矐簇\ue1cd覛꺫抿痥l", "繽\ue82a䀬\ue0fc", objArr872);
            String str332 = (String) objArr872[0];
            char c102 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i3252 = -(Process.myPid() >> 22);
            int i3262 = ((i3252 | (-1172524290)) << 1) - (i3252 ^ (-1172524290));
            Object[] objArr882 = new Object[1];
            c(c102, i3262, "鱾ꢧ魋ꋅ\ue115澂똹幼蠏婜≎", "ﻱᲲኺ삒", objArr882);
            String str342 = (String) objArr882[0];
            int i3272 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i3282 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            int i3292 = ((i3282 | (-1223301710)) << 1) - (i3282 ^ (-1223301710));
            Object[] objArr892 = new Object[1];
            c((char) ((i3272 ^ 64063) + ((i3272 & 64063) << 1)), i3292, "躋\uf107宍\ufffe\u17ff", "뉔ᗥ䂷诺", objArr892);
            String str352 = (String) objArr892[0];
            int minimumFlingVelocity22 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            Object[] objArr902 = new Object[1];
            c((char) ((minimumFlingVelocity22 ^ 43017) + ((minimumFlingVelocity22 & 43017) << 1)), ViewConfiguration.getScrollBarFadeDuration() >> 16, "⬄譏\uf0fc❗", "㻸앒ऊ⾨", objArr902);
            strArr2 = new String[]{str302, str312, str322, str332, str342, str352, (String) objArr902[0]};
            i5 = 0;
            while (true) {
                if (i5 < 7) {
                }
                i5++;
                strArr2 = strArr3;
            }
            if (i6 == 0) {
            }
        } catch (Throwable th8) {
            Throwable cause6 = th8.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th8;
        }
    }
}
