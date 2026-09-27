package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b6i implements y8k {
    public final FrameLayout a;
    public final FragmentContainerView b;

    public b6i(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.a = frameLayout;
        this.b = fragmentContainerView;
    }

    @Override // defpackage.y8k
    public final View getRoot() {
        return this.a;
    }
}
