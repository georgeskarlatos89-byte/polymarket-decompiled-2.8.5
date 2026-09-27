package com.socure.idplus.device.internal.motion.producer;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.socure.idplus.device.internal.motion.model.LinearAccelerometerEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g extends c {
    public final Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.socure.idplus.device.internal.thread.e eVar, SensorManager sensorManager) {
        super(18, eVar, sensorManager, 10);
        f fVar = f.a;
        eVar.getClass();
        sensorManager.getClass();
        fVar.getClass();
        this.h = fVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        long longValue = ((Number) this.h.invoke()).longValue();
        float[] fArr = sensorEvent.values;
        a(new LinearAccelerometerEvent(longValue, fArr[0], fArr[1], fArr[2]));
    }
}
