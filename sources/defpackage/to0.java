package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class to0 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6c b;

    public /* synthetic */ to0(k6c k6cVar, y6c y6cVar, int i) {
        this.a = i;
        this.b = y6cVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        y6c y6cVar = this.b;
        switch (i) {
            case 0:
                Handler handler = y6cVar.a;
                if (u1k.a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    y6cVar.a(j);
                    return;
                }
            default:
                Handler handler2 = y6cVar.a;
                if (u1k.a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    y6cVar.a(j);
                    return;
                }
        }
    }
}
