package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.polymarket.android.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ns6 extends wk4 {
    public Function0 e;
    public js6 f;
    public final View g;
    public final fs6 h;
    public boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ns6(Function0 function0, js6 js6Var, View view, owa owaVar, il6 il6Var, UUID uuid) {
        super(new ContextThemeWrapper(r1, r2), 0);
        int i;
        Context context = view.getContext();
        if (js6Var.e) {
            i = R.style.DialogWindowTheme;
        } else {
            i = R.style.FloatingDialogWindowTheme;
        }
        this.e = function0;
        this.f = js6Var;
        this.g = view;
        Window window = getWindow();
        if (window != null) {
            js6 js6Var2 = this.f;
            Window window2 = getWindow();
            if (window2 != null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.type = js6Var2.g;
                window2.setAttributes(attributes);
            }
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            w6n.c(window, this.f.e);
            window.setGravity(17);
            if (!this.f.e) {
                window.addFlags(65792);
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                gd0.a.a(attributes2);
                hd0 hd0Var = hd0.a;
                hd0Var.b(attributes2, 0);
                hd0Var.c(attributes2, 0);
                window.setAttributes(attributes2);
            }
            fs6 fs6Var = new fs6(getContext(), window);
            setTitle(this.f.f);
            fs6Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            fs6Var.setClipChildren(false);
            fs6Var.setElevation(il6Var.t0(8.0f));
            fs6Var.setOutlineProvider(new o74(1));
            this.h = fs6Var;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                d(viewGroup);
            }
            setContentView(fs6Var);
            fs6Var.setTag(R.id.view_tree_lifecycle_owner, g5n.b(view));
            fs6Var.setTag(R.id.view_tree_view_model_store_owner, l5n.a(view));
            fs6Var.setTag(R.id.view_tree_saved_state_registry_owner, h5n.a(view));
            e(this.e, this.f, owaVar);
            skn.a(getOnBackPressedDispatcher(), this, new x10(this, 1), 2);
            return;
        }
        dmk.n("Dialog has no window");
        throw null;
    }

    public static final void d(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof fs6)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    d(viewGroup2);
                }
            }
        }
    }

    public final void e(Function0 function0, js6 js6Var, owa owaVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.e = function0;
        this.f = js6Var;
        eng engVar = js6Var.c;
        boolean c = z40.c(this.g);
        int i4 = fng.a[engVar.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    dmk.a();
                    return;
                }
            } else {
                c = true;
            }
        } else {
            c = false;
        }
        Window window = getWindow();
        window.getClass();
        if (c) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int i6 = ms6.a[owaVar.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i2 = 1;
            } else {
                dmk.a();
                return;
            }
        } else {
            i2 = 0;
        }
        fs6 fs6Var = this.h;
        fs6Var.setLayoutDirection(i2);
        boolean z2 = js6Var.e;
        boolean z3 = js6Var.d;
        Window window2 = fs6Var.a;
        if (fs6Var.e && z3 == fs6Var.c && z2 == fs6Var.d) {
            z = false;
        } else {
            z = true;
        }
        fs6Var.c = z3;
        fs6Var.d = z2;
        if (z) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !fs6Var.e) {
                window2.setLayout(i3, -2);
                fs6Var.e = true;
            }
        }
        setCanceledOnTouchOutside(js6Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                i5 = 48;
            }
            window3.setSoftInputMode(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f.a && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.e.invoke();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f.b) {
            fs6 fs6Var = this.h;
            fs6Var.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = fs6Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + fs6Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + fs6Var.getTop();
                int height = childAt.getHeight() + top;
                int e = i5c.e(motionEvent.getX());
                if (left <= e) {
                    if (e <= width) {
                        int e2 = i5c.e(motionEvent.getY());
                        if (top <= e2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.i = false;
                        return onTouchEvent;
                    }
                } else if (this.i) {
                    this.e.invoke();
                    this.i = false;
                    return true;
                }
                return onTouchEvent;
            }
            this.i = true;
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.i = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
