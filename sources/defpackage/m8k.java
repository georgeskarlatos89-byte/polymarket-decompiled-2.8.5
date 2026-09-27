package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m8k {
    public final g68 a;
    public final k8k b;
    public final l8k c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Type inference failed for: r0v0, types: [g68, java.lang.Object] */
    public m8k(Context context) {
        DisplayManager displayManager;
        k8k k8kVar;
        ?? obj = new Object();
        obj.a = new f68();
        obj.b = new f68();
        obj.d = -9223372036854775807L;
        this.a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            k8kVar = null;
        } else {
            k8kVar = new k8k(this, displayManager);
        }
        this.b = k8kVar;
        this.c = k8kVar != null ? l8k.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (u1k.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            try {
                surface.setFrameRate(0.0f, 0);
            } catch (IllegalStateException e) {
                q7m.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public final void b(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            q7m.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f;
        float f2;
        long j;
        if (u1k.a >= 30 && this.e != null) {
            g68 g68Var = this.a;
            if (g68Var.a.a()) {
                if (g68Var.a.a()) {
                    f68 f68Var = g68Var.a;
                    long j2 = f68Var.e;
                    long j3 = 0;
                    if (j2 != 0) {
                        j3 = f68Var.f / j2;
                    }
                    f = (float) (1.0E9d / j3);
                } else {
                    f = -1.0f;
                }
            } else {
                f = this.f;
            }
            float f3 = this.g;
            if (f != f3) {
                if (f != -1.0f && f3 != -1.0f) {
                    if (g68Var.a.a()) {
                        if (g68Var.a.a()) {
                            j = g68Var.a.f;
                        } else {
                            j = -9223372036854775807L;
                        }
                        if (j >= 5000000000L) {
                            f2 = 0.02f;
                            if (Math.abs(f - this.g) < f2) {
                                return;
                            }
                        }
                    }
                    f2 = 1.0f;
                    if (Math.abs(f - this.g) < f2) {
                    }
                } else if (f == -1.0f && g68Var.e < 30) {
                    return;
                }
                this.g = f;
                d(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        Surface surface;
        float f;
        int i;
        if (u1k.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            try {
                if (this.d) {
                    float f2 = this.g;
                    if (f2 != -1.0f) {
                        f = f2 * this.i;
                        if (!z || this.h != f) {
                            this.h = f;
                            if (f != 0.0f) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            surface.setFrameRate(f, i);
                            return;
                        }
                        return;
                    }
                }
                surface.setFrameRate(f, i);
                return;
            } catch (IllegalStateException e) {
                q7m.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
                return;
            }
            f = 0.0f;
            if (!z) {
            }
            this.h = f;
            if (f != 0.0f) {
            }
        }
    }
}
