package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b98 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final jqi a;

    public b98(jqi jqiVar) {
        this.a = jqiVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ((h60) this.a).a(menu);
        if (menu.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((h60) this.a).a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        zrf zrfVar = (zrf) ((h60) this.a).c.invoke();
        rect.set(Math.round(zrfVar.a), Math.round(zrfVar.b), Math.round(zrfVar.c), Math.round(zrfVar.d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return ((h60) this.a).a(menu);
    }
}
