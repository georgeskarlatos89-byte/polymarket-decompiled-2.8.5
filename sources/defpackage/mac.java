package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mac extends FrameLayout implements f94 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public mac(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.f94
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.f94
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
