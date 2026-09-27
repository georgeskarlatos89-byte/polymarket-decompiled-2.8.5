package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g03 {
    public final jw8 b;
    public final String c;
    public final HashMap a = new HashMap();
    public bm9 d = null;

    public g03(CameraCharacteristics cameraCharacteristics, String str) {
        this.b = new jw8(cameraCharacteristics, 16);
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.b.b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.b.b).get(key);
                if (obj2 != null) {
                    this.a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b() {
        Integer num;
        if (d() && Build.VERSION.SDK_INT >= 35) {
            num = (Integer) a(so0.d());
        } else {
            num = null;
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final bm9 c() {
        bm9 bm9Var = this.d;
        if (bm9Var == null) {
            bm9Var = null;
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    bm9 bm9Var2 = new bm9(streamConfigurationMap, new ss9(this.c, 20));
                    this.d = bm9Var2;
                    return bm9Var2;
                }
                dmk.v("StreamConfigurationMap is null!");
                return null;
            } catch (AssertionError | NullPointerException e) {
                dmk.v(e.getMessage());
            }
        }
        return bm9Var;
    }

    public final boolean d() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
