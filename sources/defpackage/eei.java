package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eei implements Closeable {
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public final float[] f;
    public l05 g;
    public Executor h;
    public final gw2 k;
    public final cw2 l;
    public final Object a = new Object();
    public boolean i = false;
    public boolean j = false;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [c3g, java.lang.Object] */
    public eei(Surface surface, int i, Size size, ey0 ey0Var, ey0 ey0Var2) {
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        this.b = surface;
        this.c = i;
        this.d = size;
        e(fArr, new float[16], ey0Var);
        e(fArr2, new float[16], ey0Var2);
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        try {
            this.l = obj;
            obj.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            gw2Var.a(e);
        }
        this.k = gw2Var;
    }

    public static void e(float[] fArr, float[] fArr2, ey0 ey0Var) {
        Matrix.setIdentityM(fArr, 0);
        if (ey0Var == null) {
            return;
        }
        Size size = ey0Var.a;
        boolean z = ey0Var.e;
        int i = ey0Var.d;
        sfn.c(fArr);
        sfn.b(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix a = kbj.a(kbj.h(size), kbj.h(kbj.g(size, i)), i, z);
        RectF rectF = new RectF(ey0Var.b);
        a.mapRect(rectF);
        float width = rectF.left / r7.getWidth();
        float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
        float width2 = rectF.width() / r7.getWidth();
        float height2 = rectF.height() / r7.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        a13 a13Var = ey0Var.c;
        Matrix.setIdentityM(fArr2, 0);
        sfn.c(fArr2);
        if (a13Var != null) {
            grn.g("Camera has no transform.", a13Var.q());
            sfn.b(fArr2, a13Var.b().e());
            if (a13Var.k()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.j) {
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.l.a(null);
    }

    public final Surface g(y39 y39Var, l05 l05Var) {
        boolean z;
        synchronized (this.a) {
            this.h = y39Var;
            this.g = l05Var;
            z = this.i;
        }
        if (z) {
            o();
        }
        return this.b;
    }

    public final void o() {
        Executor executor;
        l05 l05Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.h != null && (l05Var = this.g) != null) {
                    if (!this.j) {
                        atomicReference.set(l05Var);
                        executor = this.h;
                        this.i = false;
                    }
                    executor = null;
                }
                this.i = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new x6f(18, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                o9n.e(3, "SurfaceOutputImpl");
            }
        }
    }
}
