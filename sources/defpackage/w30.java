package defpackage;

import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w30 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public kb4 d;
    public e40 e;

    public w30(Paint paint) {
        this.a = paint;
    }

    public final int a() {
        int i;
        Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = x30.a[strokeCap.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public final int b() {
        int i;
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = x30.b[strokeJoin.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public final void c(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        this.a.setBlendMode(uan.c(i));
    }

    public final void e(long j) {
        this.a.setColor(hpn.k(j));
    }

    public final void f(kb4 kb4Var) {
        ColorFilter colorFilter;
        this.d = kb4Var;
        if (kb4Var != null) {
            colorFilter = kb4Var.a;
        } else {
            colorFilter = null;
        }
        this.a.setColorFilter(colorFilter);
    }

    public final void g(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.a.setFilterBitmap(!z);
    }

    public final void h(e40 e40Var) {
        DashPathEffect dashPathEffect;
        if (e40Var != null) {
            dashPathEffect = e40Var.a;
        } else {
            dashPathEffect = null;
        }
        this.a.setPathEffect(dashPathEffect);
        this.e = e40Var;
    }

    public final void i(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void j(int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        this.a.setStrokeCap(cap);
    }

    public final void k(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        this.a.setStrokeJoin(join);
    }

    public final void l(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void m(int i) {
        Paint.Style style;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        this.a.setStyle(style);
    }
}
