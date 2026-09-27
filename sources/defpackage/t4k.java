package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t4k {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final q4k g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final fl0 o;

    /* JADX WARN: Type inference failed for: r0v4, types: [b7h, fl0] */
    public t4k(t4k t4kVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        ?? b7hVar = new b7h();
        this.o = b7hVar;
        this.g = new q4k(t4kVar.g, b7hVar);
        this.a = new Path(t4kVar.a);
        this.b = new Path(t4kVar.b);
        this.h = t4kVar.h;
        this.i = t4kVar.i;
        this.j = t4kVar.j;
        this.k = t4kVar.k;
        this.l = t4kVar.l;
        this.m = t4kVar.m;
        String str = t4kVar.m;
        if (str != null) {
            b7hVar.put(str, this);
        }
        this.n = t4kVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q4k q4kVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = q4kVar.a;
        ArrayList arrayList = q4kVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = q4kVar.a;
        matrix3.preConcat(q4kVar.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            r4k r4kVar = (r4k) arrayList.get(i5);
            if (r4kVar instanceof q4k) {
                a((q4k) r4kVar, matrix3, canvas, i, i2);
            } else if (r4kVar instanceof s4k) {
                s4k s4kVar = (s4k) r4kVar;
                float f4 = i / this.j;
                float f5 = i2 / this.k;
                float min = Math.min(f4, f5);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f4, f5);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f6 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                if (max > 0.0f) {
                    f = Math.abs(f6) / max;
                } else {
                    f = 0.0f;
                }
                if (f != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    lyd[] lydVarArr = s4kVar.a;
                    if (lydVarArr != null) {
                        amn.d(lydVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (s4kVar instanceof o4k) {
                        if (s4kVar.c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        p4k p4kVar = (p4k) s4kVar;
                        float f7 = p4kVar.i;
                        if (f7 != 0.0f || p4kVar.j != 1.0f) {
                            float f8 = p4kVar.k;
                            float f9 = (f7 + f8) % 1.0f;
                            float f10 = (p4kVar.j + f8) % 1.0f;
                            PathMeasure pathMeasure = this.f;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.f = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.f.getLength();
                            float f11 = f9 * length;
                            float f12 = f10 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.f;
                            if (f11 > f12) {
                                pathMeasure4.getSegment(f11, length, path, true);
                                f2 = 0.0f;
                                this.f.getSegment(0.0f, f12, path, true);
                            } else {
                                f2 = 0.0f;
                                pathMeasure4.getSegment(f11, f12, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        vt1 vt1Var = p4kVar.f;
                        if (((Shader) vt1Var.b) != null || vt1Var.c != 0) {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) vt1Var.b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(p4kVar.h * 255.0f));
                                f3 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = vt1Var.c;
                                float f13 = p4kVar.h;
                                PorterDuff.Mode mode = w4k.j;
                                f3 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (p4kVar.c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f3 = 255.0f;
                            i4 = 16777215;
                        }
                        vt1 vt1Var2 = p4kVar.d;
                        if (((Shader) vt1Var2.b) != null || vt1Var2.c != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = p4kVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = p4kVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(p4kVar.n);
                            Shader shader2 = (Shader) vt1Var2.b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(p4kVar.g * f3));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = vt1Var2.c;
                                float f14 = p4kVar.g;
                                PorterDuff.Mode mode2 = w4k.j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(p4kVar.e * min * f);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b7h, fl0] */
    public t4k() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new b7h();
        this.g = new q4k();
        this.a = new Path();
        this.b = new Path();
    }
}
