package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.Collections;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzclh {
    private final zzbww zza;
    private final SocketAddress zzb;

    public zzclh(zzbww zzbwwVar, SocketAddress socketAddress) {
        this.zza = zzbwwVar;
        this.zzb = socketAddress;
    }

    public final /* synthetic */ zzbyi zza() {
        return new zzbyi(Collections.singletonList(this.zzb), this.zza);
    }

    public final /* synthetic */ zzbww zzb() {
        return this.zza;
    }

    public final /* synthetic */ SocketAddress zzc() {
        return this.zzb;
    }
}
