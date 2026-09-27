package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface zzced extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    zzcem zza(SocketAddress socketAddress, zzcec zzcecVar, zzbxd zzbxdVar);

    ScheduledExecutorService zzb();
}
