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
public final class IntercomNotificationPillBinding implements y8k {
    public final TextView notificationPill;
    private final TextView rootView;

    private IntercomNotificationPillBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    public static IntercomNotificationPillBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new IntercomNotificationPillBinding(textView, textView);
        }
        dmk.s("rootView");
        return null;
    }

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, false);
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

    public static IntercomNotificationPillBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
