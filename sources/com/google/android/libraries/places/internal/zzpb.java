package com.google.android.libraries.places.internal;

import io.ably.lib.transport.Defaults;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzpb implements zzbwm {
    public static zzpb zza() {
        return zzpa.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final Object zzb() {
        zzcpt zzf = zzcpt.zzf("gmpsdksbackend-pa.googleapis.com", Defaults.TLS_PORT);
        zzf.zzg();
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "";
        }
        zzf.zzc(property);
        zzf.zzd(5L, TimeUnit.MINUTES);
        return zzf.zze();
    }
}
