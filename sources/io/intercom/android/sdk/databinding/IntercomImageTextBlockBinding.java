package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomImageTextBlockBinding implements y8k {
    public final FrameLayout imageHolder;
    private final LinearLayout rootView;
    public final TextView text;
    public final TextView title;

    private IntercomImageTextBlockBinding(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imageHolder = frameLayout;
        this.text = textView;
        this.title = textView2;
    }

    public static IntercomImageTextBlockBinding bind(View view) {
        int i = R.id.image_holder;
        FrameLayout frameLayout = (FrameLayout) m4n.d(view, i);
        if (frameLayout != null) {
            i = R.id.text;
            TextView textView = (TextView) m4n.d(view, i);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) m4n.d(view, i);
                if (textView2 != null) {
                    return new IntercomImageTextBlockBinding((LinearLayout) view, frameLayout, textView, textView2);
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomImageTextBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_image_text_block, viewGroup, false);
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

    public static IntercomImageTextBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
