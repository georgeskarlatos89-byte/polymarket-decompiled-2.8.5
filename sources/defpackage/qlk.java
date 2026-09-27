package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class qlk extends plk {
    public static final vlk s = vlk.h(null, WindowInsets.CONSUMED);

    public qlk(vlk vlkVar, WindowInsets windowInsets) {
        super(vlkVar, windowInsets);
    }

    @Override // defpackage.olk, defpackage.klk, defpackage.slk
    public fz9 i(int i) {
        return fz9.d(this.c.getInsets(ulk.a(i)));
    }

    @Override // defpackage.olk, defpackage.klk, defpackage.slk
    public fz9 j(int i) {
        return fz9.d(this.c.getInsetsIgnoringVisibility(ulk.a(i)));
    }

    @Override // defpackage.olk, defpackage.klk, defpackage.slk
    public boolean u(int i) {
        return this.c.isVisible(ulk.a(i));
    }

    public qlk(vlk vlkVar, qlk qlkVar) {
        super(vlkVar, qlkVar);
    }

    @Override // defpackage.klk, defpackage.slk
    public void p(View view) {
    }
}
