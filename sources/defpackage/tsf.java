package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class tsf extends ViewGroup.MarginLayoutParams {
    public g a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public tsf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public tsf(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public tsf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public tsf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public tsf(tsf tsfVar) {
        super((ViewGroup.LayoutParams) tsfVar);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
