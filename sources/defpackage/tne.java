package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tne extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final sne b;
    public boolean c;

    public tne(sne sneVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = sneVar;
        this.a = z;
    }

    public static synchronized boolean e(Context context) {
        boolean z;
        String eglQueryString;
        boolean z2;
        int i;
        synchronized (tne.class) {
            try {
                z = false;
                if (!e) {
                    int i2 = u1k.a;
                    if (i2 >= 24 && ((i2 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        d = i;
                        e = true;
                    }
                    i = 0;
                    d = i;
                    e = true;
                }
                if (d != 0) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    sne sneVar = this.b;
                    sneVar.b.getClass();
                    sneVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
