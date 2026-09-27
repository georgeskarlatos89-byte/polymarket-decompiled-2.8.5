package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o17 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p17 b;

    public /* synthetic */ o17(p17 p17Var, int i) {
        this.a = i;
        this.b = p17Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                p17 p17Var = this.b;
                p17.a(p17Var);
                ArrayList arrayList = p17Var.g;
                if (arrayList != null && !p17Var.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((o91) it.next()).a(p17Var);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                p17 p17Var = this.b;
                ArrayList arrayList = p17Var.g;
                if (arrayList != null && !p17Var.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((o91) it.next()).b(p17Var);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
