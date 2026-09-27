package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o91 {
    public y70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ o91(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                p91 p91Var = (p91) view;
                p91Var.setIndeterminate(false);
                p91Var.c(p91Var.b);
                return;
            case 1:
                p91 p91Var2 = (p91) view;
                if (!p91Var2.g) {
                    p91Var2.setVisibility(p91Var2.h);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((u4c) view).o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                u4c u4cVar = (u4c) this.c;
                ColorStateList colorStateList = u4cVar.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(u4cVar.s, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Drawable drawable) {
    }
}
