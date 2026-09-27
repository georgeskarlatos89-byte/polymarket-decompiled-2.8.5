package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class e9k {
    public static vlk a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        vlk h = vlk.h(null, rootWindowInsets);
        slk slkVar = h.a;
        slkVar.y(h);
        View rootView = view.getRootView();
        slkVar.d(rootView);
        slkVar.p(rootView);
        slkVar.q();
        return h;
    }
}
