package com.socure.docv.capturesdk.feature.help.presentation.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends g {
    public final TextView a;
    public final TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        view.getClass();
        View findViewById = view.findViewById(R.id.tv_instruction);
        findViewById.getClass();
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_pointer);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
    }
}
