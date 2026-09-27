package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.braze.ui.R$styleable;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "maxDefinedWidthPixels", "I", "minDefinedWidthPixels", "maxDefinedHeightPixels", "minDefinedHeightPixels", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int maxDefinedHeightPixels;
    private int maxDefinedWidthPixels;
    private int minDefinedHeightPixels;
    private int minDefinedWidthPixels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int[] iArr = R$styleable.InAppMessageBoundedLayout;
        iArr.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.maxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
        this.minDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
        this.maxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
        this.minDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i = this.minDefinedWidthPixels;
        if (i > 0 && size < i) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.minDefinedWidthPixels, View.MeasureSpec.getMode(widthMeasureSpec));
        } else {
            int i2 = this.maxDefinedWidthPixels;
            if (i2 > 0 && size > i2) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxDefinedWidthPixels, View.MeasureSpec.getMode(widthMeasureSpec));
            }
        }
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i3 = this.minDefinedHeightPixels;
        if (i3 > 0 && size2 < i3) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.minDefinedHeightPixels, View.MeasureSpec.getMode(heightMeasureSpec));
        } else {
            int i4 = this.maxDefinedHeightPixels;
            if (i4 > 0 && size2 > i4) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxDefinedHeightPixels, View.MeasureSpec.getMode(heightMeasureSpec));
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
