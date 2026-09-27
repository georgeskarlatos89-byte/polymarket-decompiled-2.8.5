package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomErrorView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomErrorSheetBinding implements y8k {
    public final Button actionButton;
    public final TextView emptyTextSubtitle;
    public final TextView emptyTextTitle;
    public final IntercomErrorView errorLayoutSheet;
    private final IntercomErrorView rootView;

    private IntercomErrorSheetBinding(IntercomErrorView intercomErrorView, Button button, TextView textView, TextView textView2, IntercomErrorView intercomErrorView2) {
        this.rootView = intercomErrorView;
        this.actionButton = button;
        this.emptyTextSubtitle = textView;
        this.emptyTextTitle = textView2;
        this.errorLayoutSheet = intercomErrorView2;
    }

    public static IntercomErrorSheetBinding bind(View view) {
        int i = R.id.action_button;
        Button button = (Button) m4n.d(view, i);
        if (button != null) {
            i = R.id.empty_text_subtitle;
            TextView textView = (TextView) m4n.d(view, i);
            if (textView != null) {
                i = R.id.empty_text_title;
                TextView textView2 = (TextView) m4n.d(view, i);
                if (textView2 != null) {
                    IntercomErrorView intercomErrorView = (IntercomErrorView) view;
                    return new IntercomErrorSheetBinding(intercomErrorView, button, textView, textView2, intercomErrorView);
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomErrorSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_error_sheet, viewGroup, false);
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
    public IntercomErrorView getRoot() {
        return this.rootView;
    }

    public static IntercomErrorSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
