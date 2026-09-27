package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class j54 extends ke7 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final c53 j;
    public final j63 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public j54(je7 je7Var) {
        super(je7Var);
        this.j = new c53(this, 1);
        this.k = new j63(this, 3);
        this.e = uen.c(je7Var.getContext(), R.attr.motionDurationShort3, 100);
        this.f = uen.c(je7Var.getContext(), R.attr.motionDurationShort3, 150);
        this.g = rhn.c(je7Var.getContext(), R.attr.motionEasingLinearInterpolator, na0.a);
        this.h = rhn.c(je7Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, na0.d);
    }

    @Override // defpackage.ke7
    public final void a() {
        if (this.b.p != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.ke7
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.ke7
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.ke7
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.ke7
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.ke7
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.ke7
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.ke7
    public final void o(boolean z) {
        if (this.b.p == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.ke7
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h54
            public final /* synthetic */ j54 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                j54 j54Var = this.b;
                switch (i2) {
                    case 0:
                        j54Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = j54Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h54
            public final /* synthetic */ j54 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                j54 j54Var = this.b;
                switch (i22) {
                    case 0:
                        j54Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = j54Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new i54(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h54
            public final /* synthetic */ j54 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                j54 j54Var = this.b;
                switch (i22) {
                    case 0:
                        j54Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = j54Var.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new i54(this, 1));
    }

    @Override // defpackage.ke7
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new q1(this, 22));
        }
    }

    public final void s(boolean z) {
        boolean z2;
        if (this.b.d() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean t() {
        boolean z;
        boolean z2;
        boolean z3;
        EditText editText = this.i;
        if (editText != null) {
            if (!editText.hasFocus() && !this.d.hasFocus()) {
                z = false;
            } else {
                z = true;
            }
            if (this.i.getText().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.b.p != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && (z2 || z3)) {
                return true;
            }
        }
        return false;
    }
}
