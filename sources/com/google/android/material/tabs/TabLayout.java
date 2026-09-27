package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.polymarket.android.R;
import defpackage.a5c;
import defpackage.b7;
import defpackage.bd0;
import defpackage.d55;
import defpackage.d77;
import defpackage.dg5;
import defpackage.dmk;
import defpackage.jlf;
import defpackage.jyn;
import defpackage.m5n;
import defpackage.na0;
import defpackage.o2n;
import defpackage.pxe;
import defpackage.qak;
import defpackage.qen;
import defpackage.qji;
import defpackage.qxe;
import defpackage.rhn;
import defpackage.rji;
import defpackage.sji;
import defpackage.trd;
import defpackage.u8m;
import defpackage.uen;
import defpackage.uji;
import defpackage.ulf;
import defpackage.vji;
import defpackage.wen;
import defpackage.wji;
import defpackage.yji;
import defpackage.z65;
import defpackage.zen;
import defpackage.zh1;
import defpackage.zji;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@qak
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    public static final qxe f1 = new qxe(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public z65 I;
    public final TimeInterpolator J;
    public rji K;
    public final ArrayList L;
    public zji M;
    public ValueAnimator N;
    public ViewPager O;
    public trd P;
    public dg5 Q;
    public wji R;
    public qji S;
    public boolean T;
    public int V;
    public final pxe W;
    public int a;
    public final ArrayList b;
    public vji c;
    public final uji d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final float q;
    public final float r;
    public final float s;
    public final int t;
    public int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public int z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(u8m.e(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        int i;
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.u = bd0.API_PRIORITY_OTHER;
        this.F = -1;
        this.L = new ArrayList();
        this.W = new pxe(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        uji ujiVar = new uji(this, context2);
        this.d = ujiVar;
        super.addView(ujiVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d = o2n.d(context2, attributeSet, jlf.N, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList a = jyn.a(getBackground());
        if (a != null) {
            a5c a5cVar = new a5c();
            a5cVar.s(a);
            a5cVar.o(context2);
            a5cVar.r(getElevation());
            setBackground(a5cVar);
        }
        setSelectedTabIndicator(wen.d(context2, d, 5));
        setSelectedTabIndicatorColor(d.getColor(8, 0));
        ujiVar.b(d.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d.getInt(10, 0));
        setTabIndicatorAnimationMode(d.getInt(7, 0));
        setTabIndicatorFullWidth(d.getBoolean(9, true));
        int dimensionPixelSize = d.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = d.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = d.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = d.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = d.getDimensionPixelSize(17, dimensionPixelSize);
        if (uen.b(context2.getTheme(), R.attr.isMaterial3Theme, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = d.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = ulf.w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.l = wen.b(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d.hasValue(22)) {
                i = d.getResourceId(22, resourceId);
                this.k = i;
            } else {
                i = -1;
            }
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i, iArr);
                try {
                    this.r = obtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList b = wen.b(context2, obtainStyledAttributes, 3);
                    if (b != null) {
                        this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{b.getColorForState(new int[]{android.R.attr.state_selected}, b.getDefaultColor()), this.l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (d.hasValue(25)) {
                this.l = wen.b(context2, d, 25);
            }
            if (d.hasValue(23)) {
                this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{d.getColor(23, 0), this.l.getDefaultColor()});
            }
            this.m = wen.b(context2, d, 3);
            m5n.c(d.getInt(4, -1), null);
            this.n = wen.b(context2, d, 21);
            this.A = d.getInt(6, 300);
            this.J = rhn.c(context2, R.attr.motionEasingEmphasizedInterpolator, na0.b);
            this.v = d.getDimensionPixelSize(14, -1);
            this.w = d.getDimensionPixelSize(13, -1);
            this.t = d.getResourceId(0, 0);
            this.y = d.getDimensionPixelSize(1, 0);
            this.C = d.getInt(15, 1);
            this.z = d.getInt(2, 0);
            this.D = d.getBoolean(12, false);
            this.H = d.getBoolean(26, false);
            d.recycle();
            Resources resources = getResources();
            this.s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int i2 = this.C;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.x;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        boolean z;
        boolean z2;
        uji ujiVar = this.d;
        int childCount = ujiVar.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ujiVar.getChildAt(i2);
                boolean z3 = true;
                if ((i2 == i && !childAt.isSelected()) || (i2 != i && childAt.isSelected())) {
                    if (i2 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                    if (i2 != i) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                    if (childAt instanceof yji) {
                        ((yji) childAt).f();
                    }
                } else {
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    childAt.setSelected(z);
                    if (i2 != i) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                }
            }
        }
    }

    public final void a(vji vjiVar, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (vjiVar.d == this) {
            vjiVar.b = size;
            arrayList.add(size, vjiVar);
            int size2 = arrayList.size();
            int i = -1;
            for (int i2 = size + 1; i2 < size2; i2++) {
                if (((vji) arrayList.get(i2)).b == this.a) {
                    i = i2;
                }
                ((vji) arrayList.get(i2)).b = i2;
            }
            this.a = i;
            yji yjiVar = vjiVar.e;
            yjiVar.setSelected(false);
            yjiVar.setActivated(false);
            int i3 = vjiVar.b;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.C == 1 && this.z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.d.addView(yjiVar, i3, layoutParams);
            if (z) {
                TabLayout tabLayout = vjiVar.d;
                if (tabLayout != null) {
                    tabLayout.j(vjiVar, true);
                    return;
                } else {
                    dmk.v("Tab not attached to a TabLayout");
                    return;
                }
            }
            return;
        }
        dmk.v("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            uji ujiVar = this.d;
            int childCount = ujiVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (ujiVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int d = d(0.0f, i);
            if (scrollX != d) {
                e();
                this.N.setIntValues(scrollX, d);
                this.N.start();
            }
            ValueAnimator valueAnimator = ujiVar.a;
            if (valueAnimator != null && valueAnimator.isRunning() && ujiVar.b.a != i) {
                ujiVar.a.cancel();
            }
            ujiVar.d(i, this.A, true);
            return;
        }
        l(i, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int max;
        int i = this.C;
        if (i != 0 && i != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.y - this.e);
        }
        uji ujiVar = this.d;
        ujiVar.setPaddingRelative(max, 0, 0, 0);
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                if (this.z == 2) {
                    m0.p("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                ujiVar.setGravity(1);
            }
        } else {
            int i3 = this.z;
            if (i3 != 0) {
                if (i3 == 1) {
                    ujiVar.setGravity(1);
                }
            } else {
                m0.p("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            }
            ujiVar.setGravity(8388611);
        }
        n(true);
    }

    public final int d(float f, int i) {
        uji ujiVar;
        View childAt;
        View view;
        int i2 = this.C;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = (ujiVar = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < ujiVar.getChildCount()) {
            view = ujiVar.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + i3) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public final void e() {
        if (this.N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.N = valueAnimator;
            valueAnimator.setInterpolator(this.J);
            this.N.setDuration(this.A);
            this.N.addUpdateListener(new zh1(this, 4));
        }
    }

    public final vji f(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (vji) this.b.get(i);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [vji, java.lang.Object] */
    public final vji g() {
        yji yjiVar;
        vji vjiVar = (vji) f1.c();
        vji vjiVar2 = vjiVar;
        if (vjiVar == null) {
            ?? obj = new Object();
            obj.b = -1;
            vjiVar2 = obj;
        }
        vjiVar2.d = this;
        pxe pxeVar = this.W;
        if (pxeVar != null) {
            yjiVar = (yji) pxeVar.c();
        } else {
            yjiVar = null;
        }
        if (yjiVar == null) {
            yjiVar = new yji(this, getContext());
        }
        yjiVar.setTab(vjiVar2);
        yjiVar.setFocusable(true);
        yjiVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            yjiVar.setContentDescription(vjiVar2.a);
        } else {
            yjiVar.setContentDescription(null);
        }
        vjiVar2.e = yjiVar;
        return vjiVar2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        vji vjiVar = this.c;
        if (vjiVar != null) {
            return vjiVar.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void h() {
        int currentItem;
        i();
        trd trdVar = this.P;
        if (trdVar != null) {
            int count = trdVar.getCount();
            for (int i = 0; i < count; i++) {
                vji g = g();
                CharSequence pageTitle = this.P.getPageTitle(i);
                if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(pageTitle)) {
                    g.e.setContentDescription(pageTitle);
                }
                g.a = pageTitle;
                yji yjiVar = g.e;
                if (yjiVar != null) {
                    yjiVar.d();
                }
                a(g, false);
            }
            ViewPager viewPager = this.O;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                j(f(currentItem), true);
            }
        }
    }

    public final void i() {
        uji ujiVar = this.d;
        int childCount = ujiVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            yji yjiVar = (yji) ujiVar.getChildAt(childCount);
            ujiVar.removeViewAt(childCount);
            if (yjiVar != null) {
                yjiVar.setTab(null);
                yjiVar.setSelected(false);
                this.W.a(yjiVar);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            vji vjiVar = (vji) it.next();
            it.remove();
            vjiVar.d = null;
            vjiVar.e = null;
            vjiVar.a = null;
            vjiVar.b = -1;
            vjiVar.c = null;
            f1.a(vjiVar);
        }
        this.c = null;
    }

    public final void j(vji vjiVar, boolean z) {
        int i;
        TabLayout tabLayout;
        vji vjiVar2 = this.c;
        ArrayList arrayList = this.L;
        if (vjiVar2 == vjiVar) {
            if (vjiVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((rji) arrayList.get(size)).getClass();
                }
                b(vjiVar.b);
                return;
            }
            return;
        }
        if (vjiVar != null) {
            i = vjiVar.b;
        } else {
            i = -1;
        }
        if (z) {
            if ((vjiVar2 != null && vjiVar2.b != -1) || i == -1) {
                tabLayout = this;
                tabLayout.b(i);
            } else {
                tabLayout = this;
                tabLayout.l(i, 0.0f, true, true, true);
            }
            if (i != -1) {
                tabLayout.setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.c = vjiVar;
        if (vjiVar2 != null && vjiVar2.d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((rji) arrayList.get(size2)).getClass();
            }
        }
        if (vjiVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((rji) arrayList.get(size3)).a(vjiVar);
            }
        }
    }

    public final void k(trd trdVar, boolean z) {
        dg5 dg5Var;
        trd trdVar2 = this.P;
        if (trdVar2 != null && (dg5Var = this.Q) != null) {
            trdVar2.unregisterDataSetObserver(dg5Var);
        }
        this.P = trdVar;
        if (z && trdVar != null) {
            dg5 dg5Var2 = this.Q;
            if (dg5Var2 == null) {
                dg5Var2 = new dg5(this, 2);
                this.Q = dg5Var2;
            }
            trdVar.registerDataSetObserver(dg5Var2);
        }
        h();
    }

    public final void l(int i, float f, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0) {
            uji ujiVar = this.d;
            if (round < ujiVar.getChildCount()) {
                if (z2) {
                    ujiVar.b.a = Math.round(f2);
                    ValueAnimator valueAnimator = ujiVar.a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        ujiVar.a.cancel();
                    }
                    ujiVar.c(ujiVar.getChildAt(i), ujiVar.getChildAt(i + 1), f);
                }
                ValueAnimator valueAnimator2 = this.N;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.N.cancel();
                }
                int d = d(f, i);
                int scrollX = getScrollX();
                if ((i < getSelectedTabPosition() && d >= scrollX) || ((i > getSelectedTabPosition() && d <= scrollX) || i == getSelectedTabPosition())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (getLayoutDirection() == 1) {
                    if ((i < getSelectedTabPosition() && d <= scrollX) || ((i > getSelectedTabPosition() && d >= scrollX) || i == getSelectedTabPosition())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (z4 || this.V == 1 || z3) {
                    if (i < 0) {
                        d = 0;
                    }
                    scrollTo(d, 0);
                }
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void m(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.O;
        if (viewPager2 != null) {
            wji wjiVar = this.R;
            if (wjiVar != null && (arrayList2 = viewPager2.R) != null) {
                arrayList2.remove(wjiVar);
            }
            qji qjiVar = this.S;
            if (qjiVar != null && (arrayList = this.O.T) != null) {
                arrayList.remove(qjiVar);
            }
        }
        zji zjiVar = this.M;
        ArrayList arrayList3 = this.L;
        if (zjiVar != null) {
            arrayList3.remove(zjiVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.O = viewPager;
            wji wjiVar2 = this.R;
            if (wjiVar2 == null) {
                wjiVar2 = new wji(this);
                this.R = wjiVar2;
            }
            wjiVar2.c = 0;
            wjiVar2.b = 0;
            ArrayList arrayList4 = viewPager.R;
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                viewPager.R = arrayList4;
            }
            arrayList4.add(wjiVar2);
            zji zjiVar2 = new zji(viewPager, 0);
            this.M = zjiVar2;
            if (!arrayList3.contains(zjiVar2)) {
                arrayList3.add(zjiVar2);
            }
            trd adapter = viewPager.getAdapter();
            if (adapter != null) {
                k(adapter, true);
            }
            qji qjiVar2 = this.S;
            if (qjiVar2 == null) {
                qjiVar2 = new qji(this);
                this.S = qjiVar2;
            }
            qjiVar2.a = true;
            ArrayList arrayList5 = viewPager.T;
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                viewPager.T = arrayList5;
            }
            arrayList5.add(qjiVar2);
            l(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.O = null;
            k(null, false);
        }
        this.T = z;
    }

    public final void n(boolean z) {
        int i = 0;
        while (true) {
            uji ujiVar = this.d;
            if (i < ujiVar.getChildCount()) {
                View childAt = ujiVar.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.C == 1 && this.z == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof a5c) {
            zen.c(this, (a5c) background);
        }
        if (this.O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = 0;
        while (true) {
            uji ujiVar = this.d;
            if (i < ujiVar.getChildCount()) {
                View childAt = ujiVar.getChildAt(i);
                if (childAt instanceof yji) {
                    yji yjiVar = (yji) childAt;
                    int i2 = yji.l;
                    Drawable drawable = yjiVar.i;
                    if (drawable != null) {
                        drawable.setBounds(yjiVar.getLeft(), yjiVar.getTop(), yjiVar.getRight(), yjiVar.getBottom());
                        yjiVar.i.draw(canvas);
                    }
                }
                i++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b7.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int round = Math.round(m5n.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.w;
            if (i3 <= 0) {
                i3 = (int) (size - m5n.b(getContext(), 56));
            }
            this.u = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.C;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof a5c) {
            ((a5c) background).r(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.D != z) {
            this.D = z;
            int i = 0;
            while (true) {
                uji ujiVar = this.d;
                if (i < ujiVar.getChildCount()) {
                    View childAt = ujiVar.getChildAt(i);
                    if (childAt instanceof yji) {
                        yji yjiVar = (yji) childAt;
                        yjiVar.setOrientation(!yjiVar.k.D ? 1 : 0);
                        TextView textView = yjiVar.g;
                        if (textView == null && yjiVar.h == null) {
                            yjiVar.g(yjiVar.b, yjiVar.c, true);
                        } else {
                            yjiVar.g(textView, yjiVar.h, false);
                        }
                    }
                    i++;
                } else {
                    c();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(rji rjiVar) {
        rji rjiVar2 = this.K;
        ArrayList arrayList = this.L;
        if (rjiVar2 != null) {
            arrayList.remove(rjiVar2);
        }
        this.K = rjiVar;
        if (rjiVar != null && !arrayList.contains(rjiVar)) {
            arrayList.add(rjiVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.o = mutate;
        int i = this.p;
        if (i != 0) {
            mutate.setTint(i);
        } else {
            mutate.setTintList(null);
        }
        int i2 = this.F;
        if (i2 == -1) {
            i2 = this.o.getIntrinsicHeight();
        }
        this.d.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        n(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.B != i) {
            this.B = i;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.F = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.z != i) {
            this.z = i;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yji yjiVar = ((vji) arrayList.get(i)).e;
                if (yjiVar != null) {
                    yjiVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(d55.e(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.G = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.I = new d77(1);
                    return;
                }
                throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
            }
            this.I = new d77(0);
            return;
        }
        this.I = new z65(29);
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        int i = uji.c;
        uji ujiVar = this.d;
        ujiVar.a(ujiVar.b.getSelectedTabPosition());
        ujiVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.C) {
            this.C = i;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            int i = 0;
            while (true) {
                uji ujiVar = this.d;
                if (i < ujiVar.getChildCount()) {
                    View childAt = ujiVar.getChildAt(i);
                    if (childAt instanceof yji) {
                        Context context = getContext();
                        int i2 = yji.l;
                        ((yji) childAt).e(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(d55.e(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yji yjiVar = ((vji) arrayList.get(i)).e;
                if (yjiVar != null) {
                    yjiVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(trd trdVar) {
        k(trdVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.H != z) {
            this.H = z;
            int i = 0;
            while (true) {
                uji ujiVar = this.d;
                if (i < ujiVar.getChildCount()) {
                    View childAt = ujiVar.getChildAt(i);
                    if (childAt instanceof yji) {
                        Context context = getContext();
                        int i2 = yji.l;
                        ((yji) childAt).e(context);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(sji sjiVar) {
        setOnTabSelectedListener((rji) sjiVar);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(qen.b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
