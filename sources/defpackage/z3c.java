package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z3c implements OnBackAnimationCallback {
    public final /* synthetic */ x3c a;
    public final /* synthetic */ a4c b;

    public z3c(a4c a4cVar, x3c x3cVar) {
        this.b = a4cVar;
        this.a = x3cVar;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.b();
        }
    }

    public final void onBackInvoked() {
        this.a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.d(new m21(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.a(new m21(backEvent));
        }
    }
}
