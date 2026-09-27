package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.a1h;
import defpackage.a5c;
import defpackage.b1h;
import defpackage.cd6;
import defpackage.jlf;
import defpackage.lg8;
import defpackage.m67;
import defpackage.m8;
import defpackage.mg8;
import defpackage.n0;
import defpackage.uen;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable p = new ColorDrawable(0);
    public static final int[] q = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator r = new OvershootInterpolator(4.0f);
    public static final lg8 s = new FloatProperty("interpolation");
    public final Paint a;
    public final RectF b;
    public final Rect c;
    public final Path d;
    public final Path e;
    public final Matrix f;
    public final cd6 g;
    public WeakReference h;
    public float i;
    public ObjectAnimator j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public mg8 o;

    private FocusRingDrawable(mg8 mg8Var, Resources resources) {
        super(null);
        Drawable newDrawable;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = cd6.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        mg8 mg8Var2 = new mg8(mg8Var);
        this.o = mg8Var2;
        Drawable.ConstantState constantState = mg8Var2.a;
        if (constantState != null) {
            if (resources != null) {
                newDrawable = constantState.newDrawable(resources);
            } else {
                newDrawable = constantState.newDrawable();
            }
            setDrawable(newDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (!Float.isNaN(this.o.j)) {
            paint.setStrokeWidth(this.o.j);
        }
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 2) {
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i, typedValue)) {
                return typedValue.data;
            }
            return Integer.MIN_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, LayerDrawable layerDrawable, a5c a5cVar) {
        if (!uen.b(context.getTheme(), com.polymarket.android.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, p);
        if (a5cVar != null) {
            focusRingDrawable.h = new WeakReference(a5cVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float f(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.o.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.h;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((a5c) this.h.get()).getBounds());
            return;
        }
        if (getDrawable() instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
            Rect rect2 = this.c;
            rippleDrawable.getHotspotBounds(rect2);
            int radius = rippleDrawable.getRadius();
            if (radius > 0) {
                rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
            }
            rectF.set(rect2);
            return;
        }
        rectF.set(getBounds());
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.b;
        a(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.d;
        path.transform(matrix, path2);
        float f4 = f2 * this.k;
        Paint paint = this.a;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(Resources.Theme theme) {
        TypedValue a;
        boolean z;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(jlf.m);
        int i = this.o.d;
        if (i != Integer.MIN_VALUE && (a = uen.a(theme, i)) != null) {
            mg8 mg8Var = this.o;
            if (a.data != 0) {
                z = true;
            } else {
                z = false;
            }
            mg8Var.c = z;
            mg8Var.e = true;
        }
        mg8 mg8Var2 = this.o;
        if (!mg8Var2.e) {
            mg8Var2.c = uen.b(theme, com.polymarket.android.R.attr.focusRingsEnabled, mg8Var2.c);
        }
        mg8 mg8Var3 = this.o;
        if (mg8Var3.c) {
            int i2 = mg8Var3.f;
            int i3 = mg8Var3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            mg8Var3.f = i2;
            mg8 mg8Var4 = this.o;
            int i4 = mg8Var4.h;
            int i5 = mg8Var4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            mg8Var4.h = i4;
            mg8 mg8Var5 = this.o;
            mg8Var5.j = f(mg8Var5.j, theme, mg8Var5.k, obtainStyledAttributes, 6, com.polymarket.android.R.dimen.mtrl_focus_ring_outer_stroke_width);
            mg8 mg8Var6 = this.o;
            mg8Var6.l = f(mg8Var6.l, theme, mg8Var6.m, obtainStyledAttributes, 3, com.polymarket.android.R.dimen.mtrl_focus_ring_inner_stroke_width);
            mg8 mg8Var7 = this.o;
            mg8Var7.n = f(mg8Var7.n, theme, mg8Var7.o, obtainStyledAttributes, 7, 0);
            mg8 mg8Var8 = this.o;
            mg8Var8.p = f(mg8Var8.p, theme, mg8Var8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.o.p)) {
                this.o.p = 0.0f;
            }
            mg8 mg8Var9 = this.o;
            mg8Var9.r = f(mg8Var9.r, theme, mg8Var9.s, obtainStyledAttributes, 2, com.polymarket.android.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            mg8 mg8Var10 = this.o;
            int i6 = mg8Var10.u;
            int[] iArr = jlf.I;
            if (i6 != Integer.MIN_VALUE) {
                mg8Var10.t = b1h.i(theme.obtainStyledAttributes(i6, iArr), new n0(0.0f)).a();
            } else {
                int i7 = mg8Var10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.polymarket.android.R.attr.focusRingsShapeAppearance;
                }
                TypedValue a2 = uen.a(theme, i7);
                if (a2 != null) {
                    this.o.t = b1h.i(theme.obtainStyledAttributes(a2.resourceId, iArr), new n0(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.a;
        paint.setStyle(style);
        if (!Float.isNaN(this.o.j)) {
            paint.setStrokeWidth(this.o.j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        mg8 mg8Var = this.o;
        if (mg8Var.c && this.m) {
            float f2 = mg8Var.p;
            float f3 = mg8Var.j / 2.0f;
            float f4 = this.k;
            float f5 = (f3 * f4) + f2;
            float f6 = ((mg8Var.l / 2.0f) * f4) + f2 + mg8Var.r;
            Path path = this.e;
            if (path.isEmpty()) {
                WeakReference weakReference = this.h;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((a5c) this.h.get()).i;
                }
                path = null;
            }
            Path path2 = path;
            mg8 mg8Var2 = this.o;
            if (path2 != null) {
                b(canvas, path2, f6, mg8Var2.l, mg8Var2.h);
                mg8 mg8Var3 = this.o;
                b(canvas, path2, f5, mg8Var3.j, mg8Var3.f);
                return;
            }
            if (!Float.isNaN(mg8Var2.n)) {
                f = this.o.n;
            } else {
                f = this.i;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.h;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        a5c a5cVar = (a5c) this.h.get();
                        float c = a5cVar.c(a5cVar.g(), a5cVar.b.a.d(), a5cVar.B);
                        if (c >= 0.0f) {
                            c *= a5cVar.b.i;
                        }
                        if (c >= 0.0f) {
                            f = Math.max(0.0f, c - (this.o.j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    if ((drawable instanceof RippleDrawable) && (radius = ((RippleDrawable) drawable).getRadius()) >= 0) {
                        f = radius;
                    } else {
                        f = 0.0f;
                    }
                }
            }
            float max = Math.max(0.0f, f - (this.o.j / 2.0f));
            mg8 mg8Var4 = this.o;
            float f7 = mg8Var4.l;
            int i = mg8Var4.h;
            RectF rectF = this.b;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.k;
            Paint paint = this.a;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            mg8 mg8Var5 = this.o;
            float f9 = mg8Var5.j;
            int i2 = mg8Var5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.k);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void g(a1h a1hVar) {
        RectF rectF = this.b;
        a(rectF);
        b1h b = a1hVar.b(q);
        boolean k = b.k(rectF);
        Path path = this.e;
        if (k) {
            mg8 mg8Var = this.o;
            float f = ((mg8Var.j / 2.0f) * this.k) + mg8Var.p;
            rectF.inset(f, f);
            this.i = b.e.a(rectF);
            path.reset();
            return;
        }
        this.g.a(b, null, 1.0f, rectF, null, path);
        this.i = -1.0f;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        mg8 mg8Var = this.o;
        if (mg8Var.a != null) {
            mg8Var.b = getChangingConfigurations();
            return this.o;
        }
        return null;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (!super.hasFocusStateSpecified()) {
                if (!this.o.c) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (NoSuchMethodError unused) {
            return this.o.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = jlf.m;
        if (theme != null) {
            obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        } else {
            obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        this.o.d = c(obtainAttributes, 0);
        int i = Integer.MIN_VALUE;
        if (this.o.d == Integer.MIN_VALUE && obtainAttributes.hasValue(0)) {
            mg8 mg8Var = this.o;
            mg8Var.c = obtainAttributes.getBoolean(0, mg8Var.c);
            this.o.e = true;
        }
        this.o.g = c(obtainAttributes, 5);
        mg8 mg8Var2 = this.o;
        if (mg8Var2.g == Integer.MIN_VALUE) {
            mg8Var2.f = obtainAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.o.i = c(obtainAttributes, 1);
        mg8 mg8Var3 = this.o;
        if (mg8Var3.i == Integer.MIN_VALUE) {
            mg8Var3.h = obtainAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.o.k = c(obtainAttributes, 6);
        mg8 mg8Var4 = this.o;
        if (mg8Var4.k == Integer.MIN_VALUE) {
            mg8Var4.j = obtainAttributes.getDimension(6, Float.NaN);
        }
        this.o.m = c(obtainAttributes, 3);
        mg8 mg8Var5 = this.o;
        if (mg8Var5.m == Integer.MIN_VALUE) {
            mg8Var5.l = obtainAttributes.getDimension(3, Float.NaN);
        }
        this.o.m = c(obtainAttributes, 3);
        mg8 mg8Var6 = this.o;
        if (mg8Var6.m == Integer.MIN_VALUE) {
            mg8Var6.l = obtainAttributes.getDimension(3, Float.NaN);
        }
        this.o.o = c(obtainAttributes, 7);
        mg8 mg8Var7 = this.o;
        if (mg8Var7.o == Integer.MIN_VALUE) {
            mg8Var7.n = obtainAttributes.getDimension(7, Float.NaN);
        }
        this.o.q = c(obtainAttributes, 4);
        mg8 mg8Var8 = this.o;
        if (mg8Var8.q == Integer.MIN_VALUE) {
            mg8Var8.p = obtainAttributes.getDimension(4, Float.NaN);
        }
        this.o.s = c(obtainAttributes, 2);
        mg8 mg8Var9 = this.o;
        if (mg8Var9.s == Integer.MIN_VALUE) {
            mg8Var9.r = obtainAttributes.getDimension(2, Float.NaN);
        }
        this.o.v = c(obtainAttributes, 8);
        mg8 mg8Var10 = this.o;
        if (obtainAttributes.getType(8) == 1) {
            i = obtainAttributes.getResourceId(8, Integer.MIN_VALUE);
        }
        mg8Var10.u = i;
        obtainAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.o.a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = p;
            setDrawable(colorDrawable);
            this.o.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.isProjected()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!super.isStateful() && !this.o.c) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.o = new mg8(this.o);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.o.a = drawable.getConstantState();
            }
            this.n = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    /* JADX WARN: Type inference failed for: r0v14, types: [b1h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [b1h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [b1h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [gsn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [gsn, java.lang.Object] */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f;
        a1h a1hVar;
        super.onBoundsChange(rect);
        mg8 mg8Var = this.o;
        if (mg8Var.c) {
            a1h a1hVar2 = mg8Var.t;
            if (a1hVar2 != null) {
                g(a1hVar2);
                return;
            }
            Drawable drawable = getDrawable();
            a1h a1hVar3 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    ?? obj4 = new Object();
                    m67 m67Var = new m67(0);
                    m67 m67Var2 = new m67(0);
                    m67 m67Var3 = new m67(0);
                    m67 m67Var4 = new m67(0);
                    float radius = outline.getRadius();
                    n0 n0Var = new n0(radius);
                    n0 n0Var2 = new n0(radius);
                    n0 n0Var3 = new n0(radius);
                    n0 n0Var4 = new n0(radius);
                    ?? obj5 = new Object();
                    obj5.a = obj;
                    obj5.b = obj2;
                    obj5.c = obj3;
                    obj5.d = obj4;
                    obj5.e = n0Var;
                    obj5.f = n0Var2;
                    obj5.g = n0Var3;
                    obj5.h = n0Var4;
                    obj5.i = m67Var;
                    obj5.j = m67Var2;
                    obj5.k = m67Var3;
                    obj5.l = m67Var4;
                    a1hVar = obj5;
                    a1hVar3 = a1hVar;
                }
                if (a1hVar3 == null) {
                    g(a1hVar3);
                    return;
                } else {
                    this.i = -1.0f;
                    this.e.reset();
                    return;
                }
            }
            if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    fArr = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    fArr = null;
                }
                if (fArr != null) {
                    ?? obj6 = new Object();
                    ?? obj7 = new Object();
                    ?? obj8 = new Object();
                    ?? obj9 = new Object();
                    m67 m67Var5 = new m67(0);
                    m67 m67Var6 = new m67(0);
                    m67 m67Var7 = new m67(0);
                    m67 m67Var8 = new m67(0);
                    n0 n0Var5 = new n0(Math.min(fArr[0], fArr[1]));
                    n0 n0Var6 = new n0(Math.min(fArr[2], fArr[3]));
                    n0 n0Var7 = new n0(Math.min(fArr[4], fArr[5]));
                    n0 n0Var8 = new n0(Math.min(fArr[6], fArr[7]));
                    ?? obj10 = new Object();
                    obj10.a = obj6;
                    obj10.b = obj7;
                    obj10.c = obj8;
                    obj10.d = obj9;
                    obj10.e = n0Var5;
                    obj10.f = n0Var6;
                    obj10.g = n0Var7;
                    obj10.h = n0Var8;
                    obj10.i = m67Var5;
                    obj10.j = m67Var6;
                    obj10.k = m67Var7;
                    obj10.l = m67Var8;
                    a1hVar = obj10;
                    a1hVar3 = a1hVar;
                } else {
                    try {
                        f = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        ?? obj11 = new Object();
                        ?? obj12 = new Object();
                        ?? obj13 = new Object();
                        ?? obj14 = new Object();
                        m67 m67Var9 = new m67(0);
                        m67 m67Var10 = new m67(0);
                        m67 m67Var11 = new m67(0);
                        m67 m67Var12 = new m67(0);
                        n0 n0Var9 = new n0(f);
                        n0 n0Var10 = new n0(f);
                        n0 n0Var11 = new n0(f);
                        n0 n0Var12 = new n0(f);
                        ?? obj15 = new Object();
                        obj15.a = obj11;
                        obj15.b = obj12;
                        obj15.c = obj13;
                        obj15.d = obj14;
                        obj15.e = n0Var9;
                        obj15.f = n0Var10;
                        obj15.g = n0Var11;
                        obj15.h = n0Var12;
                        obj15.i = m67Var9;
                        obj15.j = m67Var10;
                        obj15.k = m67Var11;
                        obj15.l = m67Var12;
                        a1hVar3 = obj15;
                    }
                }
            }
            if (a1hVar3 == null) {
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean z2;
        mg8 mg8Var = this.o;
        if (!mg8Var.c) {
            this.m = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(mg8Var.x, iArr);
        if (this.m != stateSetMatches) {
            z = true;
        } else {
            z = false;
        }
        this.m = stateSetMatches;
        if (z && iArr.length > 0 && !this.l) {
            ObjectAnimator objectAnimator = this.j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.j = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, s, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(r);
                ofFloat.addListener(new m8(this, 4));
                this.j = ofFloat;
                ofFloat.start();
            } else {
                this.k = 1.0f;
            }
        }
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        if (!super.onStateChange(iArr) && !z) {
            return false;
        }
        return true;
    }

    public FocusRingDrawable() {
        super(null);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = cd6.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        this.o = new mg8(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = cd6.h();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        mg8 mg8Var = new mg8(null);
        this.o = mg8Var;
        if (drawable != null) {
            mg8Var.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(mg8 mg8Var, Resources resources, lg8 lg8Var) {
        this(mg8Var, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
