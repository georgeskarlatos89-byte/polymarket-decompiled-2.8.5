package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qg0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zg0 zg0Var = (zg0) obj;
                if (!zg0Var.getInternalPopup().a()) {
                    zg0Var.f.k(zg0Var.getTextDirection(), zg0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = zg0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                wg0 wg0Var = (wg0) obj;
                zg0 zg0Var2 = wg0Var.E;
                if (zg0Var2.isAttachedToWindow() && zg0Var2.getGlobalVisibleRect(wg0Var.C)) {
                    wg0Var.s();
                    wg0Var.n();
                    return;
                } else {
                    wg0Var.dismiss();
                    return;
                }
            case 2:
                y93 y93Var = (y93) obj;
                ArrayList arrayList = y93Var.i;
                if (y93Var.a() && arrayList.size() > 0 && !((x93) arrayList.get(0)).a.y) {
                    View view = y93Var.p;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((x93) it.next()).a.n();
                        }
                        return;
                    }
                    y93Var.dismiss();
                    return;
                }
                return;
            default:
                evh evhVar = (evh) obj;
                xac xacVar = evhVar.i;
                if (evhVar.a() && !xacVar.y) {
                    View view2 = evhVar.n;
                    if (view2 != null && view2.isShown()) {
                        xacVar.n();
                        return;
                    } else {
                        evhVar.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
