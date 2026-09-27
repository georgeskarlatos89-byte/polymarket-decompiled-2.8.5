package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s90 extends n4k implements Animatable {
    public final Context c;
    public m8 d = null;
    public ArrayList e = null;
    public final o90 f = new o90(this, 0);
    public final p90 b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, p90] */
    public s90(Context context) {
        this.c = context;
    }

    @Override // defpackage.n4k, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        p90 p90Var = this.b;
        p90Var.a.draw(canvas);
        if (p90Var.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.b.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.b.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new q90(this.a.getConstantState(), 0);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.b.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.b.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.b.a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        r8 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        if (r8 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        r8 = new android.animation.AnimatorSet();
        r3.b = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        r8.playTogether(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r6v9, types: [b7h, fl0] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            p90 p90Var = this.b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray e = nwm.e(resources, theme, attributeSet, v33.e);
                    int resourceId = e.getResourceId(0, 0);
                    if (resourceId != 0) {
                        w4k w4kVar = new w4k();
                        ThreadLocal threadLocal = m4g.a;
                        w4kVar.a = resources.getDrawable(resourceId, theme);
                        w4kVar.f = false;
                        w4kVar.setCallback(this.f);
                        w4k w4kVar2 = p90Var.a;
                        if (w4kVar2 != null) {
                            w4kVar2.setCallback(null);
                        }
                        p90Var.a = w4kVar;
                    }
                    e.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, v33.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(p90Var.a.b.b.o.get(string));
                            if (p90Var.c == null) {
                                p90Var.c = new ArrayList();
                                p90Var.d = new b7h();
                            }
                            p90Var.c.add(loadAnimator);
                            p90Var.d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            dmk.n("Context can't be null when inflating animators");
                            return;
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.b.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.b.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.b.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.a.setBounds(rect);
        }
    }

    @Override // defpackage.n4k, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.b.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.b.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.b.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.b.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.b.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        p90 p90Var = this.b;
        if (p90Var.b.isStarted()) {
            return;
        }
        p90Var.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
