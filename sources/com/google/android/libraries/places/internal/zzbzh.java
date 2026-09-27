package com.google.android.libraries.places.internal;

import defpackage.t81;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzh {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final t81 zzb = zzcas.zzb;

    public static zzcao zza(String str, zzbzg zzbzgVar) {
        boolean z = false;
        char charAt = str.charAt(0);
        int i = zzcao.zza;
        if (charAt == ':') {
            z = true;
        }
        return new zzcaq(str, z, zzbzgVar, null);
    }

    public static zzcas zzb(byte[]... bArr) {
        return new zzcas(bArr.length >> 1, bArr);
    }

    public static byte[][] zzc(zzcas zzcasVar) {
        return zzcasVar.zze();
    }

    public static int zzd(zzcas zzcasVar) {
        return zzcasVar.zza();
    }
}
