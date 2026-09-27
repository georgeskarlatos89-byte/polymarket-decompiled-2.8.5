package com.socure.idplus.device.internal.motion.producer;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.socure.idplus.device.internal.motion.model.AccelerometerEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends c {
    public final Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.socure.idplus.device.internal.thread.e eVar, SensorManager sensorManager) {
        super(15, eVar, sensorManager, 1);
        a aVar = a.a;
        eVar.getClass();
        sensorManager.getClass();
        aVar.getClass();
        this.h = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        long longValue = ((Number) this.h.invoke()).longValue();
        float[] fArr = sensorEvent.values;
        a(new AccelerometerEvent(longValue, fArr[0], fArr[1], fArr[2]));
    }
}
