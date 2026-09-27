package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class njb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qjb b;

    public /* synthetic */ njb(qjb qjbVar, int i) {
        this.a = i;
        this.b = qjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qjb qjbVar = this.b;
        switch (i) {
            case 0:
                m27 m27Var = qjbVar.c;
                if (m27Var != null) {
                    m27Var.setListSelectionHidden(true);
                    m27Var.requestLayout();
                    return;
                }
                return;
            default:
                m27 m27Var2 = qjbVar.c;
                if (m27Var2 != null && m27Var2.isAttachedToWindow() && qjbVar.c.getCount() > qjbVar.c.getChildCount() && qjbVar.c.getChildCount() <= qjbVar.m) {
                    qjbVar.z.setInputMethodMode(2);
                    qjbVar.n();
                    return;
                }
                return;
        }
    }
}
