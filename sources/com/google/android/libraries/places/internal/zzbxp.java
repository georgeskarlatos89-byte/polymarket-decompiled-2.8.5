package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxp implements zzbxq {
    public static final zzbxq zza = new zzbxp();

    private zzbxp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbxr, com.google.android.libraries.places.internal.zzbye
    public final String zza() {
        return "identity";
    }

    @Override // com.google.android.libraries.places.internal.zzbxr
    public final OutputStream zzb(OutputStream outputStream) {
        return outputStream;
    }

    @Override // com.google.android.libraries.places.internal.zzbye
    public final InputStream zzc(InputStream inputStream) {
        return inputStream;
    }
}
