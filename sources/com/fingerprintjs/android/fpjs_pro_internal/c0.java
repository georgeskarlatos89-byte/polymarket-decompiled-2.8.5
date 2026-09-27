package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Camera;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.r5g;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c0 {
    public static int a = 0;
    public static int b = 1;

    public static Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i5;
        int i9 = i2 | i8;
        int i10 = (~(i6 | i5)) | i2;
        int i11 = ~i6;
        int i12 = (~(i5 | i6 | i2)) | (~(i8 | i11)) | (~((~i2) | i11));
        int i13 = (23068672 * i3) + ((-2101346304) * i) + (543162368 * i4) + (1033423461 * i12) + ((-2066846922) * i10) + (i9 * 1033423461) + (1576585830 * i2) + (((-490261092) * i6) - 1772093440);
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i3, 1307081305, (1609234610 * i) + i6 + i2 + i4);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a2, -2011693056, ((-73506199) * i3) + ((-770635566) * i) + (273352337 * i4) + (i12 * 309) + (i10 * (-618)) + (i9 * 309) + (i2 * 273352646) + (i6 * 273352028) + 245730370, 1080557568, ((-2103967744) * a2) + i13) != 1) {
            int intValue = ((Number) objArr[0]).intValue();
            int i14 = a;
            int i15 = i14 + 67;
            int i16 = i15 % 128;
            b = i16;
            if (i15 % 2 != 0) {
                if (intValue != 0) {
                    if (intValue != 1) {
                        a = ((i16 ^ 89) + ((i16 & 89) << 1)) % 128;
                        return "";
                    }
                    return ApiConstant.DOCUMENT_FRONT;
                }
                int i17 = (i14 & 23) + (i14 | 23);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 58 / 0;
                }
                return ApiConstant.DOCUMENT_BACK;
            }
            throw null;
        }
        try {
            Object[] objArr2 = {0L, r0, r0, new Lambda(0), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f = rV4669.f(-308176489);
            if (f == null) {
                int keyCodeFromString = 1526 - KeyEvent.keyCodeFromString("");
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int i19 = 51 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f = rV4669.g(keyCodeFromString, c, i19, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) f).invoke(null, objArr2);
            List emptyList = CollectionsKt.emptyList();
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof r5g) {
                int i20 = a;
                int i21 = (i20 & 1) + (i20 | 1);
                int i22 = i21 % 128;
                b = i22;
                if (i21 % 2 != 0) {
                    i7 = i22;
                    invoke = emptyList;
                } else {
                    throw null;
                }
            } else {
                int i23 = a;
                i7 = (((i23 | 91) << 1) - (i23 ^ 91)) % 128;
                b = i7;
            }
            List list = (List) invoke;
            a = (i7 + 115) % 128;
            return list;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static LinkedList b() {
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        int i = a;
        b = ((i & 43) + (i | 43)) % 128;
        int i2 = 0;
        while (i2 < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i2, cameraInfo);
            Object[] objArr = {Integer.valueOf(cameraInfo.facing)};
            int a2 = kP9958.a();
            linkedList.add(new z2(String.valueOf(i2), (String) a(objArr, kP9958.a(), -155031312, kP9958.a(), kP9958.a(), a2, 155031312), String.valueOf(cameraInfo.orientation)));
            i2 = (i2 | 1) + (i2 & 1);
            b = (a + 21) % 128;
        }
        return linkedList;
    }
}
