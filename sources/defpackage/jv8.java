package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jv8 extends Drawable implements Animatable {
    public final q90 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int f;
    public boolean h;
    public Paint i;
    public Rect j;
    public boolean e = true;
    public final int g = -1;

    public jv8(q90 q90Var) {
        this.a = q90Var;
    }

    public final void a() {
        zqn.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        pv8 pv8Var = (pv8) this.a.b;
        if (pv8Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.b) {
            this.b = true;
            ArrayList arrayList = pv8Var.c;
            if (!pv8Var.j) {
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !pv8Var.f) {
                        pv8Var.f = true;
                        pv8Var.j = false;
                        pv8Var.a();
                    }
                    invalidateSelf();
                    return;
                }
                dmk.n("Cannot subscribe twice in a row");
                return;
            }
            dmk.n("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.d) {
            return;
        }
        if (this.h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            Rect rect = this.j;
            if (rect == null) {
                rect = new Rect();
                this.j = rect;
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, rect);
            this.h = false;
        }
        pv8 pv8Var = (pv8) this.a.b;
        nv8 nv8Var = pv8Var.i;
        if (nv8Var != null) {
            bitmap = nv8Var.e;
        } else {
            bitmap = pv8Var.l;
        }
        Rect rect2 = this.j;
        if (rect2 == null) {
            rect2 = new Rect();
            this.j = rect2;
        }
        Paint paint = this.i;
        if (paint == null) {
            paint = new Paint(2);
            this.i = paint;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((pv8) this.a.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((pv8) this.a.b).o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.i;
        if (paint == null) {
            paint = new Paint(2);
            this.i = paint;
        }
        paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.i;
        if (paint == null) {
            paint = new Paint(2);
            this.i = paint;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        zqn.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            pv8 pv8Var = (pv8) this.a.b;
            ArrayList arrayList = pv8Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                pv8Var.f = false;
            }
        } else if (this.c) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        pv8 pv8Var = (pv8) this.a.b;
        ArrayList arrayList = pv8Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            pv8Var.f = false;
        }
    }
}
