package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b5c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c5c c;

    public b5c(c5c c5cVar, boolean z, int i) {
        this.c = c5cVar;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c5c c5cVar = this.c;
        c5cVar.b.setTranslationX(0.0f);
        c5cVar.a(this.b, 0.0f, this.a);
    }
}
