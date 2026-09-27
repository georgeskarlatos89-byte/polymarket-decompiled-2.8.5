package com.socure.idplus.device.internal.motion.producer;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.socure.idplus.device.internal.motion.model.MagnetometerEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i extends c {
    public final Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.socure.idplus.device.internal.thread.e eVar, SensorManager sensorManager) {
        super(17, eVar, sensorManager, 2);
        h hVar = h.a;
        eVar.getClass();
        sensorManager.getClass();
        hVar.getClass();
        this.h = hVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        long longValue = ((Number) this.h.invoke()).longValue();
        float[] fArr = sensorEvent.values;
        a(new MagnetometerEvent(longValue, fArr[0], fArr[1], fArr[2]));
    }
}
