package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nl8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol8 b;

    public /* synthetic */ nl8(ol8 ol8Var, int i) {
        this.a = i;
        this.b = ol8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ol8 ol8Var = this.b;
        switch (i) {
            case 0:
                ViewParent parent = ol8Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                ol8Var.a();
                View view = ol8Var.d;
                if (view.isEnabled() && !view.isLongClickable() && ol8Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    ol8Var.g = true;
                    return;
                }
                return;
        }
    }
}
