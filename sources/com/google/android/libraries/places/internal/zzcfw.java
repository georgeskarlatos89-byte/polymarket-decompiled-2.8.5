package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfw implements Runnable {
    final /* synthetic */ InputStream zza;
    final /* synthetic */ zzcgf zzb;

    public zzcfw(zzcgf zzcgfVar, InputStream inputStream) {
        this.zza = inputStream;
        Objects.requireNonNull(zzcgfVar);
        this.zzb = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzt(this.zza);
    }
}
