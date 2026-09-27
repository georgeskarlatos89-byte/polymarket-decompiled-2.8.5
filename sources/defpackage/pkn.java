package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class pkn {
    public static boolean a(b13 b13Var, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) b13Var.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (pz2 e) {
            throw new Exception(new Exception(e));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b3j, java.lang.Object] */
    public static final jo0 b(InputStream inputStream) {
        inputStream.getClass();
        return new jo0(inputStream, (b3j) new Object());
    }
}
