package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class nlk extends mlk {
    public fz9 o;
    public fz9 p;
    public fz9 q;

    public nlk(vlk vlkVar, WindowInsets windowInsets) {
        super(vlkVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.slk
    public fz9 k() {
        fz9 fz9Var = this.p;
        if (fz9Var == null) {
            fz9 d = fz9.d(this.c.getMandatorySystemGestureInsets());
            this.p = d;
            return d;
        }
        return fz9Var;
    }

    @Override // defpackage.slk
    public fz9 m() {
        fz9 fz9Var = this.o;
        if (fz9Var == null) {
            fz9 d = fz9.d(this.c.getSystemGestureInsets());
            this.o = d;
            return d;
        }
        return fz9Var;
    }

    @Override // defpackage.slk
    public fz9 o() {
        fz9 fz9Var = this.q;
        if (fz9Var == null) {
            fz9 d = fz9.d(this.c.getTappableElementInsets());
            this.q = d;
            return d;
        }
        return fz9Var;
    }

    @Override // defpackage.klk, defpackage.slk
    public vlk r(int i, int i2, int i3, int i4) {
        return vlk.h(null, this.c.inset(i, i2, i3, i4));
    }

    public nlk(vlk vlkVar, nlk nlkVar) {
        super(vlkVar, nlkVar);
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
