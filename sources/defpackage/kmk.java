package defpackage;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kmk implements jmk {
    public static final kmk a = new Object();

    @Override // defpackage.jmk
    public final fmk m(ContextWrapper contextWrapper, jl6 jl6Var) {
        WindowManager windowManager;
        if (contextWrapper.isUiContext()) {
            windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new fmk(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
