package defpackage;

import android.view.View;
import io.radar.sdk.RadarInAppMessageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class umf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RadarInAppMessageView b;

    public /* synthetic */ umf(RadarInAppMessageView radarInAppMessageView, int i) {
        this.a = i;
        this.b = radarInAppMessageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        RadarInAppMessageView radarInAppMessageView = this.b;
        switch (i) {
            case 0:
                RadarInAppMessageView.d(radarInAppMessageView, view);
                return;
            case 1:
                RadarInAppMessageView.c(radarInAppMessageView, view);
                return;
            default:
                RadarInAppMessageView.b(radarInAppMessageView, view);
                return;
        }
    }
}
