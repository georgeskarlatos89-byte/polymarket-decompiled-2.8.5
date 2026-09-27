package io.intercom.android.sdk.overlay;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ InAppNotification b;
    public final /* synthetic */ FrameLayout.LayoutParams c;

    public /* synthetic */ b(InAppNotification inAppNotification, FrameLayout.LayoutParams layoutParams, int i) {
        this.a = i;
        this.b = inAppNotification;
        this.c = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        FrameLayout.LayoutParams layoutParams = this.c;
        InAppNotification inAppNotification = this.b;
        switch (i) {
            case 0:
                InAppNotification.b(inAppNotification, layoutParams, valueAnimator);
                return;
            default:
                InAppNotification.a(inAppNotification, layoutParams, valueAnimator);
                return;
        }
    }
}
