package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vf8 {
    public static final MeteringRectangle[] l = new MeteringRectangle[0];
    public final px2 a;
    public final vwg b;
    public volatile boolean c = false;
    public int d = 1;
    public uf8 e = null;
    public MeteringRectangle[] f;
    public MeteringRectangle[] g;
    public MeteringRectangle[] h;
    public cw2 i;
    public boolean j;
    public tf8 k;

    public vf8(px2 px2Var, vwg vwgVar) {
        MeteringRectangle[] meteringRectangleArr = l;
        this.f = meteringRectangleArr;
        this.g = meteringRectangleArr;
        this.h = meteringRectangleArr;
        this.i = null;
        this.j = false;
        this.k = null;
        this.a = px2Var;
        this.b = vwgVar;
    }

    public final void a(boolean z, boolean z2) {
        if (!this.c) {
            return;
        }
        bz2 bz2Var = new bz2();
        bz2Var.c = true;
        bz2Var.a = this.d;
        wpc p = wpc.p();
        if (z) {
            p.u(jz2.D(CaptureRequest.CONTROL_AF_TRIGGER), 2);
        }
        if (z2) {
            p.u(jz2.D(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
        }
        bz2Var.c(new uhl(lld.g(p), 17));
        this.a.w(Collections.singletonList(bz2Var.e()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [uf8, ox2] */
    public final void b(cw2 cw2Var) {
        uf8 uf8Var = this.e;
        px2 px2Var = this.a;
        nx2 nx2Var = px2Var.b;
        ((HashSet) nx2Var.b).remove(uf8Var);
        cw2 cw2Var2 = this.i;
        if (cw2Var2 != null) {
            cw2Var2.b(new Exception("Cancelled by another cancelFocusAndMetering()"));
            this.i = null;
        }
        ((HashSet) nx2Var.b).remove(null);
        this.i = cw2Var;
        if (this.f.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = l;
        this.f = meteringRectangleArr;
        this.g = meteringRectangleArr;
        this.h = meteringRectangleArr;
        final long x = px2Var.x();
        if (this.i != null) {
            int i = 3;
            if (this.d != 3) {
                i = 4;
            }
            final int q = px2Var.q(i);
            ?? r0 = new ox2() { // from class: uf8
                @Override // defpackage.ox2
                public final boolean g(TotalCaptureResult totalCaptureResult) {
                    if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == q && px2.t(totalCaptureResult, x)) {
                        vf8 vf8Var = vf8.this;
                        cw2 cw2Var3 = vf8Var.i;
                        if (cw2Var3 != null) {
                            cw2Var3.a(null);
                            vf8Var.i = null;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            };
            this.e = r0;
            px2Var.l(r0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [c3g, java.lang.Object] */
    public final ujb c(boolean z) {
        if (px2.p(this.a.e, 5) != 5) {
            return nq9.c;
        }
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        obj.a = ix2.class;
        try {
            this.b.execute(new rf8(this, z, obj, 0));
            obj.a = "enableExternalFlashAeMode";
            return gw2Var;
        } catch (Exception e) {
            gw2Var.a(e);
            return gw2Var;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c3g, java.lang.Object] */
    public final gw2 d() {
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        obj.a = ix2.class;
        try {
            this.b.execute(new sf8(this, obj, 0));
            obj.a = "triggerAePrecapture";
            return gw2Var;
        } catch (Exception e) {
            gw2Var.a(e);
            return gw2Var;
        }
    }

    public final void e(cw2 cw2Var) {
        o9n.e(3, "FocusMeteringControl");
        if (!this.c) {
            cw2Var.b(new Exception("Camera is not active."));
            return;
        }
        bz2 bz2Var = new bz2();
        bz2Var.a = this.d;
        bz2Var.c = true;
        wpc p = wpc.p();
        p.u(jz2.D(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        bz2Var.c(new uhl(lld.g(p), 17));
        bz2Var.b(new ry2(cw2Var, 1));
        this.a.w(Collections.singletonList(bz2Var.e()));
    }
}
