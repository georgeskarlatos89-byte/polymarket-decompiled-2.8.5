package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iz2 implements ct7, oyj {
    public final /* synthetic */ int a;
    public final wpc b;

    public iz2(wpc wpcVar, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = wpcVar;
                ow0 ow0Var = yoi.M0;
                Class cls = (Class) wpcVar.a(ow0Var, null);
                if (cls != null && !cls.equals(g3f.class)) {
                    ahh.j("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                wpcVar.u(pyj.Y0, ryj.PREVIEW);
                wpcVar.u(ow0Var, g3f.class);
                ow0 ow0Var2 = yoi.L0;
                if (wpcVar.a(ow0Var2, null) == null) {
                    wpcVar.u(ow0Var2, g3f.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                ow0 ow0Var3 = no9.u0;
                if (((Integer) wpcVar.a(ow0Var3, -1)).intValue() == -1) {
                    wpcVar.u(ow0Var3, 2);
                    return;
                }
                return;
            case 3:
                this.b = wpcVar;
                ow0 ow0Var4 = yoi.M0;
                Class cls2 = (Class) wpcVar.a(ow0Var4, null);
                if (cls2 != null && !cls2.equals(l0i.class)) {
                    ahh.j("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                wpcVar.u(pyj.Y0, ryj.STREAM_SHARING);
                wpcVar.u(ow0Var4, l0i.class);
                ow0 ow0Var5 = yoi.L0;
                if (wpcVar.a(ow0Var5, null) == null) {
                    wpcVar.u(ow0Var5, l0i.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.b = wpcVar;
                ow0 ow0Var6 = yoi.M0;
                Class cls3 = (Class) wpcVar.a(ow0Var6, null);
                if (cls3 != null && !cls3.equals(jn9.class)) {
                    ahh.j("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                wpcVar.u(pyj.Y0, ryj.IMAGE_CAPTURE);
                wpcVar.u(ow0Var6, jn9.class);
                ow0 ow0Var7 = yoi.L0;
                if (wpcVar.a(ow0Var7, null) == null) {
                    wpcVar.u(ow0Var7, jn9.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ct7
    public final wpc a() {
        int i = this.a;
        wpc wpcVar = this.b;
        switch (i) {
            case 0:
                throw null;
            case 1:
            case 2:
            default:
                return wpcVar;
        }
    }

    @Override // defpackage.oyj
    public pyj b() {
        int i = this.a;
        wpc wpcVar = this.b;
        switch (i) {
            case 1:
                return new kn9(lld.g(wpcVar));
            case 2:
                return new h3f(lld.g(wpcVar));
            default:
                return new m0i(lld.g(wpcVar));
        }
    }

    public jn9 c() {
        ow0 ow0Var = kn9.e;
        wpc wpcVar = this.b;
        Integer num = (Integer) wpcVar.a(ow0Var, null);
        if (num != null) {
            wpcVar.u(co9.o0, num);
        } else {
            gn9 gn9Var = jn9.B;
            ow0 ow0Var2 = kn9.f;
            if (Objects.equals(wpcVar.a(ow0Var2, null), 2)) {
                wpcVar.u(co9.o0, 32);
            } else if (Objects.equals(wpcVar.a(ow0Var2, null), 3)) {
                wpcVar.u(co9.o0, 32);
                wpcVar.u(co9.p0, 256);
            } else if (Objects.equals(wpcVar.a(ow0Var2, null), 1)) {
                wpcVar.u(co9.o0, 4101);
                wpcVar.u(co9.q0, c57.c);
            } else {
                wpcVar.u(co9.o0, 256);
            }
        }
        kn9 kn9Var = new kn9(lld.g(wpcVar));
        no9.n(kn9Var);
        jn9 jn9Var = new jn9(kn9Var);
        Size size = (Size) wpcVar.a(no9.v0, null);
        if (size != null) {
            jn9Var.u = new Rational(size.getWidth(), size.getHeight());
        }
        grn.f((Executor) wpcVar.a(o8a.B0, p8a.a()), "The IO executor can't be null");
        ow0 ow0Var3 = kn9.c;
        if (wpcVar.a.containsKey(ow0Var3)) {
            Integer num2 = (Integer) wpcVar.h(ow0Var3);
            if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                if (num2.intValue() == 3 && wpcVar.a(kn9.k, null) == null) {
                    dmk.v("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            } else {
                qp7.k(num2, "The flash mode is not allowed to set: ");
                return null;
            }
        }
        return jn9Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [g3f, lyj] */
    public g3f d() {
        h3f h3fVar = new h3f(lld.g(this.b));
        no9.n(h3fVar);
        ?? lyjVar = new lyj(h3fVar);
        lyjVar.r = g3f.y;
        return lyjVar;
    }

    public void e(CaptureRequest.Key key, Object obj, vs4 vs4Var) {
        this.b.t(jz2.D(key), vs4Var, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iz2(int i) {
        this(wpc.p(), 2);
        this.a = i;
        switch (i) {
            case 1:
                this(wpc.p(), 1);
                return;
            case 2:
                return;
            default:
                this.b = wpc.p();
                return;
        }
    }
}
