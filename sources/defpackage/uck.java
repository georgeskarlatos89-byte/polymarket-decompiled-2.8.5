package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uck extends AnimatorListenerAdapter implements fcj {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ kv7 e;

    public uck(kv7 kv7Var, ViewGroup viewGroup, View view, View view2) {
        this.e = kv7Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.fcj
    public final void d(gcj gcjVar) {
        if (this.d) {
            g();
        }
    }

    @Override // defpackage.fcj
    public final void e(gcj gcjVar) {
        gcjVar.B(this);
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            g();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            k9k.a(view, this.a);
        } else {
            this.e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            k9k.a(view2, this.a);
            this.d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // defpackage.fcj
    public final void a() {
    }

    @Override // defpackage.fcj
    public final void c() {
    }

    @Override // defpackage.fcj
    public final void f(gcj gcjVar) {
    }
}
