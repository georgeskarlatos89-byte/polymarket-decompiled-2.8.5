package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b1h implements a1h {
    public gsn a = new Object();
    public gsn b = new Object();
    public gsn c = new Object();
    public gsn d = new Object();
    public x75 e = new n0(0.0f);
    public x75 f = new n0(0.0f);
    public x75 g = new n0(0.0f);
    public x75 h = new n0(0.0f);
    public m67 i = new m67(0);
    public m67 j = new m67(0);
    public m67 k = new m67(0);
    public m67 l = new m67(0);

    public static zsb g(Context context, int i, int i2) {
        n0 n0Var = new n0(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(jlf.I), n0Var);
    }

    public static zsb h(Context context, AttributeSet attributeSet, int i, int i2) {
        n0 n0Var = new n0(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlf.B, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(jlf.I), n0Var);
    }

    public static zsb i(TypedArray typedArray, n0 n0Var) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            x75 j = j(typedArray, 5, n0Var);
            x75 j2 = j(typedArray, 8, j);
            x75 j3 = j(typedArray, 9, j);
            x75 j4 = j(typedArray, 7, j);
            x75 j5 = j(typedArray, 6, j);
            zsb zsbVar = new zsb();
            zsbVar.a = zen.a(i2);
            zsbVar.e = j2;
            zsbVar.b = zen.a(i3);
            zsbVar.f = j3;
            zsbVar.c = zen.a(i4);
            zsbVar.g = j4;
            zsbVar.d = zen.a(i5);
            zsbVar.h = j5;
            return zsbVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static x75 j(TypedArray typedArray, int i, x75 x75Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new n0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new ixf(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return x75Var;
    }

    @Override // defpackage.a1h
    public final b1h a(float f) {
        zsb l = l();
        l.n(f);
        return l.a();
    }

    @Override // defpackage.a1h
    public final b1h[] c() {
        return new b1h[]{this};
    }

    @Override // defpackage.a1h
    public final b1h e(ixf ixfVar) {
        zsb l = l();
        l.e = ixfVar;
        l.f = ixfVar;
        l.g = ixfVar;
        l.h = ixfVar;
        return l.a();
    }

    @Override // defpackage.a1h
    public final boolean f() {
        return false;
    }

    public final boolean k(RectF rectF) {
        boolean z;
        boolean z2;
        if (this.l.getClass().equals(m67.class) && this.j.getClass().equals(m67.class) && this.i.getClass().equals(m67.class) && this.k.getClass().equals(m67.class)) {
            z = true;
        } else {
            z = false;
        }
        float a = this.e.a(rectF);
        if (this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || !(this.b instanceof sag) || !(this.a instanceof sag) || !(this.c instanceof sag) || !(this.d instanceof sag)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zsb, java.lang.Object] */
    public final zsb l() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.a1h
    public final b1h d() {
        return this;
    }

    @Override // defpackage.a1h
    public final b1h b(int[] iArr) {
        return this;
    }
}
