package com.socure.docv.capturesdk.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.y8k;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b implements y8k {
    public final ConstraintLayout a;
    public final ProgressBar b;
    public final WebView c;

    public b(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = webView;
    }

    @Override // defpackage.y8k
    public final View getRoot() {
        return this.a;
    }
}
