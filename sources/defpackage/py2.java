package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class py2 implements rp8, uy2, f3f, o23, kna, sx6, al4, cfd, ObjectConstructor {
    public final /* synthetic */ int a;

    public /* synthetic */ py2(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void g(String str, int i, int i2, Object obj) {
        throw new IllegalArgumentException((str + i + obj + i2 + ')').toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new RuntimeException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    @Override // defpackage.al4
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.rp8
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            default:
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.uy2
    public boolean b(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 1:
                return bz2.j(totalCaptureResult, false);
            default:
                return bz2.j(totalCaptureResult, true);
        }
    }

    @Override // defpackage.sx6
    public double c(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.a) {
            case 13:
                if (d < ConstantsKt.UNSET) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.0031308049535603718d) {
                    d3 = (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d3 = d2 / 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            case 14:
                if (d < ConstantsKt.UNSET) {
                    d4 = -d;
                } else {
                    d4 = d;
                }
                if (d4 >= 0.04045d) {
                    d5 = Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d);
                } else {
                    d5 = d4 * 0.07739938080495357d;
                }
                return Math.copySign(d5, d);
            case 15:
                float[] fArr = bc4.a;
                return bc4.b(bc4.c, d);
            case 16:
                float[] fArr2 = bc4.a;
                return bc4.a(bc4.c, d);
            case 17:
                float[] fArr3 = bc4.a;
                return bc4.d(bc4.d, d);
            default:
                float[] fArr4 = bc4.a;
                return bc4.c(bc4.d, d);
        }
    }

    @Override // defpackage.cfd, com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.a) {
            case 22:
                return new ArrayList();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new TreeSet();
            case 25:
                return new ArrayDeque();
            case 26:
                return ConstructorConstructor.p();
            case 27:
                return ConstructorConstructor.c();
            case 28:
                return ConstructorConstructor.j();
            default:
                return ConstructorConstructor.a();
        }
    }

    @Override // defpackage.kna
    public l1n e(fxg fxgVar) {
        sff sffVar = (sff) fxgVar;
        if (sffVar.a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                ob3 A = ob3.A(sffVar.c, mt7.a());
                if (A.y() == 0) {
                    return pb3.d(vb3.a(sffVar.e), new evf(pw1.a(A.x().f()), 1), sffVar.f);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (z7a unused) {
                fi9.r("Parsing ChaCha20Poly1305Key failed");
                return null;
            }
        }
        dmk.v("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        return null;
    }

    @Override // defpackage.f3f
    public void k(lei leiVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(leiVar.b.getWidth(), leiVar.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        leiVar.a(surface, qt6.a(), new r13(0, surface, surfaceTexture));
    }

    @Override // defpackage.o23
    public void cancel() {
    }
}
