package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eqg extends hn9 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ qqc d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ qqc f;
    public final /* synthetic */ Function1 g;

    public eqg(boolean z, Function1 function1, Function1 function12, qqc qqcVar, Function1 function13, qqc qqcVar2, Function1 function14) {
        this.a = z;
        this.b = function1;
        this.c = function12;
        this.d = qqcVar;
        this.e = function13;
        this.f = qqcVar2;
        this.g = function14;
    }

    @Override // defpackage.hn9
    public final void onCaptureSuccess(to9 to9Var) {
        to9Var.getClass();
        int c = to9Var.P0().c();
        Bitmap c2 = h8m.c(to9Var);
        to9Var.close();
        boolean z = this.a;
        if (c != 0 || z) {
            Matrix matrix = new Matrix();
            if (c != 0) {
                matrix.postRotate(c);
            }
            if (z) {
                matrix.postScale(-1.0f, 1.0f);
            }
            Bitmap createBitmap = Bitmap.createBitmap(c2, 0, 0, c2.getWidth(), c2.getHeight(), matrix, false);
            if (createBitmap != c2) {
                c2.recycle();
            }
            c2 = createBitmap;
        }
        c2.getClass();
        this.b.invoke(c2);
        this.c.invoke(this.d.getValue());
        this.e.invoke(this.f.getValue());
    }

    @Override // defpackage.hn9
    public final void onError(ln9 ln9Var) {
        String message = ln9Var.getMessage();
        if (message == null) {
            message = "Capture failed";
        }
        this.g.invoke(message);
    }
}
