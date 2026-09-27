package defpackage;

import io.radar.sdk.fraud.RadarSDKFraud;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ur7 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ur7(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setDaemon(true);
                return newThread;
            case 1:
                return RadarSDKFraud.e(runnable);
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
