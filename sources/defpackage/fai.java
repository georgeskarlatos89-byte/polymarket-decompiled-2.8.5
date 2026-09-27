package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fai extends cac implements SubMenu {
    public final kac A;
    public final cac z;

    public fai(Context context, cac cacVar, kac kacVar) {
        super(context);
        this.z = cacVar;
        this.A = kacVar;
    }

    @Override // defpackage.cac
    public final boolean d(kac kacVar) {
        return this.z.d(kacVar);
    }

    @Override // defpackage.cac
    public final boolean e(cac cacVar, MenuItem menuItem) {
        if (!super.e(cacVar, menuItem) && !this.z.e(cacVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cac
    public final boolean f(kac kacVar) {
        return this.z.f(kacVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.cac
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return ace.f(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.cac
    public final cac k() {
        return this.z.k();
    }

    @Override // defpackage.cac
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.cac
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.cac
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.cac, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.cac, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
