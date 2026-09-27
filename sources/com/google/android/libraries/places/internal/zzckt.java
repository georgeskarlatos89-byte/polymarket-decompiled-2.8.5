package com.google.android.libraries.places.internal;

import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckt implements zzcoq {
    private InputStream zza;

    public /* synthetic */ zzckt(InputStream inputStream, byte[] bArr) {
        this.zza = inputStream;
    }

    @Override // com.google.android.libraries.places.internal.zzcoq
    public final InputStream zza() {
        InputStream inputStream = this.zza;
        this.zza = null;
        return inputStream;
    }
}
