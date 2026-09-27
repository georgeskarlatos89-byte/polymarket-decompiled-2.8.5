package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomToolbarBinding implements y8k {
    public final FrameLayout intercomLeftItemLayout;
    public final ImageView intercomToolbarAvatar;
    public final View intercomToolbarAvatarActiveState;
    public final ImageButton intercomToolbarClose;
    public final View intercomToolbarDivider;
    public final ImageButton intercomToolbarInbox;
    public final TextView intercomToolbarSubtitle;
    public final TextView intercomToolbarTitle;
    public final LinearLayout intercomToolbarTitleContainer;
    private final FrameLayout rootView;
    public final RelativeLayout toolbarContentContainer;
    public final ProgressBar toolbarProgressBar;
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, View view, ImageButton imageButton, View view2, ImageButton imageButton2, TextView textView, TextView textView2, LinearLayout linearLayout, RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    public static IntercomToolbarBinding bind(View view) {
        View d;
        View d2;
        int i = R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout) m4n.d(view, i);
        if (frameLayout != null) {
            i = R.id.intercom_toolbar_avatar;
            ImageView imageView = (ImageView) m4n.d(view, i);
            if (imageView != null && (d = m4n.d(view, (i = R.id.intercom_toolbar_avatar_active_state))) != null) {
                i = R.id.intercom_toolbar_close;
                ImageButton imageButton = (ImageButton) m4n.d(view, i);
                if (imageButton != null && (d2 = m4n.d(view, (i = R.id.intercom_toolbar_divider))) != null) {
                    i = R.id.intercom_toolbar_inbox;
                    ImageButton imageButton2 = (ImageButton) m4n.d(view, i);
                    if (imageButton2 != null) {
                        i = R.id.intercom_toolbar_subtitle;
                        TextView textView = (TextView) m4n.d(view, i);
                        if (textView != null) {
                            i = R.id.intercom_toolbar_title;
                            TextView textView2 = (TextView) m4n.d(view, i);
                            if (textView2 != null) {
                                i = R.id.intercom_toolbar_title_container;
                                LinearLayout linearLayout = (LinearLayout) m4n.d(view, i);
                                if (linearLayout != null) {
                                    i = R.id.toolbar_content_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) m4n.d(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.toolbar_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) m4n.d(view, i);
                                        if (progressBar != null) {
                                            i = R.id.wallpaper_image;
                                            ImageView imageView2 = (ImageView) m4n.d(view, i);
                                            if (imageView2 != null) {
                                                return new IntercomToolbarBinding((FrameLayout) view, frameLayout, imageView, d, imageButton, d2, imageButton2, textView, textView2, linearLayout, relativeLayout, progressBar, imageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_toolbar, viewGroup, false);
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

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
