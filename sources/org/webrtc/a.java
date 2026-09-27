package org.webrtc;

import org.webrtc.Camera2Session;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements VideoSink {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Camera1Session.a((Camera1Session) obj, videoFrame);
                return;
            default:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) obj, videoFrame);
                return;
        }
    }
}
