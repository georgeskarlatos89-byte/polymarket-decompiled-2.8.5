package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ol8 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public nl8 e;
    public nl8 f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public ol8(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        nl8 nl8Var = this.f;
        View view = this.d;
        if (nl8Var != null) {
            view.removeCallbacks(nl8Var);
        }
        nl8 nl8Var2 = this.e;
        if (nl8Var2 != null) {
            view.removeCallbacks(nl8Var2);
        }
    }

    public abstract y5h b();

    public abstract boolean c();

    public boolean d() {
        y5h b = b();
        if (b != null && b.a()) {
            b.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        m27 o;
        boolean z2;
        boolean z3 = this.g;
        View view2 = this.d;
        if (z3) {
            y5h b = b();
            if (b != null && b.a() && (o = b.o()) != null && o.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                o.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = o.b(obtainNoHistory, this.h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (b2) {
                }
            }
            if (d()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.h);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.a;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z = true;
                                        if (z) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.h = motionEvent.getPointerId(0);
                    nl8 nl8Var = this.e;
                    if (nl8Var == null) {
                        nl8Var = new nl8(this, 0);
                        this.e = nl8Var;
                    }
                    view2.postDelayed(nl8Var, this.b);
                    nl8 nl8Var2 = this.f;
                    if (nl8Var2 == null) {
                        nl8Var2 = new nl8(this, 1);
                        this.f = nl8Var2;
                    }
                    view2.postDelayed(nl8Var2, this.c);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.g = z;
        if (!z && !z3) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        nl8 nl8Var = this.e;
        if (nl8Var != null) {
            this.d.removeCallbacks(nl8Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
