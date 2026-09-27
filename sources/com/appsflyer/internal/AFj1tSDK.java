package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1tSDK implements SensorEventListener {
    private final int AFAdRevenueData;
    private long component1;
    private final Executor component4;
    private double getCurrencyIso4217Code;
    private final String getMediationNetwork;
    private final String getMonetizationNetwork;
    private final int getRevenue;
    private final float[][] component2 = new float[2];
    private final long[] areAllFieldsValid = new long[2];

    public AFj1tSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.AFAdRevenueData = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getMediationNetwork = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getRevenue = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.component4 = executorService;
    }

    private boolean AFAdRevenueData(int i, String str, String str2) {
        if (this.AFAdRevenueData == i && this.getMediationNetwork.equals(str) && this.getMonetizationNetwork.equals(str2)) {
            return true;
        }
        return false;
    }

    private void F_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component2;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component2[1] = copyOf;
            this.areAllFieldsValid[1] = currentTimeMillis;
            this.getCurrencyIso4217Code = getCurrencyIso4217Code(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.component1) {
            this.component1 = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = currentTimeMillis;
                return;
            }
            double currencyIso4217Code = getCurrencyIso4217Code(fArr3, fArr);
            if (currencyIso4217Code > this.getCurrencyIso4217Code) {
                this.component2[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = currentTimeMillis;
                this.getCurrencyIso4217Code = currencyIso4217Code;
            }
        }
    }

    private /* synthetic */ void G_(SensorEvent sensorEvent) {
        F_(sensorEvent);
    }

    public static /* synthetic */ void a(AFj1tSDK aFj1tSDK, SensorEvent sensorEvent) {
        aFj1tSDK.G_(sensorEvent);
    }

    private static double getCurrencyIso4217Code(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = ConstantsKt.UNSET;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFAdRevenueData));
        concurrentHashMap.put("sN", this.getMediationNetwork);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component2[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getMonetizationNetwork(fArr));
        }
        float[] fArr2 = this.component2[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getMonetizationNetwork(fArr2));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFj1tSDK) {
            AFj1tSDK aFj1tSDK = (AFj1tSDK) obj;
            return AFAdRevenueData(aFj1tSDK.AFAdRevenueData, aFj1tSDK.getMediationNetwork, aFj1tSDK.getMonetizationNetwork);
        }
        return false;
    }

    public final void getMediationNetwork(Map<AFj1tSDK, Map<String, Object>> map, boolean z) {
        if (getMediationNetwork()) {
            map.put(this, getMonetizationNetwork());
            if (z) {
                int length = this.component2.length;
                for (int i = 0; i < length; i++) {
                    this.component2[i] = null;
                }
                int length2 = this.areAllFieldsValid.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.areAllFieldsValid[i2] = 0;
                }
                this.getCurrencyIso4217Code = ConstantsKt.UNSET;
                this.component1 = 0L;
                return;
            }
            return;
        }
        if (!map.containsKey(this)) {
            map.put(this, getMonetizationNetwork());
        }
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component4.execute(new g(5, this, sensorEvent));
        } else {
            F_(sensorEvent);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private static List<Float> getMonetizationNetwork(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    private boolean getMediationNetwork() {
        return this.component2[0] != null;
    }
}
