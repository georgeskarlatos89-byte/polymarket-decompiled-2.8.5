package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u8b extends ViewGroup {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public int[] i;
    public int[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;

    public u8b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = ulf.n;
        bm9 C = bm9.C(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) C.c;
        WeakHashMap weakHashMap = k9k.a;
        i9k.b(this, context, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) C.c;
        int i2 = typedArray2.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray2.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray2.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.g = typedArray2.getFloat(4, -1.0f);
        this.b = typedArray2.getInt(3, -1);
        this.h = typedArray2.getBoolean(7, false);
        setDividerDrawable(C.p(5));
        this.n = typedArray2.getInt(8, 0);
        this.o = typedArray2.getDimensionPixelSize(6, 0);
        C.F();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t8b;
    }

    public final void d(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.widget.LinearLayout$LayoutParams, t8b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.widget.LinearLayout$LayoutParams, t8b] */
    public t8b f() {
        int i = this.d;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, t8b] */
    public t8b g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return f();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return g(attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.b == 0) {
                    return -1;
                }
                qp7.p("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
            int i3 = this.c;
            if (this.d == 1 && (i = this.e & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    }
                } else {
                    i3 = ix2.c(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i3);
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((t8b) childAt.getLayoutParams())).topMargin + baseline;
        }
        qp7.p("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, t8b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, t8b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.LinearLayout$LayoutParams, t8b] */
    public t8b h(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t8b) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            if ((this.n & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i2 = this.n;
        if (i == childCount) {
            if ((i2 & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.k != null) {
            int i2 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i2 < virtualChildCount) {
                    View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t8b) childAt.getLayoutParams())).topMargin) - this.m);
                    }
                    i2++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t8b) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            while (i2 < virtualChildCount2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                    t8b t8bVar = (t8b) childAt3.getLayoutParams();
                    if (z) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) t8bVar).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) t8bVar).leftMargin) - this.l;
                    }
                    e(canvas, left2);
                }
                i2++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i = this.l;
                        right = left - i;
                    }
                } else {
                    t8b t8bVar2 = (t8b) childAt4.getLayoutParams();
                    if (z) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t8bVar2).leftMargin;
                        i = this.l;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) t8bVar2).rightMargin;
                    }
                }
                e(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int c2;
        int i14;
        int c3;
        int c4;
        int i15 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.e;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            if (i18 != 16) {
                if (i18 != 80) {
                    c3 = getPaddingTop();
                } else {
                    c3 = ((getPaddingTop() + i4) - i2) - this.f;
                }
            } else {
                c3 = ix2.c(i4 - i2, this.f, 2, getPaddingTop());
            }
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt != null && childAt.getVisibility() != i15) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    t8b t8bVar = (t8b) childAt.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) t8bVar).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            c4 = ((LinearLayout.LayoutParams) t8bVar).leftMargin + paddingLeft;
                        } else {
                            c4 = (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) t8bVar).rightMargin;
                        }
                    } else {
                        c4 = (ix2.c(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) t8bVar).leftMargin) - ((LinearLayout.LayoutParams) t8bVar).rightMargin;
                    }
                    if (i(i20)) {
                        c3 += this.m;
                    }
                    int i22 = c3 + ((LinearLayout.LayoutParams) t8bVar).topMargin;
                    childAt.layout(c4, i22, measuredWidth + c4, i22 + measuredHeight);
                    c3 = measuredHeight + ((LinearLayout.LayoutParams) t8bVar).bottomMargin + i22;
                }
                i20++;
                i15 = 8;
            }
            return;
        }
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int paddingTop = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.e;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z3 = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                c = getPaddingLeft();
            } else {
                c = ((getPaddingLeft() + i3) - i) - this.f;
            }
            i5 = 1;
        } else {
            i5 = 1;
            c = ix2.c(i3 - i, this.f, 2, getPaddingLeft());
        }
        if (z2) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = i5;
            i7 = 0;
        }
        int i27 = 0;
        while (i27 < virtualChildCount2) {
            int i28 = (i6 * i27) + i7;
            View childAt2 = getChildAt(i28);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i29 = c;
                    t8b t8bVar2 = (t8b) childAt2.getLayoutParams();
                    if (z3) {
                        i9 = i6;
                        if (((LinearLayout.LayoutParams) t8bVar2).height != -1) {
                            i10 = childAt2.getBaseline();
                            i11 = ((LinearLayout.LayoutParams) t8bVar2).gravity;
                            if (i11 < 0) {
                                i11 = i26;
                            }
                            i12 = i11 & 112;
                            i13 = i27;
                            if (i12 == 16) {
                                if (i12 != 48) {
                                    if (i12 != 80) {
                                        c2 = paddingTop;
                                    } else {
                                        c2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) t8bVar2).bottomMargin;
                                        if (i10 != -1) {
                                            c2 -= iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                                        }
                                    }
                                } else {
                                    c2 = ((LinearLayout.LayoutParams) t8bVar2).topMargin + paddingTop;
                                    if (i10 != -1) {
                                        c2 = (iArr[i5] - i10) + c2;
                                    }
                                }
                            } else {
                                c2 = (ix2.c(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) t8bVar2).topMargin) - ((LinearLayout.LayoutParams) t8bVar2).bottomMargin;
                            }
                            if (!i(i28)) {
                                i14 = i29 + this.l;
                            } else {
                                i14 = i29;
                            }
                            int i30 = i14 + ((LinearLayout.LayoutParams) t8bVar2).leftMargin;
                            childAt2.layout(i30, c2, i30 + measuredWidth2, measuredHeight2 + c2);
                            c = measuredWidth2 + ((LinearLayout.LayoutParams) t8bVar2).rightMargin + i30;
                            i27 = i13 + 1;
                            i6 = i9;
                            i7 = i8;
                        }
                    } else {
                        i9 = i6;
                    }
                    i10 = -1;
                    i11 = ((LinearLayout.LayoutParams) t8bVar2).gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    i13 = i27;
                    if (i12 == 16) {
                    }
                    if (!i(i28)) {
                    }
                    int i302 = i14 + ((LinearLayout.LayoutParams) t8bVar2).leftMargin;
                    childAt2.layout(i302, c2, i302 + measuredWidth2, measuredHeight2 + c2);
                    c = measuredWidth2 + ((LinearLayout.LayoutParams) t8bVar2).rightMargin + i302;
                    i27 = i13 + 1;
                    i6 = i9;
                    i7 = i8;
                }
            }
            i9 = i6;
            i13 = i27;
            i27 = i13 + 1;
            i6 = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int[] iArr;
        boolean z;
        int max;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        int baseline;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        t8b t8bVar;
        int i14;
        int[] iArr3;
        int i15;
        View view;
        int i16;
        boolean z6;
        boolean z7;
        boolean z8;
        int max2;
        int i17;
        int i18;
        int i19;
        boolean z9;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        int i25;
        int i26;
        int i27;
        View view2;
        boolean z11;
        boolean z12;
        u8b u8bVar = this;
        int i28 = -2;
        int i29 = 0;
        int i30 = 1073741824;
        int i31 = 8;
        if (u8bVar.d == 1) {
            u8bVar.f = 0;
            int virtualChildCount = u8bVar.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i32 = u8bVar.b;
            boolean z13 = u8bVar.h;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            boolean z14 = false;
            int i36 = 0;
            boolean z15 = false;
            boolean z16 = true;
            float f = 0.0f;
            int i37 = 0;
            while (i33 < virtualChildCount) {
                int i38 = mode;
                View childAt = u8bVar.getChildAt(i33);
                if (childAt == null) {
                    u8bVar.f = u8bVar.f;
                } else if (childAt.getVisibility() != i31) {
                    if (u8bVar.i(i33)) {
                        u8bVar.f += u8bVar.m;
                    }
                    t8b t8bVar2 = (t8b) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) t8bVar2).weight;
                    f += f2;
                    if (mode2 == i30 && ((LinearLayout.LayoutParams) t8bVar2).height == 0 && f2 > 0.0f) {
                        int i39 = u8bVar.f;
                        u8bVar.f = Math.max(i39, ((LinearLayout.LayoutParams) t8bVar2).topMargin + i39 + ((LinearLayout.LayoutParams) t8bVar2).bottomMargin);
                        view2 = childAt;
                        i24 = mode2;
                        i25 = i32;
                        z10 = z13;
                        i26 = i33;
                        z14 = true;
                        i27 = i38;
                    } else {
                        if (((LinearLayout.LayoutParams) t8bVar2).height == 0 && f2 > 0.0f) {
                            ((LinearLayout.LayoutParams) t8bVar2).height = i28;
                            i21 = 0;
                        } else {
                            i21 = Integer.MIN_VALUE;
                        }
                        if (f == 0.0f) {
                            i22 = i33;
                            i23 = u8bVar.f;
                        } else {
                            i22 = i33;
                            i23 = 0;
                        }
                        i24 = mode2;
                        z10 = z13;
                        i25 = i32;
                        i26 = i22;
                        i27 = i38;
                        u8bVar.measureChildWithMargins(childAt, i, 0, i2, i23);
                        if (i21 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t8bVar2).height = i21;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i40 = u8bVar.f;
                        view2 = childAt;
                        u8bVar.f = Math.max(i40, i40 + measuredHeight + ((LinearLayout.LayoutParams) t8bVar2).topMargin + ((LinearLayout.LayoutParams) t8bVar2).bottomMargin);
                        if (z10) {
                            i37 = Math.max(measuredHeight, i37);
                        }
                    }
                    if (i25 >= 0 && i25 == i26 + 1) {
                        u8bVar.c = u8bVar.f;
                    }
                    if (i26 < i25 && ((LinearLayout.LayoutParams) t8bVar2).weight > 0.0f) {
                        qp7.p("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                    if (i27 != 1073741824 && ((LinearLayout.LayoutParams) t8bVar2).width == -1) {
                        z11 = true;
                        z15 = true;
                    } else {
                        z11 = false;
                    }
                    int i41 = ((LinearLayout.LayoutParams) t8bVar2).leftMargin + ((LinearLayout.LayoutParams) t8bVar2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i41;
                    i29 = Math.max(i29, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z17 = z11;
                    int combineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                    if (z16) {
                        i36 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) t8bVar2).width == -1) {
                            z12 = true;
                            if (((LinearLayout.LayoutParams) t8bVar2).weight <= 0.0f) {
                                if (!z17) {
                                    i41 = measuredWidth;
                                }
                                i35 = Math.max(i35, i41);
                            } else {
                                if (!z17) {
                                    i41 = measuredWidth;
                                }
                                i34 = Math.max(i34, i41);
                            }
                            z16 = z12;
                            i33 = i26 + 1;
                            i32 = i25;
                            mode = i27;
                            z13 = z10;
                            mode2 = i24;
                            i28 = -2;
                            i30 = 1073741824;
                            i31 = 8;
                        }
                    } else {
                        i36 = combineMeasuredStates;
                    }
                    z12 = false;
                    if (((LinearLayout.LayoutParams) t8bVar2).weight <= 0.0f) {
                    }
                    z16 = z12;
                    i33 = i26 + 1;
                    i32 = i25;
                    mode = i27;
                    z13 = z10;
                    mode2 = i24;
                    i28 = -2;
                    i30 = 1073741824;
                    i31 = 8;
                }
                i24 = mode2;
                i25 = i32;
                z10 = z13;
                i26 = i33;
                i27 = i38;
                i33 = i26 + 1;
                i32 = i25;
                mode = i27;
                z13 = z10;
                mode2 = i24;
                i28 = -2;
                i30 = 1073741824;
                i31 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z18 = z13;
            int i44 = i36;
            int i45 = i2;
            if (u8bVar.f > 0 && u8bVar.i(virtualChildCount)) {
                u8bVar.f += u8bVar.m;
            }
            if (z18 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                u8bVar.f = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = u8bVar.getChildAt(i46);
                    if (childAt2 == null) {
                        u8bVar.f = u8bVar.f;
                    } else if (childAt2.getVisibility() != 8) {
                        t8b t8bVar3 = (t8b) childAt2.getLayoutParams();
                        int i47 = u8bVar.f;
                        u8bVar.f = Math.max(i47, i47 + i37 + ((LinearLayout.LayoutParams) t8bVar3).topMargin + ((LinearLayout.LayoutParams) t8bVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = u8bVar.getPaddingBottom() + u8bVar.getPaddingTop() + u8bVar.f;
            u8bVar.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, u8bVar.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (resolveSizeAndState & 16777215) - u8bVar.f;
            if (!z14 && (i48 == 0 || f <= 0.0f)) {
                i34 = Math.max(i34, i35);
                if (z18 && i43 != 1073741824) {
                    for (int i49 = 0; i49 < virtualChildCount; i49++) {
                        View childAt3 = u8bVar.getChildAt(i49);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t8b) childAt3.getLayoutParams())).weight > 0.0f) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i37, 1073741824));
                        }
                    }
                }
            } else {
                float f3 = u8bVar.g;
                if (f3 > 0.0f) {
                    f = f3;
                }
                u8bVar.f = 0;
                int i50 = i44;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt4 = u8bVar.getChildAt(i51);
                    if (childAt4.getVisibility() == 8) {
                        i18 = i51;
                    } else {
                        t8b t8bVar4 = (t8b) childAt4.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) t8bVar4).weight;
                        if (f4 > 0.0f) {
                            int i52 = (int) ((i48 * f4) / f);
                            f -= f4;
                            i48 -= i52;
                            i18 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, u8bVar.getPaddingRight() + u8bVar.getPaddingLeft() + ((LinearLayout.LayoutParams) t8bVar4).leftMargin + ((LinearLayout.LayoutParams) t8bVar4).rightMargin, ((LinearLayout.LayoutParams) t8bVar4).width);
                            if (((LinearLayout.LayoutParams) t8bVar4).height == 0) {
                                i20 = 1073741824;
                                if (i43 == 1073741824) {
                                    if (i52 <= 0) {
                                        i52 = 0;
                                    }
                                    childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                                    i50 = View.combineMeasuredStates(i50, childAt4.getMeasuredState() & (-256));
                                }
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight() + i52;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i20));
                            i50 = View.combineMeasuredStates(i50, childAt4.getMeasuredState() & (-256));
                        } else {
                            i18 = i51;
                        }
                        int i53 = ((LinearLayout.LayoutParams) t8bVar4).leftMargin + ((LinearLayout.LayoutParams) t8bVar4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i53;
                        i29 = Math.max(i29, measuredWidth2);
                        if (i42 != 1073741824) {
                            i19 = -1;
                            if (((LinearLayout.LayoutParams) t8bVar4).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i19 = -1;
                        }
                        i34 = Math.max(i34, measuredWidth2);
                        if (z16 && ((LinearLayout.LayoutParams) t8bVar4).width == i19) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i54 = u8bVar.f;
                        u8bVar.f = Math.max(i54, childAt4.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) t8bVar4).topMargin + ((LinearLayout.LayoutParams) t8bVar4).bottomMargin);
                        z16 = z9;
                    }
                    i51 = i18 + 1;
                }
                u8bVar.f = u8bVar.getPaddingBottom() + u8bVar.getPaddingTop() + u8bVar.f;
                i44 = i50;
            }
            if (z16 || i42 == 1073741824) {
                i34 = i29;
            }
            u8bVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(u8bVar.getPaddingRight() + u8bVar.getPaddingLeft() + i34, u8bVar.getSuggestedMinimumWidth()), i, i44), resolveSizeAndState);
            if (z15) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u8bVar.getMeasuredWidth(), 1073741824);
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt5 = u8bVar.getChildAt(i55);
                    if (childAt5.getVisibility() != 8) {
                        t8b t8bVar5 = (t8b) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) t8bVar5).width == -1) {
                            int i56 = ((LinearLayout.LayoutParams) t8bVar5).height;
                            ((LinearLayout.LayoutParams) t8bVar5).height = childAt5.getMeasuredHeight();
                            u8bVar.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) t8bVar5).height = i56;
                        }
                    }
                    i55++;
                    i45 = i2;
                }
                return;
            }
            return;
        }
        int i57 = i;
        u8bVar.f = 0;
        int virtualChildCount2 = u8bVar.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i57);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = u8bVar.i;
        if (iArr4 == null || (iArr = u8bVar.j) == null) {
            iArr4 = new int[4];
            u8bVar.i = iArr4;
            iArr = new int[4];
            u8bVar.j = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z19 = u8bVar.a;
        boolean z20 = u8bVar.h;
        if (mode3 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        float f5 = 0.0f;
        boolean z21 = true;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i58 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = u8bVar.getChildAt(i58);
            if (childAt6 == null) {
                u8bVar.f = u8bVar.f;
                i13 = i58;
                i17 = i60;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z4 = z19;
                z5 = z20;
            } else {
                int i64 = i59;
                if (childAt6.getVisibility() == 8) {
                    i57 = i;
                    i13 = i58;
                    i17 = i60;
                    iArr2 = iArr6;
                    z4 = z19;
                    z5 = z20;
                    i59 = i64;
                    iArr3 = iArr5;
                } else {
                    if (u8bVar.i(i58)) {
                        u8bVar.f += u8bVar.l;
                    }
                    t8b t8bVar6 = (t8b) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) t8bVar6).weight;
                    f5 += f6;
                    int i65 = i58;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) t8bVar6).width == 0 && f6 > 0.0f) {
                        int i66 = u8bVar.f;
                        int i67 = ((LinearLayout.LayoutParams) t8bVar6).leftMargin;
                        if (z) {
                            u8bVar.f = i67 + ((LinearLayout.LayoutParams) t8bVar6).rightMargin + i66;
                        } else {
                            u8bVar.f = Math.max(i66, i66 + i67 + ((LinearLayout.LayoutParams) t8bVar6).rightMargin);
                        }
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z4 = z19;
                            z5 = z20;
                            i14 = i64;
                            i13 = i65;
                            t8bVar = t8bVar6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i57 = i;
                            i15 = i60;
                            i12 = i61;
                        } else {
                            view = childAt6;
                            z4 = z19;
                            z5 = z20;
                            z23 = true;
                            i14 = i64;
                            i13 = i65;
                            i16 = 1073741824;
                            t8bVar = t8bVar6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i57 = i;
                            i15 = i60;
                            i12 = i61;
                            if (mode4 == i16 && ((LinearLayout.LayoutParams) t8bVar).height == -1) {
                                z6 = true;
                                z22 = true;
                            } else {
                                z6 = false;
                            }
                            int i68 = ((LinearLayout.LayoutParams) t8bVar).topMargin + ((LinearLayout.LayoutParams) t8bVar).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i63 = View.combineMeasuredStates(i63, view.getMeasuredState());
                            if (!z4) {
                                int baseline2 = view.getBaseline();
                                z7 = z6;
                                if (baseline2 != -1) {
                                    int i69 = ((LinearLayout.LayoutParams) t8bVar).gravity;
                                    if (i69 < 0) {
                                        i69 = u8bVar.e;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr3[i70] = Math.max(iArr3[i70], baseline2);
                                    iArr2[i70] = Math.max(iArr2[i70], measuredHeight3 - baseline2);
                                }
                            } else {
                                z7 = z6;
                            }
                            int max3 = Math.max(i14, measuredHeight3);
                            if (!z21 && ((LinearLayout.LayoutParams) t8bVar).height == -1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (((LinearLayout.LayoutParams) t8bVar).weight <= 0.0f) {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                i61 = Math.max(i12, i68);
                                max2 = i15;
                            } else {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                max2 = Math.max(i15, i68);
                                i61 = i12;
                            }
                            int i71 = max2;
                            i59 = max3;
                            i17 = i71;
                            z21 = z8;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) t8bVar6).width == 0 && f6 > 0.0f) {
                            ((LinearLayout.LayoutParams) t8bVar6).width = -2;
                            i10 = 0;
                        } else {
                            i10 = Integer.MIN_VALUE;
                        }
                        if (f5 == 0.0f) {
                            i11 = u8bVar.f;
                        } else {
                            i11 = 0;
                        }
                        iArr2 = iArr6;
                        i12 = i61;
                        i13 = i65;
                        z4 = z19;
                        z5 = z20;
                        int i72 = i10;
                        t8bVar = t8bVar6;
                        i14 = i64;
                        i57 = i;
                        iArr3 = iArr5;
                        i15 = i60;
                        u8bVar.measureChildWithMargins(childAt6, i57, i11, i2, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t8bVar).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i73 = u8bVar.f;
                        int i74 = ((LinearLayout.LayoutParams) t8bVar).leftMargin;
                        if (z) {
                            view = childAt6;
                            u8bVar.f = i74 + measuredWidth3 + ((LinearLayout.LayoutParams) t8bVar).rightMargin + i73;
                        } else {
                            view = childAt6;
                            u8bVar.f = Math.max(i73, i73 + measuredWidth3 + i74 + ((LinearLayout.LayoutParams) t8bVar).rightMargin);
                        }
                        if (z5) {
                            i62 = Math.max(measuredWidth3, i62);
                        }
                    }
                    i16 = 1073741824;
                    if (mode4 == i16) {
                    }
                    z6 = false;
                    int i682 = ((LinearLayout.LayoutParams) t8bVar).topMargin + ((LinearLayout.LayoutParams) t8bVar).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i63 = View.combineMeasuredStates(i63, view.getMeasuredState());
                    if (!z4) {
                    }
                    int max32 = Math.max(i14, measuredHeight32);
                    if (!z21) {
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) t8bVar).weight <= 0.0f) {
                    }
                    int i712 = max2;
                    i59 = max32;
                    i17 = i712;
                    z21 = z8;
                }
            }
            i60 = i17;
            i58 = i13 + 1;
            c = c2;
            iArr5 = iArr3;
            iArr6 = iArr2;
            z19 = z4;
            z20 = z5;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z24 = z19;
        boolean z25 = z20;
        int i75 = i59;
        int i76 = i60;
        int i77 = i61;
        if (u8bVar.f > 0 && u8bVar.i(virtualChildCount2)) {
            u8bVar.f += u8bVar.l;
        }
        int i78 = iArr7[1];
        if (i78 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
            max = i75;
        } else {
            max = Math.max(i75, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i78, iArr7[c3]))));
        }
        if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            u8bVar.f = 0;
            for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                View childAt7 = u8bVar.getChildAt(i79);
                if (childAt7 == null) {
                    u8bVar.f = u8bVar.f;
                } else if (childAt7.getVisibility() != 8) {
                    t8b t8bVar7 = (t8b) childAt7.getLayoutParams();
                    int i80 = u8bVar.f;
                    if (z) {
                        u8bVar.f = ((LinearLayout.LayoutParams) t8bVar7).leftMargin + i62 + ((LinearLayout.LayoutParams) t8bVar7).rightMargin + i80;
                    } else {
                        u8bVar.f = Math.max(i80, i80 + i62 + ((LinearLayout.LayoutParams) t8bVar7).leftMargin + ((LinearLayout.LayoutParams) t8bVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = u8bVar.getPaddingRight() + u8bVar.getPaddingLeft() + u8bVar.f;
        u8bVar.f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, u8bVar.getSuggestedMinimumWidth()), i57, 0);
        int i81 = (resolveSizeAndState2 & 16777215) - u8bVar.f;
        if (!z23 && (i81 == 0 || f5 <= 0.0f)) {
            i6 = Math.max(i76, i77);
            if (z25 && mode3 != 1073741824) {
                for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                    View childAt8 = u8bVar.getChildAt(i82);
                    if (childAt8 != null && childAt8.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t8b) childAt8.getLayoutParams())).weight > 0.0f) {
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i62, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        } else {
            float f7 = u8bVar.g;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            u8bVar.f = 0;
            max = -1;
            int i83 = 0;
            while (i83 < virtualChildCount2) {
                View childAt9 = u8bVar.getChildAt(i83);
                if (childAt9 == null || childAt9.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    t8b t8bVar8 = (t8b) childAt9.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) t8bVar8).weight;
                    if (f8 > 0.0f) {
                        int i84 = (int) ((i81 * f8) / f5);
                        f5 -= f8;
                        i81 -= i84;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, u8bVar.getPaddingBottom() + u8bVar.getPaddingTop() + ((LinearLayout.LayoutParams) t8bVar8).topMargin + ((LinearLayout.LayoutParams) t8bVar8).bottomMargin, ((LinearLayout.LayoutParams) t8bVar8).height);
                        if (((LinearLayout.LayoutParams) t8bVar8).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i84 <= 0) {
                                    i84 = 0;
                                }
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i84, 1073741824), childMeasureSpec2);
                                i63 = View.combineMeasuredStates(i63, childAt9.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt9.getMeasuredWidth() + i84;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i63 = View.combineMeasuredStates(i63, childAt9.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    int i85 = u8bVar.f;
                    if (z) {
                        u8bVar.f = childAt9.getMeasuredWidth() + ((LinearLayout.LayoutParams) t8bVar8).leftMargin + ((LinearLayout.LayoutParams) t8bVar8).rightMargin + i85;
                    } else {
                        u8bVar.f = Math.max(i85, childAt9.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) t8bVar8).leftMargin + ((LinearLayout.LayoutParams) t8bVar8).rightMargin);
                    }
                    if (mode4 != 1073741824 && ((LinearLayout.LayoutParams) t8bVar8).height == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i86 = ((LinearLayout.LayoutParams) t8bVar8).topMargin + ((LinearLayout.LayoutParams) t8bVar8).bottomMargin;
                    int measuredHeight4 = childAt9.getMeasuredHeight() + i86;
                    max = Math.max(max, measuredHeight4);
                    if (!z2) {
                        i86 = measuredHeight4;
                    }
                    int max4 = Math.max(i76, i86);
                    if (z21) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) t8bVar8).height == -1) {
                            z3 = true;
                            if (!z24 && (baseline = childAt9.getBaseline()) != i8) {
                                int i87 = ((LinearLayout.LayoutParams) t8bVar8).gravity;
                                if (i87 < 0) {
                                    i87 = u8bVar.e;
                                }
                                int i88 = (((i87 & 112) >> 4) & (-2)) >> 1;
                                iArr7[i88] = Math.max(iArr7[i88], baseline);
                                iArr8[i88] = Math.max(iArr8[i88], measuredHeight4 - baseline);
                            }
                            z21 = z3;
                            i76 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z3 = false;
                    if (!z24) {
                    }
                    z21 = z3;
                    i76 = max4;
                }
                i83++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            u8bVar.f = u8bVar.getPaddingRight() + u8bVar.getPaddingLeft() + u8bVar.f;
            int i89 = iArr7[1];
            if (i89 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max = Math.max(max, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i89, iArr7[c3]))));
            }
            i6 = i76;
        }
        if (!z21 && mode4 != 1073741824) {
            max = i6;
        }
        u8bVar.setMeasuredDimension(i3 | (i63 & i4), View.resolveSizeAndState(Math.max(u8bVar.getPaddingBottom() + u8bVar.getPaddingTop() + max, u8bVar.getSuggestedMinimumHeight()), i2, i63 << 16));
        if (z22) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(u8bVar.getMeasuredHeight(), 1073741824);
            int i90 = i5;
            while (i90 < virtualChildCount2) {
                View childAt10 = u8bVar.getChildAt(i90);
                if (childAt10.getVisibility() != 8) {
                    t8b t8bVar9 = (t8b) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t8bVar9).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) t8bVar9).width;
                        ((LinearLayout.LayoutParams) t8bVar9).width = childAt10.getMeasuredWidth();
                        u8bVar.measureChildWithMargins(childAt10, i57, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) t8bVar9).width = i91;
                    }
                }
                i90++;
                u8bVar = this;
                i57 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.b = i;
        } else {
            fi9.i("base aligned child index out of range (0, ", getChildCount(), ")");
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        boolean z = false;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }
}
