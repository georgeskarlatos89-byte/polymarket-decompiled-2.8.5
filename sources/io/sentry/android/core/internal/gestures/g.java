package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.appsflyer.internal.l;
import defpackage.cxi;
import defpackage.sv6;
import defpackage.woa;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.e1;
import io.sentry.f7;
import io.sentry.j0;
import io.sentry.j7;
import io.sentry.k7;
import io.sentry.o1;
import io.sentry.p5;
import io.sentry.protocol.h0;
import io.sentry.x0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final e1 b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.c d = null;
    public o1 e = null;
    public e f;
    public final f g;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, io.sentry.android.core.internal.gestures.f] */
    public g(Activity activity, e1 e1Var, SentryAndroidOptions sentryAndroidOptions) {
        e eVar = e.Unknown;
        this.f = eVar;
        ?? obj = new Object();
        obj.a = eVar;
        obj.c = 0.0f;
        obj.d = 0.0f;
        this.g = obj;
        this.a = new WeakReference(activity);
        this.b = e1Var;
        this.c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.c cVar, e eVar, Map map, MotionEvent motionEvent) {
        String str;
        if (!this.c.isEnableUserInteractionBreadcrumbs()) {
            return;
        }
        int i = d.a[eVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "unknown";
                } else {
                    str = "swipe";
                }
            } else {
                str = "scroll";
            }
        } else {
            str = "click";
        }
        j0 j0Var = new j0();
        j0Var.d(motionEvent, "android:motionEvent");
        j0Var.d(cVar.a.get(), "android:view");
        String str2 = cVar.c;
        String str3 = cVar.b;
        String str4 = cVar.d;
        io.sentry.e eVar2 = new io.sentry.e();
        eVar2.e = "user";
        eVar2.g = "ui.".concat(str);
        if (str2 != null) {
            eVar2.d(str2, "view.id");
        }
        if (str3 != null) {
            eVar2.d(str3, "view.class");
        }
        if (str4 != null) {
            eVar2.d(str4, "view.tag");
        }
        for (Map.Entry entry : map.entrySet()) {
            eVar2.d(entry.getValue(), (String) entry.getKey());
        }
        eVar2.i = p5.INFO;
        this.b.g(eVar2, j0Var);
    }

    public final View b(String str) {
        Activity activity = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().f(p5.DEBUG, sv6.n("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().f(p5.DEBUG, sv6.n("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            sentryAndroidOptions.getLogger().f(p5.DEBUG, sv6.n("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        return peekDecorView;
    }

    public final void c(io.sentry.internal.gestures.c cVar, e eVar) {
        boolean z;
        boolean z2;
        String str;
        Long valueOf;
        if (eVar == this.f && cVar.equals(this.d)) {
            z = true;
        } else {
            z = false;
        }
        if (eVar == e.Click || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean isTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        e1 e1Var = this.b;
        if (isTracingEnabled && sentryAndroidOptions.isEnableUserInteractionTracing()) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                sentryAndroidOptions.getLogger().f(p5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            String str2 = cVar.c;
            if (str2 == null) {
                str2 = cVar.d;
                io.sentry.util.b.t(str2, "UiElement.tag can't be null");
            }
            o1 o1Var = this.e;
            if (o1Var != null) {
                if (!z2 && !o1Var.e()) {
                    sentryAndroidOptions.getLogger().f(p5.DEBUG, sv6.n("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                    if (sentryAndroidOptions.getIdleTimeout() != null) {
                        this.e.t();
                        return;
                    }
                    return;
                }
                d(f7.OK);
            }
            o1[] o1VarArr = {null};
            e1Var.p(new com.socure.docv.capturesdk.core.extractor.a(o1VarArr, 13));
            if (o1VarArr[0] != null) {
                sentryAndroidOptions.getLogger().f(p5.DEBUG, "Transaction won't be created for view with id: %s since there's already a transaction bound to the Scope.", str2);
                return;
            }
            String r = woa.r(new StringBuilder(activity.getClass().getSimpleName()), ".", str2);
            int i = d.a[eVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "unknown";
                    } else {
                        str = "swipe";
                    }
                } else {
                    str = "scroll";
                }
            } else {
                str = "click";
            }
            String concat = "ui.action.".concat(str);
            k7 k7Var = new k7();
            k7Var.g = true;
            long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
            if (deadlineTimeout <= 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(deadlineTimeout);
            }
            k7Var.i = valueOf;
            k7Var.h = sentryAndroidOptions.getIdleTimeout();
            k7Var.b = true;
            k7Var.e = "auto.ui.gesture_listener.".concat(cVar.e);
            o1 w = e1Var.w(new j7(r, h0.COMPONENT, concat, null), k7Var);
            e1Var.p(new cxi(11, this, w));
            this.e = w;
            this.d = cVar;
            this.f = eVar;
            return;
        }
        if (z2) {
            if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                e1Var.p(new l(28));
            }
            this.d = cVar;
            this.f = eVar;
        }
    }

    public final void d(f7 f7Var) {
        o1 o1Var = this.e;
        if (o1Var != null) {
            f7 c = o1Var.c();
            o1 o1Var2 = this.e;
            if (c == null) {
                o1Var2.p(f7Var);
            } else {
                o1Var2.g();
            }
        }
        this.b.p(new com.socure.docv.capturesdk.core.extractor.a(this, 12));
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        f fVar = this.g;
        fVar.b = null;
        fVar.a = e.Unknown;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        fVar.c = motionEvent.getX();
        fVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.a = e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View b = b("onScroll");
        if (b != null && motionEvent != null) {
            f fVar = this.g;
            if (fVar.a == e.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.c f0 = io.sentry.config.a.f0(sentryAndroidOptions, b, x, y, bVar);
                if (f0 == null) {
                    sentryAndroidOptions.getLogger().f(p5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    fVar.a = e.Scroll;
                    return false;
                }
                x0 logger = sentryAndroidOptions.getLogger();
                p5 p5Var = p5.DEBUG;
                String str = f0.c;
                if (str == null) {
                    str = f0.d;
                    io.sentry.util.b.t(str, "UiElement.tag can't be null");
                }
                logger.f(p5Var, "Scroll target found: ".concat(str), new Object[0]);
                fVar.b = f0;
                fVar.a = e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View b = b("onSingleTapUp");
        if (b != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.c f0 = io.sentry.config.a.f0(sentryAndroidOptions, b, x, y, bVar);
            if (f0 == null) {
                sentryAndroidOptions.getLogger().f(p5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e eVar = e.Click;
            a(f0, eVar, Collections.EMPTY_MAP, motionEvent);
            c(f0, eVar);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
