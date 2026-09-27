package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tzk extends nwk implements SensorEventListener {
    public static final AtomicInteger i = new AtomicInteger(0);
    public final Sensor a;
    public final SensorManager b;
    public JSONObject c;
    public JSONArray d;
    public final Handler e;
    public JSONArray f;
    public final int g;
    public long h = 0;

    public tzk(Context context, dxk dxkVar, int i2) {
        this.e = dxkVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        this.g = i2;
        this.a = sensorManager.getDefaultSensor(i2);
    }

    public final void b() {
        this.c = new JSONObject();
        this.f = new JSONArray();
        this.d = new JSONArray();
        a();
    }

    public final JSONObject c() {
        Sensor sensor = this.a;
        if (sensor == null) {
            return new JSONObject();
        }
        this.b.unregisterListener(this, sensor);
        AtomicInteger atomicInteger = i;
        if (atomicInteger != null && atomicInteger.get() > 0) {
            atomicInteger.getAndDecrement();
        }
        try {
            this.c.put(fvk.SENSOR_PAYLOAD.toString(), this.f);
            this.d.put(this.c);
        } catch (JSONException e) {
            wsk.b(tzk.class, e);
        }
        return this.c;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.h > 25 && this.f.length() < 150) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(String.valueOf(sensorEvent.values[0]));
            jSONArray.put(String.valueOf(sensorEvent.values[1]));
            jSONArray.put(String.valueOf(sensorEvent.values[2]));
            jSONArray.put(currentTimeMillis);
            this.f.put(jSONArray);
            this.h = currentTimeMillis;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.e;
        if (handler != null) {
            SensorManager sensorManager = this.b;
            Sensor sensor = this.a;
            if (sensor != null) {
                try {
                    AtomicInteger atomicInteger = i;
                    if (atomicInteger != null && atomicInteger.get() < 120) {
                        sensorManager.registerListener(this, sensor, 50000, handler);
                        atomicInteger.getAndIncrement();
                        JSONObject c = hx6.c(sensor);
                        JSONObject jSONObject = this.c;
                        Iterator<String> keys = c.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!jSONObject.has(next)) {
                                try {
                                    jSONObject.put(next, c.opt(next));
                                } catch (JSONException e) {
                                    wsk.b(hx6.class, e);
                                }
                            }
                        }
                        this.c = jSONObject;
                        int i2 = this.g;
                        if (i2 == 1) {
                            jSONObject.put(fvk.SENSOR_TYPE.toString(), dwk.AC.toString());
                        }
                        if (i2 == 4) {
                            this.c.put(fvk.SENSOR_TYPE.toString(), dwk.GY.toString());
                        }
                        if (i2 == 2) {
                            this.c.put(fvk.SENSOR_TYPE.toString(), dwk.MG.toString());
                        }
                    }
                } catch (JSONException e2) {
                    wsk.b(tzk.class, e2);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }
}
