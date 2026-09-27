package io.intercom.android.sdk.utilities;

import android.text.TextUtils;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ImageUtils {
    public static int getAspectHeight(int i, double d) {
        return (int) (i * d);
    }

    public static double getAspectRatio(int i, int i2) {
        if (i2 == 0 || i == 0) {
            return 1.0d;
        }
        double d = (i2 * 1.0d) / i;
        if (Double.isNaN(d)) {
            return ConstantsKt.UNSET;
        }
        return d;
    }

    public static int getAspectWidth(int i, double d) {
        return (int) (i / d);
    }

    public static boolean isGif(String str) {
        if (!TextUtils.isEmpty(str) && str.endsWith(".gif")) {
            return true;
        }
        return false;
    }
}
