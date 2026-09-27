package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class njg extends View {
    public Window a;
    public mjg b;

    public static /* synthetic */ float a(njg njgVar) {
        return njgVar.getBrightness();
    }

    public static /* synthetic */ void b(njg njgVar, float f) {
        njgVar.setBrightness(f);
    }

    private float getBrightness() {
        Window window = this.a;
        if (window == null) {
            o9n.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    private void setBrightness(float f) {
        if (this.a == null) {
            o9n.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            o9n.b("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.a.getAttributes();
        attributes.screenBrightness = f;
        this.a.setAttributes(attributes);
        o9n.e(3, "ScreenFlashView");
    }

    private void setScreenFlashUiInfo(in9 in9Var) {
        o9n.e(3, "ScreenFlashView");
    }

    public in9 getScreenFlash() {
        return this.b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(q03 q03Var) {
        xkm.a();
    }

    public void setScreenFlashWindow(Window window) {
        mjg mjgVar;
        xkm.a();
        o9n.e(3, "ScreenFlashView");
        if (this.a != window) {
            if (window == null) {
                mjgVar = null;
            } else {
                mjgVar = new mjg(this);
            }
            this.b = mjgVar;
        }
        this.a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
