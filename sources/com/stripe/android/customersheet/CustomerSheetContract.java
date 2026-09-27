package com.stripe.android.customersheet;

import android.content.Context;
import android.content.Intent;
import defpackage.ga;
import defpackage.ti5;
import defpackage.x5a;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0002¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetContract;", "Lga;", "Lti5;", "Lx5a;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetContract extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        ti5 ti5Var = (ti5) obj;
        ti5Var.getClass();
        Intent putExtra = new Intent(context, (Class<?>) CustomerSheetActivity.class).putExtra("args", ti5Var);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        if (intent != null) {
            return (x5a) intent.getParcelableExtra("extra_activity_result");
        }
        return null;
    }
}
