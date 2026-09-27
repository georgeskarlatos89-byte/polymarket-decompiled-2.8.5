package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.polymarket.android.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y8 implements bbc {
    public final Context a;
    public Context b;
    public cac c;
    public final LayoutInflater d;
    public abc e;
    public fbc f;
    public x8 g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public v8 q;
    public v8 r;
    public ptl s;
    public w8 t;
    public final SparseBooleanArray p = new SparseBooleanArray();
    public final jw8 u = new jw8(this, 2);

    public y8(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ebc] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(kac kacVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = kacVar.getActionView();
        int i = 0;
        if (actionView == null || kacVar.e()) {
            if (view instanceof ebc) {
                actionMenuItemView = (ebc) view;
            } else {
                actionMenuItemView = (ebc) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            }
            actionMenuItemView.b(kacVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f);
            w8 w8Var = this.t;
            if (w8Var == null) {
                w8Var = new w8(this);
                this.t = w8Var;
            }
            actionMenuItemView2.setPopupCallback(w8Var);
            actionView = actionMenuItemView;
        }
        if (kacVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof a9)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bbc
    public final boolean b(fai faiVar) {
        boolean z;
        if (faiVar.hasVisibleItems()) {
            fai faiVar2 = faiVar;
            while (true) {
                cac cacVar = faiVar2.z;
                if (cacVar == this.c) {
                    break;
                }
                faiVar2 = (fai) cacVar;
            }
            kac kacVar = faiVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ebc) && ((ebc) childAt).getItemData() == kacVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = faiVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        MenuItem item = faiVar.getItem(i2);
                        if (item.isVisible() && item.getIcon() != null) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                v8 v8Var = new v8(this, this.b, faiVar, view);
                this.r = v8Var;
                v8Var.h = z;
                rac racVar = v8Var.j;
                if (racVar != null) {
                    racVar.m(z);
                }
                v8 v8Var2 = this.r;
                if (!v8Var2.b()) {
                    if (v8Var2.f != null) {
                        v8Var2.d(0, 0, false, false);
                    } else {
                        dmk.n("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                abc abcVar = this.e;
                if (abcVar != null) {
                    abcVar.p(faiVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbc
    public final boolean c(kac kacVar) {
        return false;
    }

    @Override // defpackage.bbc
    public final void d(abc abcVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bbc
    public final void e() {
        int i;
        kac kacVar;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            cac cacVar = this.c;
            if (cacVar != null) {
                cacVar.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    kac kacVar2 = (kac) l.get(i2);
                    if ((kacVar2.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof ebc) {
                            kacVar = ((ebc) childAt).getItemData();
                        } else {
                            kacVar = null;
                        }
                        View a = a(kacVar2, childAt, viewGroup);
                        if (kacVar2 != kacVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        cac cacVar2 = this.c;
        if (cacVar2 != null) {
            cacVar2.i();
            ArrayList arrayList2 = cacVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                lac lacVar = ((kac) arrayList2.get(i3)).A;
            }
        }
        cac cacVar3 = this.c;
        if (cacVar3 != null) {
            cacVar3.i();
            arrayList = cacVar3.j;
        }
        if (this.j && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((kac) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        x8 x8Var = this.g;
        if (z) {
            if (x8Var == null) {
                x8Var = new x8(this, this.a);
                this.g = x8Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) x8Var.getParent();
            if (viewGroup3 != this.f) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                x8 x8Var2 = this.g;
                actionMenuView.getClass();
                a9 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(x8Var2, j);
            }
        } else if (x8Var != null) {
            Object parent = x8Var.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.j);
    }

    @Override // defpackage.bbc
    public final boolean f() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        y8 y8Var = this;
        cac cacVar = y8Var.c;
        if (cacVar != null) {
            arrayList = cacVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = y8Var.n;
        int i4 = y8Var.m;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) y8Var.f;
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            kac kacVar = (kac) arrayList.get(i5);
            int i8 = kacVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z5 = true;
            }
            if (y8Var.o && kacVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (y8Var.j && (z5 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = y8Var.p;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            kac kacVar2 = (kac) arrayList.get(i10);
            int i12 = kacVar2.y;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = kacVar2.b;
            if (z2) {
                View a = y8Var.a(kacVar2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                kacVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z6) && i4 > 0) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    View a2 = y8Var.a(kacVar2, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    if (i4 + i11 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 &= z4;
                }
                if (z3 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z6) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        kac kacVar3 = (kac) arrayList.get(i14);
                        if (kacVar3.b == i13) {
                            if ((kacVar3.x & 32) == 32) {
                                i9++;
                            }
                            kacVar3.f(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                kacVar2.f(z3);
            } else {
                kacVar2.f(false);
                i10++;
                i2 = 2;
                y8Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            y8Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.bbc
    public final void g(cac cacVar, boolean z) {
        j();
        v8 v8Var = this.r;
        if (v8Var != null && v8Var.b()) {
            v8Var.j.dismiss();
        }
        abc abcVar = this.e;
        if (abcVar != null) {
            abcVar.g(cacVar, z);
        }
    }

    @Override // defpackage.bbc
    public final boolean h(kac kacVar) {
        return false;
    }

    @Override // defpackage.bbc
    public final void i(Context context, cac cacVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = cacVar;
        Resources resources = context.getResources();
        if (!this.k) {
            this.j = true;
        }
        int i = 2;
        this.l = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.n = i;
        int i4 = this.l;
        if (this.j) {
            if (this.g == null) {
                x8 x8Var = new x8(this, this.a);
                this.g = x8Var;
                if (this.i) {
                    x8Var.setImageDrawable(this.h);
                    this.h = null;
                    this.i = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.m = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean j() {
        Object obj;
        ptl ptlVar = this.s;
        if (ptlVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(ptlVar);
            this.s = null;
            return true;
        }
        v8 v8Var = this.q;
        if (v8Var != null) {
            if (v8Var.b()) {
                v8Var.j.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean k() {
        v8 v8Var = this.q;
        if (v8Var != null && v8Var.b()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        cac cacVar;
        if (this.j && !k() && (cacVar = this.c) != null && this.f != null && this.s == null) {
            cacVar.i();
            if (!cacVar.j.isEmpty()) {
                ptl ptlVar = new ptl(this, new v8(this, this.b, this.c, this.g), false, 3);
                this.s = ptlVar;
                ((View) this.f).post(ptlVar);
                return true;
            }
        }
        return false;
    }
}
