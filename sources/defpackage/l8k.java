package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l8k implements Choreographer.FrameCallback, Handler.Callback {
    public static final l8k e = new l8k();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;

    public l8k() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = u1k.a;
        Handler handler = new Handler(looper, this);
        this.b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Choreographer choreographer = this.c;
                if (choreographer != null) {
                    int i2 = this.d - 1;
                    this.d = i2;
                    if (i2 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.a = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.c;
            if (choreographer2 != null) {
                int i3 = this.d + 1;
                this.d = i3;
                if (i3 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.c = Choreographer.getInstance();
        } catch (RuntimeException e2) {
            q7m.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
        }
        return true;
    }
}
