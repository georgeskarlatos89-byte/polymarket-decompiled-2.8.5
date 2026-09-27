package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class d9k {
    public static vlk a(View view, vlk vlkVar, Rect rect) {
        WindowInsets g = vlkVar.g();
        if (g != null) {
            return vlk.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return vlkVar;
    }

    public static void b(View view, qhd qhdVar) {
        c9k c9kVar;
        if (qhdVar != null) {
            c9kVar = new c9k(view, qhdVar);
        } else {
            c9kVar = null;
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (c9kVar != null) {
            view.setOnApplyWindowInsetsListener(c9kVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
