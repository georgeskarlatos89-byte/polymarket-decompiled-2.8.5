package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import defpackage.gf0;
import defpackage.m3e;
import defpackage.s6i;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/view/PaymentRelayActivity;", "Lgf0;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentRelayActivity extends gf0 {
    @Override // androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m3e m3eVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (m3eVar = (m3e) intent.getParcelableExtra("extra_args")) == null) {
            m3eVar = new m3e((String) null, 0, (s6i) null, false, (String) null, (String) null, 127);
        }
        setResult(-1, new Intent().putExtras(m3eVar.e()));
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
