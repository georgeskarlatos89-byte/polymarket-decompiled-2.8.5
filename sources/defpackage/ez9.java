package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ez9 implements View.OnTouchListener {
    public final Dialog a;
    public final int b;
    public final int c;

    public ez9(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.a.onTouchEvent(obtain);
    }
}
