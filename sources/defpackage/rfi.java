package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rfi implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ rfi(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        vfi vfiVar;
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                if (swipeRefreshLayout.c) {
                    swipeRefreshLayout.z.setAlpha(255);
                    swipeRefreshLayout.z.start();
                    if (swipeRefreshLayout.E && (vfiVar = swipeRefreshLayout.b) != null) {
                        vfiVar.onRefresh();
                    }
                    swipeRefreshLayout.n = swipeRefreshLayout.t.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                sfi sfiVar = new sfi(swipeRefreshLayout, 1);
                swipeRefreshLayout.B = sfiVar;
                sfiVar.setDuration(150L);
                t24 t24Var = swipeRefreshLayout.t;
                t24Var.a = null;
                t24Var.clearAnimation();
                swipeRefreshLayout.t.startAnimation(swipeRefreshLayout.B);
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
