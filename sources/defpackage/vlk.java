package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vlk {
    public static final vlk b;
    public final slk a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            b = qlk.s;
        } else {
            b = olk.r;
        }
    }

    public vlk(vlk vlkVar) {
        if (vlkVar != null) {
            slk slkVar = vlkVar.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 && (slkVar instanceof rlk)) {
                this.a = new rlk(this, (rlk) slkVar);
            } else if (i >= 34 && (slkVar instanceof qlk)) {
                this.a = new qlk(this, (qlk) slkVar);
            } else if (slkVar instanceof plk) {
                this.a = new plk(this, (plk) slkVar);
            } else if (slkVar instanceof olk) {
                this.a = new olk(this, (olk) slkVar);
            } else if (slkVar instanceof nlk) {
                this.a = new nlk(this, (nlk) slkVar);
            } else if (slkVar instanceof mlk) {
                this.a = new mlk(this, (mlk) slkVar);
            } else if (slkVar instanceof llk) {
                this.a = new llk(this, (llk) slkVar);
            } else if (slkVar instanceof klk) {
                this.a = new klk(this, (klk) slkVar);
            } else {
                this.a = new slk(this);
            }
            slkVar.e(this);
            return;
        }
        this.a = new slk(this);
    }

    public static fz9 e(fz9 fz9Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, fz9Var.a - i);
        int max2 = Math.max(0, fz9Var.b - i2);
        int max3 = Math.max(0, fz9Var.c - i3);
        int max4 = Math.max(0, fz9Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return fz9Var;
        }
        return fz9.c(max, max2, max3, max4);
    }

    public static vlk h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        vlk vlkVar = new vlk(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = k9k.a;
            vlk a = e9k.a(view);
            slk slkVar = vlkVar.a;
            slkVar.y(a);
            View rootView = view.getRootView();
            slkVar.d(rootView);
            slkVar.p(rootView);
            slkVar.q();
            slkVar.z(view.getWindowSystemUiVisibility());
        }
        return vlkVar;
    }

    public final int a() {
        return this.a.n().d;
    }

    public final int b() {
        return this.a.n().a;
    }

    public final int c() {
        return this.a.n().c;
    }

    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlk)) {
            return false;
        }
        return Objects.equals(this.a, ((vlk) obj).a);
    }

    public final vlk f(int i, int i2, int i3, int i4) {
        jlk flkVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            flkVar = new ilk(this);
        } else if (i5 >= 35) {
            flkVar = new hlk(this);
        } else if (i5 >= 34) {
            flkVar = new glk(this);
        } else {
            flkVar = new flk(this);
        }
        flkVar.e(fz9.c(i, i2, i3, i4));
        return flkVar.b();
    }

    public final WindowInsets g() {
        slk slkVar = this.a;
        if (slkVar instanceof klk) {
            return ((klk) slkVar).c;
        }
        return null;
    }

    public final int hashCode() {
        slk slkVar = this.a;
        if (slkVar == null) {
            return 0;
        }
        return slkVar.hashCode();
    }

    public vlk(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new rlk(this, windowInsets);
        } else if (i >= 34) {
            this.a = new qlk(this, windowInsets);
        } else {
            this.a = new plk(this, windowInsets);
        }
    }
}
