package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l93 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ l93(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return;
            case 1:
                ((m93) view).setVisibility(4);
                return;
            default:
                view.setVisibility(4);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                ((m93) view).setVisibility(0);
                return;
            case 1:
                ((m93) view).setVisibility(0);
                return;
            default:
                view.setVisibility(0);
                return;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
