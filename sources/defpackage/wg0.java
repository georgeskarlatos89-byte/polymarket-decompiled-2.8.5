package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wg0 extends qjb implements yg0 {
    public CharSequence A;
    public tg0 B;
    public final Rect C;
    public int D;
    public final /* synthetic */ zg0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(zg0 zg0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.E = zg0Var;
        this.C = new Rect();
        this.o = zg0Var;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new ug0(this, 0);
    }

    @Override // defpackage.yg0
    public final CharSequence e() {
        return this.A;
    }

    @Override // defpackage.yg0
    public final void g(CharSequence charSequence) {
        this.A = charSequence;
    }

    @Override // defpackage.yg0
    public final void j(int i) {
        this.D = i;
    }

    @Override // defpackage.yg0
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        kg0 kg0Var = this.z;
        boolean isShowing = kg0Var.isShowing();
        s();
        kg0Var.setInputMethodMode(2);
        n();
        m27 m27Var = this.c;
        m27Var.setChoiceMode(1);
        m27Var.setTextDirection(i);
        m27Var.setTextAlignment(i2);
        zg0 zg0Var = this.E;
        int selectedItemPosition = zg0Var.getSelectedItemPosition();
        m27 m27Var2 = this.c;
        if (kg0Var.isShowing() && m27Var2 != null) {
            m27Var2.setListSelectionHidden(false);
            m27Var2.setSelection(selectedItemPosition);
            if (m27Var2.getChoiceMode() != 0) {
                m27Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = zg0Var.getViewTreeObserver()) != null) {
            qg0 qg0Var = new qg0(this, 1);
            viewTreeObserver.addOnGlobalLayoutListener(qg0Var);
            kg0Var.setOnDismissListener(new vg0(this, qg0Var));
        }
    }

    @Override // defpackage.qjb, defpackage.yg0
    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.B = (tg0) listAdapter;
    }

    public final void s() {
        int i;
        int i2;
        kg0 kg0Var = this.z;
        Drawable background = kg0Var.getBackground();
        zg0 zg0Var = this.E;
        Rect rect = zg0Var.h;
        if (background != null) {
            background.getPadding(rect);
            if (zg0Var.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = zg0Var.getPaddingLeft();
        int paddingRight = zg0Var.getPaddingRight();
        int width = zg0Var.getWidth();
        int i3 = zg0Var.g;
        if (i3 == -2) {
            int a = zg0Var.a(this.B, kg0Var.getBackground());
            int i4 = (zg0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        if (zg0Var.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.e) - this.D) + i;
        } else {
            i2 = paddingLeft + this.D + i;
        }
        this.f = i2;
    }
}
