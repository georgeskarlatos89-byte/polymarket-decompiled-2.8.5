package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nv0 {
    public boolean a;
    public boolean b;

    public nv0(c80 c80Var, int i) {
        switch (i) {
            case 2:
                this.b = false;
                this.a = c80Var.f(AutoFlashUnderExposedQuirk.class) != null;
                return;
            case 3:
                Iterator it = c80Var.g(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                        }
                    } else {
                        r0 = false;
                    }
                }
                this.a = r0;
                this.b = c80Var.e(ImageCaptureFailedForVideoSnapshotQuirk.class);
                return;
            default:
                this.a = c80Var.e(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = pq6.a.f(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                return;
        }
    }

    public nv0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
