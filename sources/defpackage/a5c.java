package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class a5c extends Drawable implements g2h {
    public static final z4c[] E;
    public final njh[] A;
    public float[] B;
    public float[] C;
    public ca6 D;
    public final q96 a;
    public y4c b;
    public final u1h[] c;
    public final u1h[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final v0h q;
    public final ba6 r;
    public final cd6 s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public int v;
    public final RectF w;
    public boolean x;
    public b1h y;
    public ojh z;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E = new z4c[4];
        int i = 0;
        while (true) {
            z4c[] z4cVarArr = E;
            if (i < z4cVarArr.length) {
                z4cVarArr[i] = new z4c(i);
                i++;
            } else {
                return;
            }
        }
    }

    public a5c(y4c y4cVar) {
        this.a = new q96(this, 21);
        this.c = new u1h[4];
        this.d = new u1h[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new v0h(0, (byte) 0);
        this.s = cd6.h();
        this.w = new RectF();
        this.x = true;
        this.A = new njh[4];
        this.b = y4cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        y();
        w(getState());
        this.r = new ba6(this, 21);
    }

    public final void b(RectF rectF, Path path) {
        this.s.a(this.b.a.d(), this.B, this.b.i, rectF, this.r, path);
        if (this.b.h != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final float c(RectF rectF, b1h b1hVar, float[] fArr) {
        if (fArr == null) {
            if (b1hVar.k(rectF)) {
                return b1hVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.x) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int d(int i) {
        float f;
        int i2;
        y4c y4cVar = this.b;
        float f2 = y4cVar.m + 0.0f + y4cVar.l;
        v87 v87Var = y4cVar.b;
        if (v87Var != null && v87Var.a && fc4.j(i, 255) == v87Var.d) {
            if (v87Var.e > 0.0f && f2 > 0.0f) {
                f = Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f = 0.0f;
            }
            int alpha = Color.alpha(i);
            int o = ven.o(fc4.j(i, 255), f, v87Var.b);
            if (f > 0.0f && (i2 = v87Var.c) != 0) {
                o = fc4.g(fc4.j(i2, v87.f), o);
            }
            return fc4.j(o, alpha);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint = this.o;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.b.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint2 = this.p;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.b.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.b.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        m();
        boolean p = p();
        Paint.Style style = this.b.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.f;
            Path path = this.i;
            if (z) {
                if (!p) {
                    b(g(), path);
                }
                this.f = false;
            }
            m();
            e(canvas, paint, path, this.b.a.d(), this.B, g());
        }
        if (n()) {
            if (this.g) {
                b1h i3 = i();
                zsb l = i3.l();
                x75 x75Var = i3.e;
                q96 q96Var = this.a;
                l.e = q96Var.e(x75Var);
                l.f = q96Var.e(i3.f);
                l.h = q96Var.e(i3.h);
                l.g = q96Var.e(i3.g);
                this.y = l.a();
                float[] fArr = this.B;
                if (fArr == null) {
                    this.C = null;
                } else {
                    if (this.C == null) {
                        this.C = new float[fArr.length];
                    }
                    float j = j();
                    int i4 = 0;
                    while (true) {
                        float[] fArr2 = this.B;
                        if (i4 >= fArr2.length) {
                            break;
                        }
                        this.C[i4] = Math.max(0.0f, fArr2[i4] - j);
                        i4++;
                    }
                }
                if (!p) {
                    b1h b1hVar = this.y;
                    float[] fArr3 = this.C;
                    float f = this.b.i;
                    RectF g = g();
                    RectF rectF = this.l;
                    rectF.set(g);
                    float j2 = j();
                    rectF.inset(j2, j2);
                    this.s.a(b1hVar, fArr3, f, rectF, null, this.j);
                }
                this.g = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, b1h b1hVar, float[] fArr, RectF rectF) {
        float c = c(rectF, b1hVar, fArr);
        if (c >= 0.0f) {
            float f = c * this.b.i;
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void f(Canvas canvas) {
        b1h b1hVar = this.y;
        float[] fArr = this.C;
        RectF g = g();
        RectF rectF = this.l;
        rectF.set(g);
        float j = j();
        rectF.inset(j, j);
        e(canvas, this.p, this.j, b1hVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.b.getClass();
        RectF g = g();
        if (g.isEmpty()) {
            return;
        }
        float c = c(g, this.b.a.d(), this.B);
        if (c >= 0.0f) {
            outline.setRoundRect(getBounds(), c * this.b.i);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            b(g, path);
            this.f = false;
        }
        m17.a(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.g;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF g = g();
        Path path = this.i;
        b(g, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.B;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        b1h i = i();
        cd6 cd6Var = this.s;
        cd6Var.getClass();
        float a = i.e.a(g);
        b1h i2 = i();
        cd6Var.getClass();
        float a2 = i2.h.a(g) + a;
        b1h i3 = i();
        cd6Var.getClass();
        float a3 = a2 - i3.g.a(g);
        b1h i4 = i();
        cd6Var.getClass();
        return (a3 - i4.f.a(g)) / 2.0f;
    }

    public final b1h i() {
        return this.b.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.b.e;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.b.getClass();
                ColorStateList colorStateList2 = this.b.d;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.b.c;
                    if ((colorStateList3 == null || !colorStateList3.isStateful()) && !this.b.a.f()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final float j() {
        if (n()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.B;
        if (fArr != null) {
            return fArr[3];
        }
        return this.b.a.d().e.a(g());
    }

    public final float l() {
        float[] fArr = this.B;
        if (fArr != null) {
            return fArr[0];
        }
        return this.b.a.d().f.a(g());
    }

    public final boolean m() {
        y4c y4cVar = this.b;
        y4cVar.getClass();
        if (y4cVar.n > 0 && !p()) {
            this.i.isConvex();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new y4c(this.b);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.b.p;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void o(Context context) {
        this.b.b = new v87(context);
        z();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (this.b.a.f() && !rect.isEmpty()) {
            int[] state = getState();
            njh[] njhVarArr = this.A;
            int length = njhVarArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    njh njhVar = njhVarArr[i];
                    if (njhVar != null && njhVar.f) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            x(state, true ^ z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        if (this.b.a.f()) {
            x(iArr, false);
        }
        boolean w = w(iArr);
        boolean y = y();
        if (w || y) {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        if (this.b.a.b(getState()).k(g())) {
            if (this.B == null || this.x) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(ojh ojhVar) {
        if (this.z != ojhVar) {
            this.z = ojhVar;
            int i = 0;
            while (true) {
                njh[] njhVarArr = this.A;
                if (i < njhVarArr.length) {
                    if (njhVarArr[i] == null) {
                        njhVarArr[i] = new njh(this, E[i]);
                    }
                    njh njhVar = njhVarArr[i];
                    ojh ojhVar2 = new ojh();
                    ojhVar2.a((float) ojhVar.b);
                    double d = ojhVar.a;
                    ojhVar2.b((float) (d * d));
                    njhVar.m = ojhVar2;
                    i++;
                } else {
                    x(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void r(float f) {
        y4c y4cVar = this.b;
        if (y4cVar.m != f) {
            y4cVar.m = f;
            z();
        }
    }

    public final void s(ColorStateList colorStateList) {
        y4c y4cVar = this.b;
        if (y4cVar.c != colorStateList) {
            y4cVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        y4c y4cVar = this.b;
        if (y4cVar.k != i) {
            y4cVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.g2h
    public final void setShapeAppearanceModel(b1h b1hVar) {
        this.b.a = b1hVar;
        this.B = null;
        this.C = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.e = colorStateList;
        y();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        y4c y4cVar = this.b;
        if (y4cVar.f != mode) {
            y4cVar.f = mode;
            y();
            super.invalidateSelf();
        }
    }

    public final void t(float f) {
        y4c y4cVar = this.b;
        if (y4cVar.i != f) {
            y4cVar.i = f;
            this.f = true;
            this.g = true;
            invalidateSelf();
        }
    }

    public final void u() {
        this.q.x(-12303292);
        this.b.getClass();
        super.invalidateSelf();
    }

    public final void v(a1h a1hVar) {
        if (a1hVar instanceof b1h) {
            setShapeAppearanceModel((b1h) a1hVar);
            return;
        }
        axh axhVar = (axh) a1hVar;
        y4c y4cVar = this.b;
        if (y4cVar.a != axhVar) {
            y4cVar.a = axhVar;
            x(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean w(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.c != null && color2 != (colorForState2 = this.b.c.getColorForState(iArr, (color2 = (paint2 = this.o).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.b.d != null && color != (colorForState = this.b.d.getColorForState(iArr, (color = (paint = this.p).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        x75 x75Var;
        RectF g = g();
        if (this.b.a.f() && !g.isEmpty()) {
            if (this.z == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z | z2;
            if (this.B == null) {
                this.B = new float[4];
            }
            b1h b = this.b.a.b(iArr);
            float[] fArr = this.B;
            if (fArr.length > 1) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    if (fArr[i] != f) {
                        break;
                    }
                }
            }
            if (b.k(g())) {
                z3 = true;
                this.x = z3;
                if (!z3) {
                    this.f = true;
                    this.g = true;
                }
                for (int i2 = 0; i2 < 4; i2++) {
                    this.s.getClass();
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                x75Var = b.f;
                            } else {
                                x75Var = b.e;
                            }
                        } else {
                            x75Var = b.h;
                        }
                    } else {
                        x75Var = b.g;
                    }
                    float a = x75Var.a(g);
                    if (z4) {
                        this.B[i2] = a;
                    }
                    njh[] njhVarArr = this.A;
                    njh njhVar = njhVarArr[i2];
                    if (njhVar != null) {
                        njhVar.a(a);
                        if (z4) {
                            njhVarArr[i2].e();
                        }
                    }
                }
                if (!z4) {
                    invalidateSelf();
                    return;
                }
                return;
            }
            z3 = false;
            this.x = z3;
            if (!z3) {
            }
            while (i2 < 4) {
            }
            if (!z4) {
            }
        }
    }

    public final boolean y() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        y4c y4cVar = this.b;
        ColorStateList colorStateList = y4cVar.e;
        PorterDuff.Mode mode = y4cVar.f;
        if (colorStateList != null && mode != null) {
            int d = d(colorStateList.getColorForState(getState(), 0));
            this.v = d;
            porterDuffColorFilter = new PorterDuffColorFilter(d, mode);
        } else {
            int color = this.o.getColor();
            int d2 = d(color);
            this.v = d2;
            if (d2 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d2, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        if (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) {
            return false;
        }
        return true;
    }

    public final void z() {
        y4c y4cVar = this.b;
        float f = y4cVar.m + 0.0f;
        y4cVar.n = (int) Math.ceil(0.75f * f);
        this.b.o = (int) Math.ceil(f * 0.25f);
        y();
        m();
        if (!p()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public a5c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(b1h.h(context, attributeSet, i, i2).a());
    }

    public a5c(b1h b1hVar) {
        this(new y4c(b1hVar));
    }

    public a5c(a1h a1hVar) {
        this(new y4c(a1hVar));
    }

    public a5c() {
        this(new b1h());
    }
}
