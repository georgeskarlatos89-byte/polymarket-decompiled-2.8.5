package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface no9 extends yof {
    public static final ow0 A0;
    public static final ow0 r0 = new ow0("camerax.core.imageOutput.targetAspectRatio", yl0.class, null);
    public static final ow0 s0;
    public static final ow0 t0;
    public static final ow0 u0;
    public static final ow0 v0;
    public static final ow0 w0;
    public static final ow0 x0;
    public static final ow0 y0;
    public static final ow0 z0;

    static {
        Class cls = Integer.TYPE;
        s0 = new ow0("camerax.core.imageOutput.targetRotation", cls, null);
        t0 = new ow0("camerax.core.imageOutput.appTargetRotation", cls, null);
        u0 = new ow0("camerax.core.imageOutput.mirrorMode", cls, null);
        v0 = new ow0("camerax.core.imageOutput.targetResolution", Size.class, null);
        w0 = new ow0("camerax.core.imageOutput.defaultResolution", Size.class, null);
        x0 = new ow0("camerax.core.imageOutput.maxResolution", Size.class, null);
        y0 = new ow0("camerax.core.imageOutput.supportedResolutions", List.class, null);
        z0 = new ow0("camerax.core.imageOutput.resolutionSelector", y2g.class, null);
        A0 = new ow0("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void n(no9 no9Var) {
        boolean z;
        boolean e = no9Var.e(r0);
        if (((Size) no9Var.a(v0, null)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (e && z) {
            dmk.v("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((y2g) no9Var.a(z0, null)) != null) {
            if (e || z) {
                dmk.v("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int k() {
        return ((Integer) a(s0, 0)).intValue();
    }
}
