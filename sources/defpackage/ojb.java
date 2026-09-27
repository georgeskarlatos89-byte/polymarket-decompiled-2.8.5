package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ojb implements AbsListView.OnScrollListener {
    public final /* synthetic */ qjb a;

    public ojb(qjb qjbVar) {
        this.a = qjbVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        qjb qjbVar = this.a;
        njb njbVar = qjbVar.r;
        kg0 kg0Var = qjbVar.z;
        if (i == 1 && kg0Var.getInputMethodMode() != 2 && kg0Var.getContentView() != null) {
            qjbVar.v.removeCallbacks(njbVar);
            njbVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
