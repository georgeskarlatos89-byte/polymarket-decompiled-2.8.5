package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import defpackage.dmk;
import defpackage.y8k;
import io.intercom.android.sdk.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class IntercomProgressBarBinding implements y8k {
    public final ProgressBar progressBar;
    private final ProgressBar rootView;

    private IntercomProgressBarBinding(ProgressBar progressBar, ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.progressBar = progressBar2;
    }

    public static IntercomProgressBarBinding bind(View view) {
        if (view != null) {
            ProgressBar progressBar = (ProgressBar) view;
            return new IntercomProgressBarBinding(progressBar, progressBar);
        }
        dmk.s("rootView");
        return null;
    }

    public static IntercomProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_progress_bar, viewGroup, false);
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
    public ProgressBar getRoot() {
        return this.rootView;
    }

    public static IntercomProgressBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
