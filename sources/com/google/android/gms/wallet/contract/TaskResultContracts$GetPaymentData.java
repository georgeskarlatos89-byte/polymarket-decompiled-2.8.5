package com.google.android.gms.wallet.contract;

import android.content.Intent;
import defpackage.jxn;
import defpackage.o2e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<o2e> {
    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        if (intent != null) {
            return (o2e) jxn.c(intent, "com.google.android.gms.wallet.PaymentData", o2e.CREATOR);
        }
        return null;
    }
}
