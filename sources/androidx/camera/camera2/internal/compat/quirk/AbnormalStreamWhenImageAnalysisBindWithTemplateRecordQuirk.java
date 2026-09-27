package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean a() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && Build.DEVICE.equalsIgnoreCase("m55xq")) {
            return true;
        }
        return false;
    }
}
