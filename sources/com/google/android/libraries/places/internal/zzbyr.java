package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.nhn;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyr extends zzcbu {
    private final SocketAddress zza;
    private final InetSocketAddress zzb;
    private final Map zzc;
    private final String zzd;
    private final String zze;

    public /* synthetic */ zzbyr(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2, byte[] bArr) {
        brn.m(socketAddress, "proxyAddress");
        brn.m(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            brn.q(socketAddress, "The proxy address %s is not resolved", !((InetSocketAddress) socketAddress).isUnresolved());
        }
        this.zza = socketAddress;
        this.zzb = inetSocketAddress;
        this.zzc = map;
        this.zzd = str;
        this.zze = str2;
    }

    public static zzbyq zze() {
        return new zzbyq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbyr)) {
            return false;
        }
        zzbyr zzbyrVar = (zzbyr) obj;
        if (!ckn.a(this.zza, zzbyrVar.zza) || !ckn.a(this.zzb, zzbyrVar.zzb) || !ckn.a(this.zzc, zzbyrVar.zzc) || !ckn.a(this.zzd, zzbyrVar.zzd) || !ckn.a(this.zze, zzbyrVar.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzd, this.zze, this.zzc});
    }

    public final String toString() {
        boolean z;
        af9 b = nhn.b(this);
        b.f(this.zza, "proxyAddr");
        b.f(this.zzb, "targetAddr");
        b.f(this.zzc, "headers");
        b.f(this.zzd, "username");
        if (this.zze != null) {
            z = true;
        } else {
            z = false;
        }
        b.c("hasPassword", z);
        return b.toString();
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final SocketAddress zzc() {
        return this.zza;
    }

    public final InetSocketAddress zzd() {
        return this.zzb;
    }
}
