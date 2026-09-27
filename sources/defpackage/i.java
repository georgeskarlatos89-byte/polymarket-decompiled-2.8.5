package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i extends Animatable2.AnimationCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ i(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        int i = this.a;
        Function0 function0 = this.c;
        switch (i) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            default:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }
}
