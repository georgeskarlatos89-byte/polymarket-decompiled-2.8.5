package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcrd extends zzcrh {
    private final zzcrc zzb;
    private final zzcrc zzc;
    private final zzcrc zzd;
    private final zzcrc zze;
    private final int zzf;

    public zzcrd(zzcrc zzcrcVar, zzcrc zzcrcVar2, Method method, Method method2, zzcrc zzcrcVar3, zzcrc zzcrcVar4, Provider provider, int i) {
        super(provider);
        this.zzb = zzcrcVar;
        this.zzc = zzcrcVar2;
        this.zzd = zzcrcVar3;
        this.zze = zzcrcVar4;
        this.zzf = i;
    }

    @Override // com.google.android.libraries.places.internal.zzcrh
    public final void zza(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.zzb.zzb(sSLSocket, Boolean.TRUE);
            this.zzc.zzb(sSLSocket, str);
        }
        zzcrc zzcrcVar = this.zze;
        if (zzcrcVar.zza(sSLSocket)) {
            zzcrcVar.zzc(sSLSocket, zzcrh.zzg(list));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcrh
    public final String zzb(SSLSocket sSLSocket) {
        byte[] bArr;
        zzcrc zzcrcVar = this.zzd;
        if (zzcrcVar.zza(sSLSocket) && (bArr = (byte[]) zzcrcVar.zzc(sSLSocket, new Object[0])) != null) {
            return new String(bArr, zzcrk.zzb);
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzcrh
    public final int zzc() {
        return this.zzf;
    }
}
