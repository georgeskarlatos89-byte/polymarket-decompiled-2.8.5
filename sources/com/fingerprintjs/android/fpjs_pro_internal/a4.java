package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a4 implements SensorEventListener {
    public static int c = 0;
    public static int d = 1;
    public /* synthetic */ CountDownLatch a;
    public /* synthetic */ LinkedList b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = c;
        d = ((i2 & 19) + (i2 | 19)) % 128;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i = d;
        c = ((i & 45) + (i | 45)) % 128;
        this.a.countDown();
        float[] fArr = null;
        if (sensorEvent != null) {
            int i2 = d;
            int i3 = (i2 & 89) + (i2 | 89);
            c = i3 % 128;
            int i4 = i3 % 2;
            float[] fArr2 = sensorEvent.values;
            if (i4 == 0) {
                c = ((i2 ^ 13) + ((i2 & 13) << 1)) % 128;
                fArr = fArr2;
            } else {
                throw null;
            }
        }
        if (fArr == null) {
            int i5 = d;
            int i6 = (i5 & 83) + (i5 | 83);
            c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 42 / 0;
                return;
            }
            return;
        }
        this.b.add(CollectionsKt.listOf(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2])));
    }
}
