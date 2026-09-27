package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tck extends AnimatorListenerAdapter implements fcj {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public tck(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // defpackage.fcj
    public final void a() {
        g(false);
        if (!this.f) {
            le3 le3Var = xbk.a;
            this.a.setTransitionVisibility(this.b);
        }
    }

    @Override // defpackage.fcj
    public final void c() {
        g(true);
        if (!this.f) {
            le3 le3Var = xbk.a;
            this.a.setTransitionVisibility(0);
        }
    }

    @Override // defpackage.fcj
    public final void e(gcj gcjVar) {
        gcjVar.B(this);
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (this.d && this.e != z && (viewGroup = this.c) != null) {
            this.e = z;
            viewGroup.suppressLayout(z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.f) {
                le3 le3Var = xbk.a;
                this.a.setTransitionVisibility(this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            le3 le3Var = xbk.a;
            this.a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            le3 le3Var = xbk.a;
            this.a.setTransitionVisibility(this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // defpackage.fcj
    public final void d(gcj gcjVar) {
    }

    @Override // defpackage.fcj
    public final void f(gcj gcjVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
