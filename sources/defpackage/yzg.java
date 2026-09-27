package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yzg extends ml8 {
    public final Object d;
    public final bo9 e;
    public final int f;
    public final int g;

    public yzg(to9 to9Var, Size size, bo9 bo9Var) {
        super(to9Var);
        this.d = new Object();
        if (size == null) {
            this.f = this.b.getWidth();
            this.g = this.b.getHeight();
        } else {
            this.f = size.getWidth();
            this.g = size.getHeight();
        }
        this.e = bo9Var;
    }

    @Override // defpackage.ml8, defpackage.to9
    public final bo9 P0() {
        return this.e;
    }

    public final void g(Rect rect) {
        Rect rect2 = new Rect(rect);
        if (!rect2.intersect(0, 0, this.f, this.g)) {
            rect2.setEmpty();
        }
        synchronized (this.d) {
        }
    }

    @Override // defpackage.ml8, defpackage.to9
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.ml8, defpackage.to9
    public final int getWidth() {
        return this.f;
    }
}
