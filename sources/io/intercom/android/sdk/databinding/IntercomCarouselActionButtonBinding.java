package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.dmk;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomCarouselActionButtonBinding implements y8k {
    private final TextView rootView;

    private IntercomCarouselActionButtonBinding(TextView textView) {
        this.rootView = textView;
    }

    public static IntercomCarouselActionButtonBinding bind(View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonBinding((TextView) view);
        }
        dmk.s("rootView");
        return null;
    }

    public static IntercomCarouselActionButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button, viewGroup, false);
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
    public TextView getRoot() {
        return this.rootView;
    }

    public static IntercomCarouselActionButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
