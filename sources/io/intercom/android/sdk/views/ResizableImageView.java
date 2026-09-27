package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ResizableImageView extends AppCompatImageView {
    private int imageHeight;
    private int imageWidth;
    private int totalViewPadding;

    public ResizableImageView(Context context) {
        this(context, null);
    }

    private int calculateContainerWidth() {
        return ScreenUtils.getScreenDimensions(getContext()).x;
    }

    public Point getImageDimens() {
        double aspectRatio = ImageUtils.getAspectRatio(this.imageWidth, this.imageHeight);
        int min = Math.min(this.imageWidth, calculateContainerWidth() - this.totalViewPadding);
        return new Point(min, ImageUtils.getAspectHeight(min, aspectRatio));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Point imageDimens = getImageDimens();
        if (this.imageWidth > 0 && this.imageHeight > 0) {
            setMeasuredDimension(imageDimens.x, imageDimens.y);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setDisplayImageDimensions(int i, int i2) {
        this.imageHeight = i2;
        this.imageWidth = i;
    }

    public void setTotalViewPadding(int i) {
        this.totalViewPadding = i;
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
