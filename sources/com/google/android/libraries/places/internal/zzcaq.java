package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcaq extends zzcao {
    private final zzcar zzb;

    public /* synthetic */ zzcaq(String str, boolean z, zzcar zzcarVar, byte[] bArr) {
        super(str, z, zzcarVar, null);
        brn.j(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        brn.m(zzcarVar, "marshaller");
        this.zzb = zzcarVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcao
    public final byte[] zza(Object obj) {
        byte[] zza = this.zzb.zza(obj);
        brn.m(zza, "null marshaller.toAsciiString()");
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzcao
    public final Object zzb(byte[] bArr) {
        return this.zzb.zzb(bArr);
    }
}
