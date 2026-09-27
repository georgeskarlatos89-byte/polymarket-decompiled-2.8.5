package defpackage;

import android.graphics.SurfaceTexture;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class lig implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lig(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((mig) obj).a.set(true);
                return;
            default:
                SurfaceTextureHelper.f((SurfaceTextureHelper) obj, surfaceTexture);
                return;
        }
    }
}
