package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class y4c extends Drawable.ConstantState {
    public a1h a;
    public v87 b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final Paint.Style p;

    public y4c(y4c y4cVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = y4cVar.a;
        this.b = y4cVar.b;
        this.j = y4cVar.j;
        this.c = y4cVar.c;
        this.d = y4cVar.d;
        this.f = y4cVar.f;
        this.e = y4cVar.e;
        this.k = y4cVar.k;
        this.h = y4cVar.h;
        this.o = y4cVar.o;
        this.i = y4cVar.i;
        this.l = y4cVar.l;
        this.m = y4cVar.m;
        this.n = y4cVar.n;
        this.p = y4cVar.p;
        if (y4cVar.g != null) {
            this.g = new Rect(y4cVar.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        a5c a5cVar = new a5c(this);
        a5cVar.f = true;
        a5cVar.g = true;
        return a5cVar;
    }

    public y4c(a1h a1hVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = a1hVar;
        this.b = null;
    }
}
