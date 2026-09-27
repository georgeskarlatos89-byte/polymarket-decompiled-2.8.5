package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xak implements usf {
    @Override // defpackage.usf
    public final void b(View view) {
        tsf tsfVar = (tsf) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) tsfVar).width == -1 && ((ViewGroup.MarginLayoutParams) tsfVar).height == -1) {
            return;
        }
        dmk.n("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // defpackage.usf
    public final void a(View view) {
    }
}
