package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ns9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ns9(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                InAppMessageImmersiveBaseView.d(view);
                return;
            case 1:
                int i2 = InformationZoneView.l;
                Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                view.getHitRect(rect);
                view.requestRectangleOnScreen(rect, false);
                return;
            case 2:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                ((InputMethodManager) d55.l(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
