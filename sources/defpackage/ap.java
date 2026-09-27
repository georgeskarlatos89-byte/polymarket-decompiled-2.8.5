package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ap implements xo {
    public static volatile ap b;
    public final AppMeasurementSdk a;

    public ap(AppMeasurementSdk appMeasurementSdk) {
        arn.h(appMeasurementSdk);
        this.a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    public final void a(Bundle bundle, String str) {
        if (!yil.b.contains("fcm") && !yil.a.contains(str)) {
            wwf wwfVar = yil.c;
            int i = wwfVar.d;
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                boolean containsKey = bundle.containsKey((String) wwfVar.get(i3));
                i3++;
                if (containsKey) {
                    return;
                }
            }
            if ("_cmp".equals(str)) {
                if (!yil.b.contains("fcm")) {
                    wwf wwfVar2 = yil.c;
                    int i4 = wwfVar2.d;
                    while (i2 < i4) {
                        boolean containsKey2 = bundle.containsKey((String) wwfVar2.get(i2));
                        i2++;
                        if (containsKey2) {
                            return;
                        }
                    }
                    bundle.putString("_cis", "fcm_integration");
                } else {
                    return;
                }
            }
            this.a.logEvent("fcm", str, bundle);
        }
    }
}
