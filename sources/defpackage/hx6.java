package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import io.radar.sdk.RadarUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hx6 {
    public static final uk b = new uk("RESUME_TOKEN", 8);
    public final /* synthetic */ int a = 0;

    public static String a(boolean z) {
        if (z) {
            return UUID.randomUUID().toString();
        }
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String b(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Boolean bool : boolArr) {
            if (bool.booleanValue()) {
                sb.append(ModuleRequestExtKt.CAPTURE_DELTA);
            } else if (!bool.booleanValue()) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static JSONObject c(Sensor sensor) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(nvk.NAME.toString(), sensor.getName());
        jSONObject.put(nvk.VENDOR.toString(), sensor.getVendor());
        jSONObject.put(nvk.POWER.toString(), String.format("%.8f", Float.valueOf(sensor.getPower())));
        jSONObject.put(nvk.VERSION.toString(), String.valueOf(sensor.getVersion()));
        jSONObject.put(nvk.RESOLUTION.toString(), String.format("%.8f", Float.valueOf(sensor.getResolution())));
        jSONObject.put(nvk.MAX_RANGE.toString(), String.format("%.8f", Float.valueOf(sensor.getMaximumRange())));
        jSONObject.put(nvk.FIFO_MAX_EVENT_COUNT.toString(), String.valueOf(sensor.getFifoMaxEventCount()));
        return jSONObject;
    }

    public static void d(Context context, HashMap hashMap) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String packageName = context.getPackageName();
        String str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        if (!g("5.6.0.release")) {
            hashMap.put("comp_version", "5.6.0.release");
        }
        if (!g(str)) {
            hashMap.put("os_version", str);
        }
        if (!g(RadarUtils.deviceType)) {
            hashMap.put("os_type", RadarUtils.deviceType);
        }
        if (!g(str2)) {
            hashMap.put("device_model", str2);
        }
        if (!g(packageName)) {
            hashMap.put("app_id", packageName);
        }
        if (!g(str3)) {
            hashMap.put("app_version", str3);
        }
    }

    public static void e(Class cls, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                wsk.b(cls.getClass(), e);
            }
        }
    }

    public static ArrayList f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(String.valueOf(jSONArray.get(i)));
            }
        }
        return arrayList;
    }

    public static boolean g(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                return ((String) obj).isEmpty();
            }
            if (obj instanceof Long) {
                if (((Long) obj).longValue() != 0) {
                    return false;
                }
                return true;
            }
            if ((obj instanceof Integer) && ((Integer) obj).intValue() != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final void h(sr8 sr8Var, Function2 function2) {
        function2.getClass();
        hhj.e(2, function2);
        function2.invoke(sr8Var, 1);
    }
}
