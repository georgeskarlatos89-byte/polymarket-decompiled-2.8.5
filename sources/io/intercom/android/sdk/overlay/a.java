package io.intercom.android.sdk.overlay;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                ChatNotification.c(viewGroup, valueAnimator);
                return;
            default:
                ChatNotification.d(viewGroup, valueAnimator);
                return;
        }
    }
}
