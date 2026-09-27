package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class cg0 extends wk4 implements jf0 {
    public ag0 e;
    public final bg0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cg0(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.f = new bg0(this);
        pf0 d = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((ag0) d).T = i;
        d.g();
    }

    @Override // defpackage.wk4, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        ag0 ag0Var = (ag0) d();
        ag0Var.B();
        ((ViewGroup) ag0Var.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        ag0Var.m.b(ag0Var.l.getCallback());
    }

    public final pf0 d() {
        ag0 ag0Var = this.e;
        if (ag0Var == null) {
            axg axgVar = pf0.a;
            ag0 ag0Var2 = new ag0(getContext(), getWindow(), this, this);
            this.e = ag0Var2;
            return ag0Var2;
        }
        return ag0Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        bg0 bg0Var = this.f;
        if (bg0Var == null) {
            return false;
        }
        return bg0Var.a.e(keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        ag0 ag0Var = (ag0) d();
        ag0Var.B();
        return ag0Var.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().e();
    }

    @Override // defpackage.wk4, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().d();
        super.onCreate(bundle);
        d().g();
    }

    @Override // defpackage.wk4, android.app.Dialog
    public final void onStop() {
        super.onStop();
        ag0 ag0Var = (ag0) d();
        ag0Var.F();
        i8 i8Var = ag0Var.o;
        if (i8Var != null) {
            i8Var.q(false);
        }
    }

    @Override // defpackage.jf0
    public final d9 onWindowStartingSupportActionMode(c9 c9Var) {
        return null;
    }

    @Override // defpackage.wk4, android.app.Dialog
    public void setContentView(int i) {
        b();
        d().k(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().o(getContext().getString(i));
    }

    @Override // defpackage.wk4, android.app.Dialog
    public void setContentView(View view) {
        b();
        d().l(view);
    }

    @Override // defpackage.wk4, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().o(charSequence);
    }

    @Override // defpackage.jf0
    public final void onSupportActionModeFinished(d9 d9Var) {
    }

    @Override // defpackage.jf0
    public final void onSupportActionModeStarted(d9 d9Var) {
    }
}
