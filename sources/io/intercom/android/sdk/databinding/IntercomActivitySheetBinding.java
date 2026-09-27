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
import io.intercom.android.sdk.views.IntercomToolbar;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomActivitySheetBinding implements y8k {
    public final IntercomToolbar intercomToolbar;
    private final LinearLayout rootView;
    public final LinearLayout sheetRoot;
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(LinearLayout linearLayout, IntercomToolbar intercomToolbar, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    public static IntercomActivitySheetBinding bind(View view) {
        int i = R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar = (IntercomToolbar) m4n.d(view, i);
        if (intercomToolbar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout) m4n.d(view, i2);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar, linearLayout, frameLayout);
            }
            i = i2;
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_sheet, viewGroup, false);
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

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
