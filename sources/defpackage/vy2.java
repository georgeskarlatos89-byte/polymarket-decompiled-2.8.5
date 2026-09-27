package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vy2 implements ox2 {
    public final cw2 a;
    public final gw2 b;
    public final uy2 c;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c3g, java.lang.Object] */
    public vy2(uy2 uy2Var) {
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        try {
            this.a = obj;
            obj.a = "waitFor3AResult";
        } catch (Exception e) {
            gw2Var.a(e);
        }
        this.b = gw2Var;
        this.c = uy2Var;
    }

    @Override // defpackage.ox2
    public final boolean g(TotalCaptureResult totalCaptureResult) {
        uy2 uy2Var = this.c;
        if (uy2Var != null && !uy2Var.b(totalCaptureResult)) {
            return false;
        }
        this.a.a(totalCaptureResult);
        return true;
    }
}
