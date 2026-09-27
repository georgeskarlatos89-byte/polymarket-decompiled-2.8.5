package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.odi;
import defpackage.pu7;
import defpackage.ykf;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements ykf {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size b(odi odiVar) {
        if (c()) {
            int i = pu7.a[odiVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new Size(3264, 1836);
                    }
                    return null;
                }
                return new Size(ConstantsKt.MIN_FRONT_CAMERA_WIDTH, ConstantsKt.MIN_FRONT_CAMERA_HEIGHT);
            }
            return new Size(1920, 1080);
        }
        return null;
    }

    public static boolean c() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.MODEL;
            Locale locale = Locale.US;
            String upperCase = str.toUpperCase(locale);
            HashMap hashMap = a;
            if (hashMap.containsKey(upperCase)) {
                Range range = (Range) hashMap.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }
}
