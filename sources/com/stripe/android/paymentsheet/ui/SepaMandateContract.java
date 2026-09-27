package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.Intent;
import defpackage.awg;
import defpackage.ga;
import defpackage.xvg;
import defpackage.zvg;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SepaMandateContract;", "Lga;", "Lxvg;", "Lawg;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SepaMandateContract extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        xvg xvgVar = (xvg) obj;
        xvgVar.getClass();
        Intent putExtra = new Intent(context, (Class<?>) SepaMandateActivity.class).putExtra("extra_activity_args", xvgVar);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        awg awgVar;
        if (intent != null && (awgVar = (awg) intent.getParcelableExtra("extra_activity_result")) != null) {
            return awgVar;
        }
        return zvg.a;
    }
}
