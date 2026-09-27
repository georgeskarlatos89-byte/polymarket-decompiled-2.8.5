package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zztu extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztu(Context context, int i) {
        super(context, i);
        context.getClass();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.no_gmm_or_browser_dialog);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        ((Button) findViewById(R.id.no_browser_error_ok)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zztt
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zztu.this.dismiss();
            }
        });
    }
}
