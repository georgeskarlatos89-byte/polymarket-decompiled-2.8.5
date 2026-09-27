package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.polymarket.android.R;
import defpackage.ace;
import defpackage.dmk;
import defpackage.g5n;
import defpackage.in8;
import defpackage.jm8;
import defpackage.vm8;
import defpackage.vr6;
import defpackage.wk4;
import defpackage.wr6;
import defpackage.xbc;
import defpackage.xr6;
import defpackage.yr6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class i extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler a;
    public boolean j;
    public Dialog l;
    public boolean m;
    public boolean n;
    public boolean o;
    public in8 b = new in8(this, 8);
    public vr6 c = new vr6(this);
    public wr6 d = new wr6(this);
    public int e = 0;
    public int f = 0;
    public boolean g = true;
    public boolean h = true;
    public int i = -1;
    public xr6 k = new xr6(this);
    public boolean p = false;

    @Override // androidx.fragment.app.o
    public final jm8 createFragmentContainer() {
        return new yr6(this, super.createFragmentContainer());
    }

    public void l() {
        m(false, false);
    }

    public final void m(boolean z, boolean z2) {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = false;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.l.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.a.getLooper()) {
                    onDismiss(this.l);
                } else {
                    this.a.post(this.b);
                }
            }
        }
        this.m = true;
        if (this.i >= 0) {
            a0 parentFragmentManager = getParentFragmentManager();
            int i = this.i;
            parentFragmentManager.getClass();
            if (i >= 0) {
                parentFragmentManager.x(new vm8(parentFragmentManager, null, i, 1), z);
                this.i = -1;
                return;
            } else {
                dmk.v(ace.f(i, "Bad id: "));
                return;
            }
        }
        a0 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        a aVar = new a(parentFragmentManager2);
        aVar.r = true;
        aVar.k(this);
        if (z) {
            aVar.i(true, true);
        } else {
            aVar.h();
        }
    }

    public Dialog n() {
        if (a0.L(3)) {
            toString();
        }
        return new wk4(requireContext(), this.f);
    }

    public final Dialog o() {
        Dialog dialog = this.l;
        if (dialog != null) {
            return dialog;
        }
        xbc.o(this, " does not have a Dialog.", "DialogFragment ");
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.k);
        if (!this.o) {
            this.n = false;
        }
    }

    @Override // androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.a = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (bundle != null) {
            this.e = bundle.getInt("android:style", 0);
            this.f = bundle.getInt("android:theme", 0);
            this.g = bundle.getBoolean("android:cancelable", true);
            this.h = bundle.getBoolean("android:showsDialog", this.h);
            this.i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.m = true;
            dialog.setOnDismissListener(null);
            this.l.dismiss();
            if (!this.n) {
                onDismiss(this.l);
            }
            this.l = null;
            this.p = false;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        if (!this.o && !this.n) {
            this.n = true;
        }
        getViewLifecycleOwnerLiveData().j(this.k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.m) {
            if (a0.L(3)) {
                toString();
            }
            m(true, true);
        }
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.h;
        if (z && !this.j) {
            if (z && !this.p) {
                try {
                    this.j = true;
                    Dialog n = n();
                    this.l = n;
                    if (this.h) {
                        q(n, this.e);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.l.setOwnerActivity((Activity) context);
                        }
                        this.l.setCancelable(this.g);
                        this.l.setOnCancelListener(this.c);
                        this.l.setOnDismissListener(this.d);
                        this.p = true;
                    } else {
                        this.l = null;
                    }
                    this.j = false;
                } catch (Throwable th) {
                    this.j = false;
                    throw th;
                }
            }
            if (a0.L(2)) {
                toString();
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (a0.L(2)) {
            toString();
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.e;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.g;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.h;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.i;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
        super.onStart();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.m = false;
            dialog.show();
            View decorView = this.l.getWindow().getDecorView();
            g5n.c(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
        super.onStop();
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.l != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.l.onRestoreInstanceState(bundle2);
        }
    }

    public final void p(int i, int i2) {
        if (a0.L(2)) {
            toString();
        }
        this.e = i;
        if (i == 2 || i == 3) {
            this.f = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.f = i2;
        }
    }

    @Override // androidx.fragment.app.o
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.l != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.l.onRestoreInstanceState(bundle2);
        }
    }

    public void q(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void r(a0 a0Var, String str) {
        this.n = false;
        this.o = true;
        a0Var.getClass();
        a aVar = new a(a0Var);
        aVar.r = true;
        aVar.d(0, this, str, 1);
        aVar.h();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
