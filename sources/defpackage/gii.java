package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gii {
    public final dii a;
    public final ArrayList b = new ArrayList();
    public fz9 c;
    public fz9 d;
    public int e;

    public gii(ViewGroup viewGroup) {
        int i;
        View view;
        fz9 fz9Var = fz9.e;
        this.c = fz9Var;
        this.d = fz9Var;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        this.e = i;
        dii diiVar = new dii(this, viewGroup.getContext(), viewGroup);
        this.a = diiVar;
        diiVar.setVisibility(8);
        diiVar.setWillNotDraw(true);
        k0i k0iVar = new k0i(this, 4);
        WeakHashMap weakHashMap = k9k.a;
        d9k.b(diiVar, k0iVar);
        x3g.n(diiVar, new eii(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount >= 0) {
                view = viewGroup.getChildAt(childCount);
                if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                    break;
                } else {
                    childCount--;
                }
            } else {
                view = null;
                break;
            }
        }
        if (view == null) {
            viewGroup.addView(diiVar, 0);
        } else {
            view.addOnAttachStateChangeListener(new fii(viewGroup, 0, diiVar));
        }
    }
}
