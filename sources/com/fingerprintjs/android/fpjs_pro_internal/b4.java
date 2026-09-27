package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b4 implements q5 {
    public static int c = 0;
    public static int d = 1;
    public final SensorManager a;
    public final unregisterForContextMenu b;

    public b4(SensorManager sensorManager, unregisterForContextMenu unregisterforcontextmenu) {
        this.a = sensorManager;
        this.b = unregisterforcontextmenu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.fingerprintjs.android.fpjs_pro_internal.a4, java.lang.Object, android.hardware.SensorEventListener] */
    public static Object a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        List list;
        int i7 = (~(i4 | i6)) | i3;
        int i8 = (~((~i6) | i4)) | i3;
        int i9 = (-1603099839) * i8;
        int i10 = i9 + (i7 * (-1603099839)) + ((-1421434046) * i4) + ((-907101825) * i3) + 1075183616;
        int i11 = (~i3) | i4;
        int i12 = ((-180879360) * i2) + (780402688 * i5) + (181665792 * i) + (1603099839 * i11) + i10;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i2, -634449194, (440753341 * i5) + i3 + i4 + i);
        int i13 = i7 * (-717);
        int i14 = i8 * (-717);
        int i15 = i11 * 717;
        int i16 = i * 892200819;
        int i17 = i5 * (-770690073);
        int i18 = i2 * 448958498;
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 1390542848, i18 + i17 + i16 + i15 + i14 + i13 + (i4 * 892200102) + (i3 * 892202253) + 1676176333, -1042677760, (353763328 * a) + i12) != 1) {
            b4 b4Var = (b4) objArr[0];
            int i19 = c + 89;
            int i20 = i19 % 128;
            d = i20;
            int i21 = i19 % 2;
            unregisterForContextMenu unregisterforcontextmenu = b4Var.b;
            if (i21 != 0) {
                c = (((i20 | 37) << 1) - (i20 ^ 37)) % 128;
                return unregisterforcontextmenu;
            }
            throw null;
        }
        b4 b4Var2 = (b4) objArr[0];
        Sensor sensor = (Sensor) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        long longValue = ((Number) objArr[3]).longValue();
        int intValue2 = ((Number) objArr[4]).intValue();
        int i22 = (c + 53) % 128;
        d = i22;
        SensorManager sensorManager = b4Var2.a;
        int i23 = i22 + 25;
        int i24 = i23 % 128;
        c = i24;
        if (i23 % 2 == 0) {
            if (sensor == null) {
                int i25 = ((i24 | 51) << 1) - (i24 ^ 51);
                d = i25 % 128;
                if (i25 % 2 == 0) {
                    list = CollectionsKt.emptyList();
                    int i26 = 31 / 0;
                } else {
                    list = CollectionsKt.emptyList();
                }
            } else if (sensorManager == 0) {
                c = ((i22 & 65) + (i22 | 65)) % 128;
                list = CollectionsKt.emptyList();
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(intValue);
                LinkedList linkedList = new LinkedList();
                ?? obj = new Object();
                obj.a = countDownLatch;
                obj.b = linkedList;
                sensorManager.registerListener((SensorEventListener) obj, sensor, intValue2);
                try {
                    countDownLatch.await(longValue, TimeUnit.MILLISECONDS);
                    d = (c + 113) % 128;
                } catch (InterruptedException unused) {
                }
                sensorManager.unregisterListener((SensorEventListener) obj);
                list = linkedList;
            }
            c = (d + 75) % 128;
            return list;
        }
        throw null;
    }
}
