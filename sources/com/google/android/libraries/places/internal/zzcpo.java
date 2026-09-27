package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcpo implements zzcok {
    @Override // com.google.android.libraries.places.internal.zzcok
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzcok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Executors.newCachedThreadPool(zzchn.zzd("grpc-okhttp-%d", true));
    }
}
