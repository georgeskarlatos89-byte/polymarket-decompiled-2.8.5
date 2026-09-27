package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class tac {
    public final Context a;
    public final cac b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public abc i;
    public rac j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final sac l = new sac(this);

    public tac(int i, int i2, cac cacVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = cacVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final rac a() {
        rac evhVar;
        rac racVar = this.j;
        if (racVar == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                evhVar = new y93(context2, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                evhVar = new evh(this.d, this.e, this.b, context2, view, this.c);
            }
            evhVar.j(this.b);
            evhVar.r(this.l);
            evhVar.l(this.f);
            evhVar.d(this.i);
            evhVar.m(this.h);
            evhVar.p(this.g);
            this.j = evhVar;
            return evhVar;
        }
        return racVar;
    }

    public final boolean b() {
        rac racVar = this.j;
        if (racVar != null && racVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        rac a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.n();
    }
}
