package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class olk extends nlk {
    public static final vlk r = vlk.h(null, WindowInsets.CONSUMED);

    public olk(vlk vlkVar, WindowInsets windowInsets) {
        super(vlkVar, windowInsets);
    }

    @Override // defpackage.klk, defpackage.slk
    public fz9 i(int i) {
        return fz9.d(this.c.getInsets(tlk.a(i)));
    }

    @Override // defpackage.klk, defpackage.slk
    public fz9 j(int i) {
        return fz9.d(this.c.getInsetsIgnoringVisibility(tlk.a(i)));
    }

    @Override // defpackage.klk, defpackage.slk
    public boolean u(int i) {
        return this.c.isVisible(tlk.a(i));
    }

    public olk(vlk vlkVar, olk olkVar) {
        super(vlkVar, olkVar);
    }

    @Override // defpackage.klk, defpackage.slk
    public final void d(View view) {
    }
}
