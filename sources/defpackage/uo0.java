package defpackage;

import android.os.HandlerThread;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class uo0 implements gci {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ uo0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.gci
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new HandlerThread(vo0.k(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(vo0.k(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
