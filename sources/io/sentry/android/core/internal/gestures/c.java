package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c {
    public final g a;
    public final int b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public MotionEvent k;
    public VelocityTracker l;
    public final io.sentry.util.a m = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.util.a] */
    public c(Activity activity, g gVar) {
        this.a = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(activity);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void a() {
        io.sentry.util.a aVar = this.m;
        aVar.e();
        try {
            MotionEvent motionEvent = this.k;
            this.k = null;
            VelocityTracker velocityTracker = this.l;
            this.l = null;
            aVar.close();
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
