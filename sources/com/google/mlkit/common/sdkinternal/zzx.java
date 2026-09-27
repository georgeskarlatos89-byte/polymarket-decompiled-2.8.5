package com.google.mlkit.common.sdkinternal;

import defpackage.arn;
import java.io.Closeable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzx implements Closeable {
    final /* synthetic */ TaskQueue zza;

    public /* synthetic */ zzx(TaskQueue taskQueue, zzw zzwVar) {
        boolean z;
        this.zza = taskQueue;
        if (((Thread) TaskQueue.zza(taskQueue).getAndSet(Thread.currentThread())) == null) {
            z = true;
        } else {
            z = false;
        }
        arn.k(z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        TaskQueue.zza(this.zza).set(null);
        TaskQueue.zzb(this.zza);
    }
}
