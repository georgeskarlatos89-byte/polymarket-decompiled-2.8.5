package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xac extends qjb implements jac {
    public m4l A;

    @Override // defpackage.jac
    public final void c(cac cacVar, MenuItem menuItem) {
        m4l m4lVar = this.A;
        if (m4lVar != null) {
            m4lVar.c(cacVar, menuItem);
        }
    }

    @Override // defpackage.jac
    public final void h(cac cacVar, kac kacVar) {
        m4l m4lVar = this.A;
        if (m4lVar != null) {
            m4lVar.h(cacVar, kacVar);
        }
    }

    @Override // defpackage.qjb
    public final m27 q(Context context, boolean z) {
        wac wacVar = new wac(context, z);
        wacVar.setHoverListener(this);
        return wacVar;
    }
}
