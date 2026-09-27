package defpackage;

import android.util.Range;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface pyj extends yoi, co9 {
    public static final ow0 O0 = new ow0("camerax.core.useCase.defaultSessionConfig", qyg.class, null);
    public static final ow0 P0 = new ow0("camerax.core.useCase.defaultCaptureConfig", g33.class, null);
    public static final ow0 Q0 = new ow0("camerax.core.useCase.sessionConfigUnpacker", mz2.class, null);
    public static final ow0 R0 = new ow0("camerax.core.useCase.captureConfigUnpacker", jy2.class, null);
    public static final ow0 S0;
    public static final ow0 T0;
    public static final ow0 U0;
    public static final ow0 V0;
    public static final ow0 W0;
    public static final ow0 X0;
    public static final ow0 Y0;
    public static final ow0 Z0;
    public static final ow0 a1;
    public static final ow0 b1;
    public static final ow0 c1;

    static {
        Class cls = Integer.TYPE;
        S0 = new ow0("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        T0 = new ow0("camerax.core.useCase.sessionType", cls, null);
        U0 = new ow0("camerax.core.useCase.targetFrameRate", Range.class, null);
        V0 = new ow0("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Class cls2 = Boolean.TYPE;
        W0 = new ow0("camerax.core.useCase.zslDisabled", cls2, null);
        X0 = new ow0("camerax.core.useCase.highResolutionDisabled", cls2, null);
        Y0 = new ow0("camerax.core.useCase.captureType", ryj.class, null);
        Z0 = new ow0("camerax.core.useCase.previewStabilizationMode", cls, null);
        a1 = new ow0("camerax.core.useCase.videoStabilizationMode", cls, null);
        b1 = new ow0("camerax.core.useCase.takePictureManagerProvider", nyj.class, null);
        c1 = new ow0("camerax.core.useCase.streamUseCase", p0i.class, null);
    }

    default int m() {
        return ((Integer) a(Z0, 0)).intValue();
    }

    default p0i q() {
        p0i p0iVar = (p0i) a(c1, p0i.DEFAULT);
        Objects.requireNonNull(p0iVar);
        return p0iVar;
    }

    default ryj r() {
        return (ryj) h(Y0);
    }
}
