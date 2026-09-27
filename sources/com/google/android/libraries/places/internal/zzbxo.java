package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxo implements zzbxq {
    @Override // com.google.android.libraries.places.internal.zzbxr, com.google.android.libraries.places.internal.zzbye
    public final String zza() {
        return "gzip";
    }

    @Override // com.google.android.libraries.places.internal.zzbxr
    public final OutputStream zzb(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzbye
    public final InputStream zzc(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
