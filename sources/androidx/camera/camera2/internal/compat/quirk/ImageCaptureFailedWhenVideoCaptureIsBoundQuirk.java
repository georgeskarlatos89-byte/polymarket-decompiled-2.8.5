package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.ykf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, ykf {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean a() {
        String str = Build.BRAND;
        if (!"blu".equalsIgnoreCase(str) || !"studio x10".equalsIgnoreCase(Build.MODEL)) {
            if (!"itel".equalsIgnoreCase(str) || !"itel w6004".equalsIgnoreCase(Build.MODEL)) {
                if (!"vivo".equalsIgnoreCase(str) || !"vivo 1805".equalsIgnoreCase(Build.MODEL)) {
                    if ("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
