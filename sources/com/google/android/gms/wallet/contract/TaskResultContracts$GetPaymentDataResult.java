package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import defpackage.be0;
import defpackage.jxn;
import defpackage.o2e;
import defpackage.zv0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<o2e> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    public final be0 b(int i, Intent intent) {
        Status status;
        if (i != 1) {
            return super.b(i, intent);
        }
        int i2 = zv0.a;
        if (intent == null) {
            status = null;
        } else {
            status = (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        }
        if (status == null) {
            status = Status.g;
        }
        return new be0(null, status);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    public final o2e c(Intent intent) {
        return (o2e) jxn.c(intent, "com.google.android.gms.wallet.PaymentData", o2e.CREATOR);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, defpackage.ga
    public final /* bridge */ /* synthetic */ Object parseResult(int i, Intent intent) {
        return b(i, intent);
    }
}
