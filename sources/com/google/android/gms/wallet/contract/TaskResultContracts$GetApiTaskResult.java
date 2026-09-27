package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import defpackage.be0;
import defpackage.o2e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class TaskResultContracts$GetApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, be0> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    public final Object a(Task task) {
        if (task.isSuccessful()) {
            return new be0(task.getResult(), Status.e);
        }
        if (task.m()) {
            return new be0(null, new Status(16, "The task has been canceled.", null, null));
        }
        Status status = this.a;
        if (status != null) {
            return new be0(null, status);
        }
        return new be0(null, Status.g);
    }

    public be0 b(int i, Intent intent) {
        o2e o2eVar;
        if (i != -1) {
            if (i != 0) {
                return new be0(null, Status.g);
            }
            return new be0(null, Status.i);
        }
        if (intent != null) {
            o2eVar = c(intent);
        } else {
            o2eVar = null;
        }
        if (o2eVar != null) {
            return new be0(o2eVar, Status.e);
        }
        return new be0(null, Status.g);
    }

    public abstract o2e c(Intent intent);

    @Override // defpackage.ga
    public /* bridge */ /* synthetic */ Object parseResult(int i, Intent intent) {
        return b(i, intent);
    }
}
