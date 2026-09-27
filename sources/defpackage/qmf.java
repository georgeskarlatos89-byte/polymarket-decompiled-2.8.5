package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Size;
import android.view.View;
import android.view.Window;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.socure.docv.capturesdk.common.utils.CameraManager;
import com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e;
import com.socure.idplus.device.internal.thread.b;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiHelper;
import io.radar.sdk.RadarVerificationManager$trackVerified$continueWithConfig$1$2$onComplete$2$callTrackApi$1;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.n0;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class qmf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qmf(Window window, Window.Callback callback, Runnable runnable, n0 n0Var) {
        this.a = 13;
        this.b = window;
        this.c = callback;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex0 e;
        switch (this.a) {
            case 0:
                RadarApiHelper.f((RadarApiHelper.RadarApiCallback) this.b, (Exception) this.c, (RadarApiHelper.RadarImageApiCallback) this.d);
                return;
            case 1:
                RadarVerificationManager$trackVerified$continueWithConfig$1$2$onComplete$2$callTrackApi$1.AnonymousClass1.a((Radar.RadarStatus) this.b, (Radar.RadarTrackVerifiedCallback) this.c, (RadarVerifiedLocationToken) this.d);
                return;
            case 2:
                i0b i0bVar = (i0b) this.b;
                nx2 nx2Var = (nx2) this.c;
                ujb ujbVar = (ujb) this.d;
                Objects.toString(nx2Var);
                i0bVar.b.remove(ujbVar);
                return;
            case 3:
                ((bm9) this.b).j((vdi) this.c, (Map.Entry) this.d);
                return;
            case 4:
                qei qeiVar = (qei) this.b;
                lei leiVar = (lei) this.c;
                gy gyVar = (gy) this.d;
                pei peiVar = qeiVar.f;
                peiVar.a();
                if (peiVar.g) {
                    peiVar.g = false;
                    leiVar.c();
                    leiVar.i.a(null);
                    return;
                }
                peiVar.b = leiVar;
                peiVar.d = gyVar;
                Size size = leiVar.b;
                peiVar.a = size;
                peiVar.f = false;
                if (!peiVar.b()) {
                    o9n.e(3, "SurfaceViewImpl");
                    peiVar.h.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            case 5:
                VideoFileRenderer.a((VideoFileRenderer) this.b, (VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 6:
                sxg sxgVar = (sxg) this.b;
                cw2 cw2Var = (cw2) this.c;
                ex0 ex0Var = (ex0) this.d;
                if (!sxgVar.a) {
                    synchronized (((xrk) sxgVar.d)) {
                        ((xrk) sxgVar.d).e(1.0f);
                        e = ex0.e((xrk) sxgVar.d);
                    }
                    sxgVar.t(e);
                    cw2Var.b(new Exception("Camera is not active."));
                    return;
                }
                ((urk) sxgVar.f).x(ex0Var.a, cw2Var);
                ((px2) sxgVar.b).x();
                return;
            case 7:
                AFa1tSDK.g((AFa1tSDK) this.b, (Context) this.c, (Intent) this.d);
                return;
            case 8:
                AFd1wSDK.a((AFd1wSDK) this.b, (Throwable) this.c, (String) this.d);
                return;
            case 9:
                AFj1rSDK.e((AFj1rSDK) this.b, (AFi1aSDK) this.c, (Runnable) this.d);
                return;
            case 10:
                CameraManager.b((CameraManager) this.b, (ac3) this.c, (Function2) this.d);
                return;
            case 11:
                e.a((Ref.a) this.b, (e) this.c, (Context) this.d);
                return;
            case 12:
                b.a((Future) this.b, 1000L, TimeUnit.MILLISECONDS, (Function1) this.c, (Function1) this.d);
                return;
            default:
                Window window = (Window) this.b;
                Window.Callback callback = (Window.Callback) this.c;
                Runnable runnable = (Runnable) this.d;
                View peekDecorView = window.peekDecorView();
                if (peekDecorView != null) {
                    window.setCallback(callback);
                    peekDecorView.getViewTreeObserver().addOnDrawListener(new h(peekDecorView, runnable));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ qmf(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
