package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sne extends HandlerThread implements Handler.Callback {
    public v57 a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public tne e;

    public final void a(int i) {
        boolean z;
        boolean z2;
        int[] iArr;
        boolean z3;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z4;
        this.a.getClass();
        v57 v57Var = this.a;
        int[] iArr3 = v57Var.b;
        boolean z5 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        jrl.b("eglGetDisplay failed", z);
        int[] iArr4 = new int[2];
        jrl.b("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr4, 0, iArr4, 1));
        v57Var.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr5 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, v57.g, 0, eGLConfigArr, 0, 1, iArr5, 0);
        if (eglChooseConfig && iArr5[0] > 0 && eGLConfigArr[0] != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr5[0]), eGLConfigArr[0]};
        int i2 = u1k.a;
        jrl.b(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z2);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = v57Var.c;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        jrl.b("eglCreateContext failed", z3);
        v57Var.d = eglCreateContext;
        EGLDisplay eGLDisplay2 = v57Var.c;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            jrl.b("eglCreatePbufferSurface failed", z4);
        }
        jrl.b("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        v57Var.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr3, 0);
        jrl.a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        v57Var.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(v57Var);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        if (i != 0) {
            z5 = true;
        }
        this.e = new tne(this, surfaceTexture2, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        v57 v57Var = this.a;
        v57Var.a.removeCallbacks(v57Var);
        try {
            SurfaceTexture surfaceTexture = v57Var.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, v57Var.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = v57Var.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = v57Var.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = v57Var.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(v57Var.c, v57Var.e);
            }
            EGLContext eGLContext = v57Var.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(v57Var.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = v57Var.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(v57Var.c);
            }
            v57Var.c = null;
            v57Var.d = null;
            v57Var.e = null;
            v57Var.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            q7m.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
            } else {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    q7m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    q7m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (xv8 e3) {
                    q7m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
