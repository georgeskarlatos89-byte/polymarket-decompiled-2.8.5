package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomActivityLightboxBinding implements y8k {
    public final LightBoxImageView fullImage;
    public final RelativeLayout rootView;
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(RelativeLayout relativeLayout, LightBoxImageView lightBoxImageView, RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    public static IntercomActivityLightboxBinding bind(View view) {
        int i = R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView) m4n.d(view, i);
        if (lightBoxImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new IntercomActivityLightboxBinding(relativeLayout, lightBoxImageView, relativeLayout);
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_lightbox, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.y8k
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @Override // defpackage.y8k
    public RelativeLayout getRoot() {
        return this.rootView_;
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
