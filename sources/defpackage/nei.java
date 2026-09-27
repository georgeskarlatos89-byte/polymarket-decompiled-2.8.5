package defpackage;

import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class nei implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ nei(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.a = i;
        this.b = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (i) {
            case 0:
                SurfaceTextureHelper.a(surfaceTextureHelper);
                return;
            case 1:
                SurfaceTextureHelper.d(surfaceTextureHelper);
                return;
            case 2:
                SurfaceTextureHelper.c(surfaceTextureHelper);
                return;
            default:
                SurfaceTextureHelper.e(surfaceTextureHelper);
                return;
        }
    }
}
