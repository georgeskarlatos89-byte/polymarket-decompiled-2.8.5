package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b1j implements z0h {
    public final float a;
    public final float b;
    public final Float c;

    public b1j(float f, float f2, Float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.z0h
    /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public final knd mo11createOutlinePq9zytI(long j, owa owaVar, il6 il6Var) {
        owaVar.getClass();
        il6Var.getClass();
        d40 a = h40.a();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float floatValue = this.c.floatValue();
        Path path = a.a;
        a.l();
        float f = this.a;
        a.j(0.0f, f);
        float f2 = 2.0f * f;
        RectF rectF = a.b;
        if (rectF == null) {
            rectF = new RectF();
            a.b = rectF;
        }
        rectF.set(0.0f, 0.0f, f2, f2);
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        a.i(intBitsToFloat - f, 0.0f);
        float f3 = intBitsToFloat - f2;
        RectF rectF3 = a.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            a.b = rectF3;
        }
        rectF3.set(f3, 0.0f, intBitsToFloat, f2);
        RectF rectF4 = a.b;
        rectF4.getClass();
        path.arcTo(rectF4, 270.0f, 90.0f, false);
        float f4 = this.b;
        float f5 = floatValue - f4;
        a.i(intBitsToFloat, f5);
        float f6 = intBitsToFloat - f4;
        float f7 = intBitsToFloat + f4;
        float f8 = floatValue + f4;
        RectF rectF5 = a.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            a.b = rectF5;
        }
        rectF5.set(f6, f5, f7, f8);
        RectF rectF6 = a.b;
        rectF6.getClass();
        path.arcTo(rectF6, 270.0f, -180.0f, false);
        a.i(intBitsToFloat, intBitsToFloat2 - f);
        float f9 = intBitsToFloat2 - f2;
        RectF rectF7 = a.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            a.b = rectF7;
        }
        rectF7.set(f3, f9, intBitsToFloat, intBitsToFloat2);
        RectF rectF8 = a.b;
        rectF8.getClass();
        path.arcTo(rectF8, 0.0f, 90.0f, false);
        a.i(f, intBitsToFloat2);
        RectF rectF9 = a.b;
        if (rectF9 == null) {
            rectF9 = new RectF();
            a.b = rectF9;
        }
        rectF9.set(0.0f, f9, f2, intBitsToFloat2);
        RectF rectF10 = a.b;
        rectF10.getClass();
        path.arcTo(rectF10, 90.0f, 90.0f, false);
        a.i(0.0f, f8);
        float f10 = -f4;
        RectF rectF11 = a.b;
        if (rectF11 == null) {
            rectF11 = new RectF();
            a.b = rectF11;
        }
        rectF11.set(f10, f5, f4, f8);
        RectF rectF12 = a.b;
        rectF12.getClass();
        path.arcTo(rectF12, 90.0f, -180.0f, false);
        a.f();
        return new hnd(a);
    }
}
