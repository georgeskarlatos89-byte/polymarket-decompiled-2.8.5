package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyq {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private final Map zzc = Collections.EMPTY_MAP;
    private String zzd;
    private String zze;

    private zzbyq() {
    }

    public final zzbyq zza(SocketAddress socketAddress) {
        brn.m(socketAddress, "proxyAddress");
        this.zza = socketAddress;
        return this;
    }

    public final zzbyq zzb(InetSocketAddress inetSocketAddress) {
        brn.m(inetSocketAddress, "targetAddress");
        this.zzb = inetSocketAddress;
        return this;
    }

    public final zzbyq zzc(String str) {
        this.zzd = str;
        return this;
    }

    public final zzbyq zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzbyr zze() {
        return new zzbyr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public /* synthetic */ zzbyq(byte[] bArr) {
    }
}
