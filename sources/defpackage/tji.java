package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tji implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ uji c;

    public tji(uji ujiVar, View view, View view2) {
        this.c = ujiVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
