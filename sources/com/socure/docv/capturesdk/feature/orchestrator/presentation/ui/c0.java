package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.view.View;
import android.widget.TextView;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c0 extends androidx.recyclerview.widget.g {
    public final TextView a;
    public final View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(View view) {
        super(view);
        view.getClass();
        View findViewById = view.findViewById(R.id.tvDocType);
        findViewById.getClass();
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.divider);
        findViewById2.getClass();
        this.b = findViewById2;
    }
}
