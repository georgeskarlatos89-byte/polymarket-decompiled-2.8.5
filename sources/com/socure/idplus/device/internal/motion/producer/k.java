package com.socure.idplus.device.internal.motion.producer;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.socure.idplus.device.internal.motion.model.OrientationEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k extends c {
    public final Function0 h;
    public final float[] i;
    public final float[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.socure.idplus.device.internal.thread.e eVar, SensorManager sensorManager) {
        super(19, eVar, sensorManager, 11);
        j jVar = j.a;
        eVar.getClass();
        sensorManager.getClass();
        jVar.getClass();
        this.h = jVar;
        this.i = new float[9];
        this.j = new float[3];
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        try {
            SensorManager.getRotationMatrixFromVector(this.i, sensorEvent.values);
            SensorManager.getOrientation(this.i, this.j);
            double degrees = Math.toDegrees(this.j[0]);
            double degrees2 = Math.toDegrees(this.j[1]);
            double degrees3 = ((((Math.toDegrees(this.j[2]) + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            a(new OrientationEvent(((Number) this.h.invoke()).longValue(), (degrees + 360.0d) % 360.0d, -degrees2, degrees3));
        } catch (Exception e) {
            e.toString();
            com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
        }
    }
}
