package com.socure.idplus.device.internal.motion.producer;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class c extends com.socure.idplus.device.internal.input.producer.a implements SensorEventListener {
    public final com.socure.idplus.device.internal.thread.e d;
    public final SensorManager e;
    public final int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, com.socure.idplus.device.internal.thread.e eVar, SensorManager sensorManager, int i2) {
        super(i, eVar);
        eVar.getClass();
        sensorManager.getClass();
        this.d = eVar;
        this.e = sensorManager;
        this.f = i2;
        this.g = 40000;
    }

    public final void a() {
        boolean z;
        Sensor defaultSensor = this.e.getDefaultSensor(this.f);
        if (defaultSensor != null) {
            Handler handler = this.d.b;
            if (handler == null) {
                com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
                return;
            }
            this.c = true;
            try {
                z = this.e.registerListener(this, defaultSensor, this.g, handler);
            } catch (Exception e) {
                e.toString();
                com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
                z = false;
            }
            if (!z) {
                this.c = false;
            }
        }
    }

    public final void b() {
        try {
            this.e.unregisterListener(this);
        } catch (Exception e) {
            e.toString();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
        }
        this.c = false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        sensor.getClass();
    }
}
