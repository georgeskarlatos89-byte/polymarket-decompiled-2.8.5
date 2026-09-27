package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r79 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ q65 c;

    public /* synthetic */ r79(q65 q65Var, View view, int i) {
        this.a = i;
        this.c = q65Var;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.a;
        View view = this.b;
        q65 q65Var = this.c;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) q65Var;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.w(view);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) q65Var;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.x(view);
                    return;
                }
                return;
        }
    }
}
