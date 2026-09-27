package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class LockableScrollView extends ScrollView {
    private boolean interceptTouch;
    private boolean isExpanded;
    private int maxHeight;
    private boolean scrollable;

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
        setUp(attributeSet);
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.interceptTouch;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.isExpanded) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.maxHeight), mode);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.scrollable && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (this.scrollable) {
            super.scrollTo(i, i2);
        }
    }

    public void setExpanded(boolean z) {
        if (z != this.isExpanded) {
            this.isExpanded = z;
            requestLayout();
            invalidate();
        }
    }

    public void setScrollingEnabled(boolean z) {
        this.scrollable = z;
    }

    public void setUp(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LockableScrollView);
        this.maxHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LockableScrollView_intercomHeightLimit, 0);
        this.isExpanded = obtainStyledAttributes.getBoolean(R.styleable.LockableScrollView_intercomExpanded, true);
        this.interceptTouch = obtainStyledAttributes.getBoolean(R.styleable.LockableScrollView_intercomInterceptTouch, true);
        obtainStyledAttributes.recycle();
    }

    public void toggleExpanded() {
        setExpanded(!this.isExpanded);
    }

    public LockableScrollView(Context context) {
        super(context);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
        setUp(attributeSet);
    }
}
