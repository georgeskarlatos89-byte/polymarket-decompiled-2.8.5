package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.ContentAwareScrollView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomFragmentCarouselScreenBinding implements y8k {
    public final LinearLayout intercomCarouselActionLayout;
    public final FrameLayout intercomCarouselContentContainer;
    public final LinearLayout intercomCarouselFragmentRoot;
    public final View intercomCarouselGradient;
    public final ContentAwareScrollView intercomCarouselScrollView;
    private final LinearLayout rootView;

    private IntercomFragmentCarouselScreenBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, LinearLayout linearLayout3, View view, ContentAwareScrollView contentAwareScrollView) {
        this.rootView = linearLayout;
        this.intercomCarouselActionLayout = linearLayout2;
        this.intercomCarouselContentContainer = frameLayout;
        this.intercomCarouselFragmentRoot = linearLayout3;
        this.intercomCarouselGradient = view;
        this.intercomCarouselScrollView = contentAwareScrollView;
    }

    public static IntercomFragmentCarouselScreenBinding bind(View view) {
        int i = R.id.intercom_carousel_action_layout;
        LinearLayout linearLayout = (LinearLayout) m4n.d(view, i);
        if (linearLayout != null) {
            i = R.id.intercom_carousel_content_container;
            FrameLayout frameLayout = (FrameLayout) m4n.d(view, i);
            if (frameLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i = R.id.intercom_carousel_gradient;
                View d = m4n.d(view, i);
                if (d != null) {
                    i = R.id.intercom_carousel_scroll_view;
                    ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) m4n.d(view, i);
                    if (contentAwareScrollView != null) {
                        return new IntercomFragmentCarouselScreenBinding(linearLayout2, linearLayout, frameLayout, linearLayout2, d, contentAwareScrollView);
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomFragmentCarouselScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, viewGroup, false);
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
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomFragmentCarouselScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
