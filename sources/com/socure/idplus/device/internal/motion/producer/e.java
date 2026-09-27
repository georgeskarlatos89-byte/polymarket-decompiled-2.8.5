package com.socure.idplus.device.internal.motion.producer;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.socure.idplus.device.internal.motion.model.GyroscopeEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends c {
    public final Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.socure.idplus.device.internal.thread.e eVar, SensorManager sensorManager) {
        super(16, eVar, sensorManager, 4);
        d dVar = d.a;
        eVar.getClass();
        sensorManager.getClass();
        dVar.getClass();
        this.h = dVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        a(new GyroscopeEvent(((Number) this.h.invoke()).longValue(), Math.toDegrees(sensorEvent.values[0]), Math.toDegrees(sensorEvent.values[1]), -Math.toDegrees(sensorEvent.values[2])));
    }
}
