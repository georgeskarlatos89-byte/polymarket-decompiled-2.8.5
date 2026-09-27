package defpackage;

import org.webrtc.EglThread;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class c77 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EglThread b;

    public /* synthetic */ c77(EglThread eglThread, int i) {
        this.a = i;
        this.b = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EglThread eglThread = this.b;
        switch (i) {
            case 0:
                EglThread.d(eglThread);
                return;
            default:
                EglThread.c(eglThread);
                return;
        }
    }
}
