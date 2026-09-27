package defpackage;

import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class lzf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ lzf(RenderSynchronizer renderSynchronizer, int i) {
        this.a = i;
        this.b = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (i) {
            case 0:
                RenderSynchronizer.b(renderSynchronizer);
                return;
            default:
                RenderSynchronizer.c(renderSynchronizer);
                return;
        }
    }
}
