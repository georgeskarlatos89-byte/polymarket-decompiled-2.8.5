package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class s79 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s79(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((hbk) this.c).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj2;
                hideBottomViewOnScrollBehavior.k = null;
                if (hideBottomViewOnScrollBehavior.j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj2;
                hideViewOnScrollBehavior.k = null;
                if (hideViewOnScrollBehavior.j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    return;
                }
                return;
            case 2:
                ((fl0) obj).remove(animator);
                ((gcj) obj2).n.remove(animator);
                return;
            default:
                ((hbk) obj2).c();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 2:
                ((gcj) obj).n.add(animator);
                return;
            case 3:
                ((hbk) obj).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
