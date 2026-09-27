package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ekg implements fkg {
    public final ScrollFeedbackProvider a;

    public ekg(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.fkg
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.fkg
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
