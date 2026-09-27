package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import defpackage.a2d;
import defpackage.b67;
import defpackage.bd0;
import defpackage.dmk;
import defpackage.gkg;
import defpackage.k4c;
import defpackage.k9k;
import defpackage.ohn;
import defpackage.q24;
import defpackage.q96;
import defpackage.v1d;
import defpackage.w1d;
import defpackage.x1d;
import defpackage.x67;
import defpackage.xs6;
import defpackage.y1d;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements a2d, x1d, ScrollingView {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final k4c D = new k4c(3);
    public static final int[] E = {R.attr.fillViewport};
    public float A;
    public final xs6 B;
    public final float a;
    public long b;
    public final Rect c;
    public final OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public gkg g;
    public int h;
    public boolean i;
    public boolean j;
    public View k;
    public boolean l;
    public VelocityTracker m;
    public boolean n;
    public boolean o;
    public final int p;
    public final int q;
    public final int r;
    public int s;
    public final int[] t;
    public final int[] u;
    public int v;
    public int w;
    public w1d x;
    public final q24 y;
    public final y1d z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.polymarket.android.R.attr.nestedScrollViewStyle);
        this.c = new Rect();
        this.i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.o = true;
        this.s = -1;
        this.t = new int[2];
        this.u = new int[2];
        this.B = new xs6(getContext(), new q96(this, 25));
        this.e = b67.a(context, attributeSet);
        this.f = b67.a(context, attributeSet);
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.p = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, com.polymarket.android.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.y = new q24(8, (byte) 0);
        this.z = new y1d(this);
        setNestedScrollingEnabled(true);
        k9k.j(this, D);
    }

    private gkg getScrollFeedbackProvider() {
        gkg gkgVar = this.g;
        if (gkgVar == null) {
            gkg gkgVar2 = new gkg(this);
            this.g = gkgVar2;
            return gkgVar2;
        }
        return gkgVar;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view != nestedScrollView) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && m((View) parent, nestedScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && n(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(e(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            dmk.n("ScrollView can host only one direct child");
        }
    }

    @Override // defpackage.z1d
    public final void b(View view, View view2, int i, int i2) {
        q24 q24Var = this.y;
        if (i2 == 1) {
            q24Var.c = i;
        } else {
            q24Var.b = i;
        }
        w(2, i2);
    }

    @Override // defpackage.z1d
    public final void c(View view, int i) {
        q24 q24Var = this.y;
        if (i == 1) {
            q24Var.c = 0;
        } else {
            q24Var.b = 0;
        }
        y(i);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        int i2;
        OverScroller overScroller = this.d;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i3 = currY - this.w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.e;
        EdgeEffect edgeEffect2 = this.f;
        if (i3 > 0 && b67.b(edgeEffect) != 0.0f) {
            round = Math.round(b67.c(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i3) {
                edgeEffect.finish();
            }
        } else {
            if (i3 < 0 && b67.b(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(b67.c(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i3) {
                    edgeEffect2.finish();
                }
            }
            this.w = currY;
            int[] iArr = this.u;
            iArr[1] = 0;
            i(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                x67.a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i == 0) {
                int scrollY = getScrollY();
                q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.z.d(0, scrollY2, 0, i4, this.t, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                y(i2);
            }
            if (overScroller.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                y(i2);
                return;
            }
        }
        i3 -= round;
        this.w = currY;
        int[] iArr2 = this.u;
        iArr2[1] = 0;
        i(0, i3, 1, iArr2, null);
        i = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i == 0) {
        }
        if (i != 0) {
        }
        if (overScroller.isFinished()) {
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    @Override // defpackage.z1d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        i(i, i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !j(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.z.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.z.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.z.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.z.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.e;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final int e(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i5 >= i) {
            return 0;
        }
        if (rect.height() > height) {
            i2 = 0 - (i - rect.bottom);
        } else {
            i2 = 0 - (scrollY - rect.top);
        }
        return Math.max(i2, -getScrollY());
    }

    @Override // defpackage.a2d
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(i4, i5, iArr);
    }

    @Override // defpackage.z1d
    public final void g(View view, int i, int i2, int i3, int i4, int i5) {
        o(i4, i5, null);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q24 q24Var = this.y;
        return q24Var.c | q24Var.b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.A;
        if (f == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
                this.A = dimension;
                return dimension;
            }
            dmk.n("Expected theme to define listPreferredItemHeight.");
            return 0.0f;
        }
        return f;
    }

    @Override // defpackage.z1d
    public final boolean h(View view, View view2, int i, int i2) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.z.f(0);
    }

    public final boolean i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.z.c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.z.d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.c.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                if (keyCode != 92) {
                                    if (keyCode != 93) {
                                        if (keyCode != 122) {
                                            if (keyCode == 123) {
                                                r(130);
                                                return false;
                                            }
                                        } else {
                                            r(33);
                                            return false;
                                        }
                                    } else {
                                        return l(130);
                                    }
                                } else {
                                    return l(33);
                                }
                            } else {
                                if (keyEvent.isShiftPressed()) {
                                    i = 33;
                                }
                                r(i);
                                return false;
                            }
                        } else {
                            if (keyEvent.isAltPressed()) {
                                return l(130);
                            }
                            return a(130);
                        }
                    } else {
                        if (keyEvent.isAltPressed()) {
                            return l(33);
                        }
                        return a(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, bd0.API_PRIORITY_OTHER, 0, 0);
            w(2, 1);
            this.w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                x67.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i, int i2) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    public final void o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        float f;
        if (motionEvent.getAction() == 8 && !this.l) {
            if (ohn.a(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
                i = 9;
                i2 = (int) motionEvent.getX();
            } else if (ohn.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i2 = getWidth() / 2;
                i = 26;
                f = axisValue;
            } else {
                i = 0;
                i2 = 0;
                f = 0.0f;
            }
            if (f != 0.0f) {
                t(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, ohn.a(motionEvent, 8194));
                if (i != 0) {
                    this.B.a(motionEvent, i);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            p(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.s;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            m0.d("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.h) > this.p && (2 & getNestedScrollAxes()) == 0) {
                                this.l = true;
                                this.h = y;
                                VelocityTracker velocityTracker = this.m;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.m = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.l = false;
            this.s = -1;
            VelocityTracker velocityTracker2 = this.m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.m = null;
            }
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.d;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.h = y2;
                    this.s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.m;
                    if (velocityTracker3 == null) {
                        this.m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.m.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!x(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.l = z;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && overScroller.isFinished()) {
                z = false;
            }
            this.l = z;
            VelocityTracker velocityTracker4 = this.m;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.m = null;
            }
        }
        return this.l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.i = false;
        View view = this.k;
        if (view != null && m(view, this)) {
            View view2 = this.k;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int e = e(rect);
            if (e != 0) {
                scrollBy(0, e);
            }
        }
        this.k = null;
        if (!this.j) {
            if (this.x != null) {
                scrollTo(getScrollX(), this.x.a);
                this.x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.n && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            k((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.z.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || !n(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w1d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w1d w1dVar = (w1d) parcelable;
        super.onRestoreInstanceState(w1dVar.getSuperState());
        this.x = w1dVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, w1d] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && n(findFocus, 0, i4)) {
            Rect rect = this.c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int e = e(rect);
            if (e != 0) {
                if (this.o) {
                    v(0, e, false);
                } else {
                    scrollBy(0, e);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return h(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float c;
        int round;
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.e;
            EdgeEffect edgeEffect2 = this.f;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                p(motionEvent);
                                this.h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.s));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.h = (int) motionEvent.getY(actionIndex);
                            this.s = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.l && getChildCount() > 0) {
                            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                postInvalidateOnAnimation();
                            }
                        }
                        this.s = -1;
                        this.l = false;
                        VelocityTracker velocityTracker = this.m;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.m = null;
                        }
                        y(0);
                        edgeEffect.onRelease();
                        edgeEffect2.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.s);
                    if (findPointerIndex == -1) {
                        m0.d("NestedScrollView", "Invalid pointerId=" + this.s + " in onTouchEvent");
                    } else {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        int i = this.h - y;
                        float x = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i / getHeight();
                        if (b67.b(edgeEffect) != 0.0f) {
                            c = -b67.c(edgeEffect, -height, x);
                            if (b67.b(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                        } else {
                            if (b67.b(edgeEffect2) != 0.0f) {
                                c = b67.c(edgeEffect2, height, 1.0f - x);
                                if (b67.b(edgeEffect2) == 0.0f) {
                                    edgeEffect2.onRelease();
                                }
                            }
                            round = Math.round(f * getHeight());
                            if (round != 0) {
                                invalidate();
                            }
                            int i2 = i - round;
                            if (!this.l) {
                                int abs = Math.abs(i2);
                                int i3 = this.p;
                                if (abs > i3) {
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                    this.l = true;
                                    i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                                }
                            }
                            if (this.l) {
                                int t = t(i2, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                                this.h = y - t;
                                this.v += t;
                            }
                        }
                        f = c;
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                        }
                        int i22 = i - round;
                        if (!this.l) {
                        }
                        if (this.l) {
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.m;
                velocityTracker2.computeCurrentVelocity(1000, this.r);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.s);
                if (Math.abs(yVelocity) >= this.q) {
                    if (b67.b(edgeEffect) != 0.0f) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (b67.b(edgeEffect2) != 0.0f) {
                        int i4 = -yVelocity;
                        if (u(edgeEffect2, i4)) {
                            edgeEffect2.onAbsorb(i4);
                        } else {
                            k(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f2 = i5;
                        if (!this.z.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            k(i5);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.s = -1;
                this.l = false;
                VelocityTracker velocityTracker3 = this.m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.m = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.h = y2;
            this.s = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.s) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.h = (int) motionEvent.getY(i);
            this.s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            i5 = i2;
            z = false;
        }
        if (i7 > i4) {
            i6 = i4;
        } else if (i7 < 0) {
            i6 = 0;
        } else {
            i6 = i7;
            z2 = false;
            if (z2 && !this.z.f(1)) {
                this.d.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            if (!z || z2) {
                return true;
            }
            return false;
        }
        z2 = true;
        if (z2) {
            this.d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (!z) {
        }
        return true;
    }

    public final void r(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.c;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.i) {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int e = e(rect);
            if (e != 0) {
                scrollBy(0, e);
            }
        } else {
            this.k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e = e(rect);
        if (e != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, e);
                return z2;
            }
            v(0, e, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.m) != null) {
            velocityTracker.recycle();
            this.m = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public final boolean s(int i, int i2, int i3) {
        boolean z;
        View view;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view3 = focusables.get(i6);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z5 = z3;
                } else {
                    if ((z && top < view2.getTop()) || (!z && bottom > view2.getBottom())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view2 = view3;
                        }
                    } else if (z3) {
                        view2 = view3;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            t(i4, -1, null, 0, 1, true);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i >= 0) {
                if (width + i > width2) {
                    i = width2 - width;
                }
            } else {
                i = 0;
            }
            if (height < height2 && i2 >= 0) {
                if (height + i2 > height2) {
                    i2 = height2 - height;
                }
            } else {
                i2 = 0;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.n) {
            this.n = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        y1d y1dVar = this.z;
        if (y1dVar.d) {
            ViewGroup viewGroup = y1dVar.c;
            WeakHashMap weakHashMap = k9k.a;
            viewGroup.stopNestedScroll();
        }
        y1dVar.d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.z.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            w(2, i4);
        }
        boolean c = this.z.c(0, i, i4, this.u, this.t);
        int[] iArr = this.t;
        int[] iArr2 = this.u;
        if (c) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (q(i5, 0, scrollY, scrollRange) && !this.z.f(i4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.z.d(0, scrollY2, 0, i5 - scrollY2, this.t, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.e;
        if (i9 < 0) {
            if (z2) {
                b67.c(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z2) {
            b67.c(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                z4 = false;
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            } else {
                z4 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (!edgeEffect2.isFinished() && edgeEffect.isFinished()) {
                z5 = z3;
            } else {
                postInvalidateOnAnimation();
                z5 = z4;
            }
            if (z5 && i4 == 0 && (velocityTracker = this.m) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                y(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        z4 = false;
        if (!edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z5 = z4;
        if (z5) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
        }
        return i7;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float b = b67.b(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double log = Math.log(abs / f);
        double d = C;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < b) {
            return true;
        }
        return false;
    }

    public final void v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.d.startScroll(getScrollX(), scrollY, 0, max, RadarSimpleLogBuffer.PURGE_AMOUNT);
            if (z) {
                w(2, 1);
            } else {
                y(1);
            }
            this.w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                y(1);
            }
            scrollBy(i, i2);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void w(int i, int i2) {
        this.z.g(2, i2);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.e;
        if (b67.b(edgeEffect) != 0.0f) {
            b67.c(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (b67.b(edgeEffect2) != 0.0f) {
            b67.c(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    public final void y(int i) {
        this.z.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            dmk.n("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            dmk.n("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            dmk.n("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(v1d v1dVar) {
    }
}
