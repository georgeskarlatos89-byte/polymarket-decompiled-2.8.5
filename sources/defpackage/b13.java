package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.ArrayMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b13 {
    public final uhl a;
    public final ArrayMap b = new ArrayMap(4);

    public b13(uhl uhlVar) {
        this.a = uhlVar;
    }

    public final g03 a(String str) {
        g03 g03Var;
        synchronized (this.b) {
            try {
                g03Var = (g03) this.b.get(str);
                if (g03Var == null) {
                    try {
                        try {
                            g03 g03Var2 = new g03(((CameraManager) this.a.b).getCameraCharacteristics(str), str);
                            this.b.put(str, g03Var2);
                            g03Var = g03Var2;
                        } catch (CameraAccessException e) {
                            throw new pz2(e);
                        }
                    } catch (AssertionError e2) {
                        throw new pz2(e2.getMessage(), e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g03Var;
    }

    public final String[] b() {
        try {
            return ((CameraManager) this.a.b).getCameraIdList();
        } catch (CameraAccessException e) {
            throw new pz2(e);
        }
    }
}
