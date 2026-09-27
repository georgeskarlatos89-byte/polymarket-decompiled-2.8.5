package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p27 {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public p27(p27 p27Var) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.a = p27Var.a;
        this.b = p27Var.b;
        this.c = p27Var.c;
        this.d = p27Var.d;
    }

    public final void a(int i, hva hvaVar) {
        int alpha = Color.alpha(this.d);
        int c = tgc.c(i);
        Matrix matrix = z1k.a;
        int i2 = (int) ((((alpha / 255.0f) * c) / 255.0f) * 255.0f);
        if (i2 > 0) {
            hvaVar.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        } else {
            hvaVar.clearShadowLayer();
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((tgc.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = new float[2];
            this.e = fArr;
        }
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
