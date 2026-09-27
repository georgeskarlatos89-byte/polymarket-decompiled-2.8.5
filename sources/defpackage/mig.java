package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mig implements h8k, c13 {
    public int i;
    public SurfaceTexture j;
    public byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final yaf c = new Object();
    public final af9 d = new af9(15);
    public final hj1 e = new hj1(8, (byte) 0);
    public final hj1 f = new hj1(8, (byte) 0);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // defpackage.h8k
    public final void a(long j, long j2, el8 el8Var, MediaFormat mediaFormat) {
        int i;
        float f;
        ArrayList arrayList;
        int g;
        this.e.a(j2, Long.valueOf(j));
        byte[] bArr = el8Var.z;
        int i2 = el8Var.A;
        byte[] bArr2 = this.m;
        int i3 = this.l;
        this.m = bArr;
        if (i2 == -1) {
            i2 = this.k;
        }
        this.l = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        xaf xafVar = null;
        if (bArr3 != null) {
            int i4 = this.l;
            svd svdVar = new svd(bArr3);
            try {
                svdVar.G(4);
                g = svdVar.g();
                svdVar.F(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (g == 1886547818) {
                svdVar.G(8);
                int i5 = svdVar.b;
                int i6 = svdVar.c;
                while (i5 < i6) {
                    int g2 = svdVar.g() + i5;
                    if (g2 <= i5 || g2 > i6) {
                        break;
                    }
                    int g3 = svdVar.g();
                    if (g3 != 2037673328 && g3 != 1836279920) {
                        svdVar.F(g2);
                        i5 = g2;
                    }
                    svdVar.E(g2);
                    arrayList = esn.g(svdVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = esn.g(svdVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 1) {
                    if (size == 2) {
                        xafVar = new xaf((waf) arrayList.get(0), (waf) arrayList.get(1), i4);
                    }
                } else {
                    waf wafVar = (waf) arrayList.get(0);
                    xafVar = new xaf(wafVar, wafVar, i4);
                }
            }
        }
        if (xafVar == null || !yaf.c(xafVar)) {
            int i7 = this.l;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f2 = radians / 36.0f;
            float f3 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f4 = radians / 2.0f;
                float f5 = (i10 * f2) - f4;
                i = i10 + 1;
                float f6 = (i * f2) - f4;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        if (i13 == 0) {
                            f = f5;
                        } else {
                            f = f6;
                        }
                        float f7 = radians;
                        float f8 = i11 * f3;
                        float f9 = radians2;
                        double d = (f8 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = f;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f10 = f2;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f8 / f9;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f10) / f7;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f7;
                        f2 = f10;
                        radians2 = f9;
                    }
                    i11++;
                    i = i12;
                }
            }
            waf wafVar2 = new waf(new hj1(0, 1, fArr, fArr2));
            xafVar = new xaf(wafVar2, wafVar2, i7);
        }
        this.f.a(j2, xafVar);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            jrl.a();
            this.c.a();
            jrl.a();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            jrl.a();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            jrl.a();
            GLES20.glTexParameteri(36197, 10240, 9729);
            jrl.a();
            GLES20.glTexParameteri(36197, 10241, 9729);
            jrl.a();
            GLES20.glTexParameteri(36197, 10242, 33071);
            jrl.a();
            GLES20.glTexParameteri(36197, 10243, 33071);
            jrl.a();
            this.i = i;
        } catch (xv8 e) {
            q7m.d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new lig(this, 0));
        return this.j;
    }

    @Override // defpackage.c13
    public final void c(long j, float[] fArr) {
        ((hj1) this.d.e).a(j, fArr);
    }

    @Override // defpackage.c13
    public final void d() {
        this.e.c();
        af9 af9Var = this.d;
        ((hj1) af9Var.e).c();
        af9Var.b = false;
        this.b.set(true);
    }
}
