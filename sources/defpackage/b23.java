package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b23 implements yoi {
    public static final ow0 b = new ow0("camerax.core.appConfig.cameraFactoryProvider", ez2.class, null);
    public static final ow0 c = new ow0("camerax.core.appConfig.deviceSurfaceManagerProvider", fz2.class, null);
    public static final ow0 d = new ow0("camerax.core.appConfig.useCaseConfigFactoryProvider", gz2.class, null);
    public static final ow0 e = new ow0("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final ow0 f = new ow0("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final ow0 g;
    public static final ow0 h;
    public static final ow0 i;
    public static final ow0 j;
    public static final ow0 k;
    public static final ow0 l;
    public static final ow0 m;
    public final lld a;

    static {
        Class cls = Integer.TYPE;
        g = new ow0("camerax.core.appConfig.minimumLoggingLevel", cls, null);
        h = new ow0("camerax.core.appConfig.availableCamerasLimiter", k13.class, null);
        i = new ow0("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        j = new ow0("camerax.core.appConfig.cameraProviderInitRetryPolicy", s6g.class, null);
        k = new ow0("camerax.core.appConfig.quirksSettings", zkf.class, null);
        l = new ow0("camerax.core.appConfig.configImplType", cls, null);
        m = new ow0("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }

    public b23(lld lldVar) {
        this.a = lldVar;
    }

    public final k13 g() {
        return (k13) this.a.a(h, null);
    }

    @Override // defpackage.yof
    public final ws4 getConfig() {
        return this.a;
    }

    public final ez2 p() {
        return (ez2) this.a.a(b, null);
    }

    public final long s() {
        return ((Long) this.a.a(i, -1L)).longValue();
    }

    public final fz2 t() {
        return (fz2) this.a.a(c, null);
    }

    public final gz2 u() {
        return (gz2) this.a.a(d, null);
    }
}
