package com.google.android.libraries.places.internal;

import defpackage.pt6;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbex implements Executor {
    private volatile Executor zza;

    public zzbex(Executor executor) {
        this.zza = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zza = pt6.INSTANCE;
    }
}
