package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ContentAwareScrollView extends ScrollView {
    private Listener listener;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface Listener {
        void onBottomReached();

        void onScrollChanged(int i);
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Listener getListener() {
        return this.listener;
    }

    public boolean isAtBottom() {
        int bottom = getChildAt(0).getBottom();
        if (bottom == 0) {
            return false;
        }
        if (getScrollY() + getBottom() < bottom) {
            return false;
        }
        return true;
    }

    public void notifyListenerIfAtBottom() {
        if (this.listener != null && isAtBottom()) {
            this.listener.onBottomReached();
        }
    }

    public void notifyListenerScrollChanged(int i) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onScrollChanged(i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        notifyListenerIfAtBottom();
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        notifyListenerIfAtBottom();
        notifyListenerScrollChanged(i2);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
        notifyListenerIfAtBottom();
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentAwareScrollView(Context context) {
        super(context);
    }
}
