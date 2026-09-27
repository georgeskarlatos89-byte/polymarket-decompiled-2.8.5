package defpackage;

import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oi1 extends WebView {
    public boolean a;
    public float b;

    public final boolean getExpansionState() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.a) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    if (Math.abs(motionEvent.getY() - this.b) <= 8.0f) {
                        return false;
                    }
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        this.b = motionEvent.getY();
        ViewParent parent3 = getParent();
        if (parent3 != null) {
            parent3.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.a) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                } else {
                    Math.abs(motionEvent.getY() - this.b);
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        this.b = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }
}
