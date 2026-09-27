package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomContainerLayoutBinding implements y8k {
    public final LinearLayout cellLayout;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;

    private IntercomContainerLayoutBinding(FrameLayout frameLayout, LinearLayout linearLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.cellLayout = linearLayout;
        this.progressBar = progressBar;
    }

    public static IntercomContainerLayoutBinding bind(View view) {
        int i = R.id.cellLayout;
        LinearLayout linearLayout = (LinearLayout) m4n.d(view, i);
        if (linearLayout != null) {
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) m4n.d(view, i);
            if (progressBar != null) {
                return new IntercomContainerLayoutBinding((FrameLayout) view, linearLayout, progressBar);
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomContainerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_container_layout, viewGroup, false);
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

    public static IntercomContainerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
