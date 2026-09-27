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
import com.fingerprintjs.android.fpjs_pro_internal.component12;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.d55;
import defpackage.hdi;
import defpackage.k84;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class T9586V28869 {
    public static final char[] b;
    public static final long c;
    public static int d;
    public static int e;
    public static final byte[] f = null;
    public static int g;
    public static int h;
    public static final byte[] i = null;
    public final Context a;

    static {
        i();
        g = 0;
        h = 1;
        h();
        d = 0;
        e = 1;
        b = new char[]{14487, 48601, 12818, 46951, 11724, 41519, 10081, 40405, 4667, 38776, 3573, 33293, 1888, 64980, 29187, 63345, 28106, 57871, 26482, 42780, 8798, 44458, 10467, 45650, 15777, 47348, 609, 36260, 2285, 37479, 7570, 39161, 25178, 60820, 26848, 62030, 32141, 29880, 61923, 32277, 64343, 25062, 60948, 27461, 53691, 24086, 56158, 16831, 52737, 19276, 45567, 15924, 47954, 56776, 22720, 55094, 21096, 51352, 18216, 49786, 30937, 63273, 29302, 59587, 26452, 57971, 6342, 38685, 4734, 35008, 1884, 33403, 14505, 46870, 12896, 43190, 9989, 41568, 55548, 22284, 53838, 18597, 50961, 16986, 63653, 30483, 62060, 26811, 59369, 25174, 39072, 6138, 37465, 65514, 31423, 62812, 9668, 41167, 12081, 43640, 12504, 48992, 14944, 32990, 3896, 35376, 4296, 40722, 6761, 57537, 28438, 60011, 28804, 65305, 31351, 49317, 20250, 51820, 20662, 57144, 23150, 8369, 44802, 10837, 45239, 16138, 47703, 9690, 9668, 41164, 12090, 43620, 12436, 48932, 14966, 32981, 3877, 35450, 4303, 40792, 6783, 57546, 28433, 60018, 28876, 65360, 31351, 49317, 20250, 51820, 20666, 57097, 23148, 8432, 44823, 10821, 45242, 16140, 47706, 169, 36620, 2656, 37036, 8185};
        c = 7465215174661546175L;
    }

    public T9586V28869(Context context) {
        this.a = context;
    }

    public static String a(short s) {
        int i2 = s + 115;
        byte[] bArr = new byte[1];
        if (i == null) {
            i2 = -2;
        }
        bArr[0] = (byte) i2;
        return new String(bArr, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:51|52|(4:101|102|103|(9:105|55|56|(11:82|83|85|86|87|88|89|90|(3:63|64|(3:66|67|(2:69|(2:71|72)))(5:73|74|75|76|(0)))|61|62)|58|59|(0)|61|62)(2:106|107))|54|55|56|(0)|58|59|(0)|61|62) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x08d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x082e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v15 */
    /* JADX WARN: Type inference failed for: r41v16 */
    /* JADX WARN: Type inference failed for: r41v18 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object b(Object[] objArr) {
        int i2;
        long j;
        float f2;
        int i3;
        char c2;
        char c3;
        ?? r41;
        int i4;
        Object[] objArr2;
        char c4;
        int[][] iArr;
        String str;
        Object obj;
        boolean z;
        boolean z2;
        File file;
        File file2;
        FileReader fileReader;
        BufferedReader bufferedReader;
        File file3;
        int modifierMetaStateMask;
        char c5;
        char c6;
        int i5 = 0;
        int intValue = ((Number) objArr[0]).intValue();
        int intValue2 = ((Number) objArr[1]).intValue();
        float f3 = 0.0f;
        int i6 = 2;
        try {
            modifierMetaStateMask = 18 - ((byte) KeyEvent.getModifierMetaStateMask());
            int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int b2 = component12.Companion.b();
            c2 = 65519;
            r41 = -17;
            r41 = -17;
            r41 = -17;
            r41 = -17;
            r41 = -17;
            int i8 = i7 * (-751);
            int i9 = (i8 & (-5591946)) + (i8 | (-5591946));
            int i10 = ~i7;
            j = 0;
            int i11 = ~((i10 ^ (-7447)) | (i10 & (-7447)));
            int i12 = ~(i10 | b2);
            int i13 = ((i11 ^ i12) | (i11 & i12)) * 1504;
            int i14 = (i10 & 7446) | (i10 ^ 7446);
            int i15 = (((i9 ^ i13) + ((i9 & i13) << 1)) - (~(-(-((~((i14 ^ b2) | (i14 & b2))) * (-1504)))))) - 1;
            int i16 = ~i14;
            int i17 = ~((-7447) | i7);
            c5 = (char) ((((i16 & i17) | (i16 ^ i17)) * 752) + i15);
        } catch (Exception unused) {
            i2 = 0;
            j = 0;
            f2 = 0.0f;
            i3 = 2;
            c2 = 65519;
        }
        try {
            int threadPriority = Process.getThreadPriority(0);
            int i18 = -(-(threadPriority * (-215)));
            int i19 = (4340 & i18) + (i18 | 4340);
            int i20 = (~(intValue | 20)) * 216;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            int i22 = (~threadPriority) | 20;
            c3 = 3;
            int i23 = ~intValue;
            int i24 = (i22 | i23) * (-216);
            int i25 = (i21 & i24) + (i24 | i21);
            int i26 = ~((i23 ^ 20) | (i23 & 20));
            int i27 = ((((threadPriority & i26) | (threadPriority ^ i26)) * 216) + i25) >> 6;
            try {
                Object[] objArr3 = new Object[1];
                d(c5, modifierMetaStateMask, i27, objArr3);
                String str2 = (String) objArr3[0];
                int indexOf = TextUtils.indexOf("", "");
                int i28 = (indexOf ^ 18) + ((indexOf & 18) << 1);
                int i29 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int i30 = ~i29;
                int i31 = ((~(i30 | (-33410))) * 1512) + ((i29 * (-755)) - 25223795);
                int i32 = ~((i30 ^ (-33410)) | (i30 & (-33410)));
                int i33 = i29 | 33409;
                int i34 = ~(i33 | intValue);
                int i35 = (((i32 ^ i34) | (i32 & i34)) * (-756)) + i31;
                int i36 = -(-(((i33 & i23) | (i33 ^ i23)) * 756));
                char c7 = (char) ((i35 & i36) + (i36 | i35));
                int i37 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int b3 = component12.Companion.b();
                int i38 = i37 * 217;
                i4 = 16;
                int i39 = ((i38 | (-4085)) << 1) - (i38 ^ (-4085));
                int i40 = (~((i37 ^ b3) | (i37 & b3))) * 216;
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                int i42 = (i37 ^ (-20)) | (i37 & (-20));
                int i43 = ~b3;
                int i44 = (i41 - (~(((i42 & i43) | (i42 ^ i43)) * (-216)))) - 1;
                int i45 = ~((i37 & i43) | (i43 ^ i37));
                int i46 = -(-(((i45 & 19) | (i45 ^ 19)) * 216));
                int i47 = ((i44 | i46) << 1) - (i44 ^ i46);
                try {
                    Object[] objArr4 = new Object[1];
                    d(c7, i28, i47, objArr4);
                    String[] strArr = {str2, (String) objArr4[0]};
                    int i48 = e;
                    d = (((i48 | 21) << 1) - (i48 ^ 21)) % 128;
                    int i49 = 0;
                    while (true) {
                        if (i49 < i6) {
                            int i50 = e;
                            d = ((i50 & 63) + (i50 | 63)) % 128;
                            String str3 = strArr[i49];
                            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            int b4 = component12.Companion.b();
                            int i51 = ~((~scrollDefaultDelay) | 16);
                            i3 = i6;
                            int i52 = ~((b4 ^ 16) | (b4 & 16));
                            int i53 = (scrollDefaultDelay ^ 16) | (scrollDefaultDelay & 16);
                            int i54 = ((~((i53 ^ b4) | (i53 & b4))) * 70) + (((i51 ^ i52) | (i52 & i51)) * (-140)) + ((scrollDefaultDelay * 71) - 1104);
                            int i55 = ~((-17) | scrollDefaultDelay);
                            int i56 = ((~((scrollDefaultDelay & b4) | (scrollDefaultDelay ^ b4))) | (i51 ^ i55) | (i55 & i51)) * 70;
                            int i57 = (i54 ^ i56) + ((i56 & i54) << 1);
                            try {
                                int myPid = Process.myPid() >> 22;
                                int b5 = component12.Companion.b();
                                int i58 = ~myPid;
                                f2 = f3;
                                int i59 = ~b5;
                                int i60 = (i58 ^ i59) | (i59 & i58);
                                i2 = i5;
                                int i61 = ((~((i60 ^ 20786) | (i60 & 20786))) * 433) + (myPid * (-432)) + 9021124;
                                int i62 = ~(((-20787) & b5) | ((-20787) ^ b5));
                                int i63 = ((i62 & i58) | (i58 ^ i62)) * (-433);
                                int i64 = ((i61 | i63) << 1) - (i61 ^ i63);
                                int i65 = ~((i58 ^ b5) | (i58 & b5));
                                int i66 = ~(myPid | 20786);
                                c6 = (char) ((((i65 & i66) | (i65 ^ i66)) * 433) + i64);
                            } catch (Exception unused2) {
                                i2 = i5;
                                f2 = f3;
                                objArr2 = new Object[4];
                                int[] iArr2 = new int[1];
                                objArr2[i2] = iArr2;
                                int[] iArr3 = new int[1];
                                objArr2[i3] = iArr3;
                                objArr2[c3] = new int[1];
                                iArr3[i2] = intValue;
                                iArr2[i2] = intValue ^ 2;
                                objArr2[1] = null;
                                int myPid2 = Process.myPid();
                                int i67 = (((~((~myPid2) | (-1495030604))) | 1185148170) * 262) + (((~((-1495030604) | myPid2)) | 1185148170) * 262) + 781726350;
                                int i68 = (i67 ^ 16) + ((i67 & 16) << 1);
                                int i69 = (intValue2 ^ i68) + ((i68 & intValue2) << 1);
                                int i70 = i69 << 13;
                                int i71 = ((~i69) & i70) | ((~i70) & i69);
                                int i72 = i71 >>> 17;
                                int i73 = ((~i71) & i72) | ((~i72) & i71);
                                int i74 = i73 << 5;
                                ((int[]) objArr2[c3])[i2] = (i73 | i74) & (~(i73 & i74));
                                if (intValue != ((int[]) objArr2[i2])[i2]) {
                                }
                            }
                            try {
                                int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                int i75 = ((fadingEdgeLength | 37) << 1) - (fadingEdgeLength ^ 37);
                                Object[] objArr5 = new Object[1];
                                d(c6, i57, i75, objArr5);
                                Class<?> cls = Class.forName((String) objArr5[i2]);
                                if (((Boolean) cls.getMethod(str3, null).invoke(cls, null)).booleanValue()) {
                                    int i76 = d;
                                    e = (((i76 | 91) << 1) - (i76 ^ 91)) % 128;
                                    int i77 = (intValue & (-2)) | (i23 & 1);
                                    Object[] objArr6 = new Object[4];
                                    int[] iArr4 = new int[1];
                                    objArr6[i2] = iArr4;
                                    int[] iArr5 = new int[1];
                                    objArr6[i3] = iArr5;
                                    objArr6[3] = new int[1];
                                    iArr5[i2] = intValue;
                                    iArr4[i2] = i77;
                                    objArr6[1] = null;
                                    int nextInt = new Random().nextInt();
                                    int i78 = (((~((~nextInt) | (-1854513106))) | 1686736448) * (-245)) + 1638608026;
                                    int i79 = ~(nextInt | (-1854513106));
                                    int b6 = com.fingerprintjs.android.fpjs_pro.g.b(i79 | 173175227, 245, (i79 * (-245)) + i78, -16);
                                    int i80 = b6 * (-159);
                                    int i81 = intValue2 * (-159);
                                    int i82 = (i80 & i81) + (i80 | i81);
                                    int i83 = ~b6;
                                    int i84 = (((((i83 & intValue2) | (intValue2 ^ i83)) * 160) + i82) - (~(((~((i23 ^ b6) | (i23 & b6))) | (~(b6 | intValue2))) * (-160)))) - 1;
                                    int i85 = ~intValue2;
                                    int i86 = ~((i85 & i23) | (i85 ^ i23));
                                    int i87 = -(-(((b6 & i86) | (b6 ^ i86)) * 160));
                                    int i88 = (i84 ^ i87) + ((i87 & i84) << 1);
                                    int i89 = i88 << 13;
                                    int i90 = (i89 & (~i88)) | ((~i89) & i88);
                                    int i91 = i90 >>> 17;
                                    int i92 = ((~i90) & i91) | ((~i91) & i90);
                                    int i93 = i92 << 5;
                                    ((int[]) objArr6[3])[i2] = (i92 | i93) & (~(i92 & i93));
                                    objArr2 = objArr6;
                                    break;
                                }
                                int i94 = i49 - 15;
                                i49 = (i94 | 16) + (i94 & 16);
                                int i95 = d;
                                e = ((i95 ^ 75) + ((i95 & 75) << 1)) % 128;
                                f3 = f2;
                                i5 = i2;
                                i6 = i3;
                            } catch (Exception unused3) {
                                objArr2 = new Object[4];
                                int[] iArr22 = new int[1];
                                objArr2[i2] = iArr22;
                                int[] iArr32 = new int[1];
                                objArr2[i3] = iArr32;
                                objArr2[c3] = new int[1];
                                iArr32[i2] = intValue;
                                iArr22[i2] = intValue ^ 2;
                                objArr2[1] = null;
                                int myPid22 = Process.myPid();
                                int i672 = (((~((~myPid22) | (-1495030604))) | 1185148170) * 262) + (((~((-1495030604) | myPid22)) | 1185148170) * 262) + 781726350;
                                int i682 = (i672 ^ 16) + ((i672 & 16) << 1);
                                int i692 = (intValue2 ^ i682) + ((i682 & intValue2) << 1);
                                int i702 = i692 << 13;
                                int i712 = ((~i692) & i702) | ((~i702) & i692);
                                int i722 = i712 >>> 17;
                                int i732 = ((~i712) & i722) | ((~i722) & i712);
                                int i742 = i732 << 5;
                                ((int[]) objArr2[c3])[i2] = (i732 | i742) & (~(i732 & i742));
                                if (intValue != ((int[]) objArr2[i2])[i2]) {
                                }
                            }
                        } else {
                            i2 = i5;
                            f2 = f3;
                            i3 = i6;
                            Object[] objArr7 = new Object[4];
                            int[] iArr6 = new int[1];
                            objArr7[i2] = iArr6;
                            int[] iArr7 = new int[1];
                            objArr7[i3] = iArr7;
                            objArr7[3] = new int[1];
                            iArr7[i2] = intValue;
                            iArr6[i2] = intValue;
                            objArr7[1] = null;
                            int uptimeMillis = (int) SystemClock.uptimeMillis();
                            int i96 = (~((-825888815) | uptimeMillis)) | 19005454;
                            int i97 = ((uptimeMillis | 1201799518) * 496) + ((i96 | (~((~uptimeMillis) | 2008682878))) * (-496)) + (i96 * 992) + 1316622924;
                            int i98 = (intValue2 * (-657)) + (i97 * 659);
                            int i99 = ~i97;
                            int i100 = ~((i99 & intValue2) | (i99 ^ intValue2));
                            int i101 = ~intValue2;
                            int i102 = ~((i101 & i97) | (i101 ^ i97));
                            int i103 = i100 | i102;
                            int i104 = ~(i97 | intValue);
                            int i105 = -(-(((i103 & i104) | (i103 ^ i104)) * (-658)));
                            int i106 = ((i98 | i105) << 1) - (i105 ^ i98);
                            int i107 = -(-(i102 * 658));
                            int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                            int i109 = ~((i97 & intValue) | (i97 ^ intValue));
                            int i110 = ((i109 & i102) | (i102 ^ i109)) * 658;
                            int i111 = (i108 & i110) + (i110 | i108);
                            int i112 = i111 << 13;
                            int i113 = (i112 & (~i111)) | ((~i112) & i111);
                            int i114 = i113 >>> 17;
                            int i115 = ((~i113) & i114) | ((~i114) & i113);
                            ((int[]) objArr7[3])[i2] = i115 ^ (i115 << 5);
                            objArr2 = objArr7;
                            break;
                        }
                    }
                } catch (Exception unused4) {
                    i2 = i5;
                    f2 = f3;
                    i3 = i6;
                }
            } catch (Exception unused5) {
                i2 = 0;
                f2 = 0.0f;
                i3 = 2;
                i4 = 16;
                objArr2 = new Object[4];
                int[] iArr222 = new int[1];
                objArr2[i2] = iArr222;
                int[] iArr322 = new int[1];
                objArr2[i3] = iArr322;
                objArr2[c3] = new int[1];
                iArr322[i2] = intValue;
                iArr222[i2] = intValue ^ 2;
                objArr2[1] = null;
                int myPid222 = Process.myPid();
                int i6722 = (((~((~myPid222) | (-1495030604))) | 1185148170) * 262) + (((~((-1495030604) | myPid222)) | 1185148170) * 262) + 781726350;
                int i6822 = (i6722 ^ 16) + ((i6722 & 16) << 1);
                int i6922 = (intValue2 ^ i6822) + ((i6822 & intValue2) << 1);
                int i7022 = i6922 << 13;
                int i7122 = ((~i6922) & i7022) | ((~i7022) & i6922);
                int i7222 = i7122 >>> 17;
                int i7322 = ((~i7122) & i7222) | ((~i7222) & i7122);
                int i7422 = i7322 << 5;
                ((int[]) objArr2[c3])[i2] = (i7322 | i7422) & (~(i7322 & i7422));
                if (intValue != ((int[]) objArr2[i2])[i2]) {
                }
            }
        } catch (Exception unused6) {
            i2 = 0;
            f2 = 0.0f;
            i3 = 2;
            c3 = 3;
            r41 = c2;
            i4 = 16;
            objArr2 = new Object[4];
            int[] iArr2222 = new int[1];
            objArr2[i2] = iArr2222;
            int[] iArr3222 = new int[1];
            objArr2[i3] = iArr3222;
            objArr2[c3] = new int[1];
            iArr3222[i2] = intValue;
            iArr2222[i2] = intValue ^ 2;
            objArr2[1] = null;
            int myPid2222 = Process.myPid();
            int i67222 = (((~((~myPid2222) | (-1495030604))) | 1185148170) * 262) + (((~((-1495030604) | myPid2222)) | 1185148170) * 262) + 781726350;
            int i68222 = (i67222 ^ 16) + ((i67222 & 16) << 1);
            int i69222 = (intValue2 ^ i68222) + ((i68222 & intValue2) << 1);
            int i70222 = i69222 << 13;
            int i71222 = ((~i69222) & i70222) | ((~i70222) & i69222);
            int i72222 = i71222 >>> 17;
            int i73222 = ((~i71222) & i72222) | ((~i72222) & i71222);
            int i74222 = i73222 << 5;
            ((int[]) objArr2[c3])[i2] = (i73222 | i74222) & (~(i73222 & i74222));
            if (intValue != ((int[]) objArr2[i2])[i2]) {
            }
        }
        if (intValue != ((int[]) objArr2[i2])[i2]) {
            int i116 = e;
            int i117 = ((i116 | 101) << 1) - (i116 ^ 101);
            d = i117 % 128;
            if (i117 % 2 != 0) {
                int i118 = 11 / 0;
            }
            return objArr2;
        }
        try {
            Object f4 = rV4669.f(1793141623);
            if (f4 == null) {
                int blue = 6357 - Color.blue(i2);
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int i119 = (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 51;
                Object[] objArr8 = new Object[1];
                e(objArr8);
                f4 = rV4669.g(blue, scrollBarSize, i119, -481954285, (String) objArr8[i2], new Class[i2]);
            }
            long longValue = ((Long) ((Method) f4).invoke(null, null)).longValue();
            long j2 = longValue ^ (-1);
            long j3 = (-1875892655) | j2;
            long elapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime ^ (-1);
            long e2 = com.fingerprintjs.android.fpjs_pro.g.e(168L, (((-1875892655) | longValue) ^ (-1)) | (((-1875892655) | j4) ^ (-1)) | (((1875892654 | j2) | elapsedRealtime) ^ (-1)), (((j3 | elapsedRealtime) ^ (-1)) * 168) + (((j3 ^ (-1)) | ((j2 | j4) ^ (-1))) * 168) + (((-167) * longValue) - 313274073218L), -2123904215L);
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            int i120 = (((~((-548703334) | maxMemory)) | (-888523078)) * (-318)) + 748730218;
            int i121 = ~((-888523078) | maxMemory);
            int i122 = ~maxMemory;
            int i123 = ((int) (e2 >> 32)) & ((((~(maxMemory | 888524133)) | (~((-339820801) | i122))) * 318) + ((i121 | (~(i122 | 888524133))) * 318) + i120);
            int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i124 = ~elapsedRealtime2;
            int i125 = (~((-689655298) | i124)) | 671154689;
            int i126 = ~(elapsedRealtime2 | 2145382315);
            int i127 = ((int) e2) & (((~(i124 | 2126881707)) * 713) + (i126 * 1426) + ((i125 | i126) * (-713)) + 1003930922);
            if (((i127 & i123) | (i123 ^ i127)) == 1) {
                int i128 = d;
                e = ((i128 & 75) + (i128 | 75)) % 128;
                int i129 = (intValue & (-11)) | ((~intValue) & 10);
                ?? r1 = new Object[4];
                int[] iArr8 = new int[1];
                r1[0] = iArr8;
                int[] iArr9 = new int[1];
                r1[i3] = iArr9;
                r1[c3] = new int[1];
                iArr9[0] = intValue;
                iArr8[0] = i129;
                r1[1] = null;
                int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i130 = (~((-1806102409) | uptimeMillis2)) | 153362944;
                int i131 = ~uptimeMillis2;
                int i132 = ((~(i131 | 221585924)) * 886) + (((~(i131 | 1806102408)) | 221585924) * (-1772)) + ((i130 | (~(1874325388 | i131))) * 886) + 1357022348;
                int b7 = component12.Companion.b();
                int i133 = (-2065) - (~(-(-(i132 * 131))));
                int i134 = ~i132;
                int i135 = ~b7;
                int i136 = (i135 & i134) | (i134 ^ i135);
                int i137 = -(-((~((i136 & 16) | (i136 ^ 16))) * 130));
                int i138 = (((i133 ^ i137) + ((i133 & i137) << 1)) - (~((~((i134 ^ 16) | (i134 & 16))) * (-260)))) - 1;
                int i139 = ~(r41 | i132);
                int i140 = i134 | 16;
                int i141 = ~((b7 & i140) | (i140 ^ b7));
                int i142 = (intValue2 - (~((i138 - (~(((i141 & i139) | (i139 ^ i141)) * 130))) - 1))) - 1;
                int i143 = i142 << 13;
                int i144 = ((~i142) & i143) | ((~i143) & i142);
                int i145 = i144 ^ (i144 >>> 17);
                c4 = 0;
                ((int[]) r1[c3])[0] = i145 ^ (i145 << 5);
                iArr = r1;
            } else {
                ?? r12 = new Object[4];
                int[] iArr10 = new int[1];
                r12[0] = iArr10;
                int[] iArr11 = new int[1];
                r12[i3] = iArr11;
                r12[c3] = new int[1];
                iArr11[0] = intValue;
                iArr10[0] = intValue;
                r12[1] = null;
                int i146 = (((~((~((int) SystemClock.elapsedRealtime())) | 1838815511)) | 151001109) * 970) + (((1687814402 | r0) * (-970)) - 1912036466);
                int b8 = component12.Companion.b();
                int i147 = i146 * 339;
                int i148 = ~b8;
                int i149 = ~(((-1) ^ i148) | i148);
                int i150 = ~(~i146);
                int i151 = (i150 & i149) | (i149 ^ i150);
                int i152 = ((i148 & i151) | (i151 ^ i148)) * (-338);
                int i153 = (i147 ^ i152) + ((i147 & i152) << 1);
                int i154 = (~(((-1) ^ i146) | i146)) * 338;
                int i155 = ~((i146 & b8) | (i146 ^ b8));
                int i156 = ((((i153 ^ i154) + ((i154 & i153) << 1)) - (~(-(-(((i155 & i149) | (i149 ^ i155)) * 338))))) - 1) + intValue2;
                int i157 = i156 << 13;
                int i158 = (i157 | i156) & (~(i156 & i157));
                int i159 = i158 >>> 17;
                int i160 = ((~i158) & i159) | ((~i159) & i158);
                int i161 = i160 << 5;
                c4 = 0;
                ((int[]) r12[c3])[0] = (i160 | i161) & (~(i160 & i161));
                int i162 = e;
                d = ((i162 & 89) + (i162 | 89)) % 128;
                iArr = r12;
            }
            if (intValue != iArr[c4][c4]) {
                int i163 = d;
                int i164 = (i163 & 83) + (i163 | 83);
                e = i164 % 128;
                if (i164 % 2 != 0) {
                    return iArr;
                }
                throw null;
            }
            try {
                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                int b9 = component12.Companion.b();
                int i165 = windowTouchSlop * 141;
                int i166 = ((i165 | (-11160)) << 1) - (i165 ^ (-11160));
                int i167 = -(-(((b9 ^ 40) | (b9 & 40)) * 140));
                int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
                int i169 = ~windowTouchSlop;
                int i170 = ~((i169 ^ 40) | (i169 & 40));
                int i171 = ~b9;
                int i172 = ~((i171 ^ 40) | (i171 & 40));
                int i173 = -(-(((i170 & i172) | (i170 ^ i172)) * (-280)));
                int i174 = ((i168 | i173) << 1) - (i173 ^ i168);
                int i175 = ~(((-41) & windowTouchSlop) | ((-41) ^ windowTouchSlop));
                int i176 = ~((windowTouchSlop & i171) | (i171 ^ windowTouchSlop));
                int i177 = (i176 & i175) | (i175 ^ i176);
                int i178 = ~(b9 | i169 | 40);
                int i179 = (i174 - (~(((i177 & i178) | (i177 ^ i178)) * 140))) - 1;
                int i180 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int b10 = component12.Companion.b();
                int i181 = (i180 * 592) - 37465000;
                int i182 = ~i180;
                int i183 = -(-((~((i182 ^ 63500) | (i182 & 63500))) * (-1182)));
                int i184 = (i181 & i183) + (i181 | i183);
                int i185 = (i182 ^ (-63501)) | (i182 & (-63501));
                int i186 = ~b10;
                int i187 = ~((i185 & i186) | (i185 ^ i186));
                int i188 = ~((i180 & 63500) | (i180 ^ 63500));
                char c8 = (char) ((((b10 ^ i182) | (b10 & i182) | (-63501)) * 591) + ((i184 - (~(((i188 & i187) | (i187 ^ i188)) * (-591)))) - 1));
                int i189 = -Color.red(0);
                int b11 = component12.Companion.b();
                int i190 = ~i189;
                int i191 = ~((i190 ^ (-54)) | (i190 & (-54)));
                int i192 = ~b11;
                int i193 = (((i189 ^ 53) | (i189 & 53)) * (-482)) + ((((i189 * 483) + 12826) - (~((i191 | (~(i190 | i192))) * (-241)))) - 1);
                int i194 = ~((i189 & (-54)) | ((-54) ^ i189));
                int i195 = (i192 & i190) | (i190 ^ i192);
                int i196 = ~((i195 & 53) | (i195 ^ 53));
                int i197 = -(-(((i194 & i196) | (i194 ^ i196)) * 241));
                int i198 = (i193 ^ i197) + ((i197 & i193) << 1);
                Object[] objArr9 = new Object[1];
                d(c8, i179, i198, objArr9);
                file3 = new File((String) objArr9[0]);
            } catch (Exception unused7) {
            }
            if (file3.canRead()) {
                FileReader fileReader2 = new FileReader(file3);
                BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                try {
                    String readLine = bufferedReader2.readLine();
                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int b12 = component12.Companion.b();
                    int i199 = (keyRepeatDelay * 450) - 1344;
                    int i200 = ~keyRepeatDelay;
                    int i201 = ~((i200 ^ 3) | (i200 & 3));
                    int i202 = ((-4) ^ keyRepeatDelay) | ((-4) & keyRepeatDelay);
                    int i203 = ~((i202 & b12) | (i202 ^ b12));
                    int i204 = ((i203 & i201) | (i201 ^ i203)) * 449;
                    int i205 = ((~(i200 | 3)) * (-1347)) + (((i199 | i204) << 1) - (i199 ^ i204));
                    int i206 = ~b12;
                    int i207 = (i206 & (-4)) | ((-4) ^ i206);
                    int i208 = ~((keyRepeatDelay & i207) | (i207 ^ keyRepeatDelay));
                    int i209 = ((i208 & i201) | (i201 ^ i208)) * 449;
                    int i210 = (i205 & i209) + (i209 | i205);
                    int i211 = -View.resolveSizeAndState(0, 0, 0);
                    int i212 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                    int i213 = (i212 ^ 93) + ((i212 & 93) << 1);
                    Object[] objArr10 = new Object[1];
                    d((char) ((i211 & 55919) + (i211 | 55919)), i210, i213, objArr10);
                    if (!readLine.equals((String) objArr10[0])) {
                        fileReader2.close();
                        bufferedReader2.close();
                        str = readLine;
                        int i214 = 30 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
                        char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        float f5 = f2;
                        int i215 = (TypedValue.complexToFraction(0, f5, f5) > f5 ? 1 : (TypedValue.complexToFraction(0, f5, f5) == f5 ? 0 : -1)) + 96;
                        Object[] objArr11 = new Object[1];
                        d(combineMeasuredStates, i214, i215, objArr11);
                        file2 = new File((String) objArr11[0]);
                        if (file2.canRead()) {
                            try {
                                fileReader = new FileReader(file2);
                                bufferedReader = new BufferedReader(fileReader);
                            } catch (Exception unused8) {
                            }
                            try {
                                String readLine2 = bufferedReader.readLine();
                                int i216 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int b13 = component12.Companion.b();
                                int i217 = (i216 * (-1529)) - 764;
                                int i218 = ~i216;
                                int i219 = i218 | (-2);
                                int i220 = ~b13;
                                int i221 = ~((i219 & i220) | (i219 ^ i220));
                                int i222 = ~(i218 | 1 | b13);
                                int i223 = (-2) | i216;
                                obj = null;
                                int i224 = ((~((i223 ^ b13) | (i223 & b13))) | (i221 ^ i222) | (i221 & i222)) * 765;
                                int i225 = ((i217 | i224) << 1) - (i217 ^ i224);
                                int i226 = ~((i218 ^ (-2)) | (i218 & (-2)));
                                int i227 = ~((i218 ^ i220) | (i218 & i220));
                                int i228 = (((i226 ^ i227) | (i226 & i227)) * 1530) + i225;
                                int i229 = ~(b13 | i218);
                                int i230 = ((-2) ^ i220) | ((-2) & i220);
                                int i231 = ~((i216 & i230) | (i230 ^ i216));
                                int i232 = ((i231 & i229) | (i229 ^ i231)) * 765;
                                int i233 = (i228 & i232) + (i232 | i228);
                                try {
                                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                    int i234 = -(SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                                    int i235 = (i234 & 128) + (i234 | 128);
                                    Object[] objArr12 = new Object[1];
                                    d(maxKeyCode, i233, i235, objArr12);
                                    z = readLine2.equals((String) objArr12[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (z) {
                                        try {
                                            int i236 = -ImageFormat.getBitsPerPixel(0);
                                            int i237 = (i236 * 46) + 1610;
                                            int i238 = ~intValue;
                                            int i239 = ((~(((-36) ^ i238) | ((-36) & i238))) | i236) * (-90);
                                            int i240 = (i237 & i239) + (i237 | i239);
                                            int i241 = ~(((-36) ^ intValue) | ((-36) & intValue));
                                            int i242 = ~((i236 ^ 35) | (i236 & 35));
                                            int i243 = (i240 - (~(((i241 & i242) | (i241 ^ i242)) * (-45)))) - 1;
                                            int i244 = ~i236;
                                            int i245 = -(-(((~((i236 & i238) | (i238 ^ i236))) | (~((i244 & intValue) | (i244 ^ intValue))) | (-36)) * 45));
                                            int i246 = ((i243 | i245) << 1) - (i245 ^ i243);
                                            char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                            int i247 = -(ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                            int i248 = (i247 * (-518)) - 66822;
                                            int i249 = ~i247;
                                            int i250 = ~(i249 | i238);
                                            int i251 = -(-(((i250 & 129) | (i250 ^ 129)) * 519));
                                            int i252 = ((i248 | i251) << 1) - (i248 ^ i251);
                                            int i253 = (i238 & i249) | (i249 ^ i238);
                                            int i254 = ~((i253 & 129) | (i253 ^ 129));
                                            int i255 = (i247 ^ 129) | (i247 & 129);
                                            int i256 = ~((i255 & intValue) | (i255 ^ intValue));
                                            int i257 = (((i254 & i256) | (i254 ^ i256)) * (-519)) + i252;
                                            int i258 = ~(intValue | 129);
                                            int i259 = ((i247 & i258) | (i247 ^ i258)) * 519;
                                            int i260 = ((i257 | i259) << 1) - (i257 ^ i259);
                                            Object[] objArr13 = new Object[1];
                                            d(resolveOpacity, i246, i260, objArr13);
                                            file = new File((String) objArr13[0]);
                                        } catch (Exception unused9) {
                                        }
                                        if (!file.canRead()) {
                                            int i261 = (d + 63) % 128;
                                            e = i261;
                                            d = (i261 + 73) % 128;
                                            z2 = false;
                                            if (z2) {
                                                int i262 = e;
                                                int i263 = (((i262 | 35) << 1) - (i262 ^ 35)) % 128;
                                                d = i263;
                                                if (str != null) {
                                                    e = (i263 + 91) % 128;
                                                    int i264 = (intValue & (-21)) | ((~intValue) & 20);
                                                    Object[] objArr14 = new Object[4];
                                                    int[] iArr12 = new int[1];
                                                    objArr14[0] = iArr12;
                                                    int[] iArr13 = new int[1];
                                                    objArr14[i3] = iArr13;
                                                    objArr14[c3] = new int[1];
                                                    iArr13[0] = intValue;
                                                    iArr12[0] = i264;
                                                    objArr14[1] = str;
                                                    int i265 = (int) Runtime.getRuntime().totalMemory();
                                                    int a = k84.a((~(i265 | (-288929097))) | 1738759236, 376, (((~((~i265) | 288929096)) | (-2008808781)) * (-376)) + ((((-1989929229) | i265) * 376) - 173913108), i4);
                                                    int i266 = (intValue2 & a) + (a | intValue2);
                                                    int i267 = i266 << 13;
                                                    int i268 = (i267 | i266) & (~(i266 & i267));
                                                    int i269 = i268 >>> 17;
                                                    int i270 = (i268 | i269) & (~(i268 & i269));
                                                    int i271 = i270 << 5;
                                                    ((int[]) objArr14[c3])[0] = ((~i270) & i271) | ((~i271) & i270);
                                                    return objArr14;
                                                }
                                            }
                                        } else {
                                            FileReader fileReader3 = new FileReader(file);
                                            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                            try {
                                                String readLine3 = bufferedReader3.readLine();
                                                int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                Object[] objArr15 = new Object[1];
                                                d((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((touchSlop | 1) << 1) - (touchSlop ^ 1), ExpandableListView.getPackedPositionType(j) + 127, objArr15);
                                                z2 = readLine3.equals((String) objArr15[0]);
                                                fileReader3.close();
                                                bufferedReader3.close();
                                                if (z2) {
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                    Object[] objArr16 = new Object[4];
                                    int[] iArr14 = new int[1];
                                    objArr16[0] = iArr14;
                                    int[] iArr15 = new int[1];
                                    objArr16[i3] = iArr15;
                                    objArr16[c3] = new int[1];
                                    iArr15[0] = intValue;
                                    iArr14[0] = intValue;
                                    objArr16[1] = obj;
                                    int i272 = (((~(hdi.b(1675838576) | 516050831)) | 1075413104) * 658) + (((1155239538 | r1) * (-658)) - 1281092944);
                                    int i273 = i272 * (-559);
                                    int i274 = -(-(intValue2 * 561));
                                    int i275 = ((i273 | i274) << 1) - (i273 ^ i274);
                                    int i276 = ~intValue;
                                    int i277 = (i275 - (~((~(i276 | i272)) * (-560)))) - 1;
                                    int i278 = ~intValue2;
                                    int i279 = (~(intValue | (i278 & i272) | (i278 ^ i272))) * (-560);
                                    int i280 = ~i272;
                                    int i281 = (((~((i280 & intValue2) | (i280 ^ intValue2))) | (~((i276 ^ intValue2) | (intValue2 & i276)))) * 560) + (((i277 | i279) << 1) - (i279 ^ i277));
                                    int i282 = i281 << 13;
                                    int i283 = ((~i281) & i282) | ((~i282) & i281);
                                    int i284 = i283 >>> 17;
                                    int i285 = ((~i283) & i284) | ((~i284) & i283);
                                    ((int[]) objArr16[c3])[0] = i285 ^ (i285 << 5);
                                    return objArr16;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        r41 = 0;
                        z = false;
                        obj = r41;
                        if (z) {
                        }
                        Object[] objArr162 = new Object[4];
                        int[] iArr142 = new int[1];
                        objArr162[0] = iArr142;
                        int[] iArr152 = new int[1];
                        objArr162[i3] = iArr152;
                        objArr162[c3] = new int[1];
                        iArr152[0] = intValue;
                        iArr142[0] = intValue;
                        objArr162[1] = obj;
                        int i2722 = (((~(hdi.b(1675838576) | 516050831)) | 1075413104) * 658) + (((1155239538 | r1) * (-658)) - 1281092944);
                        int i2732 = i2722 * (-559);
                        int i2742 = -(-(intValue2 * 561));
                        int i2752 = ((i2732 | i2742) << 1) - (i2732 ^ i2742);
                        int i2762 = ~intValue;
                        int i2772 = (i2752 - (~((~(i2762 | i2722)) * (-560)))) - 1;
                        int i2782 = ~intValue2;
                        int i2792 = (~(intValue | (i2782 & i2722) | (i2782 ^ i2722))) * (-560);
                        int i2802 = ~i2722;
                        int i2812 = (((~((i2802 & intValue2) | (i2802 ^ intValue2))) | (~((i2762 ^ intValue2) | (intValue2 & i2762)))) * 560) + (((i2772 | i2792) << 1) - (i2792 ^ i2772));
                        int i2822 = i2812 << 13;
                        int i2832 = ((~i2812) & i2822) | ((~i2822) & i2812);
                        int i2842 = i2832 >>> 17;
                        int i2852 = ((~i2832) & i2842) | ((~i2842) & i2832);
                        ((int[]) objArr162[c3])[0] = i2852 ^ (i2852 << 5);
                        return objArr162;
                    }
                    fileReader2.close();
                    bufferedReader2.close();
                    int i286 = e;
                    d = (((i286 | 85) << 1) - (i286 ^ 85)) % 128;
                } finally {
                }
            }
            str = null;
            int i2142 = 30 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
            char combineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
            float f52 = f2;
            int i2152 = (TypedValue.complexToFraction(0, f52, f52) > f52 ? 1 : (TypedValue.complexToFraction(0, f52, f52) == f52 ? 0 : -1)) + 96;
            Object[] objArr112 = new Object[1];
            d(combineMeasuredStates2, i2142, i2152, objArr112);
            file2 = new File((String) objArr112[0]);
            if (file2.canRead()) {
            }
            r41 = 0;
            z = false;
            obj = r41;
            if (z) {
            }
            Object[] objArr1622 = new Object[4];
            int[] iArr1422 = new int[1];
            objArr1622[0] = iArr1422;
            int[] iArr1522 = new int[1];
            objArr1622[i3] = iArr1522;
            objArr1622[c3] = new int[1];
            iArr1522[0] = intValue;
            iArr1422[0] = intValue;
            objArr1622[1] = obj;
            int i27222 = (((~(hdi.b(1675838576) | 516050831)) | 1075413104) * 658) + (((1155239538 | r1) * (-658)) - 1281092944);
            int i27322 = i27222 * (-559);
            int i27422 = -(-(intValue2 * 561));
            int i27522 = ((i27322 | i27422) << 1) - (i27322 ^ i27422);
            int i27622 = ~intValue;
            int i27722 = (i27522 - (~((~(i27622 | i27222)) * (-560)))) - 1;
            int i27822 = ~intValue2;
            int i27922 = (~(intValue | (i27822 & i27222) | (i27822 ^ i27222))) * (-560);
            int i28022 = ~i27222;
            int i28122 = (((~((i28022 & intValue2) | (i28022 ^ intValue2))) | (~((i27622 ^ intValue2) | (intValue2 & i27622)))) * 560) + (((i27722 | i27922) << 1) - (i27922 ^ i27722));
            int i28222 = i28122 << 13;
            int i28322 = ((~i28122) & i28222) | ((~i28222) & i28122);
            int i28422 = i28322 >>> 17;
            int i28522 = ((~i28322) & i28422) | ((~i28422) & i28322);
            ((int[]) objArr1622[c3])[0] = i28522 ^ (i28522 << 5);
            return objArr1622;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x020c, code lost:
    
        r4[r5] = (char) r2[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0212, code lost:
    
        r0 = new java.lang.Object[]{r1, r1};
        r1 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(2020003388);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x021c, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021e, code lost:
    
        r1 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(4736 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (10125 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1))), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 52, -238939304, a(3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024a, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024f, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(char c2, int i2, int i3, Object[] objArr) {
        Throwable cause;
        char c3;
        cm cmVar = new cm();
        long[] jArr = new long[i2];
        cmVar.component5 = 0;
        while (true) {
            int i4 = cmVar.component5;
            if (i4 >= i2) {
                break;
            }
            int i5 = g + 73;
            h = i5 % 128;
            int i6 = i5 % 2;
            Class cls = Long.TYPE;
            long j = c;
            char[] cArr = b;
            Class cls2 = Integer.TYPE;
            if (i6 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i3 - i4])};
                    Object f2 = rV4669.f(1480709268);
                    if (f2 == null) {
                        c3 = 1;
                        f2 = rV4669.g(Color.rgb(0, 0, 0) + 16783262, (char) (Process.myPid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52, -773518864, a((short) 0), new Class[]{cls2});
                    } else {
                        c3 = 1;
                    }
                    Long l = (Long) ((Method) f2).invoke(null, objArr2);
                    l.getClass();
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c2);
                    objArr3[2] = Long.valueOf(j);
                    objArr3[c3] = Long.valueOf(i4);
                    objArr3[0] = l;
                    Object f3 = rV4669.f(-1745711337);
                    if (f3 == null) {
                        f3 = rV4669.g(3108 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 11543), (ViewConfiguration.getTapTimeout() >> 16) + 52, 508973683, a((short) 2), new Class[]{cls, cls, cls, cls2});
                    }
                    jArr[i4] = ((Long) ((Method) f3).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[c3] = cmVar;
                    objArr4[0] = cmVar;
                    Object f4 = rV4669.f(2020003388);
                    if (f4 == null) {
                        f4 = rV4669.g(Color.blue(0) + 4736, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10123), 52 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -238939304, a((short) 3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) f4).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(cArr[i3 + i4])};
                Object f5 = rV4669.f(1480709268);
                if (f5 == null) {
                    f5 = rV4669.g(TextUtils.indexOf("", "") + 6046, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 52, -773518864, a((short) 0), new Class[]{cls2});
                }
                Long l2 = (Long) ((Method) f5).invoke(null, objArr5);
                l2.getClass();
                Object[] objArr6 = {l2, Long.valueOf(i4), Long.valueOf(j), Integer.valueOf(c2)};
                Object f6 = rV4669.f(-1745711337);
                if (f6 == null) {
                    f6 = rV4669.g(View.getDefaultSize(0, 0) + 3109, (char) (11543 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 52, 508973683, a((short) 2), new Class[]{cls, cls, cls, cls2});
                }
                jArr[i4] = ((Long) ((Method) f6).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cmVar, cmVar};
                Object f7 = rV4669.f(2020003388);
                if (f7 == null) {
                    f7 = rV4669.g((CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 4736, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 10124), (-16777164) - Color.rgb(0, 0, 0), -238939304, a((short) 3), new Class[]{Object.class, Object.class});
                }
                ((Method) f7).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th;
        }
        char[] cArr2 = new char[i2];
        cmVar.component5 = 0;
        while (true) {
            int i7 = cmVar.component5;
            if (i7 < i2) {
                int i8 = h + 9;
                g = i8 % 128;
                if (i8 % 2 != 0) {
                    break;
                }
                cArr2[i7] = (char) jArr[i7];
                Object[] objArr8 = {cmVar, cmVar};
                Object f8 = rV4669.f(2020003388);
                if (f8 == null) {
                    f8 = rV4669.g(View.MeasureSpec.makeMeasureSpec(0, 0) + 4736, (char) (View.resolveSizeAndState(0, 0, 0) + 10124), (ViewConfiguration.getPressedStateDuration() >> 16) + 52, -238939304, a((short) 3), new Class[]{Object.class, Object.class});
                }
                ((Method) f8).invoke(null, objArr8);
            } else {
                objArr[0] = new String(cArr2);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Object[] objArr) {
        int i2;
        byte[] bArr = new byte[4];
        byte[] bArr2 = f;
        int i3 = 99;
        int i4 = 0;
        if (bArr2 == null) {
            byte b2 = 99;
            i3 = 3;
            i2 = 3;
            i3 = i3 + b2 + 6;
            bArr[i4] = (byte) i3;
            i2++;
            if (i4 == 3) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i4++;
            b2 = bArr2[i2];
            i3 = i3 + b2 + 6;
            bArr[i4] = (byte) i3;
            i2++;
            if (i4 == 3) {
            }
        } else {
            i2 = 3;
            bArr[i4] = (byte) i3;
            i2++;
            if (i4 == 3) {
            }
        }
    }

    public static /* synthetic */ Serializable f(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~(i8 | i5);
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i6));
        int i12 = (~(i5 | i6)) | (~((~i6) | i8 | i10));
        int i13 = i8 | i6 | i10;
        int i14 = 465567744 * i2;
        int i15 = (1887436800 * i3) + i14 + (i4 * 465567744) + ((-1248335539) * i13) + (1248335539 * i12) + (i11 * 1248335539) + ((-782767794) * i7) + ((1713903284 * i6) - 1228931072);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i3, -853422242, (1362283521 * i2) + i6 + i7 + i4);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 791674880, (i3 * (-747618338)) + (i2 * 1172694977) + (i4 * 722869185) + (i13 * 525) + (i12 * (-525)) + (i11 * (-525)) + (i7 * 722869710) + ((i6 * 722868660) - 41817558), 751828992, ((-1154482176) * a) + i15) != 1) {
            T9586V28869 t9586v28869 = (T9586V28869) objArr[0];
            String str = (String) objArr[1];
            e = (d + 55) % 128;
            if (d55.a(t9586v28869.a, str) == 0) {
                System.identityHashCode(t9586v28869);
                component12.Companion.b();
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return (Serializable) b(objArr);
    }

    public static final /* synthetic */ boolean g(T9586V28869 t9586v28869, String str) {
        int i2 = e;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int b2 = component12.Companion.b();
            boolean booleanValue = ((Boolean) f(new Object[]{t9586v28869, str}, component12.Companion.b(), component12.Companion.b(), component12.Companion.b(), b2, 1156437176, -1156437176)).booleanValue();
            int i4 = e + 67;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                return booleanValue;
            }
            throw null;
        }
        int b3 = component12.Companion.b();
        throw null;
    }

    public static void h() {
        f = new byte[]{114, 68, MessagePack.Code.FIXEXT4, 38, 6, -5, 3};
    }

    public static void i() {
        i = new byte[]{19, -119, 81, MessagePack.Code.BIN8};
    }

    public static Object[] setPivotYN16904(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        int b2 = component12.Companion.b();
        return (Object[]) f(objArr, component12.Companion.b(), component12.Companion.b(), component12.Companion.b(), b2, 153452220, -153452219);
    }

    public final List c() {
        try {
            Object[] objArr = {0L, r0, r0, new s0(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f2 = rV4669.f(942509419);
            if (f2 == null) {
                int capsMode = 848 - TextUtils.getCapsMode("", 0, 0);
                char myPid = (char) (Process.myPid() >> 22);
                int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f2 = rV4669.g(capsMode, myPid, i2, -1316401137, "setPivotYN16904", new Class[]{cls, cls2, cls2, Function1.class, Integer.TYPE, Object.class});
            }
            List list = (List) component9.D8871((D8871) ((Method) f2).invoke(null, objArr), CollectionsKt.emptyList());
            int i3 = e;
            d = ((i3 & 89) + (i3 | 89)) % 128;
            return list;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
