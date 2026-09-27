package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xl {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public xl(CameraManager cameraManager, String str) {
        this.b = so0.e(cameraManager, str);
    }

    public final dm0 a(SessionConfiguration sessionConfiguration) {
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    dm0 a = ((xl) it.next()).a(sessionConfiguration);
                    if (a.b != 0) {
                        return a;
                    }
                }
                return new dm0(0, 4);
            default:
                if (so0.s((CameraDevice.CameraDeviceSetup) obj, sessionConfiguration)) {
                    i = 1;
                } else {
                    i = 2;
                }
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new dm0(i, 4);
        }
    }

    public xl(ArrayList arrayList) {
        this.b = arrayList;
    }
}
