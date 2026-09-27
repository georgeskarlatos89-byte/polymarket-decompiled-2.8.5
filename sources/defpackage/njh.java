package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class njh {
    public static final z47 p = new z47(1);
    public static final z47 q = new z47(2);
    public static final z47 r = new z47(3);
    public static final z47 s = new z47(4);
    public static final z47 t = new z47(5);
    public static final z47 u = new z47(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final ojl e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public ojh m;
    public float n;
    public boolean o;

    public njh(Object obj, ojl ojlVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = ojlVar;
        if (ojlVar != r && ojlVar != s && ojlVar != t) {
            if (ojlVar == u) {
                this.j = 0.00390625f;
            } else if (ojlVar != p && ojlVar != q) {
                this.j = 1.0f;
            } else {
                this.j = 0.002f;
            }
        } else {
            this.j = 0.1f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static ha0 b() {
        ThreadLocal threadLocal = ha0.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new ha0(new r66(9)));
        }
        return (ha0) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r6v23, types: [fa0, java.lang.Object] */
    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        ojh ojhVar = this.m;
        if (ojhVar == null) {
            ojhVar = new ojh(f);
            this.m = ojhVar;
        }
        double d = f;
        ojhVar.i = d;
        double d2 = (float) d;
        if (d2 <= this.g) {
            if (d2 >= this.h) {
                double abs = Math.abs(this.j * 0.75f);
                ojhVar.d = abs;
                ojhVar.e = abs * 62.5d;
                if (Thread.currentThread() == ((Looper) b().e.c).getThread()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.b(this.d);
                        }
                        float f2 = this.b;
                        if (f2 <= this.g && f2 >= this.h) {
                            ha0 b = b();
                            ArrayList arrayList = b.b;
                            if (arrayList.size() == 0) {
                                ((Choreographer) b.e.b).postFrameCallback(new ga0(b.d, 0));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    b.g = w6.a();
                                    final ry9 ry9Var = b.h;
                                    if (ry9Var == null) {
                                        ry9Var = new ry9(b);
                                        b.h = ry9Var;
                                    }
                                    if (((fa0) ry9Var.b) == null) {
                                        ?? r6 = new ValueAnimator.DurationScaleChangeListener() { // from class: fa0
                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                            public final void onChanged(float f3) {
                                                ((ha0) ry9.this.c).g = f3;
                                            }
                                        };
                                        ry9Var.b = r6;
                                        w6.B(r6);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        dmk.v("Starting value need to be in between min value and max value");
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            py2.f("Final position of the spring cannot be less than the min value.");
            return;
        }
        py2.f("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f) {
        if (f > 0.0f) {
            this.j = f;
        } else {
            dmk.v("Minimum visible change must be positive.");
        }
    }

    public final void d(float f) {
        ArrayList arrayList;
        this.e.f(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                bcj bcjVar = (bcj) arrayList.get(i);
                float f2 = this.b;
                ucj ucjVar = bcjVar.h;
                long max = Math.max(-1L, Math.min(ucjVar.x + 1, Math.round(f2)));
                ucjVar.F(max, bcjVar.a);
                bcjVar.a = max;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e() {
        if (this.m.b > ConstantsKt.UNSET) {
            if (Thread.currentThread() == ((Looper) b().e.c).getThread()) {
                if (this.f) {
                    this.o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        py2.f("Spring animations can only come to an end when there is damping");
    }

    public njh(q88 q88Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new a57(q88Var);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
