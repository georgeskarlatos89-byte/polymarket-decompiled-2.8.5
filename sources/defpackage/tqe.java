package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.common.utils.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tqe {
    public boolean A;
    public boolean B;
    public final oqe a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final pqe s = new pqe(this, 0);
    public final pqe t = new pqe(this, 3);
    public final pqe u = new pqe(this, 4);
    public final pqe v = new pqe(this, 5);
    public final pqe w = new pqe(this, 6);
    public final s93 x = new s93(this, 2);
    public boolean C = true;
    public int z = 0;
    public final ArrayList y = new ArrayList();

    public tqe(oqe oqeVar) {
        this.a = oqeVar;
        final int i = 0;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        this.b = oqeVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) oqeVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) oqeVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) oqeVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) oqeVar.findViewById(R.id.exo_time);
        View findViewById = oqeVar.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f = (ViewGroup) oqeVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) oqeVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) oqeVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = oqeVar.findViewById(R.id.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = oqeVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new c53(this, 13));
            findViewById3.setOnClickListener(new c53(this, 13));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qqe
            public final /* synthetic */ tqe b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i2;
                tqe tqeVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tqeVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tqeVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tqeVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tqeVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = tqeVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tqeVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new rqe(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qqe
            public final /* synthetic */ tqe b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i;
                tqe tqeVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tqeVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tqeVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tqeVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tqeVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = tqeVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tqeVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new rqe(this, 1));
        Resources resources = oqeVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new sqe(this, oqeVar, 0));
        animatorSet.play(ofFloat).with(d(findViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new sqe(this, oqeVar, 1));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new sqe(this, oqeVar, 2));
        animatorSet3.play(ofFloat).with(d(findViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new rqe(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new rqe(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qqe
            public final /* synthetic */ tqe b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                tqe tqeVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tqeVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tqeVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tqeVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tqeVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = tqeVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tqeVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new rqe(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qqe
            public final /* synthetic */ tqe b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                tqe tqeVar = this.b;
                switch (i5) {
                    case 0:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = tqeVar.b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = tqeVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = tqeVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        tqeVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = tqeVar.b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = tqeVar.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = tqeVar.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new rqe(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
        }
        return width;
    }

    public static ObjectAnimator d(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean j(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        if (view != null && this.y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        pqe pqeVar = this.w;
        oqe oqeVar = this.a;
        oqeVar.removeCallbacks(pqeVar);
        oqeVar.removeCallbacks(this.t);
        oqeVar.removeCallbacks(this.v);
        oqeVar.removeCallbacks(this.u);
    }

    public final void g() {
        if (this.z != 3) {
            f();
            int showTimeoutMs = this.a.getShowTimeoutMs();
            if (showTimeoutMs > 0) {
                if (!this.C) {
                    e(this.w, showTimeoutMs);
                } else if (this.z == 1) {
                    e(this.u, Scanner.CAMERA_SETUP_DELAY_MS);
                } else {
                    e(this.v, showTimeoutMs);
                }
            }
        }
    }

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i) {
        int i2 = this.z;
        this.z = i;
        oqe oqeVar = this.a;
        if (i == 2) {
            oqeVar.setVisibility(8);
        } else if (i2 == 2) {
            oqeVar.setVisibility(0);
        }
        if (i2 != i) {
            Iterator it = oqeVar.d.iterator();
            while (it.hasNext()) {
                nqe nqeVar = (nqe) it.next();
                oqeVar.getVisibility();
                ((pre) nqeVar).c.l();
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i = this.z;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.p.start();
            }
        } else {
            this.o.start();
        }
        g();
    }
}
