package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    public MLTask() {
    }

    public abstract T run(S s);

    public MLTask(TaskQueue taskQueue) {
        super(taskQueue);
    }
}
