package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.a2d;
import defpackage.b7h;
import defpackage.d55;
import defpackage.d9k;
import defpackage.dmk;
import defpackage.fyg;
import defpackage.jw8;
import defpackage.k9k;
import defpackage.l0;
import defpackage.olf;
import defpackage.omf;
import defpackage.p65;
import defpackage.pxe;
import defpackage.py2;
import defpackage.q24;
import defpackage.q65;
import defpackage.qxe;
import defpackage.r65;
import defpackage.s65;
import defpackage.t65;
import defpackage.tv4;
import defpackage.u65;
import defpackage.v65;
import defpackage.vlk;
import defpackage.x9k;
import defpackage.z1d;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements z1d, a2d {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final tv4 w;
    public static final qxe x;
    public final ArrayList a;
    public final fyg b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public u65 l;
    public boolean m;
    public vlk n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public jw8 r;
    public final q24 s;

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        t = str;
        w = new tv4(2);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new qxe(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.a = new ArrayList();
        this.b = new fyg(15);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.s = new q24(8, (byte) 0);
        int[] iArr = olf.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.i[i] = (int) (r10[i] * f);
            }
        }
        this.p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new s65(this));
        WeakHashMap weakHashMap = k9k.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) x.c();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void k(int i, Rect rect, Rect rect2, t65 t65Var, int i2, int i3) {
        int width;
        int height;
        int i4 = t65Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = t65Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t65 m(View view) {
        t65 t65Var = (t65) view.getLayoutParams();
        if (!t65Var.b) {
            if (view instanceof p65) {
                q65 behavior = ((p65) view).getBehavior();
                if (behavior == null) {
                    m0.d("CoordinatorLayout", "Attached behavior class is null");
                }
                t65Var.b(behavior);
                t65Var.b = true;
                return t65Var;
            }
            r65 r65Var = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                r65Var = (r65) cls.getAnnotation(r65.class);
                if (r65Var != null) {
                    break;
                }
            }
            if (r65Var != null) {
                try {
                    t65Var.b((q65) r65Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    m0.e("CoordinatorLayout", "Default behavior class " + r65Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            t65Var.b = true;
        }
        return t65Var;
    }

    public static void u(View view, int i) {
        t65 t65Var = (t65) view.getLayoutParams();
        int i2 = t65Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = k9k.a;
            view.offsetLeftAndRight(i - i2);
            t65Var.i = i;
        }
    }

    public static void v(View view, int i) {
        t65 t65Var = (t65) view.getLayoutParams();
        int i2 = t65Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = k9k.a;
            view.offsetTopAndBottom(i - i2);
            t65Var.j = i;
        }
    }

    @Override // defpackage.z1d
    public final void b(View view, View view2, int i, int i2) {
        q24 q24Var = this.s;
        if (i2 == 1) {
            q24Var.c = i;
        } else {
            q24Var.b = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((t65) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.z1d
    public final void c(View view, int i) {
        q24 q24Var = this.s;
        if (i == 1) {
            q24Var.c = 0;
        } else {
            q24Var.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            t65 t65Var = (t65) childAt.getLayoutParams();
            if (t65Var.a(i)) {
                q65 q65Var = t65Var.a;
                if (q65Var != null) {
                    q65Var.u(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        t65Var.n = false;
                    }
                } else {
                    t65Var.m = false;
                }
                t65Var.o = false;
            }
        }
        this.k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof t65) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.z1d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        q65 q65Var;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                t65 t65Var = (t65) childAt.getLayoutParams();
                if (t65Var.a(i3) && (q65Var = t65Var.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    q65Var.o(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, iArr2[0]);
                    } else {
                        min = Math.min(i4, iArr2[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr2[1]);
                    } else {
                        min2 = Math.min(i5, iArr2[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        q65 q65Var = ((t65) view.getLayoutParams()).a;
        if (q65Var != null) {
            q65Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(t65 t65Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) t65Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) t65Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) t65Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) t65Var).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // defpackage.a2d
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        q65 q65Var;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                t65 t65Var = (t65) childAt.getLayoutParams();
                if (t65Var.a(i5) && (q65Var = t65Var.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    q65Var.p(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        i6 = Math.max(i6, iArr2[0]);
                    } else {
                        i6 = Math.min(i6, iArr2[0]);
                    }
                    if (i4 > 0) {
                        i7 = Math.max(i7, iArr2[1]);
                    } else {
                        i7 = Math.min(i7, iArr2[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            o(1);
        }
    }

    @Override // defpackage.z1d
    public final void g(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new t65();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t65) {
            return new t65((t65) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t65((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t65(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.a);
    }

    public final vlk getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q24 q24Var = this.s;
        return q24Var.c | q24Var.b;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // defpackage.z1d
    public final boolean h(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                t65 t65Var = (t65) childAt.getLayoutParams();
                q65 q65Var = t65Var.a;
                if (q65Var != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean t2 = q65Var.t(coordinatorLayout, childAt, view3, i3, i4);
                    z |= t2;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            t65Var.n = t2;
                        }
                    } else {
                        t65Var.m = t2;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            t65Var.n = false;
                        }
                    } else {
                        t65Var.m = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    public final void i(View view, Rect rect, boolean z) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                x9k.a(this, view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        b7h b7hVar = (b7h) this.b.c;
        int i = b7hVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) b7hVar.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b7hVar.f(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final int l(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            m0.d("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        m0.d("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean n(View view, int i, int i2) {
        qxe qxeVar = x;
        Rect a = a();
        x9k.a(this, view, a);
        try {
            return a.contains(i, i2);
        } finally {
            a.setEmpty();
            qxeVar.a(a);
        }
    }

    public final void o(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList2;
        t65 t65Var;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        boolean z4;
        q65 q65Var;
        WeakHashMap weakHashMap = k9k.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.a;
        int size = arrayList3.size();
        Rect a = a();
        Rect a2 = a();
        Rect a3 = a();
        int i13 = 0;
        while (true) {
            qxe qxeVar = x;
            if (i13 < size) {
                View view2 = (View) arrayList3.get(i13);
                t65 t65Var2 = (t65) view2.getLayoutParams();
                if (i == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i3 = size;
                    rect = a3;
                    i2 = i13;
                } else {
                    int i14 = 0;
                    while (i14 < i13) {
                        if (t65Var2.l == ((View) arrayList3.get(i14))) {
                            t65 t65Var3 = (t65) view2.getLayoutParams();
                            if (t65Var3.k != null) {
                                Rect a4 = a();
                                Rect a5 = a();
                                t65 t65Var4 = t65Var2;
                                Rect a6 = a();
                                x9k.a(this, t65Var3.k, a4);
                                i(view2, a5, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                View view3 = view2;
                                int measuredHeight = view3.getMeasuredHeight();
                                arrayList2 = arrayList3;
                                t65Var = t65Var4;
                                i10 = i14;
                                layoutDirection = layoutDirection;
                                i12 = i13;
                                view = view3;
                                k(layoutDirection, a4, a6, t65Var3, measuredWidth, measuredHeight);
                                i11 = size;
                                rect2 = a3;
                                if (a6.left == a5.left && a6.top == a5.top) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                e(t65Var3, a6, measuredWidth, measuredHeight);
                                int i15 = a6.left - a5.left;
                                int i16 = a6.top - a5.top;
                                if (i15 != 0) {
                                    WeakHashMap weakHashMap2 = k9k.a;
                                    view.offsetLeftAndRight(i15);
                                }
                                if (i16 != 0) {
                                    WeakHashMap weakHashMap3 = k9k.a;
                                    view.offsetTopAndBottom(i16);
                                }
                                if (z4 && (q65Var = t65Var3.a) != null) {
                                    q65Var.h(this, view, t65Var3.k);
                                }
                                a4.setEmpty();
                                qxeVar.a(a4);
                                a5.setEmpty();
                                qxeVar.a(a5);
                                a6.setEmpty();
                                qxeVar.a(a6);
                                i14 = i10 + 1;
                                t65Var2 = t65Var;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i11;
                                i13 = i12;
                                a3 = rect2;
                            }
                        }
                        arrayList2 = arrayList3;
                        t65Var = t65Var2;
                        i10 = i14;
                        i11 = size;
                        rect2 = a3;
                        i12 = i13;
                        view = view2;
                        i14 = i10 + 1;
                        t65Var2 = t65Var;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i11;
                        i13 = i12;
                        a3 = rect2;
                    }
                    ArrayList arrayList4 = arrayList3;
                    t65 t65Var5 = t65Var2;
                    int i17 = size;
                    Rect rect3 = a3;
                    i2 = i13;
                    View view4 = view2;
                    i(view4, a2, true);
                    if (t65Var5.g != 0 && !a2.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(t65Var5.g, layoutDirection);
                        int i18 = absoluteGravity & 112;
                        if (i18 != 48) {
                            if (i18 == 80) {
                                a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                            }
                        } else {
                            a.top = Math.max(a.top, a2.bottom);
                        }
                        int i19 = absoluteGravity & 7;
                        if (i19 != 3) {
                            if (i19 == 5) {
                                a.right = Math.max(a.right, getWidth() - a2.left);
                            }
                        } else {
                            a.left = Math.max(a.left, a2.right);
                        }
                    }
                    if (t65Var5.h != 0 && view4.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = k9k.a;
                        if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                            t65 t65Var6 = (t65) view4.getLayoutParams();
                            q65 q65Var2 = t65Var6.a;
                            Rect a7 = a();
                            Rect a8 = a();
                            a8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                            if (q65Var2 != null && q65Var2.e(view4)) {
                                if (!a8.contains(a7)) {
                                    py2.h("Rect should be within the child's bounds. Rect:", a7.toShortString(), " | Bounds:", a8.toShortString());
                                    return;
                                }
                            } else {
                                a7.set(a8);
                            }
                            a8.setEmpty();
                            qxeVar.a(a8);
                            if (a7.isEmpty()) {
                                a7.setEmpty();
                                qxeVar.a(a7);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(t65Var6.h, layoutDirection);
                                if ((absoluteGravity2 & 48) == 48 && (i8 = (a7.top - ((ViewGroup.MarginLayoutParams) t65Var6).topMargin) - t65Var6.j) < (i9 = a.top)) {
                                    v(view4, i9 - i8);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - ((ViewGroup.MarginLayoutParams) t65Var6).bottomMargin) + t65Var6.j) < (i7 = a.bottom)) {
                                    v(view4, height - i7);
                                    z2 = true;
                                }
                                if (!z2) {
                                    v(view4, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i5 = (a7.left - ((ViewGroup.MarginLayoutParams) t65Var6).leftMargin) - t65Var6.i) < (i6 = a.left)) {
                                    u(view4, i6 - i5);
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a7.right) - ((ViewGroup.MarginLayoutParams) t65Var6).rightMargin) + t65Var6.i) < (i4 = a.right)) {
                                    u(view4, width - i4);
                                    z3 = true;
                                }
                                if (!z3) {
                                    u(view4, 0);
                                }
                                a7.setEmpty();
                                qxeVar.a(a7);
                            }
                        }
                    }
                    if (i != 2) {
                        rect = rect3;
                        rect.set(((t65) view4.getLayoutParams()).p);
                        if (rect.equals(a2)) {
                            arrayList = arrayList4;
                            i3 = i17;
                        } else {
                            ((t65) view4.getLayoutParams()).p.set(a2);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i20 = i2 + 1;
                    i3 = i17;
                    while (true) {
                        arrayList = arrayList4;
                        if (i20 >= i3) {
                            break;
                        }
                        View view5 = (View) arrayList.get(i20);
                        t65 t65Var7 = (t65) view5.getLayoutParams();
                        q65 q65Var3 = t65Var7.a;
                        if (q65Var3 != null && q65Var3.f(view5, view4)) {
                            if (i == 0 && t65Var7.o) {
                                t65Var7.o = false;
                            } else {
                                if (i != 2) {
                                    z = q65Var3.h(this, view5, view4);
                                } else {
                                    q65Var3.i(this, view4);
                                    z = true;
                                }
                                if (i == 1) {
                                    t65Var7.o = z;
                                }
                            }
                        }
                        i20++;
                        arrayList4 = arrayList;
                    }
                }
                i13 = i2 + 1;
                a3 = rect;
                size = i3;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a3;
                a.setEmpty();
                qxeVar.a(a);
                a2.setEmpty();
                qxeVar.a(a2);
                rect4.setEmpty();
                qxeVar.a(rect4);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.m) {
            if (this.l == null) {
                this.l = new u65(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = k9k.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            c(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.o && this.p != null) {
            vlk vlkVar = this.n;
            if (vlkVar != null) {
                i = vlkVar.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.p.setBounds(0, 0, getWidth(), i);
                this.p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        q65 q65Var;
        WeakHashMap weakHashMap = k9k.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((q65Var = ((t65) view.getLayoutParams()).a) == null || !q65Var.l(this, view, layoutDirection))) {
                p(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        q65 q65Var;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        View view;
        int i15;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 < childCount) {
                View childAt = coordinatorLayout.getChildAt(i16);
                b7h b7hVar = (b7h) coordinatorLayout.b.c;
                int i17 = b7hVar.c;
                for (int i18 = 0; i18 < i17; i18++) {
                    ArrayList arrayList2 = (ArrayList) b7hVar.j(i18);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z = true;
                        break loop0;
                    }
                }
                i16++;
            } else {
                z = false;
                break;
            }
        }
        if (z != coordinatorLayout.m) {
            boolean z5 = coordinatorLayout.h;
            if (z) {
                if (z5) {
                    if (coordinatorLayout.l == null) {
                        coordinatorLayout.l = new u65(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = true;
            } else {
                if (z5 && coordinatorLayout.l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = k9k.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.n != null && coordinatorLayout.getFitsSystemWindows()) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList3 = coordinatorLayout.a;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i15 = i21;
                i9 = paddingLeft;
                suggestedMinimumWidth = i23;
                z4 = false;
                i11 = paddingRight;
            } else {
                t65 t65Var = (t65) view2.getLayoutParams();
                int i24 = t65Var.e;
                if (i24 >= 0 && mode != 0) {
                    int l = coordinatorLayout.l(i24);
                    int i25 = t65Var.c;
                    if (i25 == 0) {
                        i25 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z2) || (absoluteGravity == 5 && z2)) {
                        max = Math.max(0, (size - paddingRight) - l);
                    } else if ((absoluteGravity == 5 && !z2) || (absoluteGravity == 3 && z2)) {
                        max = Math.max(0, l - paddingLeft);
                    }
                    int i26 = size3;
                    i5 = max;
                    i4 = i26;
                    if (!z3 && !view2.getFitsSystemWindows()) {
                        i6 = i4;
                        int c = coordinatorLayout.n.c() + coordinatorLayout.n.b();
                        int a = coordinatorLayout.n.a() + coordinatorLayout.n.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    } else {
                        i6 = i4;
                        i7 = i;
                        i8 = i2;
                    }
                    q65Var = t65Var.a;
                    if (q65Var == null) {
                        z4 = false;
                        i9 = paddingLeft;
                        i10 = i23;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        int i27 = i7;
                        i15 = i21;
                        int i28 = i8;
                        boolean m = q65Var.m(this, view2, i27, i5, i28);
                        view = view2;
                        i7 = i27;
                        i13 = i5;
                        i14 = i28;
                        if (m) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) t65Var).leftMargin + ((ViewGroup.MarginLayoutParams) t65Var).rightMargin);
                            int max3 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) t65Var).topMargin + ((ViewGroup.MarginLayoutParams) t65Var).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i9 = paddingLeft;
                        i10 = i23;
                        z4 = false;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        i13 = i5;
                        i14 = i8;
                        view = view2;
                        i15 = i21;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                    int max22 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) t65Var).leftMargin + ((ViewGroup.MarginLayoutParams) t65Var).rightMargin);
                    int max32 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) t65Var).topMargin + ((ViewGroup.MarginLayoutParams) t65Var).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                } else {
                    i3 = suggestedMinimumHeight;
                }
                i4 = size3;
                i5 = 0;
                if (!z3) {
                }
                i6 = i4;
                i7 = i;
                i8 = i2;
                q65Var = t65Var.a;
                if (q65Var == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                int max222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) t65Var).leftMargin + ((ViewGroup.MarginLayoutParams) t65Var).rightMargin);
                int max322 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) t65Var).topMargin + ((ViewGroup.MarginLayoutParams) t65Var).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i21 = i15 + 1;
            paddingLeft = i9;
            paddingRight = i11;
            size3 = i6;
            arrayList3 = arrayList;
        }
        int i29 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                t65 t65Var = (t65) childAt.getLayoutParams();
                if (t65Var.a(0)) {
                    q65 q65Var = t65Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        q65 q65Var;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                t65 t65Var = (t65) childAt.getLayoutParams();
                if (t65Var.a(0) && (q65Var = t65Var.a) != null) {
                    z |= q65Var.n(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof v65)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v65 v65Var = (v65) parcelable;
        super.onRestoreInstanceState(v65Var.a);
        SparseArray sparseArray = v65Var.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            q65 q65Var = m(childAt).a;
            if (id != -1 && q65Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                q65Var.r(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, l0, v65] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable s;
        ?? l0Var = new l0(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            q65 q65Var = ((t65) childAt.getLayoutParams()).a;
            if (id != -1 && q65Var != null && (s = q65Var.s(childAt)) != null) {
                sparseArray.append(id, s);
            }
        }
        l0Var.c = sparseArray;
        return l0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return h(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean v2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == null) {
            z = r(motionEvent, 1);
        } else {
            z = false;
        }
        q65 q65Var = ((t65) this.j.getLayoutParams()).a;
        if (q65Var != null) {
            v2 = q65Var.v(this, this.j, motionEvent);
            motionEvent2 = null;
            if (this.j != null) {
                v2 |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return v2;
            }
            t(false);
            return v2;
        }
        v2 = false;
        motionEvent2 = null;
        if (this.j != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return v2;
    }

    public final void p(View view, int i) {
        Rect a;
        Rect a2;
        int i2;
        t65 t65Var = (t65) view.getLayoutParams();
        View view2 = t65Var.k;
        if (view2 == null && t65Var.f != -1) {
            dmk.n("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        qxe qxeVar = x;
        if (view2 != null) {
            a = a();
            a2 = a();
            try {
                x9k.a(this, view2, a);
                t65 t65Var2 = (t65) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                k(i, a, a2, t65Var2, measuredWidth, measuredHeight);
                e(t65Var2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
                return;
            } finally {
                a.setEmpty();
                qxeVar.a(a);
                a2.setEmpty();
                qxeVar.a(a2);
            }
        }
        int i3 = t65Var.e;
        if (i3 >= 0) {
            t65 t65Var3 = (t65) view.getLayoutParams();
            int i4 = t65Var3.c;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int l = l(i3) - measuredWidth2;
            if (i5 != 1) {
                if (i5 == 5) {
                    l += measuredWidth2;
                }
            } else {
                l += measuredWidth2 / 2;
            }
            if (i6 != 16) {
                if (i6 != 80) {
                    i2 = 0;
                } else {
                    i2 = measuredHeight2;
                }
            } else {
                i2 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) t65Var3).leftMargin, Math.min(l, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) t65Var3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) t65Var3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) t65Var3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        t65 t65Var4 = (t65) view.getLayoutParams();
        a = a();
        a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) t65Var4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) t65Var4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) t65Var4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) t65Var4).bottomMargin);
        if (this.n != null) {
            WeakHashMap weakHashMap = k9k.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                a.left = this.n.b() + a.left;
                a.top = this.n.d() + a.top;
                a.right -= this.n.c();
                a.bottom -= this.n.a();
            }
        }
        a2 = a();
        int i7 = t65Var4.c;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
    }

    public final void q(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        tv4 tv4Var = w;
        if (tv4Var != null) {
            Collections.sort(arrayList, tv4Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            q65 q65Var = ((t65) view.getLayoutParams()).a;
            if (z && actionMasked != 0) {
                if (q65Var != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            q65Var.v(this, view, motionEvent2);
                        }
                    } else {
                        q65Var.k(this, view, motionEvent2);
                    }
                }
            } else if (!z && q65Var != null) {
                if (i != 0) {
                    if (i == 1) {
                        z = q65Var.v(this, view, motionEvent);
                    }
                } else {
                    z = q65Var.k(this, view, motionEvent);
                }
                if (z) {
                    this.j = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        q65 q65Var = ((t65) view.getLayoutParams()).a;
        if (q65Var != null && q65Var.q(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.g) {
            t(false);
            this.g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        fyg fygVar = this.b;
        b7h b7hVar = (b7h) fygVar.c;
        pxe pxeVar = (pxe) fygVar.b;
        b7h b7hVar2 = (b7h) fygVar.c;
        int i = b7hVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) b7hVar.j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                pxeVar.a(arrayList2);
            }
        }
        b7hVar.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            t65 m = m(childAt);
            int i4 = m.f;
            if (i4 == -1) {
                m.l = null;
                m.k = null;
            } else {
                View view = m.k;
                if (view != null && view.getId() == i4) {
                    View view2 = m.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        } else {
                            m.l = null;
                            m.k = null;
                        }
                    }
                    m.l = view2;
                }
                View findViewById = findViewById(i4);
                m.k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            m.l = null;
                            m.k = null;
                        } else {
                            dmk.n("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    m.l = null;
                                    m.k = null;
                                } else {
                                    dmk.n("Anchor must not be a descendant of the anchored view");
                                    return;
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        m.l = findViewById;
                    }
                } else if (isInEditMode()) {
                    m.l = null;
                    m.k = null;
                } else {
                    omf.l("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                    return;
                }
            }
            if (!b7hVar2.containsKey(childAt)) {
                b7hVar2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != m.l) {
                        WeakHashMap weakHashMap = k9k.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((t65) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        q65 q65Var = m.a;
                        if (q65Var == null) {
                            continue;
                        } else if (!q65Var.f(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!b7hVar2.containsKey(childAt2) && !b7hVar2.containsKey(childAt2)) {
                        b7hVar2.put(childAt2, null);
                    }
                    if (b7hVar2.containsKey(childAt2) && b7hVar2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) b7hVar2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) pxeVar.c();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            b7hVar2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        dmk.v("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) fygVar.d;
        arrayList4.clear();
        HashSet hashSet = (HashSet) fygVar.e;
        hashSet.clear();
        int i6 = b7hVar2.c;
        for (int i7 = 0; i7 < i6; i7++) {
            fygVar.v(b7hVar2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable4 = this.p;
                WeakHashMap weakHashMap = k9k.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = k9k.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = d55.g(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.p;
        if (drawable != null && drawable.isVisible() != z) {
            this.p.setVisible(z, false);
        }
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            q65 q65Var = ((t65) childAt.getLayoutParams()).a;
            if (q65Var != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    q65Var.k(this, childAt, obtain);
                } else {
                    q65Var.v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((t65) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.j = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.p) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = k9k.a;
        if (getFitsSystemWindows()) {
            jw8 jw8Var = this.r;
            if (jw8Var == null) {
                jw8Var = new jw8(this, 24);
                this.r = jw8Var;
            }
            d9k.b(this, jw8Var);
            setSystemUiVisibility(ConstantsKt.MIN_FRONT_CAMERA_WIDTH);
            return;
        }
        d9k.b(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new t65(getContext(), attributeSet);
    }
}
