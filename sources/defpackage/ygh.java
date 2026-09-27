package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import io.sentry.android.core.m0;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ygh implements GLSurfaceView.Renderer, zmd {
    public final mig a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final /* synthetic */ zgh k;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public ygh(zgh zghVar, mig migVar) {
        this.k = zghVar;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = migVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // defpackage.zmd
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object w;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        mig migVar = this.a;
        float[] fArr2 = this.c;
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            jrl.a();
        } catch (xv8 e) {
            q7m.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (migVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = migVar.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                jrl.a();
            } catch (xv8 e2) {
                q7m.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (migVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(migVar.g, 0);
            }
            long timestamp = migVar.j.getTimestamp();
            hj1 hj1Var = migVar.e;
            synchronized (hj1Var) {
                w = hj1Var.w(timestamp, false);
            }
            Long l = (Long) w;
            if (l != null) {
                af9 af9Var = migVar.d;
                float[] fArr3 = migVar.g;
                float[] fArr4 = (float[]) ((hj1) af9Var.e).y(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) af9Var.d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!af9Var.b) {
                        af9.l((float[]) af9Var.c, (float[]) af9Var.d);
                        af9Var.b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) af9Var.c, 0, (float[]) af9Var.d, 0);
                }
            }
            xaf xafVar = (xaf) migVar.f.y(timestamp);
            if (xafVar != null) {
                yaf yafVar = migVar.c;
                if (yaf.c(xafVar)) {
                    yafVar.a = xafVar.c;
                    yafVar.g = new hj1(xafVar.a.a[0]);
                    if (!xafVar.d) {
                        hj1 hj1Var2 = xafVar.b.a[0];
                        jrl.c((float[]) hj1Var2.d);
                        jrl.c((float[]) hj1Var2.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(migVar.h, 0, fArr2, 0, migVar.g, 0);
        yaf yafVar2 = migVar.c;
        int i = migVar.i;
        float[] fArr6 = migVar.h;
        hj1 hj1Var3 = (hj1) yafVar2.g;
        if (hj1Var3 != null) {
            int i2 = yafVar2.a;
            if (i2 == 1) {
                fArr = yaf.j;
            } else if (i2 == 2) {
                fArr = yaf.k;
            } else {
                fArr = yaf.i;
            }
            GLES20.glUniformMatrix3fv(yafVar2.c, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(yafVar2.b, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(yafVar2.f, 0);
            try {
                jrl.a();
            } catch (xv8 e3) {
                m0.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(yafVar2.d, 3, 5126, false, 12, (Buffer) hj1Var3.d);
            try {
                jrl.a();
            } catch (xv8 e4) {
                m0.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(yafVar2.e, 2, 5126, false, 8, (Buffer) hj1Var3.e);
            try {
                jrl.a();
            } catch (xv8 e5) {
                m0.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(hj1Var3.c, 0, hj1Var3.b);
            try {
                jrl.a();
            } catch (xv8 e6) {
                m0.e("ProjectionRenderer", "Failed to render", e6);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.b, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        zgh zghVar = this.k;
        SurfaceTexture b = this.a.b();
        int i = zgh.l;
        zghVar.e.post(new x6f(16, zghVar, b));
    }
}
