package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.a2d;
import defpackage.d55;
import defpackage.f34;
import defpackage.flf;
import defpackage.g34;
import defpackage.ix2;
import defpackage.k9k;
import defpackage.q24;
import defpackage.rfi;
import defpackage.sfi;
import defpackage.t24;
import defpackage.tfi;
import defpackage.ufi;
import defpackage.vfi;
import defpackage.wfi;
import defpackage.wvb;
import defpackage.x1d;
import defpackage.y1d;
import defpackage.z1d;
import io.sentry.android.core.m0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements a2d, z1d, x1d {
    public static final int[] K = {R.attr.enabled};
    public sfi A;
    public sfi B;
    public tfi C;
    public tfi D;
    public boolean E;
    public int F;
    public boolean G;
    public final rfi H;
    public final sfi I;
    public final sfi J;
    public View a;
    public vfi b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public final q24 g;
    public final y1d h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public final DecelerateInterpolator s;
    public final t24 t;
    public int u;
    public int v;
    public final int w;
    public final int x;
    public int y;
    public final g34 z;

    /* JADX WARN: Type inference failed for: r2v11, types: [t24, android.widget.ImageView, android.view.View] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.u = -1;
        this.H = new rfi(this, 0);
        this.I = new sfi(this, 2);
        this.J = new sfi(this, 3);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(flf.a);
        imageView.b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = k9k.a;
        imageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.b);
        imageView.setBackground(shapeDrawable);
        this.t = imageView;
        g34 g34Var = new g34(getContext());
        this.z = g34Var;
        g34Var.c(1);
        this.t.setImageDrawable(this.z);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.x = i;
        this.e = i;
        this.g = new q24(8, (byte) 0);
        this.h = new y1d(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.F;
        this.n = i2;
        this.w = i2;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, K);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.t.getBackground().setAlpha(i);
        this.z.setAlpha(i);
    }

    public final boolean a() {
        View view = this.a;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // defpackage.z1d
    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.z1d
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.z1d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            n(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.t)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    @Override // defpackage.a2d
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            if (i5 == 0) {
                this.h.d(i, i2, i3, i4, this.j, i5, iArr);
            }
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = this.j[1] + i4;
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !a()) {
                float abs = this.f + Math.abs(i6);
                this.f = abs;
                j(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    @Override // defpackage.z1d
    public final void g(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.k);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.u;
        if (i3 >= 0) {
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q24 q24Var = this.g;
        return q24Var.c | q24Var.b;
    }

    public int getProgressCircleDiameter() {
        return this.F;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.w;
    }

    @Override // defpackage.z1d
    public final boolean h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    public final void i(float f) {
        if (f > this.e) {
            m(true, true);
            return;
        }
        this.c = false;
        g34 g34Var = this.z;
        f34 f34Var = g34Var.a;
        f34Var.e = 0.0f;
        f34Var.f = 0.0f;
        g34Var.invalidateSelf();
        rfi rfiVar = new rfi(this, 1);
        this.v = this.n;
        sfi sfiVar = this.J;
        sfiVar.reset();
        sfiVar.setDuration(200L);
        sfiVar.setInterpolator(this.s);
        t24 t24Var = this.t;
        t24Var.a = rfiVar;
        t24Var.clearAnimation();
        t24Var.startAnimation(sfiVar);
        f34 f34Var2 = g34Var.a;
        if (f34Var2.n) {
            f34Var2.n = false;
        }
        g34Var.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void j(float f) {
        tfi tfiVar;
        tfi tfiVar2;
        g34 g34Var = this.z;
        f34 f34Var = g34Var.a;
        if (!f34Var.n) {
            f34Var.n = true;
        }
        g34Var.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.e));
        float max = (((float) Math.max(min - 0.4d, ConstantsKt.UNSET)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.e;
        int i = this.y;
        if (i <= 0) {
            i = this.x;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.w + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        t24 t24Var = this.t;
        if (t24Var.getVisibility() != 0) {
            t24Var.setVisibility(0);
        }
        t24Var.setScaleX(1.0f);
        t24Var.setScaleY(1.0f);
        if (f < this.e) {
            if (g34Var.a.t > 76 && ((tfiVar2 = this.C) == null || !tfiVar2.hasStarted() || tfiVar2.hasEnded())) {
                tfi tfiVar3 = new tfi(this, g34Var.a.t, 76);
                tfiVar3.setDuration(300L);
                t24Var.a = null;
                t24Var.clearAnimation();
                t24Var.startAnimation(tfiVar3);
                this.C = tfiVar3;
            }
        } else if (g34Var.a.t < 255 && ((tfiVar = this.D) == null || !tfiVar.hasStarted() || tfiVar.hasEnded())) {
            tfi tfiVar4 = new tfi(this, g34Var.a.t, 255);
            tfiVar4.setDuration(300L);
            t24Var.a = null;
            t24Var.clearAnimation();
            t24Var.startAnimation(tfiVar4);
            this.D = tfiVar4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        f34 f34Var2 = g34Var.a;
        f34Var2.e = 0.0f;
        f34Var2.f = min2;
        g34Var.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        f34 f34Var3 = g34Var.a;
        if (min3 != f34Var3.p) {
            f34Var3.p = min3;
        }
        g34Var.invalidateSelf();
        g34Var.a.g = ix2.D(pow, 2.0f, (max * 0.4f) - 0.25f, 0.5f);
        g34Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.n);
    }

    public final void k(float f) {
        setTargetOffsetTopAndBottom((this.v + ((int) ((this.w - r0) * f))) - this.t.getTop());
    }

    public final void l() {
        this.t.clearAnimation();
        this.z.stop();
        this.t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.w - this.n);
        this.n = this.t.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.c != z) {
            this.E = z2;
            e();
            this.c = z;
            t24 t24Var = this.t;
            rfi rfiVar = this.H;
            if (z) {
                this.v = this.n;
                sfi sfiVar = this.I;
                sfiVar.reset();
                sfiVar.setDuration(200L);
                sfiVar.setInterpolator(this.s);
                if (rfiVar != null) {
                    t24Var.a = rfiVar;
                }
                t24Var.clearAnimation();
                t24Var.startAnimation(sfiVar);
                return;
            }
            sfi sfiVar2 = new sfi(this, 1);
            this.B = sfiVar2;
            sfiVar2.setDuration(150L);
            t24Var.a = rfiVar;
            t24Var.clearAnimation();
            t24Var.startAnimation(this.B);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z && this.c != z) {
            this.c = z;
            setTargetOffsetTopAndBottom((this.x + this.w) - this.n);
            this.E = z2;
            t24 t24Var = this.t;
            t24Var.setVisibility(0);
            this.z.setAlpha(255);
            sfi sfiVar = new sfi(this, 0);
            this.A = sfiVar;
            sfiVar.setDuration(this.m);
            rfi rfiVar = this.H;
            if (rfiVar != null) {
                t24Var.a = rfiVar;
            }
            t24Var.clearAnimation();
            t24Var.startAnimation(this.A);
            return;
        }
        m(z, false);
    }

    public final void o(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 > f4 && !this.q) {
            this.o = f2 + f4;
            this.q = true;
            this.z.setAlpha(76);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.r) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.r = motionEvent.getPointerId(i);
                                }
                            }
                        }
                    } else {
                        int i2 = this.r;
                        if (i2 == -1) {
                            m0.d("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex >= 0) {
                            o(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.q;
                }
                this.q = false;
                this.r = -1;
                return this.q;
            }
            setTargetOffsetTopAndBottom(this.w - this.t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.r = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.p = motionEvent.getY(findPointerIndex2);
                return this.q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.a == null) {
                e();
            }
            View view = this.a;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.t.getMeasuredWidth();
            int measuredHeight2 = this.t.getMeasuredHeight();
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.n;
            this.t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            e();
        }
        View view = this.a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.t.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
            this.u = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.t) {
                    this.u = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.f = 0.0f;
                } else {
                    f2 = f - f3;
                    this.f = f2;
                    iArr[1] = i2;
                }
                j(f2);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.b = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        wfi wfiVar = (wfi) parcelable;
        super.onRestoreInstanceState(wfiVar.getSuperState());
        setRefreshing(wfiVar.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new wfi(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.c && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.b = 0;
        this.l = false;
        float f = this.f;
        if (f > 0.0f) {
            i(f);
            this.f = 0.0f;
        } else {
            post(new wvb(this, 24));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.r) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        this.r = motionEvent.getPointerId(i);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                m0.d("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.r = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.r);
                        if (findPointerIndex < 0) {
                            m0.d("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y = motionEvent.getY(findPointerIndex);
                        o(y);
                        if (this.q) {
                            float f = (y - this.o) * 0.5f;
                            if (f > 0.0f) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                j(f);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.r);
                    if (findPointerIndex2 < 0) {
                        m0.d("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.q) {
                        float y2 = (motionEvent.getY(findPointerIndex2) - this.o) * 0.5f;
                        this.q = false;
                        i(y2);
                    }
                    this.r = -1;
                    return false;
                }
            } else {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.G && (view = this.a) != null) {
            WeakHashMap weakHashMap = k9k.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.t.setScaleX(f);
        this.t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        g34 g34Var = this.z;
        f34 f34Var = g34Var.a;
        f34Var.i = iArr;
        f34Var.a(0);
        f34Var.a(0);
        g34Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = d55.d(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.G = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        y1d y1dVar = this.h;
        if (y1dVar.d) {
            ViewGroup viewGroup = y1dVar.c;
            WeakHashMap weakHashMap = k9k.a;
            viewGroup.stopNestedScroll();
        }
        y1dVar.d = z;
    }

    public void setOnRefreshListener(vfi vfiVar) {
        this.b = vfiVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(d55.d(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.F = (int) (displayMetrics.density * 56.0f);
        } else {
            this.F = (int) (displayMetrics.density * 40.0f);
        }
        this.t.setImageDrawable(null);
        this.z.c(i);
        this.t.setImageDrawable(this.z);
    }

    public void setSlingshotDistance(int i) {
        this.y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        t24 t24Var = this.t;
        t24Var.bringToFront();
        WeakHashMap weakHashMap = k9k.a;
        t24Var.offsetTopAndBottom(i);
        this.n = t24Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.h(0);
    }

    public void setOnChildScrollUpCallback(ufi ufiVar) {
    }
}
