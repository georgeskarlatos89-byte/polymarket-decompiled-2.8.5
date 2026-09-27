package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sac implements PopupWindow.OnDismissListener {
    public final /* synthetic */ tac a;

    public sac(tac tacVar) {
        this.a = tacVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
