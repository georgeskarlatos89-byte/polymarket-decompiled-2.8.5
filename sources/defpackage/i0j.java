package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i0j extends WebView {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ i0j(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        switch (this.a) {
            case 0:
                clearHistory();
                onPause();
                removeAllViews();
                super.destroy();
                return;
            default:
                super.destroy();
                return;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.a) {
            case 1:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    public /* synthetic */ i0j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
