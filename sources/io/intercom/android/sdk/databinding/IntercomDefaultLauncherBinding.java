package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomDefaultLauncherBinding implements y8k {
    public final TextView launcherBadgeCount;
    public final ImageButton launcherIcon;
    public final FrameLayout launcherRoot;
    private final FrameLayout rootView;

    private IntercomDefaultLauncherBinding(FrameLayout frameLayout, TextView textView, ImageButton imageButton, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.launcherBadgeCount = textView;
        this.launcherIcon = imageButton;
        this.launcherRoot = frameLayout2;
    }

    public static IntercomDefaultLauncherBinding bind(View view) {
        int i = R.id.launcher_badge_count;
        TextView textView = (TextView) m4n.d(view, i);
        if (textView != null) {
            i = R.id.launcher_icon;
            ImageButton imageButton = (ImageButton) m4n.d(view, i);
            if (imageButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new IntercomDefaultLauncherBinding(frameLayout, textView, imageButton, frameLayout);
            }
        }
        dmk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomDefaultLauncherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_default_launcher, viewGroup, false);
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

    public static IntercomDefaultLauncherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
