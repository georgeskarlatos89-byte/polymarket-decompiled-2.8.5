package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vg0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ qg0 a;
    public final /* synthetic */ wg0 b;

    public vg0(wg0 wg0Var, qg0 qg0Var) {
        this.b = wg0Var;
        this.a = qg0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.E.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
