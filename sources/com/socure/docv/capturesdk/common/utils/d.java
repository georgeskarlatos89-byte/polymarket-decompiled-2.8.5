package com.socure.docv.capturesdk.common.utils;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ d(Function0 function0, int i) {
        this.a = i;
        this.b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                HelpPreviewUtils.a(function0, view);
                return;
            default:
                HelpPreviewUtils.b(function0, view);
                return;
        }
    }
}
