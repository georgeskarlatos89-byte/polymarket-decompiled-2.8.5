package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcdl implements zzced {
    private final zzced zza;

    public zzcdl(zzced zzcedVar, zzbwx zzbwxVar, Executor executor) {
        brn.m(zzcedVar, "delegate");
        this.zza = zzcedVar;
        brn.m(executor, "appExecutor");
    }

    @Override // com.google.android.libraries.places.internal.zzced, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzced
    public final zzcem zza(SocketAddress socketAddress, zzcec zzcecVar, zzbxd zzbxdVar) {
        return new zzcdk(this, this.zza.zza(socketAddress, zzcecVar, zzbxdVar), zzcecVar.zza());
    }

    @Override // com.google.android.libraries.places.internal.zzced
    public final ScheduledExecutorService zzb() {
        return this.zza.zzb();
    }
}
