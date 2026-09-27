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

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomCardListBlockBinding implements y8k {
    public final LinearLayout cardLinks;
    private final FrameLayout rootView;

    private IntercomCardListBlockBinding(FrameLayout frameLayout, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.cardLinks = linearLayout;
    }

    public static IntercomCardListBlockBinding bind(View view) {
        int i = R.id.card_links;
        LinearLayout linearLayout = (LinearLayout) m4n.d(view, i);
        if (linearLayout != null) {
            return new IntercomCardListBlockBinding((FrameLayout) view, linearLayout);
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomCardListBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_card_list_block, viewGroup, false);
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
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomCardListBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
