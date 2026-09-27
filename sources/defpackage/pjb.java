package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pjb implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pjb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qjb qjbVar = (qjb) obj;
                njb njbVar = qjbVar.r;
                Handler handler = qjbVar.v;
                kg0 kg0Var = qjbVar.z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && kg0Var != null && kg0Var.isShowing() && x >= 0 && x < kg0Var.getWidth() && y >= 0 && y < kg0Var.getHeight()) {
                    handler.postDelayed(njbVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(njbVar);
                }
                return false;
            default:
                if (!((Checkable) view).isChecked()) {
                    return false;
                }
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
        }
    }
}
