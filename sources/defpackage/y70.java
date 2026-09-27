package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y70 extends Animatable2.AnimationCallback {
    public final /* synthetic */ o91 a;

    public y70(o91 o91Var) {
        this.a = o91Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}
