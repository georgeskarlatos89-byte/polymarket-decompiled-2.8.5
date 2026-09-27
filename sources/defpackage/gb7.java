package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gb7 {
    public int a;
    public final Object b;
    public final Object c;

    public gb7(e eVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = eVar;
    }

    public static gb7 a(e eVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return new ymd(eVar, 1);
            }
            dmk.v("invalid orientation");
            return null;
        }
        return new ymd(eVar, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public gb7(ib7 ib7Var) {
        this.a = 0;
        this.c = new d46();
        this.b = ib7Var;
    }
}
