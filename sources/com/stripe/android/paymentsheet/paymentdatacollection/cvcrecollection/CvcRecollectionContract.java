package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.cm5;
import defpackage.din;
import defpackage.fm5;
import defpackage.ga;
import defpackage.hm5;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract;", "Lga;", "Lcm5;", "Lhm5;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CvcRecollectionContract extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        cm5 cm5Var = (cm5) obj;
        cm5Var.getClass();
        Intent putExtra = new Intent(context, (Class<?>) CvcRecollectionActivity.class).putExtra("extra_activity_args", cm5Var);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        hm5 hm5Var;
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            hm5Var = (hm5) din.b(extras, "extra_activity_result", hm5.class);
        } else {
            hm5Var = null;
        }
        if (hm5Var == null) {
            return fm5.a;
        }
        return hm5Var;
    }
}
