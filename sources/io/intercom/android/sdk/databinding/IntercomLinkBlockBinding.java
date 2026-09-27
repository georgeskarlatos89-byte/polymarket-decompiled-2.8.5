package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomLinkBlockBinding implements y8k {
    public final TextView author;
    public final ImageView avatar;
    public final TextView description;
    private final LinearLayout rootView;
    public final TextView title;

    private IntercomLinkBlockBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.author = textView;
        this.avatar = imageView;
        this.description = textView2;
        this.title = textView3;
    }

    public static IntercomLinkBlockBinding bind(View view) {
        int i = R.id.author;
        TextView textView = (TextView) m4n.d(view, i);
        if (textView != null) {
            i = R.id.avatar;
            ImageView imageView = (ImageView) m4n.d(view, i);
            if (imageView != null) {
                i = R.id.description;
                TextView textView2 = (TextView) m4n.d(view, i);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) m4n.d(view, i);
                    if (textView3 != null) {
                        return new IntercomLinkBlockBinding((LinearLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomLinkBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_link_block, viewGroup, false);
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

    public static IntercomLinkBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
