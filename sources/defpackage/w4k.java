package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w4k extends n4k {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public u4k b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, u4k] */
    public w4k() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = j;
        constantState.b = new t4k();
        this.b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.c;
            }
            Matrix matrix = this.h;
            canvas.getMatrix(matrix);
            float[] fArr = this.g;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                u4k u4kVar = this.b;
                Bitmap bitmap = u4kVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != u4kVar.f.getHeight()) {
                    u4kVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    u4kVar.k = true;
                }
                boolean z = this.f;
                u4k u4kVar2 = this.b;
                if (!z) {
                    u4kVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(u4kVar2.f);
                    t4k t4kVar = u4kVar2.b;
                    t4kVar.a(t4kVar.g, t4k.p, canvas2, min, min2);
                } else if (u4kVar2.k || u4kVar2.g != u4kVar2.c || u4kVar2.h != u4kVar2.d || u4kVar2.j != u4kVar2.e || u4kVar2.i != u4kVar2.b.getRootAlpha()) {
                    u4k u4kVar3 = this.b;
                    u4kVar3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(u4kVar3.f);
                    t4k t4kVar2 = u4kVar3.b;
                    t4kVar2.a(t4kVar2.g, t4k.p, canvas3, min, min2);
                    u4k u4kVar4 = this.b;
                    u4kVar4.g = u4kVar4.c;
                    u4kVar4.h = u4kVar4.d;
                    u4kVar4.i = u4kVar4.b.getRootAlpha();
                    u4kVar4.j = u4kVar4.e;
                    u4kVar4.k = false;
                }
                u4k u4kVar5 = this.b;
                if (u4kVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (u4kVar5.l == null) {
                        Paint paint2 = new Paint();
                        u4kVar5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    u4kVar5.l.setAlpha(u4kVar5.b.getRootAlpha());
                    u4kVar5.l.setColorFilter(colorFilter);
                    paint = u4kVar5.l;
                }
                canvas.drawBitmap(u4kVar5.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new v4k(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [p4k, java.lang.Object, s4k] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Paint.Cap cap;
        int i8;
        Paint.Join join;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        u4k u4kVar = this.b;
        u4kVar.b = new t4k();
        TypedArray e = nwm.e(resources, theme, attributeSet, v33.a);
        u4k u4kVar2 = this.b;
        t4k t4kVar = u4kVar2.b;
        if (!nwm.d(xmlPullParser, "tintMode")) {
            i = -1;
        } else {
            i = e.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i9 = 3;
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        u4kVar2.d = mode;
        ColorStateList b = nwm.b(e, xmlPullParser, theme);
        if (b != null) {
            u4kVar2.c = b;
        }
        boolean z = u4kVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = e.getBoolean(5, z);
        }
        u4kVar2.e = z;
        float f = t4kVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = e.getFloat(7, f);
        }
        t4kVar.j = f;
        float f2 = t4kVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = e.getFloat(8, f2);
        }
        t4kVar.k = f2;
        if (t4kVar.j > 0.0f) {
            if (f2 > 0.0f) {
                t4kVar.h = e.getDimension(3, t4kVar.h);
                int i10 = 2;
                float dimension = e.getDimension(2, t4kVar.i);
                t4kVar.i = dimension;
                if (t4kVar.h > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = t4kVar.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = e.getFloat(4, alpha);
                        }
                        t4kVar.setAlpha(alpha);
                        String string = e.getString(0);
                        if (string != null) {
                            t4kVar.m = string;
                            t4kVar.o.put(string, t4kVar);
                        }
                        e.recycle();
                        u4kVar.a = getChangingConfigurations();
                        int i11 = 1;
                        u4kVar.k = true;
                        u4k u4kVar3 = this.b;
                        t4k t4kVar2 = u4kVar3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        q4k q4kVar = t4kVar2.g;
                        fl0 fl0Var = t4kVar2.o;
                        arrayDeque.push(q4kVar);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != i9)) {
                            if (eventType == i10) {
                                String name = xmlPullParser.getName();
                                q4k q4kVar2 = (q4k) arrayDeque.peek();
                                if (q4kVar2 != null) {
                                    ArrayList arrayList = q4kVar2.b;
                                    i2 = depth;
                                    if ("path".equals(name)) {
                                        ?? s4kVar = new s4k();
                                        s4kVar.e = 0.0f;
                                        s4kVar.g = 1.0f;
                                        s4kVar.h = 1.0f;
                                        s4kVar.i = 0.0f;
                                        s4kVar.j = 1.0f;
                                        s4kVar.k = 0.0f;
                                        Paint.Cap cap2 = Paint.Cap.BUTT;
                                        s4kVar.l = cap2;
                                        Paint.Join join2 = Paint.Join.MITER;
                                        s4kVar.m = join2;
                                        s4kVar.n = 4.0f;
                                        TypedArray e2 = nwm.e(resources, theme, attributeSet, v33.c);
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            String string2 = e2.getString(0);
                                            if (string2 != null) {
                                                s4kVar.b = string2;
                                            }
                                            String string3 = e2.getString(2);
                                            if (string3 != null) {
                                                s4kVar.a = amn.c(string3);
                                            }
                                            s4kVar.f = nwm.c(e2, xmlPullParser, theme, "fillColor", 1);
                                            float f3 = s4kVar.h;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                                f3 = e2.getFloat(12, f3);
                                            }
                                            s4kVar.h = f3;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                                i7 = e2.getInt(8, -1);
                                            } else {
                                                i7 = -1;
                                            }
                                            Paint.Cap cap3 = s4kVar.l;
                                            if (i7 != 0) {
                                                if (i7 != 1) {
                                                    if (i7 != 2) {
                                                        cap = cap3;
                                                    } else {
                                                        cap = Paint.Cap.SQUARE;
                                                    }
                                                } else {
                                                    cap = Paint.Cap.ROUND;
                                                }
                                            } else {
                                                cap = cap2;
                                            }
                                            s4kVar.l = cap;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                                i8 = e2.getInt(9, -1);
                                            } else {
                                                i8 = -1;
                                            }
                                            Paint.Join join3 = s4kVar.m;
                                            if (i8 != 0) {
                                                if (i8 != 1) {
                                                    if (i8 != 2) {
                                                        join = join3;
                                                    } else {
                                                        join = Paint.Join.BEVEL;
                                                    }
                                                } else {
                                                    join = Paint.Join.ROUND;
                                                }
                                            } else {
                                                join = join2;
                                            }
                                            s4kVar.m = join;
                                            float f4 = s4kVar.n;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                                f4 = e2.getFloat(10, f4);
                                            }
                                            s4kVar.n = f4;
                                            s4kVar.d = nwm.c(e2, xmlPullParser, theme, "strokeColor", 3);
                                            float f5 = s4kVar.g;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                                f5 = e2.getFloat(11, f5);
                                            }
                                            s4kVar.g = f5;
                                            float f6 = s4kVar.e;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                                f6 = e2.getFloat(4, f6);
                                            }
                                            s4kVar.e = f6;
                                            float f7 = s4kVar.j;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                                f7 = e2.getFloat(6, f7);
                                            }
                                            s4kVar.j = f7;
                                            float f8 = s4kVar.k;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                                f8 = e2.getFloat(7, f8);
                                            }
                                            s4kVar.k = f8;
                                            float f9 = s4kVar.i;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                                f9 = e2.getFloat(5, f9);
                                            }
                                            s4kVar.i = f9;
                                            int i12 = s4kVar.c;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                                i12 = e2.getInt(13, i12);
                                            }
                                            s4kVar.c = i12;
                                        }
                                        e2.recycle();
                                        arrayList.add(s4kVar);
                                        if (s4kVar.getPathName() != null) {
                                            fl0Var.put(s4kVar.getPathName(), s4kVar);
                                        }
                                        u4kVar3.a = u4kVar3.a;
                                        i5 = 1;
                                        z2 = false;
                                    } else {
                                        if ("clip-path".equals(name)) {
                                            s4k s4kVar2 = new s4k();
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                TypedArray e3 = nwm.e(resources, theme, attributeSet, v33.d);
                                                String string4 = e3.getString(0);
                                                if (string4 != null) {
                                                    s4kVar2.b = string4;
                                                }
                                                String string5 = e3.getString(1);
                                                if (string5 != null) {
                                                    s4kVar2.a = amn.c(string5);
                                                }
                                                if (!nwm.d(xmlPullParser, "fillType")) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = e3.getInt(2, 0);
                                                }
                                                s4kVar2.c = i6;
                                                e3.recycle();
                                            }
                                            arrayList.add(s4kVar2);
                                            if (s4kVar2.getPathName() != null) {
                                                fl0Var.put(s4kVar2.getPathName(), s4kVar2);
                                            }
                                            u4kVar3.a = u4kVar3.a;
                                        } else if ("group".equals(name)) {
                                            q4k q4kVar3 = new q4k();
                                            TypedArray e4 = nwm.e(resources, theme, attributeSet, v33.b);
                                            float f10 = q4kVar3.c;
                                            if (nwm.d(xmlPullParser, "rotation")) {
                                                f10 = e4.getFloat(5, f10);
                                            }
                                            q4kVar3.c = f10;
                                            i5 = 1;
                                            q4kVar3.d = e4.getFloat(1, q4kVar3.d);
                                            q4kVar3.e = e4.getFloat(2, q4kVar3.e);
                                            float f11 = q4kVar3.f;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                                f11 = e4.getFloat(3, f11);
                                            }
                                            q4kVar3.f = f11;
                                            float f12 = q4kVar3.g;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                                f12 = e4.getFloat(4, f12);
                                            }
                                            q4kVar3.g = f12;
                                            float f13 = q4kVar3.h;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                                f13 = e4.getFloat(6, f13);
                                            }
                                            q4kVar3.h = f13;
                                            float f14 = q4kVar3.i;
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                                f14 = e4.getFloat(7, f14);
                                            }
                                            q4kVar3.i = f14;
                                            String string6 = e4.getString(0);
                                            if (string6 != null) {
                                                q4kVar3.k = string6;
                                            }
                                            q4kVar3.c();
                                            e4.recycle();
                                            arrayList.add(q4kVar3);
                                            arrayDeque.push(q4kVar3);
                                            if (q4kVar3.getGroupName() != null) {
                                                fl0Var.put(q4kVar3.getGroupName(), q4kVar3);
                                            }
                                            u4kVar3.a = u4kVar3.a;
                                        }
                                        i5 = 1;
                                    }
                                } else {
                                    i2 = depth;
                                    i5 = 1;
                                }
                                i4 = i5;
                                i3 = 3;
                            } else {
                                i2 = depth;
                                i3 = i9;
                                i4 = 1;
                                if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                                    arrayDeque.pop();
                                }
                            }
                            eventType = xmlPullParser.next();
                            i9 = i3;
                            i11 = i4;
                            depth = i2;
                            i10 = 2;
                        }
                        if (!z2) {
                            this.c = a(u4kVar.c, u4kVar.d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(e.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(e.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(e.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(e.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            u4k u4kVar = this.b;
            if (u4kVar != null) {
                t4k t4kVar = u4kVar.b;
                Boolean bool = t4kVar.n;
                if (bool == null) {
                    bool = Boolean.valueOf(t4kVar.g.a());
                    t4kVar.n = bool;
                }
                if (!bool.booleanValue()) {
                    ColorStateList colorStateList = this.b.c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, u4k] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            u4k u4kVar = this.b;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = j;
            if (u4kVar != null) {
                constantState.a = u4kVar.a;
                t4k t4kVar = new t4k(u4kVar.b);
                constantState.b = t4kVar;
                if (u4kVar.b.e != null) {
                    t4kVar.e = new Paint(u4kVar.b.e);
                }
                if (u4kVar.b.d != null) {
                    constantState.b.d = new Paint(u4kVar.b.d);
                }
                constantState.c = u4kVar.c;
                constantState.d = u4kVar.d;
                constantState.e = u4kVar.e;
            }
            this.b = constantState;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        u4k u4kVar = this.b;
        ColorStateList colorStateList = u4kVar.c;
        if (colorStateList != null && (mode = u4kVar.d) != null) {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        t4k t4kVar = u4kVar.b;
        Boolean bool = t4kVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(t4kVar.g.a());
            t4kVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = u4kVar.b.g.b(iArr);
            u4kVar.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        u4k u4kVar = this.b;
        if (u4kVar.c != colorStateList) {
            u4kVar.c = colorStateList;
            this.c = a(colorStateList, u4kVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        u4k u4kVar = this.b;
        if (u4kVar.d != mode) {
            u4kVar.d = mode;
            this.c = a(u4kVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public w4k(u4k u4kVar) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = u4kVar;
        this.c = a(u4kVar.c, u4kVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
