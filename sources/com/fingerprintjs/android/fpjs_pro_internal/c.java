package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.hdi;
import defpackage.k84;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c {
    public static final char[] c;
    public static int d;
    public static int e;
    public static final byte[] f = null;
    public static int g;
    public static int h;
    public static final byte[] i = null;
    public final ActivityManager a;
    public final StatFs b;

    static {
        e();
        g = 0;
        h = 1;
        d();
        d = 0;
        e = 1;
        c = new char[]{10340, 10478, 10451, 10459, 10469, 10461, 10462, 10469, 10456, 10451, 10451, 10472, 10479, 10462, 10459, 10458, 10451, 10462, 10470, 10315, 10442, 10555, 10547, 10544, 10559, 10552, 10547, 10538, 10546, 10553, 10544, 10544, 10547, 10556, 10440, 10444, 10550, 10249, 10320, 10326, 10324, 10319, 10315, 10321, 10358, 10345, 10318, 10351, 10246, 10339, 10332, 10324, 10313, 10249, 10320, 10313, 10312, 10327, 10354, 10352, 10321, 10320, 10333, 10329, 10322, 10312, 10346, 10352, 10325, 10320, 10328, 10335, 10354, 10358, 10323, 10322, 10315, 10320, 10323, 10358, 10346, 10317, 10317, 10346, 10347, 10320, 10335, 10329, 10322, 10312, 10322, 10322, 10314, 10252, 10325, 10324, 10249, 10335, 10323, 10332, 10330, 10332, 10322, 10329, 10329, 10335, 10329, 10322, 10312, 10326, 10353, 10358, 10323, 10322, 10315, 10320, 10323, 10358, 10346, 10317, 10317, 10346, 10354, 10322, 10315, 10314, 10356, 10275, 10255, 10320, 10321, 10352, 10346, 10312, 10322, 10329, 10333, 10320, 10321, 10328, 10332, 10325, 10357, 10346, 10317, 10317, 10346, 10358, 10323, 10320, 10315, 10322, 10323, 10358, 10354, 10335, 10328, 10320, 10325, 10352, 10346, 10312, 10322, 10329};
    }

    public c(ActivityManager activityManager, StatFs statFs) {
        this.a = activityManager;
        this.b = statFs;
    }

    public static String a(short s) {
        int i2 = s + 99;
        byte[] bArr = new byte[1];
        if (i == null) {
            i2 = s + 102;
        }
        bArr[0] = (byte) i2;
        return new String(bArr, 0);
    }

    public static void b(String str, boolean z, int[] iArr, Object[] objArr) {
        long j;
        int i2 = g + 45;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        g = (h + 37) % 128;
        byte[] bArr = bytes;
        cr crVar = new cr();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        Class cls = Integer.TYPE;
        char[] cArr = c;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            j = 0;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object f2 = rV4669.f(1048659596);
                    if (f2 == null) {
                        f2 = rV4669.g(View.getDefaultSize(0, 0) + 5942, (char) (13918 - Drawable.resolveOpacity(0, 0)), 53 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1222272024, a((short) 0), new Class[]{cls});
                    }
                    cArr2[i8] = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            crVar.component9 = 0;
            char c2 = 0;
            while (true) {
                int i9 = crVar.component9;
                if (i9 >= i5) {
                    break;
                }
                if (bArr[i9] == 1) {
                    g = (h + 71) % 128;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(c2)};
                    Object f3 = rV4669.f(787141208);
                    if (f3 == null) {
                        f3 = rV4669.g(4632 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.getTrimmedLength("") + 39355), 51 - (ViewConfiguration.getLongPressTimeout() >> 16), -1488056516, a((short) 1), new Class[]{cls, cls});
                    }
                    cArr4[i9] = ((Character) ((Method) f3).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(c2)};
                    Object f4 = rV4669.f(1357192195);
                    if (f4 == null) {
                        f4 = rV4669.g(TextUtils.getCapsMode("", 0, 0) + 6511, (char) Drawable.resolveOpacity(0, 0), 52 - (Process.myTid() >> 22), -650002073, a((short) 2), new Class[]{cls, cls});
                    }
                    cArr4[i9] = ((Character) ((Method) f4).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[crVar.component9];
                Object[] objArr5 = {crVar, crVar};
                Object f5 = rV4669.f(-440389350);
                if (f5 == null) {
                    f5 = rV4669.g(959 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), Color.blue(0) + 60, 1818553470, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) f5).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i10 = h + 17;
            g = i10 % 128;
            if (i10 % 2 != 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                System.arraycopy(cArr5, 1, cArr3, i5 >> i7, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i5 << i7);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i11 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i11, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i11);
            }
        }
        if (z) {
            char[] cArr7 = new char[i5];
            crVar.component9 = 0;
            while (true) {
                int i12 = crVar.component9;
                if (i12 >= i5) {
                    break;
                }
                int i13 = g + 61;
                h = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr7[i12] = cArr3[i5 + i12];
                } else {
                    cArr7[i12] = cArr3[(i5 - i12) - 1];
                    i12++;
                }
                crVar.component9 = i12;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            crVar.component9 = 0;
            h = (g + 119) % 128;
            while (true) {
                int i14 = crVar.component9;
                if (i14 >= i5) {
                    break;
                }
                g = (h + 1) % 128;
                cArr3[i14] = (char) (cArr3[i14] - iArr[2]);
                crVar.component9 = i14 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0104, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.c.d = (com.fingerprintjs.android.fpjs_pro_internal.c.e + 99) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010d, code lost:
    
        r2 = new java.lang.Object[]{r12, null, r13, new int[1]};
        r13 = new int[]{r8};
        r12 = new int[]{r8 ^ 1};
        r0 = defpackage.k84.a((~((~android.os.Process.myUid()) | (-1227683122))) | 1073799456, 933, (((~((-800005212) | r0)) | (-1227683122)) * (-933)) - 1858810466, -208065772);
        r12 = (r0 ^ 16) + ((r0 & 16) << 1);
        r0 = com.fingerprintjs.android.fpjs_pro_internal.d6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014d, code lost:
    
        r13 = r12 * (-665);
        r14 = -(-(r9 * 334));
        r15 = (r13 & r14) + (r13 | r14);
        r12 = ~r12;
        r13 = r12 * (-333);
        r14 = ((r15 | r13) << 1) - (r13 ^ r15);
        r13 = ~r0;
        r15 = ~((r12 ^ r13) | (r12 & r13));
        r34 = 2;
        r5 = ~(r9 | r0);
        r5 = ((r15 ^ r5) | (r5 & r15)) * 333;
        r15 = (r14 ^ r5) + ((r5 & r14) << 1);
        r0 = ~(r0 | r12);
        r5 = ~((r13 ^ r9) | (r13 & r9));
        r0 = (((r0 & r5) | (r0 ^ r5)) * 333) + r15;
        r5 = r0 << 13;
        r0 = (r0 | r5) & (~(r0 & r5));
        r5 = r0 >>> 17;
        r0 = (r0 | r5) & (~(r0 & r5));
        r5 = r0 << 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x019c, code lost:
    
        ((int[]) r2[3])[0] = (r0 | r5) & (~(r0 & r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01a2, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.c.d;
        com.fingerprintjs.android.fpjs_pro_internal.c.e = ((r0 ^ 47) + ((r0 & 47) << 1)) % 128;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0335 A[Catch: all -> 0x07c1, TryCatch #2 {all -> 0x07c1, blocks: (B:27:0x02e8, B:29:0x02ee, B:32:0x0337, B:33:0x0318, B:35:0x0322, B:36:0x0341, B:102:0x0335), top: B:26:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0322 A[Catch: all -> 0x07c1, TryCatch #2 {all -> 0x07c1, blocks: (B:27:0x02e8, B:29:0x02ee, B:32:0x0337, B:33:0x0318, B:35:0x0322, B:36:0x0341, B:102:0x0335), top: B:26:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05c7 A[Catch: Exception -> 0x05c5, TRY_LEAVE, TryCatch #6 {Exception -> 0x05c5, blocks: (B:53:0x05a9, B:78:0x05c7, B:81:0x05e6, B:84:0x05ee, B:85:0x05f4, B:80:0x05d1), top: B:52:0x05a9, inners: #7 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0335 -> B:30:0x0337). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        Object[] objArr2;
        int i10;
        Object[] objArr3;
        int i11;
        int i12;
        String str;
        boolean z;
        boolean z2;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        File file2;
        File file3;
        int i13;
        int i14;
        int i15;
        int i16 = ~i7;
        int i17 = ~i5;
        int i18 = ~i4;
        int i19 = (~(i17 | i18)) | i16;
        int i20 = (~(i4 | i5)) | (~(i16 | i18));
        int i21 = ~(i18 | i7 | i5);
        int i22 = (1456996352 * i6) + (1190920192 * i2) + ((-1139933184) * i3) + ((-352114683) * i21) + (i20 * (-352114683)) + (352114683 * i19) + ((-1492047866) * i5) + (((-787818500) * i7) - 443744256);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i6, 9035316, ((-194346734) * i2) + i7 + i5 + i3);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 168099840, (107475828 * i6) + ((-1060063438) * i2) + (1174986385 * i3) + (i21 * 213) + (i20 * 213) + (i19 * (-213)) + (i5 * 1174986598) + (i7 * 1174986172) + 1294669563, 40566784, ((-1774911488) * a) + i22) != 1) {
            int intValue = ((Number) objArr[0]).intValue();
            int intValue2 = ((Number) objArr[1]).intValue();
            try {
                Object[] objArr4 = new Object[1];
                b("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true, new int[]{0, 19, 122, 3}, objArr4);
                String str2 = (String) objArr4[0];
                i9 = 99;
                i8 = 3;
                try {
                    Object[] objArr5 = new Object[1];
                    b("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{19, 18, 157, 8}, objArr5);
                    String[] strArr = {str2, (String) objArr5[0]};
                    int i23 = 0;
                    while (true) {
                        try {
                            if (i23 < 2) {
                                int i24 = e;
                                d = ((i24 ^ 69) + ((i24 & 69) << 1)) % 128;
                                String str3 = strArr[i23];
                                Object[] objArr6 = new Object[1];
                                b("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", false, new int[]{37, 16, 4, 0}, objArr6);
                                Class<?> cls = Class.forName((String) objArr6[0]);
                                if (((Boolean) cls.getMethod(str3, null).invoke(cls, null)).booleanValue()) {
                                    break;
                                }
                                i3 = 2;
                                i23++;
                            } else {
                                i3 = 2;
                                objArr2 = new Object[]{r0, null, r5, new int[1]};
                                int[] iArr = {intValue};
                                int[] iArr2 = {intValue};
                                int i25 = (int) Runtime.getRuntime().totalMemory();
                                int a2 = k84.a(i25 | (-638222433), 465, ((1366392603 | (~((-661295730) | i25))) * 930) + (((~(i25 | 1366392603)) | (-661295730)) * (-465)) + 33051189, intValue2);
                                int i26 = a2 ^ (a2 << 13);
                                int i27 = i26 >>> 17;
                                int i28 = (i26 | i27) & (~(i26 & i27));
                                int i29 = i28 << 5;
                                ((int[]) objArr2[3])[0] = ((~i28) & i29) | ((~i29) & i28);
                                break;
                            }
                        } catch (Exception unused) {
                            int i30 = (~(intValue & 2)) & (intValue | 2);
                            objArr2 = new Object[4];
                            int[] iArr3 = new int[1];
                            objArr2[0] = iArr3;
                            int[] iArr4 = new int[1];
                            objArr2[i3] = iArr4;
                            objArr2[i8] = new int[1];
                            iArr4[0] = intValue;
                            iArr3[0] = i30;
                            objArr2[1] = null;
                            int i31 = (((~(((int) SystemClock.elapsedRealtime()) | (-1087496257))) | 537528320) * 366) + ((((~((-1288828135) | r0)) | 738860198) * (-366)) - 1594255648);
                            int i32 = (i31 & 16) + (i31 | 16);
                            int i33 = (intValue2 * 868) + (i32 * 868);
                            int i34 = ~i32;
                            int i35 = ~intValue;
                            int i36 = ~((i34 ^ i35) | (i34 & i35));
                            int i37 = ~intValue2;
                            int i38 = ~((i37 ^ i35) | (i37 & i35));
                            int i39 = -(-(((i36 ^ i38) | (i38 & i36)) * (-867)));
                            int i40 = (i33 ^ i39) + ((i39 & i33) << 1);
                            int i41 = (i34 ^ i37) | (i34 & i37);
                            int i42 = ~i41;
                            int i43 = ~((i34 ^ intValue) | (i34 & intValue));
                            int i44 = (i42 ^ i43) | (i43 & i42);
                            int i45 = ~((i37 ^ intValue) | (i37 & intValue));
                            int i46 = -(-(((i44 ^ i45) | (i44 & i45)) * (-1734)));
                            int i47 = (i40 & i46) + (i46 | i40);
                            int i48 = ~((i41 ^ i35) | (i41 & i35));
                            int i49 = ~((i34 & intValue2) | (i34 ^ intValue2) | intValue);
                            int i50 = (i49 & i48) | (i48 ^ i49);
                            int i51 = ~((i37 ^ i32) | (i32 & i37) | intValue);
                            int i52 = ((i50 & i51) | (i50 ^ i51)) * 867;
                            int i53 = (i47 ^ i52) + ((i52 & i47) << 1);
                            int i54 = i53 << 13;
                            int i55 = (i54 | i53) & (~(i53 & i54));
                            int i56 = i55 >>> 17;
                            int i57 = (i55 | i56) & (~(i55 & i56));
                            int i58 = i57 << 5;
                            ((int[]) objArr2[i8])[0] = ((~i57) & i58) | ((~i58) & i57);
                            if (intValue != ((int[]) objArr2[0])[0]) {
                            }
                        }
                    }
                } catch (Exception unused2) {
                    i3 = 2;
                }
            } catch (Exception unused3) {
                i8 = 3;
                i3 = 2;
                i9 = 99;
            }
            if (intValue != ((int[]) objArr2[0])[0]) {
                try {
                    Object f2 = rV4669.f(1793141623);
                    if (f2 == null) {
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6357;
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int myTid = (Process.myTid() >> 22) + 51;
                        byte[] bArr = f;
                        byte[] bArr2 = new byte[4];
                        if (bArr == null) {
                            byte b = 4;
                            i13 = 4;
                            i14 = -1;
                            i15 = i9;
                            i15 = i15 + (-b) + 6;
                            i13++;
                            i8 = 3;
                            i14++;
                            i10 = -1;
                            bArr2[i14] = (byte) i15;
                            if (i14 == i8) {
                                f2 = rV4669.g(scrollBarFadeDuration, scrollDefaultDelay, myTid, -481954285, new String(bArr2, 0), new Class[0]);
                            } else {
                                b = bArr[i13];
                                i15 = i15 + (-b) + 6;
                                i13++;
                                i8 = 3;
                                i14++;
                                i10 = -1;
                                bArr2[i14] = (byte) i15;
                                if (i14 == i8) {
                                }
                            }
                        } else {
                            i13 = 4;
                            i14 = -1;
                            i15 = i9;
                            i14++;
                            i10 = -1;
                            bArr2[i14] = (byte) i15;
                            if (i14 == i8) {
                            }
                        }
                    } else {
                        i10 = -1;
                    }
                    long longValue = ((Long) ((Method) f2).invoke(null, null)).longValue();
                    long j = longValue ^ (-1);
                    long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j2 = (1504 * ((((-469151630) | j) ^ (-1)) | (((-469151630) | elapsedRealtime) ^ (-1)))) + (((-751) * longValue) - 352332873379L);
                    long j3 = (-469151630) | longValue;
                    long e2 = com.fingerprintjs.android.fpjs_pro.g.e(752L, (j3 ^ (-1)) | ((j | 469151629) ^ (-1)), ((-1504) * ((elapsedRealtime | j3) ^ (-1))) + j2, -717163190L);
                    int myUid = Process.myUid();
                    int i59 = ~myUid;
                    int i60 = ((int) (e2 >> 32)) & ((((~(myUid | (-1720132333))) | 604053636) * 464) + ((1741662188 | myUid) * (-464)) + (((~(i59 | (-1720132333))) | (~(1137608552 | i59)) | 604053636) * 464) + 1729132138);
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i61 = ((int) e2) & (((~(maxMemory | (-813830795))) * 283) + (((~((-2022840203) | maxMemory)) | 1209009408) * (-283)) + 1410019669);
                    if (((i60 & i61) | (i60 ^ i61)) == 1) {
                        int i62 = e;
                        d = (((i62 | 15) << 1) - (i62 ^ 15)) % 128;
                        int i63 = (intValue & (-11)) | ((~intValue) & 10);
                        objArr3 = new Object[4];
                        int[] iArr5 = new int[1];
                        objArr3[0] = iArr5;
                        int[] iArr6 = new int[1];
                        objArr3[i3] = iArr6;
                        objArr3[3] = new int[1];
                        iArr6[0] = intValue;
                        iArr5[0] = i63;
                        objArr3[1] = null;
                        int a3 = ((hdi.a() | (-791585)) * 591) + ((((~((~r0) | (-791585))) | (-2026896749)) * (-591)) - 1399555304);
                        int a4 = d6.a();
                        int i64 = a3 * (-55);
                        int i65 = ((~((a3 ^ 16) | (a3 & 16))) * (-56)) + (((((-880) ^ i64) + ((i64 & (-880)) << 1)) - (~(((~(a4 | 16)) | a3) * 56))) - 1);
                        int i66 = ~a4;
                        int i67 = ~((a3 & i66) | (i66 ^ a3));
                        int i68 = -(-((i65 - (~(-(-(((i67 & 16) | (i67 ^ 16)) * 56))))) - 1));
                        int i69 = (intValue2 ^ i68) + ((i68 & intValue2) << 1);
                        int i70 = (i69 << 13) ^ i69;
                        int i71 = i70 >>> 17;
                        int i72 = (i70 | i71) & (~(i70 & i71));
                        int i73 = i72 << 5;
                        ((int[]) objArr3[3])[0] = (i72 | i73) & (~(i72 & i73));
                        d = (e + 59) % 128;
                    } else {
                        Object[] objArr7 = new Object[4];
                        int[] iArr7 = new int[1];
                        objArr7[0] = iArr7;
                        int[] iArr8 = new int[1];
                        objArr7[i3] = iArr8;
                        objArr7[3] = new int[1];
                        iArr8[0] = intValue;
                        iArr7[0] = intValue;
                        objArr7[1] = null;
                        int i74 = (int) Runtime.getRuntime().totalMemory();
                        int i75 = ~i74;
                        int i76 = (((~(i74 | (-94333533))) | 18620944 | (~(i75 | 2009067388))) * 521) + ((1933354800 | i74) * 521) + (((~(i75 | 1933354800)) | 94333532) * (-1042)) + 1675314712;
                        int i77 = -(-(i76 * (-448)));
                        int i78 = ~((i10 ^ i76) | i76);
                        int i79 = ~i76;
                        int i80 = -(-(((~(i79 | intValue)) | i78) * 449));
                        int i81 = (((i77 & i80) + (i77 | i80)) - (~(i78 * (-1347)))) - 1;
                        int i82 = ~intValue;
                        int i83 = ~((i79 & i82) | (i79 ^ i82));
                        int i84 = -(-((i81 - (~(-(-(((i83 & i78) | (i78 ^ i83)) * 449))))) - 1));
                        int i85 = (intValue2 & i84) + (i84 | intValue2);
                        int i86 = i85 << 13;
                        int i87 = (i86 | i85) & (~(i85 & i86));
                        int i88 = i87 >>> 17;
                        int i89 = (i87 | i88) & (~(i87 & i88));
                        int i90 = i89 << 5;
                        ((int[]) objArr7[3])[0] = ((~i89) & i90) | ((~i90) & i89);
                        objArr3 = objArr7;
                    }
                    if (intValue != ((int[]) objArr3[0])[0]) {
                        e = (d + 29) % 128;
                        return objArr3;
                    }
                    try {
                        Object[] objArr8 = new Object[1];
                        b("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000", true, new int[]{53, 40, 0, 31}, objArr8);
                        file3 = new File((String) objArr8[0]);
                    } catch (Exception unused4) {
                    }
                    if (!file3.canRead()) {
                        int i91 = d;
                        i11 = i91 ^ 15;
                        i12 = i91 & 15;
                        e = (i11 + (i12 << 1)) % 128;
                        str = null;
                        try {
                            Object[] objArr9 = new Object[1];
                            b("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{96, 31, 0, 0}, objArr9);
                            file2 = new File((String) objArr9[0]);
                        } catch (Exception unused5) {
                        }
                        if (file2.canRead()) {
                            fileReader = new FileReader(file2);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                String readLine = bufferedReader.readLine();
                                Object[] objArr10 = new Object[1];
                                b("\u0001", false, new int[]{127, 1, 0, 1}, objArr10);
                                z = readLine.equals((String) objArr10[0]);
                                fileReader.close();
                                bufferedReader.close();
                                if (z) {
                                    try {
                                        Object[] objArr11 = new Object[1];
                                        b("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", false, new int[]{128, 36, 0, 14}, objArr11);
                                        file = new File((String) objArr11[0]);
                                    } catch (Exception unused6) {
                                    }
                                    if (!file.canRead()) {
                                        d = (e + 107) % 128;
                                        z2 = false;
                                        if (z2) {
                                            int i92 = (e + 35) % 128;
                                            d = i92;
                                            if (str != null) {
                                                e = (((i92 | 87) << 1) - (i92 ^ 87)) % 128;
                                                Object[] objArr12 = new Object[4];
                                                int[] iArr9 = new int[1];
                                                objArr12[0] = iArr9;
                                                int[] iArr10 = new int[1];
                                                objArr12[i3] = iArr10;
                                                objArr12[3] = new int[1];
                                                iArr10[0] = intValue;
                                                iArr9[0] = intValue ^ 20;
                                                objArr12[1] = str;
                                                int i93 = ~hdi.b(1594892160);
                                                int a5 = k84.a((~((-448287486) | i93)) | 438309517 | (~((-1579400848) | i93)), 184, (((~(i93 | (-1141091331))) | (~((-9977969) | i93))) * (-184)) - 1699777300, 387925832);
                                                int i94 = -(-(a5 * 53));
                                                int i95 = ((-816) & i94) + (i94 | (-816));
                                                int i96 = ~d6.a();
                                                int i97 = (i96 ^ 16) | (i96 & 16);
                                                int i98 = ((~(i97 | a5)) * 52) + i95;
                                                int i99 = ~a5;
                                                int i100 = ~(i99 | i96);
                                                int i101 = ~((i99 & 16) | (i99 ^ 16));
                                                int i102 = (i101 & i100) | (i100 ^ i101);
                                                int i103 = ~i97;
                                                int i104 = -(-(((i103 & i102) | (i102 ^ i103)) * (-52)));
                                                int i105 = ~((i96 & (-17)) | ((-17) ^ i96));
                                                int i106 = ~((a5 & (-17)) | ((-17) ^ a5));
                                                int i107 = (((i106 & i105) | (i105 ^ i106)) * 52) + (i98 ^ i104) + ((i104 & i98) << 1);
                                                int i108 = i107 * 567;
                                                int i109 = -(-(intValue2 * (-565)));
                                                int i110 = (i108 & i109) + (i108 | i109);
                                                int i111 = ~i107;
                                                int i112 = -(-(((~((i111 ^ intValue2) | (i111 & intValue2))) | (~((i111 ^ intValue) | (i111 & intValue)))) * (-566)));
                                                int i113 = ((i110 | i112) << 1) - (i112 ^ i110);
                                                int i114 = ~intValue2;
                                                int i115 = (i113 - (~(-(-((~((i107 & i114) | (i114 ^ i107))) * 566))))) - 1;
                                                int i116 = (i111 ^ i114) | (i111 & i114);
                                                int i117 = ((~((i116 & intValue) | (i116 ^ intValue))) * 566) + i115;
                                                int i118 = i117 << 13;
                                                int i119 = ((~i117) & i118) | ((~i118) & i117);
                                                int i120 = i119 >>> 17;
                                                int i121 = (i119 | i120) & (~(i119 & i120));
                                                int i122 = i121 << 5;
                                                ((int[]) objArr12[3])[0] = (i121 | i122) & (~(i121 & i122));
                                                return objArr12;
                                            }
                                        }
                                    } else {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        try {
                                            String readLine2 = bufferedReader.readLine();
                                            Object[] objArr13 = new Object[1];
                                            b("\u0001", false, new int[]{127, 1, 0, 1}, objArr13);
                                            z2 = readLine2.equals((String) objArr13[0]);
                                            fileReader.close();
                                            bufferedReader.close();
                                            if (z2) {
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                Object[] objArr14 = new Object[4];
                                int[] iArr11 = new int[1];
                                objArr14[0] = iArr11;
                                int[] iArr12 = new int[1];
                                objArr14[i3] = iArr12;
                                objArr14[3] = new int[1];
                                iArr12[0] = intValue;
                                iArr11[0] = intValue;
                                objArr14[1] = null;
                                int i123 = (~Process.myPid()) | 956732925;
                                int i124 = (((~i123) | 956567949) * 495) + (i123 * 495) + 972956632;
                                int i125 = i124 * (-463);
                                int i126 = ~i124;
                                int i127 = ~intValue;
                                int i128 = ~((i126 ^ i127) | (i126 & i127));
                                int i129 = ~i126;
                                int i130 = (i128 & i129) | (i128 ^ i129);
                                int i131 = ~i127;
                                int i132 = (i125 - (~(-(-(((i130 & i131) | (i130 ^ i131)) * 464))))) - 1;
                                int i133 = (intValue ^ (-1)) | intValue;
                                int a6 = k84.a(i129 | i127, 464, (i132 - (~(-(-(((i126 & i133) | (i133 ^ i126)) * (-464)))))) - 1, intValue2);
                                int i134 = a6 << 13;
                                int i135 = (a6 | i134) & (~(a6 & i134));
                                int i136 = i135 ^ (i135 >>> 17);
                                int i137 = i136 << 5;
                                ((int[]) objArr14[3])[0] = (i136 | i137) & (~(i136 & i137));
                                return objArr14;
                            } finally {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        Object[] objArr142 = new Object[4];
                        int[] iArr112 = new int[1];
                        objArr142[0] = iArr112;
                        int[] iArr122 = new int[1];
                        objArr142[i3] = iArr122;
                        objArr142[3] = new int[1];
                        iArr122[0] = intValue;
                        iArr112[0] = intValue;
                        objArr142[1] = null;
                        int i1232 = (~Process.myPid()) | 956732925;
                        int i1242 = (((~i1232) | 956567949) * 495) + (i1232 * 495) + 972956632;
                        int i1252 = i1242 * (-463);
                        int i1262 = ~i1242;
                        int i1272 = ~intValue;
                        int i1282 = ~((i1262 ^ i1272) | (i1262 & i1272));
                        int i1292 = ~i1262;
                        int i1302 = (i1282 & i1292) | (i1282 ^ i1292);
                        int i1312 = ~i1272;
                        int i1322 = (i1252 - (~(-(-(((i1302 & i1312) | (i1302 ^ i1312)) * 464))))) - 1;
                        int i1332 = (intValue ^ (-1)) | intValue;
                        int a62 = k84.a(i1292 | i1272, 464, (i1322 - (~(-(-(((i1262 & i1332) | (i1332 ^ i1262)) * (-464)))))) - 1, intValue2);
                        int i1342 = a62 << 13;
                        int i1352 = (a62 | i1342) & (~(a62 & i1342));
                        int i1362 = i1352 ^ (i1352 >>> 17);
                        int i1372 = i1362 << 5;
                        ((int[]) objArr142[3])[0] = (i1362 | i1372) & (~(i1362 & i1372));
                        return objArr142;
                    }
                    fileReader = new FileReader(file3);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        String readLine3 = bufferedReader.readLine();
                        Object[] objArr15 = new Object[1];
                        b("\u0000\u0001\u0001", false, new int[]{93, 3, 0, 0}, objArr15);
                        if (!readLine3.equals((String) objArr15[0])) {
                            fileReader.close();
                            bufferedReader.close();
                            str = readLine3;
                            Object[] objArr92 = new Object[1];
                            b("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{96, 31, 0, 0}, objArr92);
                            file2 = new File((String) objArr92[0]);
                            if (file2.canRead()) {
                            }
                            z = false;
                            if (z) {
                            }
                            Object[] objArr1422 = new Object[4];
                            int[] iArr1122 = new int[1];
                            objArr1422[0] = iArr1122;
                            int[] iArr1222 = new int[1];
                            objArr1422[i3] = iArr1222;
                            objArr1422[3] = new int[1];
                            iArr1222[0] = intValue;
                            iArr1122[0] = intValue;
                            objArr1422[1] = null;
                            int i12322 = (~Process.myPid()) | 956732925;
                            int i12422 = (((~i12322) | 956567949) * 495) + (i12322 * 495) + 972956632;
                            int i12522 = i12422 * (-463);
                            int i12622 = ~i12422;
                            int i12722 = ~intValue;
                            int i12822 = ~((i12622 ^ i12722) | (i12622 & i12722));
                            int i12922 = ~i12622;
                            int i13022 = (i12822 & i12922) | (i12822 ^ i12922);
                            int i13122 = ~i12722;
                            int i13222 = (i12522 - (~(-(-(((i13022 & i13122) | (i13022 ^ i13122)) * 464))))) - 1;
                            int i13322 = (intValue ^ (-1)) | intValue;
                            int a622 = k84.a(i12922 | i12722, 464, (i13222 - (~(-(-(((i12622 & i13322) | (i13322 ^ i12622)) * (-464)))))) - 1, intValue2);
                            int i13422 = a622 << 13;
                            int i13522 = (a622 | i13422) & (~(a622 & i13422));
                            int i13622 = i13522 ^ (i13522 >>> 17);
                            int i13722 = i13622 << 5;
                            ((int[]) objArr1422[3])[0] = (i13622 | i13722) & (~(i13622 & i13722));
                            return objArr1422;
                        }
                        int i138 = d;
                        e = (((i138 | 45) << 1) - (i138 ^ 45)) % 128;
                        int i139 = d;
                        i11 = i139 ^ 89;
                        i12 = i139 & 89;
                        e = (i11 + (i12 << 1)) % 128;
                        str = null;
                        Object[] objArr922 = new Object[1];
                        b("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{96, 31, 0, 0}, objArr922);
                        file2 = new File((String) objArr922[0]);
                        if (file2.canRead()) {
                        }
                        z = false;
                        if (z) {
                        }
                        Object[] objArr14222 = new Object[4];
                        int[] iArr11222 = new int[1];
                        objArr14222[0] = iArr11222;
                        int[] iArr12222 = new int[1];
                        objArr14222[i3] = iArr12222;
                        objArr14222[3] = new int[1];
                        iArr12222[0] = intValue;
                        iArr11222[0] = intValue;
                        objArr14222[1] = null;
                        int i123222 = (~Process.myPid()) | 956732925;
                        int i124222 = (((~i123222) | 956567949) * 495) + (i123222 * 495) + 972956632;
                        int i125222 = i124222 * (-463);
                        int i126222 = ~i124222;
                        int i127222 = ~intValue;
                        int i128222 = ~((i126222 ^ i127222) | (i126222 & i127222));
                        int i129222 = ~i126222;
                        int i130222 = (i128222 & i129222) | (i128222 ^ i129222);
                        int i131222 = ~i127222;
                        int i132222 = (i125222 - (~(-(-(((i130222 & i131222) | (i130222 ^ i131222)) * 464))))) - 1;
                        int i133222 = (intValue ^ (-1)) | intValue;
                        int a6222 = k84.a(i129222 | i127222, 464, (i132222 - (~(-(-(((i126222 & i133222) | (i133222 ^ i126222)) * (-464)))))) - 1, intValue2);
                        int i134222 = a6222 << 13;
                        int i135222 = (a6222 | i134222) & (~(a6222 & i134222));
                        int i136222 = i135222 ^ (i135222 >>> 17);
                        int i137222 = i136222 << 5;
                        ((int[]) objArr14222[3])[0] = (i136222 | i137222) & (~(i136222 & i137222));
                        return objArr14222;
                    } finally {
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return objArr2;
        }
        c cVar = (c) objArr[0];
        int i140 = e;
        int i141 = (((i140 | 3) << 1) - (i140 ^ 3)) % 128;
        d = i141;
        ActivityManager activityManager = cVar.a;
        int i142 = (i141 ^ 81) + ((i141 & 81) << 1);
        e = i142 % 128;
        if (i142 % 2 != 0) {
            return activityManager;
        }
        throw null;
    }

    public static void d() {
        f = new byte[]{3, MessagePack.Code.BIN8, 87, 80, -6, 5, -3};
    }

    public static void e() {
        i = new byte[]{115, 120, 102, -31};
    }

    public static Object[] vD14832N6715(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        int a = d6.a();
        return (Object[]) c(objArr, d6.a(), d6.a(), a, 2045851499, d6.a(), -2045851499);
    }
}
