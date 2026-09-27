package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class qjb implements y5h {
    public final Context a;
    public ListAdapter b;
    public m27 c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public dg5 n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final kg0 z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = bd0.API_PRIORITY_OTHER;
    public final njb r = new njb(this, 1);
    public final pjb s = new pjb(this, 0);
    public final ojb t = new ojb(this);
    public final njb u = new njb(this, 0);
    public final Rect w = new Rect();

    /* JADX WARN: Type inference failed for: r1v9, types: [kg0, android.widget.PopupWindow] */
    public qjb(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ulf.o, i, i2);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ulf.s, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = qen.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.z = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // defpackage.y5h
    public final boolean a() {
        return this.z.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.y5h
    public final void dismiss() {
        kg0 kg0Var = this.z;
        kg0Var.dismiss();
        kg0Var.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final Drawable f() {
        return this.z.getBackground();
    }

    public final void i(int i) {
        this.g = i;
        this.i = true;
    }

    public final int l() {
        if (!this.i) {
            return 0;
        }
        return this.g;
    }

    public void m(ListAdapter listAdapter) {
        dg5 dg5Var = this.n;
        if (dg5Var == null) {
            this.n = new dg5(this, 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dg5Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        m27 m27Var = this.c;
        if (m27Var != null) {
            m27Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.y5h
    public final void n() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        m27 m27Var;
        int i4;
        int i5;
        m27 m27Var2 = this.c;
        Context context = this.a;
        kg0 kg0Var = this.z;
        int i6 = 0;
        if (m27Var2 == null) {
            m27 q = q(context, !this.y);
            this.c = q;
            q.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new kjb(this, 0));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            kg0Var.setContentView(this.c);
        }
        Drawable background = kg0Var.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.i) {
                this.g = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (kg0Var.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = ljb.a(kg0Var, this.o, this.g, z);
        int i8 = this.d;
        if (i8 == -1) {
            i3 = a + i;
        } else {
            int i9 = this.e;
            if (i9 != -2) {
                if (i9 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a2 = this.c.a(makeMeasureSpec, a);
            if (a2 > 0) {
                i2 = this.c.getPaddingBottom() + this.c.getPaddingTop() + i;
            } else {
                i2 = 0;
            }
            i3 = a2 + i2;
        }
        if (kg0Var.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        kg0Var.setWindowLayoutType(this.h);
        if (kg0Var.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int i10 = this.e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.o.getWidth();
                }
                if (i8 == -1) {
                    if (z2) {
                        i8 = i3;
                    } else {
                        i8 = -1;
                    }
                    int i11 = this.e;
                    if (z2) {
                        if (i11 == -1) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        kg0Var.setWidth(i5);
                        kg0Var.setHeight(0);
                    } else {
                        if (i11 == -1) {
                            i6 = -1;
                        }
                        kg0Var.setWidth(i6);
                        kg0Var.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = i3;
                }
                kg0Var.setOutsideTouchable(true);
                View view = this.o;
                int i12 = i10;
                int i13 = this.f;
                int i14 = this.g;
                if (i12 < 0) {
                    i4 = -1;
                } else {
                    i4 = i12;
                }
                if (i8 < 0) {
                    i8 = -1;
                }
                kg0Var.update(view, i13, i14, i4, i8);
                return;
            }
            return;
        }
        int i15 = this.e;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.o.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = i3;
        }
        kg0Var.setWidth(i15);
        kg0Var.setHeight(i8);
        mjb.b(kg0Var, true);
        kg0Var.setOutsideTouchable(true);
        kg0Var.setTouchInterceptor(this.s);
        if (this.k) {
            kg0Var.setOverlapAnchor(this.j);
        }
        mjb.a(kg0Var, this.x);
        kg0Var.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (m27Var = this.c) != null) {
            m27Var.setListSelectionHidden(true);
            m27Var.requestLayout();
        }
        if (!this.y) {
            this.v.post(this.u);
        }
    }

    @Override // defpackage.y5h
    public final m27 o() {
        return this.c;
    }

    public final void p(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public m27 q(Context context, boolean z) {
        return new m27(context, z);
    }

    public final void r(int i) {
        Drawable background = this.z.getBackground();
        if (background != null) {
            Rect rect = this.w;
            background.getPadding(rect);
            this.e = rect.left + rect.right + i;
            return;
        }
        this.e = i;
    }
}
