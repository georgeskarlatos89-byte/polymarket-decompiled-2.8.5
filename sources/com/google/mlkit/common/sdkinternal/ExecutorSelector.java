package com.google.mlkit.common.sdkinternal;

import defpackage.lgf;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ExecutorSelector {
    private final lgf zza;

    public ExecutorSelector(lgf lgfVar) {
        this.zza = lgfVar;
    }

    public Executor getExecutorToUse(Executor executor) {
        if (executor != null) {
            return executor;
        }
        return (Executor) this.zza.get();
    }
}
