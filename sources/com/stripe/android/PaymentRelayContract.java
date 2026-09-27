package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.view.PaymentRelayActivity;
import defpackage.ebe;
import defpackage.ga;
import defpackage.m3e;
import defpackage.s6i;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/PaymentRelayContract;", "Lga;", "Lebe;", "Lm3e;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentRelayContract extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        ebe ebeVar = (ebe) obj;
        ebeVar.getClass();
        Intent putExtras = new Intent(context, (Class<?>) PaymentRelayActivity.class).putExtras(ebeVar.g().e());
        putExtras.getClass();
        return putExtras;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        m3e m3eVar;
        if (intent != null && (m3eVar = (m3e) intent.getParcelableExtra("extra_args")) != null) {
            return m3eVar;
        }
        return new m3e((String) null, 0, (s6i) null, false, (String) null, (String) null, 127);
    }
}
