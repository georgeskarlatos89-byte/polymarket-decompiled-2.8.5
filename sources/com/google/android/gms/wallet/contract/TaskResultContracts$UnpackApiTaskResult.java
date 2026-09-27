package com.google.android.gms.wallet.contract;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class TaskResultContracts$UnpackApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, T> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    public final Object a(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        return null;
    }
}
