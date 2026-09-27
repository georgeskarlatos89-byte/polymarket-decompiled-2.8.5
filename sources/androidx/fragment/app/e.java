package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a35;
import defpackage.kgh;
import defpackage.m21;
import defpackage.ogh;
import defpackage.pd6;
import defpackage.qd6;
import defpackage.rd6;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e extends kgh {
    public final d c;
    public AnimatorSet d;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.kgh
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        i0 i0Var = this.c.a;
        if (animatorSet == null) {
            i0Var.c(this);
            return;
        }
        if (i0Var.g) {
            rd6.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (a0.L(2)) {
            i0Var.toString();
        }
    }

    @Override // defpackage.kgh
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        i0 i0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            i0Var.c(this);
            return;
        }
        animatorSet.start();
        if (a0.L(2)) {
            Objects.toString(i0Var);
        }
    }

    @Override // defpackage.kgh
    public final void d(m21 m21Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        i0 i0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            i0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && i0Var.c.mTransitioning) {
            if (a0.L(2)) {
                i0Var.toString();
            }
            long a = qd6.a.a(animatorSet);
            long j = m21Var.c * ((float) a);
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (a0.L(2)) {
                animatorSet.toString();
                i0Var.toString();
            }
            rd6.a.b(animatorSet, j);
        }
    }

    @Override // defpackage.kgh
    public final void e(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z;
        e eVar;
        viewGroup.getClass();
        d dVar = this.c;
        if (!dVar.a()) {
            Context context = viewGroup.getContext();
            context.getClass();
            a35 b = dVar.b(context);
            if (b != null) {
                animatorSet = (AnimatorSet) b.c;
            } else {
                animatorSet = null;
            }
            this.d = animatorSet;
            i0 i0Var = dVar.a;
            o oVar = i0Var.c;
            if (i0Var.a == ogh.GONE) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            View view = oVar.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                eVar = this;
                animatorSet2.addListener(new pd6(viewGroup, view, z2, i0Var, eVar));
            } else {
                eVar = this;
            }
            AnimatorSet animatorSet3 = eVar.d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
