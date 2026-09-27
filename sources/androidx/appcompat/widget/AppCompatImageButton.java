package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.polymarket.android.R;
import defpackage.if0;
import defpackage.ig0;
import defpackage.n17;
import defpackage.o10;
import defpackage.qen;
import defpackage.r3j;
import defpackage.wyi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final if0 a;
    public final ig0 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r3j.a(context);
        this.c = false;
        wyi.a(this, getContext());
        if0 if0Var = new if0(this);
        this.a = if0Var;
        if0Var.d(attributeSet, i);
        ig0 ig0Var = new ig0(this);
        this.b = ig0Var;
        ig0Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.a();
        }
        ig0 ig0Var = this.b;
        if (ig0Var != null) {
            ig0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if0 if0Var = this.a;
        if (if0Var != null) {
            return if0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if0 if0Var = this.a;
        if (if0Var != null) {
            return if0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o10 o10Var;
        ig0 ig0Var = this.b;
        if (ig0Var == null || (o10Var = ig0Var.b) == null) {
            return null;
        }
        return (ColorStateList) o10Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o10 o10Var;
        ig0 ig0Var = this.b;
        if (ig0Var == null || (o10Var = ig0Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) o10Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ig0 ig0Var = this.b;
        if (ig0Var != null) {
            ig0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ig0 ig0Var = this.b;
        if (ig0Var != null && drawable != null && !this.c) {
            ig0Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (ig0Var != null) {
            ig0Var.a();
            if (!this.c) {
                ImageView imageView = ig0Var.a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(ig0Var.c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ig0 ig0Var = this.b;
        ImageView imageView = ig0Var.a;
        if (i != 0) {
            Drawable b = qen.b(imageView.getContext(), i);
            if (b != null) {
                int i2 = n17.a;
            }
            imageView.setImageDrawable(b);
        } else {
            imageView.setImageDrawable(null);
        }
        ig0Var.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ig0 ig0Var = this.b;
        if (ig0Var != null) {
            ig0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.i(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o10] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        ig0 ig0Var = this.b;
        if (ig0Var != null) {
            o10 o10Var = ig0Var.b;
            o10 o10Var2 = o10Var;
            if (o10Var == null) {
                ?? obj = new Object();
                ig0Var.b = obj;
                o10Var2 = obj;
            }
            o10Var2.c = colorStateList;
            o10Var2.b = true;
            ig0Var.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o10] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ig0 ig0Var = this.b;
        if (ig0Var != null) {
            o10 o10Var = ig0Var.b;
            o10 o10Var2 = o10Var;
            if (o10Var == null) {
                ?? obj = new Object();
                ig0Var.b = obj;
                o10Var2 = obj;
            }
            o10Var2.d = mode;
            o10Var2.a = true;
            ig0Var.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }
}
