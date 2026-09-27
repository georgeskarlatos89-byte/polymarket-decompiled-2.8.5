package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.ykf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements ykf {
    public static boolean b() {
        if ("Nokia".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean c() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057")) {
            return true;
        }
        return false;
    }
}
