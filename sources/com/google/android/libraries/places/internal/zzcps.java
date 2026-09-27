package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.dmk;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcps implements zzced {
    final Executor zza;
    final ScheduledExecutorService zzb;
    final zzcow zzc;
    final SSLSocketFactory zzd;
    final zzcqx zze;
    private final zzclc zzf;
    private final zzclc zzg;
    private final zzcde zzh = new zzcde("keepalive time nanos", Long.MAX_VALUE);
    private boolean zzi;

    public /* synthetic */ zzcps(zzclc zzclcVar, zzclc zzclcVar2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, zzcqx zzcqxVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, zzcow zzcowVar, boolean z3, zzbxc zzbxcVar, byte[] bArr) {
        this.zzf = zzclcVar;
        this.zza = (Executor) zzclcVar.zza();
        this.zzg = zzclcVar2;
        this.zzb = (ScheduledExecutorService) zzclcVar2.zza();
        this.zzd = sSLSocketFactory;
        this.zze = zzcqxVar;
        brn.m(zzcowVar, "transportTracerFactory");
        this.zzc = zzcowVar;
    }

    @Override // com.google.android.libraries.places.internal.zzced, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzi) {
            return;
        }
        this.zzi = true;
        this.zzf.zzb(this.zza);
        this.zzg.zzb(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzced
    public final zzcem zza(SocketAddress socketAddress, zzcec zzcecVar, zzbxd zzbxdVar) {
        if (!this.zzi) {
            return new zzcqf(this, (InetSocketAddress) socketAddress, zzcecVar.zza(), zzcecVar.zze(), zzcecVar.zzc(), zzcecVar.zzg(), new zzcpr(this, this.zzh.zza()), null);
        }
        dmk.n("The transport factory is closed.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzced
    public final ScheduledExecutorService zzb() {
        return this.zzb;
    }
}
