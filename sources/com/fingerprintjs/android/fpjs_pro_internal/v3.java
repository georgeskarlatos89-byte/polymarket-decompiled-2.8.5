package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.input.InputManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.r5g;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/v3;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v3 {
    public static final v3 a = new Object();
    public static int b = 0;
    public static int c = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.v3, java.lang.Object] */
    static {
        if (77 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public static Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i5;
        int i9 = ~(i8 | i3);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i5 | i4));
        int i12 = ~(i8 | i10);
        int i13 = (~i4) | i10;
        int i14 = i12 | (~i13);
        int i15 = ~(i13 | i5);
        int i16 = (1629880320 * i6) + ((-1928462336) * i) + (742522880 * i2) + ((-1493335646) * i15) + ((-1308296004) * i14) + (1493335646 * i11) + ((-750812765) * i3) + ((i5 * (-750812765)) - 1471086592);
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i6, 2040842291, ((-1261570137) * i) + i5 + i3 + i2);
        int i17 = i15 * 338;
        int c2 = com.fingerprintjs.android.fpjs_pro.g.c(a2, 1741225984, ((-121732677) * i6) + ((-1046847217) * i) + (1408202841 * i2) + i17 + (i14 * (-676)) + (i11 * (-338)) + (i3 * 1408203179) + ((i5 * 1408203179) - 1033136887), 838795264, (2096168960 * a2) + i16);
        if (c2 != 1) {
            if (c2 != 2) {
                Object obj = null;
                try {
                    if (c2 != 3) {
                        if (c2 != 4) {
                            if (c2 != 5) {
                                Object[] objArr2 = {0L, r5, r5, new q3((Context) objArr[0]), 7, null};
                                Boolean bool = Boolean.FALSE;
                                Object f = rV4669.f(-308176489);
                                if (f == null) {
                                    int indexOf = TextUtils.indexOf((CharSequence) "", '0') + 1527;
                                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int green = Color.green(0) + 51;
                                    Class cls = Long.TYPE;
                                    Class cls2 = Boolean.TYPE;
                                    f = rV4669.g(indexOf, maximumDrawingCacheSize, green, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
                                }
                                Object invoke = ((Method) f).invoke(null, objArr2);
                                Result.Companion companion = Result.INSTANCE;
                                if (!(invoke instanceof r5g)) {
                                    obj = invoke;
                                }
                                return new h2((InputManager) obj);
                            }
                            Object[] objArr3 = {0L, r5, r5, new t3((Context) objArr[0]), 7, null};
                            Boolean bool2 = Boolean.FALSE;
                            Object f2 = rV4669.f(-308176489);
                            if (f2 == null) {
                                int deadChar = 1526 - KeyEvent.getDeadChar(0, 0);
                                char size = (char) View.MeasureSpec.getSize(0);
                                int defaultSize = 51 - View.getDefaultSize(0, 0);
                                Class cls3 = Long.TYPE;
                                Class cls4 = Boolean.TYPE;
                                f2 = rV4669.g(deadChar, size, defaultSize, 1678066931, "D8871", new Class[]{cls3, cls4, cls4, Function0.class, Integer.TYPE, Object.class});
                            }
                            Object invoke2 = ((Method) f2).invoke(null, objArr3);
                            Result.Companion companion2 = Result.INSTANCE;
                            if (!(invoke2 instanceof r5g)) {
                                obj = invoke2;
                            }
                            return new W29288((ActivityManager) obj);
                        }
                        Object obj2 = new Object();
                        int i18 = b;
                        c = ((i18 ^ 111) + ((i18 & 111) << 1)) % 128;
                        return obj2;
                    }
                    Context context = (Context) objArr[0];
                    Object[] objArr4 = {0L, r1, r1, new r3(context), 7, null};
                    Boolean bool3 = Boolean.FALSE;
                    Object f3 = rV4669.f(-308176489);
                    if (f3 == null) {
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1526;
                        char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 51;
                        Class cls5 = Long.TYPE;
                        Class cls6 = Boolean.TYPE;
                        f3 = rV4669.g(offsetAfter, c3, tapTimeout, 1678066931, "D8871", new Class[]{cls5, cls6, cls6, Function0.class, Integer.TYPE, Object.class});
                    }
                    Object invoke3 = ((Method) f3).invoke(null, objArr4);
                    Result.Companion companion3 = Result.INSTANCE;
                    if (invoke3 instanceof r5g) {
                        invoke3 = null;
                    }
                    ActivityManager activityManager = (ActivityManager) invoke3;
                    Object[] objArr5 = {0L, bool3, bool3, u3.h, 7, null};
                    Object f4 = rV4669.f(-308176489);
                    if (f4 == null) {
                        int alpha = Color.alpha(0) + 1526;
                        i7 = -308176489;
                        char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int mode = View.MeasureSpec.getMode(0) + 51;
                        Class cls7 = Long.TYPE;
                        Class cls8 = Boolean.TYPE;
                        f4 = rV4669.g(alpha, combineMeasuredStates, mode, 1678066931, "D8871", new Class[]{cls7, cls8, cls8, Function0.class, Integer.TYPE, Object.class});
                    } else {
                        i7 = -308176489;
                    }
                    Object invoke4 = ((Method) f4).invoke(null, objArr5);
                    if (invoke4 instanceof r5g) {
                        invoke4 = null;
                    }
                    StatFs statFs = (StatFs) invoke4;
                    Object[] objArr6 = {0L, bool3, bool3, new p3(context), 7, null};
                    Object f5 = rV4669.f(i7);
                    if (f5 == null) {
                        int rgb = Color.rgb(0, 0, 0) + 16778742;
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int normalizeMetaState = 51 - KeyEvent.normalizeMetaState(0);
                        Class cls9 = Long.TYPE;
                        Class cls10 = Boolean.TYPE;
                        f5 = rV4669.g(rgb, offsetBefore, normalizeMetaState, 1678066931, "D8871", new Class[]{cls9, cls10, cls10, Function0.class, Integer.TYPE, Object.class});
                    }
                    Object invoke5 = ((Method) f5).invoke(null, objArr6);
                    if (!(invoke5 instanceof r5g)) {
                        obj = invoke5;
                    }
                    return new c(activityManager, statFs);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object obj3 = new Object();
            int i19 = b + 57;
            c = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 7 / 0;
            }
            return obj3;
        }
        Object obj4 = new Object();
        c = (b + 51) % 128;
        return obj4;
    }

    public static m4 b(final Context context) {
        int i;
        char c2;
        char c3;
        char c4;
        try {
            Object[] objArr = {0L, r6, r6, new s3(context), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f = rV4669.f(-308176489);
            if (f == null) {
                i = -308176489;
                int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1525;
                c2 = 5;
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                c3 = 4;
                c4 = 3;
                int indexOf = TextUtils.indexOf((CharSequence) "", '0') + 52;
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f = rV4669.g(i2, scrollBarFadeDuration, indexOf, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
            } else {
                i = -308176489;
                c2 = 5;
                c3 = 4;
                c4 = 3;
            }
            Object invoke = ((Method) f).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof r5g) {
                invoke = null;
            }
            setOnTouchListener setontouchlistener = new setOnTouchListener((ContentResolver) invoke);
            Function0<ContentResolver> function0 = new Function0<ContentResolver>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.getAutofillType$4
                public static final char[] i;
                public static final long j;
                public static final long k;
                public static int l;
                public static int m;
                public static final byte[] n = null;
                public static int o;
                public static int p;
                public static final byte[] q = null;
                public static final int r = 0;

                static {
                    g();
                    o = 0;
                    p = 1;
                    f();
                    l = 0;
                    m = 1;
                    i = new char[]{25115, 63761, 21701, 45975, 3919, 27146, 49655, 23721, 47213, 5896, 29382, 51597, 31771, 59141, 19145, 44417, 4424, 29723, 57301, 17109, 42578, 2326, 27848, 55181, 15170, 40459, 503, 25753, 51300, 13111, 38643, 63927, 9668, 48845, 4878, 62553, 18562, 11662, 34307, 6980, 65423, 20696, 13648, 36446, 25244, 51164, 22617, 15698, 37289, 27366, 53047, 40995, 1186, 39407, 29219, 55159, 43956, 3312, 57659, 31282, 56997, 46071, 5156, 59722, 19919, 9736, 47963, 8076, 18762, 53827, 32640, 39127, 9228, 16640, 60045, 30666, 37633, 15446, 23006, 58064, 3602, 43858, 13527, 20952, 64809, 1640, 41903, 52454, 26723, 62830, 7847, 48111, 50983, 24696, 36280, 5879, 45683, 57211, 30892, 34298, 8521, 19145, 55250, 29459, 40012, 14732, 17100, 60996, 2883, 38042, 32283, 58715, 18572, 45034, 4885, 30293, 56731, 16595, 41995, 2891, 28326, 54731, 14601, 40003, 52967, 21920, 63603, 7972, 41935, 50848, 28029, 9697, 9662, 48893, 4905, 62464, 18651, 9614, 48849, 4870, 62553, 18665, 9624, 48837, 4874, 62536, 18579, 9601, 48838, 4870, 62531, 4590, 35467, 10053, 49154, 31941, 6534, 45572, 12050, 52183, 25818, 351, 47628, 22229, 62355, 27712, 2323, 42408, 24235, 64300, 37950, 12530, 44461, 18023, 58147, 40939, 14505, 54578, 9627, 48840, 4876, 62534, 18562, 11718, 34306, 6943, 65432, 20694, 13586, 36371, 25236, 51166, 22552, 15698, 37287, 27372, 53089, 9627, 48840, 4876, 62534, 18562, 11718, 34306, 6943, 42121, 27615, 61596, 23881, 47636, 1744, 25492, 51304, 21765, 45508, 7813, 31558, 49166, 11482, 9612, 48844, 4891, 62590, 18586, 11730, 34323, 6976, 65430, 20714, 13594, 36431, 25221, 51160, 22548, 15696, 9612, 48844, 4891, 62572, 18560, 11733, 34318, 6995, 65438, 20728, 13595, 36432, 25242, 51167, 22532, 9610, 48839, 4875, 62559, 18572, 11720, 34307, 6923, 65432, 20694, 13585, 36425, 25238, 51167, 22531, 15643, 37256, 27366, 53026, 41085, 1196, 39407, 29218, 55147, 43951, 3287, 57662, 31344, 57014};
                    j = -7804530746810188119L;
                    k = -5530066760753758755L;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String a(short s, short s2, byte b2) {
                    int i3;
                    int i4;
                    int i5 = 1 - (s * 4);
                    int i6 = 118 - s2;
                    int i7 = 3 - (b2 * 2);
                    byte[] bArr = new byte[i5];
                    byte[] bArr2 = q;
                    if (bArr2 == null) {
                        int i8 = i5;
                        i4 = 0;
                        i6 += i8;
                        i3 = i4;
                        i4 = i3 + 1;
                        bArr[i3] = (byte) i6;
                        if (i4 == i5) {
                            return new String(bArr, 0);
                        }
                        i7++;
                        i8 = bArr2[i7];
                        i6 += i8;
                        i3 = i4;
                        i4 = i3 + 1;
                        bArr[i3] = (byte) i6;
                        if (i4 == i5) {
                        }
                    } else {
                        i3 = 0;
                        i4 = i3 + 1;
                        bArr[i3] = (byte) i6;
                        if (i4 == i5) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x01cc  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x01cd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void b(String str, int i3, Object[] objArr2) {
                    Throwable cause;
                    char c5;
                    char[] charArray = str.toCharArray();
                    o = (p + 59) % 128;
                    char[] cArr = charArray;
                    ck ckVar = new ck();
                    ckVar.vD14832N6715 = i3;
                    int length = cArr.length;
                    long[] jArr = new long[length];
                    ckVar.component5 = 0;
                    p = (o + 117) % 128;
                    while (true) {
                        int i4 = ckVar.component5;
                        if (i4 >= cArr.length) {
                            break;
                        }
                        int i5 = o + 125;
                        p = i5 % 128;
                        int i6 = i5 % 2;
                        long j2 = k;
                        Class cls3 = Integer.TYPE;
                        int i7 = r;
                        if (i6 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr[i4]), ckVar, ckVar};
                                Object f2 = rV4669.f(2123814354);
                                if (f2 == null) {
                                    byte b2 = (byte) (i7 - 4);
                                    c5 = 1;
                                    f2 = rV4669.g(4131 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Process.getGidForName("") + 1), 59 - Drawable.resolveOpacity(0, 0), -147715914, a(b2, (byte) (b2 | 21), b2), new Class[]{cls3, Object.class, Object.class});
                                } else {
                                    c5 = 1;
                                }
                                jArr[i4] = ((Long) ((Method) f2).invoke(null, objArr3)).longValue() / (j2 * (-7526550383224563086L));
                                Object[] objArr4 = new Object[2];
                                objArr4[c5] = ckVar;
                                objArr4[0] = ckVar;
                                Object f3 = rV4669.f(1846919219);
                                if (f3 == null) {
                                    f3 = rV4669.g(ExpandableListView.getPackedPositionChild(0L) + 299, (char) KeyEvent.normalizeMetaState(0), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -407823017, "i", new Class[]{Object.class, Object.class});
                                }
                                ((Method) f3).invoke(null, objArr4);
                            } catch (Throwable th) {
                                cause = th.getCause();
                                if (cause == null) {
                                }
                            }
                        } else {
                            Object[] objArr5 = {Integer.valueOf(cArr[i4]), ckVar, ckVar};
                            Object f4 = rV4669.f(2123814354);
                            if (f4 == null) {
                                byte b3 = (byte) (i7 - 4);
                                f4 = rV4669.g(TextUtils.indexOf("", "") + 4130, (char) ((Process.getThreadPriority(0) + 20) >> 6), Color.argb(0, 0, 0, 0) + 59, -147715914, a(b3, (byte) (b3 | 21), b3), new Class[]{cls3, Object.class, Object.class});
                            }
                            jArr[i4] = ((Long) ((Method) f4).invoke(null, objArr5)).longValue() ^ (j2 ^ (-7526550383224563086L));
                            Object[] objArr6 = {ckVar, ckVar};
                            Object f5 = rV4669.f(1846919219);
                            if (f5 == null) {
                                f5 = rV4669.g(299 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'), 63 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)), -407823017, "i", new Class[]{Object.class, Object.class});
                            }
                            ((Method) f5).invoke(null, objArr6);
                        }
                        cause = th.getCause();
                        if (cause == null) {
                            throw cause;
                        }
                        throw th;
                    }
                    char[] cArr2 = new char[length];
                    ckVar.component5 = 0;
                    while (true) {
                        int i8 = ckVar.component5;
                        if (i8 < cArr.length) {
                            o = (p + 67) % 128;
                            cArr2[i8] = (char) jArr[i8];
                            Object[] objArr7 = {ckVar, ckVar};
                            Object f6 = rV4669.f(1846919219);
                            if (f6 == null) {
                                f6 = rV4669.g(298 - View.getDefaultSize(0, 0), (char) TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62, -407823017, "i", new Class[]{Object.class, Object.class});
                            }
                            ((Method) f6).invoke(null, objArr7);
                            o = (p + 111) % 128;
                        } else {
                            objArr2[0] = new String(cArr2);
                            return;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x01ed  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x01ee  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void c(char c5, int i3, int i4, Object[] objArr2) {
                    int i5;
                    Throwable cause;
                    int i6;
                    char c6;
                    cm cmVar = new cm();
                    long[] jArr = new long[i3];
                    cmVar.component5 = 0;
                    while (true) {
                        int i7 = cmVar.component5;
                        i5 = r;
                        if (i7 >= i3) {
                            break;
                        }
                        o = (p + 83) % 128;
                        try {
                            Object[] objArr3 = {Integer.valueOf(i[i4 + i7])};
                            Object f2 = rV4669.f(1480709268);
                            Class cls3 = Integer.TYPE;
                            if (f2 == null) {
                                byte b2 = (byte) (i5 - 4);
                                i6 = 2020003388;
                                byte b3 = (byte) (b2 + 3);
                                c6 = 1;
                                f2 = rV4669.g(6046 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0), (KeyEvent.getMaxKeyCode() >> 16) + 52, -773518864, a(b2, b3, (byte) (b3 - 3)), new Class[]{cls3});
                            } else {
                                i6 = 2020003388;
                                c6 = 1;
                            }
                            Long l2 = (Long) ((Method) f2).invoke(null, objArr3);
                            l2.getClass();
                            long j2 = i7;
                            long j3 = j;
                            Object[] objArr4 = new Object[4];
                            objArr4[3] = Integer.valueOf(c5);
                            objArr4[2] = Long.valueOf(j3);
                            objArr4[c6] = Long.valueOf(j2);
                            objArr4[0] = l2;
                            Object f3 = rV4669.f(-1745711337);
                            if (f3 == null) {
                                int myTid = (Process.myTid() >> 22) + 3109;
                                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 11542);
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 52;
                                byte b4 = (byte) (i5 - 4);
                                byte b5 = (byte) (b4 + 1);
                                String a2 = a(b4, b5, (byte) (b5 - 1));
                                Class cls4 = Long.TYPE;
                                f3 = rV4669.g(myTid, jumpTapTimeout, fadingEdgeLength, 508973683, a2, new Class[]{cls4, cls4, cls4, cls3});
                            }
                            jArr[i7] = ((Long) ((Method) f3).invoke(null, objArr4)).longValue();
                            Object[] objArr5 = new Object[2];
                            objArr5[c6] = cmVar;
                            objArr5[0] = cmVar;
                            Object f4 = rV4669.f(i6);
                            if (f4 == null) {
                                byte b6 = (byte) (i5 - 4);
                                byte b7 = b6;
                                f4 = rV4669.g(4735 - TextUtils.lastIndexOf("", '0'), (char) (10124 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, -238939304, a(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) f4).invoke(null, objArr5);
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
                    char[] cArr = new char[i3];
                    cmVar.component5 = 0;
                    o = (p + 49) % 128;
                    while (true) {
                        int i8 = cmVar.component5;
                        if (i8 < i3) {
                            int i9 = o + 111;
                            p = i9 % 128;
                            if (i9 % 2 == 0) {
                                cArr[i8] = (char) jArr[i8];
                                Object[] objArr6 = {cmVar, cmVar};
                                Object f5 = rV4669.f(2020003388);
                                if (f5 == null) {
                                    byte b8 = (byte) (i5 - 4);
                                    byte b9 = b8;
                                    f5 = rV4669.g((ViewConfiguration.getPressedStateDuration() >> 16) + 4736, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10124), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52, -238939304, a(b8, b9, b9), new Class[]{Object.class, Object.class});
                                }
                                ((Method) f5).invoke(null, objArr6);
                                int i10 = 7 / 0;
                            } else {
                                cArr[i8] = (char) jArr[i8];
                                Object[] objArr7 = {cmVar, cmVar};
                                Object f6 = rV4669.f(2020003388);
                                if (f6 == null) {
                                    byte b10 = (byte) (i5 - 4);
                                    byte b11 = b10;
                                    f6 = rV4669.g(4736 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (10124 - View.MeasureSpec.getMode(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 52, -238939304, a(b10, b11, b11), new Class[]{Object.class, Object.class});
                                }
                                ((Method) f6).invoke(null, objArr7);
                            }
                        } else {
                            String str = new String(cArr);
                            o = (p + 91) % 128;
                            objArr2[0] = str;
                            return;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:225:0x11f5, code lost:
                
                    r47.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:293:0x11dd, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:295:?, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:296:0x11da, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Removed duplicated region for block: B:237:0x12df A[Catch: all -> 0x12ce, Exception -> 0x15a9, TryCatch #1 {Exception -> 0x15a9, blocks: (B:235:0x12d1, B:237:0x12df, B:238:0x1322, B:240:0x1338, B:241:0x1380, B:300:0x1577, B:330:0x157f, B:332:0x1586, B:333:0x1587, B:336:0x1589, B:338:0x1590, B:339:0x1591, B:343:0x1592, B:345:0x1598, B:346:0x1599, B:351:0x159a, B:353:0x15a0, B:354:0x15a1), top: B:234:0x12d1 }] */
                /* JADX WARN: Removed duplicated region for block: B:240:0x1338 A[Catch: all -> 0x12ce, Exception -> 0x15a9, TryCatch #1 {Exception -> 0x15a9, blocks: (B:235:0x12d1, B:237:0x12df, B:238:0x1322, B:240:0x1338, B:241:0x1380, B:300:0x1577, B:330:0x157f, B:332:0x1586, B:333:0x1587, B:336:0x1589, B:338:0x1590, B:339:0x1591, B:343:0x1592, B:345:0x1598, B:346:0x1599, B:351:0x159a, B:353:0x15a0, B:354:0x15a1), top: B:234:0x12d1 }] */
                /* JADX WARN: Removed duplicated region for block: B:246:0x13c2 A[Catch: all -> 0x12ce, IOException -> 0x15f0, TryCatch #4 {IOException -> 0x15f0, blocks: (B:244:0x1393, B:246:0x13c2, B:248:0x13f4, B:250:0x1416, B:252:0x1450, B:254:0x14c2, B:270:0x15a9, B:271:0x15e5), top: B:243:0x1393 }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x167d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:74:0x167e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object[] component5(Context context2, int i3, int i4, int i5) {
                    Object invoke2;
                    int i6;
                    int i7;
                    Object[] objArr2;
                    char c5;
                    int i8;
                    Object[] objArr3;
                    int i9;
                    Object[] objArr4;
                    int i10;
                    Object[] objArr5;
                    char c6;
                    Object[] objArr6;
                    char c7;
                    String str;
                    String[] split;
                    int length;
                    int i11;
                    String str2;
                    String[] strArr;
                    int i12;
                    int i13;
                    Class cls3;
                    Runtime runtime;
                    int i14;
                    Process process;
                    int i15;
                    Object newInstance;
                    Object newInstance2;
                    DataOutputStream dataOutputStream;
                    DataOutputStream dataOutputStream2;
                    long j2;
                    Object f2;
                    Object f3;
                    int length2;
                    int i16;
                    String[] strArr2;
                    int i17;
                    String str3;
                    int i18;
                    String str4;
                    Object[] objArr7;
                    Object[] objArr8;
                    Object[] objArr9;
                    int i19;
                    char c8 = 1;
                    Object[] objArr10 = new Object[1];
                    b("柎\uda4a᳝彼釬푱ᚉ䥌讔츣¯䌢蕎쟎㩁粤뽯\uf1f9㑇皿꤃\uebb8⸱悻ꋄ\ue55d⟅驯\udcf4\u1f7e冬鐔횩फ", 48522 - (~(-(ViewConfiguration.getTapTimeout() >> 16))), objArr10);
                    String str5 = (String) objArr10[0];
                    int i20 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i21 = (i20 ^ 7) + ((i20 & 7) << 1);
                    int myPid = Process.myPid() >> 22;
                    int i22 = (myPid * (-515)) - (-31156488);
                    int i23 = ~((-60265) | i3);
                    int i24 = ~i3;
                    int i25 = ~((i24 ^ myPid) | (i24 & myPid));
                    int i26 = (i23 & i25) | (i23 ^ i25);
                    int i27 = ~(i24 | 60264);
                    int i28 = ((i26 & i27) | (i26 ^ i27)) * (-516);
                    int i29 = (i22 & i28) + (i22 | i28);
                    int i30 = ~myPid;
                    int i31 = i30 | (-60265);
                    int i32 = ~((i31 & i3) | (i31 ^ i3));
                    int i33 = ~((i30 ^ i24) | (i30 & i24) | 60264);
                    char c9 = (char) ((((~((i30 & 60264) | (i30 ^ 60264))) | (~((i24 ^ 60264) | (60264 & i24)))) * 516) + (((i32 & i33) | (i32 ^ i33)) * 516) + i29);
                    int i34 = -ExpandableListView.getPackedPositionChild(0L);
                    int i35 = ((i34 | 123) << 1) - (i34 ^ 123);
                    Object[] objArr11 = new Object[1];
                    c(c9, i21, i35, objArr11);
                    String str6 = (String) objArr11[0];
                    Object[] objArr12 = new Object[1];
                    b("柅뉻첳\ue6d1ㅕ䭊旰뀲쩠\ue4dc㻩䤀採뷻젨\ue250", 54708 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr12);
                    String str7 = (String) objArr12[0];
                    float f4 = 0.0f;
                    int i36 = 2;
                    try {
                        if (context2 == null) {
                            int i37 = -(-ImageFormat.getBitsPerPixel(0));
                            Object[] objArr13 = new Object[1];
                            c((char) (18397 - (~(-Process.getGidForName("")))), (i37 & 13) + (i37 | 13), TextUtils.getOffsetBefore("", 0), objArr13);
                            Object[] objArr14 = {(String) objArr13[0]};
                            Object f5 = rV4669.f(-1355975516);
                            if (f5 == null) {
                                int keyRepeatDelay = 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte b2 = n[8];
                                Object[] objArr15 = new Object[1];
                                d((byte) 32, b2, b2, objArr15);
                                f5 = rV4669.g(TextUtils.lastIndexOf("", '0', 0) + 6047, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), keyRepeatDelay, 646556096, (String) objArr15[0], new Class[]{String.class});
                            }
                            long longValue = ((Long) ((Method) f5).invoke(null, objArr14)).longValue();
                            long j3 = longValue ^ (-1);
                            long j4 = i3;
                            long j5 = j4 ^ (-1);
                            long j6 = (1721923317 | j4) ^ (-1);
                            long e = com.fingerprintjs.android.fpjs_pro.g.e(880L, j6, ((-880) * (longValue | (((-1721923318) | j5) ^ (-1)) | j6)) + (((((-1721923318) | j3) ^ (-1)) | (((-1721923318) | j4) ^ (-1)) | ((j3 | j4) ^ (-1))) * (-880)) + (881 * longValue) + 1517014442277L, -2062440956L);
                            int myUid = Process.myUid();
                            int i38 = ~myUid;
                            int i39 = ((((~(1148378492 | myUid)) | (~(i38 | (-1709362393)))) * 979) + (((-1709362393) | myUid) * (-979)) + ((~(1148378492 | i38)) * 979) + 1989802198) & ((int) (e >> 32));
                            int i40 = ((int) e) & ((((~((-25167105) | i3)) | 1073741993) * 366) + ((((~((-904582999) | i3)) | 1953157887) * (-366)) - 1693556407));
                            if (((i40 & i39) | (i39 ^ i40)) != 0) {
                                objArr7 = new Object[]{new int[]{(i3 & (-51)) | (i24 & 50)}, null, new int[]{i3}, r7, null};
                                int i41 = ((674444764 | (~((-869431539) | i3)) | (~(i24 | 869431538))) * 45) + (((~(674444764 | i3)) | 136381708) * (-45)) + (((~(674444764 | i24)) | 869431538) * (-90)) + 379456966;
                                int i42 = (i41 ^ 16) + ((i41 & 16) << 1) + i5;
                                int i43 = i42 << 13;
                                int i44 = (i43 & (~i42)) | ((~i43) & i42);
                                int i45 = i44 ^ (i44 >>> 17);
                                int i46 = i45 << 5;
                                int[] iArr = {((~i45) & i46) | ((~i46) & i45)};
                            } else {
                                objArr7 = new Object[]{new int[]{i3}, null, new int[]{i3}, r7, null};
                                int a2 = k84.a(835044952 | (~((-640058179) | i24)), 56, (((~(i3 | 835044952)) | (-640058179)) * 56) + 693657101, i5);
                                int i47 = a2 << 13;
                                int i48 = (a2 | i47) & (~(a2 & i47));
                                int i49 = i48 ^ (i48 >>> 17);
                                int i50 = i49 << 5;
                                int[] iArr2 = {(i49 | i50) & (~(i49 & i50))};
                            }
                            if (((int[]) objArr7[0])[0] != i3) {
                                return objArr7;
                            }
                            int i51 = -(-Color.argb(0, 0, 0, 0));
                            int i52 = (i51 ^ 20) + ((i51 & 20) << 1);
                            int i53 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i54 = ~i53;
                            int i55 = ~((i54 ^ 23006) | (i54 & 23006));
                            int i56 = ~(i54 | i3);
                            int i57 = ~(((-23007) ^ i3) | ((-23007) & i3));
                            int i58 = (((i56 ^ i57) | (i56 & i57)) * 140) + (((i55 & i56) | (i55 ^ i56)) * (-280)) + ((i53 * 141) - 3197834);
                            int i59 = ~((i54 ^ (-23007)) | (i54 & (-23007)) | i3);
                            int i60 = (i54 & i24) | (i54 ^ i24);
                            int i61 = ~((i60 & 23006) | (i60 ^ 23006));
                            int i62 = (i61 & i59) | (i59 ^ i61);
                            int i63 = ~(i53 | (-23007) | i24);
                            int i64 = ((i63 & i62) | (i62 ^ i63)) * 140;
                            int i65 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i66 = (i65 ^ 12) + ((i65 & 12) << 1);
                            Object[] objArr16 = new Object[1];
                            c((char) ((i58 & i64) + (i64 | i58)), i52, i66, objArr16);
                            Object[] objArr17 = {(String) objArr16[0]};
                            Object f6 = rV4669.f(-1355975516);
                            if (f6 == null) {
                                int threadPriority = 6046 - ((Process.getThreadPriority(0) + 20) >> 6);
                                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int green = 52 - Color.green(0);
                                byte b3 = n[8];
                                Object[] objArr18 = new Object[1];
                                d((byte) 32, b3, b3, objArr18);
                                f6 = rV4669.g(threadPriority, minimumFlingVelocity, green, 646556096, (String) objArr18[0], new Class[]{String.class});
                            }
                            long longValue2 = ((Long) ((Method) f6).invoke(null, objArr17)).longValue();
                            long j7 = longValue2 ^ (-1);
                            long j8 = j7 | 697056386;
                            long myUid2 = Process.myUid();
                            long e2 = com.fingerprintjs.android.fpjs_pro.g.e(623L, (j8 ^ (-1)) | ((j7 | myUid2) ^ (-1)) | ((697056386 | myUid2) ^ (-1)), ((-623) * ((myUid2 ^ (-1)) | (((-697056387) | longValue2) ^ (-1)))) + (((j8 | myUid2) ^ (-1)) * 623) + ((-622) * longValue2) + 434963184864L, -1037574025L);
                            int i67 = ~((int) Process.getElapsedCpuTime());
                            int a3 = ((int) (e2 >> 32)) & k84.a((~(i67 | 239246144)) | (-1877933036), 933, (((~((-1676472556) | i67)) | 239246144) * (-933)) + 2096378374, -1015933184);
                            int i68 = ((int) e2) & ((((-67152675) | i3) * 591) + ((((~((-67152675) | i24)) | 1504379084) * (-591)) - 374892778));
                            if (((i68 & a3) | (a3 ^ i68)) != 0) {
                                objArr8 = new Object[]{new int[]{(~(i3 & 60)) & (i3 | 60)}, null, new int[]{i3}, r6, null};
                                int i69 = (~((-85629503) | i3)) | (~(109357271 | i24));
                                int i70 = ~(85629502 | i24);
                                int d = hdi.d(42213569 | i70, 516, (((~((-67143703) | i3)) | (~((-42213570) | i24))) * 516) + ((i69 | i70) * (-516)) + 836359857, 16, i5);
                                int i71 = d << 13;
                                int i72 = (d | i71) & (~(d & i71));
                                int i73 = i72 >>> 17;
                                int i74 = ((~i72) & i73) | ((~i73) & i72);
                                int i75 = i74 << 5;
                                int[] iArr3 = {(i74 | i75) & (~(i74 & i75))};
                            } else {
                                objArr8 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                                int a4 = hdi.a();
                                int i76 = -(-((((~(a4 | 447859141)) | (-252872368)) * 272) + (((~((-447859142) | a4)) | 168853637) * (-272)) + (((~((-279005505) | (~a4))) | (~((-84018731) | a4))) * (-272)) + 1815396197));
                                int i77 = (i5 & i76) + (i76 | i5);
                                int i78 = i77 << 13;
                                int i79 = (i78 & (~i77)) | ((~i78) & i77);
                                int i80 = i79 >>> 17;
                                int i81 = (i79 | i80) & (~(i79 & i80));
                                int i82 = i81 << 5;
                                ((int[]) objArr8[3])[0] = ((~i81) & i82) | ((~i82) & i81);
                            }
                            if (((int[]) objArr8[0])[0] != i3) {
                                return objArr8;
                            }
                            int i83 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            Object[] objArr19 = new Object[1];
                            c((char) (ViewConfiguration.getTouchSlop() >> 8), ((i83 | 36) << 1) - (i83 ^ 36), 31 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), objArr19);
                            Object[] objArr20 = {(String) objArr19[0]};
                            Object f7 = rV4669.f(-1567326429);
                            if (f7 == null) {
                                int indexOf2 = 6046 - TextUtils.indexOf("", "", 0);
                                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                int keyRepeatDelay2 = 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte b4 = n[8];
                                Object[] objArr21 = new Object[1];
                                d((byte) 31, b4, b4, objArr21);
                                f7 = rV4669.g(indexOf2, capsMode, keyRepeatDelay2, 724607559, (String) objArr21[0], new Class[]{String.class});
                            }
                            long longValue3 = ((Long) ((Method) f7).invoke(null, objArr20)).longValue();
                            long j9 = longValue3 ^ (-1);
                            long j10 = j5 | 254674697;
                            long e3 = com.fingerprintjs.android.fpjs_pro.g.e(904L, ((longValue3 | (-254674698)) ^ (-1)) | ((j9 | j4) ^ (-1)) | (j10 ^ (-1)), ((((((-254674698) | j9) | j4) ^ (-1)) | ((j10 | longValue3) ^ (-1))) * 904) + (((((-254674698) | j4) ^ (-1)) | ((j5 | longValue3) ^ (-1))) * (-1808)) + ((-903) * longValue3) + 230480600785L, 248079542L);
                            int i84 = ((int) (e3 >> 32)) & ((((~(642147472 | i24)) | (-795078939)) * 305) + (((~(642147472 | i3)) | (-795342235)) * 305) + 1704617878);
                            int a5 = ((int) e3) & k84.a((~((-620889494) | i3)) | 8929280, 446, (((~((-1734850550) | i24)) | 1113961056) * 446) - 384374209, -1389575360);
                            if (((a5 & i84) | (i84 ^ a5)) != 0) {
                                objArr9 = new Object[]{new int[]{(i3 & (-81)) | (i24 & 80)}, null, new int[]{i3}, r6, null};
                                int a6 = k84.a((~(794663517 | i3)) | (~((-989650292) | i24)) | 83952140, -370, (((~(794663517 | i24)) | (~((-989650292) | i3))) * (-370)) - 674351249, 997520728);
                                int i85 = -(-(a6 * 971));
                                int i86 = (((-31024) | i85) << 1) - (i85 ^ (-31024));
                                int i87 = ~a6;
                                int i88 = ((~((i87 ^ 16) | (i87 & 16))) | (~((i24 ^ a6) | (i24 & a6)))) * (-970);
                                int i89 = (i86 ^ i88) + ((i88 & i86) << 1);
                                int i90 = -(-((~((-17) | a6)) * 1940));
                                int i91 = ~(((-17) & i87) | ((-17) ^ i87));
                                int i92 = ~(a6 | i24);
                                int i93 = (i5 - (~(-(-((((i89 ^ i90) + ((i90 & i89) << 1)) - (~(-(-(((i92 & i91) | (i91 ^ i92)) * 970))))) - 1))))) - 1;
                                int i94 = i93 << 13;
                                int i95 = ((~i93) & i94) | ((~i94) & i93);
                                int i96 = i95 >>> 17;
                                int i97 = ((~i95) & i96) | ((~i96) & i95);
                                int i98 = i97 << 5;
                                int[] iArr4 = {(i97 | i98) & (~(i97 & i98))};
                                i19 = 0;
                            } else {
                                objArr9 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                                int i99 = (((~((-953936716) | i3)) | (~((-758949942) | i24))) * 406) + ((~(1040182143 | i24)) * (-406)) + (((~(758949941 | i3)) | (~((-86245429) | i24))) * (-406)) + 547705983;
                                int b5 = h2.b();
                                int i100 = (i5 * 371) + (i99 * 371);
                                int i101 = ~i5;
                                int i102 = ~b5;
                                int i103 = ~((i101 ^ i102) | (i101 & i102));
                                int i104 = ~i99;
                                int i105 = ~((i104 ^ b5) | (i104 & b5));
                                int i106 = ((i103 & i105) | (i103 ^ i105)) * (-370);
                                int i107 = (i100 & i106) + (i100 | i106);
                                int i108 = ~((i104 ^ i102) | (i102 & i104));
                                int i109 = ~((b5 & i101) | (i101 ^ b5));
                                int i110 = (i109 & i108) | (i108 ^ i109);
                                int i111 = ~((i99 ^ i5) | (i99 & i5));
                                int i112 = ((~(i99 | i5)) * 370) + ((i107 - (~(-(-(((i110 & i111) | (i110 ^ i111)) * (-370)))))) - 1);
                                int i113 = i112 << 13;
                                int i114 = ((~i112) & i113) | ((~i113) & i112);
                                int i115 = i114 ^ (i114 >>> 17);
                                int i116 = i115 << 5;
                                i19 = 0;
                                ((int[]) objArr9[3])[0] = ((~i115) & i116) | ((~i116) & i115);
                            }
                            if (((int[]) objArr9[i19])[i19] != i3) {
                                return objArr9;
                            }
                            int i117 = -Color.argb(i19, i19, i19, i19);
                            int i118 = (i117 & 42) + (i117 | 42);
                            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(i19, i19) + 27790);
                            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                            int i119 = ((pressedStateDuration | 68) << 1) - (pressedStateDuration ^ 68);
                            Object[] objArr22 = new Object[1];
                            c(absoluteGravity, i118, i119, objArr22);
                            Object[] objArr23 = {(String) objArr22[0]};
                            Object f8 = rV4669.f(-1567326429);
                            if (f8 == null) {
                                int scrollBarSize = 6046 - (ViewConfiguration.getScrollBarSize() >> 8);
                                char c10 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                int rgb = Color.rgb(0, 0, 0) + 16777268;
                                byte b6 = n[8];
                                Object[] objArr24 = new Object[1];
                                d((byte) 31, b6, b6, objArr24);
                                f8 = rV4669.g(scrollBarSize, c10, rgb, 724607559, (String) objArr24[0], new Class[]{String.class});
                            }
                            long longValue4 = ((Long) ((Method) f8).invoke(null, objArr23)).longValue();
                            long j11 = (-3149790) | longValue4;
                            long j12 = ((-502) * j11) + ((503 * longValue4) - 1584344370);
                            long j13 = 3149789 | j5;
                            long j14 = (j11 | j4) ^ (-1);
                            long e4 = com.fingerprintjs.android.fpjs_pro.g.e(502L, ((j13 | longValue4) ^ (-1)) | j14, ((-502) * (((3149789 | (longValue4 ^ (-1))) ^ (-1)) | (j13 ^ (-1)) | j14)) + j12, 505904029L);
                            int i120 = (int) Runtime.getRuntime().totalMemory();
                            if (((((int) e4) & ((((~((-418673175) | i3)) | (~(1855899584 | i24)) | (~((-1855899585) | i3))) * 959) + (((~((-418673175) | i24)) | (~(1855899584 | i3)) | (~(i24 | (-1855899585)))) * 959) + 1375833002)) | (((int) (e4 >> 32)) & ((((~(i120 | 654471439)) | 2091697850) * 376) + (((~((~i120) | (-654471440))) | 50475269) * (-376)) + (((1538176949 | i120) * 376) - 2088991750)))) != 0) {
                                Object[] objArr25 = {new int[]{(i3 & (-91)) | (i24 & 90)}, null, new int[]{i3}, new int[1], null};
                                int a7 = hdi.a();
                                int i121 = -(-k84.a((~(a7 | (-748318000))) | (~((-943304774) | a7)) | 672669701, -69, (((~((-270635073) | a7)) | (~((-75648299) | a7))) * 69) + 952841118, -1588285216));
                                int i122 = (i5 ^ i121) + ((i121 & i5) << 1);
                                int i123 = i122 << 13;
                                int i124 = (i123 | i122) & (~(i122 & i123));
                                int i125 = i124 >>> 17;
                                int i126 = ((~i124) & i125) | ((~i125) & i124);
                                int i127 = i126 << 5;
                                ((int[]) objArr25[3])[0] = (i126 | i127) & (~(i126 & i127));
                                return objArr25;
                            }
                            Object[] objArr26 = {new int[]{i3}, null, new int[]{i3}, new int[1], null};
                            int myPid2 = Process.myPid();
                            int i128 = ~myPid2;
                            int i129 = (((~(myPid2 | 793778926)) | 708844036 | (~((-793778927) | i128))) * 988) + (((~(988765700 | i128)) | (-1073700591)) * (-1976)) + (((myPid2 | 708844036) * 988) - 1965448751);
                            int i130 = (i5 ^ i129) + ((i129 & i5) << 1);
                            int i131 = (i130 << 13) ^ i130;
                            int i132 = i131 >>> 17;
                            int i133 = ((~i131) & i132) | ((~i132) & i131);
                            int i134 = i133 << 5;
                            ((int[]) objArr26[3])[0] = ((~i133) & i134) | ((~i134) & i133);
                            return objArr26;
                        }
                        try {
                            int i135 = -Gravity.getAbsoluteGravity(0, 0);
                            int b7 = h2.b();
                            int i136 = (i135 * 1773) - 16168065;
                            int i137 = ~i135;
                            int i138 = ~((i137 & (-18270)) | (i137 ^ (-18270)));
                            int i139 = ~(((-18270) ^ b7) | ((-18270) & b7));
                            int i140 = (i138 ^ i139) | (i138 & i139);
                            int i141 = ~b7;
                            int i142 = (i141 ^ i135) | (i141 & i135);
                            int i143 = ~((i142 & 18269) | (i142 ^ 18269));
                            int i144 = ((i143 & i140) | (i140 ^ i143)) * 886;
                            int i145 = (i136 ^ i144) + ((i136 & i144) << 1);
                            int i146 = ~((i141 & 18269) | (i141 ^ 18269));
                            int i147 = ((i135 & i146) | (i135 ^ i146)) * (-1772);
                            Object[] objArr27 = new Object[1];
                            b("柎ₜ\ue971뇊窴̗쯥鐊崤\ue585깣眤㾖\uf878胍䧲ሼ\udaed捋ⰼ\uf48e뵶䘥", ((~i142) * 886) + (i145 ^ i147) + ((i147 & i145) << 1), objArr27);
                            Class<?> cls4 = Class.forName((String) objArr27[0]);
                            int i148 = -TextUtils.lastIndexOf("", '0', 0);
                            int i149 = (i148 & 13) + (i148 | 13);
                            int i150 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i151 = i150 * (-500);
                            int i152 = (i151 & (-11723500)) + (i151 | (-11723500));
                            int i153 = ~(((-23448) & i150) | ((-23448) ^ i150));
                            int i154 = ~i150;
                            int i155 = (i154 ^ 23447) | (i154 & 23447);
                            int i156 = (i153 | (~((i155 & i3) | (i155 ^ i3)))) * 501;
                            int i157 = (i152 ^ i156) + ((i156 & i152) << 1);
                            int i158 = -(-((~((i154 ^ (-23448)) | (i154 & (-23448)))) * 1002));
                            int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                            int i160 = (i154 & i24) | (i154 ^ i24);
                            int i161 = -(-((~((i160 & 23447) | (i160 ^ 23447))) * 501));
                            Object[] objArr28 = new Object[1];
                            c((char) (((i159 | i161) << 1) - (i161 ^ i159)), i149, 110 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))), objArr28);
                            String str8 = (String) cls4.getMethod((String) objArr28[0], null).invoke(context2, null);
                            int i162 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int i163 = (i162 & 18269) + (i162 | 18269);
                            Object[] objArr29 = new Object[1];
                            b("柎ₜ\ue971뇊窴̗쯥鐊崤\ue585깣眤㾖\uf878胍䧲ሼ\udaed捋ⰼ\uf48e뵶䘥", i163, objArr29);
                            Class<?> cls5 = Class.forName((String) objArr29[0]);
                            int i164 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i165 = ((i164 | 5738) << 1) - (i164 ^ 5738);
                            Object[] objArr30 = new Object[1];
                            b("柈熣䬉ⓕ㹻្\ue1b5\ufb19풄깿蟁酅欬䒔幘㟦řᬹ", i165, objArr30);
                            invoke2 = cls5.getMethod((String) objArr30[0], null).invoke(context2, null);
                            int indexOf3 = ((String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6)).indexOf(str8);
                            if (indexOf3 > 0) {
                                String str9 = (String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6);
                                int length3 = str9.length();
                                int i166 = (length3 & (-16)) + (length3 | (-16));
                                if (i166 >= 0) {
                                    int i167 = 0;
                                    while (i167 <= i166) {
                                        i7 = 10827986;
                                        String substring = str9.substring(i167, (i167 ^ 16) + ((i167 & 16) << 1));
                                        i6 = 931995;
                                        Object[] objArr31 = new Object[i36];
                                        objArr31[c8] = 931995;
                                        objArr31[0] = substring;
                                        Object f9 = rV4669.f(10827986);
                                        if (f9 == null) {
                                            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 52;
                                            byte b8 = n[8];
                                            str4 = str7;
                                            Object[] objArr32 = new Object[1];
                                            d((byte) 31, b8, (byte) (b8 + 3), objArr32);
                                            f9 = rV4669.g(5150 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), scrollBarSize2, -1996364362, (String) objArr32[0], new Class[]{String.class, Integer.TYPE});
                                        } else {
                                            str4 = str7;
                                        }
                                        long longValue5 = ((Long) ((Method) f9).invoke(null, objArr31)).longValue();
                                        long j15 = ((-903) * longValue5) - 440260715745L;
                                        long j16 = i3;
                                        long j17 = j16 ^ (-1);
                                        long j18 = ((((486475928 | j16) ^ (-1)) | ((j17 | longValue5) ^ (-1))) * (-1808)) + j15;
                                        long j19 = longValue5 ^ (-1);
                                        long j20 = j17 | (-486475929);
                                        long e5 = com.fingerprintjs.android.fpjs_pro.g.e(904L, ((486475928 | longValue5) ^ (-1)) | ((j19 | j16) ^ (-1)) | (j20 ^ (-1)), (((((486475928 | j19) | j16) ^ (-1)) | ((j20 | longValue5) ^ (-1))) * 904) + j18, 603585833L);
                                        String str10 = str9;
                                        int i168 = i167;
                                        int i169 = (~(1678765251 | i24)) | (-1716518356);
                                        int i170 = ((((~(i24 | (-37753105))) | (~((-1141222530) | i3))) * 502) + (((i169 | r14) * (-502)) - 1261529102)) & ((int) (e5 >> 32));
                                        int i171 = ((int) e5) & (((~((-1074336773) | i24)) * 501) + ((((~((-1074336773) | i3)) | 67109201) * 501) - 2071008516));
                                        if (((i170 & i171) | (i170 ^ i171)) == -725904754) {
                                            String str11 = (String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6);
                                            ((int[]) objArr2[2])[0] = i3;
                                            ((int[]) objArr2[0])[0] = (i3 & (-21)) | (i24 & 20);
                                            objArr2 = new Object[]{new int[1], null, new int[1], new int[1], str11};
                                            int i172 = (((~(766823589 | i24)) | (-1039454144)) * (-245)) + 1881430592;
                                            int i173 = ~(766823589 | i3);
                                            int i174 = ((i173 | 961810363) * 245) + (i173 * (-245)) + i172;
                                            int i175 = (i5 - (~(-(-((i174 & 16) + (i174 | 16)))))) - 1;
                                            int i176 = i175 << 13;
                                            int i177 = ((~i175) & i176) | ((~i176) & i175);
                                            int i178 = i177 >>> 17;
                                            int i179 = ((~i177) & i178) | ((~i178) & i177);
                                            int i180 = i179 << 5;
                                            ((int[]) objArr2[3])[0] = (i179 | i180) & (~(i179 & i180));
                                            break;
                                        }
                                        i167 = i168 + 1;
                                        str9 = str10;
                                        str7 = str4;
                                        c8 = 1;
                                        i36 = 2;
                                    }
                                }
                                str = str7;
                                i6 = 931995;
                                i7 = 10827986;
                                String str12 = (String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6);
                                int length4 = str12.length() - 6;
                                if (length4 >= 0) {
                                    int i181 = 0;
                                    while (i181 <= length4) {
                                        Object[] objArr33 = {str12.substring(i181, i181 + 6), 931995};
                                        Object f10 = rV4669.f(10827986);
                                        if (f10 == null) {
                                            int packedPositionChild = 5149 - ExpandableListView.getPackedPositionChild(0L);
                                            char c11 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                            int indexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 53;
                                            byte b9 = n[8];
                                            str3 = str12;
                                            i18 = length4;
                                            Object[] objArr34 = new Object[1];
                                            d((byte) 31, b9, (byte) (b9 + 3), objArr34);
                                            f10 = rV4669.g(packedPositionChild, c11, indexOf4, -1996364362, (String) objArr34[0], new Class[]{String.class, Integer.TYPE});
                                        } else {
                                            str3 = str12;
                                            i18 = length4;
                                        }
                                        long longValue6 = ((Long) ((Method) f10).invoke(null, objArr33)).longValue();
                                        long j21 = ((-489) * longValue6) - 779782805323L;
                                        long j22 = longValue6 ^ (-1);
                                        int i182 = i181;
                                        long uptimeMillis = (int) SystemClock.uptimeMillis();
                                        long e6 = com.fingerprintjs.android.fpjs_pro.g.e(490L, ((j22 | (-1588152353)) ^ (-1)) | ((j22 | uptimeMillis) ^ (-1)), ((-490) * (1588152352 | j22 | (uptimeMillis ^ (-1)))) + j21, 779899914737L);
                                        int i183 = ~((int) Runtime.getRuntime().maxMemory());
                                        int i184 = ((int) (e6 >> 32)) & ((((~(i183 | (-704210895))) | 1448794807) * 184) + (((-698426697) | i183) * 184) + 1146954458);
                                        int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                        int i185 = ((int) e6) & ((((~(freeMemory | 519166141)) | (-918060269)) * 376) + (((~((~freeMemory) | (-519166142))) | 380655788) * (-376)) + (((-675914834) | freeMemory) * 376) + 2088992125);
                                        if (((i184 & i185) | (i184 ^ i185)) == -2096167706) {
                                            String str13 = (String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6);
                                            ((int[]) objArr2[2])[0] = i3;
                                            ((int[]) objArr2[0])[0] = i3 ^ 20;
                                            objArr2 = new Object[]{new int[1], null, new int[1], new int[1], str13};
                                            int i186 = (((~((-894777465) | i24)) | 555036768) * 52) + (((~(894777464 | i24)) | (~(699790690 | i24)) | (-1039531387)) * (-52)) + (((~((-144753923) | i24)) * 52) - 1118178663);
                                            int i187 = i186 * (-1917);
                                            int i188 = (15360 & i187) + (i187 | 15360);
                                            int i189 = ~i186;
                                            int i190 = ~((i189 ^ i24) | (i189 & i24));
                                            int i191 = ~((i3 ^ 16) | (i3 & 16));
                                            int i192 = -(-(((i190 & i191) | (i190 ^ i191)) * 959));
                                            int i193 = (i188 ^ i192) + ((i192 & i188) << 1);
                                            int i194 = i189 * (-959);
                                            int i195 = ((i193 | i194) << 1) - (i194 ^ i193);
                                            int i196 = ~(i189 | i3);
                                            int i197 = ~(i24 | 16);
                                            int i198 = -(-(((i196 & i197) | (i196 ^ i197)) * 959));
                                            int i199 = -(-((i195 ^ i198) + ((i198 & i195) << 1)));
                                            int i200 = (i5 ^ i199) + ((i199 & i5) << 1);
                                            int i201 = i200 << 13;
                                            int i202 = (i201 | i200) & (~(i200 & i201));
                                            int i203 = i202 >>> 17;
                                            int i204 = (i202 | i203) & (~(i202 & i203));
                                            int i205 = i204 << 5;
                                            ((int[]) objArr2[3])[0] = (i204 | i205) & (~(i204 & i205));
                                            break;
                                        }
                                        i181 = i182 + 1;
                                        str12 = str3;
                                        length4 = i18;
                                    }
                                }
                                String substring2 = ((String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6)).substring(0, indexOf3);
                                int i206 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                int i207 = (i206 ^ 51109) + ((i206 & 51109) << 1);
                                Object[] objArr35 = new Object[1];
                                b("枀", i207, objArr35);
                                split = substring2.split((String) objArr35[0]);
                                length = split.length;
                                i11 = 0;
                                loop4: while (i11 < length) {
                                    str2 = split[i11];
                                    Object[] objArr36 = new Object[1];
                                    b("柴鎠辰", 62498 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr36);
                                    if (str2.split((String) objArr36[0]).length > 1) {
                                        Class cls6 = (Class) rV4669.e((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49472), (ViewConfiguration.getFadingEdgeLength() >> 16) + 4839, 52 - TextUtils.indexOf("", "", 0, 0));
                                        synchronized (cls6) {
                                            try {
                                                try {
                                                    int i208 = -TextUtils.getCapsMode("", 0, 0);
                                                    int i209 = (i208 ^ 53987) + ((i208 & 53987) << 1);
                                                    Object[] objArr37 = new Object[1];
                                                    b("柟딡쉉Ὢⱊ禳隉ꎺ\uf0c7ี嬒栅蕪퉏\uefa0㲑", i209, objArr37);
                                                    String str14 = (String) objArr37[0];
                                                    try {
                                                        runtime = Runtime.getRuntime();
                                                        int i210 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                        strArr = split;
                                                        int i211 = (i210 * (-496)) - 13829968;
                                                        int i212 = ~i210;
                                                        i12 = length;
                                                        int i213 = (i212 ^ (-27884)) | (i212 & (-27884));
                                                        i13 = i11;
                                                        int i214 = -(-((~i213) * 497));
                                                        int i215 = ((i211 | i214) << 1) - (i211 ^ i214);
                                                        int i216 = ~((i213 & i3) | (i213 ^ i3));
                                                        int i217 = ((-27884) ^ i24) | ((-27884) & i24);
                                                        int i218 = ~((i217 ^ i210) | (i217 & i210));
                                                        int i219 = -(-(((i216 ^ i218) | (i216 & i218)) * 497));
                                                        int i220 = (i215 ^ i219) + ((i215 & i219) << 1);
                                                        int i221 = ~((i212 ^ i24) | (i212 & i24));
                                                        int i222 = ~((i212 & 27883) | (i212 ^ 27883));
                                                        int i223 = (i221 & i222) | (i221 ^ i222);
                                                        int i224 = ((-27884) ^ i210) | ((-27884) & i210);
                                                        int i225 = ~((i224 & i3) | (i224 ^ i3));
                                                        i14 = (i220 - (~(((i223 & i225) | (i223 ^ i225)) * 497))) - 1;
                                                    } catch (Exception unused) {
                                                        strArr = split;
                                                        i12 = length;
                                                        i13 = i11;
                                                    }
                                                    try {
                                                        Object[] objArr38 = new Object[1];
                                                        b("柜ବ", i14, objArr38);
                                                        Process exec = runtime.exec((String) objArr38[0], (String[]) null, (File) null);
                                                        try {
                                                            Object[] objArr39 = {exec.getInputStream()};
                                                            Object f11 = rV4669.f(-862139665);
                                                            if (f11 == null) {
                                                                i15 = 57229;
                                                                process = exec;
                                                                f11 = rV4669.g(TextUtils.lastIndexOf("", '0', 0) + 4685, (char) (57229 - Color.blue(0)), 52 - TextUtils.indexOf("", "", 0, 0), 1161303947, null, new Class[]{InputStream.class});
                                                            } else {
                                                                process = exec;
                                                                i15 = 57229;
                                                            }
                                                            newInstance = ((Constructor) f11).newInstance(objArr39);
                                                            try {
                                                                Object[] objArr40 = {process.getErrorStream()};
                                                                Object f12 = rV4669.f(-862139665);
                                                                if (f12 == null) {
                                                                    f12 = rV4669.g(4684 - (TypedValue.complexToFloat(0) > f4 ? 1 : (TypedValue.complexToFloat(0) == f4 ? 0 : -1)), (char) (i15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53, 1161303947, null, new Class[]{InputStream.class});
                                                                }
                                                                newInstance2 = ((Constructor) f12).newInstance(objArr40);
                                                                dataOutputStream = new DataOutputStream(process.getOutputStream());
                                                                try {
                                                                    Class<?> cls7 = Class.forName(str);
                                                                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                    Object[] objArr41 = new Object[1];
                                                                    b("柜שׁ帬넎ᐟ", (fadingEdgeLength & 40177) + (fadingEdgeLength | 40177), objArr41);
                                                                    cls7.getMethod((String) objArr41[0], null).invoke(newInstance, null);
                                                                    try {
                                                                        Class<?> cls8 = Class.forName(str);
                                                                        int i226 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                        int i227 = i226 * 221;
                                                                        int i228 = (i227 ^ (-8798763)) + ((i227 & (-8798763)) << 1);
                                                                        int i229 = ~i226;
                                                                        int i230 = ~((i229 ^ (-40178)) | (i229 & (-40178)));
                                                                        int i231 = i24 | i226;
                                                                        int i232 = ~((i231 ^ 40177) | (i231 & 40177));
                                                                        int i233 = -(-(((i230 ^ i232) | (i230 & i232)) * 220));
                                                                        int i234 = (i228 & i233) + (i228 | i233);
                                                                        int i235 = ~((i24 ^ 40177) | (i24 & 40177));
                                                                        int i236 = -(-(((i226 ^ i235) | (i235 & i226)) * (-440)));
                                                                        int i237 = (i234 & i236) + (i236 | i234);
                                                                        int i238 = (i226 & 40177) | (i226 ^ 40177);
                                                                        int i239 = ((i238 & i3) | (i238 ^ i3)) * 220;
                                                                        int i240 = ((i237 | i239) << 1) - (i237 ^ i239);
                                                                        Object[] objArr42 = new Object[1];
                                                                        b("柜שׁ帬넎ᐟ", i240, objArr42);
                                                                        cls8.getMethod((String) objArr42[0], null).invoke(newInstance2, null);
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append(str14);
                                                                        int i241 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                        char c12 = (char) ((-2) - (~(-Process.getGidForName(""))));
                                                                        int i242 = -TextUtils.lastIndexOf("", '0', 0);
                                                                        int i243 = (i242 ^ 130) + ((i242 & 130) << 1);
                                                                        Object[] objArr43 = new Object[1];
                                                                        c(c12, i241, i243, objArr43);
                                                                        sb.append((String) objArr43[0]);
                                                                        String obj = sb.toString();
                                                                        int i244 = -View.resolveSize(0, 0);
                                                                        Object[] objArr44 = new Object[1];
                                                                        c((char) ((-2) - ((-TextUtils.lastIndexOf("", '0', 0, 0)) ^ (-1))), ((i244 | 5) << 1) - (i244 ^ 5), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 132, objArr44);
                                                                        dataOutputStream.write(obj.getBytes((String) objArr44[0]));
                                                                        dataOutputStream.flush();
                                                                        int keyCodeFromString = 5 - KeyEvent.keyCodeFromString("");
                                                                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                                        int i245 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                        int i246 = (i245 & 137) + (i245 | 137);
                                                                        Object[] objArr45 = new Object[1];
                                                                        c(deadChar, keyCodeFromString, i246, objArr45);
                                                                        String str15 = (String) objArr45[0];
                                                                        int i247 = -Color.green(0);
                                                                        int i248 = (i247 & 5) + (i247 | 5);
                                                                        int i249 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                        int b10 = h2.b();
                                                                        int i250 = (i249 * (-751)) - 751;
                                                                        int i251 = ~i249;
                                                                        int i252 = ~((i251 ^ (-2)) | (i251 & (-2)));
                                                                        int i253 = ~((i251 ^ b10) | (i251 & b10));
                                                                        int i254 = ((i252 ^ i253) | (i252 & i253)) * 1504;
                                                                        int i255 = (i250 & i254) + (i254 | i250);
                                                                        int i256 = (i251 ^ 1) | (i251 & 1);
                                                                        int i257 = ((~((b10 & i256) | (i256 ^ b10))) * (-1504)) + i255;
                                                                        int i258 = -(-(((~i256) | (~(((-2) ^ i249) | ((-2) & i249)))) * 752));
                                                                        char c13 = (char) ((i257 ^ i258) + ((i258 & i257) << 1));
                                                                        int i259 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                                        int i260 = (i259 ^ 132) + ((i259 & 132) << 1);
                                                                        Object[] objArr46 = new Object[1];
                                                                        c(c13, i248, i260, objArr46);
                                                                        dataOutputStream.write(str15.getBytes((String) objArr46[0]));
                                                                        dataOutputStream.flush();
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
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
                                                    } catch (Exception unused2) {
                                                        cls3 = cls6;
                                                        int i261 = 26 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
                                                        char c14 = (char) (13378 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                                        int i262 = -(-TextUtils.indexOf("", ""));
                                                        int i263 = ((i262 | 151) << 1) - (i262 ^ 151);
                                                        Object[] objArr47 = new Object[1];
                                                        c(c14, i261, i263, objArr47);
                                                        throw new IOException((String) objArr47[0]);
                                                        break;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    cls3 = cls6;
                                                }
                                            } catch (IOException unused3) {
                                                strArr = split;
                                                i12 = length;
                                                i13 = i11;
                                                cls3 = cls6;
                                            }
                                            try {
                                                long nanoTime = System.nanoTime();
                                                long j23 = 2000000000;
                                                while (true) {
                                                    try {
                                                        process.exitValue();
                                                        dataOutputStream2 = dataOutputStream;
                                                        cls3 = cls6;
                                                        break;
                                                    } catch (IllegalThreadStateException unused4) {
                                                        if (j23 > 0) {
                                                            DataOutputStream dataOutputStream3 = dataOutputStream;
                                                            cls3 = cls6;
                                                            long j24 = (j23 / 1000000) + 1;
                                                            j2 = nanoTime;
                                                            try {
                                                                Object[] objArr48 = {Long.valueOf(Math.min(j24, 3L))};
                                                                Class<?> cls9 = Class.forName(str);
                                                                int i264 = -Drawable.resolveOpacity(0, 0);
                                                                dataOutputStream2 = dataOutputStream3;
                                                                Object[] objArr49 = new Object[1];
                                                                c((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (i264 ^ 5) + ((i264 & 5) << 1), 141 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr49);
                                                                cls9.getMethod((String) objArr49[0], Long.TYPE).invoke(null, objArr48);
                                                            } catch (Throwable th6) {
                                                                Throwable cause5 = th6.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th6;
                                                            }
                                                        } else {
                                                            dataOutputStream2 = dataOutputStream;
                                                            cls3 = cls6;
                                                            j2 = nanoTime;
                                                        }
                                                        long nanoTime2 = 2000000000 - (System.nanoTime() - j2);
                                                        if (nanoTime2 > 0) {
                                                            nanoTime = j2;
                                                            f4 = 0.0f;
                                                            j23 = nanoTime2;
                                                            dataOutputStream = dataOutputStream2;
                                                            cls6 = cls3;
                                                        }
                                                    }
                                                }
                                            } catch (InterruptedException e7) {
                                                throw e7;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                try {
                                                    process.destroy();
                                                } catch (Exception unused5) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        strArr = split;
                                        i12 = length;
                                        i13 = i11;
                                    }
                                    int i265 = i13 + 79;
                                    i11 = (i265 & (-78)) + (i265 | (-78));
                                    split = strArr;
                                    length = i12;
                                    f4 = 0.0f;
                                }
                            } else {
                                i6 = 931995;
                                i7 = 10827986;
                            }
                            objArr2 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                            int a8 = k84.a(~(Process.myTid() | (-33859586)), -1504, (((~((-369421188) | r1)) | 335561602) * 1504) - 406178459, -1572310544);
                            int i266 = (i5 & a8) + (i5 | a8);
                            int i267 = i266 << 13;
                            int i268 = (i267 & (~i266)) | ((~i267) & i266);
                            int i269 = i268 >>> 17;
                            int i270 = ((~i268) & i269) | ((~i269) & i268);
                            int i271 = i270 << 5;
                            c5 = 0;
                            ((int[]) objArr2[3])[0] = ((~i270) & i271) | ((~i271) & i270);
                            if (((int[]) objArr2[c5])[c5] == i3) {
                                return objArr2;
                            }
                            int[] iArr5 = new int[1];
                            int[] iArr6 = new int[1];
                            iArr6[c5] = i3;
                            iArr5[c5] = i3;
                            Object[] objArr50 = {iArr5, null, iArr6, new int[1], null};
                            int a9 = hdi.a();
                            int i272 = ~a9;
                            int i273 = (((~(a9 | 819507987)) | (~(i272 | 1014494761))) * 979) + ((a9 | 1014494761) * (-979)) + ((~(819507987 | i272)) * 979) + 387348316;
                            int i274 = (i5 & i273) + (i5 | i273);
                            int i275 = i274 << 13;
                            int i276 = (i275 | i274) & (~(i274 & i275));
                            int i277 = i276 ^ (i276 >>> 17);
                            int i278 = i277 << 5;
                            ((int[]) objArr50[3])[0] = (i277 | i278) & (~(i277 & i278));
                            if (((int[]) objArr50[0])[0] != i3) {
                                return objArr50;
                            }
                            if ((i4 & 1) == 0) {
                                int i279 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                int i280 = ((i279 | 13) << 1) - (i279 ^ 13);
                                char c15 = (char) (20047 - (~Color.red(0)));
                                int i281 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i282 = ((i281 | MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD) << 1) - (i281 ^ MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
                                Object[] objArr51 = new Object[1];
                                c(c15, i280, i282, objArr51);
                                try {
                                    Object[] objArr52 = {(String) objArr51[0]};
                                    int i283 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int b11 = h2.b();
                                    int i284 = (i283 * 284) - 5151858;
                                    int i285 = ~i283;
                                    int i286 = ~(i285 | 18269);
                                    int i287 = ~(i285 | b11);
                                    int i288 = ((i286 & i287) | (i286 ^ i287)) * (-283);
                                    int i289 = ((~(((-18270) & i283) | ((-18270) ^ i283))) * 283) + (((i284 | i288) << 1) - (i284 ^ i288));
                                    int i290 = (i285 ^ (-18270)) | (i285 & (-18270));
                                    int i291 = (i289 - (~((~((b11 & i290) | (i290 ^ b11))) * 283))) - 1;
                                    Object[] objArr53 = new Object[1];
                                    b("柎ₜ\ue971뇊窴̗쯥鐊崤\ue585깣眤㾖\uf878胍䧲ሼ\udaed捋ⰼ\uf48e뵶䘥", i291, objArr53);
                                    Class<?> cls10 = Class.forName((String) objArr53[0]);
                                    int i292 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    int i293 = ((i292 | 16) << 1) - (i292 ^ 16);
                                    char c16 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                    int i294 = ~packedPositionChild2;
                                    int i295 = ~((i294 ^ 220) | (i294 & 220));
                                    int i296 = (((packedPositionChild2 * (-1975)) + 217580) - (~(-(-(((i295 & i3) | (i3 ^ i295)) * 988))))) - 1;
                                    int i297 = ~((-221) | packedPositionChild2);
                                    int i298 = ~((packedPositionChild2 & i24) | (i24 ^ packedPositionChild2));
                                    int i299 = (((i298 & i297) | (i297 ^ i298)) * (-1976)) + i296;
                                    int i300 = ~(i294 | 220);
                                    int i301 = ~(((-221) & i3) | ((-221) ^ i3));
                                    int i302 = -(-(((i300 & i301) | (i300 ^ i301) | (~((i24 ^ 220) | (i24 & 220)))) * 988));
                                    int i303 = ((i299 | i302) << 1) - (i299 ^ i302);
                                    Object[] objArr54 = new Object[1];
                                    c(c16, i293, i303, objArr54);
                                    Object invoke3 = cls10.getMethod((String) objArr54[0], String.class).invoke(context2, objArr52);
                                    if (invoke3 != null) {
                                        int i304 = -(-TextUtils.indexOf("", "", 0));
                                        int i305 = (i304 ^ 2999) + ((i304 & 2999) << 1);
                                        Object[] objArr55 = new Object[1];
                                        b("柎汶炥䓸䤜嵕ↁ㖀㩶ະዹ\ue75c\ueb5aﾀ쏀졿\udcb1ꂦ딵륟趕釅晶檻绗䌟坕宋⿈㑭㢐೧ᄡ\ue559\ue986\ufdcf쉡", i305, objArr55);
                                        Class<?> cls11 = Class.forName((String) objArr55[0]);
                                        Object[] objArr56 = new Object[1];
                                        c((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, (ViewConfiguration.getPressedStateDuration() >> 16) + 235, objArr56);
                                        List list = (List) cls11.getMethod((String) objArr56[0], null).invoke(invoke3, null);
                                        if (list != null) {
                                            loop1: for (Object obj2 : list) {
                                                int i306 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i307 = (i306 & 30) + (i306 | 30);
                                                int gidForName = Process.getGidForName("");
                                                int i308 = -Gravity.getAbsoluteGravity(0, 0);
                                                int i309 = (i308 & RadarSimpleLogBuffer.PURGE_AMOUNT) + (i308 | RadarSimpleLogBuffer.PURGE_AMOUNT);
                                                Object[] objArr57 = new Object[1];
                                                c((char) ((gidForName & 1) + (gidForName | 1)), i307, i309, objArr57);
                                                Class<?> cls12 = Class.forName((String) objArr57[0]);
                                                int i310 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                int i311 = ((i310 | 13) << 1) - (i310 ^ 13);
                                                char longPressTimeout = (char) (23447 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                                int i312 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int i313 = (i312 & 110) + (i312 | 110);
                                                Object[] objArr58 = new Object[1];
                                                c(longPressTimeout, i311, i313, objArr58);
                                                String str16 = (String) cls12.getMethod((String) objArr58[0], null).invoke(obj2, null);
                                                int i314 = -ExpandableListView.getPackedPositionChild(0L);
                                                int i315 = ((i314 | 2998) << 1) - (i314 ^ 2998);
                                                Object[] objArr59 = new Object[1];
                                                b("柎汶炥䓸䤜嵕ↁ㖀㩶ະዹ\ue75c\ueb5aﾀ쏀졿\udcb1ꂦ딵륟趕釅晶檻绗䌟坕宋⿈㑭㢐೧ᄡ\ue559\ue986\ufdcf쉡", i315, objArr59);
                                                Class<?> cls13 = Class.forName((String) objArr59[0]);
                                                Object[] objArr60 = new Object[1];
                                                b("柆樏籙交傌⋖㔴܆॒ᮋ\uede6\uffd0숮푪Ꙥꢂ뫯", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3538, objArr60);
                                                if (((Boolean) cls13.getMethod((String) objArr60[0], String.class).invoke(invoke3, str16)).booleanValue()) {
                                                    int length5 = str16.length();
                                                    int i316 = ((length5 | (-20)) << 1) - (length5 ^ (-20));
                                                    if (i316 >= 0) {
                                                        int i317 = 0;
                                                        while (i317 <= i316) {
                                                            Object[] objArr61 = {str16.substring(i317, i317 + 20), Integer.valueOf(i6)};
                                                            Object f13 = rV4669.f(i7);
                                                            if (f13 == null) {
                                                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 5150;
                                                                char indexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                                                int threadPriority2 = 52 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                                byte b12 = n[8];
                                                                Object[] objArr62 = new Object[1];
                                                                d((byte) 31, b12, (byte) (b12 + 3), objArr62);
                                                                f13 = rV4669.g(edgeSlop, indexOf5, threadPriority2, -1996364362, (String) objArr62[0], new Class[]{String.class, Integer.TYPE});
                                                            }
                                                            long longValue7 = ((Long) ((Method) f13).invoke(null, objArr61)).longValue();
                                                            long j25 = ((-344) * longValue7) + 571865908912L;
                                                            long j26 = longValue7 ^ (-1);
                                                            long j27 = 1662400897 | j26;
                                                            long a10 = hdi.a();
                                                            long e8 = com.fingerprintjs.android.fpjs_pro.g.e(345L, (j27 | a10) ^ (-1), ((((j26 | (-1662400898)) ^ (-1)) | ((1662400897 | (a10 ^ (-1))) ^ (-1))) * 345) + (((j27 ^ (-1)) | ((1662400897 | a10) ^ (-1))) * 345) + j25, 1779510802L);
                                                            int i318 = (~((-1720670178) | i3)) | 1711953345;
                                                            int i319 = ((int) (e8 >> 32)) & ((((~((-274726935) | i24)) | (~((-8716833) | i3))) * 470) + (((i318 | r10) * (-470)) - 1398553088));
                                                            int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                                            int i320 = ~maxMemory;
                                                            int i321 = ~(1487928125 | i320);
                                                            int i322 = ((int) e8) & ((((-1369812761) | i321) * 712) + (((~(maxMemory | 1504706365)) | (~(i320 | (-16778241)))) * (-712)) + ((16778240 | i321) * (-712)) + 363979629);
                                                            if (((i322 & i319) | (i319 ^ i322)) == 1245577864) {
                                                                objArr6 = new Object[]{new int[]{(i3 & (-71)) | (i24 & 70)}, null, new int[]{i3}, r4, null};
                                                                int i323 = (((~((-236609600) | i3)) | (-532407168)) * 302) + ((~((-135798806) | i3)) * (-604)) + (((~((-135798806) | i24)) | (~((-100810795) | i3))) * (-302)) + 129727707;
                                                                int i324 = ~i323;
                                                                int i325 = ~(((-17) ^ i324) | ((-17) & i324));
                                                                int i326 = ~(((-17) ^ i24) | ((-17) & i24));
                                                                int i327 = (i325 & i326) | (i325 ^ i326) | (~((i324 ^ i24) | (i324 & i24)));
                                                                int i328 = (i323 ^ 16) | (i323 & 16);
                                                                int i329 = (((((i323 * 85) + 1360) - (~((i327 | (~((i328 ^ i3) | (i328 & i3)))) * (-84)))) - 1) - (~(-(-((((~(i324 | i3)) | 16) | (~(i24 | i323))) * (-84)))))) - 1;
                                                                int i330 = ~((i323 & i24) | (i24 ^ i323));
                                                                int i331 = ~i328;
                                                                i8 = i5;
                                                                int a11 = k84.a((i330 & i331) | (i330 ^ i331), 84, i329, i8);
                                                                int i332 = a11 << 13;
                                                                int i333 = ((~a11) & i332) | ((~i332) & a11);
                                                                int i334 = i333 >>> 17;
                                                                int i335 = ((~i333) & i334) | ((~i334) & i333);
                                                                int i336 = i335 << 5;
                                                                int[] iArr7 = {(i335 | i336) & (~(i335 & i336))};
                                                                c7 = 0;
                                                                break loop1;
                                                            }
                                                            int i337 = (i317 ^ 42) + ((i317 & 42) << 1);
                                                            i317 = ((i337 | (-41)) << 1) - (i337 ^ (-41));
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i5;
                                    objArr6 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                                    int i338 = ~(((int) Runtime.getRuntime().totalMemory()) | (-422971249));
                                    int d2 = hdi.d(i338 | 421660016, 220, (((-617958023) | i338) * (-220)) + 1656883955, 1750368222, i8);
                                    int i339 = d2 << 13;
                                    int i340 = (d2 | i339) & (~(d2 & i339));
                                    int i341 = i340 >>> 17;
                                    int i342 = ((~i340) & i341) | ((~i341) & i340);
                                    int i343 = i342 << 5;
                                    c7 = 0;
                                    ((int[]) objArr6[3])[0] = (i342 | i343) & (~(i342 & i343));
                                    if (((int[]) objArr6[c7])[c7] != i3) {
                                        return objArr6;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause6 = th8.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th8;
                                }
                            } else {
                                i8 = i5;
                            }
                            int i344 = -(-TextUtils.indexOf("", ""));
                            int i345 = (i344 ^ 12) + ((i344 & 12) << 1);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                            Object[] objArr63 = new Object[1];
                            c((char) ((packedPositionType & 18399) + (packedPositionType | 18399)), i345, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr63);
                            Object[] objArr64 = {(String) objArr63[0]};
                            Object f14 = rV4669.f(-1355975516);
                            if (f14 == null) {
                                int i346 = 6047 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int indexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53;
                                byte b13 = n[8];
                                Object[] objArr65 = new Object[1];
                                d((byte) 32, b13, b13, objArr65);
                                f14 = rV4669.g(i346, packedPositionGroup, indexOf6, 646556096, (String) objArr65[0], new Class[]{String.class});
                            }
                            long longValue8 = ((Long) ((Method) f14).invoke(null, objArr64)).longValue();
                            long j28 = (246 * longValue8) + 13768470796L;
                            long j29 = longValue8 ^ (-1);
                            long j30 = (int) Runtime.getRuntime().totalMemory();
                            long j31 = (((((j30 ^ (-1)) | j29) ^ (-1)) | ((j29 | (-56428159)) ^ (-1))) * (-245)) + j28;
                            long j32 = (j29 | j30) ^ (-1);
                            long e9 = com.fingerprintjs.android.fpjs_pro.g.e(245L, (-56428159) | j32, ((-245) * j32) + j31, -284089480L);
                            int i347 = ((int) (e9 >> 32)) & ((((~((-1073465445) | i24)) | 709967904) * 52) + (((~(1073465444 | i24)) | (~((-363760967) | i24)) | 263426) * (-52)) + (((~(1073728870 | i24)) * 52) - 1107668078));
                            int i348 = (int) Runtime.getRuntime().totalMemory();
                            int i349 = ((int) e9) & ((((~(i348 | (-276819189))) | 274050144 | (~((~i348) | (-1711276555)))) * 164) + (((-1714045599) | i348) * 164) + ((((~(276819188 | r4)) | (-1714045599)) * (-328)) - 1521536983));
                            if (((i349 & i347) | (i347 ^ i349)) != 0) {
                                objArr3 = new Object[]{new int[]{(i3 & (-51)) | (i24 & 50)}, null, new int[]{i3}, r4, null};
                                int i350 = (((~(468151809 | i24)) | (~(i24 | 663138583))) * 865) + ((~(i3 | 663138583)) * 865) + ((((~((-663138584) | i24)) | 468151809) * (-865)) - 491366770);
                                int i351 = i350 * (-864);
                                int i352 = ~i350;
                                int i353 = ((~((i3 ^ 16) | (i3 & 16))) * 865) + (((~(((-17) ^ i24) | ((-17) & i24))) | i352) * (-865)) + (((13856 | i351) << 1) - (i351 ^ 13856));
                                int i354 = ~((i352 & i24) | (i352 ^ i24));
                                int i355 = ~((i24 ^ 16) | (i24 & 16));
                                int i356 = -(-((((i354 & i355) | (i354 ^ i355)) * 865) + i353));
                                int i357 = ((i8 | i356) << 1) - (i356 ^ i8);
                                int i358 = (i357 << 13) ^ i357;
                                int i359 = i358 >>> 17;
                                int i360 = (i358 | i359) & (~(i358 & i359));
                                int[] iArr8 = {i360 ^ (i360 << 5)};
                                i9 = 0;
                            } else {
                                objArr3 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                int i361 = ~elapsedCpuTime;
                                int a12 = k84.a((~(elapsedCpuTime | (-1845254))) | (~(542911877 | i361)) | (-888991728), 140, (((~((-347925104) | i361)) | 1845253) * (-280)) + ((elapsedCpuTime | (-347925104)) * 140) + 1822986833, i8);
                                int i362 = a12 ^ (a12 << 13);
                                int i363 = i362 >>> 17;
                                int i364 = (i362 | i363) & (~(i362 & i363));
                                i9 = 0;
                                ((int[]) objArr3[3])[0] = i364 ^ (i364 << 5);
                            }
                            if (((int[]) objArr3[i9])[i9] != i3) {
                                return objArr3;
                            }
                            int i365 = 20 - (CdmaCellLocation.convertQuartSecToDecDegrees(i9) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i9) == ConstantsKt.UNSET ? 0 : -1));
                            int i366 = -View.resolveSize(i9, i9);
                            int b14 = h2.b();
                            int i367 = i366 * 371;
                            int i368 = ((i367 | 8535597) << 1) - (i367 ^ 8535597);
                            int i369 = ~b14;
                            int i370 = ~(((-23008) & i369) | ((-23008) ^ i369));
                            int i371 = ~i366;
                            int i372 = (i370 | (~((i371 ^ b14) | (i371 & b14)))) * (-370);
                            int i373 = (i368 & i372) + (i372 | i368);
                            int i374 = ~(i369 | i371);
                            int i375 = ~((b14 & (-23008)) | ((-23008) ^ b14));
                            int i376 = ~((i366 & 23007) | (i366 ^ 23007));
                            int i377 = ((i375 & i374) | (i374 ^ i375) | i376) * (-370);
                            char c17 = (char) ((i376 * 370) + (((i373 | i377) << 1) - (i377 ^ i373)));
                            int i378 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i379 = (i378 & 12) + (i378 | 12);
                            Object[] objArr66 = new Object[1];
                            c(c17, i365, i379, objArr66);
                            Object[] objArr67 = {(String) objArr66[0]};
                            Object f15 = rV4669.f(-1355975516);
                            if (f15 == null) {
                                int alpha = Color.alpha(0) + 6046;
                                char c18 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                int i380 = 53 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                byte b15 = n[8];
                                Object[] objArr68 = new Object[1];
                                d((byte) 32, b15, b15, objArr68);
                                f15 = rV4669.g(alpha, c18, i380, 646556096, (String) objArr68[0], new Class[]{String.class});
                            }
                            long longValue9 = ((Long) ((Method) f15).invoke(null, objArr67)).longValue();
                            long j33 = 748291017 | longValue9;
                            long j34 = ((-502) * j33) + (503 * longValue9) + 376390381551L;
                            long j35 = i3;
                            long j36 = j35 ^ (-1);
                            long j37 = (-748291018) | j36;
                            long j38 = (j33 | j35) ^ (-1);
                            long e10 = com.fingerprintjs.android.fpjs_pro.g.e(502L, ((longValue9 | j37) ^ (-1)) | j38, (((((longValue9 ^ (-1)) | (-748291018)) ^ (-1)) | (j37 ^ (-1)) | j38) * (-502)) + j34, -1088808656L);
                            int i381 = ((int) (e10 >> 32)) & ((((~(2036353293 | i3)) | (-599126883)) * 519) + (((~(2079718255 | i24)) | (~((-43364963) | i3))) * (-519)) + ((((~(599126882 | i24)) | 2036353293) * 519) - 1453938172));
                            int i382 = ((int) e10) & (((1360687811 | (~((-1497053075) | i24))) * 160) + (((~(i24 | 1360687811)) | (-1497069524)) * (-160)) + 883100661);
                            if (((i382 & i381) | (i381 ^ i382)) != 0) {
                                objArr4 = new Object[]{new int[]{i3 ^ 60}, null, new int[]{i3}, r4, null};
                                int i383 = (((~(64436045 | i24)) | 62915400) * 495) + ((r1 * 495) - 883364660);
                                int i384 = (((i383 | 16) << 1) - (i383 ^ 16)) + i8;
                                int i385 = i384 << 13;
                                int i386 = (i385 & (~i384)) | ((~i385) & i384);
                                int i387 = i386 >>> 17;
                                int i388 = ((~i386) & i387) | ((~i387) & i386);
                                int i389 = i388 << 5;
                                int[] iArr9 = {(i388 | i389) & (~(i388 & i389))};
                                i10 = 0;
                            } else {
                                objArr4 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                                int i390 = (int) Runtime.getRuntime().totalMemory();
                                int i391 = ~i390;
                                int i392 = (((~(i391 | (-414924135))) | 1704036) * 560) + ((~(i390 | 1023131006)) * (-560)) + ((~(609910908 | i391)) * (-560)) + 1812980357;
                                int i393 = ((i392 << 1) - i392) + i8;
                                int i394 = i393 << 13;
                                int i395 = (i393 | i394) & (~(i393 & i394));
                                int i396 = i395 ^ (i395 >>> 17);
                                i10 = 0;
                                ((int[]) objArr4[3])[0] = i396 ^ (i396 << 5);
                            }
                            if (((int[]) objArr4[i10])[i10] != i3) {
                                return objArr4;
                            }
                            int i397 = -(ExpandableListView.getPackedPositionForChild(i10, i10) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i10, i10) == 0L ? 0 : -1));
                            int i398 = (i397 ^ 35) + ((i397 & 35) << 1);
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int mode = View.MeasureSpec.getMode(0);
                            int b16 = h2.b();
                            int i399 = (mode * 69) - 2144;
                            int i400 = ~mode;
                            int i401 = (i400 ^ (-33)) | (i400 & (-33));
                            int i402 = ~b16;
                            int i403 = ~((i401 & i402) | (i401 ^ i402));
                            int i404 = ~((mode & 32) | (mode ^ 32));
                            int i405 = (i404 & i403) | (i403 ^ i404);
                            int i406 = ~((b16 & 32) | (b16 ^ 32));
                            int i407 = ((i405 & i406) | (i405 ^ i406)) * (-68);
                            int i408 = ((i399 | i407) << 1) - (i407 ^ i399);
                            int i409 = (i400 ^ i402) | (i400 & i402);
                            int i410 = -(-((~((i409 & 32) | (i409 ^ 32))) * (-68)));
                            int i411 = (i408 ^ i410) + ((i410 & i408) << 1);
                            int i412 = ~(((-33) & i402) | ((-33) ^ i402));
                            int i413 = ((i412 & i400) | (i400 ^ i412)) * 68;
                            int i414 = ((i411 | i413) << 1) - (i413 ^ i411);
                            Object[] objArr69 = new Object[1];
                            c(scrollDefaultDelay, i398, i414, objArr69);
                            Object[] objArr70 = {(String) objArr69[0]};
                            Object f16 = rV4669.f(-1567326429);
                            if (f16 == null) {
                                int indexOf7 = TextUtils.indexOf((CharSequence) "", '0') + 6047;
                                char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                                int indexOf8 = TextUtils.indexOf("", "", 0, 0) + 52;
                                byte b17 = n[8];
                                Object[] objArr71 = new Object[1];
                                d((byte) 31, b17, b17, objArr71);
                                f16 = rV4669.g(indexOf7, keyCodeFromString2, indexOf8, 724607559, (String) objArr71[0], new Class[]{String.class});
                            }
                            long longValue10 = ((Long) ((Method) f16).invoke(null, objArr70)).longValue();
                            long j39 = longValue10 ^ (-1);
                            long myTid = Process.myTid();
                            long e11 = com.fingerprintjs.android.fpjs_pro.g.e(366L, ((longValue10 | 923372485) ^ (-1)) | (((j39 | (-923372486)) | myTid) ^ (-1)), ((-366) * ((-923372486) | ((j39 | myTid) ^ (-1)))) + (((-923372486) | longValue10) * (-366)) + ((367 * longValue10) - 338877702362L), 1426126725L);
                            if (((((int) e11) & ((((~((-2000517189) | i24)) | 1143294549) * 398) + (((~((-2000517189) | i3)) | 1143294549) * 398) + 1455942153)) | (((int) (e11 >> 32)) & ((((~((-564662531) | i24)) | (~((-1112918678) | i3))) * 318) + (((~(1180159677 | i3)) | (~((-1112918678) | i24))) * 318) + ((((~(1677581207 | i3)) | 1180159677) * (-318)) - 2123997474)))) != 0) {
                                objArr5 = new Object[]{new int[]{(i3 & (-81)) | (i24 & 80)}, null, new int[]{i3}, new int[1], null};
                                int a13 = k84.a((~((~Process.myPid()) | (-139469313))) | 33591429, 576, (((~((-150432329) | r1)) | 10963016) * 576) - 448244779, 2019729920);
                                int i415 = -(-((a13 ^ 16) + ((a13 & 16) << 1)));
                                int i416 = ((i8 | i415) << 1) - (i415 ^ i8);
                                int i417 = (i416 << 13) ^ i416;
                                int i418 = i417 >>> 17;
                                int i419 = (i417 | i418) & (~(i417 & i418));
                                int i420 = i419 << 5;
                                c6 = 0;
                                ((int[]) objArr5[3])[0] = ((~i419) & i420) | ((~i420) & i419);
                            } else {
                                objArr5 = new Object[]{new int[]{i3}, null, new int[]{i3}, new int[1], null};
                                int b18 = hdi.b(283772899);
                                int i421 = (((~(b18 | 791038538)) | 281117984) * 116) + ((986025312 | b18) * 116) + (((~((~b18) | (-86131211))) * (-116)) - 948642415);
                                int i422 = (i8 & i421) + (i421 | i8);
                                int i423 = i422 << 13;
                                int i424 = (i423 & (~i422)) | ((~i423) & i422);
                                int i425 = i424 >>> 17;
                                int i426 = ((~i424) & i425) | ((~i425) & i424);
                                int i427 = i426 << 5;
                                c6 = 0;
                                ((int[]) objArr5[3])[0] = ((~i426) & i427) | ((~i427) & i426);
                            }
                            if (((int[]) objArr5[c6])[c6] != i3) {
                                return objArr5;
                            }
                            int i428 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i429 = (i428 & 43) + (i428 | 43);
                            int i430 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i431 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i432 = (i431 ^ 69) + ((i431 & 69) << 1);
                            Object[] objArr72 = new Object[1];
                            c((char) ((i430 ^ 27790) + ((i430 & 27790) << 1)), i429, i432, objArr72);
                            Object[] objArr73 = {(String) objArr72[0]};
                            Object f17 = rV4669.f(-1567326429);
                            if (f17 == null) {
                                int i433 = 6047 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                char c19 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int i434 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51;
                                byte b19 = n[8];
                                Object[] objArr74 = new Object[1];
                                d((byte) 31, b19, b19, objArr74);
                                f17 = rV4669.g(i433, c19, i434, 724607559, (String) objArr74[0], new Class[]{String.class});
                            }
                            long longValue11 = ((Long) ((Method) f17).invoke(null, objArr73)).longValue();
                            long e12 = com.fingerprintjs.android.fpjs_pro.g.e(381L, (longValue11 | 399129683) ^ (-1), (((((longValue11 ^ (-1)) | 399129683) ^ (-1)) | ((j36 | longValue11) ^ (-1)) | (((-399129684) | longValue11) ^ (-1))) * 381) + ((-381) * (longValue11 | j35 | 399129683)) + (382 * longValue11) + 151669279920L, 901883923L);
                            int i435 = ((int) (e12 >> 32)) & ((((~(780062741 | i3)) | 69730304 | (~((-2077678144) | i24))) * 904) + (((~(2147408447 | i3)) | (~((-710332438) | i24))) * 904) + (((~(2077678143 | i3)) | (~((-780062742) | i24))) * (-1808)) + 918974810);
                            int i436 = ((int) e12) & ((((~((-538984489) | i24)) | (-1979446783)) * 241) + ((((~((-540602431) | i24)) | 1617942) * (-241)) - 741997542));
                            if (((i436 & i435) | (i435 ^ i436)) == 0) {
                                Object[] objArr75 = {new int[]{i3}, null, new int[]{i3}, r3, null};
                                int a14 = k84.a((~((-864628806) | i24)) | (~(864628805 | i3)) | (~(i3 | (-669642032))), 831, ((~(938081647 | i3)) * (-1662)) + (((~(669642031 | i24)) | (~((-73452843) | i3))) * (-831)) + 821208138, i8);
                                int i437 = a14 ^ (a14 << 13);
                                int i438 = i437 >>> 17;
                                int i439 = ((~i437) & i438) | ((~i438) & i437);
                                int i440 = i439 << 5;
                                int[] iArr10 = {((~i439) & i440) | ((~i440) & i439)};
                                return objArr75;
                            }
                            Object[] objArr76 = {new int[]{(~(i3 & 90)) & (i3 | 90)}, null, new int[]{i3}, new int[1], null};
                            int myPid3 = Process.myPid();
                            int i441 = ~myPid3;
                            int i442 = (((~(myPid3 | (-286204134))) | (~(489632253 | i441)) | (-498073600)) * 140) + (((~((-294645480) | i441)) | 286204133) * (-280)) + ((myPid3 | (-294645480)) * 140) + 920381233;
                            int i443 = -(-(i442 * 246));
                            int i444 = ((-3904) & i443) + (i443 | (-3904));
                            int i445 = ~i442;
                            int i446 = ~((i445 ^ i24) | (i445 & i24));
                            int i447 = ~((i445 ^ 16) | (i445 & 16));
                            int i448 = (i444 - (~(-(-(((i446 & i447) | (i446 ^ i447)) * (-245)))))) - 1;
                            int i449 = ~((i445 & i3) | (i445 ^ i3));
                            int i450 = i449 * (-245);
                            int i451 = ((i448 | i450) << 1) - (i450 ^ i448);
                            int i452 = ((i449 & 16) | (i449 ^ 16)) * 245;
                            int i453 = -(-((i451 & i452) + (i452 | i451)));
                            int i454 = (i8 ^ i453) + ((i453 & i8) << 1);
                            int i455 = (i454 << 13) ^ i454;
                            int i456 = i455 >>> 17;
                            int i457 = (i455 | i456) & (~(i455 & i456));
                            ((int[]) objArr76[3])[0] = i457 ^ (i457 << 5);
                            return objArr76;
                        } catch (Throwable th9) {
                            Throwable cause7 = th9.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th9;
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            f2 = rV4669.f(-1469271033);
                            if (f2 == null) {
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 4685;
                                char indexOf9 = (char) (i15 - TextUtils.indexOf("", "", 0, 0));
                                int windowTouchSlop = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte[] bArr = n;
                                byte b20 = bArr[8];
                                byte b21 = bArr[5];
                                Object[] objArr77 = new Object[1];
                                d(b20, b21, (byte) (b21 + 3), objArr77);
                                f2 = rV4669.g(modifierMetaStateMask, indexOf9, windowTouchSlop, 566782307, (String) objArr77[0], null);
                            }
                            sb2.append(((Field) f2).get(newInstance).toString());
                            f3 = rV4669.f(-1469271033);
                            if (f3 == null) {
                                int size = View.MeasureSpec.getSize(0) + 4684;
                                char c20 = (char) (57230 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int indexOf10 = 51 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                byte[] bArr2 = n;
                                byte b22 = bArr2[8];
                                byte b23 = bArr2[5];
                                Object[] objArr78 = new Object[1];
                                d(b22, b23, (byte) (b23 + 3), objArr78);
                                f3 = rV4669.g(size, c20, indexOf10, 566782307, (String) objArr78[0], null);
                            }
                            sb2.append(((Field) f3).get(newInstance2).toString());
                            String obj3 = sb2.toString();
                            try {
                                int i458 = -View.MeasureSpec.getSize(0);
                                int i459 = ((i458 | 1) << 1) - (i458 ^ 1);
                                int i460 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr79 = new Object[1];
                                c((char) ((i460 & 1) + (i460 | 1)), i459, View.MeasureSpec.makeMeasureSpec(0, 0) + 131, objArr79);
                                String[] split2 = obj3.split((String) objArr79[0]);
                                length2 = split2.length;
                                i16 = 0;
                                while (i16 < length2) {
                                    String str17 = split2[i16];
                                    int i461 = 18 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i462 = -View.resolveSize(0, 0);
                                    int i463 = (i462 ^ 178) + ((i462 & 178) << 1);
                                    Object[] objArr80 = new Object[1];
                                    c(maximumDrawingCacheSize, i461, i463, objArr80);
                                    if (!str17.startsWith((String) objArr80[0])) {
                                        int i464 = -(-Color.alpha(0));
                                        int i465 = ((i464 | 36161) << 1) - (i464 ^ 36161);
                                        Object[] objArr81 = new Object[1];
                                        b("柟\uea8f絎쀇勊ꖍ⡌뭒හ邉\ue348癊\uf8c2䮌\ude45ℒ돐ڗ襙᱒", i465, objArr81);
                                        if (!str17.startsWith((String) objArr81[0])) {
                                            int i466 = -TextUtils.indexOf((CharSequence) "", '0');
                                            int i467 = ((i466 | 7) << 1) - (i466 ^ 7);
                                            char green2 = (char) Color.green(0);
                                            int threadPriority3 = Process.getThreadPriority(0);
                                            int i468 = (((threadPriority3 | 20) << 1) - (threadPriority3 ^ 20)) >> 6;
                                            int i469 = ((i468 | 197) << 1) - (i468 ^ 197);
                                            Object[] objArr82 = new Object[1];
                                            c(green2, i467, i469, objArr82);
                                            if (str17.startsWith((String) objArr82[0])) {
                                                int i470 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int i471 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                int mode2 = View.MeasureSpec.getMode(0);
                                                strArr2 = split2;
                                                int i472 = ~((i24 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i24 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                int i473 = (((i472 & mode2) | (mode2 ^ i472)) * (-1042)) + ((mode2 * 522) - 106600);
                                                int i474 = (i3 | MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) * 521;
                                                int i475 = (i473 & i474) + (i473 | i474);
                                                int i476 = ~mode2;
                                                i17 = length2;
                                                int i477 = (~((i476 & i3) | (i476 ^ i3))) | (~((i476 & (-206)) | (i476 ^ (-206))));
                                                int i478 = (i24 ^ mode2) | (mode2 & i24);
                                                int i479 = ~((i478 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i478 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                int i480 = ((i477 & i479) | (i477 ^ i479)) * 521;
                                                int i481 = ((i475 | i480) << 1) - (i480 ^ i475);
                                                Object[] objArr83 = new Object[1];
                                                c((char) ((i471 & 33112) + (i471 | 33112)), i470, i481, objArr83);
                                                String[] split3 = str17.split((String) objArr83[0]);
                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str2)) {
                                                    String str18 = (String) com.fingerprintjs.android.fpjs_pro.g.l(str5, invoke2, str6);
                                                    ((int[]) objArr2[2])[0] = i3;
                                                    ((int[]) objArr2[0])[0] = i3 ^ 20;
                                                    objArr2 = new Object[]{new int[1], null, new int[1], new int[1], str18};
                                                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                    int i482 = -(-k84.a((~(elapsedRealtime | (-38000282))) | (~(232987055 | elapsedRealtime)), -1324, (((~elapsedRealtime) | 228591910) * 1324) - 37238073, -1775753258));
                                                    int i483 = (i5 & i482) + (i5 | i482);
                                                    int i484 = (i483 << 13) ^ i483;
                                                    int i485 = i484 >>> 17;
                                                    int i486 = (i484 | i485) & (~(i484 & i485));
                                                    int i487 = i486 << 5;
                                                    ((int[]) objArr2[3])[0] = (i486 | i487) & (~(i486 & i487));
                                                    c5 = 0;
                                                    if (((int[]) objArr2[c5])[c5] == i3) {
                                                    }
                                                }
                                                int i488 = i16 + 16;
                                                i16 = (i488 ^ (-15)) + ((i488 & (-15)) << 1);
                                                split2 = strArr2;
                                                length2 = i17;
                                            }
                                        }
                                    }
                                    strArr2 = split2;
                                    i17 = length2;
                                    int i4882 = i16 + 16;
                                    i16 = (i4882 ^ (-15)) + ((i4882 & (-15)) << 1);
                                    split2 = strArr2;
                                    length2 = i17;
                                }
                            } catch (IOException unused6) {
                            }
                            int i2652 = i13 + 79;
                            i11 = (i2652 & (-78)) + (i2652 | (-78));
                            split = strArr;
                            length = i12;
                            f4 = 0.0f;
                        } catch (Exception unused7) {
                            int i2612 = 26 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
                            char c142 = (char) (13378 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                            int i2622 = -(-TextUtils.indexOf("", ""));
                            int i2632 = ((i2622 | 151) << 1) - (i2622 ^ 151);
                            Object[] objArr472 = new Object[1];
                            c(c142, i2612, i2632, objArr472);
                            throw new IOException((String) objArr472[0]);
                            break;
                            break;
                        }
                        try {
                            Class<?> cls14 = Class.forName(str);
                            int i489 = -ExpandableListView.getPackedPositionChild(0L);
                            int i490 = i489 * 367;
                            int i491 = (i490 ^ 1101) + ((i490 & 1101) << 1);
                            int i492 = -(-(((i489 ^ 3) | (i489 & 3)) * (-366)));
                            int i493 = (i491 & i492) + (i492 | i491);
                            int i494 = ~(((-4) & i3) | ((-4) ^ i3));
                            int i495 = ((i494 & i489) | (i489 ^ i494)) * (-366);
                            int i496 = (i493 ^ i495) + ((i495 & i493) << 1);
                            int i497 = ~i489;
                            int i498 = ~((i497 & 3) | (i497 ^ 3));
                            int i499 = (i489 & (-4)) | ((-4) ^ i489);
                            int i500 = ~((i499 & i3) | (i499 ^ i3));
                            int i501 = -(-(((i500 & i498) | (i498 ^ i500)) * 366));
                            int i502 = ((i496 | i501) << 1) - (i501 ^ i496);
                            float f18 = f4;
                            char c21 = (char) (PointF.length(f18, f18) > f18 ? 1 : (PointF.length(f18, f18) == f18 ? 0 : -1));
                            int i503 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i504 = ((i503 | 148) << 1) - (i503 ^ 148);
                            Object[] objArr84 = new Object[1];
                            c(c21, i502, i504, objArr84);
                            String str19 = (String) objArr84[0];
                            Class cls15 = Long.TYPE;
                            cls14.getMethod(str19, cls15).invoke(newInstance, 100L);
                            try {
                                Class<?> cls16 = Class.forName(str);
                                int longPressTimeout2 = 4 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                char argb = (char) Color.argb(0, 0, 0, 0);
                                char mirror = AndroidCharacter.getMirror('0');
                                int i505 = (mirror ^ 'c') + ((mirror & 'c') << 1);
                                Object[] objArr85 = new Object[1];
                                c(argb, longPressTimeout2, i505, objArr85);
                                cls16.getMethod((String) objArr85[0], cls15).invoke(newInstance2, 10L);
                                try {
                                    try {
                                        process.destroy();
                                    } catch (Throwable th10) {
                                        th = th10;
                                        throw th;
                                    }
                                } catch (Exception unused8) {
                                }
                                StringBuilder sb22 = new StringBuilder();
                                f2 = rV4669.f(-1469271033);
                                if (f2 == null) {
                                }
                                sb22.append(((Field) f2).get(newInstance).toString());
                                f3 = rV4669.f(-1469271033);
                                if (f3 == null) {
                                }
                                sb22.append(((Field) f3).get(newInstance2).toString());
                                String obj32 = sb22.toString();
                                int i4582 = -View.MeasureSpec.getSize(0);
                                int i4592 = ((i4582 | 1) << 1) - (i4582 ^ 1);
                                int i4602 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr792 = new Object[1];
                                c((char) ((i4602 & 1) + (i4602 | 1)), i4592, View.MeasureSpec.makeMeasureSpec(0, 0) + 131, objArr792);
                                String[] split22 = obj32.split((String) objArr792[0]);
                                length2 = split22.length;
                                i16 = 0;
                                while (i16 < length2) {
                                }
                                int i26522 = i13 + 79;
                                i11 = (i26522 & (-78)) + (i26522 | (-78));
                                split = strArr;
                                length = i12;
                                f4 = 0.0f;
                            } catch (Throwable th11) {
                                Throwable cause8 = th11.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th11;
                            }
                        } catch (Throwable th12) {
                            Throwable cause9 = th12.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th12;
                        }
                    } catch (Throwable th13) {
                        Throwable cause10 = th13.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th13;
                    }
                }

                public static void d(byte b2, int i3, short s, Object[] objArr2) {
                    int i4 = b2 + 68;
                    int i5 = (i3 * 3) + 4;
                    byte[] bArr = new byte[s + 1];
                    int i6 = -1;
                    byte[] bArr2 = n;
                    if (bArr2 == null) {
                        i5++;
                        i4 = s + i5;
                    }
                    while (true) {
                        i6++;
                        bArr[i6] = (byte) i4;
                        if (i6 == s) {
                            objArr2[0] = new String(bArr, 0);
                            return;
                        } else {
                            byte b3 = bArr2[i5];
                            i5++;
                            i4 += b3;
                        }
                    }
                }

                public static void f() {
                    n = new byte[]{40, MessagePack.Code.MAP32, 36, -66, 12, 1, 9, -12, 0, -1, -6};
                }

                public static void g() {
                    q = new byte[]{84, -105, -74, -16};
                    r = 4;
                }

                public final ContentResolver e() {
                    int i3 = m;
                    l = ((i3 & 117) + (i3 | 117)) % 128;
                    ContentResolver contentResolver = context.getContentResolver();
                    contentResolver.getClass();
                    int i4 = l;
                    int i5 = (i4 & 37) + (i4 | 37);
                    m = i5 % 128;
                    if (i5 % 2 != 0) {
                        return contentResolver;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ ContentResolver invoke() {
                    int i3 = m;
                    int i4 = ((i3 | 55) << 1) - (i3 ^ 55);
                    l = i4 % 128;
                    int i5 = i4 % 2;
                    ContentResolver e = e();
                    if (i5 != 0) {
                        int i6 = 71 / 0;
                    }
                    return e;
                }
            };
            try {
                Object[] objArr2 = new Object[6];
                objArr2[c2] = null;
                objArr2[c3] = 7;
                objArr2[c4] = function0;
                objArr2[2] = bool;
                objArr2[1] = bool;
                objArr2[0] = 0L;
                Object f2 = rV4669.f(i);
                if (f2 == null) {
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1526;
                    char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int argb = Color.argb(0, 0, 0, 0) + 51;
                    Class cls3 = Long.TYPE;
                    Class cls4 = Boolean.TYPE;
                    f2 = rV4669.g(threadPriority, combineMeasuredStates, argb, 1678066931, "D8871", new Class[]{cls3, cls4, cls4, Function0.class, Integer.TYPE, Object.class});
                }
                Object invoke2 = ((Method) f2).invoke(null, objArr2);
                if (invoke2 instanceof r5g) {
                    invoke2 = null;
                }
                m4 m4Var = new m4(setontouchlistener, new tM9319B53((ContentResolver) invoke2), (d3) a(new Object[0], f1.b(), f1.b(), 1158060400, f1.b(), -1158060399, f1.b()));
                int i3 = b;
                int i4 = (i3 & 63) + (i3 | 63);
                c = i4 % 128;
                if (i4 % 2 != 0) {
                    return m4Var;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
