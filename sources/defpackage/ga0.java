package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga0(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 1;
        this.b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((q1) obj).run();
                return;
            case 1:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new mf0((Context) obj, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                RenderSynchronizer.a((RenderSynchronizer) obj, j);
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    public /* synthetic */ ga0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
