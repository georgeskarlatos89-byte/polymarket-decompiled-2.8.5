package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface mxd {
    static void a(mxd mxdVar, zrf zrfVar) {
        jxd jxdVar = jxd.CounterClockwise;
        d40 d40Var = (d40) mxdVar;
        float f = zrfVar.a;
        float f2 = zrfVar.d;
        float f3 = zrfVar.c;
        float f4 = zrfVar.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            h40.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = d40Var.b;
        if (rectF == null) {
            rectF = new RectF();
            d40Var.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = d40Var.a;
        RectF rectF2 = d40Var.b;
        rectF2.getClass();
        path.addRect(rectF2, h40.c(jxdVar));
    }

    static void b(d40 d40Var, mxd mxdVar) {
        d40Var.d(mxdVar, 0L);
    }

    static void c(mxd mxdVar, mag magVar) {
        jxd jxdVar = jxd.CounterClockwise;
        d40 d40Var = (d40) mxdVar;
        RectF rectF = d40Var.b;
        if (rectF == null) {
            rectF = new RectF();
            d40Var.b = rectF;
        }
        float f = magVar.a;
        long j = magVar.h;
        long j2 = magVar.g;
        long j3 = magVar.f;
        long j4 = magVar.e;
        rectF.set(f, magVar.b, magVar.c, magVar.d);
        float[] fArr = d40Var.c;
        if (fArr == null) {
            fArr = new float[8];
            d40Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = d40Var.a;
        RectF rectF2 = d40Var.b;
        rectF2.getClass();
        float[] fArr2 = d40Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, h40.c(jxdVar));
    }
}
