package com.google.android.libraries.places.internal;

import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzchp implements zzbzg {
    @Override // com.google.android.libraries.places.internal.zzcar
    public final /* synthetic */ byte[] zza(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzcar
    public final /* bridge */ /* synthetic */ Object zzb(byte[] bArr) {
        if (bArr.length >= 3) {
            int i = bArr[0] + MessagePack.Code.INT8;
            return Integer.valueOf(((bArr[1] + MessagePack.Code.INT8) * 10) + (i * 100) + bArr[2] + MessagePack.Code.INT8);
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(bArr, zzbzh.zza)));
    }
}
