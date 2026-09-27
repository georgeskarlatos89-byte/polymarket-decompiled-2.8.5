package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c9k implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ qhd b;

    public c9k(View view, qhd qhdVar) {
        this.a = view;
        this.b = qhdVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.b.onApplyWindowInsets(view, vlk.h(view, windowInsets)).g();
    }
}
